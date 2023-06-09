package p000a.p001a.p002a.p006c;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p007v4.p008os.ResultReceiver;

/* renamed from: a.a.a.c.c */
/* loaded from: classes.dex */
public class C0046c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new ResultReceiver(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new ResultReceiver[i];
    }
}