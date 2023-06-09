package p010b.p064l.p066b;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p036g.C0391o;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.C0568b;
import p010b.p046j.p058l.p059d1.C0580e;
import p010b.p046j.p058l.p059d1.C0584i;
import p093c.p145g.p146a.p147a.p170v.C1997c;

/* renamed from: b.l.b.d */
/* loaded from: classes.dex */
public abstract class AbstractC0659d extends C0568b {

    /* renamed from: d */
    public static final Rect f2857d = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: e */
    public static final C0656a f2858e = new C0656a();

    /* renamed from: f */
    public static final C0657b f2859f = new C0657b();

    /* renamed from: k */
    public final AccessibilityManager f2864k;

    /* renamed from: l */
    public final View f2865l;

    /* renamed from: m */
    public C0658c f2866m;

    /* renamed from: g */
    public final Rect f2860g = new Rect();

    /* renamed from: h */
    public final Rect f2861h = new Rect();

    /* renamed from: i */
    public final Rect f2862i = new Rect();

    /* renamed from: j */
    public final int[] f2863j = new int[2];

    /* renamed from: n */
    public int f2867n = Integer.MIN_VALUE;

    /* renamed from: o */
    public int f2868o = Integer.MIN_VALUE;

    /* renamed from: p */
    public int f2869p = Integer.MIN_VALUE;

    public AbstractC0659d(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f2865l = view;
        this.f2864k = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (AbstractC0605j0.m2242p(view) == 0) {
            AbstractC0605j0.m2263T(view, 1);
        }
    }

    @Override // p010b.p046j.p058l.C0568b
    /* renamed from: b */
    public C0584i mo1647b(View view) {
        if (this.f2866m == null) {
            this.f2866m = new C0658c(this);
        }
        return this.f2866m;
    }

    @Override // p010b.p046j.p058l.C0568b
    /* renamed from: c */
    public void mo794c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2662b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // p010b.p046j.p058l.C0568b
    /* renamed from: d */
    public void mo534d(View view, C0580e c0580e) {
        this.f2662b.onInitializeAccessibilityNodeInfo(view, c0580e.f2703b);
        C1997c c1997c = (C1997c) this;
        c0580e.f2703b.setCheckable(c1997c.f6049q.m303e());
        c0580e.f2703b.setClickable(c1997c.f6049q.isClickable());
        if (!c1997c.f6049q.m303e() && !c1997c.f6049q.isClickable()) {
            c0580e.f2703b.setClassName("android.view.View");
        } else {
            c0580e.f2703b.setClassName(c1997c.f6049q.m303e() ? "android.widget.CompoundButton" : "android.widget.Button");
        }
        CharSequence text = c1997c.f6049q.getText();
        if (Build.VERSION.SDK_INT >= 23) {
            c0580e.f2703b.setText(text);
        } else {
            c0580e.f2703b.setContentDescription(text);
        }
    }

