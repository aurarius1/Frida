package androidx.lifecycle;

import p010b.p072o.AbstractC0779h;
import p010b.p072o.C0784m;
import p010b.p072o.C0793v;
import p010b.p072o.EnumC0777f;
import p010b.p072o.InterfaceC0780i;
import p010b.p072o.InterfaceC0782k;
import p010b.p085v.C1018e;

/* loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC0780i {

    /* renamed from: a */
    public boolean f555a;

    /* renamed from: androidx.lifecycle.SavedStateHandleController$1 */
    /* loaded from: classes.dex */
    public class C00501 implements InterfaceC0780i {

        /* renamed from: a */
        public final /* synthetic */ AbstractC0779h f556a;

        /* renamed from: b */
        public final /* synthetic */ C1018e f557b;

        @Override // p010b.p072o.InterfaceC0780i
        /* renamed from: d */
        public void mo1827d(InterfaceC0782k interfaceC0782k, EnumC0777f enumC0777f) {
            if (enumC0777f == EnumC0777f.ON_START) {
                C0784m c0784m = (C0784m) this.f556a;
                c0784m.m1822c("removeObserver");
                c0784m.f3282a.mo2686e(this);
                this.f557b.m1388c(C0793v.class);
            }
        }
    }

    @Override // p010b.p072o.InterfaceC0780i
    /* renamed from: d */
    public void mo1827d(InterfaceC0782k interfaceC0782k, EnumC0777f enumC0777f) {
        if (enumC0777f == EnumC0777f.ON_DESTROY) {
            this.f555a = false;
            C0784m c0784m = (C0784m) interfaceC0782k.mo1826g();
            c0784m.m1822c("removeObserver");
            c0784m.f3282a.mo2686e(this);
        }
    }
}