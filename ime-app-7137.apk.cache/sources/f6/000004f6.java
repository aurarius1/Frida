package p093c.p097b.p099b0;

import java.util.Locale;

/* renamed from: c.b.b0.a */
/* loaded from: classes.dex */
public class C1138a {

    /* renamed from: a */
    public int f4250a;

    /* renamed from: b */
    public int f4251b;

    /* renamed from: c */
    public int f4252c;

    /* renamed from: d */
    public int f4253d;

    public C1138a() {
        this(0, 0, 0, 0, 0);
    }

    public C1138a(int i, int i2, int i3, int i4, int i5) {
        this.f4250a = i;
        this.f4251b = i2;
        this.f4252c = i4;
        this.f4253d = i5;
    }

    /* renamed from: a */
    public boolean mo936a() {
        int i = this.f4250a;
        int i2 = this.f4252c;
        return (i == i2 || this.f4251b == i2) ? false : true;
    }

    public String toString() {
        return String.format(Locale.US, "Overlay primary-color %s, dark-primary-color %s, primary text color %s, secondary text color %s (is valid %b)", Integer.toHexString(this.f4250a), Integer.toHexString(this.f4251b), Integer.toHexString(this.f4252c), Integer.toHexString(this.f4253d), Boolean.valueOf(mo936a()));
    }
}