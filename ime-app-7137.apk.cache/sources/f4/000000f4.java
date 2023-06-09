package p010b.p016c.p017k;

import android.content.IntentFilter;
import android.location.Location;
import java.util.Calendar;
import p000a.p001a.p002a.p004b.AbstractC0022t;

/* renamed from: b.c.k.l0 */
/* loaded from: classes.dex */
public class C0112l0 extends AbstractC0110k0 {

    /* renamed from: c */
    public final C0138y0 f960c;

    /* renamed from: d */
    public final /* synthetic */ LayoutInflater$Factory2C0120p0 f961d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0112l0(LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0, C0138y0 c0138y0) {
        super(layoutInflater$Factory2C0120p0);
        this.f961d = layoutInflater$Factory2C0120p0;
        this.f960c = c0138y0;
    }

    @Override // p010b.p016c.p017k.AbstractC0110k0
    /* renamed from: b */
    public IntentFilter mo3073b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fb A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    @Override // p010b.p016c.p017k.AbstractC0110k0
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo3072c() {
        Location location;
        boolean z;
        long j;
        C0138y0 c0138y0 = this.f960c;
        C0136x0 c0136x0 = c0138y0.f1116d;
        if (!(c0136x0.f1111b > System.currentTimeMillis())) {
            Location location2 = null;
            if (AbstractC0022t.m3491i(c0138y0.f1114b, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                if (c0138y0.f1115c.isProviderEnabled("network")) {
                    location = c0138y0.f1115c.getLastKnownLocation("network");
                    if (AbstractC0022t.m3491i(c0138y0.f1114b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (c0138y0.f1115c.isProviderEnabled("gps")) {
                                location2 = c0138y0.f1115c.getLastKnownLocation("gps");
                            }
                        } catch (Exception unused) {
                        }
                    }
                    if (location2 != null || location == null ? location2 != null : location2.getTime() > location.getTime()) {
                        location = location2;
                    }
                    if (location == null) {
                        C0136x0 c0136x02 = c0138y0.f1116d;
                        long currentTimeMillis = System.currentTimeMillis();
                        if (C0134w0.f1105a == null) {
                            C0134w0.f1105a = new C0134w0();
                        }
                        C0134w0 c0134w0 = C0134w0.f1105a;
                        c0134w0.m3002a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        c0134w0.m3002a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        r7 = c0134w0.f1108d == 1;
                        long j2 = c0134w0.f1107c;
                        long j3 = c0134w0.f1106b;
                        c0134w0.m3002a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
                        long j4 = c0134w0.f1107c;
                        if (j2 == -1 || j3 == -1) {
                            j = 43200000 + currentTimeMillis;
                        } else {
                            j = (currentTimeMillis > j3 ? j4 + 0 : currentTimeMillis > j2 ? j3 + 0 : j2 + 0) + 60000;
                        }
                        c0136x02.f1110a = r7;
                        c0136x02.f1111b = j;
                    } else {
                        int i = Calendar.getInstance().get(11);
                        z = (i < 6 || i >= 22) ? true : true;
                        return !z ? 2 : 1;
                    }
                }
            }
            location = null;
            if (AbstractC0022t.m3491i(c0138y0.f1114b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            }
            if (location2 != null) {
            }
            location = location2;
            if (location == null) {
            }
        }
        z = c0136x0.f1110a;
        if (!z) {
        }
    }

    @Override // p010b.p016c.p017k.AbstractC0110k0
    /* renamed from: d */
    public void mo3071d() {
        this.f961d.mo3015d();
    }
}