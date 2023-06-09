package p010b.p016c.p017k;

import android.view.Menu;
import android.view.MenuItem;
import p010b.p016c.p024p.AbstractC0161b;
import p010b.p016c.p024p.InterfaceC0160a;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.C0615o0;

/* renamed from: b.c.k.g0 */
/* loaded from: classes.dex */
public class C0102g0 implements InterfaceC0160a {

    /* renamed from: a */
    public InterfaceC0160a f917a;

    /* renamed from: b */
    public final /* synthetic */ LayoutInflater$Factory2C0120p0 f918b;

    public C0102g0(LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0, InterfaceC0160a interfaceC0160a) {
        this.f918b = layoutInflater$Factory2C0120p0;
        this.f917a = interfaceC0160a;
    }

    @Override // p010b.p016c.p024p.InterfaceC0160a
    /* renamed from: a */
    public boolean mo2965a(AbstractC0161b abstractC0161b, Menu menu) {
        AbstractC0605j0.m2271L(this.f918b.f1036C);
        return this.f917a.mo2965a(abstractC0161b, menu);
    }

    @Override // p010b.p016c.p024p.InterfaceC0160a
    /* renamed from: b */
    public boolean mo2964b(AbstractC0161b abstractC0161b, MenuItem menuItem) {
        return this.f917a.mo2964b(abstractC0161b, menuItem);
    }

    @Override // p010b.p016c.p024p.InterfaceC0160a
    /* renamed from: c */
    public boolean mo2963c(AbstractC0161b abstractC0161b, Menu menu) {
        return this.f917a.mo2963c(abstractC0161b, menu);
    }

    @Override // p010b.p016c.p024p.InterfaceC0160a
    /* renamed from: d */
    public void mo2962d(AbstractC0161b abstractC0161b) {
        this.f917a.mo2962d(abstractC0161b);
        LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0 = this.f918b;
        if (layoutInflater$Factory2C0120p0.f1081x != null) {
            layoutInflater$Factory2C0120p0.f1070m.getDecorView().removeCallbacks(this.f918b.f1082y);
        }
        LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p02 = this.f918b;
        if (layoutInflater$Factory2C0120p02.f1080w != null) {
            layoutInflater$Factory2C0120p02.m3032y();
            LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p03 = this.f918b;
            C0615o0 m2256b = AbstractC0605j0.m2256b(layoutInflater$Factory2C0120p03.f1080w);
            m2256b.m2211a(0.0f);
            layoutInflater$Factory2C0120p03.f1083z = m2256b;
            this.f918b.f1083z.m2208d(new C0100f0(this));
        }
        LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p04 = this.f918b;
        InterfaceC0129u interfaceC0129u = layoutInflater$Factory2C0120p04.f1072o;
        if (interfaceC0129u != null) {
            interfaceC0129u.mo3021f(layoutInflater$Factory2C0120p04.f1079v);
        }
        LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p05 = this.f918b;
        layoutInflater$Factory2C0120p05.f1079v = null;
        AbstractC0605j0.m2271L(layoutInflater$Factory2C0120p05.f1036C);
    }
}