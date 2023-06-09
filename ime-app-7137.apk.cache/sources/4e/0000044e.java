package p010b.p083u.p084e;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: b.u.e.o */
/* loaded from: classes.dex */
public class C0970o extends AbstractC0956k1 {

    /* renamed from: g */
    public static TimeInterpolator f3734g;

    /* renamed from: h */
    public boolean f3735h = true;

    /* renamed from: i */
    public ArrayList f3736i = new ArrayList();

    /* renamed from: j */
    public ArrayList f3737j = new ArrayList();

    /* renamed from: k */
    public ArrayList f3738k = new ArrayList();

    /* renamed from: l */
    public ArrayList f3739l = new ArrayList();

    /* renamed from: m */
    public ArrayList f3740m = new ArrayList();

    /* renamed from: n */
    public ArrayList f3741n = new ArrayList();

    /* renamed from: o */
    public ArrayList f3742o = new ArrayList();

    /* renamed from: p */
    public ArrayList f3743p = new ArrayList();

    /* renamed from: q */
    public ArrayList f3744q = new ArrayList();

    /* renamed from: r */
    public ArrayList f3745r = new ArrayList();

    /* renamed from: s */
    public ArrayList f3746s = new ArrayList();

    @Override // p010b.p083u.p084e.AbstractC0956k1
    /* renamed from: a */
    public boolean mo1611a(AbstractC0941g2 abstractC0941g2, AbstractC0941g2 abstractC0941g22, C0952j1 c0952j1, C0952j1 c0952j12) {
        int i;
        int i2;
        int i3 = c0952j1.f3645a;
        int i4 = c0952j1.f3646b;
        if (abstractC0941g22.m1651v()) {
            int i5 = c0952j1.f3645a;
            i2 = c0952j1.f3646b;
            i = i5;
        } else {
            i = c0952j12.f3645a;
            i2 = c0952j12.f3646b;
        }
        if (abstractC0941g2 == abstractC0941g22) {
            return m1607i(abstractC0941g2, i3, i4, i, i2);
        }
        float translationX = abstractC0941g2.f3605c.getTranslationX();
        float translationY = abstractC0941g2.f3605c.getTranslationY();
        float alpha = abstractC0941g2.f3605c.getAlpha();
        m1602n(abstractC0941g2);
        abstractC0941g2.f3605c.setTranslationX(translationX);
        abstractC0941g2.f3605c.setTranslationY(translationY);
        abstractC0941g2.f3605c.setAlpha(alpha);
        m1602n(abstractC0941g22);
        abstractC0941g22.f3605c.setTranslationX(-((int) ((i - i3) - translationX)));
        abstractC0941g22.f3605c.setTranslationY(-((int) ((i2 - i4) - translationY)));
        abstractC0941g22.f3605c.setAlpha(0.0f);
        this.f3739l.add(new C0962m(abstractC0941g2, abstractC0941g22, i3, i4, i, i2));
        return true;
    }

