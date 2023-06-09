package p010b.p016c.p026q;

import android.util.Property;
import androidx.appcompat.widget.SwitchCompat;

/* renamed from: b.c.q.l3 */
/* loaded from: classes.dex */
public class C0277l3 extends Property {
    public C0277l3(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    public Object get(Object obj) {
        return Float.valueOf(((SwitchCompat) obj).f314A);
    }

    @Override // android.util.Property
    public void set(Object obj, Object obj2) {
        ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
    }
}