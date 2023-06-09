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
import p010b.p082t.C0872h;
import p010b.p082t.C0874i;
import p010b.p082t.InterfaceC0894s;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: V */
    public CharSequence[] f584V;

    /* renamed from: W */
    public CharSequence[] f585W;

    /* renamed from: X */
    public String f586X;

    /* renamed from: Y */
    public String f587Y;

    /* renamed from: Z */
    public boolean f588Z;

    /* loaded from: classes.dex */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C0872h();

        /* renamed from: b */
        public String f589b;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f589b = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f589b);
        }
    }

    public ListPreference(Context context) {
        this(context, null);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0505k.m2404a(context, AbstractC0883m0.dialogPreferenceStyle, 16842897));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0897t0.ListPreference, i, i2);
        this.f584V = AbstractC0505k.m2397h(obtainStyledAttributes, AbstractC0897t0.ListPreference_entries, AbstractC0897t0.ListPreference_android_entries);
        int i3 = AbstractC0897t0.ListPreference_entryValues;
        int i4 = AbstractC0897t0.ListPreference_android_entryValues;
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(i3);
        this.f585W = textArray == null ? obtainStyledAttributes.getTextArray(i4) : textArray;
        int i5 = AbstractC0897t0.ListPreference_useSimpleSummaryProvider;
        if (obtainStyledAttributes.getBoolean(i5, obtainStyledAttributes.getBoolean(i5, false))) {
            if (C0874i.f3467a == null) {
                C0874i.f3467a = new C0874i();
            }
            this.f607N = C0874i.f3467a;
            mo3277m();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0897t0.Preference, i, i2);
        this.f587Y = AbstractC0505k.m2398g(obtainStyledAttributes2, AbstractC0897t0.Preference_summary, AbstractC0897t0.Preference_android_summary);
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: A */
    public void mo3254A(Object obj) {
        m3295P(m3282g((String) obj));
    }

    @Override // androidx.preference.Preference
    /* renamed from: H */
    public void mo3289H(CharSequence charSequence) {
        String charSequence2;
        super.mo3289H(charSequence);
        if (charSequence == null && this.f587Y != null) {
            charSequence2 = null;
        } else if (charSequence == null || charSequence.equals(this.f587Y)) {
            return;
        } else {
            charSequence2 = charSequence.toString();
        }
        this.f587Y = charSequence2;
    }

    /* renamed from: M */
    public int m3298M(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f585W) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (this.f585W[length].equals(str)) {
                return length;
            }
        }
        return -1;
    }

    /* renamed from: N */
    public CharSequence m3297N() {
        CharSequence[] charSequenceArr;
        int m3298M = m3298M(this.f586X);
        if (m3298M < 0 || (charSequenceArr = this.f584V) == null) {
            return null;
        }
        return charSequenceArr[m3298M];
    }

    /* renamed from: O */
    public void mo3296O(CharSequence[] charSequenceArr) {
        this.f584V = charSequenceArr;
    }

    /* renamed from: P */
    public void m3295P(String str) {
        boolean z = !TextUtils.equals(this.f586X, str);
        if (z || !this.f588Z) {
            this.f586X = str;
            this.f588Z = true;
            m3292E(str);
            if (z) {
                mo3277m();
            }
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: j */
    public CharSequence mo3279j() {
        InterfaceC0894s interfaceC0894s = this.f607N;
        if (interfaceC0894s != null) {
            return interfaceC0894s.mo1742a(this);
        }
        CharSequence m3297N = m3297N();
        CharSequence mo3279j = super.mo3279j();
        String str = this.f587Y;
        if (str == null) {
            return mo3279j;
        }
        Object[] objArr = new Object[1];
        if (m3297N == null) {
            m3297N = "";
        }
        objArr[0] = m3297N;
        String format = String.format(str, objArr);
        return TextUtils.equals(format, mo3279j) ? mo3279j : format;
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
        m3295P(savedState.f589b);
    }

    @Override // androidx.preference.Preference
    /* renamed from: z */
    public Parcelable mo3244z() {
        Parcelable mo3244z = super.mo3244z();
        if (this.f627t) {
            return mo3244z;
        }
        SavedState savedState = new SavedState(mo3244z);
        savedState.f589b = this.f586X;
        return savedState;
    }
}