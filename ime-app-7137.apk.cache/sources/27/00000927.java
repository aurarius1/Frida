package p183e.p184a.p185l.p186a;

import p010b.p086w.AbstractC1077v0;
import p183e.p184a.AbstractC2101i;
import p183e.p184a.p189o.InterfaceC2127i;

/* renamed from: e.a.l.a.c */
/* loaded from: classes.dex */
public abstract class AbstractC2106c {

    /* renamed from: a */
    public static final /* synthetic */ int f7010a = 0;

    static {
        RuntimeException m53a;
        CallableC2104a callableC2104a = new CallableC2104a();
        InterfaceC2127i interfaceC2127i = AbstractC1077v0.f4042f;
        if (interfaceC2127i == null) {
            try {
                if (((AbstractC2101i) callableC2104a.call()) != null) {
                    return;
                }
                throw new NullPointerException("Scheduler Callable returned null");
            } finally {
            }
        }
        try {
            if (((AbstractC2101i) interfaceC2127i.mo24a(callableC2104a)) == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
        } finally {
        }
    }
}