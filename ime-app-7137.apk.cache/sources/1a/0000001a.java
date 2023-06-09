package p000a.p001a.p002a.p004b.p005x;

import android.os.IBinder;
import android.os.Parcel;
import android.view.KeyEvent;

/* renamed from: a.a.a.b.x.a */
/* loaded from: classes.dex */
public class C0026a implements InterfaceC0028c {

    /* renamed from: a */
    public IBinder f64a;

    public C0026a(IBinder iBinder) {
        this.f64a = iBinder;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f64a;
    }

    /* renamed from: c */
    public boolean m3459c(KeyEvent keyEvent) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            obtain.writeInt(1);
            keyEvent.writeToParcel(obtain, 0);
            this.f64a.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt() != 0;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}