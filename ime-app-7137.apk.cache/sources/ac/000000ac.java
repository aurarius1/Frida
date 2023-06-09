package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p010b.p083u.p084e.C0969n2;
import p093c.p094a.p095a.p096a.AbstractC1124a;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0969n2();

    /* renamed from: b */
    public int f819b;

    /* renamed from: c */
    public int f820c;

    /* renamed from: d */
    public int[] f821d;

    /* renamed from: e */
    public boolean f822e;

    public StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(Parcel parcel) {
        this.f819b = parcel.readInt();
        this.f820c = parcel.readInt();
        this.f822e = parcel.readInt() == 1;
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.f821d = iArr;
            parcel.readIntArray(iArr);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder m1187i = AbstractC1124a.m1187i("FullSpanItem{mPosition=");
        m1187i.append(this.f819b);
        m1187i.append(", mGapDir=");
        m1187i.append(this.f820c);
        m1187i.append(", mHasUnwantedGapAfter=");
        m1187i.append(this.f822e);
        m1187i.append(", mGapPerSpan=");
        m1187i.append(Arrays.toString(this.f821d));
        m1187i.append('}');
        return m1187i.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f819b);
        parcel.writeInt(this.f820c);
        parcel.writeInt(this.f822e ? 1 : 0);
        int[] iArr = this.f821d;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(iArr.length);
        parcel.writeIntArray(this.f821d);
    }
}