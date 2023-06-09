package p010b.p067m.p068d;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p010b.p036g.AbstractC0389m;
import p010b.p036g.C0378b;
import p010b.p036g.C0384h;
import p010b.p036g.C0385i;
import p010b.p036g.C0387k;
import p010b.p036g.C0388l;
import p010b.p046j.p054h.C0529b;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.ViewTreeObserver$OnPreDrawListenerC0626u;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.m.d.p */
/* loaded from: classes.dex */
public class C0728p extends AbstractC0743s2 {
    public C0728p(ViewGroup viewGroup) {
        super(viewGroup);
    }

    @Override // p010b.p067m.p068d.AbstractC0743s2
    /* renamed from: b */
    public void mo1949b(List list, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        HashMap hashMap;
        EnumC0739r2 enumC0739r2;
        Iterator it;
        C0727o2 c0727o2;
        Object obj;
        EnumC0739r2 enumC0739r22;
        View view;
        EnumC0739r2 enumC0739r23;
        View view2;
        Object mo1316m;
        C0727o2 c0727o22;
        C0378b c0378b;
        ArrayList arrayList3;
        EnumC0739r2 enumC0739r24;
        C0727o2 c0727o23;
        ArrayList arrayList4;
        ArrayList arrayList5;
        HashMap hashMap2;
        View view3;
        ArrayList arrayList6;
        AbstractC0695g2 abstractC0695g2;
        Rect rect;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        View view4;
        View view5;
        StringBuilder sb;
        String str;
        C0701i0 m2009c;
        boolean z2 = z;
        EnumC0739r2 enumC0739r25 = EnumC0739r2.GONE;
        EnumC0739r2 enumC0739r26 = EnumC0739r2.VISIBLE;
        Iterator it2 = list.iterator();
        C0727o2 c0727o24 = null;
        C0727o2 c0727o25 = null;
        while (it2.hasNext()) {
            C0727o2 c0727o26 = (C0727o2) it2.next();
            EnumC0739r2 m1951c = EnumC0739r2.m1951c(c0727o26.f3089c.f3216I);
            int ordinal = c0727o26.f3087a.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2 && ordinal != 3) {
                    }
                } else if (m1951c != enumC0739r26) {
                    c0727o25 = c0727o26;
                }
            }
            if (m1951c == enumC0739r26 && c0727o24 == null) {
                c0727o24 = c0727o26;
            }
        }
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList(list);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            C0727o2 c0727o27 = (C0727o2) it3.next();
            C0529b c0529b = new C0529b();
            c0727o27.m1972d();
            c0727o27.f3091e.add(c0529b);
            arrayList11.add(new C0716m(c0727o27, c0529b, z2));
            C0529b c0529b2 = new C0529b();
            c0727o27.m1972d();
            c0727o27.f3091e.add(c0529b2);
            arrayList12.add(new C0724o(c0727o27, c0529b2, z2, !z2 ? c0727o27 != c0727o25 : c0727o27 != c0727o24));
            c0727o27.f3090d.add(new RunnableC0676c(this, arrayList13, c0727o27));
        }
        HashMap hashMap3 = new HashMap();
        Iterator it4 = arrayList12.iterator();
        AbstractC0695g2 abstractC0695g22 = null;
        while (it4.hasNext()) {
            C0724o c0724o = (C0724o) it4.next();
            if (!c0724o.m1989b()) {
                AbstractC0695g2 m1976c = c0724o.m1976c(c0724o.f3075c);
                AbstractC0695g2 m1976c2 = c0724o.m1976c(c0724o.f3077e);
                if (m1976c != null && m1976c2 != null && m1976c != m1976c2) {
                    StringBuilder m1187i = AbstractC1124a.m1187i("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    m1187i.append(c0724o.f3066a.f3089c);
                    m1187i.append(" returned Transition ");
                    m1187i.append(c0724o.f3075c);
                    m1187i.append(" which uses a different Transition  type than its shared element transition ");
                    m1187i.append(c0724o.f3077e);
                    throw new IllegalArgumentException(m1187i.toString());
                }
                if (m1976c == null) {
                    m1976c = m1976c2;
                }
                if (abstractC0695g22 == null) {
                    abstractC0695g22 = m1976c;
                } else if (m1976c != null && abstractC0695g22 != m1976c) {
                    StringBuilder m1187i2 = AbstractC1124a.m1187i("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    m1187i2.append(c0724o.f3066a.f3089c);
                    m1187i2.append(" returned Transition ");
                    m1187i2.append(c0724o.f3075c);
                    m1187i2.append(" which uses a different Transition  type than other Fragments.");
                    throw new IllegalArgumentException(m1187i2.toString());
                }
            }
        }
        if (abstractC0695g22 == null) {
            Iterator it5 = arrayList12.iterator();
            while (it5.hasNext()) {
                C0724o c0724o2 = (C0724o) it5.next();
                hashMap3.put(c0724o2.f3066a, Boolean.FALSE);
                c0724o2.m1990a();
            }
            arrayList = arrayList11;
            arrayList2 = arrayList13;
            enumC0739r2 = enumC0739r25;
            hashMap = hashMap3;
        } else {
            View view6 = new View(this.f3127a.getContext());
            Rect rect2 = new Rect();
            ArrayList arrayList14 = new ArrayList();
            ArrayList arrayList15 = new ArrayList();
            C0378b c0378b2 = new C0378b();
            Iterator it6 = arrayList12.iterator();
            Rect rect3 = rect2;
            arrayList = arrayList11;
            Object obj2 = null;
            View view7 = null;
            boolean z3 = false;
            View view8 = view6;
            C0727o2 c0727o28 = c0727o24;
            C0727o2 c0727o29 = c0727o25;
            while (it6.hasNext()) {
                EnumC0739r2 enumC0739r27 = enumC0739r26;
                Object obj3 = ((C0724o) it6.next()).f3077e;
                if (!(obj3 != null) || c0727o28 == null || c0727o29 == null) {
                    c0378b = c0378b2;
                    arrayList3 = arrayList14;
                    enumC0739r24 = enumC0739r25;
                    c0727o23 = c0727o24;
                    arrayList4 = arrayList12;
                    arrayList5 = arrayList13;
                    hashMap2 = hashMap3;
                    view3 = view8;
                    arrayList6 = arrayList15;
                    abstractC0695g2 = abstractC0695g22;
                    rect = rect3;
                } else {
                    Object mo1307y = abstractC0695g22.mo1307y(abstractC0695g22.mo1318g(obj3));
                    C0757x c0757x = c0727o29.f3089c.f3219L;
                    if (c0757x == null || (arrayList7 = c0757x.f3194i) == null) {
                        arrayList7 = new ArrayList();
                    }
                    AbstractC0695g2 abstractC0695g23 = abstractC0695g22;
                    C0757x c0757x2 = c0727o28.f3089c.f3219L;
                    if (c0757x2 == null || (arrayList8 = c0757x2.f3194i) == null) {
                        arrayList8 = new ArrayList();
                    }
                    arrayList5 = arrayList13;
                    C0757x c0757x3 = c0727o28.f3089c.f3219L;
                    if (c0757x3 == null || (arrayList9 = c0757x3.f3195j) == null) {
                        arrayList9 = new ArrayList();
                    }
                    enumC0739r24 = enumC0739r25;
                    arrayList4 = arrayList12;
                    int i = 0;
                    while (i < arrayList9.size()) {
                        int indexOf = arrayList7.indexOf(arrayList9.get(i));
                        ArrayList arrayList16 = arrayList9;
                        if (indexOf != -1) {
                            arrayList7.set(indexOf, arrayList8.get(i));
                        }
                        i++;
                        arrayList9 = arrayList16;
                    }
                    C0757x c0757x4 = c0727o29.f3089c.f3219L;
                    if (c0757x4 == null || (arrayList10 = c0757x4.f3195j) == null) {
                        arrayList10 = new ArrayList();
                    }
                    ArrayList arrayList17 = arrayList10;
                    if (!z2) {
                        c0727o28.f3089c.m1859q();
                        c0727o29.f3089c.m1862n();
                    } else {
                        c0727o28.f3089c.m1862n();
                        c0727o29.f3089c.m1859q();
                    }
                    int i2 = 0;
                    for (int size = arrayList7.size(); i2 < size; size = size) {
                        c0378b2.put((String) arrayList7.get(i2), (String) arrayList17.get(i2));
                        i2++;
                    }
                    C0378b c0378b3 = new C0378b();
                    m1970k(c0378b3, c0727o28.f3089c.f3216I);
                    AbstractC0389m.m2626k(c0378b3, arrayList7);
                    AbstractC0389m.m2626k(c0378b2, c0378b3.keySet());
                    C0378b c0378b4 = new C0378b();
                    m1970k(c0378b4, c0727o29.f3089c.f3216I);
                    AbstractC0389m.m2626k(c0378b4, arrayList17);
                    AbstractC0389m.m2626k(c0378b4, c0378b2.values());
                    AbstractC0756w1.m1919m(c0378b2, c0378b4);
                    m1969l(c0378b3, c0378b2.keySet());
                    m1969l(c0378b4, c0378b2.values());
                    if (c0378b2.isEmpty()) {
                        arrayList14.clear();
                        arrayList15.clear();
                        obj2 = null;
                        rect = rect3;
                        c0378b = c0378b2;
                        arrayList3 = arrayList14;
                        c0727o23 = c0727o24;
                        hashMap2 = hashMap3;
                        view3 = view8;
                        abstractC0695g2 = abstractC0695g23;
                        arrayList6 = arrayList15;
                    } else {
                        AbstractC0756w1.m1929c(c0727o29.f3089c, c0727o28.f3089c, z2, c0378b3, true);
                        c0378b = c0378b2;
                        arrayList3 = arrayList14;
                        C0727o2 c0727o210 = c0727o25;
                        C0727o2 c0727o211 = c0727o25;
                        Rect rect4 = rect3;
                        ArrayList arrayList18 = arrayList7;
                        C0727o2 c0727o212 = c0727o24;
                        C0727o2 c0727o213 = c0727o24;
                        HashMap hashMap4 = hashMap3;
                        View view9 = view8;
                        arrayList6 = arrayList15;
                        abstractC0695g2 = abstractC0695g23;
                        ViewTreeObserver$OnPreDrawListenerC0626u.m2198a(this.f3127a, new RunnableC0700i(this, c0727o210, c0727o212, z, c0378b4));
                        Iterator it7 = ((C0388l) c0378b3.values()).iterator();
                        while (true) {
                            C0384h c0384h = (C0384h) it7;
                            if (!c0384h.hasNext()) {
                                break;
                            }
                            m1971j(arrayList3, (View) c0384h.next());
                        }
                        if (arrayList18.isEmpty()) {
                            view4 = view7;
                        } else {
                            view4 = (View) c0378b3.get((String) arrayList18.get(0));
                            abstractC0695g2.mo1310t(mo1307y, view4);
                        }
                        Iterator it8 = ((C0388l) c0378b4.values()).iterator();
                        while (true) {
                            C0384h c0384h2 = (C0384h) it8;
                            if (!c0384h2.hasNext()) {
                                break;
                            }
                            m1971j(arrayList6, (View) c0384h2.next());
                        }
                        if (arrayList17.isEmpty() || (view5 = (View) c0378b4.get((String) arrayList17.get(0))) == null) {
                            rect = rect4;
                        } else {
                            rect = rect4;
                            ViewTreeObserver$OnPreDrawListenerC0626u.m2198a(this.f3127a, new RunnableC0704j(this, abstractC0695g2, view5, rect));
                            z3 = true;
                        }
                        view3 = view9;
                        abstractC0695g2.mo1309w(mo1307y, view3, arrayList3);
                        abstractC0695g2.mo1312r(mo1307y, null, null, null, null, mo1307y, arrayList6);
                        Boolean bool = Boolean.TRUE;
                        c0727o23 = c0727o213;
                        hashMap2 = hashMap4;
                        hashMap2.put(c0727o23, bool);
                        c0727o25 = c0727o211;
                        hashMap2.put(c0727o25, bool);
                        c0727o28 = c0727o23;
                        obj2 = mo1307y;
                        view7 = view4;
                        c0727o29 = c0727o25;
                    }
                }
                view8 = view3;
                rect3 = rect;
                abstractC0695g22 = abstractC0695g2;
                arrayList15 = arrayList6;
                enumC0739r26 = enumC0739r27;
                arrayList13 = arrayList5;
                arrayList12 = arrayList4;
                c0378b2 = c0378b;
                c0727o24 = c0727o23;
                arrayList14 = arrayList3;
                hashMap3 = hashMap2;
                enumC0739r25 = enumC0739r24;
                z2 = z;
            }
            C0378b c0378b5 = c0378b2;
            ArrayList arrayList19 = arrayList14;
            AbstractC0695g2 abstractC0695g24 = abstractC0695g22;
            EnumC0739r2 enumC0739r28 = enumC0739r25;
            EnumC0739r2 enumC0739r29 = enumC0739r26;
            ArrayList arrayList20 = arrayList12;
            arrayList2 = arrayList13;
            hashMap = hashMap3;
            View view10 = view8;
            Rect rect5 = rect3;
            ArrayList arrayList21 = arrayList15;
            ArrayList arrayList22 = new ArrayList();
            Iterator it9 = arrayList20.iterator();
            Object obj4 = null;
            Object obj5 = null;
            while (it9.hasNext()) {
                C0724o c0724o3 = (C0724o) it9.next();
                if (c0724o3.m1989b()) {
                    it = it9;
                    c0727o2 = c0727o25;
                    hashMap.put(c0724o3.f3066a, Boolean.FALSE);
                    c0724o3.m1990a();
                    view = view10;
                    obj = obj2;
                    mo1316m = obj4;
                    c0727o22 = c0727o29;
                    view2 = view7;
                    enumC0739r23 = enumC0739r29;
                    enumC0739r22 = enumC0739r28;
                } else {
                    it = it9;
                    c0727o2 = c0727o25;
                    Object mo1318g = abstractC0695g24.mo1318g(c0724o3.f3075c);
                    C0727o2 c0727o214 = c0724o3.f3066a;
                    boolean z4 = obj2 != null && (c0727o214 == c0727o28 || c0727o214 == c0727o29);
                    if (mo1318g == null) {
                        if (!z4) {
                            hashMap.put(c0727o214, Boolean.FALSE);
                            c0724o3.m1990a();
                        }
                        view = view10;
                        obj = obj2;
                        mo1316m = obj4;
                        view2 = view7;
                        enumC0739r23 = enumC0739r29;
                        enumC0739r22 = enumC0739r28;
                    } else {
                        obj = obj2;
                        ArrayList arrayList23 = new ArrayList();
                        Object obj6 = obj4;
                        m1971j(arrayList23, c0727o214.f3089c.f3216I);
                        if (z4) {
                            if (c0727o214 == c0727o28) {
                                arrayList23.removeAll(arrayList19);
                            } else {
                                arrayList23.removeAll(arrayList21);
                            }
                        }
                        if (arrayList23.isEmpty()) {
                            abstractC0695g24.mo1322a(mo1318g, view10);
                            view = view10;
                            enumC0739r22 = enumC0739r28;
                        } else {
                            abstractC0695g24.mo1321b(mo1318g, arrayList23);
                            abstractC0695g24.mo1312r(mo1318g, mo1318g, arrayList23, null, null, null, null);
                            enumC0739r22 = enumC0739r28;
                            if (c0727o214.f3087a == enumC0739r22) {
                                arrayList2.remove(c0727o214);
                                view = view10;
                                abstractC0695g24.mo1313q(mo1318g, c0727o214.f3089c.f3216I, arrayList23);
                                ViewTreeObserver$OnPreDrawListenerC0626u.m2198a(this.f3127a, new RunnableC0708k(this, arrayList23));
                            } else {
                                view = view10;
                            }
                        }
                        enumC0739r23 = enumC0739r29;
                        if (c0727o214.f3087a == enumC0739r23) {
                            arrayList22.addAll(arrayList23);
                            if (z3) {
                                abstractC0695g24.mo1311s(mo1318g, rect5);
                            }
                            view2 = view7;
                        } else {
                            view2 = view7;
                            abstractC0695g24.mo1310t(mo1318g, view2);
                        }
                        hashMap.put(c0727o214, Boolean.TRUE);
                        if (c0724o3.f3076d) {
                            obj5 = abstractC0695g24.mo1316m(obj5, mo1318g, null);
                            mo1316m = obj6;
                        } else {
                            mo1316m = abstractC0695g24.mo1316m(obj6, mo1318g, null);
                        }
                    }
                    c0727o22 = c0727o2;
                }
                view7 = view2;
                enumC0739r29 = enumC0739r23;
                enumC0739r28 = enumC0739r22;
                view10 = view;
                c0727o25 = c0727o2;
                obj4 = mo1316m;
                c0727o29 = c0727o22;
                obj2 = obj;
                it9 = it;
            }
            C0727o2 c0727o215 = c0727o25;
            enumC0739r2 = enumC0739r28;
            Object mo1317l = abstractC0695g24.mo1317l(obj5, obj4, obj2);
            Iterator it10 = arrayList20.iterator();
            while (it10.hasNext()) {
                C0724o c0724o4 = (C0724o) it10.next();
                if (!c0724o4.m1989b()) {
                    Object obj7 = c0724o4.f3075c;
                    C0727o2 c0727o216 = c0724o4.f3066a;
                    C0727o2 c0727o217 = c0727o215;
                    boolean z5 = obj2 != null && (c0727o216 == c0727o28 || c0727o216 == c0727o217);
                    if (obj7 != null || z5) {
                        if (AbstractC0605j0.m2232z(this.f3127a)) {
                            abstractC0695g24.mo2021u(c0724o4.f3066a.f3089c, mo1317l, c0724o4.f3067b, new RunnableC0712l(this, c0724o4));
                        } else {
                            if (C0690f1.m2078S(2)) {
                                StringBuilder m1187i3 = AbstractC1124a.m1187i("SpecialEffectsController: Container ");
                                m1187i3.append(this.f3127a);
                                m1187i3.append(" has not been laid out. Completing operation ");
                                m1187i3.append(c0727o216);
                                m1187i3.toString();
                            }
                            c0724o4.m1990a();
                        }
                    }
                    c0727o215 = c0727o217;
                }
            }
            if (AbstractC0605j0.m2232z(this.f3127a)) {
                AbstractC0756w1.m1917o(arrayList22, 4);
                ArrayList m2022n = abstractC0695g24.m2022n(arrayList21);
                abstractC0695g24.mo1320c(this.f3127a, mo1317l);
                abstractC0695g24.m2020v(this.f3127a, arrayList19, arrayList21, m2022n, c0378b5);
                AbstractC0756w1.m1917o(arrayList22, 0);
                abstractC0695g24.mo1308x(obj2, arrayList19, arrayList21);
            }
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = this.f3127a;
        Context context = viewGroup.getContext();
        ArrayList arrayList24 = new ArrayList();
        Iterator it11 = arrayList.iterator();
        boolean z6 = false;
        while (it11.hasNext()) {
            C0716m c0716m = (C0716m) it11.next();
            if (!c0716m.m1989b() && (m2009c = c0716m.m2009c(context)) != null) {
                Animator animator = m2009c.f3018b;
                if (animator == null) {
                    arrayList24.add(c0716m);
                } else {
                    C0727o2 c0727o218 = c0716m.f3066a;
                    AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = c0727o218.f3089c;
                    if (!Boolean.TRUE.equals(hashMap.get(c0727o218))) {
                        boolean z7 = c0727o218.f3087a == enumC0739r2;
                        ArrayList arrayList25 = arrayList2;
                        if (z7) {
                            arrayList25.remove(c0727o218);
                        }
                        View view11 = abstractComponentCallbacksC0763z.f3216I;
                        viewGroup.startViewTransition(view11);
                        animator.addListener(new C0680d(this, viewGroup, view11, z7, c0727o218, c0716m));
                        animator.setTarget(view11);
                        animator.start();
                        c0716m.f3067b.m2349b(new C0684e(this, animator));
                        z6 = true;
                        arrayList2 = arrayList25;
                        enumC0739r2 = enumC0739r2;
                        hashMap = hashMap;
                    } else if (C0690f1.m2078S(2)) {
                        String str2 = "Ignoring Animator set on " + abstractComponentCallbacksC0763z + " as this Fragment was involved in a Transition.";
                    }
                }
            }
            c0716m.m1990a();
        }
        ArrayList arrayList26 = arrayList2;
        Iterator it12 = arrayList24.iterator();
        while (it12.hasNext()) {
            C0716m c0716m2 = (C0716m) it12.next();
            C0727o2 c0727o219 = c0716m2.f3066a;
            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z2 = c0727o219.f3089c;
            if (containsValue) {
                if (C0690f1.m2078S(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(abstractComponentCallbacksC0763z2);
                    str = " as Animations cannot run alongside Transitions.";
                    sb.append(str);
                    sb.toString();
                }
                c0716m2.m1990a();
            } else if (z6) {
                if (C0690f1.m2078S(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(abstractComponentCallbacksC0763z2);
                    str = " as Animations cannot run alongside Animators.";
                    sb.append(str);
                    sb.toString();
                }
                c0716m2.m1990a();
            } else {
                View view12 = abstractComponentCallbacksC0763z2.f3216I;
                C0701i0 m2009c2 = c0716m2.m2009c(context);
                m2009c2.getClass();
                Animation animation = m2009c2.f3017a;
                animation.getClass();
                if (c0727o219.f3087a != EnumC0739r2.REMOVED) {
                    view12.startAnimation(animation);
                    c0716m2.m1990a();
                } else {
                    viewGroup.startViewTransition(view12);
                    RunnableC0705j0 runnableC0705j0 = new RunnableC0705j0(animation, viewGroup, view12);
                    runnableC0705j0.setAnimationListener(new animationAnimation$AnimationListenerC0692g(this, viewGroup, view12, c0716m2));
                    view12.startAnimation(runnableC0705j0);
                }
                c0716m2.f3067b.m2349b(new C0696h(this, view12, viewGroup, c0716m2));
            }
        }
        Iterator it13 = arrayList26.iterator();
        while (it13.hasNext()) {
            C0727o2 c0727o220 = (C0727o2) it13.next();
            c0727o220.f3087a.m1953a(c0727o220.f3089c.f3216I);
        }
        arrayList26.clear();
    }

    /* renamed from: j */
    public void m1971j(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        if (!arrayList.contains(view) && AbstractC0605j0.m2235w(view) != null) {
            arrayList.add(view);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                m1971j(arrayList, childAt);
            }
        }
    }

    /* renamed from: k */
    public void m1970k(Map map, View view) {
        String m2235w = AbstractC0605j0.m2235w(view);
        if (m2235w != null) {
            map.put(m2235w, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m1970k(map, childAt);
                }
            }
        }
    }

    /* renamed from: l */
    public void m1969l(C0378b c0378b, Collection collection) {
        Iterator it = ((C0385i) c0378b.entrySet()).iterator();
        while (true) {
            C0387k c0387k = (C0387k) it;
            if (!c0387k.hasNext()) {
                return;
            }
            c0387k.next();
            if (!collection.contains(AbstractC0605j0.m2235w((View) c0387k.getValue()))) {
                c0387k.remove();
            }
        }
    }
}