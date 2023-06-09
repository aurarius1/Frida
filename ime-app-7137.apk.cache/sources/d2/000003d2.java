package p010b.p079r;

import android.content.Context;
import android.os.Build;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.r.f */
/* loaded from: classes.dex */
public abstract class AbstractC0846f {

    /* renamed from: a */
    public static final Set f3397a = new HashSet();

    /* renamed from: b */
    public static final boolean f3398b;

    static {
        String property = System.getProperty("java.vm.version");
        boolean z = false;
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ".");
            String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (nextToken != null && nextToken2 != null) {
                try {
                    int parseInt = Integer.parseInt(nextToken);
                    int parseInt2 = Integer.parseInt(nextToken2);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        f3398b = z;
    }

    /* renamed from: a */
    public static void m1782a(Object obj, String str, Object[] objArr) {
        Field m1779d = m1779d(obj, str);
        Object[] objArr2 = (Object[]) m1779d.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        m1779d.set(obj, objArr3);
    }

    /* renamed from: b */
    public static void m1781b(Context context) {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            file.getPath();
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                file.getPath();
                return;
            }
            for (File file2 : listFiles) {
                file2.getPath();
                file2.length();
                file2.delete();
                file2.getPath();
            }
            file.delete();
            file.getPath();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0026 A[Catch: all -> 0x0073, DONT_GENERATE, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x000b, B:10:0x0014, B:12:0x001a, B:13:0x001e, B:18:0x0026, B:21:0x002b, B:22:0x0032, B:25:0x0042, B:34:0x0063, B:38:0x006a, B:40:0x006c, B:24:0x0036, B:27:0x0050, B:28:0x0054, B:33:0x005c, B:41:0x006d), top: B:53:0x0003, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1780c(Context context, File file, File file2, String str, String str2, boolean z) {
        ClassLoader classLoader;
        Set set = f3397a;
        synchronized (set) {
            if (set.contains(file)) {
                return;
            }
            set.add(file);
            if (Build.VERSION.SDK_INT > 20) {
                System.getProperty("java.vm.version");
            }
            IOException e = null;
            try {
                classLoader = context.getClassLoader();
            } catch (RuntimeException unused) {
            }
            if (classLoader instanceof BaseDexClassLoader) {
                if (classLoader != null) {
                    return;
                }
                try {
                    m1781b(context);
                } catch (Throwable unused2) {
                }
                File file3 = new File(file2, "code_cache");
                try {
                    m1777f(file3);
                } catch (IOException unused3) {
                    file3 = new File(context.getFilesDir(), "code_cache");
                    m1777f(file3);
                }
                File file4 = new File(file3, str);
                m1777f(file4);
                C0849i c0849i = new C0849i(file, file4);
                try {
                    m1778e(classLoader, file4, c0849i.m1773d(context, str2, false));
                } catch (IOException e2) {
                    if (!z) {
                        throw e2;
                    }
                    m1778e(classLoader, file4, c0849i.m1773d(context, str2, true));
                }
                try {
                    c0849i.close();
                } catch (IOException e3) {
                    e = e3;
                }
                if (e != null) {
                    throw e;
                }
                return;
            }
            classLoader = null;
            if (classLoader != null) {
            }
        }
    }

    /* renamed from: d */
    public static Field m1779d(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException("Field " + str + " not found in " + obj.getClass());
    }

    /* renamed from: e */
    public static void m1778e(ClassLoader classLoader, File file, List list) {
        InterfaceC0841a c0844d;
        IOException[] iOExceptionArr;
        if (list.isEmpty()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            Object obj = m1779d(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(list);
            Class<?>[] clsArr = {ArrayList.class, File.class, ArrayList.class};
            for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
                try {
                    Method declaredMethod = cls.getDeclaredMethod("makeDexElements", clsArr);
                    if (!declaredMethod.isAccessible()) {
                        declaredMethod.setAccessible(true);
                    }
                    m1782a(obj, "dexElements", (Object[]) declaredMethod.invoke(obj, arrayList2, file, arrayList));
                    if (arrayList.size() > 0) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            IOException iOException = (IOException) it.next();
                        }
                        Field m1779d = m1779d(obj, "dexElementsSuppressedExceptions");
                        IOException[] iOExceptionArr2 = (IOException[]) m1779d.get(obj);
                        if (iOExceptionArr2 == null) {
                            iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                        } else {
                            IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                            arrayList.toArray(iOExceptionArr3);
                            System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                            iOExceptionArr = iOExceptionArr3;
                        }
                        m1779d.set(obj, iOExceptionArr);
                        IOException iOException2 = new IOException("I/O exception during makeDexElement");
                        iOException2.initCause((Throwable) arrayList.get(0));
                        throw iOException2;
                    }
                    return;
                } catch (NoSuchMethodException unused) {
                }
            }
            throw new NoSuchMethodException("Method makeDexElements with parameters " + Arrays.asList(clsArr) + " not found in " + obj.getClass());
        }
        Object obj2 = m1779d(classLoader, "pathList").get(classLoader);
        Class<?> cls2 = Class.forName("dalvik.system.DexPathList$Element");
        try {
            try {
                c0844d = new C0842b(cls2);
            } catch (NoSuchMethodException unused2) {
                c0844d = new C0844d(cls2);
            }
        } catch (NoSuchMethodException unused3) {
            c0844d = new C0843c(cls2);
        }
        int size = list.size();
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            File file2 = (File) list.get(i);
            String path = file2.getPath();
            File parentFile = file2.getParentFile();
            String name = file2.getName();
            objArr[i] = c0844d.mo1784a(file2, DexFile.loadDex(path, new File(parentFile, name.substring(0, name.length() - 4) + ".dex").getPath(), 0));
        }
        try {
            m1782a(obj2, "dexElements", objArr);
        } catch (NoSuchFieldException unused4) {
            m1782a(obj2, "pathElements", objArr);
        }
    }

    /* renamed from: f */
    public static void m1777f(File file) {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        file.getPath();
        if (parentFile != null) {
            parentFile.isDirectory();
            parentFile.isFile();
            parentFile.exists();
            parentFile.canRead();
            parentFile.canWrite();
        }
        StringBuilder m1187i = AbstractC1124a.m1187i("Failed to create directory ");
        m1187i.append(file.getPath());
        throw new IOException(m1187i.toString());
    }
}