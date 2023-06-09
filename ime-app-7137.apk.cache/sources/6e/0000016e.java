package p010b.p016c.p026q;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: b.c.q.e */
/* loaded from: classes.dex */
public class RunnableC0234e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ActionBarOverlayLayout f1518b;

    public RunnableC0234e(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f1518b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1518b.m3433i();
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1518b;
        actionBarOverlayLayout.f200C = actionBarOverlayLayout.f208f.animate().translationY(0.0f).setListener(this.f1518b.f201D);
    }
}