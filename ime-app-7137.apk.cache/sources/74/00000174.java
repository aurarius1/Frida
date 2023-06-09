package p010b.p016c.p026q;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: b.c.q.f */
/* loaded from: classes.dex */
public class RunnableC0240f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ActionBarOverlayLayout f1544b;

    public RunnableC0240f(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f1544b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1544b.m3433i();
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1544b;
        actionBarOverlayLayout.f200C = actionBarOverlayLayout.f208f.animate().translationY(-this.f1544b.f208f.getHeight()).setListener(this.f1544b.f201D);
    }
}