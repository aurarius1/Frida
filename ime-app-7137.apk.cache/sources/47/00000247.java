package p010b.p044i.p045d;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.C0573c1;
import p010b.p046j.p058l.InterfaceC0622s;

/* renamed from: b.i.d.a */
/* loaded from: classes.dex */
public class C0451a implements InterfaceC0622s {

    /* renamed from: a */
    public final /* synthetic */ CoordinatorLayout f2409a;

    public C0451a(CoordinatorLayout coordinatorLayout) {
        this.f2409a = coordinatorLayout;
    }

    @Override // p010b.p046j.p058l.InterfaceC0622s
    /* renamed from: a */
    public C0573c1 mo763a(View view, C0573c1 c0573c1) {
        AbstractC0452b abstractC0452b;
        CoordinatorLayout coordinatorLayout = this.f2409a;
        if (!AbstractC0022t.m3463w(coordinatorLayout.f447u, c0573c1)) {
            coordinatorLayout.f447u = c0573c1;
            boolean z = true;
            boolean z2 = c0573c1.m2323d() > 0;
            coordinatorLayout.f448v = z2;
            coordinatorLayout.setWillNotDraw((z2 || coordinatorLayout.getBackground() != null) ? false : false);
            if (!c0573c1.m2321f()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    if (AbstractC0605j0.m2243o(childAt) && (abstractC0452b = ((C0455e) childAt.getLayoutParams()).f2411a) != null) {
                        c0573c1 = abstractC0452b.m2446e(c0573c1);
                        if (c0573c1.m2321f()) {
                            break;
                        }
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return c0573c1;
    }
}