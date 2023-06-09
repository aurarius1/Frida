package p093c.p097b.p108i0.p110p;

import com.anysoftkeyboard.keyboards.views.DemoAnyKeyboardView;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import p093c.p097b.p116p.AbstractC1427e;
import p093c.p097b.p116p.AbstractC1432j;
import p093c.p097b.p130z.AbstractC1762t;
import p093c.p097b.p130z.C1671g0;

/* renamed from: c.b.i0.p.k1 */
/* loaded from: classes.dex */
public class C1344k1 extends AbstractC1268b1 {
    public C1344k1() {
        super("LanguageAddOnBrowserFragment", R.string.keyboards_group, false, false, false, 15);
    }

    @Override // p093c.p097b.p108i0.p110p.AbstractC1268b1
    /* renamed from: Q0 */
    public void mo1121Q0(AbstractC1427e abstractC1427e, DemoAnyKeyboardView demoAnyKeyboardView) {
        AbstractC1762t m922b = ((C1671g0) abstractC1427e).m922b(1);
        m922b.mo837i(demoAnyKeyboardView.getThemedKeyboardDimens());
        demoAnyKeyboardView.m416C(m922b, null, null);
    }

    @Override // p093c.p097b.p108i0.p110p.AbstractC1268b1
    /* renamed from: R0 */
    public AbstractC1432j mo1120R0() {
        return AnyApplication.m191k(m1866k());
    }

    @Override // p093c.p097b.p108i0.p110p.AbstractC1268b1
    /* renamed from: S0 */
    public String mo1119S0() {
        return "language";
    }

    @Override // p093c.p097b.p108i0.p110p.AbstractC1268b1
    /* renamed from: T0 */
    public int mo1118T0() {
        return R.string.search_market_for_keyboard_addons;
    }
}