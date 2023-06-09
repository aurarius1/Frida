package p010b.p086w;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.os.Build;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import p010b.p036g.AbstractC0381e;
import p010b.p036g.C0378b;
import p010b.p036g.C0382f;
import p010b.p046j.p058l.AbstractC0605j0;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.w.e0 */
/* loaded from: classes.dex */
public abstract class AbstractC1034e0 implements Cloneable {

    /* renamed from: b */
    public static final int[] f3926b = {2, 1, 3, 4};

    /* renamed from: c */
    public static final C1082y f3927c = new C1082y();

    /* renamed from: d */
    public static ThreadLocal f3928d = new ThreadLocal();

    /* renamed from: o */
    public ArrayList f3939o;

    /* renamed from: p */
    public ArrayList f3940p;

    /* renamed from: w */
    public AbstractC1028c0 f3947w;

    /* renamed from: e */
    public String f3929e = getClass().getName();

    /* renamed from: f */
    public long f3930f = -1;

    /* renamed from: g */
    public long f3931g = -1;

    /* renamed from: h */
    public TimeInterpolator f3932h = null;

    /* renamed from: i */
    public ArrayList f3933i = new ArrayList();

    /* renamed from: j */
    public ArrayList f3934j = new ArrayList();

    /* renamed from: k */
    public C1065p0 f3935k = new C1065p0();

    /* renamed from: l */
    public C1065p0 f3936l = new C1065p0();

    /* renamed from: m */
    public C1058m0 f3937m = null;

    /* renamed from: n */
    public int[] f3938n = f3926b;

    /* renamed from: q */
    public ArrayList f3941q = new ArrayList();

    /* renamed from: r */
    public int f3942r = 0;

    /* renamed from: s */
    public boolean f3943s = false;

    /* renamed from: t */
    public boolean f3944t = false;

    /* renamed from: u */
    public ArrayList f3945u = null;

    /* renamed from: v */
    public ArrayList f3946v = new ArrayList();

    /* renamed from: x */
    public C1082y f3948x = f3927c;

    /* renamed from: c */
    public static void m1380c(C1065p0 c1065p0, View view, C1063o0 c1063o0) {
        c1065p0.f4016a.put(view, c1063o0);
        int id = view.getId();
        if (id >= 0) {
            if (c1065p0.f4017b.indexOfKey(id) >= 0) {
                c1065p0.f4017b.put(id, null);
            } else {
                c1065p0.f4017b.put(id, view);
            }
        }
        String m2235w = AbstractC0605j0.m2235w(view);
        if (m2235w != null) {
            if (c1065p0.f4019d.m2619e(m2235w) >= 0) {
                c1065p0.f4019d.put(m2235w, null);
            } else {
                c1065p0.f4019d.put(m2235w, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C0382f c0382f = c1065p0.f4018c;
                if (c0382f.f1911c) {
                    c0382f.m2645d();
                }
                if (AbstractC0381e.m2653b(c0382f.f1912d, c0382f.f1914f, itemIdAtPosition) < 0) {
                    AbstractC0605j0.m2264S(view, true);
                    c1065p0.f4018c.m2642g(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c1065p0.f4018c.m2644e(itemIdAtPosition);
                if (view2 != null) {
                    AbstractC0605j0.m2264S(view2, false);
                    c1065p0.f4018c.m2642g(itemIdAtPosition, null);
                }
            }
        }
    }

    /* renamed from: o */
    public static C0378b m1374o() {
        C0378b c0378b = (C0378b) f3928d.get();
        if (c0378b == null) {
            C0378b c0378b2 = new C0378b();
            f3928d.set(c0378b2);
            return c0378b2;
        }
        return c0378b;
    }

    /* renamed from: t */
    public static boolean m1371t(C1063o0 c1063o0, C1063o0 c1063o02, String str) {
        Object obj = c1063o0.f4013a.get(str);
        Object obj2 = c1063o02.f4013a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: A */
    public void mo1357A(AbstractC1028c0 abstractC1028c0) {
        this.f3947w = abstractC1028c0;
    }

    /* renamed from: B */
    public AbstractC1034e0 mo1356B(TimeInterpolator timeInterpolator) {
        this.f3932h = timeInterpolator;
        return this;
    }

    /* renamed from: C */
    public void mo1355C(C1082y c1082y) {
        if (c1082y == null) {
            c1082y = f3927c;
        }
        this.f3948x = c1082y;
    }

    /* renamed from: D */
    public void mo1354D(AbstractC1049j0 abstractC1049j0) {
    }

    /* renamed from: E */
    public AbstractC1034e0 mo1353E(long j) {
        this.f3930f = j;
        return this;
    }

    /* renamed from: F */
    public void m1381F() {
        if (this.f3942r == 0) {
            ArrayList arrayList = this.f3945u;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f3945u.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC1031d0) arrayList2.get(i)).mo1326c(this);
                }
            }
            this.f3944t = false;
        }
        this.f3942r++;
    }

