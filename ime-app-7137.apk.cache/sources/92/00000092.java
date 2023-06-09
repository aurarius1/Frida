package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import p010b.p046j.p048e.p049b.AbstractC0505k;
import p010b.p082t.AbstractC0883m0;
import p010b.p082t.AbstractC0897t0;
import p010b.p082t.C0864d;
import p010b.p082t.C0866e;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {

    /* renamed from: V */
    public String f582V;

    /* loaded from: classes.dex */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C0864d();

        /* renamed from: b */
        public String f583b;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f583b = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f583b);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0, 0);
        int m2404a = AbstractC0505k.m2404a(context, AbstractC0883m0.editTextPreferenceStyle, 16842898);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0897t0.EditTextPreference, m2404a, 0);
        int i = AbstractC0897t0.EditTextPreference_useSimpleSummaryProvider;
        if (AbstractC0505k.m2403b(obtainStyledAttributes, i, i, false)) {
            if (C0866e.f3457a == null) {
                C0866e.f3457a = new C0866e();
            }
            this.f607N = C0866e.f3457a;
            mo3277m();
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: A */
    public void mo3254A(Object obj) {
        m3299M(m3282g((String) obj));
    }

    @Override // androidx.preference.Preference
    /* renamed from: J */
    public boolean mo3253J() {
        return TextUtils.isEmpty(this.f582V) || super.mo3253J();
    }

    /* renamed from: M */
    public void m3299M(String str) {
        boolean mo3253J = mo3253J();
        this.f582V = str;
        m3292E(str);
        boolean mo3253J2 = mo3253J();
        if (mo3253J2 != mo3253J) {
            mo3263n(mo3253J2);
        }
        mo3277m();
    }

    @Override // androidx.preference.Preference
    /* renamed from: v */
    public Object mo3246v(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    /* renamed from: y */
    public void mo3245y(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.mo3245y(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.mo3245y(savedState.getSuperState());
        m3299M(savedState.f583b);
    }

    @Override // androidx.preference.Preference
    /* renamed from: z */
    public Parcelable mo3244z() {
        Parcelable mo3244z = super.mo3244z();
        if (this.f627t) {
            return mo3244z;
        }
        SavedState savedState = new SavedState(mo3244z);
        savedState.f583b = this.f582V;
        return savedState;
    }
}