package p093c.p097b.p108i0.p110p.p113z1;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import com.menny.android.anysoftkeyboard.R;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;
import p010b.p086w.AbstractC1077v0;

/* renamed from: c.b.i0.p.z1.g */
/* loaded from: classes.dex */
public abstract class AbstractC1395g extends AbstractComponentCallbacksC0763z {

    /* renamed from: W */
    public ImageView f4629W;

    /* renamed from: Q0 */
    public abstract int mo1084Q0();

    /* renamed from: R0 */
    public abstract boolean mo1083R0(Context context);

    /* renamed from: S0 */
    public void mo1082S0() {
    }

    /* renamed from: T0 */
    public void m1102T0() {
        mo1082S0();
        AbstractComponentCallbacksC0763z m2087J = m1872h().m2102l().m2087J(R.id.main_ui_content);
        if (m2087J == null || !(m2087J instanceof C1391c)) {
            return;
        }
        ((C1391c) m2087J).m1105Q0();
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: X */
    public final View mo522X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        NestedScrollView nestedScrollView = (NestedScrollView) layoutInflater.inflate(R.layout.keyboard_setup_wizard_page_base_layout, viewGroup, false);
        nestedScrollView.addView(layoutInflater.inflate(mo1084Q0(), (ViewGroup) nestedScrollView, false));
        return nestedScrollView;
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: l0 */
    public void mo1101l0(int i, String[] strArr, int[] iArr) {
        AbstractC1077v0.m1293K(i, strArr, iArr, this);
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: o0 */
    public void mo527o0() {
        this.f3214G = true;
        mo1082S0();
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: q0 */
    public void mo1080q0(View view, Bundle bundle) {
        this.f4629W = (ImageView) view.findViewById(R.id.step_state_icon);
    }
}