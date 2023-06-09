package p010b.p067m.p068d;

import p010b.p046j.p054h.C0529b;

/* renamed from: b.m.d.n */
/* loaded from: classes.dex */
public abstract class AbstractC0720n {

    /* renamed from: a */
    public final C0727o2 f3066a;

    /* renamed from: b */
    public final C0529b f3067b;

    public AbstractC0720n(C0727o2 c0727o2, C0529b c0529b) {
        this.f3066a = c0727o2;
        this.f3067b = c0529b;
    }

    /* renamed from: a */
    public void m1990a() {
        C0727o2 c0727o2 = this.f3066a;
        if (c0727o2.f3091e.remove(this.f3067b) && c0727o2.f3091e.isEmpty()) {
            c0727o2.m1974b();
        }
    }

    /* renamed from: b */
    public boolean m1989b() {
        EnumC0739r2 enumC0739r2;
        EnumC0739r2 m1951c = EnumC0739r2.m1951c(this.f3066a.f3089c.f3216I);
        EnumC0739r2 enumC0739r22 = this.f3066a.f3087a;
        return m1951c == enumC0739r22 || !(m1951c == (enumC0739r2 = EnumC0739r2.VISIBLE) || enumC0739r22 == enumC0739r2);
    }
}