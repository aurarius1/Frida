package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;
import p010b.p064l.p065a.C0655a;

/* loaded from: classes.dex */
public abstract class AbsSavedState implements Parcelable {

    /* renamed from: c */
    public final Parcelable f511c;

    /* renamed from: b */
    public static final AbsSavedState f510b = new AbsSavedState() { // from class: androidx.customview.view.AbsSavedState.1
    };
    public static final Parcelable.Creator CREATOR = new C0655a();

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f511c = readParcelable == null ? f510b : readParcelable;
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f511c = parcelable == f510b ? null : parcelable;
    }

    public AbsSavedState(C00491 c00491) {
        this.f511c = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f511c, i);
    }
}