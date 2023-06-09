package p093c.p145g.p146a.p147a.p171w;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.Month;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p010b.p016c.p018l.p019a.AbstractC0142b;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p067m.p068d.C0668a;
import p010b.p067m.p068d.DialogInterface$OnCancelListenerC0751v;
import p010b.p086w.AbstractC1077v0;
import p093c.p145g.p146a.p147a.AbstractC1804b;
import p093c.p145g.p146a.p147a.AbstractC1829d;
import p093c.p145g.p146a.p147a.AbstractC1835e;
import p093c.p145g.p146a.p147a.AbstractC1840f;
import p093c.p145g.p146a.p147a.AbstractC1868h;
import p093c.p145g.p146a.p147a.AbstractC1924j;
import p093c.p145g.p146a.p147a.AbstractC1926k;
import p093c.p145g.p146a.p147a.p154g0.C1851i;
import p093c.p145g.p146a.p147a.p154g0.C1856n;
import p093c.p145g.p146a.p147a.p172x.View$OnTouchListenerC2044a;
import p093c.p145g.p146a.p147a.p173y.C2045a;

/* renamed from: c.g.a.a.w.w */
/* loaded from: classes.dex */
public final class C2040w extends DialogInterface$OnCancelListenerC0751v {

    /* renamed from: m0 */
    public static final /* synthetic */ int f6193m0 = 0;

    /* renamed from: A0 */
    public TextView f6194A0;

    /* renamed from: B0 */
    public CheckableImageButton f6195B0;

    /* renamed from: C0 */
    public C1851i f6196C0;

    /* renamed from: D0 */
    public Button f6197D0;

    /* renamed from: n0 */
    public final LinkedHashSet f6198n0 = new LinkedHashSet();

    /* renamed from: o0 */
    public final LinkedHashSet f6199o0 = new LinkedHashSet();

    /* renamed from: p0 */
    public final LinkedHashSet f6200p0 = new LinkedHashSet();

    /* renamed from: q0 */
    public final LinkedHashSet f6201q0 = new LinkedHashSet();

    /* renamed from: r0 */
    public int f6202r0;

    /* renamed from: s0 */
    public DateSelector f6203s0;

    /* renamed from: t0 */
    public AbstractC2018g0 f6204t0;

    /* renamed from: u0 */
    public CalendarConstraints f6205u0;

    /* renamed from: v0 */
    public C2034q f6206v0;

    /* renamed from: w0 */
    public int f6207w0;

    /* renamed from: x0 */
    public CharSequence f6208x0;

    /* renamed from: y0 */
    public boolean f6209y0;

    /* renamed from: z0 */
    public int f6210z0;

