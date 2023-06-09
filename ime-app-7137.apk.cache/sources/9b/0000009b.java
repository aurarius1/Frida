package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p010b.p036g.C0390n;
import p010b.p046j.p048e.p049b.AbstractC0505k;
import p010b.p082t.AbstractC0897t0;
import p010b.p082t.C0875i0;
import p010b.p082t.C0908z;
import p010b.p082t.RunnableC0906y;

/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {

    /* renamed from: P */
    public final C0390n f634P;

    /* renamed from: Q */
    public final Handler f635Q;

    /* renamed from: R */
    public List f636R;

    /* renamed from: S */
    public boolean f637S;

    /* renamed from: T */
    public int f638T;

    /* renamed from: U */
    public boolean f639U;

    /* renamed from: V */
    public int f640V;

    /* renamed from: W */
    public final Runnable f641W;

    /* loaded from: classes.dex */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C0908z();

        /* renamed from: b */
        public int f642b;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f642b = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.f642b = i;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f642b);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m3270M(Preference preference) {
        long j;
        if (this.f636R.contains(preference)) {
            return true;
        }
        if (preference.f620m != null) {
            PreferenceGroup preferenceGroup = this;
            while (true) {
                PreferenceGroup preferenceGroup2 = preferenceGroup.f604K;
                if (preferenceGroup2 == null) {
                    break;
                }
                preferenceGroup = preferenceGroup2;
            }
            preferenceGroup.m3269N(preference.f620m);
        }
        int i = preference.f615h;
        if (i == Integer.MAX_VALUE) {
            if (this.f637S) {
                int i2 = this.f638T;
                this.f638T = i2 + 1;
                if (i2 != i) {
                    preference.f615h = i2;
                    preference.m3276o();
                }
            }
            if (preference instanceof PreferenceGroup) {
                ((PreferenceGroup) preference).f637S = this.f637S;
            }
        }
        int binarySearch = Collections.binarySearch(this.f636R, preference);
        if (binarySearch < 0) {
            binarySearch = (binarySearch * (-1)) - 1;
        }
        preference.m3273x(mo3253J());
        synchronized (this) {
            this.f636R.add(binarySearch, preference);
        }
        C0875i0 c0875i0 = this.f610c;
        String str = preference.f620m;
        try {
            if (str != null) {
                if (this.f634P.m2619e(str) >= 0) {
                    j = ((Long) this.f634P.getOrDefault(str, null)).longValue();
                    this.f634P.remove(str);
                    preference.f611d = j;
                    preference.f612e = true;
                    preference.m3275q(c0875i0);
                    preference.f612e = false;
                    if (preference.f604K != null) {
                        preference.f604K = this;
                        if (this.f639U) {
                            preference.mo3262p();
                        }
                        m3276o();
                        return true;
                    }
                    throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
                }
            }
            preference.m3275q(c0875i0);
            preference.f612e = false;
            if (preference.f604K != null) {
            }
        } catch (Throwable th) {
            preference.f612e = false;
            throw th;
        }
        synchronized (c0875i0) {
            j = c0875i0.f3469b;
            c0875i0.f3469b = 1 + j;
        }
        preference.f611d = j;
        preference.f612e = true;
    }

    /* renamed from: N */
    public Preference m3269N(CharSequence charSequence) {
        Preference m3269N;
        if (charSequence != null) {
            if (TextUtils.equals(this.f620m, charSequence)) {
                return this;
            }
            int m3267P = m3267P();
            for (int i = 0; i < m3267P; i++) {
                Preference m3268O = m3268O(i);
                if (TextUtils.equals(m3268O.f620m, charSequence)) {
                    return m3268O;
                }
                if ((m3268O instanceof PreferenceGroup) && (m3269N = ((PreferenceGroup) m3268O).m3269N(charSequence)) != null) {
                    return m3269N;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("Key cannot be null");
    }

    /* renamed from: O */
    public Preference m3268O(int i) {
        return (Preference) this.f636R.get(i);
    }

    /* renamed from: P */
    public int m3267P() {
        return this.f636R.size();
    }

    /* renamed from: Q */
    public final boolean m3266Q(Preference preference) {
        boolean remove;
        synchronized (this) {
            preference.m3286L();
            if (preference.f604K == this) {
                preference.f604K = null;
            }
            remove = this.f636R.remove(preference);
            if (remove) {
                String str = preference.f620m;
                if (str != null) {
                    this.f634P.put(str, Long.valueOf(preference.mo1747d()));
                    this.f635Q.removeCallbacks(this.f641W);
                    this.f635Q.post(this.f641W);
                }
                if (this.f639U) {
                    preference.mo3261u();
                }
            }
        }
        return remove;
    }

    @Override // androidx.preference.Preference
    /* renamed from: b */
    public void mo3265b(Bundle bundle) {
        super.mo3265b(bundle);
        int m3267P = m3267P();
        for (int i = 0; i < m3267P; i++) {
            m3268O(i).mo3265b(bundle);
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: c */
    public void mo3264c(Bundle bundle) {
        super.mo3264c(bundle);
        int m3267P = m3267P();
        for (int i = 0; i < m3267P; i++) {
            m3268O(i).mo3264c(bundle);
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: n */
    public void mo3263n(boolean z) {
        super.mo3263n(z);
        int m3267P = m3267P();
        for (int i = 0; i < m3267P; i++) {
            m3268O(i).m3273x(z);
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: p */
    public void mo3262p() {
        super.mo3262p();
        this.f639U = true;
        int m3267P = m3267P();
        for (int i = 0; i < m3267P; i++) {
            m3268O(i).mo3262p();
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: u */
    public void mo3261u() {
        m3286L();
        this.f639U = false;
        int m3267P = m3267P();
        for (int i = 0; i < m3267P; i++) {
            m3268O(i).mo3261u();
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: y */
    public void mo3245y(Parcelable parcelable) {
        if (!parcelable.getClass().equals(SavedState.class)) {
            super.mo3245y(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f640V = savedState.f642b;
        super.mo3245y(savedState.getSuperState());
    }

    @Override // androidx.preference.Preference
    /* renamed from: z */
    public Parcelable mo3244z() {
        return new SavedState(super.mo3244z(), this.f640V);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f634P = new C0390n();
        this.f635Q = new Handler();
        this.f637S = true;
        this.f638T = 0;
        this.f639U = false;
        this.f640V = Integer.MAX_VALUE;
        this.f641W = new RunnableC0906y(this);
        this.f636R = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0897t0.PreferenceGroup, i, i2);
        int i3 = AbstractC0897t0.PreferenceGroup_orderingFromXml;
        this.f637S = AbstractC0505k.m2403b(obtainStyledAttributes, i3, i3, true);
        int i4 = AbstractC0897t0.PreferenceGroup_initialExpandedChildrenCount;
        if (obtainStyledAttributes.hasValue(i4)) {
            int i5 = obtainStyledAttributes.getInt(i4, obtainStyledAttributes.getInt(i4, Integer.MAX_VALUE));
            if (i5 != Integer.MAX_VALUE && !m3278k()) {
                getClass().getSimpleName();
            }
            this.f640V = i5;
        }
        obtainStyledAttributes.recycle();
    }
}