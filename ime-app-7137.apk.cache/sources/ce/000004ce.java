package p010b.p087x.p088a.p089a;

import android.graphics.Paint;
import p010b.p046j.p048e.p049b.C0495a;

/* renamed from: b.x.a.a.m */
/* loaded from: classes.dex */
public class C1098m extends AbstractC1101p {

    /* renamed from: e */
    public int[] f4079e;

    /* renamed from: f */
    public C0495a f4080f;

    /* renamed from: g */
    public float f4081g;

    /* renamed from: h */
    public C0495a f4082h;

    /* renamed from: i */
    public float f4083i;

    /* renamed from: j */
    public float f4084j;

    /* renamed from: k */
    public float f4085k;

    /* renamed from: l */
    public float f4086l;

    /* renamed from: m */
    public float f4087m;

    /* renamed from: n */
    public Paint.Cap f4088n;

    /* renamed from: o */
    public Paint.Join f4089o;

    /* renamed from: p */
    public float f4090p;

    public C1098m() {
        this.f4081g = 0.0f;
        this.f4083i = 1.0f;
        this.f4084j = 1.0f;
        this.f4085k = 0.0f;
        this.f4086l = 1.0f;
        this.f4087m = 0.0f;
        this.f4088n = Paint.Cap.BUTT;
        this.f4089o = Paint.Join.MITER;
        this.f4090p = 4.0f;
    }

    public C1098m(C1098m c1098m) {
        super(c1098m);
        this.f4081g = 0.0f;
        this.f4083i = 1.0f;
        this.f4084j = 1.0f;
        this.f4085k = 0.0f;
        this.f4086l = 1.0f;
        this.f4087m = 0.0f;
        this.f4088n = Paint.Cap.BUTT;
        this.f4089o = Paint.Join.MITER;
        this.f4090p = 4.0f;
        this.f4079e = c1098m.f4079e;
        this.f4080f = c1098m.f4080f;
        this.f4081g = c1098m.f4081g;
        this.f4083i = c1098m.f4083i;
        this.f4082h = c1098m.f4082h;
        this.f4106c = c1098m.f4106c;
        this.f4084j = c1098m.f4084j;
        this.f4085k = c1098m.f4085k;
        this.f4086l = c1098m.f4086l;
        this.f4087m = c1098m.f4087m;
        this.f4088n = c1098m.f4088n;
        this.f4089o = c1098m.f4089o;
        this.f4090p = c1098m.f4090p;
    }

    @Override // p010b.p087x.p088a.p089a.AbstractC1100o
    /* renamed from: a */
    public boolean mo1241a() {
        return this.f4082h.m2409c() || this.f4080f.m2409c();
    }

    @Override // p010b.p087x.p088a.p089a.AbstractC1100o
    /* renamed from: b */
    public boolean mo1240b(int[] iArr) {
        return this.f4080f.m2408d(iArr) | this.f4082h.m2408d(iArr);
    }

    public float getFillAlpha() {
        return this.f4084j;
    }

    public int getFillColor() {
        return this.f4082h.f2519c;
    }

    public float getStrokeAlpha() {
        return this.f4083i;
    }

    public int getStrokeColor() {
        return this.f4080f.f2519c;
    }

    public float getStrokeWidth() {
        return this.f4081g;
    }

    public float getTrimPathEnd() {
        return this.f4086l;
    }

    public float getTrimPathOffset() {
        return this.f4087m;
    }

    public float getTrimPathStart() {
        return this.f4085k;
    }

    public void setFillAlpha(float f) {
        this.f4084j = f;
    }

    public void setFillColor(int i) {
        this.f4082h.f2519c = i;
    }

    public void setStrokeAlpha(float f) {
        this.f4083i = f;
    }

    public void setStrokeColor(int i) {
        this.f4080f.f2519c = i;
    }

    public void setStrokeWidth(float f) {
        this.f4081g = f;
    }

    public void setTrimPathEnd(float f) {
        this.f4086l = f;
    }

    public void setTrimPathOffset(float f) {
        this.f4087m = f;
    }

    public void setTrimPathStart(float f) {
        this.f4085k = f;
    }
}