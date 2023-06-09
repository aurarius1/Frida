package p010b.p046j.p055i;

import android.os.Process;

/* renamed from: b.j.i.o */
/* loaded from: classes.dex */
public class C0545o extends Thread {

    /* renamed from: b */
    public final int f2619b;

    public C0545o(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.f2619b = i;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(this.f2619b);
        super.run();
    }
}