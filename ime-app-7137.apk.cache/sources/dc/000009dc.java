package p204f.p205a.p206a.p207a;

import android.os.Parcel;
import android.os.Parcelable;
import net.evendanan.chauffeur.lib.SimpleTransitionExperience;

/* renamed from: f.a.a.a.b */
/* loaded from: classes.dex */
public final class C2287b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new SimpleTransitionExperience(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new SimpleTransitionExperience[i];
    }
}