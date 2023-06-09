package android.support.p007v4.p008os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import p000a.p001a.p002a.p006c.BinderC0047d;
import p000a.p001a.p002a.p006c.C0044a;
import p000a.p001a.p002a.p006c.C0046c;
import p000a.p001a.p002a.p006c.InterfaceC0045b;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.os.ResultReceiver */
/* loaded from: classes.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0046c();

    /* renamed from: b */
    public InterfaceC0045b f116b;

    public ResultReceiver(Parcel parcel) {
        InterfaceC0045b c0044a;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i = BinderC0047d.f73a;
        if (readStrongBinder == null) {
            c0044a = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            c0044a = (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0045b)) ? new C0044a(readStrongBinder) : (InterfaceC0045b) queryLocalInterface;
        }
        this.f116b = c0044a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: k */
    public void mo3453k(int i, Bundle bundle) {
    }

    /* renamed from: l */
    public void m3452l(int i, Bundle bundle) {
        InterfaceC0045b interfaceC0045b = this.f116b;
        if (interfaceC0045b != null) {
            try {
                interfaceC0045b.mo3455b(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f116b == null) {
                this.f116b = new BinderC0047d(this);
            }
            parcel.writeStrongBinder(this.f116b.asBinder());
        }
    }
}