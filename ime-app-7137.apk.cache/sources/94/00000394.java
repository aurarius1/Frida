package p010b.p072o;

import android.annotation.SuppressLint;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import p010b.p027d.p028a.p029a.C0348a;
import p010b.p027d.p028a.p030b.C0352a;
import p010b.p027d.p028a.p030b.C0354c;
import p010b.p027d.p028a.p030b.C0355d;
import p010b.p027d.p028a.p030b.C0356e;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.o.m */
/* loaded from: classes.dex */
public class C0784m extends AbstractC0779h {

    /* renamed from: c */
    public final WeakReference f3284c;

    /* renamed from: a */
    public C0352a f3282a = new C0352a();

    /* renamed from: d */
    public int f3285d = 0;

    /* renamed from: e */
    public boolean f3286e = false;

    /* renamed from: f */
    public boolean f3287f = false;

    /* renamed from: g */
    public ArrayList f3288g = new ArrayList();

    /* renamed from: b */
    public EnumC0778g f3283b = EnumC0778g.INITIALIZED;

    /* renamed from: h */
    public final boolean f3289h = true;

    public C0784m(InterfaceC0782k interfaceC0782k) {
        this.f3284c = new WeakReference(interfaceC0782k);
    }

    /* renamed from: e */
    public static EnumC0778g m1820e(EnumC0778g enumC0778g, EnumC0778g enumC0778g2) {
        return (enumC0778g2 == null || enumC0778g2.compareTo(enumC0778g) >= 0) ? enumC0778g : enumC0778g2;
    }

    @Override // p010b.p072o.AbstractC0779h
    /* renamed from: a */
    public void mo1824a(InterfaceC0781j interfaceC0781j) {
        InterfaceC0782k interfaceC0782k;
        m1822c("addObserver");
        EnumC0778g enumC0778g = this.f3283b;
        EnumC0778g enumC0778g2 = EnumC0778g.DESTROYED;
        if (enumC0778g != enumC0778g2) {
            enumC0778g2 = EnumC0778g.INITIALIZED;
        }
        C0783l c0783l = new C0783l(interfaceC0781j, enumC0778g2);
        if (((C0783l) this.f3282a.mo2687d(interfaceC0781j, c0783l)) == null && (interfaceC0782k = (InterfaceC0782k) this.f3284c.get()) != null) {
            boolean z = this.f3285d != 0 || this.f3286e;
            EnumC0778g m1823b = m1823b(interfaceC0781j);
            this.f3285d++;
            while (c0783l.f3280a.compareTo(m1823b) < 0 && this.f3282a.f1845f.containsKey(interfaceC0781j)) {
                this.f3288g.add(c0783l.f3280a);
                EnumC0777f m1828b = EnumC0777f.m1828b(c0783l.f3280a);
                if (m1828b == null) {
                    StringBuilder m1187i = AbstractC1124a.m1187i("no event up from ");
                    m1187i.append(c0783l.f3280a);
                    throw new IllegalStateException(m1187i.toString());
                }
                c0783l.m1825a(interfaceC0782k, m1828b);
                m1818g();
                m1823b = m1823b(interfaceC0781j);
            }
            if (!z) {
                m1817h();
            }
            this.f3285d--;
        }
    }

