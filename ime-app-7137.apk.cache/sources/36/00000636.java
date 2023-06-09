package p093c.p097b.p121t;

import android.annotation.TargetApi;
import android.os.VibrationEffect;
import android.os.Vibrator;

@TargetApi(26)
/* renamed from: c.b.t.o */
/* loaded from: classes.dex */
public class C1458o extends C1457n {

    /* renamed from: e */
    public VibrationEffect f4756e;

    /* renamed from: f */
    public VibrationEffect f4757f;

    public C1458o(Vibrator vibrator) {
        super(vibrator);
    }

    @Override // p093c.p097b.p121t.C1457n
    /* renamed from: a */
    public void mo1020a(int i) {
        this.f4754c = i;
        this.f4756e = i > 0 ? VibrationEffect.createOneShot(i, -1) : null;
    }

    @Override // p093c.p097b.p121t.C1457n
    /* renamed from: b */
    public void mo1019b(int i) {
        this.f4755d = i;
        this.f4757f = i > 0 ? VibrationEffect.createOneShot(i, -1) : null;
    }

    @Override // p093c.p097b.p121t.C1457n
    /* renamed from: c */
    public void mo1018c(boolean z) {
    }

    @Override // p093c.p097b.p121t.C1457n
    /* renamed from: d */
    public void mo1021d(boolean z) {
        VibrationEffect vibrationEffect = z ? this.f4757f : this.f4756e;
        if (vibrationEffect != null) {
            boolean z2 = C1457n.f4752a;
            C1457n.f4752a = false;
            if (z2) {
                return;
            }
            this.f4753b.vibrate(vibrationEffect);
        }
    }
}