package p010b.p046j.p058l;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p010b.p046j.AbstractC0462b;
import p010b.p046j.p058l.p059d1.C0577b;
import p010b.p046j.p058l.p059d1.InterfaceC0586k;
import p010b.p046j.p061m.C0646i;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: b.j.l.j0 */
/* loaded from: classes.dex */
public abstract class AbstractC0605j0 {

    /* renamed from: b */
    public static Field f2749b;

    /* renamed from: c */
    public static boolean f2750c;

    /* renamed from: d */
    public static Field f2751d;

    /* renamed from: e */
    public static boolean f2752e;

    /* renamed from: f */
    public static WeakHashMap f2753f;

    /* renamed from: h */
    public static Field f2755h;

    /* renamed from: j */
    public static ThreadLocal f2757j;

    /* renamed from: a */
    public static final AtomicInteger f2748a = new AtomicInteger(1);

    /* renamed from: g */
    public static WeakHashMap f2754g = null;

    /* renamed from: i */
    public static boolean f2756i = false;

    /* renamed from: k */
    public static final int[] f2758k = {AbstractC0462b.accessibility_custom_action_0, AbstractC0462b.accessibility_custom_action_1, AbstractC0462b.accessibility_custom_action_2, AbstractC0462b.accessibility_custom_action_3, AbstractC0462b.accessibility_custom_action_4, AbstractC0462b.accessibility_custom_action_5, AbstractC0462b.accessibility_custom_action_6, AbstractC0462b.accessibility_custom_action_7, AbstractC0462b.accessibility_custom_action_8, AbstractC0462b.accessibility_custom_action_9, AbstractC0462b.accessibility_custom_action_10, AbstractC0462b.accessibility_custom_action_11, AbstractC0462b.accessibility_custom_action_12, AbstractC0462b.accessibility_custom_action_13, AbstractC0462b.accessibility_custom_action_14, AbstractC0462b.accessibility_custom_action_15, AbstractC0462b.accessibility_custom_action_16, AbstractC0462b.accessibility_custom_action_17, AbstractC0462b.accessibility_custom_action_18, AbstractC0462b.accessibility_custom_action_19, AbstractC0462b.accessibility_custom_action_20, AbstractC0462b.accessibility_custom_action_21, AbstractC0462b.accessibility_custom_action_22, AbstractC0462b.accessibility_custom_action_23, AbstractC0462b.accessibility_custom_action_24, AbstractC0462b.accessibility_custom_action_25, AbstractC0462b.accessibility_custom_action_26, AbstractC0462b.accessibility_custom_action_27, AbstractC0462b.accessibility_custom_action_28, AbstractC0462b.accessibility_custom_action_29, AbstractC0462b.accessibility_custom_action_30, AbstractC0462b.accessibility_custom_action_31};

    /* renamed from: l */
    public static final InterfaceC0624t f2759l = new C0632x();

    static {
        new WeakHashMap();
    }

    /* renamed from: A */
    public static void m2282A(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m2248j(view) != null && view.getVisibility() == 0;
            if ((Build.VERSION.SDK_INT >= 19 ? view.getAccessibilityLiveRegion() : 0) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z) {
                    obtain.getText().add(m2248j(view));
                    if (m2242p(view) == 0) {
                        m2263T(view, 1);
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (!(parent instanceof View)) {
                            break;
                        } else if (m2242p((View) parent) == 4) {
                            m2263T(view, 2);
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                    } catch (AbstractMethodError unused) {
                        view.getParent().getClass().getSimpleName();
                    }
                }
            } else {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m2248j(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            }
        }
    }

