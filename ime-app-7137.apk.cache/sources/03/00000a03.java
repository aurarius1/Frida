package net.evendanan.chauffeur.lib.experiences;

import android.os.Parcel;
import android.os.Parcelable;
import com.anysoftkeyboard.p180ui.settings.BasicAnyActivity;
import net.evendanan.chauffeur.lib.SimpleTransitionExperience;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;
import p010b.p067m.p068d.C0668a;
import p010b.p067m.p068d.C0682d1;
import p010b.p067m.p068d.C0690f1;
import p204f.p205a.p206a.p207a.AbstractC2286a;
import p204f.p205a.p206a.p207a.p208c.C2288a;

/* loaded from: classes.dex */
public class RootFragmentTransitionExperience extends SimpleTransitionExperience implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2288a();

    public RootFragmentTransitionExperience() {
        super(AbstractC2286a.ui_context_root_add_in, AbstractC2286a.ui_context_root_add_out, AbstractC2286a.ui_context_root_pop_in, AbstractC2286a.ui_context_fade_out);
    }

    public RootFragmentTransitionExperience(Parcel parcel) {
        super(parcel);
    }

    @Override // net.evendanan.chauffeur.lib.SimpleTransitionExperience, net.evendanan.chauffeur.lib.TransitionExperience
    /* renamed from: d */
    public void mo4d(BasicAnyActivity basicAnyActivity, AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z, C0668a c0668a, int i) {
        c0668a.m2110n(i, abstractComponentCallbacksC0763z);
        c0668a.m2121c("FragmentChauffeur_ROOT_FRAGMENT_TAG");
    }

    @Override // net.evendanan.chauffeur.lib.SimpleTransitionExperience, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // net.evendanan.chauffeur.lib.SimpleTransitionExperience, net.evendanan.chauffeur.lib.TransitionExperience
    /* renamed from: i */
    public void mo3i(BasicAnyActivity basicAnyActivity, AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        C0690f1 m2102l = basicAnyActivity.m2102l();
        m2102l.m2094C(new C0682d1(m2102l, "FragmentChauffeur_ROOT_FRAGMENT_TAG", -1, 1), false);
    }

    @Override // net.evendanan.chauffeur.lib.SimpleTransitionExperience, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7474b);
        parcel.writeInt(this.f7475c);
        parcel.writeInt(this.f7476d);
        parcel.writeInt(this.f7477e);
    }
}