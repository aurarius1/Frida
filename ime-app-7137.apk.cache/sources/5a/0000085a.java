package p093c.p145g.p146a.p147a.p171w;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.Month;

/* renamed from: c.g.a.a.w.a0 */
/* loaded from: classes.dex */
public final class C2006a0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return Month.m283l(parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new Month[i];
    }
}