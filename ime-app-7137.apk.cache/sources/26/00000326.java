package p010b.p067m.p068d;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager$LaunchedFragmentInfo;

/* renamed from: b.m.d.b1 */
/* loaded from: classes.dex */
public class C0674b1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new FragmentManager$LaunchedFragmentInfo(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new FragmentManager$LaunchedFragmentInfo[i];
    }
}