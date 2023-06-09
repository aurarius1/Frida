package p010b.p016c.p018l.p019a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.p026q.C0296p2;
import p010b.p046j.p047d.AbstractC0472e;

@SuppressLint({"RestrictedAPI"})
/* renamed from: b.c.l.a.b */
/* loaded from: classes.dex */
public abstract class AbstractC0142b {

    /* renamed from: a */
    public static final ThreadLocal f1121a = new ThreadLocal();

    /* renamed from: b */
    public static final WeakHashMap f1122b = new WeakHashMap(0);

    /* renamed from: c */
    public static final Object f1123c = new Object();

    /* renamed from: a */
    public static ColorStateList m3001a(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0141a c0141a;
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        synchronized (f1123c) {
            SparseArray sparseArray = (SparseArray) f1122b.get(context);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (c0141a = (C0141a) sparseArray.get(i)) != null) {
                if (c0141a.f1120b.equals(context.getResources().getConfiguration())) {
                    colorStateList2 = c0141a.f1119a;
                } else {
                    sparseArray.remove(i);
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        Resources resources = context.getResources();
        ThreadLocal threadLocal = f1121a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        boolean z = true;
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (!((i2 < 28 || i2 > 31) ? false : false)) {
            Resources resources2 = context.getResources();
            try {
                colorStateList = AbstractC0022t.m3473r(resources2, resources2.getXml(i), context.getTheme());
            } catch (Exception unused) {
            }
        }
        if (colorStateList != null) {
            synchronized (f1123c) {
                WeakHashMap weakHashMap = f1122b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(context);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(context, sparseArray2);
                }
                sparseArray2.append(i, new C0141a(colorStateList, context.getResources().getConfiguration()));
            }
            return colorStateList;
        }
        Object obj = AbstractC0472e.f2456a;
        return Build.VERSION.SDK_INT >= 23 ? context.getColorStateList(i) : context.getResources().getColorStateList(i);
    }

    /* renamed from: b */
    public static Drawable m3000b(Context context, int i) {
        return C0296p2.m2775d().m2773f(context, i);
    }
}