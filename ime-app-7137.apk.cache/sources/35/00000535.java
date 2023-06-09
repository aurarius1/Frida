package p093c.p097b.p102d0.p103k;

import android.os.Bundle;
import com.anysoftkeyboard.keyboards.views.DemoAnyKeyboardView;
import com.anysoftkeyboard.p180ui.settings.BasicAnyActivity;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import p010b.p067m.p068d.AbstractActivityC0681d0;
import p093c.p097b.p102d0.C1188e;
import p093c.p097b.p108i0.p110p.AbstractC1268b1;
import p093c.p097b.p108i0.p110p.C1380w1;
import p093c.p097b.p116p.AbstractC1427e;
import p093c.p097b.p116p.AbstractC1432j;
import p093c.p097b.p130z.AbstractC1762t;
import p093c.p097b.p130z.C1689p0;
import p093c.p097b.p130z.C1763u;
import p093c.p097b.p130z.Key;
import p204f.p205a.p206a.p207a.p208c.AbstractC2289b;

/* renamed from: c.b.d0.k.h */
/* loaded from: classes.dex */
public class C1201h extends AbstractC1268b1 {

    /* renamed from: i0 */
    public C1197d f4361i0;

    /* renamed from: j0 */
    public C1196c f4362j0;

    public C1201h() {
        super("QuickKey", R.string.quick_text_keys_order, false, false, true, 15);
    }

    @Override // p093c.p097b.p108i0.p110p.AbstractC1268b1
    /* renamed from: Q0 */
    public void mo1121Q0(AbstractC1427e abstractC1427e, DemoAnyKeyboardView demoAnyKeyboardView) {
        AbstractC1762t c1689p0;
        C1188e c1188e = (C1188e) abstractC1427e;
        if (c1188e.m1151f()) {
            c1689p0 = new C1763u(c1188e, m1866k(), c1188e.f4322k, demoAnyKeyboardView.getThemedKeyboardDimens(), c1188e.f4706b, this.f4361i0.m1148a(), this.f4362j0.m1149a());
        } else {
            c1689p0 = new C1689p0(c1188e, m1866k(), demoAnyKeyboardView.getThemedKeyboardDimens(), c1188e.mo1155b(), c1188e.mo1154c(), c1188e.f4706b);
        }
        c1689p0.mo837i(demoAnyKeyboardView.getThemedKeyboardDimens());
        demoAnyKeyboardView.m416C(c1689p0, null, null);
        int mo862e = demoAnyKeyboardView.getThemedKeyboardDimens().mo862e();
        if (c1689p0.mo831g() > mo862e) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            for (Key key : c1689p0.f5147q) {
                key.y = i;
                int i4 = key.x - i2;
                key.x = i4;
                if (key.width + i4 > mo862e) {
                    if (i3 >= 2) {
                        break;
                    }
                    i3++;
                    i += key.height;
                    i2 += i4;
                    key.y = i;
                    key.x = 0;
                }
            }
            c1689p0.m923k();
        }
    }

    @Override // p093c.p097b.p108i0.p110p.AbstractC1268b1
    /* renamed from: R0 */
    public AbstractC1432j mo1120R0() {
        return AnyApplication.m189m(m1866k());
    }

    @Override // p093c.p097b.p108i0.p110p.AbstractC1268b1
    /* renamed from: S0 */
    public String mo1119S0() {
        return "quick key";
    }

    @Override // p093c.p097b.p108i0.p110p.AbstractC1268b1, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: T */
    public void mo523T(Bundle bundle) {
        super.mo523T(bundle);
        this.f4361i0 = new C1197d(AnyApplication.m182t(m1911B0()));
        this.f4362j0 = new C1196c(AnyApplication.m182t(m1911B0()));
    }

    @Override // p093c.p097b.p108i0.p110p.AbstractC1268b1
    /* renamed from: T0 */
    public int mo1118T0() {
        return R.string.search_market_for_quick_key_addons;
    }

    @Override // p093c.p097b.p108i0.p110p.AbstractC1268b1
    /* renamed from: U0 */
    public void mo1117U0() {
        AbstractActivityC0681d0 m1872h = m1872h();
        if (m1872h == null || !(m1872h instanceof BasicAnyActivity)) {
            return;
        }
        ((BasicAnyActivity) m1872h).m374t(new C1380w1(), AbstractC2289b.f7441b);
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: Y */
    public void mo1098Y() {
        this.f3214G = true;
        this.f4361i0.f4343b.mo35e();
        this.f4362j0.f4340b.mo35e();
    }
}