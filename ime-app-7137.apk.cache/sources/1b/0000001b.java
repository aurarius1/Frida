package p000a.p001a.p002a.p004b.p005x;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: a.a.a.b.x.b */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0027b extends Binder implements InterfaceC0028c {
    /* renamed from: c */
    public static InterfaceC0028c m3458c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0028c)) ? new C0026a(iBinder) : (InterfaceC0028c) queryLocalInterface;
    }
}