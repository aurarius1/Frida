package com.anysoftkeyboard.dictionaries.jni;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import com.anysoftkeyboard.dictionaries.GetWordsCallback;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.Channels;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import p093c.p097b.p119s.p120b.AbstractC1441a;
import p093c.p097b.p122u.AbstractC1533z;
import p093c.p097b.p122u.C1499t0;
import p093c.p097b.p122u.InterfaceC1479j0;
import p093c.p097b.p122u.InterfaceC1532y;
import p093c.p140e.p141a.C1797f;

/* loaded from: classes.dex */
public class ResourceBinaryDictionary extends AbstractC1533z {

    /* renamed from: f */
    public final Context f6299f;

    /* renamed from: g */
    public final int f6300g;

    /* renamed from: h */
    public final int[] f6301h;

    /* renamed from: i */
    public final char[] f6302i;

    /* renamed from: j */
    public final int[] f6303j;

    /* renamed from: k */
    public ByteBuffer f6304k;

    /* renamed from: l */
    public final AtomicLong f6305l;

    /* JADX DEBUG: Throwable added to exception handler: 'MissingLibraryException | UnsatisfiedLinkError', keep only Throwable */
    public ResourceBinaryDictionary(CharSequence charSequence, Context context, int i) {
        super(charSequence);
        this.f6301h = new int[768];
        this.f6302i = new char[864];
        this.f6303j = new int[18];
        this.f6305l = new AtomicLong(0L);
        try {
            new C1797f().m797c(context, "anysoftkey2_jni", "1.0.3", null);
        } catch (Throwable unused) {
            AbstractC1441a.m1037a("anysoftkey2_jni");
        }
        this.f6299f = context;
        this.f6300g = i;
    }

    public final native void closeNative(long j);

    @Override // p093c.p097b.p122u.AbstractC1533z
    /* renamed from: f */
    public void mo501f() {
        long andSet = this.f6305l.getAndSet(0L);
        if (andSet != 0) {
            toString();
            hashCode();
            closeNative(andSet);
        }
    }

    @Override // p093c.p097b.p122u.AbstractC1533z
    /* renamed from: g */
    public void mo500g(GetWordsCallback getWordsCallback) {
        getWordsNative(this.f6305l.get(), getWordsCallback);
    }

    public final native int getSuggestionsNative(long j, int[] iArr, int i, char[] cArr, int[] iArr2, int i2, int i3, int i4, int i5, int[] iArr3, int i6);

    public final native void getWordsNative(long j, GetWordsCallback getWordsCallback);

    @Override // p093c.p097b.p122u.AbstractC1533z
    /* renamed from: h */
    public void mo499h(InterfaceC1479j0 interfaceC1479j0, InterfaceC1532y interfaceC1532y) {
        C1499t0 c1499t0;
        int mo997a;
        char[] cArr;
        if (this.f4906b || m953i() || (mo997a = (c1499t0 = (C1499t0) interfaceC1479j0).mo997a()) > 47) {
            return;
        }
        Arrays.fill(this.f6301h, -1);
        for (int i = 0; i < mo997a; i++) {
            int[] mo996b = c1499t0.mo996b(i);
            System.arraycopy(mo996b, 0, this.f6301h, i * 16, Math.min(mo996b.length, 16));
        }
        Arrays.fill(this.f6302i, (char) 0);
        Arrays.fill(this.f6303j, 0);
        int suggestionsNative = getSuggestionsNative(this.f6305l.get(), this.f6301h, mo997a, this.f6302i, this.f6303j, 48, 18, 16, -1, null, 0);
        if (suggestionsNative < 5) {
            int i2 = suggestionsNative;
            int i3 = 0;
            while (true) {
                if (i3 >= mo997a) {
                    suggestionsNative = i2;
                    break;
                }
                int i4 = i3;
                int suggestionsNative2 = getSuggestionsNative(this.f6305l.get(), this.f6301h, mo997a, this.f6302i, this.f6303j, 48, 18, 16, i3, null, 0);
                i2 = Math.max(i2, suggestionsNative2);
                if (suggestionsNative2 > 0) {
                    suggestionsNative = i2;
                    break;
                }
                i3 = i4 + 1;
            }
        }
        int i5 = suggestionsNative;
        boolean z = true;
        for (int i6 = 0; i6 < i5 && z && this.f6303j[i6] >= 1; i6++) {
            int i7 = i6 * 48;
            int i8 = 0;
            while (true) {
                cArr = this.f6302i;
                if (cArr[i7 + i8] == 0) {
                    break;
                }
                i8++;
            }
            if (i8 > 0) {
                z = interfaceC1532y.mo955a(cArr, i7, i8, this.f6303j[i6], this);
            }
        }
    }

