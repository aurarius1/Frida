package p093c.p145g.p146a.p147a.p162n;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p010b.p044i.p045d.AbstractC0452b;

/* renamed from: c.g.a.a.n.d */
/* loaded from: classes.dex */
public abstract class AbstractC1954d extends AbstractC0452b {

    /* renamed from: a */
    public C1955e f5913a;

    /* renamed from: b */
    public int f5914b;

    public AbstractC1954d() {
        this.f5914b = 0;
    }

    public AbstractC1954d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5914b = 0;
    }

    /* renamed from: B */
    public int m668B() {
        C1955e c1955e = this.f5913a;
        if (c1955e != null) {
            return c1955e.f5918d;
        }
        return 0;
    }

    /* renamed from: C */
    public void mo356C(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.m3352q(view, i);
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: k */
    public boolean mo221k(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo356C(coordinatorLayout, view, i);
        if (this.f5913a == null) {
            this.f5913a = new C1955e(view);
        }
        C1955e c1955e = this.f5913a;
        c1955e.f5916b = c1955e.f5915a.getTop();
        c1955e.f5917c = c1955e.f5915a.getLeft();
        this.f5913a.m667a();
        int i2 = this.f5914b;
        if (i2 != 0) {
            C1955e c1955e2 = this.f5913a;
            if (c1955e2.f5918d != i2) {
                c1955e2.f5918d = i2;
                c1955e2.m667a();
            }
            this.f5914b = 0;
            return true;
        }
        return true;
    }
}