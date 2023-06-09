package p204f.p205a.p206a.p207a.p208c;

import android.os.Parcel;
import android.os.Parcelable;
import net.evendanan.chauffeur.lib.experiences.RootFragmentTransitionExperience;

/* renamed from: f.a.a.a.c.a */
/* loaded from: classes.dex */
public final class C2288a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new RootFragmentTransitionExperience(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new RootFragmentTransitionExperience[i];
    }
}