package p093c.p097b.p127w;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p010b.p086w.AbstractC1077v0;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p203s.C2283h;
import p183e.p184a.p203s.C2284i;

/* renamed from: c.b.w.j */
/* loaded from: classes.dex */
public class C1544j {

    /* renamed from: a */
    public static final double f4933a = Math.toRadians(170.0d);

    /* renamed from: b */
    public static final /* synthetic */ int f4934b = 0;

    /* renamed from: c */
    public final int f4935c;

    /* renamed from: d */
    public final ArrayList f4936d;

    /* renamed from: e */
    public final double f4937e;

    /* renamed from: f */
    public final ArrayList f4938f;

    /* renamed from: h */
    public final Iterable f4940h;

    /* renamed from: m */
    public int f4945m;

    /* renamed from: n */
    public final C2284i f4946n;

    /* renamed from: o */
    public final ArrayList f4947o;

    /* renamed from: g */
    public final C1543i f4939g = new C1543i(null);

    /* renamed from: i */
    public final SparseArray f4941i = new SparseArray();

    /* renamed from: j */
    public List f4942j = Collections.emptyList();

    /* renamed from: k */
    public List f4943k = Collections.emptyList();

    /* renamed from: l */
    public InterfaceC2112c f4944l = AbstractC1077v0.m1266m();

    public C1544j(double d, int i, int i2, Iterable iterable) {
        C2284i c2284i = new C2284i(new C2283h(1));
        this.f4946n = c2284i;
        this.f4947o = new ArrayList();
        this.f4937e = d;
        this.f4945m = i;
        this.f4936d = new ArrayList(this.f4945m * 3);
        this.f4938f = new ArrayList(this.f4945m * 3);
        this.f4935c = i2 * i2;
        this.f4940h = iterable;
        c2284i.mo25g(EnumC1542h.NOT_LOADED);
    }

    /* renamed from: a */
    public static double m947a(double d, double d2, double d3, double d4) {
        double d5 = d3 - d;
        double d6 = d4 - d2;
        return Math.sqrt((d6 * d6) + (d5 * d5));
    }

    /* renamed from: b */
    public static int[] m946b(C1543i c1543i) {
        int i;
        int i2;
        int i3;
        c1543i.f4931d = 0;
        if (c1543i.f4928a > 0) {
            c1543i.m950a(0);
        }
        int i4 = 1;
        while (true) {
            i = c1543i.f4928a;
            if (i4 >= i - 1) {
                break;
            }
            int[] iArr = c1543i.f4929b;
            int[] iArr2 = c1543i.f4930c;
            int i5 = i4 - 1;
            int i6 = iArr[i5];
            int i7 = iArr2[i5];
            int i8 = i4 + 1;
            int i9 = iArr[i8];
            int i10 = iArr2[i8];
            int i11 = iArr[i4];
            int i12 = iArr2[i4];
            int i13 = i6 - i11;
            double sqrt = Math.sqrt((i2 * i2) + (i13 * i13));
            int i14 = i9 - i11;
            double sqrt2 = Math.sqrt((i3 * i3) + (i14 * i14));
            double d = ((i7 - i12) * (i10 - i12)) + (i13 * i14);
            Double.isNaN(d);
            Double.isNaN(d);
            Double.isNaN(d);
            if (Math.acos((d / sqrt) / sqrt2) <= f4933a) {
                c1543i.m950a(i4);
            }
            i4 = i8;
        }
        if (i > 1) {
            c1543i.m950a(i - 1);
        }
        int i15 = c1543i.f4931d;
        int[] iArr3 = new int[i15];
        System.arraycopy(c1543i.f4932e, 0, iArr3, 0, i15);
        return iArr3;
    }
}