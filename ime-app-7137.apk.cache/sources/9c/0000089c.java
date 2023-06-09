package p093c.p176h.p177a.p178a;

import java.lang.Thread;
import p183e.p184a.p189o.InterfaceC2123e;

/* renamed from: c.h.a.a.j */
/* loaded from: classes.dex */
public class C2072j implements InterfaceC2123e, Thread.UncaughtExceptionHandler {
    public C2072j(AbstractC2071i abstractC2071i) {
    }

    @Override // p183e.p184a.p189o.InterfaceC2123e
    public void accept(Object obj) {
        Throwable th = (Throwable) obj;
        th.printStackTrace();
        th.getMessage();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        th.printStackTrace();
        th.getMessage();
        thread.toString();
    }
}