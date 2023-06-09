package p010b.p091z.p092a;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.viewpager.widget.ViewPager$SavedState;

/* renamed from: b.z.a.l */
/* loaded from: classes.dex */
public final class C1121l implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new ViewPager$SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new ViewPager$SavedState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ViewPager$SavedState(parcel, classLoader);
    }
}