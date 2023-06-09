package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import p010b.p011a.p013l.C0069g;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0069g();

    /* renamed from: b */
    public final IntentSender f131b;

    /* renamed from: c */
    public final Intent f132c;

    /* renamed from: d */
    public final int f133d;

    /* renamed from: e */
    public final int f134e;

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f131b = intentSender;
        this.f132c = intent;
        this.f133d = i;
        this.f134e = i2;
    }

    public IntentSenderRequest(Parcel parcel) {
        this.f131b = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f132c = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f133d = parcel.readInt();
        this.f134e = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f131b, i);
        parcel.writeParcelable(this.f132c, i);
        parcel.writeInt(this.f133d);
        parcel.writeInt(this.f134e);
    }
}