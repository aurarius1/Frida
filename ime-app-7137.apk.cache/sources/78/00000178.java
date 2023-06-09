package p010b.p016c.p026q;

import android.annotation.SuppressLint;
import android.os.Build;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

/* renamed from: b.c.q.f3 */
/* loaded from: classes.dex */
public class C0244f3 {

    /* renamed from: a */
    public Method f1581a;

    /* renamed from: b */
    public Method f1582b;

    /* renamed from: c */
    public Method f1583c;

    @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
    public C0244f3() {
        this.f1581a = null;
        this.f1582b = null;
        this.f1583c = null;
        m2825a();
        try {
            Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
            this.f1581a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        try {
            Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
            this.f1582b = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
            this.f1583c = method;
            method.setAccessible(true);
        } catch (NoSuchMethodException unused3) {
        }
    }

    /* renamed from: a */
    public static void m2825a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}