package p000a.p001a.p002a.p003a;

import android.app.Notification;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: a.a.a.a.a */
/* loaded from: classes.dex */
public class C0000a implements InterfaceC0002c {

    /* renamed from: a */
    public IBinder f0a;

    public C0000a(IBinder iBinder) {
        this.f0a = iBinder;
    }

    @Override // p000a.p001a.p002a.p003a.InterfaceC0002c
    /* renamed from: a */
    public void mo2413a(String str, int i, String str2, Notification notification) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(str2);
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            if (!this.f0a.transact(1, obtain, null, 1)) {
                int i2 = AbstractBinderC0001b.f1a;
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f0a;
    }
}