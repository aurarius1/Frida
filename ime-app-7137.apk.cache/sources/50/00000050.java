package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p010b.p016c.p026q.C0293p;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ActionMenuPresenter$SavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0293p();

    /* renamed from: b */
    public int f229b;

    public ActionMenuPresenter$SavedState() {
    }

    public ActionMenuPresenter$SavedState(Parcel parcel) {
        this.f229b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f229b);
    }
}