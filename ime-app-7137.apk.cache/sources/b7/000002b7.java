package p010b.p046j.p057k;

/* renamed from: b.j.k.d */
/* loaded from: classes.dex */
public class C0563d extends C0562c {

    /* renamed from: c */
    public final Object f2658c;

    public C0563d(int i) {
        super(i);
        this.f2658c = new Object();
    }

    @Override // p010b.p046j.p057k.C0562c
    /* renamed from: a */
    public Object mo2331a() {
        Object mo2331a;
        synchronized (this.f2658c) {
            mo2331a = super.mo2331a();
        }
        return mo2331a;
    }

    @Override // p010b.p046j.p057k.C0562c
    /* renamed from: b */
    public boolean mo2330b(Object obj) {
        boolean mo2330b;
        synchronized (this.f2658c) {
            mo2330b = super.mo2330b(obj);
        }
        return mo2330b;
    }
}