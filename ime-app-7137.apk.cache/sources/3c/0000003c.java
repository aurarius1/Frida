package android.support.p007v4.media.session;

import android.media.session.MediaSession;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p000a.p001a.p002a.p004b.p005x.C0039n;
import p000a.p001a.p002a.p004b.p005x.InterfaceC0028c;

/* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
/* loaded from: classes.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0039n();

    /* renamed from: b */
    public final Object f94b;

    /* renamed from: c */
    public InterfaceC0028c f95c;

    public MediaSessionCompat$Token(Object obj) {
        this.f94b = obj;
        this.f95c = null;
    }

    /* renamed from: k */
    public static MediaSessionCompat$Token m3454k(Object obj, InterfaceC0028c interfaceC0028c) {
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (obj instanceof MediaSession.Token) {
            return new MediaSessionCompat$Token(obj, interfaceC0028c);
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaSessionCompat$Token) {
            Object obj2 = this.f94b;
            Object obj3 = ((MediaSessionCompat$Token) obj).f94b;
            if (obj2 == null) {
                return obj3 == null;
            } else if (obj3 == null) {
                return false;
            } else {
                return obj2.equals(obj3);
            }
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f94b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            parcel.writeParcelable((Parcelable) this.f94b, i);
        } else {
            parcel.writeStrongBinder((IBinder) this.f94b);
        }
    }

    public MediaSessionCompat$Token(Object obj, InterfaceC0028c interfaceC0028c) {
        this.f94b = obj;
        this.f95c = interfaceC0028c;
    }
}