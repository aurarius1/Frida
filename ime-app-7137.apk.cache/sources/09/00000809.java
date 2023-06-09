package p093c.p145g.p146a.p147a.p157j0.p158a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p010b.p016c.p024p.C0163d;
import p093c.p145g.p146a.p147a.AbstractC1804b;

/* renamed from: c.g.a.a.j0.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC1925a {

    /* renamed from: a */
    public static final int[] f5850a = {16842752, AbstractC1804b.theme};

    /* renamed from: b */
    public static final int[] f5851b = {AbstractC1804b.materialThemeOverlay};

    /* renamed from: a */
    public static Context m676a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5851b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z = (context instanceof C0163d) && ((C0163d) context).f1194a == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        C0163d c0163d = new C0163d(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f5850a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c0163d.getTheme().applyStyle(resourceId2, true);
        }
        return c0163d;
    }
}