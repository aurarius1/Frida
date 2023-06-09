package p093c.p145g.p146a.p147a.p151d0;

import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: c.g.a.a.d0.c */
/* loaded from: classes.dex */
public class C1832c extends AbstractC1834e {

    /* renamed from: a */
    public final /* synthetic */ TextPaint f5583a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC1834e f5584b;

    /* renamed from: c */
    public final /* synthetic */ C1833d f5585c;

    public C1832c(C1833d c1833d, TextPaint textPaint, AbstractC1834e abstractC1834e) {
        this.f5585c = c1833d;
        this.f5583a = textPaint;
        this.f5584b = abstractC1834e;
    }

    @Override // p093c.p145g.p146a.p147a.p151d0.AbstractC1834e
    /* renamed from: a */
    public void mo619a(int i) {
        this.f5584b.mo619a(i);
    }

    @Override // p093c.p145g.p146a.p147a.p151d0.AbstractC1834e
    /* renamed from: b */
    public void mo618b(Typeface typeface, boolean z) {
        this.f5585c.m756d(this.f5583a, typeface);
        this.f5584b.mo618b(typeface, z);
    }
}