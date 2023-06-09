package p010b.p067m.p068d;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p010b.p046j.p054h.C0529b;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p067m.AbstractC0666b;

/* renamed from: b.m.d.s2 */
/* loaded from: classes.dex */
public abstract class AbstractC0743s2 {

    /* renamed from: a */
    public final ViewGroup f3127a;

    /* renamed from: b */
    public final ArrayList f3128b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f3129c = new ArrayList();

    /* renamed from: d */
    public boolean f3130d = false;

    /* renamed from: e */
    public boolean f3131e = false;

    public AbstractC0743s2(ViewGroup viewGroup) {
        this.f3127a = viewGroup;
    }

    /* renamed from: f */
    public static AbstractC0743s2 m1945f(ViewGroup viewGroup, C0755w0 c0755w0) {
        int i = AbstractC0666b.special_effects_controller_view_tag;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof AbstractC0743s2) {
            return (AbstractC0743s2) tag;
        }
        c0755w0.getClass();
        C0728p c0728p = new C0728p(viewGroup);
        viewGroup.setTag(i, c0728p);
        return c0728p;
    }

    /* renamed from: g */
    public static AbstractC0743s2 m1944g(ViewGroup viewGroup, C0690f1 c0690f1) {
        return m1945f(viewGroup, c0690f1.m2080Q());
    }

    /* renamed from: a */
    public final void m1950a(EnumC0739r2 enumC0739r2, EnumC0735q2 enumC0735q2, C0718m1 c0718m1) {
        synchronized (this.f3128b) {
            C0529b c0529b = new C0529b();
            C0727o2 m1947d = m1947d(c0718m1.f3061c);
            if (m1947d != null) {
                m1947d.m1973c(enumC0739r2, enumC0735q2);
                return;
            }
            C0727o2 c0727o2 = new C0727o2(enumC0739r2, enumC0735q2, c0718m1, c0529b);
            this.f3128b.add(c0727o2);
            c0727o2.f3090d.add(new RunnableC0719m2(this, c0727o2));
            c0727o2.f3090d.add(new RunnableC0723n2(this, c0727o2));
        }
    }

    /* renamed from: b */
    public abstract void mo1949b(List list, boolean z);

    /* renamed from: c */
    public void m1948c() {
        if (this.f3131e) {
            return;
        }
        if (!AbstractC0605j0.m2233y(this.f3127a)) {
            m1946e();
            this.f3130d = false;
            return;
        }
        synchronized (this.f3128b) {
            if (!this.f3128b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f3129c);
                this.f3129c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C0727o2 c0727o2 = (C0727o2) it.next();
                    if (C0690f1.m2078S(2)) {
                        String str = "SpecialEffectsController: Cancelling operation " + c0727o2;
                    }
                    c0727o2.m1975a();
                    if (!c0727o2.f3093g) {
                        this.f3129c.add(c0727o2);
                    }
                }
                m1942i();
                ArrayList arrayList2 = new ArrayList(this.f3128b);
                this.f3128b.clear();
                this.f3129c.addAll(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((C0727o2) it2.next()).m1972d();
                }
                mo1949b(arrayList2, this.f3130d);
                this.f3130d = false;
            }
        }
    }

    /* renamed from: d */
    public final C0727o2 m1947d(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        Iterator it = this.f3128b.iterator();
        while (it.hasNext()) {
            C0727o2 c0727o2 = (C0727o2) it.next();
            if (c0727o2.f3089c.equals(abstractComponentCallbacksC0763z) && !c0727o2.f3092f) {
                return c0727o2;
            }
        }
        return null;
    }

    /* renamed from: e */
    public void m1946e() {
        String str;
        String str2;
        boolean m2233y = AbstractC0605j0.m2233y(this.f3127a);
        synchronized (this.f3128b) {
            m1942i();
            Iterator it = this.f3128b.iterator();
            while (it.hasNext()) {
                ((C0727o2) it.next()).m1972d();
            }
            Iterator it2 = new ArrayList(this.f3129c).iterator();
            while (it2.hasNext()) {
                C0727o2 c0727o2 = (C0727o2) it2.next();
                if (C0690f1.m2078S(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (m2233y) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f3127a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(c0727o2);
                    sb.toString();
                }
                c0727o2.m1975a();
            }
            Iterator it3 = new ArrayList(this.f3128b).iterator();
            while (it3.hasNext()) {
                C0727o2 c0727o22 = (C0727o2) it3.next();
                if (C0690f1.m2078S(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (m2233y) {
                        str = "";
                    } else {
                        str = "Container " + this.f3127a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(c0727o22);
                    sb2.toString();
                }
                c0727o22.m1975a();
            }
        }
    }

    /* renamed from: h */
    public void m1943h() {
        synchronized (this.f3128b) {
            m1942i();
            this.f3131e = false;
            int size = this.f3128b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                C0727o2 c0727o2 = (C0727o2) this.f3128b.get(size);
                EnumC0739r2 m1951c = EnumC0739r2.m1951c(c0727o2.f3089c.f3216I);
                EnumC0739r2 enumC0739r2 = c0727o2.f3087a;
                EnumC0739r2 enumC0739r22 = EnumC0739r2.VISIBLE;
                if (enumC0739r2 == enumC0739r22 && m1951c != enumC0739r22) {
                    this.f3131e = c0727o2.f3089c.m1894K();
                    break;
                }
                size--;
            }
        }
    }

    /* renamed from: i */
    public final void m1942i() {
        Iterator it = this.f3128b.iterator();
        while (it.hasNext()) {
            C0727o2 c0727o2 = (C0727o2) it.next();
            if (c0727o2.f3088b == EnumC0735q2.ADDING) {
                c0727o2.m1973c(EnumC0739r2.m1952b(c0727o2.f3089c.m1909C0().getVisibility()), EnumC0735q2.NONE);
            }
        }
    }
}