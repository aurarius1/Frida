package p010b.p011a.p013l;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.IntentSenderRequest;

/* renamed from: b.a.l.g */
/* loaded from: classes.dex */
public class C0069g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new IntentSenderRequest(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new IntentSenderRequest[i];
    }
}