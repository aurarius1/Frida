package p010b.p083u.p084e;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;

/* renamed from: b.u.e.u */
/* loaded from: classes.dex */
public class C0994u implements Comparator {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r0 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0020, code lost:
        if (r0 != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0022, code lost:
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
        return r1;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int compare(Object obj, Object obj2) {
        C1002w c1002w = (C1002w) obj;
        C1002w c1002w2 = (C1002w) obj2;
        RecyclerView recyclerView = c1002w.f3877d;
        int i = 1;
        if ((recyclerView == null) == (c1002w2.f3877d == null)) {
            boolean z = c1002w.f3874a;
            if (z == c1002w2.f3874a) {
                int i2 = c1002w2.f3875b - c1002w.f3875b;
                if (i2 != 0) {
                    return i2;
                }
                int i3 = c1002w.f3876c - c1002w2.f3876c;
                if (i3 != 0) {
                    return i3;
                }
                return 0;
            }
        }
    }
}