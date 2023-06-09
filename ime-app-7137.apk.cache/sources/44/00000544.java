package p093c.p097b.p105f0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.Callable;
import p010b.p086w.AbstractC1077v0;
import p183e.p184a.AbstractC2101i;
import p183e.p184a.p185l.p186a.AbstractC2106c;
import p183e.p184a.p185l.p186a.C2109f;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p202r.AbstractC2275i;

/* renamed from: c.b.f0.c */
/* loaded from: classes.dex */
public abstract class AbstractC1216c {

    /* renamed from: a */
    public static AbstractC2101i f4391a;

    /* renamed from: b */
    public static AbstractC2101i f4392b;

    static {
        Looper mainLooper = Looper.getMainLooper();
        f4391a = AbstractC2275i.f7399a;
        int i = AbstractC2106c.f7010a;
        if (mainLooper != null) {
            int i2 = Build.VERSION.SDK_INT;
            boolean z = false;
            if (i2 >= 16) {
                if (i2 < 22) {
                    Message obtain = Message.obtain();
                    try {
                        obtain.setAsynchronous(true);
                        z = true;
                    } catch (NoSuchMethodError unused) {
                    }
                    obtain.recycle();
                } else {
                    z = true;
                }
            }
            f4392b = new C2109f(new Handler(mainLooper), z);
            AbstractC1077v0.f4042f = new InterfaceC2127i() { // from class: c.b.f0.a
                @Override // p183e.p184a.p189o.InterfaceC2127i
                /* renamed from: a */
                public final Object mo24a(Object obj) {
                    Callable callable = (Callable) obj;
                    return AbstractC1216c.f4392b;
                }
            };
            return;
        }
        throw new NullPointerException("looper == null");
    }
}