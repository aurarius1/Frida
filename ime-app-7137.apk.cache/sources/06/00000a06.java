package pub.devrel.easypermissions;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import p210g.p211a.p212a.C2303b;

/* loaded from: classes.dex */
public class AppSettingsDialog implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2303b();

    /* renamed from: b */
    public final int f7491b;

    /* renamed from: c */
    public final String f7492c;

    /* renamed from: d */
    public final String f7493d;

    /* renamed from: e */
    public final String f7494e;

    /* renamed from: f */
    public final String f7495f;

    /* renamed from: g */
    public final int f7496g;

    /* renamed from: h */
    public final int f7497h;

    /* renamed from: i */
    public Context f7498i;

    public AppSettingsDialog(Parcel parcel, C2303b c2303b) {
        this.f7491b = parcel.readInt();
        this.f7492c = parcel.readString();
        this.f7493d = parcel.readString();
        this.f7494e = parcel.readString();
        this.f7495f = parcel.readString();
        this.f7496g = parcel.readInt();
        this.f7497h = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7491b);
        parcel.writeString(this.f7492c);
        parcel.writeString(this.f7493d);
        parcel.writeString(this.f7494e);
        parcel.writeString(this.f7495f);
        parcel.writeInt(this.f7496g);
        parcel.writeInt(this.f7497h);
    }
}