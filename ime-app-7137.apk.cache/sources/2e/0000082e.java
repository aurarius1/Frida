package p093c.p145g.p146a.p147a.p164p;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.p059d1.AbstractC0585j;
import p010b.p046j.p058l.p059d1.InterfaceC0586k;

/* renamed from: c.g.a.a.p.c */
/* loaded from: classes.dex */
public class C1962c implements InterfaceC0586k {

    /* renamed from: a */
    public final /* synthetic */ SwipeDismissBehavior f5944a;

    public C1962c(SwipeDismissBehavior swipeDismissBehavior) {
        this.f5944a = swipeDismissBehavior;
    }

    @Override // p010b.p046j.p058l.p059d1.InterfaceC0586k
    /* renamed from: a */
    public boolean mo628a(View view, AbstractC0585j abstractC0585j) {
        boolean z = false;
        if (this.f5944a.mo273B(view)) {
            boolean z2 = AbstractC0605j0.m2241q(view) == 1;
            int i = this.f5944a.f6670c;
            if ((i == 0 && z2) || (i == 1 && !z2)) {
                z = true;
            }
            int width = view.getWidth();
            if (z) {
                width = -width;
            }
            AbstractC0605j0.m2281B(view, width);
            view.setAlpha(0.0f);
            this.f5944a.getClass();
            return true;
        }
        return false;
    }
}