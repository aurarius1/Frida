package p010b.p083u.p084e;

import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: b.u.e.b2 */
/* loaded from: classes.dex */
public class C0921b2 {

    /* renamed from: a */
    public int f3539a;

    /* renamed from: b */
    public int f3540b;

    /* renamed from: d */
    public int f3542d = -1;

    /* renamed from: f */
    public boolean f3544f = false;

    /* renamed from: g */
    public int f3545g = 0;

    /* renamed from: c */
    public int f3541c = Integer.MIN_VALUE;

    /* renamed from: e */
    public Interpolator f3543e = null;

    public C0921b2(int i, int i2) {
        this.f3539a = i;
        this.f3540b = i2;
    }

    /* renamed from: a */
    public void m1716a(RecyclerView recyclerView) {
        int i = this.f3542d;
        if (i >= 0) {
            this.f3542d = -1;
            recyclerView.m3183Q(i);
            this.f3544f = false;
        } else if (this.f3544f) {
            Interpolator interpolator = this.f3543e;
            if (interpolator != null && this.f3541c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i2 = this.f3541c;
            if (i2 >= 1) {
                recyclerView.f764p0.m1674b(this.f3539a, this.f3540b, i2, interpolator);
                this.f3545g++;
                this.f3544f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else {
            this.f3545g = 0;
        }
    }

    /* renamed from: b */
    public void m1715b(int i, int i2, int i3, Interpolator interpolator) {
        this.f3539a = i;
        this.f3540b = i2;
        this.f3541c = i3;
        this.f3543e = interpolator;
        this.f3544f = true;
    }
}