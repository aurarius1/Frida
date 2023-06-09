package p093c.p097b.p117q;

import android.content.Context;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import p010b.p046j.p057k.C0561b;
import p010b.p082t.C0875i0;
import p093c.p097b.p100c0.C1151a0;
import p093c.p097b.p100c0.C1167k;
import p093c.p097b.p100c0.C1171o;
import p093c.p097b.p100c0.C1172p;
import p093c.p097b.p100c0.C1179w;
import p093c.p097b.p100c0.C1181y;
import p093c.p097b.p100c0.p101b0.C1155c;
import p093c.p097b.p100c0.p101b0.C1158f;
import p093c.p097b.p106g0.C1223f;
import p093c.p097b.p106g0.C1224g;
import p093c.p137d.p138a.p139a.C1785g;
import p183e.p184a.AbstractC2093a;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.AbstractC2101i;
import p183e.p184a.InterfaceC2097e;
import p183e.p184a.InterfaceC2098f;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p189o.InterfaceC2119a;
import p183e.p184a.p189o.InterfaceC2120b;
import p183e.p184a.p189o.InterfaceC2121c;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p189o.InterfaceC2124f;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p189o.InterfaceC2128j;
import p183e.p184a.p190p.p191a.EnumC2131c;
import p183e.p184a.p190p.p191a.EnumC2132d;
import p183e.p184a.p190p.p192b.AbstractC2146l;
import p183e.p184a.p190p.p192b.AbstractC2148n;
import p183e.p184a.p190p.p192b.C2135a;
import p183e.p184a.p190p.p194d.C2158f;
import p183e.p184a.p190p.p194d.C2161i;
import p183e.p184a.p190p.p195e.p196a.C2224z0;
import p183e.p184a.p190p.p195e.p196a.RunnableC2222y0;
import p183e.p184a.p190p.p200h.AbstractC2262d;
import p183e.p184a.p190p.p200h.EnumC2264f;
import p183e.p184a.p203s.AbstractC2285j;

/* renamed from: c.b.q.d */
/* loaded from: classes.dex */
public abstract class AbstractC1438d {

    /* renamed from: a */
    public static volatile InterfaceC2123e f4735a;

    /* renamed from: a */
    public static AbstractC2101i m1049a(Callable callable) {
        try {
            Object call = callable.call();
            AbstractC2148n.m110a(call, "Scheduler Callable result can't be null");
            return (AbstractC2101i) call;
        } catch (Throwable th) {
            throw AbstractC2262d.m53a(th);
        }
    }

    /* renamed from: b */
    public static List m1048b() {
        return Arrays.asList(new C1223f(null), new C1224g(null));
    }

