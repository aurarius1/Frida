package p093c.p145g.p146a.p147a.p151d0;

import android.graphics.Typeface;
import p093c.p145g.p146a.p147a.p149b0.C1807c;
import p093c.p145g.p146a.p147a.p149b0.C1808d;

/* renamed from: c.g.a.a.d0.a */
/* loaded from: classes.dex */
public final class C1830a extends AbstractC1834e {

    /* renamed from: a */
    public final Typeface f5578a;

    /* renamed from: b */
    public final C1807c f5579b;

    /* renamed from: c */
    public boolean f5580c;

    public C1830a(C1807c c1807c, Typeface typeface) {
        this.f5578a = typeface;
        this.f5579b = c1807c;
    }

    @Override // p093c.p145g.p146a.p147a.p151d0.AbstractC1834e
    /* renamed from: a */
    public void mo619a(int i) {
        m762c(this.f5578a);
    }

    @Override // p093c.p145g.p146a.p147a.p151d0.AbstractC1834e
    /* renamed from: b */
    public void mo618b(Typeface typeface, boolean z) {
        m762c(typeface);
    }

    /* renamed from: c */
    public final void m762c(Typeface typeface) {
        if (this.f5580c) {
            return;
        }
        C1808d c1808d = this.f5579b.f5485a;
        C1830a c1830a = c1808d.f5529w;
        boolean z = true;
        if (c1830a != null) {
            c1830a.f5580c = true;
        }
        if (c1808d.f5526t != typeface) {
            c1808d.f5526t = typeface;
        } else {
            z = false;
        }
        if (z) {
            c1808d.m783k();
        }
    }
}