package p010b.p087x.p088a.p089a;

import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p046j.p050f.C0509d;

/* renamed from: b.x.a.a.p */
/* loaded from: classes.dex */
public abstract class AbstractC1101p extends AbstractC1100o {

    /* renamed from: a */
    public C0509d[] f4104a;

    /* renamed from: b */
    public String f4105b;

    /* renamed from: c */
    public int f4106c;

    /* renamed from: d */
    public int f4107d;

    public AbstractC1101p() {
        super(null);
        this.f4104a = null;
        this.f4106c = 0;
    }

    public AbstractC1101p(AbstractC1101p abstractC1101p) {
        super(null);
        this.f4104a = null;
        this.f4106c = 0;
        this.f4105b = abstractC1101p.f4105b;
        this.f4107d = abstractC1101p.f4107d;
        this.f4104a = AbstractC0022t.m3465v(abstractC1101p.f4104a);
    }

    public C0509d[] getPathData() {
        return this.f4104a;
    }

    public String getPathName() {
        return this.f4105b;
    }

    public void setPathData(C0509d[] c0509dArr) {
        if (!AbstractC0022t.m3497f(this.f4104a, c0509dArr)) {
            this.f4104a = AbstractC0022t.m3465v(c0509dArr);
            return;
        }
        C0509d[] c0509dArr2 = this.f4104a;
        for (int i = 0; i < c0509dArr.length; i++) {
            c0509dArr2[i].f2547a = c0509dArr[i].f2547a;
            for (int i2 = 0; i2 < c0509dArr[i].f2548b.length; i2++) {
                c0509dArr2[i].f2548b[i2] = c0509dArr[i].f2548b[i2];
            }
        }
    }
}