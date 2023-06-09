package p093c.p145g.p146a.p147a.p171w;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;

/* renamed from: c.g.a.a.w.z */
/* loaded from: classes.dex */
public final class C2043z extends AbstractC2018g0 {

    /* renamed from: X */
    public int f6212X;

    /* renamed from: Y */
    public DateSelector f6213Y;

    /* renamed from: Z */
    public CalendarConstraints f6214Z;

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: T */
    public void mo523T(Bundle bundle) {
        super.mo523T(bundle);
        if (bundle == null) {
            bundle = this.f3236i;
        }
        this.f6212X = bundle.getInt("THEME_RES_ID_KEY");
        this.f6213Y = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f6214Z = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: X */
    public View mo522X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f6213Y.m287h(layoutInflater.cloneInContext(new ContextThemeWrapper(m1866k(), this.f6212X)), viewGroup, bundle, this.f6214Z, new C2042y(this));
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: n0 */
    public void mo521n0(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f6212X);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f6213Y);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f6214Z);
    }
}