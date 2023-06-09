package p010b.p079r;

import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.zip.ZipFile;

/* renamed from: b.r.b */
/* loaded from: classes.dex */
public class C0842b implements InterfaceC0841a {

    /* renamed from: a */
    public final Constructor f3394a;

    public C0842b(Class cls) {
        Constructor constructor = cls.getConstructor(File.class, ZipFile.class, DexFile.class);
        this.f3394a = constructor;
        constructor.setAccessible(true);
    }

    @Override // p010b.p079r.InterfaceC0841a
    /* renamed from: a */
    public Object mo1784a(File file, DexFile dexFile) {
        return this.f3394a.newInstance(file, new ZipFile(file), dexFile);
    }
}