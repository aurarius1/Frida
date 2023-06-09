package p010b.p072o;

import java.lang.reflect.Method;

/* renamed from: b.o.b */
/* loaded from: classes.dex */
public final class C0772b {

    /* renamed from: a */
    public final int f3269a;

    /* renamed from: b */
    public final Method f3270b;

    public C0772b(int i, Method method) {
        this.f3269a = i;
        this.f3270b = method;
        method.setAccessible(true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0772b) {
            C0772b c0772b = (C0772b) obj;
            return this.f3269a == c0772b.f3269a && this.f3270b.getName().equals(c0772b.f3270b.getName());
        }
        return false;
    }

    public int hashCode() {
        return this.f3270b.getName().hashCode() + (this.f3269a * 31);
    }
}