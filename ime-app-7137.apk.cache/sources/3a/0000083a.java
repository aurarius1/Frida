package p093c.p145g.p146a.p147a.p166r;

import android.os.Build;
import android.view.View;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.concurrent.atomic.AtomicInteger;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.C0573c1;
import p093c.p145g.p146a.p147a.p149b0.C1826v;
import p093c.p145g.p146a.p147a.p149b0.InterfaceC1825u;

/* renamed from: c.g.a.a.r.i */
/* loaded from: classes.dex */
public class C1974i implements InterfaceC1825u {
    public C1974i(BottomNavigationView bottomNavigationView) {
    }

    @Override // p093c.p145g.p146a.p147a.p149b0.InterfaceC1825u
    /* renamed from: a */
    public C0573c1 mo636a(View view, C0573c1 c0573c1, C1826v c1826v) {
        c1826v.f5573d = c0573c1.m2326a() + c1826v.f5573d;
        boolean z = AbstractC0605j0.m2241q(view) == 1;
        int m2325b = c0573c1.m2325b();
        int m2324c = c0573c1.m2324c();
        int i = c1826v.f5570a + (z ? m2324c : m2325b);
        c1826v.f5570a = i;
        int i2 = c1826v.f5572c;
        if (!z) {
            m2325b = m2324c;
        }
        int i3 = i2 + m2325b;
        c1826v.f5572c = i3;
        int i4 = c1826v.f5571b;
        int i5 = c1826v.f5573d;
        AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i4, i3, i5);
        } else {
            view.setPadding(i, i4, i3, i5);
        }
        return c0573c1;
    }
}