package p093c.p097b.p102d0.p103k;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.anysoftkeyboard.p180ui.settings.BasicAnyActivity;
import com.anysoftkeyboard.p180ui.settings.MainSettingsActivity;
import com.menny.android.anysoftkeyboard.R;
import net.evendanan.chauffeur.lib.TransitionExperience;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p097b.p130z.p132r0.InterfaceC1748t0;
import p204f.p205a.p206a.p207a.p208c.AbstractC2289b;

/* renamed from: c.b.d0.k.e */
/* loaded from: classes.dex */
public class View$OnClickListenerC1198e implements View.OnClickListener {

    /* renamed from: b */
    public final InterfaceC1748t0 f4346b;

    public View$OnClickListenerC1198e(InterfaceC1748t0 interfaceC1748t0) {
        this.f4346b = interfaceC1748t0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC1748t0 interfaceC1748t0;
        int i;
        switch (view.getId()) {
            case R.id.quick_keys_popup_backspace /* 2131296662 */:
                interfaceC1748t0 = this.f4346b;
                i = -5;
                break;
            case R.id.quick_keys_popup_close /* 2131296663 */:
                interfaceC1748t0 = this.f4346b;
                i = -3;
                break;
            case R.id.quick_keys_popup_delete_recently_used_smileys /* 2131296664 */:
                this.f4346b.mo379s(-103, null, 0, null, true);
                interfaceC1748t0 = this.f4346b;
                i = -102;
                break;
            case R.id.quick_keys_popup_quick_keys_insert_media /* 2131296665 */:
                this.f4346b.mo379s(-140, null, 0, null, true);
                return;
            case R.id.quick_keys_popup_quick_keys_settings /* 2131296666 */:
                Context context = view.getContext();
                C1201h c1201h = new C1201h();
                TransitionExperience transitionExperience = AbstractC2289b.f7440a;
                int i2 = BasicAnyActivity.f6601o;
                Intent intent = new Intent(context, MainSettingsActivity.class);
                intent.setAction("FragmentChauffeurActivity_INTENT_FRAGMENT_ACTION");
                intent.putExtra("FragmentChauffeurActivity_KEY_FRAGMENT_CLASS_TO_ADD", C1201h.class);
                Bundle bundle = c1201h.f3236i;
                if (bundle != null) {
                    intent.putExtra("FragmentChauffeurActivity_KEY_FRAGMENT_ARGS_TO_ADD", bundle);
                }
                intent.putExtra("FragmentChauffeurActivity_KEY_FRAGMENT_ANIMATION", transitionExperience);
                intent.setFlags(1350565888);
                view.getContext().startActivity(intent);
                this.f4346b.mo379s(-3, null, 0, null, true);
                return;
            default:
                StringBuilder m1187i = AbstractC1124a.m1187i("Failed to handle view id ");
                m1187i.append(view.getId());
                m1187i.append(" in FrameKeyboardViewClickListener");
                throw new IllegalArgumentException(m1187i.toString());
        }
        interfaceC1748t0.mo379s(i, null, 0, null, true);
    }
}