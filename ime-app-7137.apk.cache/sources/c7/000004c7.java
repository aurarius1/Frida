package p010b.p087x.p088a.p089a;

import android.animation.TypeEvaluator;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p046j.p050f.C0509d;

/* renamed from: b.x.a.a.f */
/* loaded from: classes.dex */
public class C1091f implements TypeEvaluator {

    /* renamed from: a */
    public C0509d[] f4074a;

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f, Object obj, Object obj2) {
        C0509d[] c0509dArr = (C0509d[]) obj;
        C0509d[] c0509dArr2 = (C0509d[]) obj2;
        if (AbstractC0022t.m3497f(c0509dArr, c0509dArr2)) {
            if (!AbstractC0022t.m3497f(this.f4074a, c0509dArr)) {
                this.f4074a = AbstractC0022t.m3465v(c0509dArr);
            }
            for (int i = 0; i < c0509dArr.length; i++) {
                C0509d c0509d = this.f4074a[i];
                C0509d c0509d2 = c0509dArr[i];
                C0509d c0509d3 = c0509dArr2[i];
                c0509d.getClass();
                c0509d.f2547a = c0509d2.f2547a;
                int i2 = 0;
                while (true) {
                    float[] fArr = c0509d2.f2548b;
                    if (i2 < fArr.length) {
                        c0509d.f2548b[i2] = (c0509d3.f2548b[i2] * f) + ((1.0f - f) * fArr[i2]);
                        i2++;
                    }
                }
            }
            return this.f4074a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}