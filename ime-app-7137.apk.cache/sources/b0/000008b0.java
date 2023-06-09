package com.anysoftkeyboard.dictionaries.jni;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.os.SystemClock;
import com.anysoftkeyboard.dictionaries.GetWordsCallback;
import java.io.FileDescriptor;
import java.util.Arrays;
import p093c.p097b.p119s.p120b.AbstractC1441a;
import p093c.p097b.p122u.AbstractC1533z;
import p093c.p097b.p122u.C1499t0;
import p093c.p097b.p122u.InterfaceC1479j0;
import p093c.p097b.p122u.InterfaceC1532y;
import p093c.p140e.p141a.C1797f;

/* loaded from: classes.dex */
public class BinaryDictionary extends AbstractC1533z {

    /* renamed from: f */
    public final AssetFileDescriptor f6294f;

    /* renamed from: g */
    public volatile long f6295g;

    /* renamed from: h */
    public int[] f6296h;

    /* renamed from: i */
    public char[] f6297i;

    /* renamed from: j */
    public int[] f6298j;

    /* JADX DEBUG: Throwable added to exception handler: 'MissingLibraryException | UnsatisfiedLinkError', keep only Throwable */
    public BinaryDictionary(Context context, CharSequence charSequence, AssetFileDescriptor assetFileDescriptor) {
        super(charSequence);
        this.f6296h = new int[320];
        this.f6297i = new char[320];
        this.f6298j = new int[16];
        try {
            new C1797f().m797c(context, "anysoftkey_jni", "1.0.1", null);
        } catch (Throwable unused) {
            AbstractC1441a.m1037a("anysoftkey_jni");
        }
        this.f6294f = assetFileDescriptor;
    }

    public final native void closeNative(long j);

    @Override // p093c.p097b.p122u.AbstractC1533z
    /* renamed from: f */
    public final void mo501f() {
        if (this.f6295g != 0) {
            closeNative(this.f6295g);
            this.f6295g = 0L;
        }
    }

    @Override // p093c.p097b.p122u.AbstractC1533z
    /* renamed from: g */
    public void mo500g(GetWordsCallback getWordsCallback) {
        throw new UnsupportedOperationException();
    }

    public final native int getSuggestionsNative(long j, int[] iArr, int i, char[] cArr, int[] iArr2, int i2, int i3, int i4, int i5);

    @Override // p093c.p097b.p122u.AbstractC1533z
    /* renamed from: h */
    public void mo499h(InterfaceC1479j0 interfaceC1479j0, InterfaceC1532y interfaceC1532y) {
        C1499t0 c1499t0;
        int mo997a;
        char[] cArr;
        if (this.f6295g == 0 || m953i() || (mo997a = (c1499t0 = (C1499t0) interfaceC1479j0).mo997a()) > 19) {
            return;
        }
        Arrays.fill(this.f6296h, -1);
        for (int i = 0; i < mo997a; i++) {
            int[] mo996b = c1499t0.mo996b(i);
            System.arraycopy(mo996b, 0, this.f6296h, i * 16, Math.min(mo996b.length, 16));
        }
        Arrays.fill(this.f6297i, (char) 0);
        Arrays.fill(this.f6298j, 0);
        int suggestionsNative = getSuggestionsNative(this.f6295g, this.f6296h, mo997a, this.f6297i, this.f6298j, 20, 16, 16, -1);
        int i2 = suggestionsNative;
        if (suggestionsNative < 5) {
            for (int i3 = 0; i3 < mo997a; i3++) {
                int suggestionsNative2 = getSuggestionsNative(this.f6295g, this.f6296h, mo997a, this.f6297i, this.f6298j, 20, 16, 16, i3);
                i2 = Math.max(i2, suggestionsNative2);
                if (suggestionsNative2 > 0) {
                    break;
                }
            }
        }
        boolean z = true;
        for (int i4 = 0; i4 < i2 && z && this.f6298j[i4] >= 1; i4++) {
            int i5 = i4 * 20;
            int i6 = i5;
            while (true) {
                cArr = this.f6297i;
                if (cArr.length <= i6 || cArr[i6] == 0) {
                    break;
                }
                i6++;
            }
            int i7 = i6 - i5;
            if (i7 > 0) {
                z = interfaceC1532y.mo955a(cArr, i5, i7, this.f6298j[i4], this);
            }
        }
    }

    public final native boolean isValidWordNative(long j, char[] cArr, int i);

    @Override // p093c.p097b.p122u.AbstractC1533z
    /* renamed from: j */
    public boolean mo498j(CharSequence charSequence) {
        if (charSequence == null || this.f6295g == 0 || m953i()) {
            return false;
        }
        char[] charArray = charSequence.toString().toCharArray();
        return isValidWordNative(this.f6295g, charArray, charArray.length);
    }

    @Override // p093c.p097b.p122u.AbstractC1533z
    /* renamed from: k */
    public final void mo497k() {
        try {
            this.f6295g = 0L;
            SystemClock.uptimeMillis();
            this.f6295g = openNative(this.f6294f.getFileDescriptor(), this.f6294f.getStartOffset(), this.f6294f.getLength(), 3, 3);
            SystemClock.uptimeMillis();
        } catch (UnsatisfiedLinkError e) {
            e.getMessage();
        }
    }

    public final native long openNative(FileDescriptor fileDescriptor, long j, long j2, int i, int i2);
}