package p000a.p001a.p002a.p006c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: a.a.a.c.a */
/* loaded from: classes.dex */
public class C0044a implements InterfaceC0045b {

    /* renamed from: a */
    public IBinder f72a;

    public C0044a(IBinder iBinder) {
        this.f72a = iBinder;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f72a;
    }

    @Override // p000a.p001a.p002a.p006c.InterfaceC0045b
    /* renamed from: b */
    public void mo3455b(int i, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
            obtain.writeInt(i);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.f72a.transact(1, obtain, null, 1)) {
                int i2 = BinderC0047d.f73a;
            }
        } finally {
            obtain.recycle();
        }
    }
}