    /* renamed from: G */
    public String mo1352G(String str) {
        StringBuilder m1187i = AbstractC1124a.m1187i(str);
        m1187i.append(getClass().getSimpleName());
        m1187i.append("@");
        m1187i.append(Integer.toHexString(hashCode()));
        m1187i.append(": ");
        String sb = m1187i.toString();
        if (this.f3931g != -1) {
            sb = sb + "dur(" + this.f3931g + ") ";
        }
        if (this.f3930f != -1) {
            sb = sb + "dly(" + this.f3930f + ") ";
        }
        if (this.f3932h != null) {
            sb = sb + "interp(" + this.f3932h + ") ";
        }
        if (this.f3933i.size() > 0 || this.f3934j.size() > 0) {
            String m1190f = AbstractC1124a.m1190f(sb, "tgts(");
            if (this.f3933i.size() > 0) {
                for (int i = 0; i < this.f3933i.size(); i++) {
                    if (i > 0) {
                        m1190f = AbstractC1124a.m1190f(m1190f, ", ");
                    }
                    StringBuilder m1187i2 = AbstractC1124a.m1187i(m1190f);
                    m1187i2.append(this.f3933i.get(i));
                    m1190f = m1187i2.toString();
                }
            }
            if (this.f3934j.size() > 0) {
                for (int i2 = 0; i2 < this.f3934j.size(); i2++) {
                    if (i2 > 0) {
                        m1190f = AbstractC1124a.m1190f(m1190f, ", ");
                    }
                    StringBuilder m1187i3 = AbstractC1124a.m1187i(m1190f);
                    m1187i3.append(this.f3934j.get(i2));
                    m1190f = m1187i3.toString();
                }
            }
            return AbstractC1124a.m1190f(m1190f, ")");
        }
        return sb;
    }

    /* renamed from: a */
    public AbstractC1034e0 mo1346a(InterfaceC1031d0 interfaceC1031d0) {
        if (this.f3945u == null) {
            this.f3945u = new ArrayList();
        }
        this.f3945u.add(interfaceC1031d0);
        return this;
    }

    /* renamed from: b */
    public AbstractC1034e0 mo1345b(View view) {
        this.f3934j.add(view);
        return this;
    }

    /* renamed from: d */
    public abstract void mo770d(C1063o0 c1063o0);

