package p010b.p027d.p028a.p029a;

import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: b.d.a.a.c */
/* loaded from: classes.dex */
public class C0350c extends AbstractC0351d {

    /* renamed from: a */
    public final Object f1843a = new Object();

    /* renamed from: b */
    public final ExecutorService f1844b = Executors.newFixedThreadPool(4, new ThreadFactoryC0349b(this));

    @Override // p010b.p027d.p028a.p029a.AbstractC0351d
    /* renamed from: a */
    public boolean mo2694a() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}