package p010b.p016c.p017k;

/* renamed from: b.c.k.x */
/* loaded from: classes.dex */
public class RunnableC0135x implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ LayoutInflater$Factory2C0120p0 f1109b;

    public RunnableC0135x(LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0) {
        this.f1109b = layoutInflater$Factory2C0120p0;
    }

    @Override // java.lang.Runnable
    public void run() {
        LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0 = this.f1109b;
        if ((layoutInflater$Factory2C0120p0.f1061b0 & 1) != 0) {
            layoutInflater$Factory2C0120p0.m3033x(0);
        }
        LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p02 = this.f1109b;
        if ((layoutInflater$Factory2C0120p02.f1061b0 & 4096) != 0) {
            layoutInflater$Factory2C0120p02.m3033x(108);
        }
        LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p03 = this.f1109b;
        layoutInflater$Factory2C0120p03.f1060a0 = false;
        layoutInflater$Factory2C0120p03.f1061b0 = 0;
    }
}