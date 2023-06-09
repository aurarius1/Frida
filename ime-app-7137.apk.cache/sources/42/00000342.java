package p010b.p067m.p068d;

import java.util.HashMap;
import java.util.Iterator;
import p010b.p072o.AbstractC0794w;
import p010b.p072o.InterfaceC0795x;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.m.d.i1 */
/* loaded from: classes.dex */
public final class C0702i1 extends AbstractC0794w {

    /* renamed from: b */
    public static final InterfaceC0795x f3019b = new C0698h1();

    /* renamed from: f */
    public final boolean f3023f;

    /* renamed from: c */
    public final HashMap f3020c = new HashMap();

    /* renamed from: d */
    public final HashMap f3021d = new HashMap();

    /* renamed from: e */
    public final HashMap f3022e = new HashMap();

    /* renamed from: g */
    public boolean f3024g = false;

    /* renamed from: h */
    public boolean f3025h = false;

    public C0702i1(boolean z) {
        this.f3023f = z;
    }

    @Override // p010b.p072o.AbstractC0794w
    /* renamed from: a */
    public void mo1799a() {
        if (C0690f1.m2078S(3)) {
            String str = "onCleared called for " + this;
        }
        this.f3024g = true;
    }

    /* renamed from: b */
    public void m2017b(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        if (this.f3025h) {
            return;
        }
        if ((this.f3020c.remove(abstractComponentCallbacksC0763z.f3235h) != null) && C0690f1.m2078S(2)) {
            AbstractC1124a.m1186j("Updating retained Fragments: Removed ", abstractComponentCallbacksC0763z);
        }
    }

    /* renamed from: c */
    public boolean m2016c(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        if (this.f3020c.containsKey(abstractComponentCallbacksC0763z.f3235h) && this.f3023f) {
            return this.f3024g;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0702i1.class != obj.getClass()) {
            return false;
        }
        C0702i1 c0702i1 = (C0702i1) obj;
        return this.f3020c.equals(c0702i1.f3020c) && this.f3021d.equals(c0702i1.f3021d) && this.f3022e.equals(c0702i1.f3022e);
    }

    public int hashCode() {
        int hashCode = this.f3021d.hashCode();
        return this.f3022e.hashCode() + ((hashCode + (this.f3020c.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f3020c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f3021d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f3022e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}