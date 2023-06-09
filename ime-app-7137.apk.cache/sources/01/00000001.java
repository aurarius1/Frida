package p000a.p001a.p002a.p003a;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import p010b.p046j.p047d.BinderC0491x;

/* renamed from: a.a.a.a.b */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0001b extends Binder implements InterfaceC0002c {

    /* renamed from: a */
    public static final /* synthetic */ int f1a = 0;

    public AbstractBinderC0001b() {
        attachInterface(this, "android.support.v4.app.INotificationSideChannel");
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        long clearCallingIdentity;
        if (i == 1) {
            parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
            ((BinderC0491x) this).mo2413a(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Notification) Notification.CREATOR.createFromParcel(parcel) : null);
            return true;
        } else if (i == 2) {
            parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            String readString2 = parcel.readString();
            BinderC0491x binderC0491x = (BinderC0491x) this;
            binderC0491x.f2508b.m3340c(Binder.getCallingUid(), readString);
            clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                binderC0491x.f2508b.m3342a(readString, readInt, readString2);
                return true;
            } finally {
            }
        } else if (i != 3) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("android.support.v4.app.INotificationSideChannel");
            return true;
        } else {
            parcel.enforceInterface("android.support.v4.app.INotificationSideChannel");
            String readString3 = parcel.readString();
            BinderC0491x binderC0491x2 = (BinderC0491x) this;
            binderC0491x2.f2508b.m3340c(Binder.getCallingUid(), readString3);
            clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                binderC0491x2.f2508b.m3341b(readString3);
                return true;
            } finally {
            }
        }
    }
}