package p010b.p027d.p028a.p029a;

/* renamed from: b.d.a.a.a */
/* loaded from: classes.dex */
public class C0348a extends AbstractC0351d {

    /* renamed from: a */
    public static volatile C0348a f1839a;

    /* renamed from: b */
    public AbstractC0351d f1840b;

    /* renamed from: c */
    public AbstractC0351d f1841c;

    public C0348a() {
        C0350c c0350c = new C0350c();
        this.f1841c = c0350c;
        this.f1840b = c0350c;
    }

    /* renamed from: b */
    public static C0348a m2695b() {
        if (f1839a != null) {
            return f1839a;
        }
        synchronized (C0348a.class) {
            if (f1839a == null) {
                f1839a = new C0348a();
            }
        }
        return f1839a;
    }

    @Override // p010b.p027d.p028a.p029a.AbstractC0351d
    /* renamed from: a */
    public boolean mo2694a() {
        return this.f1840b.mo2694a();
    }
}