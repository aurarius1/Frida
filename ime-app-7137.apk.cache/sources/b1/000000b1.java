package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p010b.p090y.C1106a;
import p010b.p090y.C1108c;
import p010b.p090y.InterfaceC1109d;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1106a();

    /* renamed from: b */
    public final InterfaceC1109d f825b;

    public ParcelImpl(Parcel parcel) {
        this.f825b = new C1108c(parcel).m1227k();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        new C1108c(parcel).m1224o(this.f825b);
    }
}