    public final native boolean isValidWordNative(long j, char[] cArr, int i);

    @Override // p093c.p097b.p122u.AbstractC1533z
    /* renamed from: j */
    public boolean mo498j(CharSequence charSequence) {
        if (charSequence == null || this.f4906b || m953i()) {
            return false;
        }
        char[] charArray = charSequence.toString().toCharArray();
        return isValidWordNative(this.f6305l.get(), charArray, charArray.length);
    }

    @Override // p093c.p097b.p122u.AbstractC1533z
    /* renamed from: k */
    public void mo497k() {
        int[] iArr;
        Resources resources = this.f6299f.getResources();
        if (resources.getResourceTypeName(this.f6300g).equalsIgnoreCase("raw")) {
            iArr = new int[]{this.f6300g};
        } else {
            TypedArray obtainTypedArray = resources.obtainTypedArray(this.f6300g);
            try {
                int[] iArr2 = new int[obtainTypedArray.length()];
                for (int i = 0; i < obtainTypedArray.length(); i++) {
                    iArr2[i] = obtainTypedArray.getResourceId(i, 0);
                }
                obtainTypedArray.recycle();
                iArr = iArr2;
            } catch (Throwable th) {
                obtainTypedArray.recycle();
                throw th;
            }
        }
        if (m953i()) {
            return;
        }
        int i2 = 5;
        while (true) {
            try {
                try {
                    m496n(iArr);
                    return;
                } catch (UnsatisfiedLinkError e) {
                    e.getMessage();
                    return;
                }
            } catch (OutOfMemoryError e2) {
                if (i2 != 0) {
                    i2--;
                    System.gc();
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException unused) {
                    }
                } else {
                    throw e2;
                }
            }
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, ARITH, ARITH, INVOKE, ARITH, ARITH, IF, AGET] complete} */
    /* renamed from: n */
    public final void m496n(int[] iArr) {
        int length = iArr.length;
        InputStream[] inputStreamArr = new InputStream[length];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            try {
                try {
                    inputStreamArr[i3] = this.f6299f.getResources().openRawResource(iArr[i3]);
                    if (m953i()) {
                        while (i < length) {
                            InputStream inputStream = inputStreamArr[i];
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            i++;
                        }
                        return;
                    }
                    int available = inputStreamArr[i3].available();
                    int i4 = iArr[i3];
                    i2 += available;
                } catch (IOException e) {
                    e.getMessage();
                    while (i < length) {
                        InputStream inputStream2 = inputStreamArr[i];
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException unused2) {
                            }
                        }
                        i++;
                    }
                    return;
                }
            } catch (Throwable th) {
                while (i < length) {
                    InputStream inputStream3 = inputStreamArr[i];
                    if (inputStream3 != null) {
                        try {
                            inputStream3.close();
                        } catch (IOException unused3) {
                        }
                    }
                    i++;
                }
                throw th;
            }
        }
        this.f6304k = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            i5 += Channels.newChannel(inputStreamArr[i6]).read(this.f6304k);
            if (m953i()) {
                while (i < length) {
                    InputStream inputStream4 = inputStreamArr[i];
                    if (inputStream4 != null) {
                        try {
                            inputStream4.close();
                        } catch (IOException unused4) {
                        }
                    }
                    i++;
                }
                return;
            }
        }
        if (i5 == i2) {
            this.f6305l.set(openNative(this.f6304k, 3, 3));
            this.f6305l.get();
            toString();
            hashCode();
        }
        while (i < length) {
            InputStream inputStream5 = inputStreamArr[i];
            if (inputStream5 != null) {
                try {
                    inputStream5.close();
                } catch (IOException unused5) {
                }
            }
            i++;
        }
    }

    public final native long openNative(ByteBuffer byteBuffer, int i, int i2);
}