    /* renamed from: e */
    public final void m1379e(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C1063o0 c1063o0 = new C1063o0(view);
            if (z) {
                mo769g(c1063o0);
            } else {
                mo770d(c1063o0);
            }
            c1063o0.f4015c.add(this);
            mo1344f(c1063o0);
            m1380c(z ? this.f3935k : this.f3936l, view, c1063o0);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m1379e(viewGroup.getChildAt(i), z);
            }
        }
    }

    /* renamed from: f */
    public void mo1344f(C1063o0 c1063o0) {
    }

    /* renamed from: g */
    public abstract void mo769g(C1063o0 c1063o0);

    /* renamed from: h */
    public void m1378h(ViewGroup viewGroup, boolean z) {
        m1377i(z);
        if (this.f3933i.size() <= 0 && this.f3934j.size() <= 0) {
            m1379e(viewGroup, z);
            return;
        }
        for (int i = 0; i < this.f3933i.size(); i++) {
            View findViewById = viewGroup.findViewById(((Integer) this.f3933i.get(i)).intValue());
            if (findViewById != null) {
                C1063o0 c1063o0 = new C1063o0(findViewById);
                if (z) {
                    mo769g(c1063o0);
                } else {
                    mo770d(c1063o0);
                }
                c1063o0.f4015c.add(this);
                mo1344f(c1063o0);
                m1380c(z ? this.f3935k : this.f3936l, findViewById, c1063o0);
            }
        }
        for (int i2 = 0; i2 < this.f3934j.size(); i2++) {
            View view = (View) this.f3934j.get(i2);
            C1063o0 c1063o02 = new C1063o0(view);
            if (z) {
                mo769g(c1063o02);
            } else {
                mo770d(c1063o02);
            }
            c1063o02.f4015c.add(this);
            mo1344f(c1063o02);
            m1380c(z ? this.f3935k : this.f3936l, view, c1063o02);
        }
    }

    /* renamed from: i */
    public void m1377i(boolean z) {
        C1065p0 c1065p0;
        if (z) {
            this.f3935k.f4016a.clear();
            this.f3935k.f4017b.clear();
            c1065p0 = this.f3935k;
        } else {
            this.f3936l.f4016a.clear();
            this.f3936l.f4017b.clear();
            c1065p0 = this.f3936l;
        }
        c1065p0.f4018c.m2647b();
    }

    /* JADX DEBUG: Method merged with bridge method */
    @Override // 
    /* renamed from: j */
    public AbstractC1034e0 clone() {
        try {
            AbstractC1034e0 abstractC1034e0 = (AbstractC1034e0) super.clone();
            abstractC1034e0.f3946v = new ArrayList();
            abstractC1034e0.f3935k = new C1065p0();
            abstractC1034e0.f3936l = new C1065p0();
            abstractC1034e0.f3939o = null;
            abstractC1034e0.f3940p = null;
            return abstractC1034e0;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: k */
    public Animator mo768k(ViewGroup viewGroup, C1063o0 c1063o0, C1063o0 c1063o02) {
        return null;
    }

    /* renamed from: l */
    public void mo1342l(ViewGroup viewGroup, C1065p0 c1065p0, C1065p0 c1065p02, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        View view;
        Animator animator;
        C1063o0 c1063o0;
        Animator animator2;
        C1063o0 c1063o02;
        C0378b m1374o = m1374o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            C1063o0 c1063o03 = (C1063o0) arrayList.get(i2);
            C1063o0 c1063o04 = (C1063o0) arrayList2.get(i2);
            if (c1063o03 != null && !c1063o03.f4015c.contains(this)) {
                c1063o03 = null;
            }
            if (c1063o04 != null && !c1063o04.f4015c.contains(this)) {
                c1063o04 = null;
            }
            if (c1063o03 != null || c1063o04 != null) {
                if (c1063o03 == null || c1063o04 == null || mo1330r(c1063o03, c1063o04)) {
                    Animator mo768k = mo768k(viewGroup, c1063o03, c1063o04);
                    if (mo768k != null) {
                        if (c1063o04 != null) {
                            View view2 = c1063o04.f4014b;
                            String[] mo1331p = mo1331p();
                            if (mo1331p != null && mo1331p.length > 0) {
                                c1063o02 = new C1063o0(view2);
                                C1063o0 c1063o05 = (C1063o0) c1065p02.f4016a.get(view2);
                                if (c1063o05 != null) {
                                    int i3 = 0;
                                    while (i3 < mo1331p.length) {
                                        c1063o02.f4013a.put(mo1331p[i3], c1063o05.f4013a.get(mo1331p[i3]));
                                        i3++;
                                        mo768k = mo768k;
                                        size = size;
                                        c1063o05 = c1063o05;
                                    }
                                }
                                Animator animator3 = mo768k;
                                i = size;
                                int i4 = m1374o.f1943h;
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= i4) {
                                        animator2 = animator3;
                                        break;
                                    }
                                    C1025b0 c1025b0 = (C1025b0) m1374o.get((Animator) m1374o.m2616h(i5));
                                    if (c1025b0.f3918c != null && c1025b0.f3916a == view2 && c1025b0.f3917b.equals(this.f3929e) && c1025b0.f3918c.equals(c1063o02)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i5++;
                                }
                            } else {
                                i = size;
                                animator2 = mo768k;
                                c1063o02 = null;
                            }
                            view = view2;
                            animator = animator2;
                            c1063o0 = c1063o02;
                        } else {
                            i = size;
                            view = c1063o03.f4014b;
                            animator = mo768k;
                            c1063o0 = null;
                        }
                        if (animator != null) {
                            m1374o.put(animator, new C1025b0(view, this.f3929e, this, AbstractC1023a1.m1383b(viewGroup), c1063o0));
                            this.f3946v.add(animator);
                        }
                        i2++;
                        size = i;
                    }
                    i = size;
                    i2++;
                    size = i;
                }
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator4 = (Animator) this.f3946v.get(sparseIntArray.keyAt(i6));
                animator4.setStartDelay(animator4.getStartDelay() + (sparseIntArray.valueAt(i6) - Long.MAX_VALUE));
            }
        }
    }

    /* renamed from: m */
    public void m1376m() {
        int i = this.f3942r - 1;
        this.f3942r = i;
        if (i == 0) {
            ArrayList arrayList = this.f3945u;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f3945u.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((InterfaceC1031d0) arrayList2.get(i2)).mo1325e(this);
                }
            }
            for (int i3 = 0; i3 < this.f3935k.f4018c.m2641h(); i3++) {
                View view = (View) this.f3935k.f4018c.m2640i(i3);
                if (view != null) {
                    AbstractC0605j0.m2264S(view, false);
                }
            }
            for (int i4 = 0; i4 < this.f3936l.f4018c.m2641h(); i4++) {
                View view2 = (View) this.f3936l.f4018c.m2640i(i4);
                if (view2 != null) {
                    AbstractC0605j0.m2264S(view2, false);
                }
            }
            this.f3944t = true;
        }
    }

    /* renamed from: n */
    public C1063o0 m1375n(View view, boolean z) {
        C1058m0 c1058m0 = this.f3937m;
        if (c1058m0 != null) {
            return c1058m0.m1375n(view, z);
        }
        ArrayList arrayList = z ? this.f3939o : this.f3940p;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C1063o0 c1063o0 = (C1063o0) arrayList.get(i2);
            if (c1063o0 == null) {
                return null;
            }
            if (c1063o0.f4014b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i >= 0) {
            return (C1063o0) (z ? this.f3940p : this.f3939o).get(i);
        }
        return null;
    }

    /* renamed from: p */
    public String[] mo1331p() {
        return null;
    }

    /* renamed from: q */
    public C1063o0 m1373q(View view, boolean z) {
        C1058m0 c1058m0 = this.f3937m;
        if (c1058m0 != null) {
            return c1058m0.m1373q(view, z);
        }
        return (C1063o0) (z ? this.f3935k : this.f3936l).f4016a.getOrDefault(view, null);
    }

    /* renamed from: r */
    public boolean mo1330r(C1063o0 c1063o0, C1063o0 c1063o02) {
        if (c1063o0 == null || c1063o02 == null) {
            return false;
        }
        String[] mo1331p = mo1331p();
        if (mo1331p == null) {
            for (String str : c1063o0.f4013a.keySet()) {
                if (m1371t(c1063o0, c1063o02, str)) {
                }
            }
            return false;
        }
        for (String str2 : mo1331p) {
            if (!m1371t(c1063o0, c1063o02, str2)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: s */
    public boolean m1372s(View view) {
        return (this.f3933i.size() == 0 && this.f3934j.size() == 0) || this.f3933i.contains(Integer.valueOf(view.getId())) || this.f3934j.contains(view);
    }

    public String toString() {
        return mo1352G("");
    }

    /* renamed from: u */
    public void mo1341u(View view) {
        int i;
        if (this.f3944t) {
            return;
        }
        C0378b m1374o = m1374o();
        int i2 = m1374o.f1943h;
        InterfaceC1059m1 m1383b = AbstractC1023a1.m1383b(view);
        int i3 = i2 - 1;
        while (true) {
            i = 0;
            if (i3 < 0) {
                break;
            }
            C1025b0 c1025b0 = (C1025b0) m1374o.m2613k(i3);
            if (c1025b0.f3916a != null && m1383b.equals(c1025b0.f3919d)) {
                Animator animator = (Animator) m1374o.m2616h(i3);
                if (Build.VERSION.SDK_INT >= 19) {
                    animator.pause();
                } else {
                    ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
                    if (listeners != null) {
                        int size = listeners.size();
                        while (i < size) {
                            Animator.AnimatorListener animatorListener = listeners.get(i);
                            if (animatorListener instanceof InterfaceC1021a) {
                                C1047i1 c1047i1 = (C1047i1) ((InterfaceC1021a) animatorListener);
                                if (!c1047i1.f3971f) {
                                    AbstractC1023a1.f3914a.mo1365f(c1047i1.f3966a, c1047i1.f3967b);
                                }
                            }
                            i++;
                        }
                    }
                }
            }
            i3--;
        }
        ArrayList arrayList = this.f3945u;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f3945u.clone();
            int size2 = arrayList2.size();
            while (i < size2) {
                ((InterfaceC1031d0) arrayList2.get(i)).mo1329a(this);
                i++;
            }
        }
        this.f3943s = true;
    }

    /* renamed from: v */
    public AbstractC1034e0 mo1340v(InterfaceC1031d0 interfaceC1031d0) {
        ArrayList arrayList = this.f3945u;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(interfaceC1031d0);
        if (this.f3945u.size() == 0) {
            this.f3945u = null;
        }
        return this;
    }

    /* renamed from: w */
    public AbstractC1034e0 mo1339w(View view) {
        this.f3934j.remove(view);
        return this;
    }

    /* renamed from: x */
    public void mo1338x(View view) {
        if (this.f3943s) {
            if (!this.f3944t) {
                C0378b m1374o = m1374o();
                int i = m1374o.f1943h;
                InterfaceC1059m1 m1383b = AbstractC1023a1.m1383b(view);
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    C1025b0 c1025b0 = (C1025b0) m1374o.m2613k(i2);
                    if (c1025b0.f3916a != null && m1383b.equals(c1025b0.f3919d)) {
                        Animator animator = (Animator) m1374o.m2616h(i2);
                        if (Build.VERSION.SDK_INT >= 19) {
                            animator.resume();
                        } else {
                            ArrayList<Animator.AnimatorListener> listeners = animator.getListeners();
                            if (listeners != null) {
                                int size = listeners.size();
                                for (int i3 = 0; i3 < size; i3++) {
                                    Animator.AnimatorListener animatorListener = listeners.get(i3);
                                    if (animatorListener instanceof InterfaceC1021a) {
                                        C1047i1 c1047i1 = (C1047i1) ((InterfaceC1021a) animatorListener);
                                        if (!c1047i1.f3971f) {
                                            AbstractC1023a1.f3914a.mo1365f(c1047i1.f3966a, 0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                ArrayList arrayList = this.f3945u;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f3945u.clone();
                    int size2 = arrayList2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        ((InterfaceC1031d0) arrayList2.get(i4)).mo1328b(this);
                    }
                }
            }
            this.f3943s = false;
        }
    }

    /* renamed from: y */
    public void mo1337y() {
        m1381F();
        C0378b m1374o = m1374o();
        Iterator it = this.f3946v.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (m1374o.containsKey(animator)) {
                m1381F();
                if (animator != null) {
                    animator.addListener(new C1084z(this, m1374o));
                    long j = this.f3931g;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.f3930f;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f3932h;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C1022a0(this));
                    animator.start();
                }
            }
        }
        this.f3946v.clear();
        m1376m();
    }

    /* renamed from: z */
    public AbstractC1034e0 mo1336z(long j) {
        this.f3931g = j;
        return this;
    }
}