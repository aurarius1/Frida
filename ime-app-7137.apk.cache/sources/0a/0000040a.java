package p010b.p082t;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p010b.p083u.p084e.AbstractC0941g2;
import p010b.p083u.p084e.AbstractC0964m1;
import p010b.p083u.p084e.C0929d2;

/* renamed from: b.t.w */
/* loaded from: classes.dex */
public class C0902w extends AbstractC0964m1 {

    /* renamed from: a */
    public Drawable f3510a;

    /* renamed from: b */
    public int f3511b;

    /* renamed from: c */
    public boolean f3512c = true;

    /* renamed from: d */
    public final /* synthetic */ AbstractC0904x f3513d;

    public C0902w(AbstractC0904x abstractC0904x) {
        this.f3513d = abstractC0904x;
    }

    @Override // p010b.p083u.p084e.AbstractC0964m1
    /* renamed from: d */
    public void mo1129d(Rect rect, View view, RecyclerView recyclerView, C0929d2 c0929d2) {
        if (m1736g(view, recyclerView)) {
            rect.bottom = this.f3511b;
        }
    }

    @Override // p010b.p083u.p084e.AbstractC0964m1
    /* renamed from: f */
    public void mo1463f(Canvas canvas, RecyclerView recyclerView, C0929d2 c0929d2) {
        if (this.f3510a == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (m1736g(childAt, recyclerView)) {
                int height = childAt.getHeight() + ((int) childAt.getY());
                this.f3510a.setBounds(0, height, width, this.f3511b + height);
                this.f3510a.draw(canvas);
            }
        }
    }

    /* renamed from: g */
    public final boolean m1736g(View view, RecyclerView recyclerView) {
        AbstractC0941g2 m3190J = recyclerView.m3190J(view);
        boolean z = false;
        if ((m3190J instanceof C0881l0) && ((C0881l0) m3190J).f3488x) {
            boolean z2 = this.f3512c;
            int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild < recyclerView.getChildCount() - 1) {
                AbstractC0941g2 m3190J2 = recyclerView.m3190J(recyclerView.getChildAt(indexOfChild + 1));
                if ((m3190J2 instanceof C0881l0) && ((C0881l0) m3190J2).f3487w) {
                    z = true;
                }
                return z;
            }
            return z2;
        }
        return false;
    }
}