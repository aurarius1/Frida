package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p010b.p046j.p048e.p049b.AbstractC0505k;
import p010b.p082t.AbstractC0883m0;
import p010b.p082t.AbstractC0897t0;
import p010b.p082t.C0880l;

/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: V */
    public CharSequence[] f590V;

    /* renamed from: W */
    public CharSequence[] f591W;

    /* renamed from: X */
    public Set f592X;

    /* loaded from: classes.dex */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C0880l();

        /* renamed from: b */
        public Set f593b;

        public SavedState(Parcel parcel) {
            super(parcel);
            int readInt = parcel.readInt();
            this.f593b = new HashSet();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f593b, strArr);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f593b.size());
            Set set = this.f593b;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0, 0);
        int m2404a = AbstractC0505k.m2404a(context, AbstractC0883m0.dialogPreferenceStyle, 16842897);
        this.f592X = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0897t0.MultiSelectListPreference, m2404a, 0);
        this.f590V = AbstractC0505k.m2397h(obtainStyledAttributes, AbstractC0897t0.MultiSelectListPreference_entries, AbstractC0897t0.MultiSelectListPreference_android_entries);
        int i = AbstractC0897t0.MultiSelectListPreference_entryValues;
        int i2 = AbstractC0897t0.MultiSelectListPreference_android_entryValues;
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(i);
        this.f591W = textArray == null ? obtainStyledAttributes.getTextArray(i2) : textArray;
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: A */
    public void mo3254A(Object obj) {
        m3294M(m3281h((Set) obj));
    }

    /* renamed from: M */
    public void m3294M(Set set) {
        this.f592X.clear();
        this.f592X.addAll(set);
        if (m3287K() && !set.equals(m3281h(null))) {
            m3280i();
            SharedPreferences.Editor m1745b = this.f610c.m1745b();
            m1745b.putStringSet(this.f620m, set);
            if (!this.f610c.f3472e) {
                m1745b.apply();
            }
        }
        mo3277m();
    }

    @Override // androidx.preference.Preference
    /* renamed from: v */
    public Object mo3246v(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
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
        m3294M(savedState.f593b);
    }

    @Override // androidx.preference.Preference
    /* renamed from: z */
    public Parcelable mo3244z() {
        Parcelable mo3244z = super.mo3244z();
        if (this.f627t) {
            return mo3244z;
        }
        SavedState savedState = new SavedState(mo3244z);
        savedState.f593b = this.f592X;
        return savedState;
    }
}