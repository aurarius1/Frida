package p183e.p184a.p190p.p200h;

import p183e.p184a.InterfaceC2098f;

/* renamed from: e.a.p.h.f */
/* loaded from: classes.dex */
public enum EnumC2264f {
    COMPLETE;

    /* renamed from: a */
    public static boolean m52a(Object obj, InterfaceC2098f interfaceC2098f) {
        if (obj == COMPLETE) {
            interfaceC2098f.mo26d();
            return true;
        } else if (obj instanceof C2263e) {
            interfaceC2098f.mo28b(((C2263e) obj).f7388b);
            return true;
        } else {
            interfaceC2098f.mo25g(obj);
            return false;
        }
    }

    /* renamed from: b */
    public static Object m51b(Throwable th) {
        return new C2263e(th);
    }

    /* renamed from: c */
    public static Throwable m50c(Object obj) {
        return ((C2263e) obj).f7388b;
    }

    /* renamed from: d */
    public static boolean m49d(Object obj) {
        return obj == COMPLETE;
    }

    /* renamed from: e */
    public static boolean m48e(Object obj) {
        return obj instanceof C2263e;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }
}