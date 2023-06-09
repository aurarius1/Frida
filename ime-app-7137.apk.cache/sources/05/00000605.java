package p093c.p097b.p108i0.p114q;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.anysoftkeyboard.p180ui.settings.MainSettingsActivity;
import com.menny.android.anysoftkeyboard.R;
import p010b.p086w.AbstractC1077v0;

/* renamed from: c.b.i0.q.c */
/* loaded from: classes.dex */
public class C1409c extends AbstractC1412f {
    @Override // p093c.p097b.p108i0.p114q.AbstractC1412f
    /* renamed from: R0 */
    public int mo1078R0() {
        return R.layout.changelog;
    }

    @Override // p093c.p097b.p108i0.p114q.AbstractC1412f
    /* renamed from: S0 */
    public void mo1077S0(TextView textView, String str) {
        textView.setText(m1906E(R.string.change_log_entry_header_template_without_name, str));
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: o0 */
    public void mo527o0() {
        this.f3214G = true;
        MainSettingsActivity.m369y(this, m1908D(R.string.changelog));
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: q0 */
    public void mo1080q0(View view, Bundle bundle) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.change_logs_container);
        recyclerView.setLayoutManager(new LinearLayoutManager(m1872h()));
        recyclerView.setAdapter(new C1408b(this, AbstractC1077v0.m1270i()));
        recyclerView.setHasFixedSize(false);
    }
}