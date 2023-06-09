package p010b.p083u.p084e;

import android.util.SparseArray;

/* renamed from: b.u.e.w1 */
/* loaded from: classes.dex */
public class C1004w1 {

    /* renamed from: a */
    public SparseArray f3880a = new SparseArray();

    /* renamed from: b */
    public int f3881b = 0;

    /* renamed from: a */
    public final C1000v1 m1421a(int i) {
        C1000v1 c1000v1 = (C1000v1) this.f3880a.get(i);
        if (c1000v1 == null) {
            C1000v1 c1000v12 = new C1000v1();
            this.f3880a.put(i, c1000v12);
            return c1000v12;
        }
        return c1000v1;
    }

    /* renamed from: b */
    public long m1420b(long j, long j2) {
        if (j == 0) {
            return j2;
        }
        return (j2 / 4) + ((j / 4) * 3);
    }
}