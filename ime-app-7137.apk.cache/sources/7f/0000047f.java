package p010b.p085v;

import android.os.Bundle;
import androidx.savedstate.Recreator;
import java.util.Map;
import p010b.p027d.p028a.p030b.C0356e;
import p010b.p072o.AbstractC0779h;
import p010b.p072o.C0784m;
import p010b.p072o.EnumC0777f;
import p010b.p072o.EnumC0778g;
import p010b.p072o.InterfaceC0780i;
import p010b.p072o.InterfaceC0782k;
import p010b.p085v.C1018e;

/* renamed from: b.v.f */
/* loaded from: classes.dex */
public final class C1019f {

    /* renamed from: a */
    public final InterfaceC1020g f3911a;

    /* renamed from: b */
    public final C1018e f3912b = new C1018e();

    public C1019f(InterfaceC1020g interfaceC1020g) {
        this.f3911a = interfaceC1020g;
    }

    /* renamed from: a */
    public void m1387a(Bundle bundle) {
        AbstractC0779h mo1826g = this.f3911a.mo1826g();
        if (((C0784m) mo1826g).f3283b == EnumC0778g.INITIALIZED) {
            mo1826g.mo1824a(new Recreator(this.f3911a));
            final C1018e c1018e = this.f3912b;
            if (c1018e.f3908c) {
                throw new IllegalStateException("SavedStateRegistry was already restored.");
            }
            if (bundle != null) {
                c1018e.f3907b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            mo1826g.mo1824a(new InterfaceC0780i() { // from class: androidx.savedstate.SavedStateRegistry$1
                @Override // p010b.p072o.InterfaceC0780i
                /* renamed from: d */
                public void mo1827d(InterfaceC0782k interfaceC0782k, EnumC0777f enumC0777f) {
                    C1018e c1018e2;
                    boolean z;
                    if (enumC0777f == EnumC0777f.ON_START) {
                        c1018e2 = C1018e.this;
                        z = true;
                    } else if (enumC0777f != EnumC0777f.ON_STOP) {
                        return;
                    } else {
                        c1018e2 = C1018e.this;
                        z = false;
                    }
                    c1018e2.f3910e = z;
                }
            });
            c1018e.f3908c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    /* renamed from: b */
    public void m1386b(Bundle bundle) {
        C1018e c1018e = this.f3912b;
        c1018e.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = c1018e.f3907b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C0356e m2689b = c1018e.f3906a.m2689b();
        while (m2689b.hasNext()) {
            Map.Entry entry = (Map.Entry) m2689b.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC1017d) entry.getValue()).mo1391a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}