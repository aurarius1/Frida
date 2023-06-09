package p010b.p091z.p092a;

import android.view.View;
import java.util.Comparator;

/* renamed from: b.z.a.m */
/* loaded from: classes.dex */
public class C1122m implements Comparator {
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        C1117h c1117h = (C1117h) ((View) obj).getLayoutParams();
        C1117h c1117h2 = (C1117h) ((View) obj2).getLayoutParams();
        boolean z = c1117h.f4168a;
        return z != c1117h2.f4168a ? z ? 1 : -1 : c1117h.f4172e - c1117h2.f4172e;
    }
}