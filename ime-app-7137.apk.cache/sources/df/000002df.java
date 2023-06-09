package p010b.p046j.p058l;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p010b.p046j.AbstractC0462b;

/* renamed from: b.j.l.i0 */
/* loaded from: classes.dex */
public class C0603i0 {

    /* renamed from: a */
    public static final ArrayList f2743a = new ArrayList();

    /* renamed from: b */
    public WeakHashMap f2744b = null;

    /* renamed from: c */
    public SparseArray f2745c = null;

    /* renamed from: d */
    public WeakReference f2746d = null;

    /* renamed from: a */
    public final View m2284a(View view, KeyEvent keyEvent) {
        WeakHashMap weakHashMap = this.f2744b;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View m2284a = m2284a(viewGroup.getChildAt(childCount), keyEvent);
                    if (m2284a != null) {
                        return m2284a;
                    }
                }
            }
            if (m2283b(view, keyEvent)) {
                return view;
            }
        }
        return null;
    }

    /* renamed from: b */
    public final boolean m2283b(View view, KeyEvent keyEvent) {
        ArrayList arrayList = (ArrayList) view.getTag(AbstractC0462b.tag_unhandled_key_listeners);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((InterfaceC0601h0) arrayList.get(size)).m2286a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}