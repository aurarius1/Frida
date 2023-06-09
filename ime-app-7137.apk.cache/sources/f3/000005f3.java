package p093c.p097b.p108i0.p110p.p113z1;

import android.content.Context;
import android.database.ContentObserver;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;
import p010b.p086w.AbstractC1077v0;
import p010b.p091z.p092a.AbstractC1110a;
import p010b.p091z.p092a.AbstractC1123n;

/* renamed from: c.b.i0.p.z1.c */
/* loaded from: classes.dex */
public class C1391c extends AbstractComponentCallbacksC0763z {

    /* renamed from: X */
    public AbstractC1123n f4622X;

    /* renamed from: Y */
    public Context f4623Y;

    /* renamed from: W */
    public final Handler f4621W = new HandlerC1390b(this);

    /* renamed from: Z */
    public final ContentObserver f4624Z = new C1389a(this, null);

    /* renamed from: a0 */
    public boolean f4625a0 = false;

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: N */
    public void mo1100N(Bundle bundle) {
        this.f3214G = true;
        Context applicationContext = m1872h().getApplicationContext();
        this.f4623Y = applicationContext;
        applicationContext.getContentResolver().registerContentObserver(Settings.Secure.CONTENT_URI, true, this.f4624Z);
    }

    /* renamed from: Q0 */
    public void m1105Q0() {
        AbstractC1110a adapter = this.f4622X.getAdapter();
        synchronized (adapter) {
            DataSetObserver dataSetObserver = adapter.f4159b;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        adapter.f4158a.notifyChanged();
        m1104R0();
    }

    /* renamed from: R0 */
    public final void m1104R0() {
        if (this.f4622X.getAdapter() == null) {
            return;
        }
        C1405q c1405q = (C1405q) this.f4622X.getAdapter();
        int i = 0;
        while (i < c1405q.mo1093c() && ((AbstractC1395g) ((AbstractComponentCallbacksC0763z) c1405q.f4651g.get(i))).mo1083R0(m1872h())) {
            i++;
        }
        this.f4621W.removeMessages(444);
        Handler handler = this.f4621W;
        handler.sendMessageDelayed(handler.obtainMessage(444, i, 0), m1843z().getInteger(17694722));
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: X */
    public View mo522X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.keyboard_setup_wizard_layout, viewGroup, false);
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: Y */
    public void mo1098Y() {
        this.f3214G = true;
        Context context = this.f4623Y;
        if (context != null) {
            context.getContentResolver().unregisterContentObserver(this.f4624Z);
        }
        this.f4623Y = null;
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: m0 */
    public void mo1103m0() {
        this.f3214G = true;
        if (this.f4625a0) {
            m1105Q0();
        } else {
            m1104R0();
        }
        this.f4625a0 = false;
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: p0 */
    public void mo526p0() {
        this.f3214G = true;
        this.f4621W.removeMessages(444);
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: q0 */
    public void mo1080q0(View view, Bundle bundle) {
        C1405q c1405q = new C1405q(m1868j(), !AbstractC1077v0.m1255x(AnyApplication.m191k(m1866k()).m1059e()));
        AbstractC1123n abstractC1123n = (AbstractC1123n) view.findViewById(R.id.wizard_pages_pager);
        this.f4622X = abstractC1123n;
        abstractC1123n.setEnabled(false);
        this.f4622X.setAdapter(c1405q);
    }
}