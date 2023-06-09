package p183e.p184a.p190p.p192b;

/* renamed from: e.a.p.b.n */
/* loaded from: classes.dex */
public abstract class AbstractC2148n {

    /* renamed from: a */
    public static final C2147m f7041a = new C2147m();

    /* renamed from: a */
    public static Object m110a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: b */
    public static int m109b(int i, String str) {
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }
}