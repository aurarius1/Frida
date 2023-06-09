package p093c.p145g.p146a.p147a.p171w;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.Month;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p083u.p084e.C1006x0;
import p093c.p145g.p146a.p147a.AbstractC1840f;
import p093c.p145g.p146a.p147a.AbstractC1842g;
import p093c.p145g.p146a.p147a.AbstractC1868h;

/* renamed from: c.g.a.a.w.q */
/* loaded from: classes.dex */
public final class C2034q extends AbstractC2018g0 {

    /* renamed from: X */
    public static final /* synthetic */ int f6178X = 0;

    /* renamed from: Y */
    public int f6179Y;

    /* renamed from: Z */
    public DateSelector f6180Z;

    /* renamed from: a0 */
    public CalendarConstraints f6181a0;

    /* renamed from: b0 */
    public Month f6182b0;

    /* renamed from: c0 */
    public int f6183c0;

    /* renamed from: d0 */
    public C2011d f6184d0;

    /* renamed from: e0 */
    public RecyclerView f6185e0;

    /* renamed from: f0 */
    public RecyclerView f6186f0;

    /* renamed from: g0 */
    public View f6187g0;

    /* renamed from: h0 */
    public View f6188h0;

    @Override // p093c.p145g.p146a.p147a.p171w.AbstractC2018g0
    /* renamed from: Q0 */
    public boolean mo539Q0(AbstractC2016f0 abstractC2016f0) {
        return this.f6157W.add(abstractC2016f0);
    }

    /* renamed from: R0 */
    public LinearLayoutManager m538R0() {
        return (LinearLayoutManager) this.f6186f0.getLayoutManager();
    }

    /* renamed from: S0 */
    public final void m537S0(int i) {
        this.f6186f0.post(new RunnableC2017g(this, i));
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: T */
    public void mo523T(Bundle bundle) {
        super.mo523T(bundle);
        if (bundle == null) {
            bundle = this.f3236i;
        }
        this.f6179Y = bundle.getInt("THEME_RES_ID_KEY");
        this.f6180Z = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f6181a0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f6182b0 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* renamed from: T0 */
    public void m536T0(Month month) {
        RecyclerView recyclerView;
        int i;
        C2014e0 c2014e0 = (C2014e0) this.f6186f0.getAdapter();
        int m278q = c2014e0.f6147e.f6796b.m278q(month);
        int m556i = m278q - c2014e0.m556i(this.f6182b0);
        boolean z = Math.abs(m556i) > 3;
        boolean z2 = m556i > 0;
        this.f6182b0 = month;
        if (!z || !z2) {
            if (z) {
                recyclerView = this.f6186f0;
                i = m278q + 3;
            }
            m537S0(m278q);
        }
        recyclerView = this.f6186f0;
        i = m278q - 3;
        recyclerView.m3153k0(i);
        m537S0(m278q);
    }

    /* renamed from: U0 */
    public void m535U0(int i) {
        this.f6183c0 = i;
        if (i == 2) {
            this.f6185e0.getLayoutManager().mo1565N0(((C2030m0) this.f6185e0.getAdapter()).m540h(this.f6182b0.f6807d));
            this.f6187g0.setVisibility(0);
            this.f6188h0.setVisibility(8);
        } else if (i == 1) {
            this.f6187g0.setVisibility(8);
            this.f6188h0.setVisibility(0);
            m536T0(this.f6182b0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0135, code lost:
        r13 = new p010b.p083u.p084e.C1006x0();
     */
    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View mo522X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        C1006x0 c1006x0;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m1866k(), this.f6179Y);
        this.f6184d0 = new C2011d(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.f6181a0.f6796b;
        if (C2040w.m532V0(contextThemeWrapper)) {
            i = AbstractC1868h.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = AbstractC1868h.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(AbstractC1840f.mtrl_calendar_days_of_week);
        AbstractC0605j0.m2269N(gridView, new C2019h(this));
        gridView.setAdapter((ListAdapter) new C2015f());
        gridView.setNumColumns(month.f6808e);
        gridView.setEnabled(false);
        this.f6186f0 = (RecyclerView) inflate.findViewById(AbstractC1840f.mtrl_calendar_months);
        this.f6186f0.setLayoutManager(new C2021i(this, m1866k(), i2, false, i2));
        this.f6186f0.setTag("MONTHS_VIEW_GROUP_TAG");
        C2014e0 c2014e0 = new C2014e0(contextThemeWrapper, this.f6180Z, this.f6181a0, new C2023j(this));
        this.f6186f0.setAdapter(c2014e0);
        int integer = contextThemeWrapper.getResources().getInteger(AbstractC1842g.mtrl_calendar_year_selector_span);
        int i3 = AbstractC1840f.mtrl_calendar_year_selector_frame;
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(i3);
        this.f6185e0 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f6185e0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f6185e0.setAdapter(new C2030m0(this));
            this.f6185e0.m3162g(new C2025k(this));
        }
        int i4 = AbstractC1840f.month_navigation_fragment_toggle;
        if (inflate.findViewById(i4) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(i4);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            AbstractC0605j0.m2269N(materialButton, new C2027l(this));
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(AbstractC1840f.month_navigation_previous);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) inflate.findViewById(AbstractC1840f.month_navigation_next);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.f6187g0 = inflate.findViewById(i3);
            this.f6188h0 = inflate.findViewById(AbstractC1840f.mtrl_calendar_day_selector_frame);
            m535U0(1);
            materialButton.setText(this.f6182b0.m280o(inflate.getContext()));
            this.f6186f0.m3160h(new C2029m(this, c2014e0, materialButton));
            materialButton.setOnClickListener(new View$OnClickListenerC2031n(this));
            materialButton3.setOnClickListener(new View$OnClickListenerC2032o(this, c2014e0));
            materialButton2.setOnClickListener(new View$OnClickListenerC2033p(this, c2014e0));
        }
        if (!C2040w.m532V0(contextThemeWrapper) && (recyclerView2 = c1006x0.f3888a) != (recyclerView = this.f6186f0)) {
            if (recyclerView2 != null) {
                c1006x0.m1415b();
            }
            c1006x0.f3888a = recyclerView;
            if (recyclerView != null) {
                c1006x0.m1410g();
                new Scroller(c1006x0.f3888a.getContext(), new DecelerateInterpolator());
                c1006x0.m1408i();
            }
        }
        this.f6186f0.m3153k0(c2014e0.m556i(this.f6182b0));
        return inflate;
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: n0 */
    public void mo521n0(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f6179Y);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f6180Z);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f6181a0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f6182b0);
    }
}