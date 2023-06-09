package android.support.p007v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;
import p000a.p001a.p002a.p004b.p005x.AbstractC0040o;
import p000a.p001a.p002a.p004b.p005x.C0042q;
import p000a.p001a.p002a.p004b.p005x.C0043r;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0042q();

    /* renamed from: b */
    public final int f101b;

    /* renamed from: c */
    public final long f102c;

    /* renamed from: d */
    public final long f103d;

    /* renamed from: e */
    public final float f104e;

    /* renamed from: f */
    public final long f105f;

    /* renamed from: g */
    public final int f106g;

    /* renamed from: h */
    public final CharSequence f107h;

    /* renamed from: i */
    public final long f108i;

    /* renamed from: j */
    public List f109j;

    /* renamed from: k */
    public final long f110k;

    /* renamed from: l */
    public final Bundle f111l;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    /* loaded from: classes.dex */
    public final class CustomAction implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C0043r();

        /* renamed from: b */
        public final String f112b;

        /* renamed from: c */
        public final CharSequence f113c;

        /* renamed from: d */
        public final int f114d;

        /* renamed from: e */
        public final Bundle f115e;

        public CustomAction(Parcel parcel) {
            this.f112b = parcel.readString();
            this.f113c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f114d = parcel.readInt();
            this.f115e = parcel.readBundle(AbstractC0040o.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder m1187i = AbstractC1124a.m1187i("Action:mName='");
            m1187i.append((Object) this.f113c);
            m1187i.append(", mIcon=");
            m1187i.append(this.f114d);
            m1187i.append(", mExtras=");
            m1187i.append(this.f115e);
            return m1187i.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f112b);
            TextUtils.writeToParcel(this.f113c, parcel, i);
            parcel.writeInt(this.f114d);
            parcel.writeBundle(this.f115e);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f101b = parcel.readInt();
        this.f102c = parcel.readLong();
        this.f104e = parcel.readFloat();
        this.f108i = parcel.readLong();
        this.f103d = parcel.readLong();
        this.f105f = parcel.readLong();
        this.f107h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f109j = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f110k = parcel.readLong();
        this.f111l = parcel.readBundle(AbstractC0040o.class.getClassLoader());
        this.f106g = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f101b + ", position=" + this.f102c + ", buffered position=" + this.f103d + ", speed=" + this.f104e + ", updated=" + this.f108i + ", actions=" + this.f105f + ", error code=" + this.f106g + ", error message=" + this.f107h + ", custom actions=" + this.f109j + ", active item id=" + this.f110k + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f101b);
        parcel.writeLong(this.f102c);
        parcel.writeFloat(this.f104e);
        parcel.writeLong(this.f108i);
        parcel.writeLong(this.f103d);
        parcel.writeLong(this.f105f);
        TextUtils.writeToParcel(this.f107h, parcel, i);
        parcel.writeTypedList(this.f109j);
        parcel.writeLong(this.f110k);
        parcel.writeBundle(this.f111l);
        parcel.writeInt(this.f106g);
    }
}