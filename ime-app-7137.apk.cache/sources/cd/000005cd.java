package p093c.p097b.p108i0.p110p;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.anysoftkeyboard.p180ui.settings.BasicAnyActivity;
import com.menny.android.anysoftkeyboard.R;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p204f.p205a.p206a.p207a.p208c.AbstractC2289b;

/* renamed from: c.b.i0.p.n1 */
/* loaded from: classes.dex */
public class View$OnClickListenerC1353n1 extends AbstractComponentCallbacksC0763z implements View.OnClickListener {
    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: X */
    public View mo522X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.language_root_settings, viewGroup, false);
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: o0 */
    public void mo527o0() {
        this.f3214G = true;
        m1872h().setTitle(R.string.language_root_tile);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractComponentCallbacksC0763z c1320c1;
        switch (view.getId()) {
            case R.id.settings_tile_even_more /* 2131296714 */:
                c1320c1 = new C1320c1();
                break;
            case R.id.settings_tile_grammar /* 2131296715 */:
                c1320c1 = new C1335h1();
                break;
            case R.id.settings_tile_keyboards /* 2131296716 */:
                c1320c1 = new C1344k1();
                break;
            default:
                StringBuilder m1187i = AbstractC1124a.m1187i("Failed to handle ");
                m1187i.append(view.getId());
                m1187i.append(" in LanguageSettingsFragment");
                throw new IllegalArgumentException(m1187i.toString());
        }
        ((BasicAnyActivity) m1872h()).m374t(c1320c1, AbstractC2289b.f7441b);
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: q0 */
    public void mo1080q0(View view, Bundle bundle) {
        view.findViewById(R.id.settings_tile_keyboards).setOnClickListener(this);
        view.findViewById(R.id.settings_tile_grammar).setOnClickListener(this);
        view.findViewById(R.id.settings_tile_even_more).setOnClickListener(this);
    }
}