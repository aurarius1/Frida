package p010b.p079r;

import java.io.File;
import java.io.FileFilter;

/* renamed from: b.r.g */
/* loaded from: classes.dex */
public class C0847g implements FileFilter {
    public C0847g(C0849i c0849i) {
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return !file.getName().equals("MultiDex.lock");
    }
}