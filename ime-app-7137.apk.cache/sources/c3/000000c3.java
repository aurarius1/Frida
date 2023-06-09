package p010b.p011a.p013l;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;

/* renamed from: b.a.l.a */
/* loaded from: classes.dex */
public class C0063a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new ActivityResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new ActivityResult[i];
    }
}