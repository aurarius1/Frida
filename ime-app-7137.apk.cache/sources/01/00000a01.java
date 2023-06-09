package net.evendanan.chauffeur.lib;

import android.os.Parcel;
import android.os.Parcelable;
import com.anysoftkeyboard.p180ui.settings.BasicAnyActivity;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;
import p010b.p067m.p068d.C0668a;
import p204f.p205a.p206a.p207a.C2287b;

/* loaded from: classes.dex */
public class SimpleTransitionExperience implements TransitionExperience, Parcelable {
    public static final Parcelable.Creator CREATOR = new C2287b();

    /* renamed from: b */
    public final int f7474b;

    /* renamed from: c */
    public final int f7475c;

    /* renamed from: d */
    public final int f7476d;

    /* renamed from: e */
    public final int f7477e;

    public SimpleTransitionExperience(int i, int i2, int i3, int i4) {
        this.f7474b = i;
        this.f7475c = i2;
        this.f7476d = i3;
        this.f7477e = i4;
    }

    public SimpleTransitionExperience(Parcel parcel) {
        this.f7474b = parcel.readInt();
        this.f7475c = parcel.readInt();
        this.f7476d = parcel.readInt();
        this.f7477e = parcel.readInt();
    }

    @Override // net.evendanan.chauffeur.lib.TransitionExperience
    /* renamed from: d */
    public void mo4d(BasicAnyActivity basicAnyActivity, AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z, C0668a c0668a, int i) {
        c0668a.m2110n(i, abstractComponentCallbacksC0763z);
        c0668a.m2121c(null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // net.evendanan.chauffeur.lib.TransitionExperience
    /* renamed from: i */
    public void mo3i(BasicAnyActivity basicAnyActivity, AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7474b);
        parcel.writeInt(this.f7475c);
        parcel.writeInt(this.f7476d);
        parcel.writeInt(this.f7477e);
    }
}