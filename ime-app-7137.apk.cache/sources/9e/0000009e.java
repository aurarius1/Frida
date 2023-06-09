package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;
import p010b.p082t.AbstractC0883m0;
import p010b.p082t.AbstractC0889p0;
import p010b.p082t.AbstractC0897t0;
import p010b.p082t.C0881l0;
import p010b.p082t.C0899u0;
import p010b.p082t.C0903w0;
import p010b.p082t.View$OnKeyListenerC0901v0;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: P */
    public int f644P;

    /* renamed from: Q */
    public int f645Q;

    /* renamed from: R */
    public int f646R;

    /* renamed from: S */
    public int f647S;

    /* renamed from: T */
    public boolean f648T;

    /* renamed from: U */
    public SeekBar f649U;

    /* renamed from: V */
    public TextView f650V;

    /* renamed from: W */
    public boolean f651W;

    /* renamed from: X */
    public boolean f652X;

    /* renamed from: Y */
    public boolean f653Y;

    /* renamed from: Z */
    public SeekBar.OnSeekBarChangeListener f654Z;

    /* renamed from: a0 */
    public View.OnKeyListener f655a0;

    /* loaded from: classes.dex */
    public class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C0903w0();

        /* renamed from: b */
        public int f656b;

        /* renamed from: c */
        public int f657c;

        /* renamed from: d */
        public int f658d;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f656b = parcel.readInt();
            this.f657c = parcel.readInt();
            this.f658d = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f656b);
            parcel.writeInt(this.f657c);
            parcel.writeInt(this.f658d);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0, 0);
        int i = AbstractC0883m0.seekBarPreferenceStyle;
        this.f654Z = new C0899u0(this);
        this.f655a0 = new View$OnKeyListenerC0901v0(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0897t0.SeekBarPreference, i, 0);
        this.f645Q = obtainStyledAttributes.getInt(AbstractC0897t0.SeekBarPreference_min, 0);
        int i2 = obtainStyledAttributes.getInt(AbstractC0897t0.SeekBarPreference_android_max, 100);
        int i3 = this.f645Q;
        i2 = i2 < i3 ? i3 : i2;
        if (i2 != this.f646R) {
            this.f646R = i2;
            mo3277m();
        }
        int i4 = obtainStyledAttributes.getInt(AbstractC0897t0.SeekBarPreference_seekBarIncrement, 0);
        if (i4 != this.f647S) {
            this.f647S = Math.min(this.f646R - this.f645Q, Math.abs(i4));
            mo3277m();
        }
        this.f651W = obtainStyledAttributes.getBoolean(AbstractC0897t0.SeekBarPreference_adjustable, true);
        this.f652X = obtainStyledAttributes.getBoolean(AbstractC0897t0.SeekBarPreference_showSeekBarValue, false);
        this.f653Y = obtainStyledAttributes.getBoolean(AbstractC0897t0.SeekBarPreference_updatesContinuously, false);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* renamed from: A */
    public void mo3254A(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        m3260M(m3283f(((Integer) obj).intValue()), true);
    }

    /* renamed from: M */
    public final void m3260M(int i, boolean z) {
        int i2 = this.f645Q;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.f646R;
        if (i > i3) {
            i = i3;
        }
        if (i != this.f644P) {
            this.f644P = i;
            m3258O(i);
            m3293D(i);
            if (z) {
                mo3277m();
            }
        }
    }

    /* renamed from: N */
    public void m3259N(SeekBar seekBar) {
        int progress = seekBar.getProgress() + this.f645Q;
        if (progress != this.f644P) {
            m3285a(Integer.valueOf(progress));
            m3260M(progress, false);
        }
    }

    /* renamed from: O */
    public void m3258O(int i) {
        TextView textView = this.f650V;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    @Override // androidx.preference.Preference
    /* renamed from: r */
    public void mo0r(C0881l0 c0881l0) {
        super.mo0r(c0881l0);
        c0881l0.f3605c.setOnKeyListener(this.f655a0);
        this.f649U = (SeekBar) c0881l0.m1743x(AbstractC0889p0.seekbar);
        TextView textView = (TextView) c0881l0.m1743x(AbstractC0889p0.seekbar_value);
        this.f650V = textView;
        if (this.f652X) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.f650V = null;
        }
        SeekBar seekBar = this.f649U;
        if (seekBar == null) {
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.f654Z);
        this.f649U.setMax(this.f646R - this.f645Q);
        int i = this.f647S;
        if (i != 0) {
            this.f649U.setKeyProgressIncrement(i);
        } else {
            this.f647S = this.f649U.getKeyProgressIncrement();
        }
        this.f649U.setProgress(this.f644P - this.f645Q);
        m3258O(this.f644P);
        this.f649U.setEnabled(mo3272l());
    }

    @Override // androidx.preference.Preference
    /* renamed from: v */
    public Object mo3246v(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
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
        this.f644P = savedState.f656b;
        this.f645Q = savedState.f657c;
        this.f646R = savedState.f658d;
        mo3277m();
    }

    @Override // androidx.preference.Preference
    /* renamed from: z */
    public Parcelable mo3244z() {
        Parcelable mo3244z = super.mo3244z();
        if (this.f627t) {
            return mo3244z;
        }
        SavedState savedState = new SavedState(mo3244z);
        savedState.f656b = this.f644P;
        savedState.f657c = this.f645Q;
        savedState.f658d = this.f646R;
        return savedState;
    }
}