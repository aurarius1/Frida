package p010b.p046j.p058l;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: b.j.l.d0 */
/* loaded from: classes.dex */
public class View$OnApplyWindowInsetsListenerC0575d0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public C0573c1 f2682a = null;

    /* renamed from: b */
    public final /* synthetic */ View f2683b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC0622s f2684c;

    public View$OnApplyWindowInsetsListenerC0575d0(View view, InterfaceC0622s interfaceC0622s) {
        this.f2683b = view;
        this.f2684c = interfaceC0622s;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C0573c1 m2317j = C0573c1.m2317j(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            AbstractC0588e0.m2302a(windowInsets, this.f2683b);
            if (m2317j.equals(this.f2682a)) {
                return this.f2684c.mo763a(view, m2317j).m2319h();
            }
        }
        this.f2682a = m2317j;
        C0573c1 mo763a = this.f2684c.mo763a(view, m2317j);
        if (i >= 30) {
            return mo763a.m2319h();
        }
        AbstractC0605j0.m2271L(view);
        return mo763a.m2319h();
    }
}