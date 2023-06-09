package p093c.p097b.p108i0.p110p;

import com.anysoftkeyboard.keyboards.views.DemoAnyKeyboardView;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import p093c.p097b.p116p.AbstractC1432j;
import p093c.p097b.p129y.C1656a;
import p093c.p097b.p130z.AbstractC1762t;

/* renamed from: c.b.i0.p.d1 */
/* loaded from: classes.dex */
public class C1323d1 extends AbstractC1326e1 {
    public C1323d1() {
        super("BottomRowAddOnBrowserFragment", R.string.bottom_generic_row_dialog_title, false);
    }

    @Override // p093c.p097b.p108i0.p110p.AbstractC1268b1
    /* renamed from: R0 */
    public AbstractC1432j mo1120R0() {
        return AnyApplication.m193i(m1866k());
    }

    @Override // p093c.p097b.p108i0.p110p.AbstractC1268b1
    /* renamed from: U0 */
    public void mo1117U0() {
    }

    @Override // p093c.p097b.p108i0.p110p.AbstractC1326e1
    /* renamed from: V0 */
    public void mo1124V0(DemoAnyKeyboardView demoAnyKeyboardView, AbstractC1762t abstractC1762t, C1656a c1656a) {
        abstractC1762t.m834w(demoAnyKeyboardView.getThemedKeyboardDimens(), (C1656a) AnyApplication.m188n(m1866k()).m1058f(), c1656a);
    }
}