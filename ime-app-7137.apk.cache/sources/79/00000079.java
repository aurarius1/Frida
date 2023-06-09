package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p010b.p067m.p068d.C0674b1;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class FragmentManager$LaunchedFragmentInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0674b1();

    /* renamed from: b */
    public String f527b;

    /* renamed from: c */
    public int f528c;

    public FragmentManager$LaunchedFragmentInfo(Parcel parcel) {
        this.f527b = parcel.readString();
        this.f528c = parcel.readInt();
    }

    public FragmentManager$LaunchedFragmentInfo(String str, int i) {
        this.f527b = str;
        this.f528c = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f527b);
        parcel.writeInt(this.f528c);
    }
}