package p010b.p086w;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.concurrent.atomic.AtomicInteger;
import p010b.p046j.p058l.AbstractC0605j0;

/* renamed from: b.w.z0 */
/* loaded from: classes.dex */
public final class C1085z0 extends Property {
    public C1085z0(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    public Object get(Object obj) {
        View view = (View) obj;
        AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    @Override // android.util.Property
    public void set(Object obj, Object obj2) {
        AbstractC0605j0.m2266Q((View) obj, (Rect) obj2);
    }
}