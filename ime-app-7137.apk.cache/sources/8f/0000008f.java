package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import p010b.p046j.p048e.p049b.AbstractC0505k;
import p010b.p082t.AbstractC0883m0;
import p010b.p082t.AbstractC0897t0;
import p010b.p082t.C0858a;
import p010b.p082t.C0881l0;

/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: U */
    public final C0858a f571U;

    public CheckBoxPreference(Context context) {
        this(context, null);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0505k.m2404a(context, AbstractC0883m0.checkBoxPreferenceStyle, 16842895));
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f571U = new C0858a(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0897t0.CheckBoxPreference, i, i2);
        m3250O(AbstractC0505k.m2398g(obtainStyledAttributes, AbstractC0897t0.CheckBoxPreference_summaryOn, AbstractC0897t0.CheckBoxPreference_android_summaryOn));
        int i3 = AbstractC0897t0.CheckBoxPreference_summaryOff;
        int i4 = AbstractC0897t0.CheckBoxPreference_android_summaryOff;
        String string = obtainStyledAttributes.getString(i3);
        m3251N(string == null ? obtainStyledAttributes.getString(i4) : string);
        this.f669T = obtainStyledAttributes.getBoolean(AbstractC0897t0.CheckBoxPreference_disableDependentsState, obtainStyledAttributes.getBoolean(AbstractC0897t0.CheckBoxPreference_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: C */
    public void mo3256C(View view) {
        super.mo3256C(view);
        if (((AccessibilityManager) this.f609b.getSystemService("accessibility")).isEnabled()) {
            m3301R(view.findViewById(16908289));
            m3249P(view.findViewById(16908304));
        }
    }

    /* renamed from: R */
    public final void m3301R(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f665P);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f571U);
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: r */
    public void mo0r(C0881l0 c0881l0) {
        super.mo0r(c0881l0);
        m3301R(c0881l0.m1743x(16908289));
        m3248Q(c0881l0);
    }
}