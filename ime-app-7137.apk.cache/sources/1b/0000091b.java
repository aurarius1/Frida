package p183e.p184a;

import java.util.Iterator;
import java.util.concurrent.Callable;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p189o.InterfaceC2119a;
import p183e.p184a.p189o.InterfaceC2120b;
import p183e.p184a.p189o.InterfaceC2121c;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p189o.InterfaceC2124f;
import p183e.p184a.p189o.InterfaceC2125g;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p189o.InterfaceC2128j;
import p183e.p184a.p190p.p192b.AbstractC2146l;
import p183e.p184a.p190p.p192b.AbstractC2148n;
import p183e.p184a.p190p.p192b.EnumC2142h;
import p183e.p184a.p190p.p193c.InterfaceCallableC2150b;
import p183e.p184a.p190p.p194d.C2161i;
import p183e.p184a.p190p.p195e.p196a.C2165b;
import p183e.p184a.p190p.p195e.p196a.C2166b0;
import p183e.p184a.p190p.p195e.p196a.C2168c;
import p183e.p184a.p190p.p195e.p196a.C2170c1;
import p183e.p184a.p190p.p195e.p196a.C2172d0;
import p183e.p184a.p190p.p195e.p196a.C2174e;
import p183e.p184a.p190p.p195e.p196a.C2175e0;
import p183e.p184a.p190p.p195e.p196a.C2178f0;
import p183e.p184a.p190p.p195e.p196a.C2183h;
import p183e.p184a.p190p.p195e.p196a.C2185h1;
import p183e.p184a.p190p.p195e.p196a.C2190j0;
import p183e.p184a.p190p.p195e.p196a.C2192k;
import p183e.p184a.p190p.p195e.p196a.C2194k1;
import p183e.p184a.p190p.p195e.p196a.C2196l0;
import p183e.p184a.p190p.p195e.p196a.C2197m;
import p183e.p184a.p190p.p195e.p196a.C2200n0;
import p183e.p184a.p190p.p195e.p196a.C2201o;
import p183e.p184a.p190p.p195e.p196a.C2205q;
import p183e.p184a.p190p.p195e.p196a.C2211t;
import p183e.p184a.p190p.p195e.p196a.C2213u;
import p183e.p184a.p190p.p195e.p196a.C2217w;
import p183e.p184a.p190p.p195e.p196a.C2223z;
import p183e.p184a.p190p.p200h.AbstractC2262d;

/* renamed from: e.a.b */
/* loaded from: classes.dex */
public abstract class AbstractC2094b implements InterfaceC2097e {
    /* renamed from: C */
    public static AbstractC2094b m175C(Object... objArr) {
        if (objArr != null) {
            return objArr.length == 0 ? C2213u.f7226b : objArr.length == 1 ? m173E(objArr[0]) : new C2166b0(objArr);
        }
        throw new NullPointerException("items is null");
    }

    /* renamed from: D */
    public static AbstractC2094b m174D(Iterable iterable) {
        if (iterable != null) {
            return new C2172d0(iterable);
        }
        throw new NullPointerException("source is null");
    }

    /* renamed from: E */
    public static AbstractC2094b m173E(Object obj) {
        if (obj != null) {
            return new C2178f0(obj);
        }
        throw new NullPointerException("item is null");
    }

    /* renamed from: Q */
    public static AbstractC2094b m162Q(Callable callable, InterfaceC2127i interfaceC2127i, InterfaceC2123e interfaceC2123e, boolean z) {
        if (callable != null) {
            if (interfaceC2127i != null) {
                if (interfaceC2123e != null) {
                    return new C2185h1(callable, interfaceC2127i, interfaceC2123e, z);
                }
                throw new NullPointerException("disposer is null");
            }
            throw new NullPointerException("sourceSupplier is null");
        }
        throw new NullPointerException("resourceSupplier is null");
    }

