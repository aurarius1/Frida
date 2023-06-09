package android.support.p007v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import p000a.p001a.p002a.p004b.C0025w;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: android.support.v4.media.RatingCompat */
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0025w();

    /* renamed from: b */
    public final int f88b;

    /* renamed from: c */
    public final float f89c;

    public RatingCompat(int i, float f) {
        this.f88b = i;
        this.f89c = f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f88b;
    }

    public String toString() {
        StringBuilder m1187i = AbstractC1124a.m1187i("Rating:style=");
        m1187i.append(this.f88b);
        m1187i.append(" rating=");
        float f = this.f89c;
        m1187i.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return m1187i.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f88b);
        parcel.writeFloat(this.f89c);
    }
}