    /* renamed from: U0 */
    public static int m533U0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(AbstractC1829d.mtrl_calendar_content_padding);
        Calendar m549d = AbstractC2024j0.m549d();
        m549d.set(5, 1);
        Calendar m551b = AbstractC2024j0.m551b(m549d);
        m551b.get(2);
        m551b.get(1);
        int maximum = m551b.getMaximum(7);
        m551b.getActualMaximum(5);
        m551b.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(AbstractC1829d.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(AbstractC1829d.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    /* renamed from: V0 */
    public static boolean m532V0(Context context) {
        return m531W0(context, 16843277);
    }

    /* renamed from: W0 */
    public static boolean m531W0(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC1077v0.m1283U(context, AbstractC1804b.materialCalendarStyle, C2034q.class.getCanonicalName()), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    @Override // p010b.p067m.p068d.DialogInterface$OnCancelListenerC0751v
    /* renamed from: R0 */
    public final Dialog mo14R0(Bundle bundle) {
        Context m1911B0 = m1911B0();
        Context m1911B02 = m1911B0();
        int i = this.f6202r0;
        if (i == 0) {
            i = this.f6203s0.m291c(m1911B02);
        }
        Dialog dialog = new Dialog(m1911B0, i);
        Context context = dialog.getContext();
        this.f6209y0 = m532V0(context);
        int m1283U = AbstractC1077v0.m1283U(context, AbstractC1804b.colorSurface, C2040w.class.getCanonicalName());
        C1851i c1851i = new C1851i(C1856n.m719b(context, null, AbstractC1804b.materialCalendarStyle, AbstractC1926k.Widget_MaterialComponents_MaterialCalendar).m727a());
        this.f6196C0 = c1851i;
        c1851i.f5657d.f5634b = new C2045a(context);
        c1851i.m730w();
        this.f6196C0.m737p(ColorStateList.valueOf(m1283U));
        this.f6196C0.m738o(AbstractC0605j0.m2245m(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // p010b.p067m.p068d.DialogInterface$OnCancelListenerC0751v, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: T */
    public final void mo523T(Bundle bundle) {
        super.mo523T(bundle);
        if (bundle == null) {
            bundle = this.f3236i;
        }
        this.f6202r0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f6203s0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f6205u0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f6207w0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f6208x0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f6210z0 = bundle.getInt("INPUT_MODE_KEY");
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: X */
    public final View mo522X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f6209y0 ? AbstractC1868h.mtrl_picker_fullscreen : AbstractC1868h.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f6209y0) {
            inflate.findViewById(AbstractC1840f.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m533U0(context), -2));
        } else {
            View findViewById = inflate.findViewById(AbstractC1840f.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(AbstractC1840f.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(m533U0(context), -1));
            Resources resources = m1911B0().getResources();
            int dimensionPixelOffset = resources.getDimensionPixelOffset(AbstractC1829d.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(AbstractC1829d.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(AbstractC1829d.mtrl_calendar_navigation_height);
            int dimensionPixelSize = resources.getDimensionPixelSize(AbstractC1829d.mtrl_calendar_days_of_week_height);
            int i = C2008b0.f6122b;
            findViewById2.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(AbstractC1829d.mtrl_calendar_month_vertical_padding) * (i - 1)) + (resources.getDimensionPixelSize(AbstractC1829d.mtrl_calendar_day_height) * i) + resources.getDimensionPixelOffset(AbstractC1829d.mtrl_calendar_bottom_padding));
        }
        TextView textView = (TextView) inflate.findViewById(AbstractC1840f.mtrl_picker_header_selection_text);
        this.f6194A0 = textView;
        AbstractC0605j0.m2268O(textView, 1);
        this.f6195B0 = (CheckableImageButton) inflate.findViewById(AbstractC1840f.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(AbstractC1840f.mtrl_picker_title_text);
        CharSequence charSequence = this.f6208x0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f6207w0);
        }
        this.f6195B0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f6195B0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, AbstractC0142b.m3000b(context, AbstractC1835e.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AbstractC0142b.m3000b(context, AbstractC1835e.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f6195B0.setChecked(this.f6210z0 != 0);
        AbstractC0605j0.m2269N(this.f6195B0, null);
        m528Z0(this.f6195B0);
        this.f6195B0.setOnClickListener(new View$OnClickListenerC2039v(this));
        this.f6197D0 = (Button) inflate.findViewById(AbstractC1840f.confirm_button);
        if (this.f6203s0.m289f()) {
            this.f6197D0.setEnabled(true);
        } else {
            this.f6197D0.setEnabled(false);
        }
        this.f6197D0.setTag("CONFIRM_BUTTON_TAG");
        this.f6197D0.setOnClickListener(new View$OnClickListenerC2036s(this));
        Button button = (Button) inflate.findViewById(AbstractC1840f.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        button.setOnClickListener(new View$OnClickListenerC2037t(this));
        return inflate;
    }

    /* renamed from: X0 */
    public final void m530X0() {
        AbstractC2018g0 abstractC2018g0;
        Context m1911B0 = m1911B0();
        int i = this.f6202r0;
        if (i == 0) {
            i = this.f6203s0.m291c(m1911B0);
        }
        DateSelector dateSelector = this.f6203s0;
        CalendarConstraints calendarConstraints = this.f6205u0;
        C2034q c2034q = new C2034q();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.f6799e);
        c2034q.m1901G0(bundle);
        this.f6206v0 = c2034q;
        if (this.f6195B0.isChecked()) {
            DateSelector dateSelector2 = this.f6203s0;
            CalendarConstraints calendarConstraints2 = this.f6205u0;
            abstractC2018g0 = new C2043z();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i);
            bundle2.putParcelable("DATE_SELECTOR_KEY", dateSelector2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints2);
            abstractC2018g0.m1901G0(bundle2);
        } else {
            abstractC2018g0 = this.f6206v0;
        }
        this.f6204t0 = abstractC2018g0;
        m529Y0();
        C0668a c0668a = new C0668a(m1868j());
        c0668a.m2110n(AbstractC1840f.mtrl_calendar_frame, this.f6204t0);
        if (!c0668a.f2903g) {
            c0668a.f2904h = false;
            c0668a.f2913q.m2091F(c0668a, false);
            this.f6204t0.mo539Q0(new C2038u(this));
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* renamed from: Y0 */
    public final void m529Y0() {
        String m292b = this.f6203s0.m292b(m1866k());
        this.f6194A0.setContentDescription(String.format(m1908D(AbstractC1924j.mtrl_picker_announce_current_selection), m292b));
        this.f6194A0.setText(m292b);
    }

    /* renamed from: Z0 */
    public final void m528Z0(CheckableImageButton checkableImageButton) {
        this.f6195B0.setContentDescription(checkableImageButton.getContext().getString(this.f6195B0.isChecked() ? AbstractC1924j.mtrl_picker_toggle_to_calendar_input_mode : AbstractC1924j.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // p010b.p067m.p068d.DialogInterface$OnCancelListenerC0751v, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: n0 */
    public final void mo521n0(Bundle bundle) {
        super.mo521n0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f6202r0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f6203s0);
        C2007b c2007b = new C2007b(this.f6205u0);
        Month month = this.f6206v0.f6182b0;
        if (month != null) {
            c2007b.f6120e = Long.valueOf(month.f6810g);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", c2007b.f6121f);
        Month m282m = Month.m282m(c2007b.f6118c);
        Month m282m2 = Month.m282m(c2007b.f6119d);
        CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = c2007b.f6120e;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new CalendarConstraints(m282m, m282m2, dateValidator, l == null ? null : Month.m282m(l.longValue()), null));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f6207w0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f6208x0);
    }

    @Override // p010b.p067m.p068d.DialogInterface$OnCancelListenerC0751v, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: o0 */
    public void mo527o0() {
        super.mo527o0();
        Window window = m1938S0().getWindow();
        if (this.f6209y0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f6196C0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m1843z().getDimensionPixelOffset(AbstractC1829d.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f6196C0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new View$OnTouchListenerC2044a(m1938S0(), rect));
        }
        m530X0();
    }

    @Override // p010b.p067m.p068d.DialogInterface$OnCancelListenerC0751v, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f6200p0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // p010b.p067m.p068d.DialogInterface$OnCancelListenerC0751v, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f6201q0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f3216I;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // p010b.p067m.p068d.DialogInterface$OnCancelListenerC0751v, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: p0 */
    public void mo526p0() {
        this.f6204t0.f6157W.clear();
        this.f3214G = true;
        Dialog dialog = this.f3169h0;
        if (dialog != null) {
            dialog.hide();
        }
    }
}