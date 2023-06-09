package p010b.p067m.p068d;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p010b.p046j.p054h.C0529b;

/* renamed from: b.m.d.c2 */
/* loaded from: classes.dex */
public class C0679c2 extends AbstractC0695g2 {
    /* renamed from: z */
    public static boolean m2103z(Transition transition) {
        return (AbstractC0695g2.m2023k(transition.getTargetIds()) && AbstractC0695g2.m2023k(transition.getTargetNames()) && AbstractC0695g2.m2023k(transition.getTargetTypes())) ? false : true;
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: a */
    public void mo1322a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: b */
    public void mo1321b(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo1321b(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
        } else if (m2103z(transition) || !AbstractC0695g2.m2023k(transition.getTargets())) {
        } else {
            int size = arrayList.size();
            while (i < size) {
                transition.addTarget((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: c */
    public void mo1320c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: e */
    public boolean mo1319e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: g */
    public Object mo1318g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: l */
    public Object mo1317l(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 != null) {
            TransitionSet transitionSet = new TransitionSet();
            if (transition != null) {
                transitionSet.addTransition(transition);
            }
            transitionSet.addTransition(transition3);
            return transitionSet;
        }
        return transition;
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: m */
    public Object mo1316m(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: o */
    public void mo1315o(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: p */
    public void mo1314p(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo1314p(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m2103z(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                transition.addTarget((View) arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget((View) arrayList.get(size2));
            }
        }
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: q */
    public void mo1313q(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new C0762y1(this, view, arrayList));
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: r */
    public void mo1312r(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((Transition) obj).addListener(new C0765z1(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: s */
    public void mo1311s(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C0675b2(this, rect));
        }
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: t */
    public void mo1310t(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m2024j(view, rect);
            ((Transition) obj).setEpicenterCallback(new C0759x1(this, rect));
        }
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: u */
    public void mo2021u(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z, Object obj, C0529b c0529b, Runnable runnable) {
        ((Transition) obj).addListener(new C0671a2(this, runnable));
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: w */
    public void mo1309w(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC0695g2.m2028d(targets, (View) arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo1321b(transitionSet, arrayList);
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: x */
    public void mo1308x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo1314p(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // p010b.p067m.p068d.AbstractC0695g2
    /* renamed from: y */
    public Object mo1307y(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }
}