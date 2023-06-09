package p010b.p016c.p017k;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;

/* renamed from: b.c.k.i0 */
/* loaded from: classes.dex */
public class C0106i0 extends AbstractC0110k0 {

    /* renamed from: c */
    public final PowerManager f926c;

    /* renamed from: d */
    public final /* synthetic */ LayoutInflater$Factory2C0120p0 f927d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0106i0(LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0, Context context) {
        super(layoutInflater$Factory2C0120p0);
        this.f927d = layoutInflater$Factory2C0120p0;
        this.f926c = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // p010b.p016c.p017k.AbstractC0110k0
    /* renamed from: b */
    public IntentFilter mo3073b() {
        if (Build.VERSION.SDK_INT >= 21) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }
        return null;
    }

    @Override // p010b.p016c.p017k.AbstractC0110k0
    /* renamed from: c */
    public int mo3072c() {
        return (Build.VERSION.SDK_INT < 21 || !this.f926c.isPowerSaveMode()) ? 1 : 2;
    }

    @Override // p010b.p016c.p017k.AbstractC0110k0
    /* renamed from: d */
    public void mo3071d() {
        this.f927d.mo3015d();
    }
}