    /* renamed from: c */
    public static AbstractC2094b m1047c(C0561b c0561b, final InterfaceC2127i interfaceC2127i, final InterfaceC2120b interfaceC2120b, final InterfaceC2120b interfaceC2120b2) {
        final AbstractC2094b m172F = AbstractC2094b.m160S(new C2135a(new InterfaceC2121c() { // from class: c.b.c0.u
            @Override // p183e.p184a.p189o.InterfaceC2121c
            /* renamed from: a */
            public final Object mo127a(Object obj, Object obj2) {
                return new C0561b((C1179w) obj, (Boolean) obj2);
            }
        }), false, AbstractC2093a.m178a(), AbstractC2094b.m174D((Iterable) c0561b.f2654a), AbstractC2094b.m175C((Boolean[]) c0561b.f2655b)).m140y(new InterfaceC2128j() { // from class: c.b.c0.j
            @Override // p183e.p184a.p189o.InterfaceC2128j
            /* renamed from: a */
            public final boolean mo40a(Object obj) {
                return ((Boolean) ((C0561b) obj).f2655b).booleanValue();
            }
        }).m172F(new InterfaceC2127i() { // from class: c.b.c0.c
            @Override // p183e.p184a.p189o.InterfaceC2127i
            /* renamed from: a */
            public final Object mo24a(Object obj) {
                return (C1179w) ((C0561b) obj).f2654a;
            }
        });
        final C1158f c1158f = new C1158f();
        return AbstractC2094b.m162Q(new Callable() { // from class: c.b.c0.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (C1155c) InterfaceC2127i.this.mo24a(c1158f);
            }
        }, new InterfaceC2127i() { // from class: c.b.c0.m
            @Override // p183e.p184a.p189o.InterfaceC2127i
            /* renamed from: a */
            public final Object mo24a(Object obj) {
                AbstractC2094b abstractC2094b = AbstractC2094b.this;
                final InterfaceC2120b interfaceC2120b3 = interfaceC2120b;
                final C1155c c1155c = (C1155c) obj;
                return abstractC2094b.m172F(new InterfaceC2127i() { // from class: c.b.c0.n
                    @Override // p183e.p184a.p189o.InterfaceC2127i
                    /* renamed from: a */
                    public final Object mo24a(Object obj2) {
                        C1179w c1179w = (C1179w) obj2;
                        InterfaceC2120b.this.mo128a(c1179w.f4308a, c1155c);
                        return c1179w;
                    }
                });
            }
        }, new InterfaceC2123e() { // from class: c.b.c0.h
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                InterfaceC2120b.this.mo128a(c1158f, (C1155c) obj);
            }
        }, true);
    }

    /* renamed from: d */
    public static List m1046d(Context context) {
        return Collections.singletonList(new C1179w(new C1181y(C0875i0.m1746a(context)), R.string.shared_prefs_provider_name));
    }

    /* renamed from: e */
    public static AbstractC2094b m1045e(Context context, int i, int i2) {
        AbstractC2094b abstractC2094b;
        AbstractC2285j abstractC2285j = ((AnyApplication) context.getApplicationContext()).f6981d;
        C1151a0 m182t = AnyApplication.m182t(context);
        AbstractC2094b abstractC2094b2 = ((C1785g) m182t.m1170c(R.string.settings_key_night_mode, R.string.settings_default_night_mode_value)).f5459e;
        if (i == 0) {
            abstractC2094b = AbstractC2094b.m173E(Boolean.TRUE);
        } else {
            abstractC2094b = ((C1785g) m182t.m1172a(i, i2)).f5459e;
        }
        return AbstractC2094b.m151n(abstractC2094b2, abstractC2094b, abstractC2285j, new InterfaceC2124f() { // from class: c.b.q.a
            @Override // p183e.p184a.p189o.InterfaceC2124f
            /* renamed from: a */
            public final Object mo126a(Object obj, Object obj2, Object obj3) {
                String str = (String) obj;
                Boolean bool = (Boolean) obj3;
                if (((Boolean) obj2).booleanValue()) {
                    str.hashCode();
                    if (str.equals("always")) {
                        return Boolean.TRUE;
                    }
                    if (!str.equals("never")) {
                        return bool;
                    }
                }
                return Boolean.FALSE;
            }
        }).m143v();
    }

    /* renamed from: f */
    public static void m1044f(Throwable th) {
        InterfaceC2123e interfaceC2123e = f4735a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else {
            boolean z = true;
            if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
                z = false;
            }
            if (!z) {
                th = new UndeliverableException(th);
            }
        }
        if (interfaceC2123e != null) {
            try {
                interfaceC2123e.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
            }
        }
        th.printStackTrace();
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    /* renamed from: g */
    public static AbstractC2094b m1043g(C0561b c0561b, File file) {
        return m1047c(c0561b, new C1167k(file), C1172p.f4298a, C1171o.f4297a);
    }

    /* renamed from: h */
    public static AbstractC2094b m1042h(Object obj, InterfaceC2127i interfaceC2127i) {
        return new C2224z0(obj, interfaceC2127i);
    }

    /* renamed from: i */
    public static void m1041i(InterfaceC2123e interfaceC2123e) {
        f4735a = interfaceC2123e;
    }

    /* renamed from: j */
    public static void m1040j(InterfaceC2097e interfaceC2097e, InterfaceC2123e interfaceC2123e, InterfaceC2123e interfaceC2123e2, InterfaceC2119a interfaceC2119a) {
        Object poll;
        if (interfaceC2123e == null) {
            throw new NullPointerException("onNext is null");
        }
        if (interfaceC2123e2 != null) {
            C2161i c2161i = new C2161i(interfaceC2123e, interfaceC2123e2, interfaceC2119a, AbstractC2146l.f7039d);
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            C2158f c2158f = new C2158f(linkedBlockingQueue);
            c2161i.mo27c(c2158f);
            ((AbstractC2094b) interfaceC2097e).mo89a(c2158f);
            do {
                Object obj = c2158f.get();
                EnumC2131c enumC2131c = EnumC2131c.DISPOSED;
                if (obj == enumC2131c) {
                    return;
                }
                poll = linkedBlockingQueue.poll();
                if (poll == null) {
                    try {
                        poll = linkedBlockingQueue.take();
                    } catch (InterruptedException e) {
                        c2158f.mo35e();
                        c2161i.mo28b(e);
                        return;
                    }
                }
                if ((c2158f.get() == enumC2131c) || poll == C2158f.f7055b) {
                    return;
                }
            } while (!EnumC2264f.m52a(poll, c2161i));
            return;
        }
        throw new NullPointerException("onError is null");
    }

    /* renamed from: k */
    public static void m1039k(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    /* renamed from: l */
    public static boolean m1038l(InterfaceC2097e interfaceC2097e, InterfaceC2098f interfaceC2098f, InterfaceC2127i interfaceC2127i) {
        InterfaceC2112c interfaceC2112c = EnumC2132d.INSTANCE;
        if (interfaceC2097e instanceof Callable) {
            try {
                Object call = ((Callable) interfaceC2097e).call();
                if (call == null) {
                    interfaceC2098f.mo27c(interfaceC2112c);
                    interfaceC2098f.mo26d();
                    return true;
                }
                try {
                    Object mo24a = interfaceC2127i.mo24a(call);
                    AbstractC2148n.m110a(mo24a, "The mapper returned a null ObservableSource");
                    InterfaceC2097e interfaceC2097e2 = (InterfaceC2097e) mo24a;
                    if (interfaceC2097e2 instanceof Callable) {
                        try {
                            Object call2 = ((Callable) interfaceC2097e2).call();
                            if (call2 == null) {
                                interfaceC2098f.mo27c(interfaceC2112c);
                                interfaceC2098f.mo26d();
                                return true;
                            }
                            RunnableC2222y0 runnableC2222y0 = new RunnableC2222y0(interfaceC2098f, call2);
                            interfaceC2098f.mo27c(runnableC2222y0);
                            runnableC2222y0.run();
                        } catch (Throwable th) {
                            m1039k(th);
                            interfaceC2098f.mo27c(interfaceC2112c);
                            interfaceC2098f.mo28b(th);
                            return true;
                        }
                    } else {
                        interfaceC2097e2.mo89a(interfaceC2098f);
                    }
                    return true;
                } catch (Throwable th2) {
                    m1039k(th2);
                    interfaceC2098f.mo27c(interfaceC2112c);
                    interfaceC2098f.mo28b(th2);
                    return true;
                }
            } catch (Throwable th3) {
                m1039k(th3);
                interfaceC2098f.mo27c(interfaceC2112c);
                interfaceC2098f.mo28b(th3);
                return true;
            }
        }
        return false;
    }
}