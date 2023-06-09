package p010b.p083u.p084e;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import p010b.p046j.p058l.C0568b;
import p010b.p046j.p058l.p059d1.C0578c;
import p010b.p046j.p058l.p059d1.C0580e;

/* renamed from: b.u.e.i2 */
/* loaded from: classes.dex */
public class C0949i2 extends C0568b {

    /* renamed from: d */
    public final RecyclerView f3636d;

    /* renamed from: e */
    public final C0945h2 f3637e;

    public C0949i2(RecyclerView recyclerView) {
        this.f3636d = recyclerView;
        C0568b mo1642j = mo1642j();
        this.f3637e = (mo1642j == null || !(mo1642j instanceof C0945h2)) ? new C0945h2(this) : (C0945h2) mo1642j;
    }

    @Override // p010b.p046j.p058l.C0568b
    /* renamed from: c */
    public void mo794c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2662b.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || m1641k()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo1521k0(accessibilityEvent);
        }
    }

    @Override // p010b.p046j.p058l.C0568b
    /* renamed from: d */
    public void mo534d(View view, C0580e c0580e) {
        this.f2662b.onInitializeAccessibilityNodeInfo(view, c0580e.f2703b);
        if (m1641k() || this.f3636d.getLayoutManager() == null) {
            return;
        }
        AbstractC0980q1 layoutManager = this.f3636d.getLayoutManager();
        RecyclerView recyclerView = layoutManager.f3773b;
        C1007x1 c1007x1 = recyclerView.f755l;
        C0929d2 c0929d2 = recyclerView.f770s0;
        if (recyclerView.canScrollVertically(-1) || layoutManager.f3773b.canScrollHorizontally(-1)) {
            c0580e.f2703b.addAction(8192);
            c0580e.f2703b.setScrollable(true);
        }
        if (layoutManager.f3773b.canScrollVertically(1) || layoutManager.f3773b.canScrollHorizontally(1)) {
            c0580e.f2703b.addAction(4096);
            c0580e.f2703b.setScrollable(true);
        }
        c0580e.m2305i(C0578c.m2315a(layoutManager.mo1552U(c1007x1, c0929d2), layoutManager.mo1590B(c1007x1, c0929d2), layoutManager.m1545Y(), layoutManager.m1550V()));
    }

    @Override // p010b.p046j.p058l.C0568b
    /* renamed from: g */
    public boolean mo1219g(View view, int i, Bundle bundle) {
        if (super.mo1219g(view, i, bundle)) {
            return true;
        }
        if (m1641k() || this.f3636d.getLayoutManager() == null) {
            return false;
        }
        AbstractC0980q1 layoutManager = this.f3636d.getLayoutManager();
        C1007x1 c1007x1 = layoutManager.f3773b.f755l;
        return layoutManager.m1585D0(i);
    }

    /* renamed from: j */
    public C0568b mo1642j() {
        return this.f3637e;
    }

    /* renamed from: k */
    public boolean m1641k() {
        return this.f3636d.m3187M();
    }
}