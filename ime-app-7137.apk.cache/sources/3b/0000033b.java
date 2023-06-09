package p010b.p067m.p068d;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p010b.p036g.C0390n;
import p010b.p046j.AbstractC0462b;
import p010b.p046j.p054h.C0529b;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.ViewTreeObserver$OnPreDrawListenerC0626u;

@SuppressLint({"UnknownNullness"})
/* renamed from: b.m.d.g2 */
/* loaded from: classes.dex */
public abstract class AbstractC0695g2 {
    /* renamed from: d */
    public static void m2028d(List list, View view) {
        int size = list.size();
        if (m2026h(list, view, size)) {
            return;
        }
        if (AbstractC0605j0.m2235w(view) != null) {
            list.add(view);
        }
        for (int i = size; i < list.size(); i++) {
            View view2 = (View) list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!m2026h(list, childAt, size) && AbstractC0605j0.m2235w(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public static boolean m2026h(List list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m2023k(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    public abstract void mo1322a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo1321b(Object obj, ArrayList arrayList);

    /* renamed from: c */
    public abstract void mo1320c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo1319e(Object obj);

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:20:0x0038 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.view.View, android.view.ViewGroup] */
    /* renamed from: f */
    public void m2027f(ArrayList arrayList, View view) {
        boolean z;
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                view = (ViewGroup) view;
                if (Build.VERSION.SDK_INT >= 21) {
                    z = view.isTransitionGroup();
                } else {
                    Boolean bool = (Boolean) view.getTag(AbstractC0462b.tag_transition_group);
                    z = ((bool == null || !bool.booleanValue()) && view.getBackground() == null && AbstractC0605j0.m2235w(view) == null) ? false : true;
                }
                if (!z) {
                    int childCount = view.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        m2027f(arrayList, view.getChildAt(i));
                    }
                    return;
                }
            }
            arrayList.add(view);
        }
    }

    /* renamed from: g */
    public abstract Object mo1318g(Object obj);

    /* renamed from: i */
    public void m2025i(Map map, View view) {
        if (view.getVisibility() == 0) {
            String m2235w = AbstractC0605j0.m2235w(view);
            if (m2235w != null) {
                map.put(m2235w, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m2025i(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: j */
    public void m2024j(View view, Rect rect) {
        if (AbstractC0605j0.m2233y(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* renamed from: l */
    public abstract Object mo1317l(Object obj, Object obj2, Object obj3);

    /* renamed from: m */
    public abstract Object mo1316m(Object obj, Object obj2, Object obj3);

    /* renamed from: n */
    public ArrayList m2022n(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
            arrayList2.add(AbstractC0605j0.m2235w(view));
            AbstractC0605j0.m2259X(view, null);
        }
        return arrayList2;
    }

    /* renamed from: o */
    public abstract void mo1315o(Object obj, View view);

    /* renamed from: p */
    public abstract void mo1314p(Object obj, ArrayList arrayList, ArrayList arrayList2);

    /* renamed from: q */
    public abstract void mo1313q(Object obj, View view, ArrayList arrayList);

    /* renamed from: r */
    public abstract void mo1312r(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    /* renamed from: s */
    public abstract void mo1311s(Object obj, Rect rect);

    /* renamed from: t */
    public abstract void mo1310t(Object obj, View view);

    /* renamed from: u */
    public void mo2021u(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z, Object obj, C0529b c0529b, Runnable runnable) {
        runnable.run();
    }

    /* renamed from: v */
    public void m2020v(View view, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = (View) arrayList.get(i);
            String m2235w = AbstractC0605j0.m2235w(view2);
            arrayList4.add(m2235w);
            if (m2235w != null) {
                AbstractC0605j0.m2259X(view2, null);
                String str = (String) ((C0390n) map).getOrDefault(m2235w, null);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        AbstractC0605j0.m2259X((View) arrayList2.get(i2), m2235w);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        ViewTreeObserver$OnPreDrawListenerC0626u.m2198a(view, new RunnableC0683d2(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: w */
    public abstract void mo1309w(Object obj, View view, ArrayList arrayList);

    /* renamed from: x */
    public abstract void mo1308x(Object obj, ArrayList arrayList, ArrayList arrayList2);

    /* renamed from: y */
    public abstract Object mo1307y(Object obj);
}