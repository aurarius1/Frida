package p010b.p086w;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import p010b.p067m.p068d.AbstractC0695g2;

@SuppressLint({"RestrictedApi"})
/* renamed from: b.w.t */
/* loaded from: classes.dex */
public class C1072t extends AbstractC0695g2 {
    /* renamed from: z */
    public static boolean m1306z(AbstractC1034e0 abstractC1034e0) {
        return (AbstractC0695g2.m2023k(abstractC1034e0.f3933i) && AbstractC0695g2.m2023k(null) && AbstractC0695g2.m2023k(null)) ? false : true;
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: a */
    public void mo1322a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC1034e0) obj).mo1345b(view);
        }
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: b */
    public void mo1321b(Object obj, ArrayList arrayList) {
        AbstractC1034e0 abstractC1034e0 = (AbstractC1034e0) obj;
        if (abstractC1034e0 == null) {
            return;
        }
        int i = 0;
        if (abstractC1034e0 instanceof C1058m0) {
            C1058m0 c1058m0 = (C1058m0) abstractC1034e0;
            int size = c1058m0.f4004y.size();
            while (i < size) {
                mo1321b(c1058m0.m1350I(i), arrayList);
                i++;
            }
        } else if (m1306z(abstractC1034e0) || !AbstractC0695g2.m2023k(abstractC1034e0.f3934j)) {
        } else {
            int size2 = arrayList.size();
            while (i < size2) {
                abstractC1034e0.mo1345b((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: c */
    public void mo1320c(ViewGroup viewGroup, Object obj) {
        AbstractC1046i0.m1362a(viewGroup, (AbstractC1034e0) obj);
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: e */
    public boolean mo1319e(Object obj) {
        return obj instanceof AbstractC1034e0;
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: g */
    public Object mo1318g(Object obj) {
        if (obj != null) {
            return ((AbstractC1034e0) obj).clone();
        }
        return null;
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: l */
    public Object mo1317l(Object obj, Object obj2, Object obj3) {
        AbstractC1034e0 abstractC1034e0 = (AbstractC1034e0) obj;
        AbstractC1034e0 abstractC1034e02 = (AbstractC1034e0) obj2;
        AbstractC1034e0 abstractC1034e03 = (AbstractC1034e0) obj3;
        if (abstractC1034e0 != null && abstractC1034e02 != null) {
            C1058m0 c1058m0 = new C1058m0();
            c1058m0.m1351H(abstractC1034e0);
            c1058m0.m1351H(abstractC1034e02);
            c1058m0.m1347L(1);
            abstractC1034e0 = c1058m0;
        } else if (abstractC1034e0 == null) {
            abstractC1034e0 = abstractC1034e02 != null ? abstractC1034e02 : null;
        }
        if (abstractC1034e03 != null) {
            C1058m0 c1058m02 = new C1058m0();
            if (abstractC1034e0 != null) {
                c1058m02.m1351H(abstractC1034e0);
            }
            c1058m02.m1351H(abstractC1034e03);
            return c1058m02;
        }
        return abstractC1034e0;
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: m */
    public Object mo1316m(Object obj, Object obj2, Object obj3) {
        C1058m0 c1058m0 = new C1058m0();
        if (obj != null) {
            c1058m0.m1351H((AbstractC1034e0) obj);
        }
        if (obj2 != null) {
            c1058m0.m1351H((AbstractC1034e0) obj2);
        }
        if (obj3 != null) {
            c1058m0.m1351H((AbstractC1034e0) obj3);
        }
        return c1058m0;
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: o */
    public void mo1315o(Object obj, View view) {
        if (obj != null) {
            ((AbstractC1034e0) obj).mo1339w(view);
        }
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: p */
    public void mo1314p(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC1034e0 abstractC1034e0 = (AbstractC1034e0) obj;
        int i = 0;
        if (abstractC1034e0 instanceof C1058m0) {
            C1058m0 c1058m0 = (C1058m0) abstractC1034e0;
            int size = c1058m0.f4004y.size();
            while (i < size) {
                mo1314p(c1058m0.m1350I(i), arrayList, arrayList2);
                i++;
            }
        } else if (m1306z(abstractC1034e0)) {
        } else {
            ArrayList arrayList3 = abstractC1034e0.f3934j;
            if (arrayList3.size() != arrayList.size() || !arrayList3.containsAll(arrayList)) {
                return;
            }
            int size2 = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size2) {
                abstractC1034e0.mo1345b((View) arrayList2.get(i));
                i++;
            }
            int size3 = arrayList.size();
            while (true) {
                size3--;
                if (size3 < 0) {
                    return;
                }
                abstractC1034e0.mo1339w((View) arrayList.get(size3));
            }
        }
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: q */
    public void mo1313q(Object obj, View view, ArrayList arrayList) {
        ((AbstractC1034e0) obj).mo1346a(new C1066q(this, view, arrayList));
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: r */
    public void mo1312r(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((AbstractC1034e0) obj).mo1346a(new C1068r(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: s */
    public void mo1311s(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC1034e0) obj).mo1357A(new C1070s(this, rect));
        }
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: t */
    public void mo1310t(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m2024j(view, rect);
            ((AbstractC1034e0) obj).mo1357A(new C1064p(this, rect));
        }
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: w */
    public void mo1309w(Object obj, View view, ArrayList arrayList) {
        C1058m0 c1058m0 = (C1058m0) obj;
        ArrayList arrayList2 = c1058m0.f3934j;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC0695g2.m2028d(arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        mo1321b(c1058m0, arrayList);
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: x */
    public void mo1308x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C1058m0 c1058m0 = (C1058m0) obj;
        if (c1058m0 != null) {
            c1058m0.f3934j.clear();
            c1058m0.f3934j.addAll(arrayList2);
            mo1314p(c1058m0, arrayList, arrayList2);
        }
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: y */
    public Object mo1307y(Object obj) {
        if (obj == null) {
            return null;
        }
        C1058m0 c1058m0 = new C1058m0();
        c1058m0.m1351H((AbstractC1034e0) obj);
        return c1058m0;
    }
}