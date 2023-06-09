package p010b.p082t;

import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

/* renamed from: b.t.v0 */
/* loaded from: classes.dex */
public class View$OnKeyListenerC0901v0 implements View.OnKeyListener {

    /* renamed from: b */
    public final /* synthetic */ SeekBarPreference f3509b;

    public View$OnKeyListenerC0901v0(SeekBarPreference seekBarPreference) {
        this.f3509b = seekBarPreference;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        SeekBar seekBar;
        if (keyEvent.getAction() != 0) {
            return false;
        }
        SeekBarPreference seekBarPreference = this.f3509b;
        if ((!seekBarPreference.f651W && (i == 21 || i == 22)) || i == 23 || i == 66 || (seekBar = seekBarPreference.f649U) == null) {
            return false;
        }
        return seekBar.onKeyDown(i, keyEvent);
    }
}