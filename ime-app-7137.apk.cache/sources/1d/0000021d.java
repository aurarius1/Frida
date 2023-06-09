package p010b.p037h.p040b.p041n;

import java.util.HashSet;
import java.util.Iterator;
import p010b.p037h.p040b.C0404l;

/* renamed from: b.h.b.n.d */
/* loaded from: classes.dex */
public class C0409d {

    /* renamed from: b */
    public final C0410e f2064b;

    /* renamed from: c */
    public final EnumC0408c f2065c;

    /* renamed from: d */
    public C0409d f2066d;

    /* renamed from: g */
    public C0404l f2069g;

    /* renamed from: a */
    public HashSet f2063a = null;

    /* renamed from: e */
    public int f2067e = 0;

    /* renamed from: f */
    public int f2068f = -1;

    public C0409d(C0410e c0410e, EnumC0408c enumC0408c) {
        this.f2064b = c0410e;
        this.f2065c = enumC0408c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
        if (r6.f2064b.f2122w == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
        if (r4 != r10) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0056, code lost:
        if (r4 != r10) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x006f, code lost:
        if (r4 != r2) goto L15;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m2546a(C0409d c0409d, int i, int i2, boolean z) {
        boolean z2;
        if (c0409d == null) {
            m2542e();
            return true;
        }
        if (!z) {
            EnumC0408c enumC0408c = EnumC0408c.CENTER_Y;
            EnumC0408c enumC0408c2 = EnumC0408c.CENTER_X;
            EnumC0408c enumC0408c3 = EnumC0408c.BASELINE;
            EnumC0408c enumC0408c4 = c0409d.f2065c;
            EnumC0408c enumC0408c5 = this.f2065c;
            if (enumC0408c4 == enumC0408c5) {
                if (enumC0408c5 == enumC0408c3) {
                    if (c0409d.f2064b.f2122w) {
                    }
                    z2 = false;
                }
                z2 = true;
            } else {
                switch (enumC0408c5.ordinal()) {
                    case 0:
                    case 5:
                    case 7:
                    case 8:
                        z2 = false;
                        break;
                    case 1:
                    case 3:
                        z2 = enumC0408c4 == EnumC0408c.LEFT || enumC0408c4 == EnumC0408c.RIGHT;
                        if (c0409d.f2064b instanceof C0412g) {
                            if (!z2) {
                            }
                            z2 = true;
                            break;
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z3 = enumC0408c4 == EnumC0408c.TOP || enumC0408c4 == EnumC0408c.BOTTOM;
                        if (!(c0409d.f2064b instanceof C0412g)) {
                            z2 = z3;
                            break;
                        } else {
                            if (!z3) {
                            }
                            z2 = true;
                            break;
                        }
                        break;
                    case 6:
                        if (enumC0408c4 != enumC0408c3) {
                            if (enumC0408c4 != enumC0408c2) {
                            }
                        }
                        z2 = false;
                        break;
                    default:
                        throw new AssertionError(this.f2065c.name());
                }
            }
            if (!z2) {
                return false;
            }
        }
        this.f2066d = c0409d;
        if (c0409d.f2063a == null) {
            c0409d.f2063a = new HashSet();
        }
        this.f2066d.f2063a.add(this);
        if (i > 0) {
            this.f2067e = i;
        } else {
            this.f2067e = 0;
        }
        this.f2068f = i2;
        return true;
    }

    /* renamed from: b */
    public int m2545b() {
        C0409d c0409d;
        if (this.f2064b.f2093X == 8) {
            return 0;
        }
        int i = this.f2068f;
        return (i <= -1 || (c0409d = this.f2066d) == null || c0409d.f2064b.f2093X != 8) ? this.f2067e : i;
    }

    /* renamed from: c */
    public boolean m2544c() {
        C0409d c0409d;
        HashSet hashSet = this.f2063a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C0409d c0409d2 = (C0409d) it.next();
            switch (c0409d2.f2065c.ordinal()) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                    c0409d = null;
                    break;
                case 1:
                    c0409d = c0409d2.f2064b.f2070A;
                    break;
                case 2:
                    c0409d = c0409d2.f2064b.f2071B;
                    break;
                case 3:
                    c0409d = c0409d2.f2064b.f2124y;
                    break;
                case 4:
                    c0409d = c0409d2.f2064b.f2125z;
                    break;
                default:
                    throw new AssertionError(c0409d2.f2065c.name());
            }
            if (c0409d.m2543d()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean m2543d() {
        return this.f2066d != null;
    }

    /* renamed from: e */
    public void m2542e() {
        HashSet hashSet;
        C0409d c0409d = this.f2066d;
        if (c0409d != null && (hashSet = c0409d.f2063a) != null) {
            hashSet.remove(this);
        }
        this.f2066d = null;
        this.f2067e = 0;
        this.f2068f = -1;
    }

    /* renamed from: f */
    public void m2541f() {
        C0404l c0404l = this.f2069g;
        if (c0404l == null) {
            this.f2069g = new C0404l(1);
        } else {
            c0404l.m2563c();
        }
    }

    public String toString() {
        return this.f2064b.f2094Y + ":" + this.f2065c.toString();
    }
}