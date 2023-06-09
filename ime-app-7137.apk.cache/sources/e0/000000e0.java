package p010b.p016c.p017k;

import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.C0615o0;

/* renamed from: b.c.k.c0 */
/* loaded from: classes.dex */
public class RunnableC0092c0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ LayoutInflater$Factory2C0120p0 f873b;

    public RunnableC0092c0(LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0) {
        this.f873b = layoutInflater$Factory2C0120p0;
    }

    @Override // java.lang.Runnable
    public void run() {
        LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0 = this.f873b;
        layoutInflater$Factory2C0120p0.f1081x.showAtLocation(layoutInflater$Factory2C0120p0.f1080w, 55, 0, 0);
        this.f873b.m3032y();
        if (!this.f873b.m3043L()) {
            this.f873b.f1080w.setAlpha(1.0f);
            this.f873b.f1080w.setVisibility(0);
            return;
        }
        this.f873b.f1080w.setAlpha(0.0f);
        LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p02 = this.f873b;
        C0615o0 m2256b = AbstractC0605j0.m2256b(layoutInflater$Factory2C0120p02.f1080w);
        m2256b.m2211a(1.0f);
        layoutInflater$Factory2C0120p02.f1083z = m2256b;
        this.f873b.f1083z.m2208d(new C0089b0(this));
    }
}