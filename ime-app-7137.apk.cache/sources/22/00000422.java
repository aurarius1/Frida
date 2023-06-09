package p010b.p083u.p084e;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p010b.p046j.p058l.AbstractC0605j0;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.u.e.d */
/* loaded from: classes.dex */
public class C0926d {

    /* renamed from: a */
    public final C0924c1 f3550a;

    /* renamed from: b */
    public final C0922c f3551b = new C0922c();

    /* renamed from: c */
    public final List f3552c = new ArrayList();

    public C0926d(C0924c1 c0924c1) {
        this.f3550a = c0924c1;
    }

    /* renamed from: a */
    public void m1702a(View view, int i, boolean z) {
        int m1705b = i < 0 ? this.f3550a.m1705b() : m1697f(i);
        this.f3551b.m1710e(m1705b, z);
        if (z) {
            m1694i(view);
        }
        C0924c1 c0924c1 = this.f3550a;
        c0924c1.f3549a.addView(view, m1705b);
        RecyclerView recyclerView = c0924c1.f3549a;
        recyclerView.getClass();
        RecyclerView.m3189K(view);
        recyclerView.m3180T();
        List list = recyclerView.f733N;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ((C0959l0) recyclerView.f733N.get(size)).getClass();
        }
    }

    /* renamed from: b */
    public void m1701b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int m1705b = i < 0 ? this.f3550a.m1705b() : m1697f(i);
        this.f3551b.m1710e(m1705b, z);
        if (z) {
            m1694i(view);
        }
        C0924c1 c0924c1 = this.f3550a;
        c0924c1.getClass();
        AbstractC0941g2 m3189K = RecyclerView.m3189K(view);
        if (m3189K != null) {
            if (!m3189K.m1657p() && !m3189K.m1651v()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(m3189K);
                throw new IllegalArgumentException(AbstractC1124a.m1194b(c0924c1.f3549a, sb));
            }
            m3189K.f3614l &= -257;
        }
        c0924c1.f3549a.attachViewToParent(view, m1705b, layoutParams);
    }

    /* renamed from: c */
    public void m1700c(int i) {
        AbstractC0941g2 m3189K;
        int m1697f = m1697f(i);
        this.f3551b.m1709f(m1697f);
        C0924c1 c0924c1 = this.f3550a;
        View childAt = c0924c1.f3549a.getChildAt(m1697f);
        if (childAt != null && (m3189K = RecyclerView.m3189K(childAt)) != null) {
            if (m3189K.m1657p() && !m3189K.m1651v()) {
                StringBuilder sb = new StringBuilder();
                sb.append("called detach on an already detached child ");
                sb.append(m3189K);
                throw new IllegalArgumentException(AbstractC1124a.m1194b(c0924c1.f3549a, sb));
            }
            m3189K.m1671b(256);
        }
        c0924c1.f3549a.detachViewFromParent(m1697f);
    }

    /* renamed from: d */
    public View m1699d(int i) {
        return this.f3550a.m1706a(m1697f(i));
    }

    /* renamed from: e */
    public int m1698e() {
        return this.f3550a.m1705b() - this.f3552c.size();
    }

    /* renamed from: f */
    public final int m1697f(int i) {
        if (i < 0) {
            return -1;
        }
        int m1705b = this.f3550a.m1705b();
        int i2 = i;
        while (i2 < m1705b) {
            int m1713b = i - (i2 - this.f3551b.m1713b(i2));
            if (m1713b == 0) {
                while (this.f3551b.m1711d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += m1713b;
        }
        return -1;
    }

    /* renamed from: g */
    public View m1696g(int i) {
        return this.f3550a.f3549a.getChildAt(i);
    }

    /* renamed from: h */
    public int m1695h() {
        return this.f3550a.m1705b();
    }

    /* renamed from: i */
    public final void m1694i(View view) {
        this.f3552c.add(view);
        C0924c1 c0924c1 = this.f3550a;
        c0924c1.getClass();
        AbstractC0941g2 m3189K = RecyclerView.m3189K(view);
        if (m3189K != null) {
            RecyclerView recyclerView = c0924c1.f3549a;
            int i = m3189K.f3621s;
            if (i == -1) {
                i = AbstractC0605j0.m2242p(m3189K.f3605c);
            }
            m3189K.f3620r = i;
            recyclerView.m3151l0(m3189K, 4);
        }
    }

    /* renamed from: j */
    public int m1693j(View view) {
        int indexOfChild = this.f3550a.f3549a.indexOfChild(view);
        if (indexOfChild == -1 || this.f3551b.m1711d(indexOfChild)) {
            return -1;
        }
        return indexOfChild - this.f3551b.m1713b(indexOfChild);
    }

    /* renamed from: k */
    public boolean m1692k(View view) {
        return this.f3552c.contains(view);
    }

    /* renamed from: l */
    public final boolean m1691l(View view) {
        if (this.f3552c.remove(view)) {
            C0924c1 c0924c1 = this.f3550a;
            c0924c1.getClass();
            AbstractC0941g2 m3189K = RecyclerView.m3189K(view);
            if (m3189K != null) {
                c0924c1.f3549a.m3151l0(m3189K, m3189K.f3620r);
                m3189K.f3620r = 0;
                return true;
            }
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f3551b.toString() + ", hidden list:" + this.f3552c.size();
    }
}