package p093c.p097b.p108i0.p110p;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import com.anysoftkeyboard.p180ui.settings.MainSettingsActivity;
import com.menny.android.anysoftkeyboard.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p010b.p016c.p017k.C0119p;
import p010b.p082t.AbstractC0904x;
import p204f.p205a.p209b.C2296g;
import p204f.p205a.p209b.InterfaceC2294e;

/* renamed from: c.b.i0.p.j1 */
/* loaded from: classes.dex */
public class C1341j1 extends AbstractC0904x {

    /* renamed from: e0 */
    public static final /* synthetic */ int f4557e0 = 0;

    /* renamed from: f0 */
    public C2296g f4558f0;

    @Override // p010b.p082t.AbstractC0904x
    /* renamed from: S0 */
    public void mo1107S0(Bundle bundle, String str) {
        m1735Q0(R.xml.prefs_gestures_prefs);
        this.f4558f0 = new C2296g(m1872h(), new InterfaceC2294e() { // from class: c.b.i0.p.i
            @Override // p204f.p205a.p209b.InterfaceC2294e
            /* renamed from: a */
            public final void mo23a(C0119p c0119p, int i, Object obj) {
                C1341j1 c1341j1 = C1341j1.this;
                int i2 = C1341j1.f4557e0;
                c1341j1.getClass();
                c0119p.m3056h(R.string.gesture_typing_alert_title);
                c0119p.m3062b(R.string.gesture_typing_alert_message);
                c0119p.m3058f(R.string.gesture_typing_alert_button, new DialogInterface.OnClickListener() { // from class: c.b.i0.p.h
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        int i4 = C1341j1.f4557e0;
                        dialogInterface.dismiss();
                    }
                });
            }
        });
    }

    /* renamed from: U0 */
    public final List m1122U0() {
        String[] strArr = {"settings_key_swipe_up_action", "settings_key_swipe_down_action", "settings_key_swipe_left_action", "settings_key_swipe_right_action"};
        ArrayList arrayList = new ArrayList(4);
        for (int i = 0; i < 4; i++) {
            arrayList.add(m1734R0(strArr[i]));
        }
        return arrayList;
    }

    @Override // p010b.p082t.AbstractC0904x, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: Z */
    public void mo1096Z() {
        super.mo1096Z();
        m1734R0(m1908D(R.string.settings_key_gesture_typing)).f613f = null;
    }

    @Override // p010b.p082t.AbstractC0904x, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: o0 */
    public void mo527o0() {
        super.mo527o0();
        MainSettingsActivity.m369y(this, m1908D(R.string.unicode_gestures_quick_text_key_name));
        boolean z = ((CheckBoxPreference) m1734R0(m1908D(R.string.settings_key_gesture_typing))).f665P;
        Iterator it = ((ArrayList) m1122U0()).iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).m3291F(!z);
        }
    }

    @Override // p010b.p082t.AbstractC0904x, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: p0 */
    public void mo526p0() {
        super.mo526p0();
        this.f4558f0.m21a();
    }

    @Override // p010b.p082t.AbstractC0904x, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: q0 */
    public void mo1080q0(View view, Bundle bundle) {
        super.mo1080q0(view, bundle);
        m1734R0(m1908D(R.string.settings_key_gesture_typing)).f613f = new C1339j(this);
    }
}