package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p010b.p011a.p013l.C0063a;
import p093c.p094a.p095a.p096a.AbstractC1124a;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0063a();

    /* renamed from: b */
    public final int f129b;

    /* renamed from: c */
    public final Intent f130c;

    public ActivityResult(int i, Intent intent) {
        this.f129b = i;
        this.f130c = intent;
    }

    public ActivityResult(Parcel parcel) {
        this.f129b = parcel.readInt();
        this.f130c = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        String str;
        StringBuilder m1187i = AbstractC1124a.m1187i("ActivityResult{resultCode=");
        int i = this.f129b;
        if (i != -1) {
            str = i != 0 ? String.valueOf(i) : "RESULT_CANCELED";
        } else {
            str = "RESULT_OK";
        }
        m1187i.append(str);
        m1187i.append(", data=");
        m1187i.append(this.f130c);
        m1187i.append('}');
        return m1187i.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f129b);
        parcel.writeInt(this.f130c == null ? 0 : 1);
        Intent intent = this.f130c;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}