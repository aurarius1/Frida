package p093c.p145g.p146a.p147a.p161m;

import android.util.Property;
import android.view.ViewGroup;
import p093c.p145g.p146a.p147a.AbstractC1840f;

/* renamed from: c.g.a.a.m.b */
/* loaded from: classes.dex */
public class C1947b extends Property {

    /* renamed from: a */
    public static final Property f5899a = new C1947b("childrenAlpha");

    public C1947b(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    public Object get(Object obj) {
        Float f = (Float) ((ViewGroup) obj).getTag(AbstractC1840f.mtrl_internal_children_alpha_tag);
        return f != null ? f : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        float floatValue = ((Float) obj2).floatValue();
        viewGroup.setTag(AbstractC1840f.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}