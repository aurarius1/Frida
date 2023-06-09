package p093c.p097b.p108i0.p110p;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.menny.android.anysoftkeyboard.R;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;

/* renamed from: c.b.i0.p.u0 */
/* loaded from: classes.dex */
public class C1373u0 extends AbstractComponentCallbacksC0763z {
    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: X */
    public View mo522X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.additional_software_licenses, viewGroup, false);
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: o0 */
    public void mo527o0() {
        this.f3214G = true;
        m1872h().setTitle(R.string.about_additional_software_licenses);
    }
}