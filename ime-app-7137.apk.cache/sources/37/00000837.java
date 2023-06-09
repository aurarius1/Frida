package p093c.p145g.p146a.p147a.p166r;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState;

/* renamed from: c.g.a.a.r.f */
/* loaded from: classes.dex */
public final class C1971f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new BottomNavigationPresenter$SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new BottomNavigationPresenter$SavedState[i];
    }
}