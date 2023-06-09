package p010b.p086w;

import android.os.Build;

/* renamed from: b.w.n0 */
/* loaded from: classes.dex */
public abstract class AbstractC1061n0 {

    /* renamed from: a */
    public static final boolean f4008a;

    /* renamed from: b */
    public static final boolean f4009b;

    /* renamed from: c */
    public static final boolean f4010c;

    static {
        int i = Build.VERSION.SDK_INT;
        f4008a = i >= 19;
        f4009b = i >= 18;
        f4010c = i >= 28;
    }
}