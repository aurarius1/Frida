package com.google.android.material.bottomnavigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.ParcelableSparseArray;
import p093c.p145g.p146a.p147a.p166r.C1971f;

/* loaded from: classes.dex */
public class BottomNavigationPresenter$SavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1971f();

    /* renamed from: b */
    public int f6678b;

    /* renamed from: c */
    public ParcelableSparseArray f6679c;

    public BottomNavigationPresenter$SavedState() {
    }

    public BottomNavigationPresenter$SavedState(Parcel parcel) {
        this.f6678b = parcel.readInt();
        this.f6679c = (ParcelableSparseArray) parcel.readParcelable(BottomNavigationPresenter$SavedState.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f6678b);
        parcel.writeParcelable(this.f6679c, 0);
    }
}