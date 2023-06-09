package p010b.p046j.p055i;

import java.util.concurrent.ThreadFactory;

/* renamed from: b.j.i.p */
/* loaded from: classes.dex */
public class ThreadFactoryC0546p implements ThreadFactory {

    /* renamed from: b */
    public String f2620b;

    /* renamed from: c */
    public int f2621c;

    public ThreadFactoryC0546p(String str, int i) {
        this.f2620b = str;
        this.f2621c = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new C0545o(runnable, this.f2620b, this.f2621c);
    }
}