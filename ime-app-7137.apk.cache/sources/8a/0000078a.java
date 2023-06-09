package p093c.p140e.p141a;

/* renamed from: c.e.a.g */
/* loaded from: classes.dex */
public final class C1798g {
    /* renamed from: a */
    public String m795a(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }
}