package p183e.p184a.p190p.p192b;

import java.util.concurrent.Callable;
import p183e.p184a.p189o.InterfaceC2119a;
import p183e.p184a.p189o.InterfaceC2121c;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p189o.InterfaceC2124f;
import p183e.p184a.p189o.InterfaceC2125g;
import p183e.p184a.p189o.InterfaceC2126h;
import p183e.p184a.p189o.InterfaceC2127i;

/* renamed from: e.a.p.b.l */
/* loaded from: classes.dex */
public abstract class AbstractC2146l {

    /* renamed from: a */
    public static final InterfaceC2127i f7036a = new C2143i();

    /* renamed from: b */
    public static final Runnable f7037b = new RunnableC2141g();

    /* renamed from: c */
    public static final InterfaceC2119a f7038c = new C2139e();

    /* renamed from: d */
    public static final InterfaceC2123e f7039d = new C2140f();

    /* renamed from: e */
    public static final InterfaceC2123e f7040e = new C2145k();

    /* renamed from: a */
    public static Callable m116a(Object obj) {
        return new CallableC2144j(obj);
    }

    /* renamed from: b */
    public static InterfaceC2127i m115b(Object obj) {
        return new CallableC2144j(obj);
    }

    /* renamed from: c */
    public static InterfaceC2127i m114c(InterfaceC2121c interfaceC2121c) {
        if (interfaceC2121c != null) {
            return new C2135a(interfaceC2121c);
        }
        throw new NullPointerException("f is null");
    }

    /* renamed from: d */
    public static InterfaceC2127i m113d(InterfaceC2124f interfaceC2124f) {
        if (interfaceC2124f != null) {
            return new C2136b(interfaceC2124f);
        }
        throw new NullPointerException("f is null");
    }

    /* renamed from: e */
    public static InterfaceC2127i m112e(InterfaceC2125g interfaceC2125g) {
        if (interfaceC2125g != null) {
            return new C2137c(interfaceC2125g);
        }
        throw new NullPointerException("f is null");
    }

    /* renamed from: f */
    public static InterfaceC2127i m111f(InterfaceC2126h interfaceC2126h) {
        if (interfaceC2126h != null) {
            return new C2138d(interfaceC2126h);
        }
        throw new NullPointerException("f is null");
    }
}