    @Override // p010b.p083u.p084e.AbstractC0956k1
    /* renamed from: e */
    public void mo1610e(AbstractC0941g2 abstractC0941g2) {
        View view = abstractC0941g2.f3605c;
        view.animate().cancel();
        int size = this.f3738k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C0966n) this.f3738k.get(size)).f3723a == abstractC0941g2) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m1631c(abstractC0941g2);
                this.f3738k.remove(size);
            }
        }
        m1604l(this.f3739l, abstractC0941g2);
        if (this.f3736i.remove(abstractC0941g2)) {
            view.setAlpha(1.0f);
            m1631c(abstractC0941g2);
        }
        if (this.f3737j.remove(abstractC0941g2)) {
            view.setAlpha(1.0f);
            m1631c(abstractC0941g2);
        }
        int size2 = this.f3742o.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) this.f3742o.get(size2);
            m1604l(arrayList, abstractC0941g2);
            if (arrayList.isEmpty()) {
                this.f3742o.remove(size2);
            }
        }
        int size3 = this.f3741n.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) this.f3741n.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((C0966n) arrayList2.get(size4)).f3723a == abstractC0941g2) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m1631c(abstractC0941g2);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f3741n.remove(size3);
                    }
                }
            }
        }
        int size5 = this.f3740m.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                this.f3745r.remove(abstractC0941g2);
                this.f3743p.remove(abstractC0941g2);
                this.f3746s.remove(abstractC0941g2);
                this.f3744q.remove(abstractC0941g2);
                m1605k();
                return;
            }
            ArrayList arrayList3 = (ArrayList) this.f3740m.get(size5);
            if (arrayList3.remove(abstractC0941g2)) {
                view.setAlpha(1.0f);
                m1631c(abstractC0941g2);
                if (arrayList3.isEmpty()) {
                    this.f3740m.remove(size5);
                }
            }
        }
    }

    @Override // p010b.p083u.p084e.AbstractC0956k1
    /* renamed from: f */
    public void mo1609f() {
        int size = this.f3738k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0966n c0966n = (C0966n) this.f3738k.get(size);
            View view = c0966n.f3723a.f3605c;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m1631c(c0966n.f3723a);
            this.f3738k.remove(size);
        }
        int size2 = this.f3736i.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            m1631c((AbstractC0941g2) this.f3736i.get(size2));
            this.f3736i.remove(size2);
        }
        int size3 = this.f3737j.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractC0941g2 abstractC0941g2 = (AbstractC0941g2) this.f3737j.get(size3);
            abstractC0941g2.f3605c.setAlpha(1.0f);
            m1631c(abstractC0941g2);
            this.f3737j.remove(size3);
        }
        int size4 = this.f3739l.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C0962m c0962m = (C0962m) this.f3739l.get(size4);
            AbstractC0941g2 abstractC0941g22 = c0962m.f3707a;
            if (abstractC0941g22 != null) {
                m1603m(c0962m, abstractC0941g22);
            }
            AbstractC0941g2 abstractC0941g23 = c0962m.f3708b;
            if (abstractC0941g23 != null) {
                m1603m(c0962m, abstractC0941g23);
            }
        }
        this.f3739l.clear();
        if (!mo1608g()) {
            return;
        }
        int size5 = this.f3741n.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) this.f3741n.get(size5);
            int size6 = arrayList.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    C0966n c0966n2 = (C0966n) arrayList.get(size6);
                    View view2 = c0966n2.f3723a.f3605c;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m1631c(c0966n2.f3723a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f3741n.remove(arrayList);
                    }
                }
            }
        }
        int size7 = this.f3740m.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) this.f3740m.get(size7);
            int size8 = arrayList2.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    AbstractC0941g2 abstractC0941g24 = (AbstractC0941g2) arrayList2.get(size8);
                    abstractC0941g24.f3605c.setAlpha(1.0f);
                    m1631c(abstractC0941g24);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f3740m.remove(arrayList2);
                    }
                }
            }
        }
        int size9 = this.f3742o.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                m1606j(this.f3745r);
                m1606j(this.f3744q);
                m1606j(this.f3743p);
                m1606j(this.f3746s);
                m1630d();
                return;
            }
            ArrayList arrayList3 = (ArrayList) this.f3742o.get(size9);
            int size10 = arrayList3.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    C0962m c0962m2 = (C0962m) arrayList3.get(size10);
                    AbstractC0941g2 abstractC0941g25 = c0962m2.f3707a;
                    if (abstractC0941g25 != null) {
                        m1603m(c0962m2, abstractC0941g25);
                    }
                    AbstractC0941g2 abstractC0941g26 = c0962m2.f3708b;
                    if (abstractC0941g26 != null) {
                        m1603m(c0962m2, abstractC0941g26);
                    }
                    if (arrayList3.isEmpty()) {
                        this.f3742o.remove(arrayList3);
                    }
                }
            }
        }
    }

    @Override // p010b.p083u.p084e.AbstractC0956k1
    /* renamed from: g */
    public boolean mo1608g() {
        return (this.f3737j.isEmpty() && this.f3739l.isEmpty() && this.f3738k.isEmpty() && this.f3736i.isEmpty() && this.f3744q.isEmpty() && this.f3745r.isEmpty() && this.f3743p.isEmpty() && this.f3746s.isEmpty() && this.f3741n.isEmpty() && this.f3740m.isEmpty() && this.f3742o.isEmpty()) ? false : true;
    }

    /* renamed from: i */
    public boolean m1607i(AbstractC0941g2 abstractC0941g2, int i, int i2, int i3, int i4) {
        View view = abstractC0941g2.f3605c;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC0941g2.f3605c.getTranslationY());
        m1602n(abstractC0941g2);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            m1631c(abstractC0941g2);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.f3738k.add(new C0966n(abstractC0941g2, translationX, translationY, i3, i4));
        return true;
    }

    /* renamed from: j */
    public void m1606j(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ((AbstractC0941g2) list.get(size)).f3605c.animate().cancel();
        }
    }

    /* renamed from: k */
    public void m1605k() {
        if (mo1608g()) {
            return;
        }
        m1630d();
    }

    /* renamed from: l */
    public final void m1604l(List list, AbstractC0941g2 abstractC0941g2) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C0962m c0962m = (C0962m) list.get(size);
            if (m1603m(c0962m, abstractC0941g2) && c0962m.f3707a == null && c0962m.f3708b == null) {
                list.remove(c0962m);
            }
        }
    }

    /* renamed from: m */
    public final boolean m1603m(C0962m c0962m, AbstractC0941g2 abstractC0941g2) {
        if (c0962m.f3708b == abstractC0941g2) {
            c0962m.f3708b = null;
        } else if (c0962m.f3707a != abstractC0941g2) {
            return false;
        } else {
            c0962m.f3707a = null;
        }
        abstractC0941g2.f3605c.setAlpha(1.0f);
        abstractC0941g2.f3605c.setTranslationX(0.0f);
        abstractC0941g2.f3605c.setTranslationY(0.0f);
        m1631c(abstractC0941g2);
        return true;
    }

    /* renamed from: n */
    public final void m1602n(AbstractC0941g2 abstractC0941g2) {
        if (f3734g == null) {
            f3734g = new ValueAnimator().getInterpolator();
        }
        abstractC0941g2.f3605c.animate().setInterpolator(f3734g);
        mo1610e(abstractC0941g2);
    }
}