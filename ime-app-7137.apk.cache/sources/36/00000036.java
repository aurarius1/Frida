package android.support.p007v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p000a.p001a.p002a.p004b.C0023u;

/* renamed from: android.support.v4.media.MediaDescriptionCompat */
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0023u();

    /* renamed from: b */
    public final String f77b;

    /* renamed from: c */
    public final CharSequence f78c;

    /* renamed from: d */
    public final CharSequence f79d;

    /* renamed from: e */
    public final CharSequence f80e;

    /* renamed from: f */
    public final Bitmap f81f;

    /* renamed from: g */
    public final Uri f82g;

    /* renamed from: h */
    public final Bundle f83h;

    /* renamed from: i */
    public final Uri f84i;

    /* renamed from: j */
    public Object f85j;

    public MediaDescriptionCompat(Parcel parcel) {
        this.f77b = parcel.readString();
        this.f78c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f79d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f80e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f81f = (Bitmap) parcel.readParcelable(classLoader);
        this.f82g = (Uri) parcel.readParcelable(classLoader);
        this.f83h = parcel.readBundle(classLoader);
        this.f84i = (Uri) parcel.readParcelable(classLoader);
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f77b = str;
        this.f78c = charSequence;
        this.f79d = charSequence2;
        this.f80e = charSequence3;
        this.f81f = bitmap;
        this.f82g = uri;
        this.f83h = bundle;
        this.f84i = uri2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f78c) + ", " + ((Object) this.f79d) + ", " + ((Object) this.f80e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 21) {
            parcel.writeString(this.f77b);
            TextUtils.writeToParcel(this.f78c, parcel, i);
            TextUtils.writeToParcel(this.f79d, parcel, i);
            TextUtils.writeToParcel(this.f80e, parcel, i);
            parcel.writeParcelable(this.f81f, i);
            parcel.writeParcelable(this.f82g, i);
            parcel.writeBundle(this.f83h);
            parcel.writeParcelable(this.f84i, i);
            return;
        }
        Object obj = this.f85j;
        if (obj == null && i2 >= 21) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f77b);
            builder.setTitle(this.f78c);
            builder.setSubtitle(this.f79d);
            builder.setDescription(this.f80e);
            builder.setIconBitmap(this.f81f);
            builder.setIconUri(this.f82g);
            Bundle bundle = this.f83h;
            if (i2 < 23 && this.f84i != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f84i);
            }
            builder.setExtras(bundle);
            if (i2 >= 23) {
                builder.setMediaUri(this.f84i);
            }
            obj = builder.build();
            this.f85j = obj;
        }
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }
}