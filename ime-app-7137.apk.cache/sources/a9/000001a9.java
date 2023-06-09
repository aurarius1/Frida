package p010b.p016c.p026q;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.ActionMenuPresenter$SavedState;

/* renamed from: b.c.q.p */
/* loaded from: classes.dex */
public class C0293p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new ActionMenuPresenter$SavedState(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new ActionMenuPresenter$SavedState[i];
    }
}