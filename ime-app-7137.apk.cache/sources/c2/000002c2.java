package p010b.p046j.p058l;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import java.util.Locale;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.j.l.d */
/* loaded from: classes.dex */
public final class C0574d {

    /* renamed from: a */
    public final ClipData f2677a;

    /* renamed from: b */
    public final int f2678b;

    /* renamed from: c */
    public final int f2679c;

    /* renamed from: d */
    public final Uri f2680d;

    /* renamed from: e */
    public final Bundle f2681e;

    public C0574d(C0571c c0571c) {
        ClipData clipData = c0571c.f2666a;
        clipData.getClass();
        this.f2677a = clipData;
        int i = c0571c.f2667b;
        if (i < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 3));
        }
        if (i <= 3) {
            this.f2678b = i;
            int i2 = c0571c.f2668c;
            if ((i2 & 1) == i2) {
                this.f2679c = i2;
                this.f2680d = c0571c.f2669d;
                this.f2681e = c0571c.f2670e;
                return;
            }
            StringBuilder m1187i = AbstractC1124a.m1187i("Requested flags 0x");
            m1187i.append(Integer.toHexString(i2));
            m1187i.append(", but only 0x");
            m1187i.append(Integer.toHexString(1));
            m1187i.append(" are allowed");
            throw new IllegalArgumentException(m1187i.toString());
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 3));
    }

    public String toString() {
        String str;
        StringBuilder m1187i = AbstractC1124a.m1187i("ContentInfoCompat{clip=");
        m1187i.append(this.f2677a);
        m1187i.append(", source=");
        int i = this.f2678b;
        if (i == 0) {
            str = "SOURCE_APP";
        } else if (i == 1) {
            str = "SOURCE_CLIPBOARD";
        } else if (i != 2) {
            str = i != 3 ? String.valueOf(i) : "SOURCE_DRAG_AND_DROP";
        } else {
            str = "SOURCE_INPUT_METHOD";
        }
        m1187i.append(str);
        m1187i.append(", flags=");
        int i2 = this.f2679c;
        m1187i.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
        m1187i.append(", linkUri=");
        m1187i.append(this.f2680d);
        m1187i.append(", extras=");
        m1187i.append(this.f2681e);
        m1187i.append("}");
        return m1187i.toString();
    }
}