package p010b.p027d.p028a.p030b;

import java.util.HashMap;

/* renamed from: b.d.a.b.a */
/* loaded from: classes.dex */
public class C0352a extends C0359h {

    /* renamed from: f */
    public HashMap f1845f = new HashMap();

    @Override // p010b.p027d.p028a.p030b.C0359h
    /* renamed from: a */
    public C0355d mo2690a(Object obj) {
        return (C0355d) this.f1845f.get(obj);
    }

    public boolean contains(Object obj) {
        return this.f1845f.containsKey(obj);
    }

    @Override // p010b.p027d.p028a.p030b.C0359h
    /* renamed from: d */
    public Object mo2687d(Object obj, Object obj2) {
        C0355d c0355d = (C0355d) this.f1845f.get(obj);
        if (c0355d != null) {
            return c0355d.f1847c;
        }
        this.f1845f.put(obj, m2688c(obj, obj2));
        return null;
    }

    @Override // p010b.p027d.p028a.p030b.C0359h
    /* renamed from: e */
    public Object mo2686e(Object obj) {
        Object mo2686e = super.mo2686e(obj);
        this.f1845f.remove(obj);
        return mo2686e;
    }
}