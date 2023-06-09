package p093c.p097b.p108i0.p110p;

import com.anysoftkeyboard.keyboards.views.DemoAnyKeyboardView;
import com.menny.android.anysoftkeyboard.AnyApplication;
import p093c.p097b.p116p.AbstractC1427e;
import p093c.p097b.p129y.C1656a;
import p093c.p097b.p130z.AbstractC1762t;
import p093c.p097b.p130z.C1671g0;

/* renamed from: c.b.i0.p.e1 */
/* loaded from: classes.dex */
public abstract class AbstractC1326e1 extends AbstractC1268b1 {
    public AbstractC1326e1(String str, int i, boolean z) {
        super(str, i, true, false, z, 0);
    }

    @Override // p093c.p097b.p108i0.p110p.AbstractC1268b1
    /* renamed from: Q0 */
    public void mo1121Q0(AbstractC1427e abstractC1427e, DemoAnyKeyboardView demoAnyKeyboardView) {
        AbstractC1762t m922b = ((C1671g0) AnyApplication.m191k(m1866k()).m1058f()).m922b(1);
        mo1124V0(demoAnyKeyboardView, m922b, (C1656a) abstractC1427e);
        demoAnyKeyboardView.m416C(m922b, null, null);
    }

    @Override // p093c.p097b.p108i0.p110p.AbstractC1268b1
    /* renamed from: S0 */
    public final String mo1119S0() {
        return null;
    }

    @Override // p093c.p097b.p108i0.p110p.AbstractC1268b1
    /* renamed from: T0 */
    public final int mo1118T0() {
        return 0;
    }

    /* renamed from: V0 */
    public abstract void mo1124V0(DemoAnyKeyboardView demoAnyKeyboardView, AbstractC1762t abstractC1762t, C1656a c1656a);
}