package p093c.p097b.p116p;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: c.b.p.g */
/* loaded from: classes.dex */
public final class C1429g implements Comparator, Serializable {

    /* renamed from: b */
    public final String f4715b;

    public C1429g(String str, AbstractC1428f abstractC1428f) {
        this.f4715b = str;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        AbstractC1427e abstractC1427e = (AbstractC1427e) obj;
        AbstractC1427e abstractC1427e2 = (AbstractC1427e) obj2;
        String str = abstractC1427e.f4708d;
        String str2 = abstractC1427e2.f4708d;
        if (str.equals(str2)) {
            return abstractC1427e.f4711g - abstractC1427e2.f4711g;
        }
        if (str.equals(this.f4715b)) {
            return -1;
        }
        if (str2.equals(this.f4715b)) {
            return 1;
        }
        return str.compareToIgnoreCase(str2);
    }
}