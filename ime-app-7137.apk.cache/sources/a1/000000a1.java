package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import androidx.appcompat.widget.SwitchCompat;
import p010b.p046j.p048e.p049b.AbstractC0505k;
import p010b.p082t.AbstractC0883m0;
import p010b.p082t.AbstractC0889p0;
import p010b.p082t.AbstractC0897t0;
import p010b.p082t.C0881l0;
import p010b.p082t.C0907y0;

/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: U */
    public final C0907y0 f662U;

    /* renamed from: V */
    public CharSequence f663V;

    /* renamed from: W */
    public CharSequence f664W;

    public SwitchPreferenceCompat(Context context) {
        this(context, null);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0883m0.switchPreferenceCompatStyle);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f662U = new C0907y0(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0897t0.SwitchPreferenceCompat, i, i2);
        m3250O(AbstractC0505k.m2398g(obtainStyledAttributes, AbstractC0897t0.SwitchPreferenceCompat_summaryOn, AbstractC0897t0.SwitchPreferenceCompat_android_summaryOn));
        int i3 = AbstractC0897t0.SwitchPreferenceCompat_summaryOff;
        int i4 = AbstractC0897t0.SwitchPreferenceCompat_android_summaryOff;
        String string = obtainStyledAttributes.getString(i3);
        m3251N(string == null ? obtainStyledAttributes.getString(i4) : string);
        int i5 = AbstractC0897t0.SwitchPreferenceCompat_switchTextOn;
        int i6 = AbstractC0897t0.SwitchPreferenceCompat_android_switchTextOn;
        String string2 = obtainStyledAttributes.getString(i5);
        this.f663V = string2 == null ? obtainStyledAttributes.getString(i6) : string2;
        mo3277m();
        int i7 = AbstractC0897t0.SwitchPreferenceCompat_switchTextOff;
        int i8 = AbstractC0897t0.SwitchPreferenceCompat_android_switchTextOff;
        String string3 = obtainStyledAttributes.getString(i7);
        this.f664W = string3 == null ? obtainStyledAttributes.getString(i8) : string3;
        mo3277m();
        this.f669T = obtainStyledAttributes.getBoolean(AbstractC0897t0.SwitchPreferenceCompat_disableDependentsState, obtainStyledAttributes.getBoolean(AbstractC0897t0.SwitchPreferenceCompat_android_disableDependentsState, false));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: C */
    public void mo3256C(View view) {
        super.mo3256C(view);
        if (((AccessibilityManager) this.f609b.getSystemService("accessibility")).isEnabled()) {
            m3255R(view.findViewById(AbstractC0889p0.switchWidget));
            m3249P(view.findViewById(16908304));
        }
    }

    /* renamed from: R */
    public final void m3255R(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f665P);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f663V);
            switchCompat.setTextOff(this.f664W);
            switchCompat.setOnCheckedChangeListener(this.f662U);
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: r */
    public void mo0r(C0881l0 c0881l0) {
        super.mo0r(c0881l0);
        m3255R(c0881l0.m1743x(AbstractC0889p0.switchWidget));
        m3248Q(c0881l0);
    }
}