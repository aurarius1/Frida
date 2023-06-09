package p010b.p046j.p050f;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p046j.p048e.p049b.C0497c;
import p010b.p046j.p048e.p049b.C0498d;
import p010b.p046j.p055i.C0544n;

/* renamed from: b.j.f.i */
/* loaded from: classes.dex */
public class C0514i extends C0512g {

    /* renamed from: g */
    public final Class f2561g;

    /* renamed from: h */
    public final Constructor f2562h;

    /* renamed from: i */
    public final Method f2563i;

    /* renamed from: j */
    public final Method f2564j;

    /* renamed from: k */
    public final Method f2565k;

    /* renamed from: l */
    public final Method f2566l;

    /* renamed from: m */
    public final Method f2567m;

    public C0514i() {
        Method method;
        Method method2;
        Constructor<?> constructor;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = m2368q(cls2);
            method4 = m2367r(cls2);
            method5 = cls2.getMethod("freeze", new Class[0]);
            method2 = cls2.getMethod("abortCreation", new Class[0]);
            method = mo2365s(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.getClass().getName();
            method = null;
            method2 = null;
            constructor = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f2561g = cls;
        this.f2562h = constructor;
        this.f2563i = method3;
        this.f2564j = method4;
        this.f2565k = method5;
        this.f2566l = method2;
        this.f2567m = method;
    }

    /* renamed from: p */
    private Object m2369p() {
        try {
            return this.f2562h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p010b.p046j.p050f.C0512g, p010b.p046j.p050f.C0520o
    /* renamed from: a */
    public Typeface mo2362a(Context context, C0497c c0497c, Resources resources, int i) {
        C0498d[] c0498dArr;
        if (m2370o()) {
            Object m2369p = m2369p();
            if (m2369p == null) {
                return null;
            }
            for (C0498d c0498d : c0497c.f2520a) {
                if (!m2372l(context, m2369p, c0498d.f2521a, c0498d.f2525e, c0498d.f2522b, c0498d.f2523c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0498d.f2524d))) {
                    m2373k(m2369p);
                    return null;
                }
            }
            if (m2371n(m2369p)) {
                return mo2366m(m2369p);
            }
            return null;
        }
        return super.mo2362a(context, c0497c, resources, i);
    }

    @Override // p010b.p046j.p050f.C0512g, p010b.p046j.p050f.C0520o
    /* renamed from: b */
    public Typeface mo2361b(Context context, CancellationSignal cancellationSignal, C0544n[] c0544nArr, int i) {
        Typeface mo2366m;
        boolean z;
        if (c0544nArr.length < 1) {
            return null;
        }
        if (!m2370o()) {
            C0544n c0544n = (C0544n) C0520o.m2358e(c0544nArr, i, new C0517l(this));
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(c0544n.f2614a, "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(c0544n.f2616c).setItalic(c0544n.f2617d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (C0544n c0544n2 : c0544nArr) {
            if (c0544n2.f2618e == 0) {
                Uri uri = c0544n2.f2614a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, AbstractC0022t.m3515S(context, cancellationSignal, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object m2369p = m2369p();
        if (m2369p == null) {
            return null;
        }
        boolean z2 = false;
        for (C0544n c0544n3 : c0544nArr) {
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(c0544n3.f2614a);
            if (byteBuffer != null) {
                try {
                    z = ((Boolean) this.f2564j.invoke(m2369p, byteBuffer, Integer.valueOf(c0544n3.f2615b), null, Integer.valueOf(c0544n3.f2616c), Integer.valueOf(c0544n3.f2617d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z = false;
                }
                if (!z) {
                    m2373k(m2369p);
                    return null;
                }
                z2 = true;
            }
        }
        if (!z2) {
            m2373k(m2369p);
            return null;
        } else if (m2371n(m2369p) && (mo2366m = mo2366m(m2369p)) != null) {
            return Typeface.create(mo2366m, i);
        } else {
            return null;
        }
    }

    @Override // p010b.p046j.p050f.C0520o
    /* renamed from: d */
    public Typeface mo2359d(Context context, Resources resources, int i, String str, int i2) {
        if (m2370o()) {
            Object m2369p = m2369p();
            if (m2369p == null) {
                return null;
            }
            if (!m2372l(context, m2369p, str, 0, -1, -1, null)) {
                m2373k(m2369p);
                return null;
            } else if (m2371n(m2369p)) {
                return mo2366m(m2369p);
            } else {
                return null;
            }
        }
        return super.mo2359d(context, resources, i, str, i2);
    }

    /* renamed from: k */
    public final void m2373k(Object obj) {
        try {
            this.f2566l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: l */
    public final boolean m2372l(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2563i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: m */
    public Typeface mo2366m(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2561g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2567m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: n */
    public final boolean m2371n(Object obj) {
        try {
            return ((Boolean) this.f2565k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: o */
    public final boolean m2370o() {
        Method method = this.f2563i;
        return this.f2563i != null;
    }

    /* renamed from: q */
    public Method m2368q(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: r */
    public Method m2367r(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* renamed from: s */
    public Method mo2365s(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}