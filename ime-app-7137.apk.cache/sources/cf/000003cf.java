package p010b.p079r;

import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Constructor;

/* renamed from: b.r.c */
/* loaded from: classes.dex */
public class C0843c implements InterfaceC0841a {

    /* renamed from: a */
    public final Constructor f3395a;

    public C0843c(Class cls) {
        Constructor constructor = cls.getConstructor(File.class, File.class, DexFile.class);
        this.f3395a = constructor;
        constructor.setAccessible(true);
    }

    @Override // p010b.p079r.InterfaceC0841a
    /* renamed from: a */
    public Object mo1784a(File file, DexFile dexFile) {
        return this.f3395a.newInstance(file, file, dexFile);
    }
}