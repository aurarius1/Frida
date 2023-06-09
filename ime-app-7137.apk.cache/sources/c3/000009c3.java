package p183e.p184a.p190p.p200h;

/* renamed from: e.a.p.h.d */
/* loaded from: classes.dex */
public abstract class AbstractC2262d {

    /* renamed from: a */
    public static final Throwable f7387a = new C2261c();

    /* renamed from: a */
    public static RuntimeException m53a(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }
}