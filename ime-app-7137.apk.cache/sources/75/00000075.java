package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;
import p010b.p067m.p068d.C0668a;
import p010b.p067m.p068d.C0672b;
import p010b.p067m.p068d.C0726o1;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0672b();

    /* renamed from: b */
    public final int[] f512b;

    /* renamed from: c */
    public final ArrayList f513c;

    /* renamed from: d */
    public final int[] f514d;

    /* renamed from: e */
    public final int[] f515e;

    /* renamed from: f */
    public final int f516f;

    /* renamed from: g */
    public final String f517g;

    /* renamed from: h */
    public final int f518h;

    /* renamed from: i */
    public final int f519i;

    /* renamed from: j */
    public final CharSequence f520j;

    /* renamed from: k */
    public final int f521k;

    /* renamed from: l */
    public final CharSequence f522l;

    /* renamed from: m */
    public final ArrayList f523m;

    /* renamed from: n */
    public final ArrayList f524n;

    /* renamed from: o */
    public final boolean f525o;

    public BackStackState(Parcel parcel) {
        this.f512b = parcel.createIntArray();
        this.f513c = parcel.createStringArrayList();
        this.f514d = parcel.createIntArray();
        this.f515e = parcel.createIntArray();
        this.f516f = parcel.readInt();
        this.f517g = parcel.readString();
        this.f518h = parcel.readInt();
        this.f519i = parcel.readInt();
        this.f520j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f521k = parcel.readInt();
        this.f522l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f523m = parcel.createStringArrayList();
        this.f524n = parcel.createStringArrayList();
        this.f525o = parcel.readInt() != 0;
    }

    public BackStackState(C0668a c0668a) {
        int size = c0668a.f2897a.size();
        this.f512b = new int[size * 5];
        if (!c0668a.f2903g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f513c = new ArrayList(size);
        this.f514d = new int[size];
        this.f515e = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            C0726o1 c0726o1 = (C0726o1) c0668a.f2897a.get(i);
            int i3 = i2 + 1;
            this.f512b[i2] = c0726o1.f3079a;
            ArrayList arrayList = this.f513c;
            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = c0726o1.f3080b;
            arrayList.add(abstractComponentCallbacksC0763z != null ? abstractComponentCallbacksC0763z.f3235h : null);
            int[] iArr = this.f512b;
            int i4 = i3 + 1;
            iArr[i3] = c0726o1.f3081c;
            int i5 = i4 + 1;
            iArr[i4] = c0726o1.f3082d;
            int i6 = i5 + 1;
            iArr[i5] = c0726o1.f3083e;
            iArr[i6] = c0726o1.f3084f;
            this.f514d[i] = c0726o1.f3085g.ordinal();
            this.f515e[i] = c0726o1.f3086h.ordinal();
            i++;
            i2 = i6 + 1;
        }
        this.f516f = c0668a.f2902f;
        this.f517g = c0668a.f2905i;
        this.f518h = c0668a.f2915s;
        this.f519i = c0668a.f2906j;
        this.f520j = c0668a.f2907k;
        this.f521k = c0668a.f2908l;
        this.f522l = c0668a.f2909m;
        this.f523m = c0668a.f2910n;
        this.f524n = c0668a.f2911o;
        this.f525o = c0668a.f2912p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f512b);
        parcel.writeStringList(this.f513c);
        parcel.writeIntArray(this.f514d);
        parcel.writeIntArray(this.f515e);
        parcel.writeInt(this.f516f);
        parcel.writeString(this.f517g);
        parcel.writeInt(this.f518h);
        parcel.writeInt(this.f519i);
        TextUtils.writeToParcel(this.f520j, parcel, 0);
        parcel.writeInt(this.f521k);
        TextUtils.writeToParcel(this.f522l, parcel, 0);
        parcel.writeStringList(this.f523m);
        parcel.writeStringList(this.f524n);
        parcel.writeInt(this.f525o ? 1 : 0);
    }
}