package p010b.p034f.p035f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.cardview.widget.CardView;

/* renamed from: b.f.f.f */
/* loaded from: classes.dex */
public class C0372f implements InterfaceC0373g {

    /* renamed from: a */
    public final RectF f1864a = new RectF();

    @Override // p010b.p034f.p035f.InterfaceC0373g
    /* renamed from: a */
    public void mo2682a(C0367a c0367a, float f) {
        C0376j c0376j = (C0376j) c0367a.f1861a;
        c0376j.m2661d(f, c0376j.f1885j);
    }

    @Override // p010b.p034f.p035f.InterfaceC0373g
    /* renamed from: b */
    public void mo2681b(C0367a c0367a) {
    }

    @Override // p010b.p034f.p035f.InterfaceC0373g
    /* renamed from: c */
    public float mo2680c(C0367a c0367a) {
        return ((C0376j) c0367a.f1861a).f1887l;
    }

    @Override // p010b.p034f.p035f.InterfaceC0373g
    /* renamed from: d */
    public float mo2679d(C0367a c0367a) {
        C0376j c0376j = (C0376j) c0367a.f1861a;
        float f = c0376j.f1885j;
        float f2 = (f * 1.5f) / 2.0f;
        return (((c0376j.f1885j * 1.5f) + c0376j.f1878c) * 2.0f) + (Math.max(f, f2 + c0376j.f1883h + c0376j.f1878c) * 2.0f);
    }

    @Override // p010b.p034f.p035f.InterfaceC0373g
    /* renamed from: e */
    public void mo2678e(C0367a c0367a) {
        C0376j c0376j = (C0376j) c0367a.f1861a;
        c0376j.f1892q = c0367a.m2685a();
        c0376j.invalidateSelf();
        m2683o(c0367a);
    }

    @Override // p010b.p034f.p035f.InterfaceC0373g
    /* renamed from: f */
    public void mo2677f(C0367a c0367a, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C0376j c0376j = new C0376j(context.getResources(), colorStateList, f, f2, f3);
        c0376j.f1892q = c0367a.m2685a();
        c0376j.invalidateSelf();
        c0367a.f1861a = c0376j;
        c0367a.f1862b.setBackgroundDrawable(c0376j);
        m2683o(c0367a);
    }

    @Override // p010b.p034f.p035f.InterfaceC0373g
    /* renamed from: g */
    public float mo2676g(C0367a c0367a) {
        C0376j c0376j = (C0376j) c0367a.f1861a;
        float f = c0376j.f1885j;
        float f2 = f / 2.0f;
        return ((c0376j.f1885j + c0376j.f1878c) * 2.0f) + (Math.max(f, f2 + c0376j.f1883h + c0376j.f1878c) * 2.0f);
    }

    @Override // p010b.p034f.p035f.InterfaceC0373g
    /* renamed from: h */
    public ColorStateList mo2675h(C0367a c0367a) {
        return ((C0376j) c0367a.f1861a).f1888m;
    }

    @Override // p010b.p034f.p035f.InterfaceC0373g
    /* renamed from: i */
    public void mo2674i(C0367a c0367a, float f) {
        C0376j c0376j = (C0376j) c0367a.f1861a;
        c0376j.getClass();
        if (f >= 0.0f) {
            float f2 = (int) (f + 0.5f);
            if (c0376j.f1883h != f2) {
                c0376j.f1883h = f2;
                c0376j.f1889n = true;
                c0376j.invalidateSelf();
            }
            m2683o(c0367a);
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
    }

    @Override // p010b.p034f.p035f.InterfaceC0373g
    /* renamed from: j */
    public void mo2673j(C0367a c0367a, ColorStateList colorStateList) {
        C0376j c0376j = (C0376j) c0367a.f1861a;
        c0376j.m2662c(colorStateList);
        c0376j.invalidateSelf();
    }

    @Override // p010b.p034f.p035f.InterfaceC0373g
    /* renamed from: k */
    public void mo2672k(C0367a c0367a, float f) {
        C0376j c0376j = (C0376j) c0367a.f1861a;
        c0376j.m2661d(c0376j.f1887l, f);
        m2683o(c0367a);
    }

    @Override // p010b.p034f.p035f.InterfaceC0373g
    /* renamed from: l */
    public float mo2671l(C0367a c0367a) {
        return ((C0376j) c0367a.f1861a).f1883h;
    }

    @Override // p010b.p034f.p035f.InterfaceC0373g
    /* renamed from: m */
    public void mo2670m() {
        C0376j.f1877b = new C0371e(this);
    }

    @Override // p010b.p034f.p035f.InterfaceC0373g
    /* renamed from: n */
    public float mo2669n(C0367a c0367a) {
        return ((C0376j) c0367a.f1861a).f1885j;
    }

    /* renamed from: o */
    public void m2683o(C0367a c0367a) {
        Rect rect = new Rect();
        ((C0376j) c0367a.f1861a).getPadding(rect);
        int ceil = (int) Math.ceil(mo2676g(c0367a));
        int ceil2 = (int) Math.ceil(mo2679d(c0367a));
        CardView cardView = c0367a.f1862b;
        if (ceil > cardView.f403f) {
            super/*android.widget.FrameLayout*/.setMinimumWidth(ceil);
        }
        CardView cardView2 = c0367a.f1862b;
        if (ceil2 > cardView2.f404g) {
            super/*android.widget.FrameLayout*/.setMinimumHeight(ceil2);
        }
        c0367a.m2684b(rect.left, rect.top, rect.right, rect.bottom);
    }
}