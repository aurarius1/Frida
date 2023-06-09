package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import p010b.p082t.C0881l0;
import p010b.p082t.C0909z0;

/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {

    /* renamed from: P */
    public boolean f665P;

    /* renamed from: Q */
    public CharSequence f666Q;

    /* renamed from: R */
    public CharSequence f667R;

    /* renamed from: S */
    public boolean f668S;

    /* renamed from: T */
    public boolean f669T;

    /* loaded from: classes.dex */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C0909z0();

        /* renamed from: b */
        public boolean f670b;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f670b = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f670b ? 1 : 0);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.preference.Preference
    /* renamed from: A */
    public void mo3254A(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        m3252M(m3284e(((Boolean) obj).booleanValue()));
    }

    @Override // androidx.preference.Preference
    /* renamed from: J */
    public boolean mo3253J() {
        return (this.f669T ? this.f665P : !this.f665P) || super.mo3253J();
    }

    /* renamed from: M */
    public void m3252M(boolean z) {
        boolean z2 = this.f665P != z;
        if (z2 || !this.f668S) {
            this.f665P = z;
            this.f668S = true;
            if (m3287K() && z != m3284e(!z)) {
                m3280i();
                SharedPreferences.Editor m1745b = this.f610c.m1745b();
                m1745b.putBoolean(this.f620m, z);
                if (!this.f610c.f3472e) {
                    m1745b.apply();
                }
            }
            if (z2) {
                mo3263n(mo3253J());
                mo3277m();
            }
        }
    }

    /* renamed from: N */
    public void m3251N(CharSequence charSequence) {
        this.f667R = charSequence;
        if (this.f665P) {
            return;
        }
        mo3277m();
    }

    /* renamed from: O */
    public void m3250O(CharSequence charSequence) {
        this.f666Q = charSequence;
        if (this.f665P) {
            mo3277m();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m3249P(View view) {
        CharSequence charSequence;
        int i;
        if (!(view instanceof TextView)) {
            return;
        }
        TextView textView = (TextView) view;
        boolean z = true;
        if (!this.f665P || TextUtils.isEmpty(this.f666Q)) {
            if (!this.f665P && !TextUtils.isEmpty(this.f667R)) {
                charSequence = this.f667R;
            }
            if (z) {
                CharSequence mo3279j = mo3279j();
                if (!TextUtils.isEmpty(mo3279j)) {
                    textView.setText(mo3279j);
                    z = false;
                }
            }
            i = z ? 8 : 0;
            if (i == textView.getVisibility()) {
                textView.setVisibility(i);
                return;
            }
            return;
        }
        charSequence = this.f666Q;
        textView.setText(charSequence);
        z = false;
        if (z) {
        }
        if (z) {
        }
        if (i == textView.getVisibility()) {
        }
    }

    /* renamed from: Q */
    public void m3248Q(C0881l0 c0881l0) {
        m3249P(c0881l0.m1743x(16908304));
    }

    @Override // androidx.preference.Preference
    /* renamed from: s */
    public void mo3247s() {
        boolean z = !this.f665P;
        m3285a(Boolean.valueOf(z));
        m3252M(z);
    }

    @Override // androidx.preference.Preference
    /* renamed from: v */
    public Object mo3246v(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
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
        m3252M(savedState.f670b);
    }

    @Override // androidx.preference.Preference
    /* renamed from: z */
    public Parcelable mo3244z() {
        Parcelable mo3244z = super.mo3244z();
        if (this.f627t) {
            return mo3244z;
        }
        SavedState savedState = new SavedState(mo3244z);
        savedState.f670b = this.f665P;
        return savedState;
    }
}