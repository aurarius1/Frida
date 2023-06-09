package p010b.p067m.p068d;

import p010b.p072o.AbstractC0779h;
import p010b.p072o.C0784m;
import p010b.p072o.C0796y;
import p010b.p072o.EnumC0777f;
import p010b.p072o.InterfaceC0797z;
import p010b.p085v.C1018e;
import p010b.p085v.C1019f;
import p010b.p085v.InterfaceC1020g;

/* renamed from: b.m.d.h2 */
/* loaded from: classes.dex */
public class C0699h2 implements InterfaceC1020g, InterfaceC0797z {

    /* renamed from: b */
    public final C0796y f3010b;

    /* renamed from: c */
    public C0784m f3011c = null;

    /* renamed from: d */
    public C1019f f3012d = null;

    public C0699h2(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z, C0796y c0796y) {
        this.f3010b = c0796y;
    }

    /* renamed from: a */
    public void m2019a(EnumC0777f enumC0777f) {
        C0784m c0784m = this.f3011c;
        c0784m.m1822c("handleLifecycleEvent");
        c0784m.m1819f(enumC0777f.m1829a());
    }

    @Override // p010b.p085v.InterfaceC1020g
    /* renamed from: b */
    public C1018e mo1385b() {
        m2018c();
        return this.f3012d.f3912b;
    }

    /* renamed from: c */
    public void m2018c() {
        if (this.f3011c == null) {
            this.f3011c = new C0784m(this);
            this.f3012d = new C1019f(this);
        }
    }

    @Override // p010b.p072o.InterfaceC0797z
    /* renamed from: e */
    public C0796y mo1801e() {
        m2018c();
        return this.f3010b;
    }

    @Override // p010b.p072o.InterfaceC0782k
    /* renamed from: g */
    public AbstractC0779h mo1826g() {
        m2018c();
        return this.f3011c;
    }
}