    /* renamed from: R */
    public static AbstractC2094b m161R(InterfaceC2097e interfaceC2097e) {
        if (interfaceC2097e != null) {
            return interfaceC2097e instanceof AbstractC2094b ? (AbstractC2094b) interfaceC2097e : new C2175e0(interfaceC2097e);
        }
        throw new NullPointerException("source is null");
    }

    /* renamed from: S */
    public static AbstractC2094b m160S(InterfaceC2127i interfaceC2127i, boolean z, int i, InterfaceC2097e... interfaceC2097eArr) {
        if (interfaceC2097eArr.length == 0) {
            return C2213u.f7226b;
        }
        AbstractC2148n.m109b(i, "bufferSize");
        return new C2194k1(interfaceC2097eArr, null, interfaceC2127i, i, z);
    }

    /* renamed from: j */
    public static int m155j() {
        return AbstractC2093a.m178a();
    }

    /* renamed from: m */
    public static AbstractC2094b m152m(InterfaceC2097e interfaceC2097e, InterfaceC2097e interfaceC2097e2, InterfaceC2097e interfaceC2097e3, InterfaceC2097e interfaceC2097e4, InterfaceC2097e interfaceC2097e5, InterfaceC2125g interfaceC2125g) {
        if (interfaceC2097e != null) {
            if (interfaceC2097e2 != null) {
                if (interfaceC2097e3 != null) {
                    return m149p(AbstractC2146l.m112e(interfaceC2125g), m155j(), interfaceC2097e, interfaceC2097e2, interfaceC2097e3, interfaceC2097e4, interfaceC2097e5);
                }
                throw new NullPointerException("source3 is null");
            }
            throw new NullPointerException("source2 is null");
        }
        throw new NullPointerException("source1 is null");
    }

    /* renamed from: n */
    public static AbstractC2094b m151n(InterfaceC2097e interfaceC2097e, InterfaceC2097e interfaceC2097e2, InterfaceC2097e interfaceC2097e3, InterfaceC2124f interfaceC2124f) {
        if (interfaceC2097e != null) {
            if (interfaceC2097e2 != null) {
                if (interfaceC2097e3 != null) {
                    return m149p(AbstractC2146l.m113d(interfaceC2124f), m155j(), interfaceC2097e, interfaceC2097e2, interfaceC2097e3);
                }
                throw new NullPointerException("source3 is null");
            }
            throw new NullPointerException("source2 is null");
        }
        throw new NullPointerException("source1 is null");
    }

    /* renamed from: o */
    public static AbstractC2094b m150o(InterfaceC2097e interfaceC2097e, InterfaceC2097e interfaceC2097e2, InterfaceC2121c interfaceC2121c) {
        if (interfaceC2097e != null) {
            if (interfaceC2097e2 != null) {
                return m149p(AbstractC2146l.m114c(interfaceC2121c), m155j(), interfaceC2097e, interfaceC2097e2);
            }
            throw new NullPointerException("source2 is null");
        }
        throw new NullPointerException("source1 is null");
    }

    /* renamed from: p */
    public static AbstractC2094b m149p(InterfaceC2127i interfaceC2127i, int i, InterfaceC2097e... interfaceC2097eArr) {
        return m148q(interfaceC2097eArr, interfaceC2127i, i);
    }

    /* renamed from: q */
    public static AbstractC2094b m148q(InterfaceC2097e[] interfaceC2097eArr, InterfaceC2127i interfaceC2127i, int i) {
        if (interfaceC2097eArr != null) {
            if (interfaceC2097eArr.length == 0) {
                return C2213u.f7226b;
            }
            if (interfaceC2127i != null) {
                AbstractC2148n.m109b(i, "bufferSize");
                return new C2183h(interfaceC2097eArr, null, interfaceC2127i, i << 1, false);
            }
            throw new NullPointerException("combiner is null");
        }
        throw new NullPointerException("sources is null");
    }

