package p010b.p037h.p040b;

import java.util.Arrays;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.h.b.l */
/* loaded from: classes.dex */
public class C0404l {

    /* renamed from: a */
    public static int f2006a = 1;

    /* renamed from: b */
    public boolean f2007b;

    /* renamed from: f */
    public float f2011f;

    /* renamed from: j */
    public int f2015j;

    /* renamed from: c */
    public int f2008c = -1;

    /* renamed from: d */
    public int f2009d = -1;

    /* renamed from: e */
    public int f2010e = 0;

    /* renamed from: g */
    public boolean f2012g = false;

    /* renamed from: h */
    public float[] f2013h = new float[9];

    /* renamed from: i */
    public float[] f2014i = new float[9];

    /* renamed from: k */
    public C0395c[] f2016k = new C0395c[16];

    /* renamed from: l */
    public int f2017l = 0;

    /* renamed from: m */
    public int f2018m = 0;

    public C0404l(int i) {
        this.f2015j = i;
    }

    /* renamed from: a */
    public final void m2565a(C0395c c0395c) {
        int i = 0;
        while (true) {
            int i2 = this.f2017l;
            if (i >= i2) {
                C0395c[] c0395cArr = this.f2016k;
                if (i2 >= c0395cArr.length) {
                    this.f2016k = (C0395c[]) Arrays.copyOf(c0395cArr, c0395cArr.length * 2);
                }
                C0395c[] c0395cArr2 = this.f2016k;
                int i3 = this.f2017l;
                c0395cArr2[i3] = c0395c;
                this.f2017l = i3 + 1;
                return;
            } else if (this.f2016k[i] == c0395c) {
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: b */
    public final void m2564b(C0395c c0395c) {
        int i = this.f2017l;
        int i2 = 0;
        while (i2 < i) {
            if (this.f2016k[i2] == c0395c) {
                while (i2 < i - 1) {
                    C0395c[] c0395cArr = this.f2016k;
                    int i3 = i2 + 1;
                    c0395cArr[i2] = c0395cArr[i3];
                    i2 = i3;
                }
                this.f2017l--;
                return;
            }
            i2++;
        }
    }

    /* renamed from: c */
    public void m2563c() {
        this.f2015j = 5;
        this.f2010e = 0;
        this.f2008c = -1;
        this.f2009d = -1;
        this.f2011f = 0.0f;
        this.f2012g = false;
        int i = this.f2017l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f2016k[i2] = null;
        }
        this.f2017l = 0;
        this.f2018m = 0;
        this.f2007b = false;
        Arrays.fill(this.f2014i, 0.0f);
    }

    /* renamed from: d */
    public void m2562d(C0398f c0398f, float f) {
        this.f2011f = f;
        this.f2012g = true;
        int i = this.f2017l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f2016k[i2].m2596l(this, false);
        }
        this.f2017l = 0;
    }

    /* renamed from: e */
    public final void m2561e(C0395c c0395c) {
        int i = this.f2017l;
        for (int i2 = 0; i2 < i; i2++) {
            this.f2016k[i2].mo2570m(c0395c, false);
        }
        this.f2017l = 0;
    }

    public String toString() {
        StringBuilder m1187i = AbstractC1124a.m1187i("");
        m1187i.append(this.f2008c);
        return m1187i.toString();
    }
}