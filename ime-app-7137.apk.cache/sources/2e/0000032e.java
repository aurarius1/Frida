package p010b.p067m.p068d;

import java.util.ArrayList;

/* renamed from: b.m.d.d1 */
/* loaded from: classes.dex */
public class C0682d1 implements InterfaceC0678c1 {

    /* renamed from: a */
    public final String f2938a;

    /* renamed from: b */
    public final int f2939b;

    /* renamed from: c */
    public final int f2940c;

    /* renamed from: d */
    public final /* synthetic */ C0690f1 f2941d;

    public C0682d1(C0690f1 c0690f1, String str, int i, int i2) {
        this.f2941d = c0690f1;
        this.f2938a = str;
        this.f2939b = i;
        this.f2940c = i2;
    }

    @Override // p010b.p067m.p068d.InterfaceC0678c1
    /* renamed from: a */
    public boolean mo2098a(ArrayList arrayList, ArrayList arrayList2) {
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = this.f2941d.f2986t;
        if (abstractComponentCallbacksC0763z == null || this.f2939b >= 0 || this.f2938a != null || !abstractComponentCallbacksC0763z.m1868j().m2067b0()) {
            return this.f2941d.m2063d0(arrayList, arrayList2, this.f2938a, this.f2939b, this.f2940c);
        }
        return false;
    }
}