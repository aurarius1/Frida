package p093c.p097b.p121t;

import android.annotation.TargetApi;
import android.os.VibrationEffect;
import android.os.Vibrator;

@TargetApi(29)
/* renamed from: c.b.t.p */
/* loaded from: classes.dex */
public class C1459p extends C1458o {

    /* renamed from: g */
    public boolean f4758g;

    public C1459p(Vibrator vibrator) {
        super(vibrator);
    }

    @Override // p093c.p097b.p121t.C1458o, p093c.p097b.p121t.C1457n
    /* renamed from: a */
    public void mo1020a(int i) {
        this.f4754c = i;
        if (this.f4758g) {
            return;
        }
        this.f4756e = i > 0 ? VibrationEffect.createOneShot(i, -1) : null;
    }

    @Override // p093c.p097b.p121t.C1458o, p093c.p097b.p121t.C1457n
    /* renamed from: b */
    public void mo1019b(int i) {
        this.f4755d = i;
        if (this.f4758g) {
            return;
        }
        this.f4757f = i > 0 ? VibrationEffect.createOneShot(i, -1) : null;
    }

    @Override // p093c.p097b.p121t.C1458o, p093c.p097b.p121t.C1457n
    /* renamed from: c */
    public void mo1018c(boolean z) {
        this.f4758g = z;
        if (z) {
            this.f4756e = VibrationEffect.createPredefined(0);
            this.f4757f = VibrationEffect.createPredefined(5);
            return;
        }
        mo1020a(this.f4754c);
        mo1019b(this.f4755d);
    }
}