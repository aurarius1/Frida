package p010b.p083u.p084e;

import android.database.Observable;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: b.u.e.f1 */
/* loaded from: classes.dex */
public class C0936f1 extends Observable {
    /* renamed from: a */
    public boolean m1681a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    /* renamed from: b */
    public void m1680b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            C1013z1 c1013z1 = (C1013z1) ((Observable) this).mObservers.get(size);
            c1013z1.f3904a.m3158i(null);
            RecyclerView recyclerView = c1013z1.f3904a;
            recyclerView.f770s0.f3575f = true;
            recyclerView.m3169c0(true);
            if (!c1013z1.f3904a.f759n.m1725g()) {
                c1013z1.f3904a.requestLayout();
            }
        }
    }

    /* renamed from: c */
    public void m1679c(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            C1013z1 c1013z1 = (C1013z1) ((Observable) this).mObservers.get(size);
            c1013z1.f3904a.m3158i(null);
            C0918b c0918b = c1013z1.f3904a.f759n;
            c0918b.getClass();
            boolean z = false;
            if (i != i2) {
                c0918b.f3532b.add(c0918b.m1724h(8, i, i2, null));
                c0918b.f3536f |= 8;
                if (c0918b.f3532b.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                c1013z1.m1392a();
            }
        }
    }

    /* renamed from: d */
    public void m1678d(int i, int i2, Object obj) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            C1013z1 c1013z1 = (C1013z1) ((Observable) this).mObservers.get(size);
            c1013z1.f3904a.m3158i(null);
            C0918b c0918b = c1013z1.f3904a.f759n;
            c0918b.getClass();
            boolean z = false;
            if (i2 >= 1) {
                c0918b.f3532b.add(c0918b.m1724h(4, i, i2, obj));
                c0918b.f3536f |= 4;
                if (c0918b.f3532b.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                c1013z1.m1392a();
            }
        }
    }

    /* renamed from: e */
    public void m1677e(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            C1013z1 c1013z1 = (C1013z1) ((Observable) this).mObservers.get(size);
            c1013z1.f3904a.m3158i(null);
            C0918b c0918b = c1013z1.f3904a.f759n;
            c0918b.getClass();
            boolean z = false;
            if (i2 >= 1) {
                c0918b.f3532b.add(c0918b.m1724h(1, i, i2, null));
                c0918b.f3536f |= 1;
                if (c0918b.f3532b.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                c1013z1.m1392a();
            }
        }
    }

    /* renamed from: f */
    public void m1676f(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            C1013z1 c1013z1 = (C1013z1) ((Observable) this).mObservers.get(size);
            c1013z1.f3904a.m3158i(null);
            C0918b c0918b = c1013z1.f3904a.f759n;
            c0918b.getClass();
            boolean z = false;
            if (i2 >= 1) {
                c0918b.f3532b.add(c0918b.m1724h(2, i, i2, null));
                c0918b.f3536f |= 2;
                if (c0918b.f3532b.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                c1013z1.m1392a();
            }
        }
    }
}