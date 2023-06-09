package p010b.p086w;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* renamed from: b.w.w */
/* loaded from: classes.dex */
public class C1078w implements TypeEvaluator {
    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f, Object obj, Object obj2) {
        Rect rect = (Rect) obj;
        Rect rect2 = (Rect) obj2;
        int i = rect.left;
        int i2 = i + ((int) ((rect2.left - i) * f));
        int i3 = rect.top;
        int i4 = i3 + ((int) ((rect2.top - i3) * f));
        int i5 = rect.right;
        int i6 = rect.bottom;
        return new Rect(i2, i4, i5 + ((int) ((rect2.right - i5) * f)), i6 + ((int) ((rect2.bottom - i6) * f)));
    }
}