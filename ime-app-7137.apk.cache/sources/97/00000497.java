package p010b.p086w;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import p010b.p036g.C0378b;
import p010b.p036g.C0382f;

/* renamed from: b.w.h0 */
/* loaded from: classes.dex */
public class ViewTreeObserver$OnPreDrawListenerC1043h0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    public AbstractC1034e0 f3956b;

    /* renamed from: c */
    public ViewGroup f3957c;

    public ViewTreeObserver$OnPreDrawListenerC1043h0(AbstractC1034e0 abstractC1034e0, ViewGroup viewGroup) {
        this.f3956b = abstractC1034e0;
        this.f3957c = viewGroup;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01f4 A[EDGE_INSN: B:139:0x01f4->B:93:0x01f4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f9  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onPreDraw() {
        ArrayList arrayList;
        AbstractC1034e0 abstractC1034e0;
        C1065p0 c1065p0;
        C0378b c0378b;
        C0378b c0378b2;
        int i;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        C1025b0 c1025b0;
        C1065p0 c1065p02;
        C1063o0 c1063o0;
        View view;
        View view2;
        C1065p0 c1065p03;
        this.f3957c.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f3957c.removeOnAttachStateChangeListener(this);
        int i5 = 1;
        if (AbstractC1046i0.f3965c.remove(this.f3957c)) {
            C0378b m1361b = AbstractC1046i0.m1361b();
            ArrayList arrayList2 = (ArrayList) m1361b.get(this.f3957c);
            Object obj = null;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                m1361b.put(this.f3957c, arrayList2);
            } else if (arrayList2.size() > 0) {
                arrayList = new ArrayList(arrayList2);
                arrayList2.add(this.f3956b);
                this.f3956b.mo1346a(new C1040g0(this, m1361b));
                this.f3956b.m1378h(this.f3957c, false);
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((AbstractC1034e0) it.next()).mo1338x(this.f3957c);
                    }
                }
                abstractC1034e0 = this.f3956b;
                ViewGroup viewGroup = this.f3957c;
                abstractC1034e0.getClass();
                abstractC1034e0.f3939o = new ArrayList();
                abstractC1034e0.f3940p = new ArrayList();
                c1065p0 = abstractC1034e0.f3935k;
                C1065p0 c1065p04 = abstractC1034e0.f3936l;
                c0378b = new C0378b(c1065p0.f4016a);
                c0378b2 = new C0378b(c1065p04.f4016a);
                i = 0;
                while (true) {
                    iArr = abstractC1034e0.f3938n;
                    if (i < iArr.length) {
                        break;
                    }
                    int i6 = iArr[i];
                    if (i6 == i5) {
                        c1065p02 = c1065p0;
                        int i7 = c0378b.f1943h;
                        while (true) {
                            i7--;
                            if (i7 >= 0) {
                                View view3 = (View) c0378b.m2616h(i7);
                                if (view3 != null && abstractC1034e0.m1372s(view3) && (c1063o0 = (C1063o0) c0378b2.remove(view3)) != null && abstractC1034e0.m1372s(c1063o0.f4014b)) {
                                    abstractC1034e0.f3939o.add((C1063o0) c0378b.m2615i(i7));
                                    abstractC1034e0.f3940p.add(c1063o0);
                                }
                            }
                        }
                    } else if (i6 == 2) {
                        c1065p02 = c1065p0;
                        C0378b c0378b3 = c1065p02.f4019d;
                        C0378b c0378b4 = c1065p04.f4019d;
                        int i8 = c0378b3.f1943h;
                        for (int i9 = 0; i9 < i8; i9++) {
                            View view4 = (View) c0378b3.m2613k(i9);
                            if (view4 != null && abstractC1034e0.m1372s(view4) && (view = (View) c0378b4.get(c0378b3.m2616h(i9))) != null && abstractC1034e0.m1372s(view)) {
                                C1063o0 c1063o02 = (C1063o0) c0378b.getOrDefault(view4, null);
                                C1063o0 c1063o03 = (C1063o0) c0378b2.getOrDefault(view, null);
                                if (c1063o02 != null && c1063o03 != null) {
                                    abstractC1034e0.f3939o.add(c1063o02);
                                    abstractC1034e0.f3940p.add(c1063o03);
                                    c0378b.remove(view4);
                                    c0378b2.remove(view);
                                }
                            }
                        }
                    } else if (i6 != 3) {
                        if (i6 == 4) {
                            C0382f c0382f = c1065p0.f4018c;
                            C0382f c0382f2 = c1065p04.f4018c;
                            int m2641h = c0382f.m2641h();
                            int i10 = 0;
                            while (i10 < m2641h) {
                                View view5 = (View) c0382f.m2640i(i10);
                                if (view5 == null || !abstractC1034e0.m1372s(view5)) {
                                    c1065p03 = c1065p0;
                                } else {
                                    if (c0382f.f1911c) {
                                        c0382f.m2645d();
                                    }
                                    c1065p03 = c1065p0;
                                    View view6 = (View) c0382f2.m2644e(c0382f.f1912d[i10]);
                                    if (view6 != null && abstractC1034e0.m1372s(view6)) {
                                        C1063o0 c1063o04 = (C1063o0) c0378b.getOrDefault(view5, obj);
                                        C1063o0 c1063o05 = (C1063o0) c0378b2.getOrDefault(view6, obj);
                                        if (c1063o04 != null && c1063o05 != null) {
                                            abstractC1034e0.f3939o.add(c1063o04);
                                            abstractC1034e0.f3940p.add(c1063o05);
                                            c0378b.remove(view5);
                                            c0378b2.remove(view6);
                                        }
                                    }
                                }
                                i10++;
                                c1065p0 = c1065p03;
                                obj = null;
                            }
                        }
                        c1065p02 = c1065p0;
                    } else {
                        c1065p02 = c1065p0;
                        SparseArray sparseArray = c1065p02.f4017b;
                        SparseArray sparseArray2 = c1065p04.f4017b;
                        int size = sparseArray.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            View view7 = (View) sparseArray.valueAt(i11);
                            if (view7 != null && abstractC1034e0.m1372s(view7) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i11))) != null && abstractC1034e0.m1372s(view2)) {
                                C1063o0 c1063o06 = (C1063o0) c0378b.getOrDefault(view7, null);
                                C1063o0 c1063o07 = (C1063o0) c0378b2.getOrDefault(view2, null);
                                if (c1063o06 != null && c1063o07 != null) {
                                    abstractC1034e0.f3939o.add(c1063o06);
                                    abstractC1034e0.f3940p.add(c1063o07);
                                    c0378b.remove(view7);
                                    c0378b2.remove(view2);
                                }
                            }
                        }
                    }
                    i++;
                    c1065p0 = c1065p02;
                    i5 = 1;
                    obj = null;
                }
                for (i2 = 0; i2 < c0378b.f1943h; i2++) {
                    C1063o0 c1063o08 = (C1063o0) c0378b.m2613k(i2);
                    if (abstractC1034e0.m1372s(c1063o08.f4014b)) {
                        abstractC1034e0.f3939o.add(c1063o08);
                        abstractC1034e0.f3940p.add(null);
                    }
                }
                for (i3 = 0; i3 < c0378b2.f1943h; i3++) {
                    C1063o0 c1063o09 = (C1063o0) c0378b2.m2613k(i3);
                    if (abstractC1034e0.m1372s(c1063o09.f4014b)) {
                        abstractC1034e0.f3940p.add(c1063o09);
                        abstractC1034e0.f3939o.add(null);
                    }
                }
                C0378b m1374o = AbstractC1034e0.m1374o();
                int i12 = m1374o.f1943h;
                InterfaceC1059m1 m1383b = AbstractC1023a1.m1383b(viewGroup);
                for (i4 = i12 - 1; i4 >= 0; i4--) {
                    Animator animator = (Animator) m1374o.m2616h(i4);
                    if (animator != null && (c1025b0 = (C1025b0) m1374o.getOrDefault(animator, null)) != null && c1025b0.f3916a != null && m1383b.equals(c1025b0.f3919d)) {
                        C1063o0 c1063o010 = c1025b0.f3918c;
                        View view8 = c1025b0.f3916a;
                        C1063o0 m1373q = abstractC1034e0.m1373q(view8, true);
                        C1063o0 m1375n = abstractC1034e0.m1375n(view8, true);
                        if (m1373q == null && m1375n == null) {
                            m1375n = (C1063o0) abstractC1034e0.f3936l.f4016a.get(view8);
                        }
                        if (!(m1373q == null && m1375n == null) && c1025b0.f3920e.mo1330r(c1063o010, m1375n)) {
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                m1374o.remove(animator);
                            }
                        }
                    }
                }
                abstractC1034e0.mo1342l(viewGroup, abstractC1034e0.f3935k, abstractC1034e0.f3936l, abstractC1034e0.f3939o, abstractC1034e0.f3940p);
                abstractC1034e0.mo1337y();
                return true;
            }
            arrayList = null;
            arrayList2.add(this.f3956b);
            this.f3956b.mo1346a(new C1040g0(this, m1361b));
            this.f3956b.m1378h(this.f3957c, false);
            if (arrayList != null) {
            }
            abstractC1034e0 = this.f3956b;
            ViewGroup viewGroup2 = this.f3957c;
            abstractC1034e0.getClass();
            abstractC1034e0.f3939o = new ArrayList();
            abstractC1034e0.f3940p = new ArrayList();
            c1065p0 = abstractC1034e0.f3935k;
            C1065p0 c1065p042 = abstractC1034e0.f3936l;
            c0378b = new C0378b(c1065p0.f4016a);
            c0378b2 = new C0378b(c1065p042.f4016a);
            i = 0;
            while (true) {
                iArr = abstractC1034e0.f3938n;
                if (i < iArr.length) {
                }
                i++;
                c1065p0 = c1065p02;
                i5 = 1;
                obj = null;
            }
            while (i2 < c0378b.f1943h) {
            }
            while (i3 < c0378b2.f1943h) {
            }
            C0378b m1374o2 = AbstractC1034e0.m1374o();
            int i122 = m1374o2.f1943h;
            InterfaceC1059m1 m1383b2 = AbstractC1023a1.m1383b(viewGroup2);
            while (i4 >= 0) {
            }
            abstractC1034e0.mo1342l(viewGroup2, abstractC1034e0.f3935k, abstractC1034e0.f3936l, abstractC1034e0.f3939o, abstractC1034e0.f3940p);
            abstractC1034e0.mo1337y();
            return true;
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f3957c.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f3957c.removeOnAttachStateChangeListener(this);
        AbstractC1046i0.f3965c.remove(this.f3957c);
        ArrayList arrayList = (ArrayList) AbstractC1046i0.m1361b().get(this.f3957c);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC1034e0) it.next()).mo1338x(this.f3957c);
            }
        }
        this.f3956b.m1377i(true);
    }
}