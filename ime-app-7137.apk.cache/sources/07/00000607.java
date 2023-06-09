package p093c.p097b.p108i0.p114q;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.menny.android.anysoftkeyboard.R;
import p093c.p097b.p108i0.p110p.C1365r1;

/* renamed from: c.b.i0.q.e */
/* loaded from: classes.dex */
public class C1411e extends AbstractC1412f {
    @Override // p093c.p097b.p108i0.p114q.AbstractC1412f
    /* renamed from: R0 */
    public int mo1078R0() {
        return R.layout.card_with_more_container;
    }

    @Override // p093c.p097b.p108i0.p114q.AbstractC1412f
    /* renamed from: S0 */
    public void mo1077S0(TextView textView, String str) {
        textView.setText(m1906E(R.string.change_log_card_version_title_template, str));
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: q0 */
    public void mo1080q0(View view, Bundle bundle) {
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.card_with_read_more);
        C1365r1.m1114R0(viewGroup, R.id.read_more_link, new C1410d(this), true);
        View inflate = m1858r().inflate(R.layout.changelogentry_item, viewGroup, false);
        C1407a c1407a = new C1407a(inflate);
        m1079Q0(0, c1407a);
        c1407a.f4654x.setVisibility(8);
        viewGroup.addView(inflate, 0);
    }
}