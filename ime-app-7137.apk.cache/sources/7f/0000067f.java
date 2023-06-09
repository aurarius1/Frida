package p093c.p097b.p122u;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import com.anysoftkeyboard.dictionaries.GetWordsCallback;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import p010b.p086w.AbstractC1077v0;
import p183e.p184a.p187m.InterfaceC2112c;

/* renamed from: c.b.u.x */
/* loaded from: classes.dex */
public abstract class AbstractC1531x extends AbstractC1473g0 {

    /* renamed from: f */
    public InterfaceC2112c f4896f;

    /* renamed from: g */
    public final Context f4897g;

    /* renamed from: h */
    public final int f4898h;

    /* renamed from: i */
    public C1503v f4899i;

    /* renamed from: j */
    public int f4900j;

    /* renamed from: k */
    public int f4901k;

    /* renamed from: l */
    public ContentObserver f4902l;

    /* renamed from: m */
    public char[] f4903m;

    /* renamed from: n */
    public final boolean f4904n;

    public AbstractC1531x(String str, Context context, boolean z) {
        super(str);
        this.f4896f = AbstractC1077v0.m1266m();
        this.f4902l = null;
        this.f4903m = new char[32];
        this.f4898h = context.getResources().getInteger(R.integer.maximum_dictionary_words_to_load);
        this.f4897g = context;
        this.f4904n = z;
        m963s();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010d  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m971A(C1503v c1503v, InterfaceC1479j0 interfaceC1479j0, char[] cArr, int i, boolean z, float f, int i2, InterfaceC1532y interfaceC1532y) {
        boolean z2;
        int[] mo996b;
        int i3;
        int[] iArr;
        int i4;
        boolean z3;
        char c;
        char c2;
        int i5;
        boolean z4;
        C1503v c1503v2;
        int i6 = c1503v.f4863b;
        int i7 = this.f4901k;
        if (i > this.f4900j) {
            return;
        }
        if (i7 <= i2) {
            mo996b = null;
            z2 = true;
        } else {
            z2 = z;
            mo996b = interfaceC1479j0.mo996b(i2);
        }
        int i8 = 0;
        while (i8 < i6) {
            C1500u c1500u = c1503v.f4862a[i8];
            char c3 = c1500u.f4853a;
            char m951m = AbstractC1533z.m951m(c3);
            boolean z5 = c1500u.f4855c;
            C1503v c1503v3 = c1500u.f4856d;
            int i9 = c1500u.f4854b;
            if (z2) {
                cArr[i] = c3;
                if (z5) {
                    c1503v2 = c1503v3;
                    if (!interfaceC1532y.mo955a(cArr, 0, i + 1, (int) (i9 * f), this)) {
                        return;
                    }
                } else {
                    c1503v2 = c1503v3;
                }
                if (c1503v2 != null) {
                    i3 = i8;
                    iArr = mo996b;
                    m971A(c1503v2, interfaceC1479j0, cArr, i + 1, z2, f, i2, interfaceC1532y);
                } else {
                    i3 = i8;
                    iArr = mo996b;
                }
            } else {
                i3 = i8;
                iArr = mo996b;
                int i10 = 0;
                while (i10 < iArr.length) {
                    float f2 = i10 > 0 ? 1.0f : 3.0f;
                    if (iArr[i10] == -1) {
                        break;
                    }
                    char c4 = (char) iArr[i10];
                    if (AbstractC1533z.m951m(c4) == m951m || c4 == c3) {
                        cArr[i] = c3;
                        int i11 = i + 1;
                        if (i7 == i11) {
                            if (z5) {
                                if (this.f4904n) {
                                    z3 = z5;
                                    c = m951m;
                                } else {
                                    CharSequence mo995c = interfaceC1479j0.mo995c();
                                    if (mo995c.length() != i11) {
                                        z3 = z5;
                                        c = m951m;
                                    } else {
                                        int i12 = 0;
                                        while (true) {
                                            z3 = z5;
                                            if (i12 >= i11) {
                                                c = m951m;
                                                z4 = true;
                                                break;
                                            }
                                            c = m951m;
                                            if (cArr[i12] != mo995c.charAt(i12)) {
                                                break;
                                            }
                                            i12++;
                                            z5 = z3;
                                            m951m = c;
                                        }
                                        if (z4) {
                                            i4 = i9;
                                        }
                                    }
                                    z4 = false;
                                    if (z4) {
                                    }
                                }
                                i4 = i9;
                                c2 = c3;
                                interfaceC1532y.mo955a(cArr, 0, i11, (int) (i9 * f * f2 * 3.0f), this);
                                if (c1503v3 != null) {
                                    i5 = i10;
                                    m971A(c1503v3, interfaceC1479j0, cArr, i11, true, f2 * f, i2 + 1, interfaceC1532y);
                                }
                            } else {
                                i4 = i9;
                                z3 = z5;
                                c = m951m;
                            }
                            c2 = c3;
                            if (c1503v3 != null) {
                            }
                        } else {
                            i4 = i9;
                            z3 = z5;
                            c = m951m;
                            c2 = c3;
                            i5 = i10;
                            if (c1503v3 != null) {
                                m971A(c1503v3, interfaceC1479j0, cArr, i11, false, f2 * f, i2 + 1, interfaceC1532y);
                            }
                        }
                        i10 = i5 + 1;
                        z5 = z3;
                        m951m = c;
                        i9 = i4;
                        c3 = c2;
                    } else {
                        i4 = i9;
                        z3 = z5;
                        c = m951m;
                        c2 = c3;
                    }
                    i5 = i10;
                    i10 = i5 + 1;
                    z5 = z3;
                    m951m = c;
                    i9 = i4;
                    c3 = c2;
                }
            }
            i8 = i3 + 1;
            mo996b = iArr;
        }
    }

    /* renamed from: B */
    public abstract void mo970B(InterfaceC1515w interfaceC1515w);

    /* renamed from: C */
    public abstract void mo969C(ContentObserver contentObserver, ContentResolver contentResolver);

    @Override // p093c.p097b.p122u.AbstractC1533z
    /* renamed from: f */
    public final void mo501f() {
        m963s();
        if (this.f4902l != null) {
            this.f4897g.getContentResolver().unregisterContentObserver(this.f4902l);
            this.f4902l = null;
        }
        mo962t();
    }

    @Override // p093c.p097b.p122u.AbstractC1533z
    /* renamed from: g */
    public void mo500g(GetWordsCallback getWordsCallback) {
        throw new UnsupportedOperationException();
    }

    @Override // p093c.p097b.p122u.AbstractC1533z
    /* renamed from: h */
    public void mo499h(InterfaceC1479j0 interfaceC1479j0, InterfaceC1532y interfaceC1532y) {
        if (this.f4906b || m953i()) {
            return;
        }
        int mo997a = interfaceC1479j0.mo997a();
        this.f4901k = mo997a;
        this.f4900j = mo997a * 2;
        m971A(this.f4899i, interfaceC1479j0, this.f4903m, 0, false, 1.0f, 0, interfaceC1532y);
    }

    @Override // p093c.p097b.p122u.AbstractC1533z
    /* renamed from: j */
    public boolean mo498j(CharSequence charSequence) {
        return m957y(charSequence) > 0;
    }

    @Override // p093c.p097b.p122u.AbstractC1533z
    /* renamed from: k */
    public void mo497k() {
        mo970B(mo961u());
        if (m953i() || this.f4902l != null) {
            return;
        }
        ContentObserver mo1028b = AnyApplication.f6979b.mo1028b(this);
        this.f4902l = mo1028b;
        mo969C(mo1028b, this.f4897g.getContentResolver());
    }

    @Override // p093c.p097b.p122u.AbstractC1473g0
    /* renamed from: n */
    public boolean mo968n(String str, int i) {
        synchronized (this.f4907c) {
            if (!m953i()) {
                if (str.length() >= mo958x()) {
                    return false;
                }
                getClass().getSimpleName();
                mo967o(str);
                m965q(this.f4899i, str, 0, i);
                mo964r(str, i);
                return true;
            }
            String str2 = "Dictionary (type " + getClass().getName() + ") " + ((Object) this.f4908d) + " is closed! Can not add word.";
            return false;
        }
    }

    @Override // p093c.p097b.p122u.AbstractC1473g0
    /* renamed from: o */
    public final void mo967o(String str) {
        synchronized (this.f4907c) {
            if (!m953i()) {
                m959w(this.f4899i, str, 0, str.length());
                mo960v(str);
                return;
            }
            String str2 = "Dictionary (type " + getClass().getName() + ") " + ((Object) this.f4908d) + " is closed! Can not delete word.";
        }
    }

    /* renamed from: p */
    public void mo966p(String str, int i) {
        m965q(this.f4899i, str, 0, i);
    }

    /* renamed from: q */
    public final void m965q(C1503v c1503v, String str, int i, int i2) {
        boolean z;
        int length = str.length();
        char charAt = str.charAt(i);
        int i3 = c1503v.f4863b;
        C1500u c1500u = null;
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                z = false;
                break;
            }
            c1500u = c1503v.f4862a[i4];
            if (c1500u.f4853a == charAt) {
                z = true;
                break;
            }
            i4++;
        }
        if (!z) {
            c1500u = new C1500u();
            c1500u.f4853a = charAt;
            int i5 = c1503v.f4863b + 1;
            c1503v.f4863b = i5;
            C1500u[] c1500uArr = c1503v.f4862a;
            if (i5 > c1500uArr.length) {
                C1500u[] c1500uArr2 = new C1500u[i5 + 2];
                System.arraycopy(c1500uArr, 0, c1500uArr2, 0, c1500uArr.length);
                c1503v.f4862a = c1500uArr2;
            }
            c1503v.f4862a[c1503v.f4863b - 1] = c1500u;
        }
        int i6 = i + 1;
        if (length == i6) {
            c1500u.f4855c = true;
            c1500u.f4854b = i2;
            return;
        }
        if (c1500u.f4856d == null) {
            c1500u.f4856d = new C1503v();
        }
        m965q(c1500u.f4856d, str, i6, i2);
    }

    /* renamed from: r */
    public abstract void mo964r(String str, int i);

    /* renamed from: s */
    public final void m963s() {
        this.f4896f.mo35e();
        this.f4899i = new C1503v(26);
    }

    /* renamed from: t */
    public abstract void mo962t();

    /* renamed from: u */
    public InterfaceC1515w mo961u() {
        return new C1498t(this);
    }

    /* renamed from: v */
    public abstract void mo960v(String str);

    /* renamed from: w */
    public final boolean m959w(C1503v c1503v, CharSequence charSequence, int i, int i2) {
        C1503v c1503v2;
        int i3 = c1503v.f4863b;
        char charAt = charSequence.charAt(i);
        for (int i4 = 0; i4 < i3; i4++) {
            C1500u c1500u = c1503v.f4862a[i4];
            if (c1500u.f4853a == charAt) {
                if (i == i2 - 1) {
                    if (c1500u.f4855c) {
                        C1503v c1503v3 = c1500u.f4856d;
                        if (c1503v3 == null || c1503v3.f4863b == 0) {
                            c1503v.m982a(i4);
                        } else {
                            c1500u.f4855c = false;
                        }
                        return true;
                    }
                    return false;
                } else if (c1500u.f4855c && ((c1503v2 = c1500u.f4856d) == null || c1503v2.f4863b == 0)) {
                    return false;
                } else {
                    if (m959w(c1500u.f4856d, charSequence, i + 1, i2)) {
                        if (c1500u.f4856d.f4863b != 0 || c1500u.f4855c) {
                            return false;
                        }
                        c1503v.m982a(i4);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: x */
    public int mo958x() {
        return 32;
    }

    /* renamed from: y */
    public final int m957y(CharSequence charSequence) {
        if (this.f4906b || m953i()) {
            return 0;
        }
        return m956z(this.f4899i, charSequence, 0, charSequence.length());
    }

    /* renamed from: z */
    public final int m956z(C1503v c1503v, CharSequence charSequence, int i, int i2) {
        int m956z;
        int i3 = c1503v.f4863b;
        char charAt = charSequence.charAt(i);
        for (int i4 = 0; i4 < i3; i4++) {
            C1500u c1500u = c1503v.f4862a[i4];
            if (c1500u.f4853a == charAt) {
                if (i != i2 - 1) {
                    C1503v c1503v2 = c1500u.f4856d;
                    if (c1503v2 != null && (m956z = m956z(c1503v2, charSequence, i + 1, i2)) > 0) {
                        return m956z;
                    }
                } else if (c1500u.f4855c) {
                    return c1500u.f4854b;
                }
            }
        }
        return 0;
    }
}