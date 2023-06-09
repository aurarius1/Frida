package p010b.p046j.p050f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p046j.p048e.p049b.C0497c;
import p010b.p046j.p048e.p049b.C0498d;
import p010b.p046j.p055i.C0544n;

/* renamed from: b.j.f.g */
/* loaded from: classes.dex */
public class C0512g extends C0520o {

    /* renamed from: b */
    public static Class f2552b = null;

    /* renamed from: c */
    public static Constructor f2553c = null;

    /* renamed from: d */
    public static Method f2554d = null;

    /* renamed from: e */
    public static Method f2555e = null;

    /* renamed from: f */
    public static boolean f2556f = false;

    /* renamed from: h */
    public static boolean m2378h(Object obj, String str, int i, boolean z) {
        m2376j();
        try {
            return ((Boolean) f2554d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: j */
    public static void m2376j() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f2556f) {
            return;
        }
        f2556f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.getClass().getName();
            method = null;
            cls = null;
            method2 = null;
        }
        f2553c = constructor;
        f2552b = cls;
        f2554d = method2;
        f2555e = method;
    }

    @Override // p010b.p046j.p050f.C0520o
    /* renamed from: a */
    public Typeface mo2362a(Context context, C0497c c0497c, Resources resources, int i) {
        C0498d[] c0498dArr;
        m2376j();
        try {
            Object newInstance = f2553c.newInstance(new Object[0]);
            for (C0498d c0498d : c0497c.f2520a) {
                File m3524J = AbstractC0022t.m3524J(context);
                if (m3524J == null) {
                    return null;
                }
                try {
                    if (!AbstractC0022t.m3477p(m3524J, resources, c0498d.f2526f)) {
                        return null;
                    }
                    if (!m2378h(newInstance, m3524J.getPath(), c0498d.f2522b, c0498d.f2523c)) {
                        return null;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    m3524J.delete();
                }
            }
            m2376j();
            try {
                Object newInstance2 = Array.newInstance(f2552b, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f2555e.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p010b.p046j.p050f.C0520o
    /* renamed from: b */
    public Typeface mo2361b(Context context, CancellationSignal cancellationSignal, C0544n[] c0544nArr, int i) {
        if (c0544nArr.length < 1) {
            return null;
        }
        C0544n c0544n = (C0544n) C0520o.m2358e(c0544nArr, i, new C0517l(this));
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(c0544n.f2614a, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            File m2377i = m2377i(openFileDescriptor);
            if (m2377i != null && m2377i.canRead()) {
                Typeface createFromFile = Typeface.createFromFile(m2377i);
                openFileDescriptor.close();
                return createFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface mo2360c = mo2360c(context, fileInputStream);
            fileInputStream.close();
            openFileDescriptor.close();
            return mo2360c;
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public final File m2377i(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
            return null;
        } catch (ErrnoException unused) {
            return null;
        }
    }
}