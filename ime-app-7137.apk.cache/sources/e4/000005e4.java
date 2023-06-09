package p093c.p097b.p108i0.p110p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.anysoftkeyboard.p180ui.settings.BasicAnyActivity;
import com.menny.android.anysoftkeyboard.R;
import java.util.Calendar;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p204f.p205a.p206a.p207a.p208c.AbstractC2289b;

/* renamed from: c.b.i0.p.v0 */
/* loaded from: classes.dex */
public class View$OnClickListenerC1376v0 extends AbstractComponentCallbacksC0763z implements View.OnClickListener {
    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: X */
    public View mo522X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.about_anysoftkeyboard, viewGroup, false);
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: o0 */
    public void mo527o0() {
        this.f3214G = true;
        m1872h().setTitle(R.string.ime_name);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.about_legal_stuff_link /* 2131296275 */:
                ((BasicAnyActivity) m1872h()).m374t(new C1373u0(), AbstractC2289b.f7441b);
                return;
            case R.id.about_privacy_link /* 2131296277 */:
                intent = new Intent("android.intent.action.VIEW", Uri.parse(m1908D(R.string.privacy_policy)));
                break;
            case R.id.about_web_site_link /* 2131296278 */:
                intent = new Intent("android.intent.action.VIEW", Uri.parse(m1908D(R.string.main_site_url)));
                break;
            case R.id.rate_app_in_store /* 2131296671 */:
                m1887O0(new Intent("android.intent.action.VIEW", Uri.parse(m1906E(R.string.rate_app_in_store_url, "com.menny.android.anysoftkeyboard"))));
                return;
            case R.id.share_app_details /* 2131296720 */:
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType("text/plain");
                intent2.putExtra("android.intent.extra.SUBJECT", m1908D(R.string.app_share_title));
                intent2.putExtra("android.intent.extra.TEXT", m1908D(R.string.app_share_text));
                m1887O0(Intent.createChooser(intent2, m1908D(R.string.app_share_menu_title)));
                return;
            default:
                StringBuilder m1187i = AbstractC1124a.m1187i("Failed to handle ");
                m1187i.append(view.getId());
                m1187i.append(" in AboutAnySoftKeyboardFragment");
                throw new IllegalArgumentException(m1187i.toString());
        }
        m1887O0(intent);
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: q0 */
    public void mo1080q0(View view, Bundle bundle) {
        ((TextView) view.findViewById(R.id.about_copyright)).setText(m1906E(R.string.about_copyright_text, Integer.valueOf(Calendar.getInstance().get(1))));
        ((TextView) view.findViewById(R.id.about_app_version)).setText(m1906E(R.string.version_text, "1.11.177", 7137));
        this.f3216I.findViewById(R.id.about_legal_stuff_link).setOnClickListener(this);
        this.f3216I.findViewById(R.id.about_privacy_link).setOnClickListener(this);
        this.f3216I.findViewById(R.id.about_web_site_link).setOnClickListener(this);
        this.f3216I.findViewById(R.id.share_app_details).setOnClickListener(this);
        this.f3216I.findViewById(R.id.rate_app_in_store).setOnClickListener(this);
    }
}