package p010b.p046j.p058l;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p010b.p046j.AbstractC0462b;
import p010b.p046j.p058l.p059d1.AbstractC0585j;
import p010b.p046j.p058l.p059d1.C0577b;
import p010b.p046j.p058l.p059d1.C0580e;
import p010b.p046j.p058l.p059d1.C0584i;

/* renamed from: b.j.l.b */
/* loaded from: classes.dex */
public class C0568b {

    /* renamed from: a */
    public static final View.AccessibilityDelegate f2661a = new View.AccessibilityDelegate();

    /* renamed from: b */
    public final View.AccessibilityDelegate f2662b;

    /* renamed from: c */
    public final View.AccessibilityDelegate f2663c;

    public C0568b() {
        this.f2662b = f2661a;
        this.f2663c = new C0565a(this);
    }

    public C0568b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2662b = accessibilityDelegate;
        this.f2663c = new C0565a(this);
    }

    /* renamed from: a */
    public boolean mo1648a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2662b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C0584i mo1647b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f2662b.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new C0584i(accessibilityNodeProvider);
    }

    /* renamed from: c */
    public void mo794c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2662b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo534d(View view, C0580e c0580e) {
        this.f2662b.onInitializeAccessibilityNodeInfo(view, c0580e.f2703b);
    }

    /* renamed from: e */
    public void mo687e(View view, AccessibilityEvent accessibilityEvent) {
        this.f2662b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: f */
    public boolean mo1646f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2662b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: g */
    public boolean mo1219g(View view, int i, Bundle bundle) {
        boolean z;
        WeakReference weakReference;
        boolean z2;
        List list = (List) view.getTag(AbstractC0462b.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                break;
            }
            C0577b c0577b = (C0577b) list.get(i2);
            if (c0577b.m2316a() != i) {
                i2++;
            } else if (c0577b.f2699l != null) {
                Class cls = c0577b.f2698k;
                AbstractC0585j abstractC0585j = null;
                if (cls != null) {
                    try {
                        AbstractC0585j abstractC0585j2 = (AbstractC0585j) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        try {
                            throw null;
                        } catch (Exception unused) {
                            abstractC0585j = abstractC0585j2;
                        }
                    } catch (Exception unused2) {
                    }
                }
                z = c0577b.f2699l.mo628a(view, abstractC0585j);
            }
        }
        z = false;
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = this.f2662b.performAccessibilityAction(view, i, bundle);
        }
        if (z || i != AbstractC0462b.accessibility_action_clickable_span) {
            return z;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(AbstractC0462b.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null) {
            ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
            if (clickableSpan != null) {
                ClickableSpan[] m2310d = C0580e.m2310d(view.createAccessibilityNodeInfo().getText());
                for (int i4 = 0; m2310d != null && i4 < m2310d.length; i4++) {
                    if (clickableSpan.equals(m2310d[i4])) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (z2) {
                clickableSpan.onClick(view);
                z3 = true;
            }
        }
        return z3;
    }

    /* renamed from: h */
    public void mo1645h(View view, int i) {
        this.f2662b.sendAccessibilityEvent(view, i);
    }

    /* renamed from: i */
    public void mo1644i(View view, AccessibilityEvent accessibilityEvent) {
        this.f2662b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}