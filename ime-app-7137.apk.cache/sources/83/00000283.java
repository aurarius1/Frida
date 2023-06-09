package p010b.p046j.p050f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p010b.p036g.C0383g;
import p010b.p036g.C0390n;
import p010b.p046j.p048e.p049b.AbstractC0503i;
import p010b.p046j.p048e.p049b.C0497c;
import p010b.p046j.p048e.p049b.C0499e;
import p010b.p046j.p048e.p049b.InterfaceC0496b;
import p010b.p046j.p055i.AbstractC0542l;
import p010b.p046j.p055i.C0533c;
import p010b.p046j.p055i.C0536f;
import p010b.p046j.p055i.C0538h;
import p010b.p046j.p055i.C0540j;
import p010b.p046j.p055i.C0541k;
import p010b.p046j.p055i.CallableC0537g;
import p010b.p046j.p055i.CallableC0539i;
import p010b.p046j.p055i.RunnableC0531a;
import p010b.p046j.p055i.RunnableC0532b;
import p010b.p046j.p055i.RunnableC0548r;

@SuppressLint({"NewApi"})
/* renamed from: b.j.f.f */
/* loaded from: classes.dex */
public abstract class AbstractC0511f {

    /* renamed from: a */
    public static final C0520o f2550a;

    /* renamed from: b */
    public static final C0383g f2551b;

    static {
        C0520o c0512g;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            c0512g = new C0516k();
        } else if (i >= 28) {
            c0512g = new C0515j();
        } else if (i >= 26) {
            c0512g = new C0514i();
        } else {
            if (i >= 24) {
                if (C0513h.f2559d != null) {
                    c0512g = new C0513h();
                }
            }
            c0512g = i >= 21 ? new C0512g() : new C0520o();
        }
        f2550a = c0512g;
        f2551b = new C0383g(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r0.equals(r4) == false) goto L11;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface m2381a(Context context, InterfaceC0496b interfaceC0496b, Resources resources, int i, int i2, AbstractC0503i abstractC0503i, Handler handler, boolean z) {
        Typeface mo2362a;
        Typeface typeface;
        if (interfaceC0496b instanceof C0499e) {
            C0499e c0499e = (C0499e) interfaceC0496b;
            String str = c0499e.f2530d;
            mo2362a = null;
            boolean z2 = false;
            if (str != null && !str.isEmpty()) {
                typeface = Typeface.create(str, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                if (abstractC0503i != null) {
                    abstractC0503i.m2406b(typeface, handler);
                }
                return typeface;
            }
            if (!z ? abstractC0503i == null : c0499e.f2529c == 0) {
                z2 = true;
            }
            int i3 = z ? c0499e.f2528b : -1;
            Handler m2405c = AbstractC0503i.m2405c(handler);
            C0510e c0510e = new C0510e(abstractC0503i);
            C0536f c0536f = c0499e.f2527a;
            C0533c c0533c = new C0533c(c0510e, m2405c);
            if (z2) {
                C0383g c0383g = AbstractC0542l.f2608a;
                String str2 = c0536f.f2595e + "-" + i2;
                Typeface typeface2 = (Typeface) AbstractC0542l.f2608a.m2639a(str2);
                if (typeface2 != null) {
                    m2405c.post(new RunnableC0531a(c0533c, c0510e, typeface2));
                    mo2362a = typeface2;
                } else if (i3 == -1) {
                    C0541k m2343a = AbstractC0542l.m2343a(str2, context, c0536f, i2);
                    c0533c.m2346a(m2343a);
                    mo2362a = m2343a.f2606a;
                } else {
                    try {
                        try {
                            try {
                                C0541k c0541k = (C0541k) AbstractC0542l.f2609b.submit(new CallableC0537g(str2, context, c0536f, i2)).get(i3, TimeUnit.MILLISECONDS);
                                c0533c.m2346a(c0541k);
                                mo2362a = c0541k.f2606a;
                            } catch (InterruptedException e) {
                                throw e;
                            } catch (TimeoutException unused) {
                                throw new InterruptedException("timeout");
                            }
                        } catch (ExecutionException e2) {
                            throw new RuntimeException(e2);
                        }
                    } catch (InterruptedException unused2) {
                        c0533c.f2589b.post(new RunnableC0532b(c0533c, c0533c.f2588a, -3));
                    }
                }
            } else {
                C0383g c0383g2 = AbstractC0542l.f2608a;
                String str3 = c0536f.f2595e + "-" + i2;
                Typeface typeface3 = (Typeface) AbstractC0542l.f2608a.m2639a(str3);
                if (typeface3 != null) {
                    m2405c.post(new RunnableC0531a(c0533c, c0510e, typeface3));
                    mo2362a = typeface3;
                } else {
                    C0538h c0538h = new C0538h(c0533c);
                    synchronized (AbstractC0542l.f2610c) {
                        C0390n c0390n = AbstractC0542l.f2611d;
                        ArrayList arrayList = (ArrayList) c0390n.getOrDefault(str3, null);
                        if (arrayList != null) {
                            arrayList.add(c0538h);
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(c0538h);
                            c0390n.put(str3, arrayList2);
                            AbstractC0542l.f2609b.execute(new RunnableC0548r(Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler(), new CallableC0539i(str3, context, c0536f, i2), new C0540j(str3)));
                        }
                    }
                }
            }
        } else {
            mo2362a = f2550a.mo2362a(context, (C0497c) interfaceC0496b, resources, i2);
            if (abstractC0503i != null) {
                if (mo2362a != null) {
                    abstractC0503i.m2406b(mo2362a, handler);
                } else {
                    abstractC0503i.m2407a(-3, handler);
                }
            }
        }
        if (mo2362a != null) {
            f2551b.m2638b(m2379c(resources, i, i2), mo2362a);
        }
        return mo2362a;
    }

    /* renamed from: b */
    public static Typeface m2380b(Context context, Resources resources, int i, String str, int i2) {
        Typeface mo2359d = f2550a.mo2359d(context, resources, i, str, i2);
        if (mo2359d != null) {
            f2551b.m2638b(m2379c(resources, i, i2), mo2359d);
        }
        return mo2359d;
    }

    /* renamed from: c */
    public static String m2379c(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }
}