package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p010b.p016c.p026q.C0339y0;

/* loaded from: classes.dex */
public class AppCompatSpinner$SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C0339y0();

    /* renamed from: b */
    public boolean f243b;

    public AppCompatSpinner$SavedState(Parcel parcel) {
        super(parcel);
        this.f243b = parcel.readByte() != 0;
    }

    public AppCompatSpinner$SavedState(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f243b ? (byte) 1 : (byte) 0);
    }
}