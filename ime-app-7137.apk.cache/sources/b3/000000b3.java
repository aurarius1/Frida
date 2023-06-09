package androidx.viewpager.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import p010b.p091z.p092a.C1121l;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* loaded from: classes.dex */
public class ViewPager$SavedState extends AbsSavedState {
    public static final Parcelable.Creator CREATOR = new C1121l();

    /* renamed from: d */
    public int f826d;

    /* renamed from: e */
    public Parcelable f827e;

    /* renamed from: f */
    public ClassLoader f828f;

    public ViewPager$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? ViewPager$SavedState.class.getClassLoader() : classLoader;
        this.f826d = parcel.readInt();
        this.f827e = parcel.readParcelable(classLoader);
        this.f828f = classLoader;
    }

    public ViewPager$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    public String toString() {
        StringBuilder m1187i = AbstractC1124a.m1187i("FragmentPager.SavedState{");
        m1187i.append(Integer.toHexString(System.identityHashCode(this)));
        m1187i.append(" position=");
        m1187i.append(this.f826d);
        m1187i.append("}");
        return m1187i.toString();
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f511c, i);
        parcel.writeInt(this.f826d);
        parcel.writeParcelable(this.f827e, i);
    }
}