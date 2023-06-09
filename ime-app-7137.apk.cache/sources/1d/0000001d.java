package p000a.p001a.p002a.p004b.p005x;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.p007v4.media.MediaMetadataCompat;
import android.support.p007v4.media.session.MediaSessionCompat$QueueItem;
import android.support.p007v4.media.session.ParcelableVolumeInfo;
import android.support.p007v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import java.lang.ref.WeakReference;

/* renamed from: a.a.a.b.x.d */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0029d extends Binder implements IInterface {

    /* renamed from: a */
    public final WeakReference f65a;

    public AbstractBinderC0029d() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.f65a = new WeakReference(null);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1598968902) {
            switch (i) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    if (((AbstractC0030e) this.f65a.get()) == null) {
                        return true;
                    }
                    throw null;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    throw new AssertionError();
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        PlaybackStateCompat playbackStateCompat = (PlaybackStateCompat) PlaybackStateCompat.CREATOR.createFromParcel(parcel);
                    }
                    if (((AbstractC0030e) this.f65a.get()) == null) {
                        return true;
                    }
                    throw null;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat) MediaMetadataCompat.CREATOR.createFromParcel(parcel);
                    }
                    throw new AssertionError();
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR);
                    throw new AssertionError();
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                    }
                    throw new AssertionError();
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        Bundle bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    throw new AssertionError();
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcel.readInt() != 0) {
                        ParcelableVolumeInfo parcelableVolumeInfo = (ParcelableVolumeInfo) ParcelableVolumeInfo.CREATOR.createFromParcel(parcel);
                    }
                    throw new AssertionError();
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readInt();
                    if (((AbstractC0030e) this.f65a.get()) == null) {
                        return true;
                    }
                    throw null;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readInt();
                    return true;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readInt();
                    if (((AbstractC0030e) this.f65a.get()) == null) {
                        return true;
                    }
                    throw null;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    parcel.readInt();
                    if (((AbstractC0030e) this.f65a.get()) == null) {
                        return true;
                    }
                    throw null;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (((AbstractC0030e) this.f65a.get()) == null) {
                        return true;
                    }
                    throw null;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
        parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
        return true;
    }
}