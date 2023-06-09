package p093c.p135c;

import android.os.Parcel;
import android.os.Parcelable;
import com.astuetz.PagerSlidingTabStrip;

/* renamed from: c.c.f */
/* loaded from: classes.dex */
public final class C1774f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new PagerSlidingTabStrip.SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new PagerSlidingTabStrip.SavedState[i];
    }
}