package android.support.p007v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import p000a.p001a.p002a.p004b.p005x.C0041p;

/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0041p();

    /* renamed from: b */
    public int f96b;

    /* renamed from: c */
    public int f97c;

    /* renamed from: d */
    public int f98d;

    /* renamed from: e */
    public int f99e;

    /* renamed from: f */
    public int f100f;

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f96b = parcel.readInt();
        this.f98d = parcel.readInt();
        this.f99e = parcel.readInt();
        this.f100f = parcel.readInt();
        this.f97c = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f96b);
        parcel.writeInt(this.f98d);
        parcel.writeInt(this.f99e);
        parcel.writeInt(this.f100f);
        parcel.writeInt(this.f97c);
    }
}