package p000a.p001a.p002a.p006c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.p007v4.p008os.ResultReceiver;

/* renamed from: a.a.a.c.d */
/* loaded from: classes.dex */
public class BinderC0047d extends Binder implements InterfaceC0045b {

    /* renamed from: a */
    public static final /* synthetic */ int f73a = 0;

    /* renamed from: b */
    public final /* synthetic */ ResultReceiver f74b;

    public BinderC0047d(ResultReceiver resultReceiver) {
        this.f74b = resultReceiver;
        attachInterface(this, "android.support.v4.os.IResultReceiver");
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // p000a.p001a.p002a.p006c.InterfaceC0045b
    /* renamed from: b */
    public void mo3455b(int i, Bundle bundle) {
        this.f74b.getClass();
        this.f74b.mo3453k(i, bundle);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            parcel.enforceInterface("android.support.v4.os.IResultReceiver");
            mo3455b(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            return true;
        } else if (i != 1598968902) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel2.writeString("android.support.v4.os.IResultReceiver");
            return true;
        }
    }
}