    /* renamed from: b */
    public final EnumC0778g m1823b(InterfaceC0781j interfaceC0781j) {
        C0352a c0352a = this.f3282a;
        EnumC0778g enumC0778g = null;
        C0355d c0355d = c0352a.f1845f.containsKey(interfaceC0781j) ? ((C0355d) c0352a.f1845f.get(interfaceC0781j)).f1849e : null;
        EnumC0778g enumC0778g2 = c0355d != null ? ((C0783l) c0355d.f1847c).f3280a : null;
        if (!this.f3288g.isEmpty()) {
            ArrayList arrayList = this.f3288g;
            enumC0778g = (EnumC0778g) arrayList.get(arrayList.size() - 1);
        }
        return m1820e(m1820e(this.f3283b, enumC0778g2), enumC0778g);
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: c */
    public final void m1822c(String str) {
        if (this.f3289h && !C0348a.m2695b().mo2694a()) {
            throw new IllegalStateException(AbstractC1124a.m1189g("Method ", str, " must be called on the main thread"));
        }
    }

    /* renamed from: d */
    public void m1821d(EnumC0777f enumC0777f) {
        m1822c("handleLifecycleEvent");
        m1819f(enumC0777f.m1829a());
    }

    /* renamed from: f */
    public final void m1819f(EnumC0778g enumC0778g) {
        if (this.f3283b == enumC0778g) {
            return;
        }
        this.f3283b = enumC0778g;
        if (this.f3286e || this.f3285d != 0) {
            this.f3287f = true;
            return;
        }
        this.f3286e = true;
        m1817h();
        this.f3286e = false;
    }

    /* renamed from: g */
    public final void m1818g() {
        ArrayList arrayList = this.f3288g;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: h */
    public final void m1817h() {
        InterfaceC0782k interfaceC0782k = (InterfaceC0782k) this.f3284c.get();
        if (interfaceC0782k == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C0352a c0352a = this.f3282a;
            boolean z = true;
            if (c0352a.f1858e != 0) {
                EnumC0778g enumC0778g = ((C0783l) c0352a.f1855b.f1847c).f3280a;
                EnumC0778g enumC0778g2 = ((C0783l) c0352a.f1856c.f1847c).f3280a;
                if (enumC0778g != enumC0778g2 || this.f3283b != enumC0778g2) {
                    z = false;
                }
            }
            this.f3287f = false;
            if (z) {
                return;
            }
            if (this.f3283b.compareTo(((C0783l) c0352a.f1855b.f1847c).f3280a) < 0) {
                C0352a c0352a2 = this.f3282a;
                C0354c c0354c = new C0354c(c0352a2.f1856c, c0352a2.f1855b);
                c0352a2.f1857d.put(c0354c, Boolean.FALSE);
                while (c0354c.hasNext() && !this.f3287f) {
                    Map.Entry entry = (Map.Entry) c0354c.next();
                    C0783l c0783l = (C0783l) entry.getValue();
                    while (c0783l.f3280a.compareTo(this.f3283b) > 0 && !this.f3287f && this.f3282a.contains(entry.getKey())) {
                        int ordinal = c0783l.f3280a.ordinal();
                        EnumC0777f enumC0777f = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0777f.ON_PAUSE : EnumC0777f.ON_STOP : EnumC0777f.ON_DESTROY;
                        if (enumC0777f == null) {
                            StringBuilder m1187i = AbstractC1124a.m1187i("no event down from ");
                            m1187i.append(c0783l.f3280a);
                            throw new IllegalStateException(m1187i.toString());
                        }
                        this.f3288g.add(enumC0777f.m1829a());
                        c0783l.m1825a(interfaceC0782k, enumC0777f);
                        m1818g();
                    }
                }
            }
            C0355d c0355d = this.f3282a.f1856c;
            if (!this.f3287f && c0355d != null && this.f3283b.compareTo(((C0783l) c0355d.f1847c).f3280a) > 0) {
                C0356e m2689b = this.f3282a.m2689b();
                while (m2689b.hasNext() && !this.f3287f) {
                    Map.Entry entry2 = (Map.Entry) m2689b.next();
                    C0783l c0783l2 = (C0783l) entry2.getValue();
                    while (c0783l2.f3280a.compareTo(this.f3283b) < 0 && !this.f3287f && this.f3282a.contains(entry2.getKey())) {
                        this.f3288g.add(c0783l2.f3280a);
                        EnumC0777f m1828b = EnumC0777f.m1828b(c0783l2.f3280a);
                        if (m1828b == null) {
                            StringBuilder m1187i2 = AbstractC1124a.m1187i("no event up from ");
                            m1187i2.append(c0783l2.f3280a);
                            throw new IllegalStateException(m1187i2.toString());
                        }
                        c0783l2.m1825a(interfaceC0782k, m1828b);
                        m1818g();
                    }
                }
            }
        }
    }
}