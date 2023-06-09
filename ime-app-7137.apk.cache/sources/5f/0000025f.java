package p010b.p046j.p047d;

import java.lang.reflect.Method;

/* renamed from: b.j.d.h */
/* loaded from: classes.dex */
public class RunnableC0475h implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Object f2462b;

    /* renamed from: c */
    public final /* synthetic */ Object f2463c;

    public RunnableC0475h(Object obj, Object obj2) {
        this.f2462b = obj;
        this.f2463c = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Method method = AbstractC0477j.f2473d;
            if (method != null) {
                method.invoke(this.f2462b, this.f2463c, Boolean.FALSE, "AppCompat recreation");
            } else {
                AbstractC0477j.f2474e.invoke(this.f2462b, this.f2463c, Boolean.FALSE);
            }
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable unused) {
        }
    }
}