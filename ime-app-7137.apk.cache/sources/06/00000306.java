package p010b.p046j.p061m;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import p010b.p046j.p058l.C0568b;
import p010b.p046j.p058l.p059d1.C0577b;
import p010b.p046j.p058l.p059d1.C0580e;

/* renamed from: b.j.m.e */
/* loaded from: classes.dex */
public class C0642e extends C0568b {
    @Override // p010b.p046j.p058l.C0568b
    /* renamed from: c */
    public void mo794c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2662b.onInitializeAccessibilityEvent(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
    }

    @Override // p010b.p046j.p058l.C0568b
    /* renamed from: d */
    public void mo534d(View view, C0580e c0580e) {
        int scrollRange;
        this.f2662b.onInitializeAccessibilityNodeInfo(view, c0580e.f2703b);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        c0580e.f2703b.setClassName(ScrollView.class.getName());
        if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
            return;
        }
        c0580e.f2703b.setScrollable(true);
        if (nestedScrollView.getScrollY() > 0) {
            c0580e.m2313a(C0577b.f2690c);
            c0580e.m2313a(C0577b.f2694g);
        }
        if (nestedScrollView.getScrollY() < scrollRange) {
            c0580e.m2313a(C0577b.f2689b);
            c0580e.m2313a(C0577b.f2695h);
        }
    }

    @Override // p010b.p046j.p058l.C0568b
    /* renamed from: g */
    public boolean mo1219g(View view, int i, Bundle bundle) {
        int min;
        if (super.mo1219g(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (nestedScrollView.isEnabled()) {
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    min = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (min == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.m3333B(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), 250, true);
                    return true;
                } else if (i != 16908346) {
                    return false;
                }
            }
            min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.m3333B(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), 250, true);
            return true;
        }
        return false;
    }
}