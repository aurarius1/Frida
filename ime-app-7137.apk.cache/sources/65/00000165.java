package p010b.p016c.p026q;

import android.widget.AbsListView;

/* renamed from: b.c.q.c2 */
/* loaded from: classes.dex */
public class C0225c2 implements AbsListView.OnScrollListener {

    /* renamed from: a */
    public final /* synthetic */ C0243f2 f1497a;

    public C0225c2(C0243f2 c0243f2) {
        this.f1497a = c0243f2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            if ((this.f1497a.f1558D.getInputMethodMode() == 2) || this.f1497a.f1558D.getContentView() == null) {
                return;
            }
            C0243f2 c0243f2 = this.f1497a;
            c0243f2.f1580z.removeCallbacks(c0243f2.f1576v);
            this.f1497a.f1576v.run();
        }
    }
}