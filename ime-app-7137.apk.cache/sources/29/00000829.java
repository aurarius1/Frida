package p093c.p145g.p146a.p147a.p163o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.badge.BadgeDrawable$SavedState;

/* renamed from: c.g.a.a.o.b */
/* loaded from: classes.dex */
public final class C1957b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new BadgeDrawable$SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new BadgeDrawable$SavedState[i];
    }
}