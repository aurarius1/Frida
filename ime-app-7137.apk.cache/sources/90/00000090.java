package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import p010b.p046j.p048e.p049b.AbstractC0505k;
import p010b.p067m.p068d.C0668a;
import p010b.p067m.p068d.C0690f1;
import p010b.p067m.p068d.DialogInterface$OnCancelListenerC0751v;
import p010b.p082t.AbstractC0883m0;
import p010b.p082t.AbstractC0897t0;
import p010b.p082t.AbstractC0904x;
import p010b.p082t.C0868f;
import p010b.p082t.C0878k;
import p010b.p082t.C0884n;
import p010b.p082t.InterfaceC0869f0;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {

    /* renamed from: P */
    public CharSequence f572P;

    /* renamed from: Q */
    public CharSequence f573Q;

    /* renamed from: R */
    public Drawable f574R;

    /* renamed from: S */
    public CharSequence f575S;

    /* renamed from: T */
    public CharSequence f576T;

    /* renamed from: U */
    public int f577U;

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0505k.m2404a(context, AbstractC0883m0.dialogPreferenceStyle, 16842897), 0);
    }

    @Override // androidx.preference.Preference
    /* renamed from: s */
    public void mo3247s() {
        DialogInterface$OnCancelListenerC0751v c0884n;
        InterfaceC0869f0 interfaceC0869f0 = this.f610c.f3476i;
        if (interfaceC0869f0 != null) {
            AbstractC0904x abstractC0904x = (AbstractC0904x) interfaceC0869f0;
            abstractC0904x.m1872h();
            if (abstractC0904x.m1853u().m2086K("androidx.preference.PreferenceFragment.DIALOG") != null) {
                return;
            }
            if (this instanceof EditTextPreference) {
                String str = this.f620m;
                c0884n = new C0868f();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                c0884n.m1901G0(bundle);
            } else if (this instanceof ListPreference) {
                String str2 = this.f620m;
                c0884n = new C0878k();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", str2);
                c0884n.m1901G0(bundle2);
            } else if (this instanceof MultiSelectListPreference) {
                String str3 = this.f620m;
                c0884n = new C0884n();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", str3);
                c0884n.m1901G0(bundle3);
            } else {
                StringBuilder m1187i = AbstractC1124a.m1187i("Cannot display dialog for an unknown Preference type: ");
                m1187i.append(getClass().getSimpleName());
                m1187i.append(". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                throw new IllegalArgumentException(m1187i.toString());
            }
            c0884n.m1889M0(abstractC0904x, 0);
            C0690f1 m1853u = abstractC0904x.m1853u();
            c0884n.f3171j0 = false;
            c0884n.f3172k0 = true;
            C0668a c0668a = new C0668a(m1853u);
            c0668a.m2116h(0, c0884n, "androidx.preference.PreferenceFragment.DIALOG", 1);
            c0668a.m2119e();
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0897t0.DialogPreference, i, i2);
        String m2398g = AbstractC0505k.m2398g(obtainStyledAttributes, AbstractC0897t0.DialogPreference_dialogTitle, AbstractC0897t0.DialogPreference_android_dialogTitle);
        this.f572P = m2398g;
        if (m2398g == null) {
            this.f572P = this.f616i;
        }
        int i3 = AbstractC0897t0.DialogPreference_dialogMessage;
        int i4 = AbstractC0897t0.DialogPreference_android_dialogMessage;
        String string = obtainStyledAttributes.getString(i3);
        this.f573Q = string == null ? obtainStyledAttributes.getString(i4) : string;
        int i5 = AbstractC0897t0.DialogPreference_dialogIcon;
        int i6 = AbstractC0897t0.DialogPreference_android_dialogIcon;
        Drawable drawable = obtainStyledAttributes.getDrawable(i5);
        this.f574R = drawable == null ? obtainStyledAttributes.getDrawable(i6) : drawable;
        int i7 = AbstractC0897t0.DialogPreference_positiveButtonText;
        int i8 = AbstractC0897t0.DialogPreference_android_positiveButtonText;
        String string2 = obtainStyledAttributes.getString(i7);
        this.f575S = string2 == null ? obtainStyledAttributes.getString(i8) : string2;
        int i9 = AbstractC0897t0.DialogPreference_negativeButtonText;
        int i10 = AbstractC0897t0.DialogPreference_android_negativeButtonText;
        String string3 = obtainStyledAttributes.getString(i9);
        this.f576T = string3 == null ? obtainStyledAttributes.getString(i10) : string3;
        this.f577U = obtainStyledAttributes.getResourceId(AbstractC0897t0.DialogPreference_dialogLayout, obtainStyledAttributes.getResourceId(AbstractC0897t0.DialogPreference_android_dialogLayout, 0));
        obtainStyledAttributes.recycle();
    }
}