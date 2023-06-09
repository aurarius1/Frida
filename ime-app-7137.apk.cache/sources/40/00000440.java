package p010b.p083u.p084e;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: b.u.e.k1 */
/* loaded from: classes.dex */
public abstract class AbstractC0956k1 {

    /* renamed from: a */
    public C0960l1 f3658a = null;

    /* renamed from: b */
    public ArrayList f3659b = new ArrayList();

    /* renamed from: c */
    public long f3660c = 120;

    /* renamed from: d */
    public long f3661d = 120;

    /* renamed from: e */
    public long f3662e = 250;

    /* renamed from: f */
    public long f3663f = 250;

    /* renamed from: b */
    public static int m1632b(AbstractC0941g2 abstractC0941g2) {
        int i = abstractC0941g2.f3614l & 14;
        if (abstractC0941g2.m1661l()) {
            return 4;
        }
        if ((i & 4) == 0) {
            int i2 = abstractC0941g2.f3608f;
            int m1668e = abstractC0941g2.m1668e();
            return (i2 == -1 || m1668e == -1 || i2 == m1668e) ? i : i | 2048;
        }
        return i;
    }

    /* renamed from: a */
    public abstract boolean mo1611a(AbstractC0941g2 abstractC0941g2, AbstractC0941g2 abstractC0941g22, C0952j1 c0952j1, C0952j1 c0952j12);

    /* renamed from: c */
    public final void m1631c(AbstractC0941g2 abstractC0941g2) {
        C0960l1 c0960l1 = this.f3658a;
        if (c0960l1 != null) {
            c0960l1.getClass();
            boolean z = true;
            abstractC0941g2.m1652u(true);
            if (abstractC0941g2.f3612j != null && abstractC0941g2.f3613k == null) {
                abstractC0941g2.f3612j = null;
            }
            abstractC0941g2.f3613k = null;
            if ((abstractC0941g2.f3614l & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = c0960l1.f3699a;
            View view = abstractC0941g2.f3605c;
            recyclerView.m3147n0();
            C0926d c0926d = recyclerView.f761o;
            int indexOfChild = c0926d.f3550a.f3549a.indexOfChild(view);
            if (indexOfChild == -1) {
                c0926d.m1691l(view);
            } else if (c0926d.f3551b.m1711d(indexOfChild)) {
                c0926d.f3551b.m1709f(indexOfChild);
                c0926d.m1691l(view);
                c0926d.f3550a.m1704c(indexOfChild);
            } else {
                z = false;
            }
            if (z) {
                AbstractC0941g2 m3189K = RecyclerView.m3189K(view);
                recyclerView.f755l.m1396l(m3189K);
                recyclerView.f755l.m1399i(m3189K);
            }
            recyclerView.m3143p0(!z);
            if (z || !abstractC0941g2.m1657p()) {
                return;
            }
            c0960l1.f3699a.removeDetachedView(abstractC0941g2.f3605c, false);
        }
    }

    /* renamed from: d */
    public final void m1630d() {
        int size = this.f3659b.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC0948i1) this.f3659b.get(i)).m1643a();
        }
        this.f3659b.clear();
    }

    /* renamed from: e */
    public abstract void mo1610e(AbstractC0941g2 abstractC0941g2);

    /* renamed from: f */
    public abstract void mo1609f();

    /* renamed from: g */
    public abstract boolean mo1608g();

    /* renamed from: h */
    public C0952j1 m1629h(AbstractC0941g2 abstractC0941g2) {
        C0952j1 c0952j1 = new C0952j1();
        View view = abstractC0941g2.f3605c;
        c0952j1.f3645a = view.getLeft();
        c0952j1.f3646b = view.getTop();
        view.getRight();
        view.getBottom();
        return c0952j1;
    }
}