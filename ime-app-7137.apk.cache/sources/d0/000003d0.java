package p010b.p079r;

import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Constructor;

/* renamed from: b.r.d */
/* loaded from: classes.dex */
public class C0844d implements InterfaceC0841a {

    /* renamed from: a */
    public final Constructor f3396a;

    public C0844d(Class cls) {
        Constructor constructor = cls.getConstructor(File.class, Boolean.TYPE, File.class, DexFile.class);
        this.f3396a = constructor;
        constructor.setAccessible(true);
    }

    @Override // p010b.p079r.InterfaceC0841a
    /* renamed from: a */
    public Object mo1784a(File file, DexFile dexFile) {
        return this.f3396a.newInstance(file, Boolean.FALSE, file, dexFile);
    }
}