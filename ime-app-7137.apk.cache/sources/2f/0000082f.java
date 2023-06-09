package p093c.p145g.p146a.p147a.p164p;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p064l.p066b.C0664i;

/* renamed from: c.g.a.a.p.d */
/* loaded from: classes.dex */
public class RunnableC1963d implements Runnable {

    /* renamed from: b */
    public final View f5945b;

    /* renamed from: c */
    public final boolean f5946c;

    /* renamed from: d */
    public final /* synthetic */ SwipeDismissBehavior f5947d;

    public RunnableC1963d(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.f5947d = swipeDismissBehavior;
        this.f5945b = view;
        this.f5946c = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0664i c0664i = this.f5947d.f6668a;
        if (c0664i != null && c0664i.m2136i(true)) {
            AbstractC0605j0.m2276G(this.f5945b, this);
        } else if (this.f5946c) {
            this.f5947d.getClass();
        }
    }
}