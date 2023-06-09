package p093c.p140e.p141a;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: c.e.a.e */
/* loaded from: classes.dex */
public class C1796e implements FilenameFilter {

    /* renamed from: a */
    public final /* synthetic */ String f5475a;

    public C1796e(C1797f c1797f, String str) {
        this.f5475a = str;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return str.startsWith(this.f5475a);
    }
}