package p010b.p083u.p084e;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* renamed from: b.u.e.q2 */
/* loaded from: classes.dex */
public class C0981q2 {

    /* renamed from: a */
    public ArrayList f3789a = new ArrayList();

    /* renamed from: b */
    public int f3790b = Integer.MIN_VALUE;

    /* renamed from: c */
    public int f3791c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f3792d = 0;

    /* renamed from: e */
    public final int f3793e;

    /* renamed from: f */
    public final /* synthetic */ StaggeredGridLayoutManager f3794f;

    public C0981q2(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f3794f = staggeredGridLayoutManager;
        this.f3793e = i;
    }

    /* renamed from: a */
    public void m1490a(View view) {
        C0965m2 m1481j = m1481j(view);
        m1481j.f3722e = this;
        this.f3789a.add(view);
        this.f3791c = Integer.MIN_VALUE;
        if (this.f3789a.size() == 1) {
            this.f3790b = Integer.MIN_VALUE;
        }
        if (m1481j.m1471c() || m1481j.m1472b()) {
            this.f3792d = this.f3794f.f802t.mo1444c(view) + this.f3792d;
        }
    }

    /* renamed from: b */
    public void m1489b() {
        ArrayList arrayList = this.f3789a;
        View view = (View) arrayList.get(arrayList.size() - 1);
        C0965m2 m1481j = m1481j(view);
        this.f3791c = this.f3794f.f802t.mo1445b(view);
        m1481j.getClass();
    }

    /* renamed from: c */
    public void m1488c() {
        View view = (View) this.f3789a.get(0);
        C0965m2 m1481j = m1481j(view);
        this.f3790b = this.f3794f.f802t.mo1442e(view);
        m1481j.getClass();
    }

    /* renamed from: d */
    public void m1487d() {
        this.f3789a.clear();
        this.f3790b = Integer.MIN_VALUE;
        this.f3791c = Integer.MIN_VALUE;
        this.f3792d = 0;
    }

    /* renamed from: e */
    public int m1486e() {
        int i;
        int size;
        if (this.f3794f.f807y) {
            i = this.f3789a.size() - 1;
            size = -1;
        } else {
            i = 0;
            size = this.f3789a.size();
        }
        return m1484g(i, size, true);
    }

    /* renamed from: f */
    public int m1485f() {
        int size;
        int i;
        if (this.f3794f.f807y) {
            size = 0;
            i = this.f3789a.size();
        } else {
            size = this.f3789a.size() - 1;
            i = -1;
        }
        return m1484g(size, i, true);
    }

    /* renamed from: g */
    public int m1484g(int i, int i2, boolean z) {
        int mo1436k = this.f3794f.f802t.mo1436k();
        int mo1440g = this.f3794f.f802t.mo1440g();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.f3789a.get(i);
            int mo1442e = this.f3794f.f802t.mo1442e(view);
            int mo1445b = this.f3794f.f802t.mo1445b(view);
            boolean z2 = false;
            boolean z3 = !z ? mo1442e >= mo1440g : mo1442e > mo1440g;
            if (!z ? mo1445b > mo1436k : mo1445b >= mo1436k) {
                z2 = true;
            }
            if (z3 && z2 && (mo1442e < mo1436k || mo1445b > mo1440g)) {
                return this.f3794f.m1556S(view);
            }
            i += i3;
        }
        return -1;
    }

    /* renamed from: h */
    public int m1483h(int i) {
        int i2 = this.f3791c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f3789a.size() == 0) {
            return i;
        }
        m1489b();
        return this.f3791c;
    }

    /* renamed from: i */
    public View m1482i(int i, int i2) {
        View view = null;
        if (i2 != -1) {
            int size = this.f3789a.size() - 1;
            while (size >= 0) {
                View view2 = (View) this.f3789a.get(size);
                StaggeredGridLayoutManager staggeredGridLayoutManager = this.f3794f;
                if (staggeredGridLayoutManager.f807y && staggeredGridLayoutManager.m1556S(view2) >= i) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager2 = this.f3794f;
                if ((!staggeredGridLayoutManager2.f807y && staggeredGridLayoutManager2.m1556S(view2) <= i) || !view2.hasFocusable()) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = this.f3789a.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = (View) this.f3789a.get(i3);
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = this.f3794f;
                if (staggeredGridLayoutManager3.f807y && staggeredGridLayoutManager3.m1556S(view3) <= i) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = this.f3794f;
                if ((!staggeredGridLayoutManager4.f807y && staggeredGridLayoutManager4.m1556S(view3) >= i) || !view3.hasFocusable()) {
                    break;
                }
                i3++;
                view = view3;
            }
        }
        return view;
    }

    /* renamed from: j */
    public C0965m2 m1481j(View view) {
        return (C0965m2) view.getLayoutParams();
    }

    /* renamed from: k */
    public int m1480k(int i) {
        int i2 = this.f3790b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f3789a.size() == 0) {
            return i;
        }
        m1488c();
        return this.f3790b;
    }

    /* renamed from: l */
    public void m1479l() {
        int size = this.f3789a.size();
        View view = (View) this.f3789a.remove(size - 1);
        C0965m2 m1481j = m1481j(view);
        m1481j.f3722e = null;
        if (m1481j.m1471c() || m1481j.m1472b()) {
            this.f3792d -= this.f3794f.f802t.mo1444c(view);
        }
        if (size == 1) {
            this.f3790b = Integer.MIN_VALUE;
        }
        this.f3791c = Integer.MIN_VALUE;
    }

    /* renamed from: m */
    public void m1478m() {
        View view = (View) this.f3789a.remove(0);
        C0965m2 m1481j = m1481j(view);
        m1481j.f3722e = null;
        if (this.f3789a.size() == 0) {
            this.f3791c = Integer.MIN_VALUE;
        }
        if (m1481j.m1471c() || m1481j.m1472b()) {
            this.f3792d -= this.f3794f.f802t.mo1444c(view);
        }
        this.f3790b = Integer.MIN_VALUE;
    }

    /* renamed from: n */
    public void m1477n(View view) {
        C0965m2 m1481j = m1481j(view);
        m1481j.f3722e = this;
        this.f3789a.add(0, view);
        this.f3790b = Integer.MIN_VALUE;
        if (this.f3789a.size() == 1) {
            this.f3791c = Integer.MIN_VALUE;
        }
        if (m1481j.m1471c() || m1481j.m1472b()) {
            this.f3792d = this.f3794f.f802t.mo1444c(view) + this.f3792d;
        }
    }
}