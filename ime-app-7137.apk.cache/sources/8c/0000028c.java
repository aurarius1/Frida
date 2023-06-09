package p010b.p046j.p050f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p046j.p048e.p049b.C0497c;
import p010b.p046j.p048e.p049b.C0498d;
import p010b.p046j.p055i.C0544n;

/* renamed from: b.j.f.o */
/* loaded from: classes.dex */
public class C0520o {
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: a */
    public ConcurrentHashMap f2568a = new ConcurrentHashMap();

    /* renamed from: e */
    public static Object m2358e(Object[] objArr, int i, InterfaceC0519n interfaceC0519n) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        Object obj = null;
        int i3 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = (Math.abs(interfaceC0519n.mo2364a(obj2) - i2) * 2) + (interfaceC0519n.mo2363b(obj2) == z ? 0 : 1);
            if (obj == null || i3 > abs) {
                obj = obj2;
                i3 = abs;
            }
        }
        return obj;
    }

    /* renamed from: g */
    public static long m2356g(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return 0L;
        }
    }

    /* renamed from: a */
    public Typeface mo2362a(Context context, C0497c c0497c, Resources resources, int i) {
        C0498d c0498d = (C0498d) m2358e(c0497c.f2520a, i, new C0518m(this));
        if (c0498d == null) {
            return null;
        }
        Typeface m2380b = AbstractC0511f.m2380b(context, resources, c0498d.f2526f, c0498d.f2521a, i);
        long m2356g = m2356g(m2380b);
        if (m2356g != 0) {
            this.f2568a.put(Long.valueOf(m2356g), c0497c);
        }
        return m2380b;
    }

    /* renamed from: b */
    public Typeface mo2361b(Context context, CancellationSignal cancellationSignal, C0544n[] c0544nArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (c0544nArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo2357f(c0544nArr, i).f2614a);
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface mo2360c = mo2360c(context, inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            return mo2360c;
        } catch (IOException unused3) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            if (inputStream2 != null) {
                try {
                    inputStream2.close();
                } catch (IOException unused5) {
                }
            }
            throw th;
        }
    }

    /* renamed from: c */
    public Typeface mo2360c(Context context, InputStream inputStream) {
        File m3524J = AbstractC0022t.m3524J(context);
        if (m3524J == null) {
            return null;
        }
        try {
            if (AbstractC0022t.m3475q(m3524J, inputStream)) {
                return Typeface.createFromFile(m3524J.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m3524J.delete();
        }
    }

    /* renamed from: d */
    public Typeface mo2359d(Context context, Resources resources, int i, String str, int i2) {
        File m3524J = AbstractC0022t.m3524J(context);
        if (m3524J == null) {
            return null;
        }
        try {
            if (AbstractC0022t.m3477p(m3524J, resources, i)) {
                return Typeface.createFromFile(m3524J.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m3524J.delete();
        }
    }

    /* renamed from: f */
    public C0544n mo2357f(C0544n[] c0544nArr, int i) {
        return (C0544n) m2358e(c0544nArr, i, new C0517l(this));
    }
}