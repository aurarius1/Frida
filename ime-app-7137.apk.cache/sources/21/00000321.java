package p010b.p067m.p068d;

import android.os.Bundle;
import android.os.Parcelable;
import p010b.p072o.EnumC0777f;
import p010b.p072o.EnumC0778g;
import p010b.p085v.InterfaceC1017d;

/* renamed from: b.m.d.a0 */
/* loaded from: classes.dex */
public class C0669a0 implements InterfaceC1017d {

    /* renamed from: a */
    public final /* synthetic */ AbstractActivityC0681d0 f2916a;

    public C0669a0(AbstractActivityC0681d0 abstractActivityC0681d0) {
        this.f2916a = abstractActivityC0681d0;
    }

    @Override // p010b.p085v.InterfaceC1017d
    /* renamed from: a */
    public Bundle mo1391a() {
        Bundle bundle = new Bundle();
        do {
        } while (AbstractActivityC0681d0.m2101m(this.f2916a.m2102l(), EnumC0778g.CREATED));
        this.f2916a.f2934j.m1821d(EnumC0777f.ON_STOP);
        Parcelable m2055h0 = this.f2916a.f2933i.f3058a.f2926e.m2055h0();
        if (m2055h0 != null) {
            bundle.putParcelable("android:support:fragments", m2055h0);
        }
        return bundle;
    }
}