package p010b.p034f.p035f;

import android.content.Context;
import android.content.res.ColorStateList;
import androidx.cardview.widget.CardView;

/* renamed from: b.f.f.d */
/* loaded from: classes.dex */
public class C0370d implements InterfaceC0373g {
    @Override // p010b.p034f.p035f.InterfaceC0373g
    /* renamed from: a */
    public void mo2682a(C0367a c0367a, float f) {
        c0367a.f1862b.setElevation(f);
    }

    @Override // p010b.p034f.p035f.InterfaceC0373g
    /* renamed from: b */
    public void mo2681b(C0367a c0367a) {
        mo2672k(c0367a, mo2669n(c0367a));
    }

    @Override // p010b.p034f.p035f.InterfaceC0373g
    /* renamed from: c */
    public float mo2680c(C0367a c0367a) {
        return c0367a.f1862b.getElevation();
    }

    @Override // p010b.p034f.p035f.InterfaceC0373g
    /* renamed from: d */
    public float mo2679d(C0367a c0367a) {
        return mo2671l(c0367a) * 2.0f;
    }

    @Override // p010b.p034f.p035f.InterfaceC0373g
    /* renamed from: e */
    public void mo2678e(C0367a c0367a) {
        mo2672k(c0367a, mo2669n(c0367a));
    }

    @Override // p010b.p034f.p035f.InterfaceC0373g
    /* renamed from: f */
    public void mo2677f(C0367a c0367a, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C0374h c0374h = new C0374h(colorStateList, f);
        c0367a.f1861a = c0374h;
        c0367a.f1862b.setBackgroundDrawable(c0374h);
        CardView cardView = c0367a.f1862b;
        cardView.setClipToOutline(true);
        cardView.setElevation(f2);
        mo2672k(c0367a, f3);
    }

    @Override // p010b.p034f.p035f.InterfaceC0373g
    /* renamed from: g */
    public float mo2676g(C0367a c0367a) {
        return mo2671l(c0367a) * 2.0f;
    }

    @Override // p010b.p034f.p035f.InterfaceC0373g
    /* renamed from: h */
    public ColorStateList mo2675h(C0367a c0367a) {
        return ((C0374h) c0367a.f1861a).f1872h;
    }

    @Override // p010b.p034f.p035f.InterfaceC0373g
    /* renamed from: i */
    public void mo2674i(C0367a c0367a, float f) {
        C0374h c0374h = (C0374h) c0367a.f1861a;
        if (f == c0374h.f1865a) {
            return;
        }
        c0374h.f1865a = f;
        c0374h.m2666c(null);
        c0374h.invalidateSelf();
    }

    @Override // p010b.p034f.p035f.InterfaceC0373g
    /* renamed from: j */
    public void mo2673j(C0367a c0367a, ColorStateList colorStateList) {
        C0374h c0374h = (C0374h) c0367a.f1861a;
        c0374h.m2667b(colorStateList);
        c0374h.invalidateSelf();
    }

    @Override // p010b.p034f.p035f.InterfaceC0373g
    /* renamed from: k */
    public void mo2672k(C0367a c0367a, float f) {
        C0374h c0374h = (C0374h) c0367a.f1861a;
        boolean useCompatPadding = c0367a.f1862b.getUseCompatPadding();
        boolean m2685a = c0367a.m2685a();
        if (f != c0374h.f1869e || c0374h.f1870f != useCompatPadding || c0374h.f1871g != m2685a) {
            c0374h.f1869e = f;
            c0374h.f1870f = useCompatPadding;
            c0374h.f1871g = m2685a;
            c0374h.m2666c(null);
            c0374h.invalidateSelf();
        }
        if (!c0367a.f1862b.getUseCompatPadding()) {
            c0367a.m2684b(0, 0, 0, 0);
            return;
        }
        float mo2669n = mo2669n(c0367a);
        float mo2671l = mo2671l(c0367a);
        int ceil = (int) Math.ceil(C0376j.m2664a(mo2669n, mo2671l, c0367a.m2685a()));
        int ceil2 = (int) Math.ceil(C0376j.m2663b(mo2669n, mo2671l, c0367a.m2685a()));
        c0367a.m2684b(ceil, ceil2, ceil, ceil2);
    }

    @Override // p010b.p034f.p035f.InterfaceC0373g
    /* renamed from: l */
    public float mo2671l(C0367a c0367a) {
        return ((C0374h) c0367a.f1861a).f1865a;
    }

    @Override // p010b.p034f.p035f.InterfaceC0373g
    /* renamed from: m */
    public void mo2670m() {
    }

    @Override // p010b.p034f.p035f.InterfaceC0373g
    /* renamed from: n */
    public float mo2669n(C0367a c0367a) {
        return ((C0374h) c0367a.f1861a).f1869e;
    }
}