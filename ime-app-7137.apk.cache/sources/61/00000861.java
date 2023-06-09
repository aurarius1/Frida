package p093c.p145g.p146a.p147a.p171w;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.DateValidatorPointForward;

/* renamed from: c.g.a.a.w.e */
/* loaded from: classes.dex */
public final class C2013e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new DateValidatorPointForward(parcel.readLong(), null);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new DateValidatorPointForward[i];
    }
}