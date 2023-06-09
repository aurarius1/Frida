package p093c.p097b.p108i0.p110p;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.anysoftkeyboard.keyboards.views.DemoAnyKeyboardView;
import com.anysoftkeyboard.p180ui.settings.BasicAnyActivity;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p097b.p130z.AbstractC1762t;
import p093c.p097b.p130z.C1671g0;
import p204f.p205a.p206a.p207a.p208c.AbstractC2289b;

/* renamed from: c.b.i0.p.y1 */
/* loaded from: classes.dex */
public class View$OnClickListenerC1386y1 extends AbstractComponentCallbacksC0763z implements View.OnClickListener {

    /* renamed from: W */
    public DemoAnyKeyboardView f4615W;

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: X */
    public View mo522X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.user_interface_root_settings, viewGroup, false);
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: o0 */
    public void mo527o0() {
        this.f3214G = true;
        m1872h().setTitle(R.string.ui_root_tile);
        AbstractC1762t m922b = ((C1671g0) AnyApplication.m191k(m1866k()).m1058f()).m922b(1);
        m922b.mo837i(this.f4615W.getThemedKeyboardDimens());
        this.f4615W.m416C(m922b, null, null);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractComponentCallbacksC0763z c1338i1;
        switch (view.getId()) {
            case R.id.settings_tile_effects /* 2131296713 */:
                c1338i1 = new C1338i1();
                break;
            case R.id.settings_tile_even_more /* 2131296714 */:
                c1338i1 = new C1332g1();
                break;
            case R.id.settings_tile_grammar /* 2131296715 */:
            case R.id.settings_tile_keyboards /* 2131296716 */:
            default:
                StringBuilder m1187i = AbstractC1124a.m1187i("Failed to handle ");
                m1187i.append(view.getId());
                m1187i.append(" in UserInterfaceSettingsFragment");
                throw new IllegalArgumentException(m1187i.toString());
            case R.id.settings_tile_themes /* 2131296717 */:
                c1338i1 = new C1347l1();
                break;
        }
        ((BasicAnyActivity) m1872h()).m374t(c1338i1, AbstractC2289b.f7441b);
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: q0 */
    public void mo1080q0(View view, Bundle bundle) {
        view.findViewById(R.id.settings_tile_themes).setOnClickListener(this);
        view.findViewById(R.id.settings_tile_effects).setOnClickListener(this);
        view.findViewById(R.id.settings_tile_even_more).setOnClickListener(this);
        this.f4615W = (DemoAnyKeyboardView) view.findViewById(R.id.demo_keyboard_view);
        if (m1843z().getConfiguration().orientation == 2) {
            view.findViewById(R.id.demo_keyboard_view_background).setVisibility(8);
        }
    }
}