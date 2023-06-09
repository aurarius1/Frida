package p093c.p097b.p122u;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: c.b.u.t0 */
/* loaded from: classes.dex */
public class C1499t0 implements InterfaceC1479j0 {

    /* renamed from: a */
    public static final int[] f4843a = new int[0];

    /* renamed from: b */
    public static final int[] f4844b = new int[1];

    /* renamed from: e */
    public CharSequence f4847e;

    /* renamed from: g */
    public int f4849g;

    /* renamed from: h */
    public int f4850h;

    /* renamed from: i */
    public boolean f4851i;

    /* renamed from: j */
    public boolean f4852j;

    /* renamed from: c */
    public final ArrayList f4845c = new ArrayList(32);

    /* renamed from: d */
    public final List f4846d = new ArrayList(32);

    /* renamed from: f */
    public final StringBuilder f4848f = new StringBuilder(32);

    @Override // p093c.p097b.p122u.InterfaceC1479j0
    /* renamed from: a */
    public int mo997a() {
        return this.f4845c.size();
    }

    @Override // p093c.p097b.p122u.InterfaceC1479j0
    /* renamed from: b */
    public int[] mo996b(int i) {
        return (int[]) this.f4845c.get(i);
    }

    @Override // p093c.p097b.p122u.InterfaceC1479j0
    /* renamed from: c */
    public CharSequence mo995c() {
        return this.f4845c.size() == 0 ? "" : this.f4848f.toString();
    }

    /* renamed from: d */
    public void m994d(int i, int[] iArr) {
        boolean z;
        int[] iArr2 = f4844b;
        iArr2[0] = i;
        this.f4848f.insert(this.f4849g, new String(iArr2, 0, 1));
        if (iArr != null && iArr.length > 1 && i != iArr[0] && i != Character.toLowerCase(iArr[0])) {
            int i2 = iArr[0];
            iArr[0] = i;
            int i3 = 1;
            while (true) {
                if (i3 >= iArr.length) {
                    z = false;
                    break;
                } else if (iArr[i3] == i) {
                    iArr[i3] = i2;
                    z = true;
                    break;
                } else {
                    i3++;
                }
            }
            if (!z) {
                iArr[0] = i2;
            }
        }
        this.f4845c.add(this.f4848f.codePointCount(0, this.f4849g), m990h(iArr));
        this.f4849g = Character.charCount(i) + this.f4849g;
        if (Character.isUpperCase(i)) {
            this.f4850h++;
        }
    }

    /* renamed from: e */
    public int m993e() {
        return this.f4848f.length();
    }

    /* renamed from: f */
    public int m992f() {
        int i;
        int i2 = 0;
        if (this.f4849g > 0) {
            this.f4846d.add((int[]) this.f4845c.remove(this.f4848f.codePointCount(0, i) - 1));
            int codePointBefore = Character.codePointBefore(this.f4848f, this.f4849g);
            i2 = Character.charCount(codePointBefore);
            StringBuilder sb = this.f4848f;
            int i3 = this.f4849g;
            sb.delete(i3 - i2, i3);
            this.f4849g -= i2;
            if (Character.isUpperCase(codePointBefore)) {
                this.f4850h--;
            }
        }
        return i2;
    }

    /* renamed from: g */
    public CharSequence m991g() {
        return TextUtils.isEmpty(this.f4847e) ? mo995c() : this.f4847e.toString();
    }

    /* renamed from: h */
    public final int[] m990h(int[] iArr) {
        while (this.f4846d.size() > 0) {
            int[] iArr2 = (int[]) this.f4846d.remove(0);
            if (iArr2.length >= iArr.length) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                if (iArr2.length > iArr.length) {
                    Arrays.fill(iArr2, iArr.length, iArr2.length, -1);
                }
                return iArr2;
            }
        }
        this.f4846d.add(new int[iArr.length]);
        return m990h(iArr);
    }

    /* renamed from: i */
    public boolean m989i() {
        int i = this.f4850h;
        return i > 0 && i == this.f4845c.size();
    }

    /* renamed from: j */
    public boolean m988j() {
        return m993e() > 0 && this.f4848f.charAt(0) == ':';
    }

    /* renamed from: k */
    public boolean m987k() {
        return this.f4845c.isEmpty();
    }

    /* renamed from: l */
    public void m986l() {
        this.f4846d.addAll(this.f4845c);
        if (this.f4846d.size() > 1024) {
            this.f4846d.clear();
        }
        this.f4845c.clear();
        this.f4852j = false;
        this.f4847e = null;
        this.f4848f.setLength(0);
        this.f4850h = 0;
        this.f4849g = 0;
    }
}