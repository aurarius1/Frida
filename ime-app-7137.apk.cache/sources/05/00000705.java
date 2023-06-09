package p093c.p097b.p130z;

import java.util.ArrayList;

/* renamed from: c.b.z.d0 */
/* loaded from: classes.dex */
public class C1665d0 {

    /* renamed from: a */
    public C1768z f5116a = new C1768z();

    /* renamed from: b */
    public C1663c0 f5117b;

    /* renamed from: c */
    public C1663c0 f5118c;

    /* renamed from: d */
    public C1663c0 f5119d;

    /* renamed from: e */
    public int f5120e;

    /* renamed from: f */
    public int f5121f;

    public C1665d0() {
        C1663c0 c1663c0 = new C1663c0();
        this.f5117b = c1663c0;
        c1663c0.m930c(new C1661b0(this));
        this.f5119d = new C1663c0();
        for (int i = 1; i < 30; i++) {
            this.f5119d.m930c(new C1661b0(this));
        }
        this.f5118c = new C1663c0();
    }

    /* renamed from: a */
    public static C1768z m929a(C1768z c1768z, int i) {
        C1768z m815a = c1768z.m815a(i);
        if (m815a != null) {
            return m815a;
        }
        C1768z c1768z2 = new C1768z();
        if (c1768z.f5443a == null) {
            c1768z.f5443a = new ArrayList();
        }
        c1768z.f5443a.add(new C1659a0(i, c1768z2));
        return c1768z2;
    }

    /* renamed from: b */
    public void m928b(int[] iArr, int i, int i2) {
        C1768z c1768z = this.f5116a;
        for (int i3 : iArr) {
            if (i != 0) {
                c1768z = m929a(c1768z, i);
            }
            c1768z = m929a(c1768z, i3);
        }
        c1768z.f5444b = i2;
    }
}