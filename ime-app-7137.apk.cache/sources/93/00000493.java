package p010b.p086w;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* renamed from: b.w.g */
/* loaded from: classes.dex */
public final class C1039g extends Property {
    public C1039g(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    public /* bridge */ /* synthetic */ Object get(Object obj) {
        View view = (View) obj;
        return null;
    }

    @Override // android.util.Property
    public void set(Object obj, Object obj2) {
        View view = (View) obj;
        PointF pointF = (PointF) obj2;
        AbstractC1023a1.m1382c(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
    }
}