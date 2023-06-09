package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;
import p010b.p067m.p068d.C0710k1;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class FragmentState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0710k1();

    /* renamed from: b */
    public final String f537b;

    /* renamed from: c */
    public final String f538c;

    /* renamed from: d */
    public final boolean f539d;

    /* renamed from: e */
    public final int f540e;

    /* renamed from: f */
    public final int f541f;

    /* renamed from: g */
    public final String f542g;

    /* renamed from: h */
    public final boolean f543h;

    /* renamed from: i */
    public final boolean f544i;

    /* renamed from: j */
    public final boolean f545j;

    /* renamed from: k */
    public final Bundle f546k;

    /* renamed from: l */
    public final boolean f547l;

    /* renamed from: m */
    public final int f548m;

    /* renamed from: n */
    public Bundle f549n;

    public FragmentState(Parcel parcel) {
        this.f537b = parcel.readString();
        this.f538c = parcel.readString();
        this.f539d = parcel.readInt() != 0;
        this.f540e = parcel.readInt();
        this.f541f = parcel.readInt();
        this.f542g = parcel.readString();
        this.f543h = parcel.readInt() != 0;
        this.f544i = parcel.readInt() != 0;
        this.f545j = parcel.readInt() != 0;
        this.f546k = parcel.readBundle();
        this.f547l = parcel.readInt() != 0;
        this.f549n = parcel.readBundle();
        this.f548m = parcel.readInt();
    }

    public FragmentState(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        this.f537b = abstractComponentCallbacksC0763z.getClass().getName();
        this.f538c = abstractComponentCallbacksC0763z.f3235h;
        this.f539d = abstractComponentCallbacksC0763z.f3243p;
        this.f540e = abstractComponentCallbacksC0763z.f3252y;
        this.f541f = abstractComponentCallbacksC0763z.f3253z;
        this.f542g = abstractComponentCallbacksC0763z.f3208A;
        this.f543h = abstractComponentCallbacksC0763z.f3211D;
        this.f544i = abstractComponentCallbacksC0763z.f3242o;
        this.f545j = abstractComponentCallbacksC0763z.f3210C;
        this.f546k = abstractComponentCallbacksC0763z.f3236i;
        this.f547l = abstractComponentCallbacksC0763z.f3209B;
        this.f548m = abstractComponentCallbacksC0763z.f3224Q.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f537b);
        sb.append(" (");
        sb.append(this.f538c);
        sb.append(")}:");
        if (this.f539d) {
            sb.append(" fromLayout");
        }
        if (this.f541f != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f541f));
        }
        String str = this.f542g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f542g);
        }
        if (this.f543h) {
            sb.append(" retainInstance");
        }
        if (this.f544i) {
            sb.append(" removing");
        }
        if (this.f545j) {
            sb.append(" detached");
        }
        if (this.f547l) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f537b);
        parcel.writeString(this.f538c);
        parcel.writeInt(this.f539d ? 1 : 0);
        parcel.writeInt(this.f540e);
        parcel.writeInt(this.f541f);
        parcel.writeString(this.f542g);
        parcel.writeInt(this.f543h ? 1 : 0);
        parcel.writeInt(this.f544i ? 1 : 0);
        parcel.writeInt(this.f545j ? 1 : 0);
        parcel.writeBundle(this.f546k);
        parcel.writeInt(this.f547l ? 1 : 0);
        parcel.writeBundle(this.f549n);
        parcel.writeInt(this.f548m);
    }
}