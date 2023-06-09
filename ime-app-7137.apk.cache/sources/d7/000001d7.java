package p010b.p016c.p026q;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.AppCompatSpinner$SavedState;

/* renamed from: b.c.q.y0 */
/* loaded from: classes.dex */
public class C0339y0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new AppCompatSpinner$SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AppCompatSpinner$SavedState[i];
    }
}