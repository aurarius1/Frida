package p093c.p145g.p146a.p147a.p162n;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;

/* renamed from: c.g.a.a.n.a */
/* loaded from: classes.dex */
public final class C1951a implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new AppBarLayout$BaseBehavior.SavedState(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AppBarLayout$BaseBehavior.SavedState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new AppBarLayout$BaseBehavior.SavedState(parcel, classLoader);
    }
}