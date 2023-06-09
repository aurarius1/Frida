package p010b.p046j.p055i;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p010b.p036g.C0383g;
import p010b.p036g.C0390n;
import p010b.p046j.p050f.AbstractC0511f;

/* renamed from: b.j.i.l */
/* loaded from: classes.dex */
public abstract class AbstractC0542l {

    /* renamed from: a */
    public static final C0383g f2608a = new C0383g(16);

    /* renamed from: b */
    public static final ExecutorService f2609b;

    /* renamed from: c */
    public static final Object f2610c;

    /* renamed from: d */
    public static final C0390n f2611d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0546p("fonts-androidx", 10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f2609b = threadPoolExecutor;
        f2610c = new Object();
        f2611d = new C0390n();
    }

    /* renamed from: a */
    public static C0541k m2343a(String str, Context context, C0536f c0536f, int i) {
        int i2;
        Typeface typeface = (Typeface) f2608a.m2639a(str);
        if (typeface != null) {
            return new C0541k(typeface);
        }
        try {
            C0543m m2345a = AbstractC0535e.m2345a(context, c0536f, null);
            int i3 = m2345a.f2612a;
            int i4 = 1;
            if (i3 != 0) {
                if (i3 == 1) {
                    i2 = -2;
                }
                i2 = -3;
            } else {
                C0544n[] c0544nArr = m2345a.f2613b;
                if (c0544nArr != null && c0544nArr.length != 0) {
                    for (C0544n c0544n : c0544nArr) {
                        int i5 = c0544n.f2618e;
                        if (i5 != 0) {
                            if (i5 >= 0) {
                                i2 = i5;
                            }
                            i2 = -3;
                        }
                    }
                    i4 = 0;
                }
                i2 = i4;
            }
            if (i2 != 0) {
                return new C0541k(i2);
            }
            Typeface mo2361b = AbstractC0511f.f2550a.mo2361b(context, null, m2345a.f2613b, i);
            if (mo2361b != null) {
                f2608a.m2638b(str, mo2361b);
                return new C0541k(mo2361b);
            }
            return new C0541k(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0541k(-1);
        }
    }
}