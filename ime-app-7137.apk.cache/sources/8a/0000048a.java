package p010b.p086w;

import android.graphics.PointF;
import android.util.Property;

/* renamed from: b.w.d */
/* loaded from: classes.dex */
public final class C1030d extends Property {
    public C1030d(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    public /* bridge */ /* synthetic */ Object get(Object obj) {
        C1051k c1051k = (C1051k) obj;
        return null;
    }

    @Override // android.util.Property
    public void set(Object obj, Object obj2) {
        C1051k c1051k = (C1051k) obj;
        PointF pointF = (PointF) obj2;
        c1051k.getClass();
        c1051k.f3980a = Math.round(pointF.x);
        int round = Math.round(pointF.y);
        c1051k.f3981b = round;
        int i = c1051k.f3985f + 1;
        c1051k.f3985f = i;
        if (i == c1051k.f3986g) {
            AbstractC1023a1.m1382c(c1051k.f3984e, c1051k.f3980a, round, c1051k.f3982c, c1051k.f3983d);
            c1051k.f3985f = 0;
            c1051k.f3986g = 0;
        }
    }
}