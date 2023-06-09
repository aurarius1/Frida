package p010b.p083u.p084e;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* renamed from: b.u.e.l2 */
/* loaded from: classes.dex */
public class C0961l2 {

    /* renamed from: a */
    public int f3700a;

    /* renamed from: b */
    public int f3701b;

    /* renamed from: c */
    public boolean f3702c;

    /* renamed from: d */
    public boolean f3703d;

    /* renamed from: e */
    public boolean f3704e;

    /* renamed from: f */
    public int[] f3705f;

    /* renamed from: g */
    public final /* synthetic */ StaggeredGridLayoutManager f3706g;

    public C0961l2(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f3706g = staggeredGridLayoutManager;
        m1616b();
    }

    /* renamed from: a */
    public void m1617a() {
        this.f3701b = this.f3702c ? this.f3706g.f802t.mo1440g() : this.f3706g.f802t.mo1436k();
    }

    /* renamed from: b */
    public void m1616b() {
        this.f3700a = -1;
        this.f3701b = Integer.MIN_VALUE;
        this.f3702c = false;
        this.f3703d = false;
        this.f3704e = false;
        int[] iArr = this.f3705f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}