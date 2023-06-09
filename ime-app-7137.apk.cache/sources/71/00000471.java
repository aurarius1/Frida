package p010b.p083u.p084e;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p010b.p046j.p054h.AbstractC0530c;

/* renamed from: b.u.e.x */
/* loaded from: classes.dex */
public final class RunnableC1005x implements Runnable {

    /* renamed from: b */
    public static final ThreadLocal f3882b = new ThreadLocal();

    /* renamed from: c */
    public static Comparator f3883c = new C0994u();

    /* renamed from: e */
    public long f3885e;

    /* renamed from: f */
    public long f3886f;

    /* renamed from: d */
    public ArrayList f3884d = new ArrayList();

    /* renamed from: g */
    public ArrayList f3887g = new ArrayList();

    /* renamed from: a */
    public void m1419a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f3885e == 0) {
            this.f3885e = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0998v c0998v = recyclerView.f768r0;
        c0998v.f3861a = i;
        c0998v.f3862b = i2;
    }

    /* renamed from: b */
    public void m1418b(long j) {
        C1002w c1002w;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C1002w c1002w2;
        int size = this.f3884d.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) this.f3884d.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.f768r0.m1448b(recyclerView3, false);
                i += recyclerView3.f768r0.f3864d;
            }
        }
        this.f3887g.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) this.f3884d.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0998v c0998v = recyclerView4.f768r0;
                int abs = Math.abs(c0998v.f3862b) + Math.abs(c0998v.f3861a);
                for (int i5 = 0; i5 < c0998v.f3864d * 2; i5 += 2) {
                    if (i3 >= this.f3887g.size()) {
                        c1002w2 = new C1002w();
                        this.f3887g.add(c1002w2);
                    } else {
                        c1002w2 = (C1002w) this.f3887g.get(i3);
                    }
                    int[] iArr = c0998v.f3863c;
                    int i6 = iArr[i5 + 1];
                    c1002w2.f3874a = i6 <= abs;
                    c1002w2.f3875b = abs;
                    c1002w2.f3876c = i6;
                    c1002w2.f3877d = recyclerView4;
                    c1002w2.f3878e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f3887g, f3883c);
        for (int i7 = 0; i7 < this.f3887g.size() && (recyclerView = (c1002w = (C1002w) this.f3887g.get(i7)).f3877d) != null; i7++) {
            AbstractC0941g2 m1417c = m1417c(recyclerView, c1002w.f3878e, c1002w.f3874a ? Long.MAX_VALUE : j);
            if (m1417c != null && m1417c.f3606d != null && m1417c.m1662k() && !m1417c.m1661l() && (recyclerView2 = (RecyclerView) m1417c.f3606d.get()) != null) {
                if (recyclerView2.f734O && recyclerView2.f761o.m1695h() != 0) {
                    recyclerView2.m3165e0();
                }
                C0998v c0998v2 = recyclerView2.f768r0;
                c0998v2.m1448b(recyclerView2, true);
                if (c0998v2.f3864d != 0) {
                    try {
                        AbstractC0530c.m2348a("RV Nested Prefetch");
                        C0929d2 c0929d2 = recyclerView2.f770s0;
                        AbstractC0932e1 abstractC0932e1 = recyclerView2.f775v;
                        c0929d2.f3573d = 1;
                        c0929d2.f3574e = abstractC0932e1.mo543a();
                        c0929d2.f3576g = false;
                        c0929d2.f3577h = false;
                        c0929d2.f3578i = false;
                        for (int i8 = 0; i8 < c0998v2.f3864d * 2; i8 += 2) {
                            m1417c(recyclerView2, c0998v2.f3863c[i8], j);
                        }
                    } finally {
                        AbstractC0530c.m2347b();
                    }
                } else {
                    continue;
                }
            }
            c1002w.f3874a = false;
            c1002w.f3875b = 0;
            c1002w.f3876c = 0;
            c1002w.f3877d = null;
            c1002w.f3878e = 0;
        }
    }

    /* renamed from: c */
    public final AbstractC0941g2 m1417c(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int m1695h = recyclerView.f761o.m1695h();
        int i2 = 0;
        while (true) {
            if (i2 >= m1695h) {
                z = false;
                break;
            }
            AbstractC0941g2 m3189K = RecyclerView.m3189K(recyclerView.f761o.m1696g(i2));
            if (m3189K.f3607e == i && !m3189K.m1661l()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return null;
        }
        C1007x1 c1007x1 = recyclerView.f755l;
        try {
            recyclerView.m3178V();
            AbstractC0941g2 m1397k = c1007x1.m1397k(i, false, j);
            if (m1397k != null) {
                if (!m1397k.m1662k() || m1397k.m1661l()) {
                    c1007x1.m1407a(m1397k, false);
                } else {
                    c1007x1.m1400h(m1397k.f3605c);
                }
            }
            return m1397k;
        } finally {
            recyclerView.m3177W(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            AbstractC0530c.m2348a("RV Prefetch");
            if (!this.f3884d.isEmpty()) {
                int size = this.f3884d.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) this.f3884d.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    m1418b(TimeUnit.MILLISECONDS.toNanos(j) + this.f3886f);
                }
            }
        } finally {
            this.f3885e = 0L;
            AbstractC0530c.m2347b();
        }
    }
}