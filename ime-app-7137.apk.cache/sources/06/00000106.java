package p010b.p016c.p017k;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import p010b.p016c.AbstractC0075a;
import p010b.p016c.p026q.C0242f1;
import p010b.p016c.p026q.C0274l0;
import p010b.p016c.p026q.C0328w;
import p010b.p016c.p026q.C0338y;
import p010b.p016c.p026q.C0343z;
import p010b.p036g.C0390n;

/* renamed from: b.c.k.u0 */
/* loaded from: classes.dex */
public class C0130u0 {

    /* renamed from: a */
    public static final Class[] f1095a = {Context.class, AttributeSet.class};

    /* renamed from: b */
    public static final int[] f1096b = {16843375};

    /* renamed from: c */
    public static final String[] f1097c = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: d */
    public static final C0390n f1098d = new C0390n();

    /* renamed from: e */
    public final Object[] f1099e = new Object[2];

    /* renamed from: a */
    public C0328w mo235a(Context context, AttributeSet attributeSet) {
        return new C0328w(context, attributeSet, AbstractC0075a.autoCompleteTextViewStyle);
    }

    /* renamed from: b */
    public C0338y mo234b(Context context, AttributeSet attributeSet) {
        return new C0338y(context, attributeSet, AbstractC0075a.buttonStyle);
    }

    /* renamed from: c */
    public C0343z mo233c(Context context, AttributeSet attributeSet) {
        return new C0343z(context, attributeSet, AbstractC0075a.checkboxStyle);
    }

    /* renamed from: d */
    public C0274l0 mo232d(Context context, AttributeSet attributeSet) {
        return new C0274l0(context, attributeSet, AbstractC0075a.radioButtonStyle);
    }

    /* renamed from: e */
    public C0242f1 mo231e(Context context, AttributeSet attributeSet) {
        return new C0242f1(context, attributeSet, 16842884);
    }

    /* renamed from: f */
    public View m3019f() {
        return null;
    }

    /* renamed from: g */
    public final View m3018g(Context context, String str, String str2) {
        String str3;
        C0390n c0390n = f1098d;
        Constructor constructor = (Constructor) c0390n.getOrDefault(str, null);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f1095a);
            c0390n.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f1099e);
    }

    /* renamed from: h */
    public final void m3017h(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}