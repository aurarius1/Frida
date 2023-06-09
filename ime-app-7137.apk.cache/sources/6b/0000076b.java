package p093c.p097b.p130z;

import android.os.SystemClock;

/* renamed from: c.b.z.y */
/* loaded from: classes.dex */
public class C1767y {

    /* renamed from: a */
    public static final int[] f5440a = {45, 51, 33, 46, 48, 53, 49, 37, 43, 44, 29, 47, 32, 34, 35, 36, 38, 39, 40, 54, 52, 31, 50, 30, 42, 41};

    /* renamed from: c */
    public final C1665d0 f5442c = new C1665d0();

    /* renamed from: b */
    public long f5441b = SystemClock.uptimeMillis();

    /* renamed from: a */
    public final int m817a(int i, int i2) {
        C1663c0 c1663c0;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.f5441b >= i2) {
            C1665d0 c1665d0 = this.f5442c;
            while (c1665d0.f5117b.m931b()) {
                c1665d0.f5119d.m930c(c1665d0.f5117b.m932a());
            }
            C1661b0 m932a = c1665d0.f5119d.m932a();
            m932a.m934b();
            c1665d0.f5117b.m930c(m932a);
        }
        this.f5441b = uptimeMillis;
        C1665d0 c1665d02 = this.f5442c;
        int i3 = 0;
        c1665d02.f5120e = 0;
        c1665d02.f5121f = 0;
        if (!c1665d02.f5117b.m931b()) {
            C1661b0 m932a2 = c1665d02.f5119d.m932a();
            m932a2.m934b();
            c1665d02.f5117b.m930c(m932a2);
        }
        C1661b0 c1661b0 = null;
        int i4 = 1;
        while (true) {
            if (!c1665d02.f5117b.m931b()) {
                break;
            }
            C1661b0 m932a3 = c1665d02.f5117b.m932a();
            int m935a = C1661b0.m935a(m932a3, i);
            if (m935a == 2) {
                if (c1665d02.f5119d.m931b()) {
                    C1661b0 m932a4 = c1665d02.f5119d.m932a();
                    m932a4.getClass();
                    m932a4.f5103a = m932a3.f5103a;
                    m932a4.f5105c = m932a3.f5105c;
                    m932a4.f5104b = m932a3.f5104b;
                    c1665d02.f5118c.m930c(m932a4);
                }
                m932a3.f5103a = m932a3.f5109g.f5116a;
                if (i > 0) {
                    m932a3.f5104b--;
                }
                m932a3.f5105c--;
                m935a = C1661b0.m935a(m932a3, i);
            }
            if (m935a == 5 && c1661b0 == null) {
                c1665d02.f5118c.m930c(m932a3);
                c1661b0 = m932a3;
                i4 = m935a;
                break;
            }
            if (m935a == 4 || m935a == 3) {
                if (i4 == 1) {
                    i4 = m935a;
                }
                c1663c0 = c1665d02.f5118c;
            } else {
                c1663c0 = c1665d02.f5119d;
            }
            c1663c0.m930c(m932a3);
            if (m935a == 4 && c1665d02.f5119d.m931b()) {
                C1661b0 m932a5 = c1665d02.f5119d.m932a();
                m932a5.m934b();
                c1665d02.f5118c.m930c(m932a5);
            }
            if (m935a == 4 && (c1661b0 == null || c1661b0.f5107e < m932a3.f5107e)) {
                c1661b0 = m932a3;
                i4 = m935a;
            }
        }
        while (c1665d02.f5117b.m931b()) {
            c1665d02.f5119d.m930c(c1665d02.f5117b.m932a());
        }
        C1663c0 c1663c02 = c1665d02.f5118c;
        c1665d02.f5118c = c1665d02.f5117b;
        c1665d02.f5117b = c1663c02;
        if (c1661b0 != null) {
            c1665d02.f5120e = c1661b0.f5108f;
            c1665d02.f5121f = c1661b0.f5106d;
            int i5 = c1663c02.f5114d;
            while (i3 < i5) {
                C1661b0 m932a6 = c1665d02.f5117b.m932a();
                c1665d02.f5117b.m930c(m932a6);
                i3++;
                if (m932a6 != c1661b0 || i4 != 5) {
                    int i6 = c1661b0.f5108f;
                    if (i6 > 1) {
                        m932a6.f5104b -= i6 - 1;
                        continue;
                    }
                    if (m932a6 == c1661b0) {
                        break;
                    }
                } else {
                    break;
                }
            }
            while (true) {
                int i7 = i3 + 1;
                if (i3 >= i5) {
                    break;
                }
                C1663c0 c1663c03 = c1665d02.f5117b;
                c1663c03.m930c(c1663c03.m932a());
                i3 = i7;
            }
        }
        return i4;
    }

    /* renamed from: b */
    public void m816b(String str) {
        if (f5440a.length != str.length()) {
            str.length();
            return;
        }
        int i = 0;
        while (true) {
            int[] iArr = f5440a;
            if (i >= iArr.length) {
                return;
            }
            char c = (char) iArr[i];
            char charAt = str.charAt(i);
            if (charAt > 0) {
                this.f5442c.m928b(new int[]{c}, 0, charAt);
                this.f5442c.m928b(new int[]{-1, c}, 0, Character.toUpperCase(charAt));
            }
            i++;
        }
    }
}