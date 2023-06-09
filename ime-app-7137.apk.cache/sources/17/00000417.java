package p010b.p083u.p084e;

import android.util.SparseIntArray;

/* renamed from: b.u.e.a0 */
/* loaded from: classes.dex */
public abstract class AbstractC0915a0 {

    /* renamed from: a */
    public final SparseIntArray f3529a = new SparseIntArray();

    /* renamed from: b */
    public final SparseIntArray f3530b = new SparseIntArray();

    /* renamed from: a */
    public int m1732a(int i, int i2) {
        int mo1108c = mo1108c(i);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int mo1108c2 = mo1108c(i5);
            i3 += mo1108c2;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = mo1108c2;
            }
        }
        return i3 + mo1108c > i2 ? i4 + 1 : i4;
    }

    /* renamed from: b */
    public int mo1394b(int i, int i2) {
        int mo1108c = mo1108c(i);
        if (mo1108c == i2) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int mo1108c2 = mo1108c(i4);
            i3 += mo1108c2;
            if (i3 == i2) {
                i3 = 0;
            } else if (i3 > i2) {
                i3 = mo1108c2;
            }
        }
        if (mo1108c + i3 <= i2) {
            return i3;
        }
        return 0;
    }

    /* renamed from: c */
    public abstract int mo1108c(int i);
}