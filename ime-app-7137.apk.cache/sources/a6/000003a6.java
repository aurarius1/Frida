package p010b.p075p.p076a;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import p010b.p072o.AbstractC0794w;
import p010b.p072o.C0796y;
import p010b.p072o.InterfaceC0782k;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.p.a.e */
/* loaded from: classes.dex */
public class C0802e extends AbstractC0798a {

    /* renamed from: a */
    public final InterfaceC0782k f3310a;

    /* renamed from: b */
    public final C0801d f3311b;

    public C0802e(InterfaceC0782k interfaceC0782k, C0796y c0796y) {
        this.f3310a = interfaceC0782k;
        String canonicalName = C0801d.class.getCanonicalName();
        if (canonicalName != null) {
            String m1190f = AbstractC1124a.m1190f("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            Object obj = (AbstractC0794w) c0796y.f3307a.get(m1190f);
            if (!C0801d.class.isInstance(obj)) {
                obj = new C0801d();
                AbstractC0794w abstractC0794w = (AbstractC0794w) c0796y.f3307a.put(m1190f, obj);
                if (abstractC0794w != null) {
                    abstractC0794w.mo1799a();
                }
            }
            this.f3311b = (C0801d) obj;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // p010b.p075p.p076a.AbstractC0798a
    @Deprecated
    /* renamed from: a */
    public void mo1798a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C0801d c0801d = this.f3311b;
        if (c0801d.f3309c.m2606g() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (c0801d.f3309c.m2606g() <= 0) {
                return;
            }
            AbstractC0799b abstractC0799b = (AbstractC0799b) c0801d.f3309c.m2605h(0);
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(c0801d.f3309c.m2608e(0));
            printWriter.print(": ");
            throw null;
        }
    }

    public String toString() {
        String hexString;
        int lastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        InterfaceC0782k interfaceC0782k = this.f3310a;
        if (interfaceC0782k == null) {
            hexString = "null";
        } else {
            String simpleName = interfaceC0782k.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = interfaceC0782k.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            hexString = Integer.toHexString(System.identityHashCode(interfaceC0782k));
        }
        sb.append(hexString);
        sb.append("}}");
        return sb.toString();
    }
}