    /* renamed from: B */
    public static void m2281B(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(i);
        } else if (i2 < 21) {
            m2255c(view, i);
        } else {
            Rect m2244n = m2244n();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                m2244n.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !m2244n.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m2255c(view, i);
            if (z && m2244n.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(m2244n);
            }
        }
    }

    /* renamed from: C */
    public static void m2280C(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(i);
        } else if (i2 < 21) {
            m2254d(view, i);
        } else {
            Rect m2244n = m2244n();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                m2244n.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !m2244n.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m2254d(view, i);
            if (z && m2244n.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(m2244n);
            }
        }
    }

    /* renamed from: D */
    public static C0573c1 m2279D(View view, C0573c1 c0573c1) {
        WindowInsets m2319h;
        if (Build.VERSION.SDK_INT >= 21 && (m2319h = c0573c1.m2319h()) != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(m2319h);
            if (!onApplyWindowInsets.equals(m2319h)) {
                return C0573c1.m2317j(onApplyWindowInsets, view);
            }
        }
        return c0573c1;
    }

    /* renamed from: E */
    public static C0574d m2278E(View view, C0574d c0574d) {
        if (Log.isLoggable("ViewCompat", 3)) {
            String str = "performReceiveContent: " + c0574d + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]";
        }
        C0646i c0646i = (C0646i) view.getTag(AbstractC0462b.tag_on_receive_content_listener);
        if (c0646i == null) {
            return (view instanceof InterfaceC0624t ? (InterfaceC0624t) view : f2759l).mo2184a(c0574d);
        }
        C0574d m2162b = c0646i.m2162b(view, c0574d);
        if (m2162b == null) {
            return null;
        }
        return (view instanceof InterfaceC0624t ? (InterfaceC0624t) view : f2759l).mo2184a(m2162b);
    }

    /* renamed from: F */
    public static void m2277F(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: G */
    public static void m2276G(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: H */
    public static void m2275H(View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* renamed from: I */
    public static void m2274I(View view, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            m2273J(i, view);
            m2282A(view, 0);
        }
    }

    /* renamed from: J */
    public static void m2273J(int i, View view) {
        List m2247k = m2247k(view);
        for (int i2 = 0; i2 < m2247k.size(); i2++) {
            if (((C0577b) m2247k.get(i2)).m2316a() == i) {
                m2247k.remove(i2);
                return;
            }
        }
    }

    /* renamed from: K */
    public static void m2272K(View view, C0577b c0577b, CharSequence charSequence, InterfaceC0586k interfaceC0586k) {
        m2257a(view, new C0577b(null, c0577b.f2697j, null, interfaceC0586k, c0577b.f2698k));
    }

    /* renamed from: L */
    public static void m2271L(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            view.requestApplyInsets();
        } else if (i >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* renamed from: M */
    public static void m2270M(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0599g0.m2287a(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: N */
    public static void m2269N(View view, C0568b c0568b) {
        if (c0568b == null && (m2249i(view) instanceof C0565a)) {
            c0568b = new C0568b();
        }
        view.setAccessibilityDelegate(c0568b == null ? null : c0568b.f2663c);
    }

    /* renamed from: O */
    public static void m2268O(View view, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    /* renamed from: P */
    public static void m2267P(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: Q */
    public static void m2266Q(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: R */
    public static void m2265R(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    /* renamed from: S */
    public static void m2264S(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    /* renamed from: T */
    public static void m2263T(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 19) {
            if (i2 < 16) {
                return;
            }
            if (i == 4) {
                i = 2;
            }
        }
        view.setImportantForAccessibility(i);
    }

    /* renamed from: U */
    public static void m2262U(View view, InterfaceC0622s interfaceC0622s) {
        if (Build.VERSION.SDK_INT >= 21) {
            AbstractC0588e0.m2299d(view, interfaceC0622s);
        }
    }

    /* renamed from: V */
    public static void m2261V(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: W */
    public static void m2260W(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            new C0566a0(AbstractC0462b.tag_state_description, CharSequence.class, 64, 30).m2327e(view, charSequence);
        }
    }

    /* renamed from: X */
    public static void m2259X(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f2753f == null) {
            f2753f = new WeakHashMap();
        }
        f2753f.put(view, str);
    }

    /* renamed from: Y */
    public static void m2258Y(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: a */
    public static void m2257a(View view, C0577b c0577b) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0568b m2250h = m2250h(view);
            if (m2250h == null) {
                m2250h = new C0568b();
            }
            m2269N(view, m2250h);
            m2273J(c0577b.m2316a(), view);
            m2247k(view).add(c0577b);
            m2282A(view, 0);
        }
    }

    /* renamed from: b */
    public static C0615o0 m2256b(View view) {
        if (f2754g == null) {
            f2754g = new WeakHashMap();
        }
        C0615o0 c0615o0 = (C0615o0) f2754g.get(view);
        if (c0615o0 == null) {
            C0615o0 c0615o02 = new C0615o0(view);
            f2754g.put(view, c0615o02);
            return c0615o02;
        }
        return c0615o0;
    }

    /* renamed from: c */
    public static void m2255c(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m2258Y((View) parent);
            }
        }
    }

    /* renamed from: d */
    public static void m2254d(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m2258Y((View) parent);
            }
        }
    }

    /* renamed from: e */
    public static C0573c1 m2253e(View view, C0573c1 c0573c1) {
        WindowInsets m2319h;
        if (Build.VERSION.SDK_INT >= 21 && (m2319h = c0573c1.m2319h()) != null) {
            WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(m2319h);
            if (!dispatchApplyWindowInsets.equals(m2319h)) {
                return C0573c1.m2317j(dispatchApplyWindowInsets, view);
            }
        }
        return c0573c1;
    }

    /* renamed from: f */
    public static boolean m2252f(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = C0603i0.f2743a;
        int i = AbstractC0462b.tag_unhandled_key_event_manager;
        C0603i0 c0603i0 = (C0603i0) view.getTag(i);
        if (c0603i0 == null) {
            c0603i0 = new C0603i0();
            view.setTag(i, c0603i0);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = c0603i0.f2744b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = C0603i0.f2743a;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (c0603i0.f2744b == null) {
                        c0603i0.f2744b = new WeakHashMap();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList arrayList3 = C0603i0.f2743a;
                        View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            c0603i0.f2744b.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                c0603i0.f2744b.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View m2284a = c0603i0.m2284a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (m2284a != null && !KeyEvent.isModifierKey(keyCode)) {
                if (c0603i0.f2745c == null) {
                    c0603i0.f2745c = new SparseArray();
                }
                c0603i0.f2745c.put(keyCode, new WeakReference(m2284a));
            }
        }
        return m2284a != null;
    }

    /* renamed from: g */
    public static int m2251g() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        if (Build.VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }
        do {
            atomicInteger = f2748a;
            i = atomicInteger.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }

    /* renamed from: h */
    public static C0568b m2250h(View view) {
        View.AccessibilityDelegate m2249i = m2249i(view);
        if (m2249i == null) {
            return null;
        }
        return m2249i instanceof C0565a ? ((C0565a) m2249i).f2659a : new C0568b(m2249i);
    }

    /* renamed from: i */
    public static View.AccessibilityDelegate m2249i(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        if (f2756i) {
            return null;
        }
        if (f2755h == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2755h = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2756i = true;
                return null;
            }
        }
        Object obj = f2755h.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    /* renamed from: j */
    public static CharSequence m2248j(View view) {
        return (CharSequence) new C0636z(AbstractC0462b.tag_accessibility_pane_title, CharSequence.class, 8, 28).m2328d(view);
    }

    /* renamed from: k */
    public static List m2247k(View view) {
        int i = AbstractC0462b.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList) view.getTag(i);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(i, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    /* renamed from: l */
    public static ColorStateList m2246l(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof InterfaceC0630w) {
            return ((InterfaceC0630w) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* renamed from: m */
    public static float m2245m(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    /* renamed from: n */
    public static Rect m2244n() {
        if (f2757j == null) {
            f2757j = new ThreadLocal();
        }
        Rect rect = (Rect) f2757j.get();
        if (rect == null) {
            rect = new Rect();
            f2757j.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: o */
    public static boolean m2243o(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    /* renamed from: p */
    public static int m2242p(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    /* renamed from: q */
    public static int m2241q(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: r */
    public static int m2240r(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f2752e) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f2751d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2752e = true;
        }
        Field field = f2751d;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: s */
    public static int m2239s(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f2750c) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f2749b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f2750c = true;
        }
        Field field = f2749b;
        if (field != null) {
            try {
                return ((Integer) field.get(view)).intValue();
            } catch (Exception unused2) {
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: t */
    public static int m2238t(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingEnd() : view.getPaddingRight();
    }

    /* renamed from: u */
    public static int m2237u(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingStart() : view.getPaddingLeft();
    }

    /* renamed from: v */
    public static C0573c1 m2236v(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return AbstractC0597f0.m2288a(view);
        }
        if (i >= 21) {
            return AbstractC0588e0.m2300c(view);
        }
        return null;
    }

    /* renamed from: w */
    public static String m2235w(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap weakHashMap = f2753f;
        if (weakHashMap == null) {
            return null;
        }
        return (String) weakHashMap.get(view);
    }

    /* renamed from: x */
    public static int m2234x(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: y */
    public static boolean m2233y(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isAttachedToWindow() : view.getWindowToken() != null;
    }

    /* renamed from: z */
    public static boolean m2232z(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isLaidOut() : view.getWidth() > 0 && view.getHeight() > 0;
    }
}