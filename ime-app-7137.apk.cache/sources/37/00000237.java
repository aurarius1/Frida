package p010b.p037h.p043c;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p010b.p037h.p040b.AbstractC0403k;
import p010b.p037h.p040b.p041n.C0409d;
import p010b.p037h.p040b.p041n.C0410e;
import p010b.p037h.p040b.p041n.p042k.C0417b;

/* renamed from: b.h.c.e */
/* loaded from: classes.dex */
public class C0435e {

    /* renamed from: a */
    public ConstraintLayout f2287a;

    /* renamed from: b */
    public int f2288b;

    /* renamed from: c */
    public int f2289c;

    /* renamed from: d */
    public int f2290d;

    /* renamed from: e */
    public int f2291e;

    /* renamed from: f */
    public int f2292f;

    /* renamed from: g */
    public int f2293g;

    public C0435e(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f2287a = constraintLayout2;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0208 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0153 A[ADDED_TO_REGION] */
    @SuppressLint({"WrongCall"})
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2460a(C0410e c0410e, C0417b c0417b) {
        int i;
        boolean z;
        int m2567a;
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        C0434d c0434d;
        int measuredWidth;
        int measuredHeight;
        int baseline;
        int i4;
        int max;
        int i5;
        int max2;
        int i6;
        int i7;
        boolean z5;
        if (c0410e == null) {
            return;
        }
        if (c0410e.f2093X == 8 && !c0410e.f2123x) {
            c0417b.f2153e = 0;
            c0417b.f2154f = 0;
            c0417b.f2155g = 0;
            return;
        }
        int i8 = c0417b.f2149a;
        int i9 = c0417b.f2150b;
        int i10 = c0417b.f2151c;
        int i11 = c0417b.f2152d;
        int i12 = this.f2288b + this.f2289c;
        int i13 = this.f2290d;
        View view = (View) c0410e.f2092W;
        int m2567a2 = AbstractC0403k.m2567a(i8);
        if (m2567a2 != 0) {
            if (m2567a2 == 1) {
                i = ViewGroup.getChildMeasureSpec(this.f2292f, i13, -2);
                c0410e.f2106g[2] = -2;
            } else if (m2567a2 == 2) {
                i = ViewGroup.getChildMeasureSpec(this.f2292f, i13, -2);
                boolean z6 = c0410e.f2109j == 1;
                int[] iArr = c0410e.f2106g;
                iArr[2] = 0;
                if (c0417b.f2158j) {
                    boolean z7 = (!z6 || iArr[3] == 0 || iArr[0] == c0410e.m2529n()) ? false : true;
                    if (!z6 || z7) {
                        i = View.MeasureSpec.makeMeasureSpec(c0410e.m2529n(), 1073741824);
                    }
                }
            } else if (m2567a2 != 3) {
                i = 0;
            } else {
                int i14 = this.f2292f;
                C0409d c0409d = c0410e.f2124y;
                int i15 = c0409d != null ? c0409d.f2067e + 0 : 0;
                C0409d c0409d2 = c0410e.f2070A;
                if (c0409d2 != null) {
                    i15 += c0409d2.f2067e;
                }
                i = ViewGroup.getChildMeasureSpec(i14, i13 + i15, -1);
                c0410e.f2106g[2] = -1;
            }
            z = true;
            m2567a = AbstractC0403k.m2567a(i9);
            if (m2567a == 0) {
                if (m2567a != 1) {
                    if (m2567a == 2) {
                        i3 = ViewGroup.getChildMeasureSpec(this.f2293g, i12, -2);
                        boolean z8 = c0410e.f2110k == 1;
                        int[] iArr2 = c0410e.f2106g;
                        iArr2[3] = 0;
                        if (c0417b.f2158j) {
                            boolean z9 = (!z8 || iArr2[2] == 0 || iArr2[1] == c0410e.m2535h()) ? false : true;
                            if (!z8 || z9) {
                                i3 = View.MeasureSpec.makeMeasureSpec(c0410e.m2535h(), 1073741824);
                            }
                        }
                        i2 = 3;
                    } else if (m2567a != 3) {
                        i3 = 0;
                    } else {
                        int i16 = this.f2293g;
                        int i17 = c0410e.f2124y != null ? c0410e.f2125z.f2067e + 0 : 0;
                        if (c0410e.f2070A != null) {
                            i17 += c0410e.f2071B.f2067e;
                        }
                        i3 = ViewGroup.getChildMeasureSpec(i16, i12 + i17, -1);
                        c0410e.f2106g[3] = -1;
                    }
                    i2 = 3;
                } else {
                    i3 = ViewGroup.getChildMeasureSpec(this.f2293g, i12, -2);
                    i2 = 3;
                    c0410e.f2106g[3] = -2;
                }
                z2 = true;
                boolean z10 = i8 == i2;
                boolean z11 = i9 == i2;
                boolean z12 = i9 != 4 || i9 == 1;
                boolean z13 = i8 != 4 || i8 == 1;
                z3 = !z10 && c0410e.f2083N > 0.0f;
                z4 = !z11 && c0410e.f2083N > 0.0f;
                c0434d = (C0434d) view.getLayoutParams();
                if (c0417b.f2158j && z10 && c0410e.f2109j == 0 && z11 && c0410e.f2110k == 0) {
                    i7 = -1;
                    max = 0;
                    max2 = 0;
                    baseline = 0;
                } else {
                    view.measure(i, i3);
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    if (z) {
                        int[] iArr3 = c0410e.f2106g;
                        i4 = 0;
                        iArr3[0] = measuredWidth;
                        iArr3[2] = measuredHeight;
                    } else {
                        i4 = 0;
                        int[] iArr4 = c0410e.f2106g;
                        iArr4[0] = 0;
                        iArr4[2] = 0;
                    }
                    if (z2) {
                        int[] iArr5 = c0410e.f2106g;
                        iArr5[1] = measuredHeight;
                        iArr5[3] = measuredWidth;
                    } else {
                        int[] iArr6 = c0410e.f2106g;
                        iArr6[1] = i4;
                        iArr6[3] = i4;
                    }
                    int i18 = c0410e.f2112m;
                    max = i18 > 0 ? Math.max(i18, measuredWidth) : measuredWidth;
                    i5 = c0410e.f2113n;
                    if (i5 > 0) {
                        max = Math.min(i5, max);
                    }
                    int i19 = c0410e.f2115p;
                    max2 = i19 > 0 ? Math.max(i19, measuredHeight) : measuredHeight;
                    i6 = c0410e.f2116q;
                    if (i6 > 0) {
                        max2 = Math.min(i6, max2);
                    }
                    if (!z3 && z12) {
                        max = (int) ((max2 * c0410e.f2083N) + 0.5f);
                    } else if (z4 && z13) {
                        max2 = (int) ((max / c0410e.f2083N) + 0.5f);
                    }
                    if (measuredWidth == max || measuredHeight != max2) {
                        if (measuredWidth != max) {
                            i = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                        }
                        if (measuredHeight != max2) {
                            i3 = View.MeasureSpec.makeMeasureSpec(max2, 1073741824);
                        }
                        view.measure(i, i3);
                        max = view.getMeasuredWidth();
                        max2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                    i7 = -1;
                }
                z5 = baseline != i7;
                c0417b.f2157i = max == c0417b.f2151c || max2 != c0417b.f2152d;
                if (c0434d.f2247X) {
                    z5 = true;
                }
                if (z5 && baseline != -1 && c0410e.f2087R != baseline) {
                    c0417b.f2157i = true;
                }
                c0417b.f2153e = max;
                c0417b.f2154f = max2;
                c0417b.f2156h = z5;
                c0417b.f2155g = baseline;
            }
            i2 = 3;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            c0410e.f2106g[3] = i11;
            i3 = makeMeasureSpec;
            z2 = false;
            if (i8 == i2) {
            }
            if (i9 == i2) {
            }
            if (i9 != 4) {
            }
            if (i8 != 4) {
            }
            if (z10) {
            }
            if (z11) {
            }
            c0434d = (C0434d) view.getLayoutParams();
            if (c0417b.f2158j) {
            }
            view.measure(i, i3);
            measuredWidth = view.getMeasuredWidth();
            measuredHeight = view.getMeasuredHeight();
            baseline = view.getBaseline();
            if (z) {
            }
            if (z2) {
            }
            int i182 = c0410e.f2112m;
            if (i182 > 0) {
            }
            i5 = c0410e.f2113n;
            if (i5 > 0) {
            }
            int i192 = c0410e.f2115p;
            if (i192 > 0) {
            }
            i6 = c0410e.f2116q;
            if (i6 > 0) {
            }
            if (!z3) {
            }
            if (z4) {
                max2 = (int) ((max / c0410e.f2083N) + 0.5f);
            }
            if (measuredWidth == max) {
            }
            if (measuredWidth != max) {
            }
            if (measuredHeight != max2) {
            }
            view.measure(i, i3);
            max = view.getMeasuredWidth();
            max2 = view.getMeasuredHeight();
            baseline = view.getBaseline();
            i7 = -1;
            if (baseline != i7) {
            }
            c0417b.f2157i = max == c0417b.f2151c || max2 != c0417b.f2152d;
            if (c0434d.f2247X) {
            }
            if (z5) {
                c0417b.f2157i = true;
            }
            c0417b.f2153e = max;
            c0417b.f2154f = max2;
            c0417b.f2156h = z5;
            c0417b.f2155g = baseline;
        }
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
        c0410e.f2106g[2] = i10;
        i = makeMeasureSpec2;
        z = false;
        m2567a = AbstractC0403k.m2567a(i9);
        if (m2567a == 0) {
        }
        z2 = false;
        if (i8 == i2) {
        }
        if (i9 == i2) {
        }
        if (i9 != 4) {
        }
        if (i8 != 4) {
        }
        if (z10) {
        }
        if (z11) {
        }
        c0434d = (C0434d) view.getLayoutParams();
        if (c0417b.f2158j) {
        }
        view.measure(i, i3);
        measuredWidth = view.getMeasuredWidth();
        measuredHeight = view.getMeasuredHeight();
        baseline = view.getBaseline();
        if (z) {
        }
        if (z2) {
        }
        int i1822 = c0410e.f2112m;
        if (i1822 > 0) {
        }
        i5 = c0410e.f2113n;
        if (i5 > 0) {
        }
        int i1922 = c0410e.f2115p;
        if (i1922 > 0) {
        }
        i6 = c0410e.f2116q;
        if (i6 > 0) {
        }
        if (!z3) {
        }
        if (z4) {
        }
        if (measuredWidth == max) {
        }
        if (measuredWidth != max) {
        }
        if (measuredHeight != max2) {
        }
        view.measure(i, i3);
        max = view.getMeasuredWidth();
        max2 = view.getMeasuredHeight();
        baseline = view.getBaseline();
        i7 = -1;
        if (baseline != i7) {
        }
        c0417b.f2157i = max == c0417b.f2151c || max2 != c0417b.f2152d;
        if (c0434d.f2247X) {
        }
        if (z5) {
        }
        c0417b.f2153e = max;
        c0417b.f2154f = max2;
        c0417b.f2156h = z5;
        c0417b.f2155g = baseline;
    }
}