package p000a.p001a.p002a.p004b.p005x;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.p007v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import p000a.p001a.p002a.p004b.p005x.C0038m;

/* renamed from: a.a.a.b.x.m */
/* loaded from: classes.dex */
public final class C0038m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(final Parcel parcel) {
        return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper
            public static final Parcelable.Creator CREATOR = new C0038m();

            /* renamed from: b */
            public ResultReceiver f93b;

            {
                this.f93b = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel2, int i) {
                this.f93b.writeToParcel(parcel2, i);
            }
        };
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new MediaSessionCompat$ResultReceiverWrapper[i];
    }
}