package p010b.p046j.p058l;

import android.os.Build;
import android.view.View;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p046j.p050f.C0507b;

/* renamed from: b.j.l.b1 */
/* loaded from: classes.dex */
public class C0570b1 {

    /* renamed from: a */
    public static final C0573c1 f2664a;

    /* renamed from: b */
    public final C0573c1 f2665b;

    static {
        int i = Build.VERSION.SDK_INT;
        f2664a = (i >= 30 ? new C0627u0() : i >= 29 ? new C0625t0() : i >= 20 ? new C0623s0() : new C0629v0()).mo2195b().f2676b.mo2179a().f2676b.mo2183b().f2676b.mo2182c();
    }

    public C0570b1(C0573c1 c0573c1) {
        this.f2665b = c0573c1;
    }

    /* renamed from: a */
    public C0573c1 mo2179a() {
        return this.f2665b;
    }

    /* renamed from: b */
    public C0573c1 mo2183b() {
        return this.f2665b;
    }

    /* renamed from: c */
    public C0573c1 mo2182c() {
        return this.f2665b;
    }

    /* renamed from: d */
    public void mo2192d(View view) {
    }

    /* renamed from: e */
    public C0587e mo2178e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0570b1) {
            C0570b1 c0570b1 = (C0570b1) obj;
            return mo2190k() == c0570b1.mo2190k() && mo2180j() == c0570b1.mo2180j() && AbstractC0022t.m3463w(mo2191h(), c0570b1.mo2191h()) && AbstractC0022t.m3463w(mo2181g(), c0570b1.mo2181g()) && AbstractC0022t.m3463w(mo2178e(), c0570b1.mo2178e());
        }
        return false;
    }

    /* renamed from: f */
    public C0507b mo2174f() {
        return mo2191h();
    }

    /* renamed from: g */
    public C0507b mo2181g() {
        return C0507b.f2541a;
    }

    /* renamed from: h */
    public C0507b mo2191h() {
        return C0507b.f2541a;
    }

    public int hashCode() {
        return AbstractC0022t.m3522L(Boolean.valueOf(mo2190k()), Boolean.valueOf(mo2180j()), mo2191h(), mo2181g(), mo2178e());
    }

    /* renamed from: i */
    public C0573c1 mo2173i(int i, int i2, int i3, int i4) {
        return f2664a;
    }

    /* renamed from: j */
    public boolean mo2180j() {
        return false;
    }

    /* renamed from: k */
    public boolean mo2190k() {
        return false;
    }

    /* renamed from: l */
    public void mo2189l(C0507b[] c0507bArr) {
    }

    /* renamed from: m */
    public void mo2188m(C0573c1 c0573c1) {
    }

    /* renamed from: n */
    public void mo2172n(C0507b c0507b) {
    }
}