    /* renamed from: r */
    public static AbstractC2094b m147r(InterfaceC2097e... interfaceC2097eArr) {
        return interfaceC2097eArr.length == 0 ? C2213u.f7226b : interfaceC2097eArr.length == 1 ? m161R(interfaceC2097eArr[0]) : new C2192k(m175C(interfaceC2097eArr), AbstractC2146l.f7036a, m155j(), 2);
    }

    /* renamed from: s */
    public static AbstractC2094b m146s(InterfaceC2096d interfaceC2096d) {
        return new C2197m(interfaceC2096d);
    }

    /* renamed from: A */
    public final AbstractC2094b m177A(InterfaceC2127i interfaceC2127i, boolean z, int i) {
        return m176B(interfaceC2127i, z, i, m155j());
    }

    /* renamed from: B */
    public final AbstractC2094b m176B(InterfaceC2127i interfaceC2127i, boolean z, int i, int i2) {
        if (interfaceC2127i != null) {
            AbstractC2148n.m109b(i, "maxConcurrency");
            AbstractC2148n.m109b(i2, "bufferSize");
            if (this instanceof InterfaceCallableC2150b) {
                Object call = ((InterfaceCallableC2150b) this).call();
                return call == null ? C2213u.f7226b : AbstractC1438d.m1042h(call, interfaceC2127i);
            }
            return new C2223z(this, interfaceC2127i, z, i, i2);
        }
        throw new NullPointerException("mapper is null");
    }

    /* renamed from: F */
    public final AbstractC2094b m172F(InterfaceC2127i interfaceC2127i) {
        return new C2190j0(this, interfaceC2127i);
    }

    /* renamed from: G */
    public final AbstractC2094b m171G(AbstractC2101i abstractC2101i) {
        return m170H(abstractC2101i, false, m155j());
    }

    /* renamed from: H */
    public final AbstractC2094b m170H(AbstractC2101i abstractC2101i, boolean z, int i) {
        if (abstractC2101i != null) {
            AbstractC2148n.m109b(i, "bufferSize");
            return new C2196l0(this, abstractC2101i, z, i);
        }
        throw new NullPointerException("scheduler is null");
    }

    /* renamed from: I */
    public final AbstractC2094b m169I(InterfaceC2127i interfaceC2127i) {
        return new C2200n0(this, interfaceC2127i);
    }

    /* renamed from: J */
    public final AbstractC2094b m168J(Object obj) {
        if (obj != null) {
            return m147r(m173E(obj), this);
        }
        throw new NullPointerException("item is null");
    }

    /* renamed from: K */
    public final InterfaceC2112c m167K(InterfaceC2123e interfaceC2123e) {
        return m164N(interfaceC2123e, AbstractC2146l.f7040e, AbstractC2146l.f7038c, AbstractC2146l.f7039d);
    }

    /* renamed from: L */
    public final InterfaceC2112c m166L(InterfaceC2123e interfaceC2123e, InterfaceC2123e interfaceC2123e2) {
        return m164N(interfaceC2123e, interfaceC2123e2, AbstractC2146l.f7038c, AbstractC2146l.f7039d);
    }

    /* renamed from: M */
    public final InterfaceC2112c m165M(InterfaceC2123e interfaceC2123e, InterfaceC2123e interfaceC2123e2, InterfaceC2119a interfaceC2119a) {
        return m164N(interfaceC2123e, interfaceC2123e2, interfaceC2119a, AbstractC2146l.f7039d);
    }

    /* renamed from: N */
    public final InterfaceC2112c m164N(InterfaceC2123e interfaceC2123e, InterfaceC2123e interfaceC2123e2, InterfaceC2119a interfaceC2119a, InterfaceC2123e interfaceC2123e3) {
        if (interfaceC2123e != null) {
            if (interfaceC2123e2 != null) {
                if (interfaceC2119a != null) {
                    C2161i c2161i = new C2161i(interfaceC2123e, interfaceC2123e2, interfaceC2119a, interfaceC2123e3);
                    mo89a(c2161i);
                    return c2161i;
                }
                throw new NullPointerException("onComplete is null");
            }
            throw new NullPointerException("onError is null");
        }
        throw new NullPointerException("onNext is null");
    }

