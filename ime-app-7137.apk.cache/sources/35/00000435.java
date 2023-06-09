package p010b.p083u.p084e;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;
import p010b.p046j.p058l.C0568b;
import p010b.p046j.p058l.p059d1.C0580e;
import p010b.p046j.p058l.p059d1.C0584i;

/* renamed from: b.u.e.h2 */
/* loaded from: classes.dex */
public class C0945h2 extends C0568b {

    /* renamed from: d */
    public final C0949i2 f3628d;

    /* renamed from: e */
    public Map f3629e = new WeakHashMap();

    public C0945h2(C0949i2 c0949i2) {
        this.f3628d = c0949i2;
    }

    @Override // p010b.p046j.p058l.C0568b
    /* renamed from: a */
    public boolean mo1648a(View view, AccessibilityEvent accessibilityEvent) {
        C0568b c0568b = (C0568b) this.f3629e.get(view);
        return c0568b != null ? c0568b.mo1648a(view, accessibilityEvent) : this.f2662b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // p010b.p046j.p058l.C0568b
    /* renamed from: b */
    public C0584i mo1647b(View view) {
        C0568b c0568b = (C0568b) this.f3629e.get(view);
        return c0568b != null ? c0568b.mo1647b(view) : super.mo1647b(view);
    }

    @Override // p010b.p046j.p058l.C0568b
    /* renamed from: c */
    public void mo794c(View view, AccessibilityEvent accessibilityEvent) {
        C0568b c0568b = (C0568b) this.f3629e.get(view);
        if (c0568b != null) {
            c0568b.mo794c(view, accessibilityEvent);
        } else {
            this.f2662b.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // p010b.p046j.p058l.C0568b
    /* renamed from: d */
    public void mo534d(View view, C0580e c0580e) {
        if (!this.f3628d.m1641k() && this.f3628d.f3636d.getLayoutManager() != null) {
            this.f3628d.f3636d.getLayoutManager().m1517m0(view, c0580e);
            C0568b c0568b = (C0568b) this.f3629e.get(view);
            if (c0568b != null) {
                c0568b.mo534d(view, c0580e);
                return;
            }
        }
        this.f2662b.onInitializeAccessibilityNodeInfo(view, c0580e.f2703b);
    }

    @Override // p010b.p046j.p058l.C0568b
    /* renamed from: e */
    public void mo687e(View view, AccessibilityEvent accessibilityEvent) {
        C0568b c0568b = (C0568b) this.f3629e.get(view);
        if (c0568b != null) {
            c0568b.mo687e(view, accessibilityEvent);
        } else {
            this.f2662b.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // p010b.p046j.p058l.C0568b
    /* renamed from: f */
    public boolean mo1646f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0568b c0568b = (C0568b) this.f3629e.get(viewGroup);
        return c0568b != null ? c0568b.mo1646f(viewGroup, view, accessibilityEvent) : this.f2662b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // p010b.p046j.p058l.C0568b
    /* renamed from: g */
    public boolean mo1219g(View view, int i, Bundle bundle) {
        if (!this.f3628d.m1641k() && this.f3628d.f3636d.getLayoutManager() != null) {
            C0568b c0568b = (C0568b) this.f3629e.get(view);
            if (c0568b != null) {
                if (c0568b.mo1219g(view, i, bundle)) {
                    return true;
                }
            } else if (super.mo1219g(view, i, bundle)) {
                return true;
            }
            AbstractC0980q1 layoutManager = this.f3628d.f3636d.getLayoutManager();
            C1007x1 c1007x1 = layoutManager.f3773b.f755l;
            return layoutManager.m1583E0();
        }
        return super.mo1219g(view, i, bundle);
    }

    @Override // p010b.p046j.p058l.C0568b
    /* renamed from: h */
    public void mo1645h(View view, int i) {
        C0568b c0568b = (C0568b) this.f3629e.get(view);
        if (c0568b != null) {
            c0568b.mo1645h(view, i);
        } else {
            this.f2662b.sendAccessibilityEvent(view, i);
        }
    }

    @Override // p010b.p046j.p058l.C0568b
    /* renamed from: i */
    public void mo1644i(View view, AccessibilityEvent accessibilityEvent) {
        C0568b c0568b = (C0568b) this.f3629e.get(view);
        if (c0568b != null) {
            c0568b.mo1644i(view, accessibilityEvent);
        } else {
            this.f2662b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }
}