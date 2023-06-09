package p010b.p072o;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: b.o.y */
/* loaded from: classes.dex */
public class C0796y {

    /* renamed from: a */
    public final HashMap f3307a = new HashMap();

    /* renamed from: a */
    public final void m1802a() {
        for (AbstractC0794w abstractC0794w : this.f3307a.values()) {
            Map map = abstractC0794w.f3306a;
            if (map != null) {
                synchronized (map) {
                    for (Object obj : abstractC0794w.f3306a.values()) {
                        if (obj instanceof Closeable) {
                            try {
                                ((Closeable) obj).close();
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            }
            abstractC0794w.mo1799a();
        }
        this.f3307a.clear();
    }
}