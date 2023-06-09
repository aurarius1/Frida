package p093c.p145g.p146a.p147a.p151d0;

import android.graphics.Typeface;
import p010b.p046j.p048e.p049b.AbstractC0503i;

/* renamed from: c.g.a.a.d0.b */
/* loaded from: classes.dex */
public class C1831b extends AbstractC0503i {

    /* renamed from: a */
    public final /* synthetic */ AbstractC1834e f5581a;

    /* renamed from: b */
    public final /* synthetic */ C1833d f5582b;

    public C1831b(C1833d c1833d, AbstractC1834e abstractC1834e) {
        this.f5582b = c1833d;
        this.f5581a = abstractC1834e;
    }

    @Override // p010b.p046j.p048e.p049b.AbstractC0503i
    /* renamed from: d */
    public void mo761d(int i) {
        this.f5582b.f5598m = true;
        this.f5581a.mo619a(i);
    }

    @Override // p010b.p046j.p048e.p049b.AbstractC0503i
    /* renamed from: e */
    public void mo760e(Typeface typeface) {
        C1833d c1833d = this.f5582b;
        c1833d.f5599n = Typeface.create(typeface, c1833d.f5589d);
        C1833d c1833d2 = this.f5582b;
        c1833d2.f5598m = true;
        this.f5581a.mo618b(c1833d2.f5599n, false);
    }
}