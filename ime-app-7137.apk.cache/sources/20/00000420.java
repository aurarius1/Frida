package p010b.p083u.p084e;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: b.u.e.c1 */
/* loaded from: classes.dex */
public class C0924c1 {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f3549a;

    public C0924c1(RecyclerView recyclerView) {
        this.f3549a = recyclerView;
    }

    /* renamed from: a */
    public View m1706a(int i) {
        return this.f3549a.getChildAt(i);
    }

    /* renamed from: b */
    public int m1705b() {
        return this.f3549a.getChildCount();
    }

    /* renamed from: c */
    public void m1704c(int i) {
        View childAt = this.f3549a.getChildAt(i);
        if (childAt != null) {
            this.f3549a.m3144p(childAt);
            childAt.clearAnimation();
        }
        this.f3549a.removeViewAt(i);
    }
}