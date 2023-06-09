package p010b.p044i.p045d;

import android.os.Build;
import android.view.View;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;
import p010b.p046j.p058l.AbstractC0605j0;

/* renamed from: b.i.d.h */
/* loaded from: classes.dex */
public class C0458h implements Comparator {
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        View view = (View) obj;
        View view2 = (View) obj2;
        AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
        int i = Build.VERSION.SDK_INT;
        float z = i >= 21 ? view.getZ() : 0.0f;
        float z2 = i >= 21 ? view2.getZ() : 0.0f;
        if (z > z2) {
            return -1;
        }
        return z < z2 ? 1 : 0;
    }
}