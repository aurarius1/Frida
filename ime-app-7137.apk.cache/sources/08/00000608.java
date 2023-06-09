package p093c.p097b.p108i0.p114q;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.menny.android.anysoftkeyboard.R;
import java.util.List;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;
import p010b.p086w.AbstractC1077v0;

/* renamed from: c.b.i0.q.f */
/* loaded from: classes.dex */
public abstract class AbstractC1412f extends AbstractComponentCallbacksC0763z {

    /* renamed from: X */
    public final StringBuilder f4659X = new StringBuilder();

    /* renamed from: W */
    public final List f4658W = AbstractC1077v0.m1270i();

    /* renamed from: Q0 */
    public void m1079Q0(int i, C1407a c1407a) {
        String[] strArr;
        C1413g c1413g = (C1413g) this.f4658W.get(i);
        mo1077S0(c1407a.f4652v, c1413g.f4660a);
        this.f4659X.setLength(0);
        for (String str : c1413g.f4661b) {
            if (this.f4659X.length() != 0) {
                this.f4659X.append('\n');
            }
            this.f4659X.append(m1906E(R.string.change_log_bullet_point, str));
        }
        c1407a.f4653w.setText(this.f4659X.toString());
        c1407a.f4654x.setText(m1906E(R.string.change_log_url, c1413g.f4662c.toString()));
    }

    /* renamed from: R0 */
    public abstract int mo1078R0();

    /* renamed from: S0 */
    public abstract void mo1077S0(TextView textView, String str);

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: X */
    public View mo522X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(mo1078R0(), viewGroup, false);
    }
}