    /* renamed from: j */
    public final boolean m2152j(int i) {
        if (this.f2867n == i) {
            this.f2867n = Integer.MIN_VALUE;
            this.f2865l.invalidate();
            m2146s(i, 65536);
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean m2151k(int i) {
        if (this.f2868o != i) {
            return false;
        }
        this.f2868o = Integer.MIN_VALUE;
        C1997c c1997c = (C1997c) this;
        if (i == 1) {
            Chip chip = c1997c.f6049q;
            chip.f6778q = false;
            chip.refreshDrawableState();
        }
        m2146s(i, 8);
        return true;
    }

    /* renamed from: l */
    public final C0580e m2150l(int i) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        C0580e c0580e = new C0580e(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        obtain.setClassName("android.view.View");
        Rect rect = f2857d;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        View view = this.f2865l;
        c0580e.f2704c = -1;
        obtain.setParent(view);
        mo615q(i, c0580e);
        if (c0580e.m2307g() == null && c0580e.m2309e() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        obtain.getBoundsInParent(this.f2861h);
        if (this.f2861h.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = obtain.getActions();
        if ((actions & 64) == 0) {
            if ((actions & 128) == 0) {
                obtain.setPackageName(this.f2865l.getContext().getPackageName());
                View view2 = this.f2865l;
                c0580e.f2705d = i;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 16) {
                    obtain.setSource(view2, i);
                }
                boolean z = false;
                if (this.f2867n == i) {
                    if (i2 >= 16) {
                        obtain.setAccessibilityFocused(true);
                    }
                    obtain.addAction(128);
                } else {
                    if (i2 >= 16) {
                        obtain.setAccessibilityFocused(false);
                    }
                    obtain.addAction(64);
                }
                boolean z2 = this.f2868o == i;
                if (z2) {
                    obtain.addAction(2);
                } else if (obtain.isFocusable()) {
                    obtain.addAction(1);
                }
                obtain.setFocused(z2);
                this.f2865l.getLocationOnScreen(this.f2863j);
                obtain.getBoundsInScreen(this.f2860g);
                if (this.f2860g.equals(rect)) {
                    obtain.getBoundsInParent(this.f2860g);
                    if (c0580e.f2704c != -1) {
                        C0580e c0580e2 = new C0580e(AccessibilityNodeInfo.obtain());
                        for (int i3 = c0580e.f2704c; i3 != -1; i3 = c0580e2.f2704c) {
                            View view3 = this.f2865l;
                            c0580e2.f2704c = -1;
                            if (Build.VERSION.SDK_INT >= 16) {
                                c0580e2.f2703b.setParent(view3, -1);
                            }
                            c0580e2.f2703b.setBoundsInParent(f2857d);
                            mo615q(i3, c0580e2);
                            c0580e2.f2703b.getBoundsInParent(this.f2861h);
                            Rect rect2 = this.f2860g;
                            Rect rect3 = this.f2861h;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        c0580e2.f2703b.recycle();
                    }
                    this.f2860g.offset(this.f2863j[0] - this.f2865l.getScrollX(), this.f2863j[1] - this.f2865l.getScrollY());
                }
                if (this.f2865l.getLocalVisibleRect(this.f2862i)) {
                    this.f2862i.offset(this.f2863j[0] - this.f2865l.getScrollX(), this.f2863j[1] - this.f2865l.getScrollY());
                    if (this.f2860g.intersect(this.f2862i)) {
                        c0580e.f2703b.setBoundsInScreen(this.f2860g);
                        Rect rect4 = this.f2860g;
                        if (rect4 != null && !rect4.isEmpty() && this.f2865l.getWindowVisibility() == 0) {
                            View view4 = this.f2865l;
                            while (true) {
                                ViewParent parent = view4.getParent();
                                if (parent instanceof View) {
                                    view4 = (View) parent;
                                    if (view4.getAlpha() <= 0.0f) {
                                        break;
                                    } else if (view4.getVisibility() != 0) {
                                        break;
                                    }
                                } else if (parent != null) {
                                    z = true;
                                }
                            }
                        }
                        if (z && Build.VERSION.SDK_INT >= 16) {
                            c0580e.f2703b.setVisibleToUser(true);
                        }
                    }
                }
                return c0580e;
            }
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
    }

    /* renamed from: m */
    public abstract void mo617m(List list);

    /* JADX DEBUG: Multi-variable search result rejected for r6v5, resolved type: java.lang.Object */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0124, code lost:
        if (r13 < ((r17 * r17) + ((r12 * 13) * r12))) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012b  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2149n(int i, Rect rect) {
        Object obj;
        C0580e c0580e;
        int m2608e;
        int width;
        int m2606g;
        int i2;
        boolean z;
        int height;
        ArrayList arrayList = new ArrayList();
        mo617m(arrayList);
        C0391o c0391o = new C0391o();
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            c0391o.m2607f(i4, m2150l(i4));
        }
        int i5 = this.f2868o;
        C0580e c0580e2 = i5 == Integer.MIN_VALUE ? null : (C0580e) c0391o.m2610c(i5);
        int i6 = -1;
        if (i == 1 || i == 2) {
            boolean z2 = AbstractC0605j0.m2241q(this.f2865l) == 1;
            C0657b c0657b = f2859f;
            C0656a c0656a = f2858e;
            c0657b.getClass();
            int m2606g2 = c0391o.m2606g();
            ArrayList arrayList2 = new ArrayList(m2606g2);
            for (int i7 = 0; i7 < m2606g2; i7++) {
                arrayList2.add((C0580e) c0391o.f1946d[i7]);
            }
            Collections.sort(arrayList2, new C0660e(z2, c0656a));
            if (i == 1) {
                int size = arrayList2.size();
                if (c0580e2 != null) {
                    size = arrayList2.indexOf(c0580e2);
                }
                int i8 = size - 1;
                if (i8 >= 0) {
                    obj = arrayList2.get(i8);
                    c0580e = (C0580e) obj;
                }
                obj = null;
                c0580e = (C0580e) obj;
            } else if (i == 2) {
                int size2 = arrayList2.size();
                int lastIndexOf = (c0580e2 == null ? -1 : arrayList2.lastIndexOf(c0580e2)) + 1;
                if (lastIndexOf < size2) {
                    obj = arrayList2.get(lastIndexOf);
                    c0580e = (C0580e) obj;
                }
                obj = null;
                c0580e = (C0580e) obj;
            } else {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
            }
        } else if (i != 17 && i != 33 && i != 66 && i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            Rect rect2 = new Rect();
            int i9 = this.f2868o;
            if (i9 != Integer.MIN_VALUE) {
                m2148o(i9).f2703b.getBoundsInParent(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                View view = this.f2865l;
                int width2 = view.getWidth();
                int height2 = view.getHeight();
                if (i == 17) {
                    rect2.set(width2, 0, width2, height2);
                } else if (i == 33) {
                    rect2.set(0, height2, width2, height2);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height2);
                } else if (i != 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                } else {
                    rect2.set(0, -1, width2, -1);
                }
            }
            C0657b c0657b2 = f2859f;
            C0656a c0656a2 = f2858e;
            Rect rect3 = new Rect(rect2);
            if (i != 17) {
                if (i == 33) {
                    height = rect2.height() + 1;
                } else if (i == 66) {
                    width = -(rect2.width() + 1);
                } else if (i != 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                } else {
                    height = -(rect2.height() + 1);
                }
                rect3.offset(0, height);
                c0657b2.getClass();
                m2606g = c0391o.m2606g();
                Rect rect4 = new Rect();
                c0580e = null;
                for (i2 = 0; i2 < m2606g; i2++) {
                    C0580e c0580e3 = (C0580e) c0391o.f1946d[i2];
                    if (c0580e3 != c0580e2) {
                        c0656a2.m2156a(c0580e3, rect4);
                        if (AbstractC0022t.m3520N(rect2, rect4, i)) {
                            if (AbstractC0022t.m3520N(rect2, rect3, i) && !AbstractC0022t.m3503c(i, rect2, rect4, rect3)) {
                                if (!AbstractC0022t.m3503c(i, rect2, rect3, rect4)) {
                                    int m3517Q = AbstractC0022t.m3517Q(i, rect2, rect4);
                                    int m3516R = AbstractC0022t.m3516R(i, rect2, rect4);
                                    int i10 = (m3516R * m3516R) + (m3517Q * 13 * m3517Q);
                                    int m3517Q2 = AbstractC0022t.m3517Q(i, rect2, rect3);
                                    int m3516R2 = AbstractC0022t.m3516R(i, rect2, rect3);
                                }
                            }
                            z = true;
                            if (!z) {
                                rect3.set(rect4);
                                c0580e = c0580e3;
                            }
                        }
                        z = false;
                        if (!z) {
                        }
                    }
                }
            } else {
                width = rect2.width() + 1;
            }
            rect3.offset(width, 0);
            c0657b2.getClass();
            m2606g = c0391o.m2606g();
            Rect rect42 = new Rect();
            c0580e = null;
            while (i2 < m2606g) {
            }
        }
        C0580e c0580e4 = c0580e;
        if (c0580e4 == null) {
            m2608e = Integer.MIN_VALUE;
        } else {
            while (true) {
                if (i3 >= c0391o.f1947e) {
                    break;
                } else if (c0391o.f1946d[i3] == c0580e4) {
                    i6 = i3;
                    break;
                } else {
                    i3++;
                }
            }
            m2608e = c0391o.m2608e(i6);
        }
        return m2147r(m2608e);
    }

    /* renamed from: o */
    public C0580e m2148o(int i) {
        if (i == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.f2865l);
            C0580e c0580e = new C0580e(obtain);
            View view = this.f2865l;
            AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            mo617m(arrayList);
            if (obtain.getChildCount() <= 0 || arrayList.size() <= 0) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    View view2 = this.f2865l;
                    int intValue = ((Integer) arrayList.get(i2)).intValue();
                    if (Build.VERSION.SDK_INT >= 16) {
                        c0580e.f2703b.addChild(view2, intValue);
                    }
                }
                return c0580e;
            }
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        return m2150l(i);
    }

    /* renamed from: p */
    public abstract boolean mo616p(int i, int i2, Bundle bundle);

    /* renamed from: q */
    public abstract void mo615q(int i, C0580e c0580e);

    /* renamed from: r */
    public final boolean m2147r(int i) {
        int i2;
        if ((this.f2865l.isFocused() || this.f2865l.requestFocus()) && (i2 = this.f2868o) != i) {
            if (i2 != Integer.MIN_VALUE) {
                m2151k(i2);
            }
            this.f2868o = i;
            C1997c c1997c = (C1997c) this;
            if (i == 1) {
                Chip chip = c1997c.f6049q;
                chip.f6778q = true;
                chip.refreshDrawableState();
            }
            m2146s(i, 8);
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final boolean m2146s(int i, int i2) {
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i == Integer.MIN_VALUE || !this.f2864k.isEnabled() || (parent = this.f2865l.getParent()) == null) {
            return false;
        }
        if (i != -1) {
            obtain = AccessibilityEvent.obtain(i2);
            C0580e m2148o = m2148o(i);
            obtain.getText().add(m2148o.m2307g());
            obtain.setContentDescription(m2148o.m2309e());
            obtain.setScrollable(m2148o.f2703b.isScrollable());
            obtain.setPassword(m2148o.f2703b.isPassword());
            obtain.setEnabled(m2148o.f2703b.isEnabled());
            obtain.setChecked(m2148o.f2703b.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(m2148o.f2703b.getClassName());
            View view = this.f2865l;
            if (Build.VERSION.SDK_INT >= 16) {
                obtain.setSource(view, i);
            }
            obtain.setPackageName(this.f2865l.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i2);
            this.f2865l.onInitializeAccessibilityEvent(obtain);
        }
        return parent.requestSendAccessibilityEvent(this.f2865l, obtain);
    }

    /* renamed from: t */
    public final void m2145t(int i) {
        int i2 = this.f2869p;
        if (i2 == i) {
            return;
        }
        this.f2869p = i;
        m2146s(i, 128);
        m2146s(i2, 256);
    }
}