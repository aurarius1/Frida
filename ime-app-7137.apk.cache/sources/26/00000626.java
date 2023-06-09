package p093c.p097b.p119s.p120b;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.Locale;

/* renamed from: c.b.s.b.b */
/* loaded from: classes.dex */
public abstract class AbstractC1442b {

    /* renamed from: a */
    public static final String f4737a = System.getProperty("line.separator");

    /* renamed from: b */
    public static final StringBuilder f4738b;

    /* renamed from: c */
    public static final Formatter f4739c;

    /* renamed from: d */
    public static final String[] f4740d;

    /* renamed from: e */
    public static int f4741e;

    /* renamed from: f */
    public static C1443c f4742f;

    static {
        StringBuilder sb = new StringBuilder(1024);
        f4738b = sb;
        f4739c = new Formatter(sb, Locale.US);
        f4740d = new String[255];
        f4741e = 0;
        f4742f = new C1443c();
    }

    /* renamed from: a */
    public static synchronized String m1034a() {
        String sb;
        synchronized (AbstractC1442b.class) {
            ArrayList m1033b = m1033b();
            StringBuilder sb2 = new StringBuilder("Log contains " + m1033b.size() + " lines:");
            while (m1033b.size() > 0) {
                sb2.append(f4737a);
                sb2.append((String) m1033b.remove(m1033b.size() - 1));
            }
            sb = sb2.toString();
        }
        return sb;
    }

    /* renamed from: b */
    public static synchronized ArrayList m1033b() {
        ArrayList arrayList;
        synchronized (AbstractC1442b.class) {
            String[] strArr = f4740d;
            arrayList = new ArrayList(strArr.length);
            if (strArr.length > 0) {
                int i = f4741e;
                do {
                    i--;
                    if (i == -1) {
                        i = f4740d.length - 1;
                    }
                    String[] strArr2 = f4740d;
                    if (strArr2[i] == null) {
                        break;
                    }
                    arrayList.add(strArr2[i]);
                } while (i != f4741e);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static String m1032c(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append("at ");
            sb.append(stackTraceElement.toString());
            sb.append(f4737a);
        }
        if (th.getCause() == null) {
            return sb.toString();
        }
        Throwable cause = th.getCause();
        String m1032c = m1032c(cause);
        sb.append("*** Cause: ");
        sb.append(cause.getClass().getName());
        String str = f4737a;
        sb.append(str);
        sb.append("** Message: ");
        sb.append(cause.getMessage());
        sb.append(str);
        sb.append("** Stack track: ");
        sb.append(m1032c);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: d */
    public static void m1031d(C1443c c1443c) {
        f4742f = c1443c;
    }
}