package p010b.p067m.p068d;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import p010b.p011a.p012k.InterfaceC0062b;
import p010b.p072o.InterfaceC0797z;

/* renamed from: b.m.d.b0 */
/* loaded from: classes.dex */
public class C0673b0 implements InterfaceC0062b {

    /* renamed from: a */
    public final /* synthetic */ AbstractActivityC0681d0 f2918a;

    public C0673b0(AbstractActivityC0681d0 abstractActivityC0681d0) {
        this.f2918a = abstractActivityC0681d0;
    }

    @Override // p010b.p011a.p012k.InterfaceC0062b
    /* renamed from: a */
    public void mo2107a(Context context) {
        C0677c0 c0677c0 = this.f2918a.f2933i.f3058a;
        c0677c0.f2926e.m2068b(c0677c0, c0677c0, null);
        Bundle m1390a = this.f2918a.f849e.f3912b.m1390a("android:support:fragments");
        if (m1390a != null) {
            Parcelable parcelable = m1390a.getParcelable("android:support:fragments");
            C0677c0 c0677c02 = this.f2918a.f2933i.f3058a;
            if (!(c0677c02 instanceof InterfaceC0797z)) {
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
            c0677c02.f2926e.m2057g0(parcelable);
        }
    }
}