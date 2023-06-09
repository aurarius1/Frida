package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p010b.p072o.AbstractC0779h;
import p010b.p072o.AbstractC0794w;
import p010b.p072o.C0784m;
import p010b.p072o.C0793v;
import p010b.p072o.C0796y;
import p010b.p072o.EnumC0777f;
import p010b.p072o.InterfaceC0780i;
import p010b.p072o.InterfaceC0782k;
import p010b.p072o.InterfaceC0797z;
import p010b.p085v.C1018e;
import p010b.p085v.InterfaceC1016c;
import p010b.p085v.InterfaceC1020g;
import p093c.p094a.p095a.p096a.AbstractC1124a;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class Recreator implements InterfaceC0780i {

    /* renamed from: a */
    public final InterfaceC1020g f823a;

    public Recreator(InterfaceC1020g interfaceC1020g) {
        this.f823a = interfaceC1020g;
    }

    @Override // p010b.p072o.InterfaceC0780i
    /* renamed from: d */
    public void mo1827d(InterfaceC0782k interfaceC0782k, EnumC0777f enumC0777f) {
        Class cls;
        Object obj;
        boolean z;
        if (enumC0777f != EnumC0777f.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        C0784m c0784m = (C0784m) interfaceC0782k.mo1826g();
        c0784m.m1822c("removeObserver");
        c0784m.f3282a.mo2686e(this);
        Bundle m1390a = this.f823a.mo1385b().m1390a("androidx.savedstate.Restarter");
        if (m1390a == null) {
            return;
        }
        ArrayList<String> stringArrayList = m1390a.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            try {
                try {
                    Constructor declaredConstructor = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(InterfaceC1016c.class).getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        InterfaceC1016c interfaceC1016c = (InterfaceC1016c) declaredConstructor.newInstance(new Object[0]);
                        InterfaceC1020g interfaceC1020g = this.f823a;
                        ((C0793v) interfaceC1016c).getClass();
                        if (!(interfaceC1020g instanceof InterfaceC0797z)) {
                            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
                        }
                        C0796y mo1801e = ((InterfaceC0797z) interfaceC1020g).mo1801e();
                        C1018e mo1385b = interfaceC1020g.mo1385b();
                        mo1801e.getClass();
                        Iterator it2 = new HashSet(mo1801e.f3307a.keySet()).iterator();
                        while (it2.hasNext()) {
                            AbstractC0794w abstractC0794w = (AbstractC0794w) mo1801e.f3307a.get((String) it2.next());
                            AbstractC0779h mo1826g = interfaceC1020g.mo1826g();
                            Map map = abstractC0794w.f3306a;
                            if (map == null) {
                                obj = null;
                            } else {
                                synchronized (map) {
                                    obj = abstractC0794w.f3306a.get("androidx.lifecycle.savedstate.vm.tag");
                                }
                            }
                            SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                            if (savedStateHandleController != null && !(z = savedStateHandleController.f555a)) {
                                if (z) {
                                    throw new IllegalStateException("Already attached to lifecycleOwner");
                                }
                                savedStateHandleController.f555a = true;
                                mo1826g.mo1824a(savedStateHandleController);
                                throw null;
                            }
                        }
                        if (!new HashSet(mo1801e.f3307a.keySet()).isEmpty()) {
                            mo1385b.m1388c(C0793v.class);
                        }
                    } catch (Exception e) {
                        throw new RuntimeException(AbstractC1124a.m1190f("Failed to instantiate ", next), e);
                    }
                } catch (NoSuchMethodException e2) {
                    StringBuilder m1187i = AbstractC1124a.m1187i("Class");
                    m1187i.append(cls.getSimpleName());
                    m1187i.append(" must have default constructor in order to be automatically recreated");
                    throw new IllegalStateException(m1187i.toString(), e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(AbstractC1124a.m1189g("Class ", next, " wasn't found"), e3);
            }
        }
    }
}