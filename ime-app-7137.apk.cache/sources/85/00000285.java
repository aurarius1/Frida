package p010b.p046j.p050f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p036g.C0390n;
import p010b.p046j.p048e.p049b.C0497c;
import p010b.p046j.p048e.p049b.C0498d;
import p010b.p046j.p055i.C0544n;

/* renamed from: b.j.f.h */
/* loaded from: classes.dex */
public class C0513h extends C0520o {

    /* renamed from: b */
    public static final Class f2557b;

    /* renamed from: c */
    public static final Constructor f2558c;

    /* renamed from: d */
    public static final Method f2559d;

    /* renamed from: e */
    public static final Method f2560e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.getClass().getName();
            cls = null;
            method = null;
            method2 = null;
        }
        f2558c = constructor;
        f2557b = cls;
        f2559d = method2;
        f2560e = method;
    }

    /* renamed from: h */
    public static boolean m2375h(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f2559d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: i */
    public static Typeface m2374i(Object obj) {
        try {
            Object newInstance = Array.newInstance(f2557b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f2560e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p010b.p046j.p050f.C0520o
    /* renamed from: a */
    public Typeface mo2362a(Context context, C0497c c0497c, Resources resources, int i) {
        Object obj;
        C0498d[] c0498dArr;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f2558c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (C0498d c0498d : c0497c.f2520a) {
            int i2 = c0498d.f2526f;
            File m3524J = AbstractC0022t.m3524J(context);
            if (m3524J != null) {
                try {
                    if (AbstractC0022t.m3477p(m3524J, resources, i2)) {
                        try {
                            fileInputStream = new FileInputStream(m3524J);
                        } catch (IOException unused2) {
                            mappedByteBuffer = null;
                        }
                        try {
                            FileChannel channel = fileInputStream.getChannel();
                            mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                            fileInputStream.close();
                            if (mappedByteBuffer != null || !m2375h(obj, mappedByteBuffer, c0498d.f2525e, c0498d.f2522b, c0498d.f2523c)) {
                                return null;
                            }
                        } catch (Throwable th) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable unused3) {
                            }
                            throw th;
                            break;
                        }
                    }
                } finally {
                    m3524J.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
                return null;
            }
        }
        return m2374i(obj);
    }

    @Override // p010b.p046j.p050f.C0520o
    /* renamed from: b */
    public Typeface mo2361b(Context context, CancellationSignal cancellationSignal, C0544n[] c0544nArr, int i) {
        Object obj;
        try {
            obj = f2558c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        C0390n c0390n = new C0390n();
        for (C0544n c0544n : c0544nArr) {
            Uri uri = c0544n.f2614a;
            ByteBuffer byteBuffer = (ByteBuffer) c0390n.get(uri);
            if (byteBuffer == null) {
                byteBuffer = AbstractC0022t.m3515S(context, cancellationSignal, uri);
                c0390n.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !m2375h(obj, byteBuffer, c0544n.f2615b, c0544n.f2616c, c0544n.f2617d)) {
                return null;
            }
        }
        Typeface m2374i = m2374i(obj);
        if (m2374i == null) {
            return null;
        }
        return Typeface.create(m2374i, i);
    }
}