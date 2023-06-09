package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p010b.p067m.p068d.C0694g1;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0694g1();

    /* renamed from: b */
    public ArrayList f529b;

    /* renamed from: c */
    public ArrayList f530c;

    /* renamed from: d */
    public BackStackState[] f531d;

    /* renamed from: e */
    public int f532e;

    /* renamed from: f */
    public String f533f;

    /* renamed from: g */
    public ArrayList f534g;

    /* renamed from: h */
    public ArrayList f535h;

    /* renamed from: i */
    public ArrayList f536i;

    public FragmentManagerState() {
        this.f533f = null;
        this.f534g = new ArrayList();
        this.f535h = new ArrayList();
    }

    public FragmentManagerState(Parcel parcel) {
        this.f533f = null;
        this.f534g = new ArrayList();
        this.f535h = new ArrayList();
        this.f529b = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.f530c = parcel.createStringArrayList();
        this.f531d = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f532e = parcel.readInt();
        this.f533f = parcel.readString();
        this.f534g = parcel.createStringArrayList();
        this.f535h = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f536i = parcel.createTypedArrayList(FragmentManager$LaunchedFragmentInfo.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f529b);
        parcel.writeStringList(this.f530c);
        parcel.writeTypedArray(this.f531d, i);
        parcel.writeInt(this.f532e);
        parcel.writeString(this.f533f);
        parcel.writeStringList(this.f534g);
        parcel.writeTypedList(this.f535h);
        parcel.writeTypedList(this.f536i);
    }
}