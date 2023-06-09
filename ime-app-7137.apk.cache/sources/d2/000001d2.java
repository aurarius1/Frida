package p010b.p016c.p026q;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

/* renamed from: b.c.q.x0 */
/* loaded from: classes.dex */
public class C0334x0 extends C0243f2 implements InterfaceC0344z0 {

    /* renamed from: E */
    public CharSequence f1805E;

    /* renamed from: F */
    public ListAdapter f1806F;

    /* renamed from: G */
    public final Rect f1807G;

    /* renamed from: H */
    public int f1808H;

    /* renamed from: I */
    public final /* synthetic */ C0212a1 f1809I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0334x0(C0212a1 c0212a1, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f1809I = c0212a1;
        this.f1807G = new Rect();
        this.f1574t = c0212a1;
        m2826s(true);
        this.f1572r = 0;
        this.f1575u = new C0319u0(this, c0212a1);
    }

    @Override // p010b.p016c.p026q.InterfaceC0344z0
    /* renamed from: d */
    public void mo2704d(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean mo2835b = mo2835b();
        m2719t();
        this.f1558D.setInputMethodMode(2);
        mo2833f();
        C0305r1 c0305r1 = this.f1561g;
        c0305r1.setChoiceMode(1);
        if (Build.VERSION.SDK_INT >= 17) {
            c0305r1.setTextDirection(i);
            c0305r1.setTextAlignment(i2);
        }
        int selectedItemPosition = this.f1809I.getSelectedItemPosition();
        C0305r1 c0305r12 = this.f1561g;
        if (mo2835b() && c0305r12 != null) {
            c0305r12.setListSelectionHidden(false);
            c0305r12.setSelection(selectedItemPosition);
            if (c0305r12.getChoiceMode() != 0) {
                c0305r12.setItemChecked(selectedItemPosition, true);
            }
        }
        if (mo2835b || (viewTreeObserver = this.f1809I.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserver$OnGlobalLayoutListenerC0324v0 viewTreeObserver$OnGlobalLayoutListenerC0324v0 = new ViewTreeObserver$OnGlobalLayoutListenerC0324v0(this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListenerC0324v0);
        this.f1558D.setOnDismissListener(new C0329w0(this, viewTreeObserver$OnGlobalLayoutListenerC0324v0));
    }

    @Override // p010b.p016c.p026q.InterfaceC0344z0
    /* renamed from: j */
    public CharSequence mo2701j() {
        return this.f1805E;
    }

    @Override // p010b.p016c.p026q.InterfaceC0344z0
    /* renamed from: l */
    public void mo2700l(CharSequence charSequence) {
        this.f1805E = charSequence;
    }

    @Override // p010b.p016c.p026q.C0243f2, p010b.p016c.p026q.InterfaceC0344z0
    /* renamed from: o */
    public void mo2697o(ListAdapter listAdapter) {
        super.mo2697o(listAdapter);
        this.f1806F = listAdapter;
    }

    @Override // p010b.p016c.p026q.InterfaceC0344z0
    /* renamed from: p */
    public void mo2696p(int i) {
        this.f1808H = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m2719t() {
        int i;
        Drawable m2831i = m2831i();
        int i2 = 0;
        if (m2831i != null) {
            m2831i.getPadding(this.f1809I.f1455j);
            i2 = AbstractC0257h4.m2817a(this.f1809I) ? this.f1809I.f1455j.right : -this.f1809I.f1455j.left;
        } else {
            Rect rect = this.f1809I.f1455j;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = this.f1809I.getPaddingLeft();
        int paddingRight = this.f1809I.getPaddingRight();
        int width = this.f1809I.getWidth();
        C0212a1 c0212a1 = this.f1809I;
        int i3 = c0212a1.f1454i;
        if (i3 == -2) {
            int m2884a = c0212a1.m2884a((SpinnerAdapter) this.f1806F, m2831i());
            int i4 = this.f1809I.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f1809I.f1455j;
            int i5 = (i4 - rect2.left) - rect2.right;
            if (m2884a > i5) {
                m2884a = i5;
            }
            i = Math.max(m2884a, (width - paddingLeft) - paddingRight);
        } else if (i3 != -1) {
            m2827r(i3);
            this.f1564j = !AbstractC0257h4.m2817a(this.f1809I) ? (((width - paddingRight) - this.f1563i) - this.f1808H) + i2 : paddingLeft + this.f1808H + i2;
        } else {
            i = (width - paddingLeft) - paddingRight;
        }
        m2827r(i);
        this.f1564j = !AbstractC0257h4.m2817a(this.f1809I) ? (((width - paddingRight) - this.f1563i) - this.f1808H) + i2 : paddingLeft + this.f1808H + i2;
    }
}