package p010b.p046j.p047d;

import android.content.ComponentName;
import android.content.Context;
import android.os.PowerManager;

/* renamed from: b.j.d.n */
/* loaded from: classes.dex */
public final class C0481n extends AbstractC0486s {

    /* renamed from: b */
    public final PowerManager.WakeLock f2478b;

    /* renamed from: c */
    public final PowerManager.WakeLock f2479c;

    /* renamed from: d */
    public boolean f2480d;

    public C0481n(Context context, ComponentName componentName) {
        super(componentName);
        context.getApplicationContext();
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
        this.f2478b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
        this.f2479c = newWakeLock2;
        newWakeLock2.setReferenceCounted(false);
    }

    @Override // p010b.p046j.p047d.AbstractC0486s
    /* renamed from: a */
    public void mo2422a() {
        synchronized (this) {
            if (this.f2480d) {
                this.f2480d = false;
                this.f2479c.release();
            }
        }
    }

    @Override // p010b.p046j.p047d.AbstractC0486s
    /* renamed from: b */
    public void mo2421b() {
        synchronized (this) {
            if (!this.f2480d) {
                this.f2480d = true;
                this.f2479c.acquire(600000L);
                this.f2478b.release();
            }
        }
    }

    @Override // p010b.p046j.p047d.AbstractC0486s
    /* renamed from: c */
    public void mo2420c() {
        synchronized (this) {
        }
    }
}