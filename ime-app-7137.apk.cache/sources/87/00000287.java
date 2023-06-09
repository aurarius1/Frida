package p010b.p046j.p050f;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: b.j.f.j */
/* loaded from: classes.dex */
public class C0515j extends C0514i {
    @Override // p010b.p046j.p050f.C0514i
    /* renamed from: m */
    public Typeface mo2366m(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2561g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2567m.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p010b.p046j.p050f.C0514i
    /* renamed from: s */
    public Method mo2365s(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}