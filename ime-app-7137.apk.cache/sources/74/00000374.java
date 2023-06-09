package p010b.p067m.p068d;

import android.content.Context;
import androidx.fragment.app.Fragment$InstantiationException;
import java.lang.reflect.InvocationTargetException;
import p010b.p036g.C0390n;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.m.d.v0 */
/* loaded from: classes.dex */
public class C0752v0 {

    /* renamed from: a */
    public static final C0390n f3174a = new C0390n();

    /* renamed from: b */
    public final /* synthetic */ C0690f1 f3175b;

    public C0752v0(C0690f1 c0690f1) {
        this.f3175b = c0690f1;
    }

    /* renamed from: b */
    public static Class m1935b(ClassLoader classLoader, String str) {
        C0390n c0390n = f3174a;
        C0390n c0390n2 = (C0390n) c0390n.getOrDefault(classLoader, null);
        if (c0390n2 == null) {
            c0390n2 = new C0390n();
            c0390n.put(classLoader, c0390n2);
        }
        Class cls = (Class) c0390n2.getOrDefault(str, null);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            c0390n2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    /* renamed from: c */
    public static Class m1934c(ClassLoader classLoader, String str) {
        try {
            return m1935b(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment$InstantiationException(AbstractC1124a.m1189g("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment$InstantiationException(AbstractC1124a.m1189g("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    /* renamed from: a */
    public AbstractComponentCallbacksC0763z m1936a(String str) {
        C0677c0 c0677c0 = this.f3175b.f2983q;
        Context context = c0677c0.f2924c;
        c0677c0.getClass();
        Object obj = AbstractComponentCallbacksC0763z.f3207b;
        try {
            return (AbstractComponentCallbacksC0763z) m1934c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw new Fragment$InstantiationException(AbstractC1124a.m1189g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new Fragment$InstantiationException(AbstractC1124a.m1189g("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new Fragment$InstantiationException(AbstractC1124a.m1189g("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new Fragment$InstantiationException(AbstractC1124a.m1189g("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}