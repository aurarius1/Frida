package p010b.p086w;

import android.util.Property;
import android.view.View;

/* renamed from: b.w.y0 */
/* loaded from: classes.dex */
public final class C1083y0 extends Property {
    public C1083y0(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    public Object get(Object obj) {
        return Float.valueOf(AbstractC1023a1.m1384a((View) obj));
    }

    @Override // android.util.Property
    public void set(Object obj, Object obj2) {
        float floatValue = ((Float) obj2).floatValue();
        AbstractC1023a1.f3914a.mo1366e((View) obj, floatValue);
    }
}