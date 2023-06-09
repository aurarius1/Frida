package p093c.p097b.p121t;

import android.annotation.TargetApi;
import android.os.Vibrator;

@TargetApi(1)
/* renamed from: c.b.t.n */
/* loaded from: classes.dex */
public class C1457n {

    /* renamed from: a */
    public static boolean f4752a = false;

    /* renamed from: b */
    public Vibrator f4753b;

    /* renamed from: c */
    public int f4754c;

    /* renamed from: d */
    public int f4755d;

    public C1457n(Vibrator vibrator) {
        this.f4753b = vibrator;
    }

    /* renamed from: a */
    public void mo1020a(int i) {
        this.f4754c = i;
    }

    /* renamed from: b */
    public void mo1019b(int i) {
        this.f4755d = i;
    }

    /* renamed from: c */
    public void mo1018c(boolean z) {
    }

    /* renamed from: d */
    public void mo1021d(boolean z) {
        int i = z ? this.f4755d : this.f4754c;
        if (i > 0) {
            boolean z2 = f4752a;
            f4752a = false;
            if (z2) {
                return;
            }
            this.f4753b.vibrate(i);
        }
    }
}