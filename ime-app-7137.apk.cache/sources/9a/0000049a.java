package p010b.p086w;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p010b.p036g.C0378b;
import p010b.p046j.p058l.AbstractC0605j0;

/* renamed from: b.w.i0 */
/* loaded from: classes.dex */
public abstract class AbstractC1046i0 {

    /* renamed from: a */
    public static AbstractC1034e0 f3963a = new C1024b();

    /* renamed from: b */
    public static ThreadLocal f3964b = new ThreadLocal();

    /* renamed from: c */
    public static ArrayList f3965c = new ArrayList();

    /* renamed from: a */
    public static void m1362a(ViewGroup viewGroup, AbstractC1034e0 abstractC1034e0) {
        if (f3965c.contains(viewGroup) || !AbstractC0605j0.m2232z(viewGroup)) {
            return;
        }
        f3965c.add(viewGroup);
        if (abstractC1034e0 == null) {
            abstractC1034e0 = f3963a;
        }
        AbstractC1034e0 clone = abstractC1034e0.clone();
        ArrayList arrayList = (ArrayList) m1361b().getOrDefault(viewGroup, null);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC1034e0) it.next()).mo1341u(viewGroup);
            }
        }
        if (clone != null) {
            clone.m1378h(viewGroup, true);
        }
        int i = AbstractC1076v.transition_current_scene;
        AbstractC1080x abstractC1080x = (AbstractC1080x) viewGroup.getTag(i);
        viewGroup.setTag(i, null);
        if (clone != null) {
            ViewTreeObserver$OnPreDrawListenerC1043h0 viewTreeObserver$OnPreDrawListenerC1043h0 = new ViewTreeObserver$OnPreDrawListenerC1043h0(clone, viewGroup);
            viewGroup.addOnAttachStateChangeListener(viewTreeObserver$OnPreDrawListenerC1043h0);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC1043h0);
        }
    }

    /* renamed from: b */
    public static C0378b m1361b() {
        C0378b c0378b;
        WeakReference weakReference = (WeakReference) f3964b.get();
        if (weakReference == null || (c0378b = (C0378b) weakReference.get()) == null) {
            C0378b c0378b2 = new C0378b();
            f3964b.set(new WeakReference(c0378b2));
            return c0378b2;
        }
        return c0378b;
    }
}