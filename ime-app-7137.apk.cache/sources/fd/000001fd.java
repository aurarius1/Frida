package p010b.p036g;

import java.util.Map;

/* renamed from: b.g.a */
/* loaded from: classes.dex */
public class C0377a extends AbstractC0389m {

    /* renamed from: d */
    public final /* synthetic */ C0378b f1894d;

    public C0377a(C0378b c0378b) {
        this.f1894d = c0378b;
    }

    @Override // p010b.p036g.AbstractC0389m
    /* renamed from: a */
    public void mo2636a() {
        this.f1894d.clear();
    }

    @Override // p010b.p036g.AbstractC0389m
    /* renamed from: b */
    public Object mo2635b(int i, int i2) {
        return this.f1894d.f1942g[(i << 1) + i2];
    }

    @Override // p010b.p036g.AbstractC0389m
    /* renamed from: c */
    public Map mo2634c() {
        return this.f1894d;
    }

    @Override // p010b.p036g.AbstractC0389m
    /* renamed from: d */
    public int mo2633d() {
        return this.f1894d.f1943h;
    }

    @Override // p010b.p036g.AbstractC0389m
    /* renamed from: e */
    public int mo2632e(Object obj) {
        return this.f1894d.m2619e(obj);
    }

    @Override // p010b.p036g.AbstractC0389m
    /* renamed from: f */
    public int mo2631f(Object obj) {
        return this.f1894d.m2617g(obj);
    }

    @Override // p010b.p036g.AbstractC0389m
    /* renamed from: g */
    public void mo2630g(Object obj, Object obj2) {
        this.f1894d.put(obj, obj2);
    }

    @Override // p010b.p036g.AbstractC0389m
    /* renamed from: h */
    public void mo2629h(int i) {
        this.f1894d.m2615i(i);
    }

    @Override // p010b.p036g.AbstractC0389m
    /* renamed from: i */
    public Object mo2628i(int i, Object obj) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f1894d.f1942g;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }
}