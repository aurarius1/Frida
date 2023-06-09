package p010b.p082t;

import android.widget.SeekBar;
import androidx.preference.SeekBarPreference;

/* renamed from: b.t.u0 */
/* loaded from: classes.dex */
public class C0899u0 implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: b */
    public final /* synthetic */ SeekBarPreference f3507b;

    public C0899u0(SeekBarPreference seekBarPreference) {
        this.f3507b = seekBarPreference;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            SeekBarPreference seekBarPreference = this.f3507b;
            if (seekBarPreference.f653Y || !seekBarPreference.f648T) {
                seekBarPreference.m3259N(seekBar);
                return;
            }
        }
        SeekBarPreference seekBarPreference2 = this.f3507b;
        seekBarPreference2.m3258O(i + seekBarPreference2.f645Q);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        this.f3507b.f648T = true;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        this.f3507b.f648T = false;
        int progress = seekBar.getProgress();
        SeekBarPreference seekBarPreference = this.f3507b;
        if (progress + seekBarPreference.f645Q != seekBarPreference.f644P) {
            seekBarPreference.m3259N(seekBar);
        }
    }
}