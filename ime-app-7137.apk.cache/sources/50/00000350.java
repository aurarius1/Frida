package p010b.p067m.p068d;

import android.content.Context;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p046j.p054h.C0529b;

/* renamed from: b.m.d.m */
/* loaded from: classes.dex */
public class C0716m extends AbstractC0720n {

    /* renamed from: c */
    public boolean f3055c;

    /* renamed from: d */
    public boolean f3056d;

    /* renamed from: e */
    public C0701i0 f3057e;

    public C0716m(C0727o2 c0727o2, C0529b c0529b, boolean z) {
        super(c0727o2, c0529b);
        this.f3056d = false;
        this.f3055c = z;
    }

    /* renamed from: c */
    public C0701i0 m2009c(Context context) {
        if (this.f3056d) {
            return this.f3057e;
        }
        C0727o2 c0727o2 = this.f3066a;
        C0701i0 m3518P = AbstractC0022t.m3518P(context, c0727o2.f3089c, c0727o2.f3087a == EnumC0739r2.VISIBLE, this.f3055c);
        this.f3057e = m3518P;
        this.f3056d = true;
        return m3518P;
    }
}