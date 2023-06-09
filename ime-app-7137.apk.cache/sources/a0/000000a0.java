package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import p010b.p046j.p048e.p049b.AbstractC0505k;
import p010b.p082t.AbstractC0883m0;
import p010b.p082t.AbstractC0897t0;
import p010b.p082t.C0881l0;
import p010b.p082t.C0905x0;

/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {

    /* renamed from: U */
    public final C0905x0 f659U;

    /* renamed from: V */
    public CharSequence f660V;

    /* renamed from: W */
    public CharSequence f661W;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0, 0);
        int m2404a = AbstractC0505k.m2404a(context, AbstractC0883m0.switchPreferenceStyle, 16843629);
        this.f659U = new C0905x0(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0897t0.SwitchPreference, m2404a, 0);
        m3250O(AbstractC0505k.m2398g(obtainStyledAttributes, AbstractC0897t0.SwitchPreference_summaryOn, AbstractC0897t0.SwitchPreference_android_summaryOn));
        int i = AbstractC0897t0.SwitchPreference_summaryOff;
        int i2 = AbstractC0897t0.SwitchPreference_android_summaryOff;
        String string = obtainStyledAttributes.getString(i);
        m3251N(string == null ? obtainStyledAttributes.getString(i2) : string);
        int i3 = AbstractC0897t0.SwitchPreference_switchTextOn;
        int i4 = AbstractC0897t0.SwitchPreference_android_switchTextOn;
        String string2 = obtainStyledAttributes.getString(i3);
        this.f660V = string2 == null ? obtainStyledAttributes.getString(i4) : string2;
        mo3277m();
        int i5 = AbstractC0897t0.SwitchPreference_switchTextOff;
        int i6 = AbstractC0897t0.SwitchPreference_android_switchTextOff;
        String string3 = obtainStyledAttributes.getString(i5);
        this.f661W = string3 == null ? obtainStyledAttributes.getString(i6) : string3;
        mo3277m();
        this.f669T = obtainStyledAttributes.getBoolean(AbstractC0897t0.SwitchPreference_disableDependentsState, obtainStyledAttributes.getBoolean(AbstractC0897t0.SwitchPreference_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: C */
    public void mo3256C(View view) {
        super.mo3256C(view);
        if (((AccessibilityManager) this.f609b.getSystemService("accessibility")).isEnabled()) {
            m3257R(view.findViewById(16908352));
            m3249P(view.findViewById(16908304));
        }
    }

    /* renamed from: R */
    public final void m3257R(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f665P);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.f660V);
            r4.setTextOff(this.f661W);
            r4.setOnCheckedChangeListener(this.f659U);
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: r */
    public void mo0r(C0881l0 c0881l0) {
        super.mo0r(c0881l0);
        m3257R(c0881l0.m1743x(16908352));
        m3248Q(c0881l0);
    }
}