    /* renamed from: O */
    public abstract void mo31O(InterfaceC2098f interfaceC2098f);

    /* renamed from: P */
    public final AbstractC2094b m163P(AbstractC2101i abstractC2101i) {
        if (abstractC2101i != null) {
            return new C2170c1(this, abstractC2101i);
        }
        throw new NullPointerException("scheduler is null");
    }

    @Override // p183e.p184a.InterfaceC2097e
    /* renamed from: a */
    public final void mo89a(InterfaceC2098f interfaceC2098f) {
        if (interfaceC2098f == null) {
            throw new NullPointerException("observer is null");
        }
        try {
            mo31O(interfaceC2098f);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            AbstractC1438d.m1039k(th);
            AbstractC1438d.m1044f(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: e */
    public final void m159e(InterfaceC2123e interfaceC2123e) {
        Iterator it = ((C2168c) m158f()).iterator();
        while (true) {
            C2165b c2165b = (C2165b) it;
            if (!c2165b.hasNext()) {
                return;
            }
            try {
                interfaceC2123e.accept(c2165b.next());
            } catch (Throwable th) {
                AbstractC1438d.m1039k(th);
                ((InterfaceC2112c) it).mo35e();
                throw AbstractC2262d.m53a(th);
            }
        }
    }

    /* renamed from: f */
    public final Iterable m158f() {
        return m157h(m155j());
    }

    /* renamed from: h */
    public final Iterable m157h(int i) {
        AbstractC2148n.m109b(i, "bufferSize");
        return new C2168c(this, i);
    }

    /* renamed from: i */
    public final void m156i(InterfaceC2123e interfaceC2123e) {
        AbstractC1438d.m1040j(this, interfaceC2123e, AbstractC2146l.f7040e, AbstractC2146l.f7038c);
    }

    /* renamed from: k */
    public final AbstractC2102j m154k(Callable callable, InterfaceC2120b interfaceC2120b) {
        if (interfaceC2120b != null) {
            return new C2174e(this, callable, interfaceC2120b);
        }
        throw new NullPointerException("collector is null");
    }

    /* renamed from: l */
    public final AbstractC2102j m153l(Object obj, InterfaceC2120b interfaceC2120b) {
        return m154k(AbstractC2146l.m116a(obj), interfaceC2120b);
    }

    /* renamed from: t */
    public final AbstractC2094b m145t() {
        return m144u(AbstractC2146l.f7036a, EnumC2142h.INSTANCE);
    }

    /* renamed from: u */
    public final AbstractC2094b m144u(InterfaceC2127i interfaceC2127i, Callable callable) {
        if (interfaceC2127i != null) {
            return new C2201o(this, interfaceC2127i, callable);
        }
        throw new NullPointerException("keySelector is null");
    }

    /* renamed from: v */
    public final AbstractC2094b m143v() {
        return m142w(AbstractC2146l.f7036a);
    }

    /* renamed from: w */
    public final AbstractC2094b m142w(InterfaceC2127i interfaceC2127i) {
        return new C2205q(this, interfaceC2127i, AbstractC2148n.f7041a);
    }

    /* renamed from: x */
    public final AbstractC2094b m141x(InterfaceC2123e interfaceC2123e, InterfaceC2119a interfaceC2119a) {
        if (interfaceC2119a != null) {
            return new C2211t(this, interfaceC2123e, interfaceC2119a);
        }
        throw new NullPointerException("onDispose is null");
    }

    /* renamed from: y */
    public final AbstractC2094b m140y(InterfaceC2128j interfaceC2128j) {
        return new C2217w(this, interfaceC2128j);
    }

    /* renamed from: z */
    public final AbstractC2094b m139z(InterfaceC2127i interfaceC2127i, boolean z) {
        return m177A(interfaceC2127i, z, Integer.MAX_VALUE);
    }
}