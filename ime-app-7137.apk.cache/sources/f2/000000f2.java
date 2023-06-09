package p010b.p016c.p017k;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: b.c.k.k0 */
/* loaded from: classes.dex */
public abstract class AbstractC0110k0 {

    /* renamed from: a */
    public BroadcastReceiver f934a;

    /* renamed from: b */
    public final /* synthetic */ LayoutInflater$Factory2C0120p0 f935b;

    public AbstractC0110k0(LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0) {
        this.f935b = layoutInflater$Factory2C0120p0;
    }

    /* renamed from: a */
    public void m3075a() {
        BroadcastReceiver broadcastReceiver = this.f934a;
        if (broadcastReceiver != null) {
            try {
                this.f935b.f1069l.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.f934a = null;
        }
    }

    /* renamed from: b */
    public abstract IntentFilter mo3073b();

    /* renamed from: c */
    public abstract int mo3072c();

    /* renamed from: d */
    public abstract void mo3071d();

    /* renamed from: e */
    public void m3074e() {
        m3075a();
        IntentFilter mo3073b = mo3073b();
        if (mo3073b == null || mo3073b.countActions() == 0) {
            return;
        }
        if (this.f934a == null) {
            this.f934a = new C0108j0(this);
        }
        this.f935b.f1069l.registerReceiver(this.f934a, mo3073b);
    }
}