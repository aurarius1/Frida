package p010b.p083u.p084e;

import android.view.View;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.u.e.n0 */
/* loaded from: classes.dex */
public class C0967n0 {

    /* renamed from: a */
    public AbstractC0999v0 f3728a;

    /* renamed from: b */
    public int f3729b;

    /* renamed from: c */
    public int f3730c;

    /* renamed from: d */
    public boolean f3731d;

    /* renamed from: e */
    public boolean f3732e;

    public C0967n0() {
        m1612d();
    }

    /* renamed from: a */
    public void m1615a() {
        this.f3730c = this.f3731d ? this.f3728a.mo1440g() : this.f3728a.mo1436k();
    }

    /* renamed from: b */
    public void m1614b(View view, int i) {
        if (this.f3731d) {
            this.f3730c = this.f3728a.m1434m() + this.f3728a.mo1445b(view);
        } else {
            this.f3730c = this.f3728a.mo1442e(view);
        }
        this.f3729b = i;
    }

    /* renamed from: c */
    public void m1613c(View view, int i) {
        int min;
        int m1434m = this.f3728a.m1434m();
        if (m1434m >= 0) {
            m1614b(view, i);
            return;
        }
        this.f3729b = i;
        if (this.f3731d) {
            int mo1440g = (this.f3728a.mo1440g() - m1434m) - this.f3728a.mo1445b(view);
            this.f3730c = this.f3728a.mo1440g() - mo1440g;
            if (mo1440g <= 0) {
                return;
            }
            int mo1444c = this.f3730c - this.f3728a.mo1444c(view);
            int mo1436k = this.f3728a.mo1436k();
            int min2 = mo1444c - (Math.min(this.f3728a.mo1442e(view) - mo1436k, 0) + mo1436k);
            if (min2 >= 0) {
                return;
            }
            min = Math.min(mo1440g, -min2) + this.f3730c;
        } else {
            int mo1442e = this.f3728a.mo1442e(view);
            int mo1436k2 = mo1442e - this.f3728a.mo1436k();
            this.f3730c = mo1442e;
            if (mo1436k2 <= 0) {
                return;
            }
            int mo1440g2 = (this.f3728a.mo1440g() - Math.min(0, (this.f3728a.mo1440g() - m1434m) - this.f3728a.mo1445b(view))) - (this.f3728a.mo1444c(view) + mo1442e);
            if (mo1440g2 >= 0) {
                return;
            }
            min = this.f3730c - Math.min(mo1436k2, -mo1440g2);
        }
        this.f3730c = min;
    }

    /* renamed from: d */
    public void m1612d() {
        this.f3729b = -1;
        this.f3730c = Integer.MIN_VALUE;
        this.f3731d = false;
        this.f3732e = false;
    }

    public String toString() {
        StringBuilder m1187i = AbstractC1124a.m1187i("AnchorInfo{mPosition=");
        m1187i.append(this.f3729b);
        m1187i.append(", mCoordinate=");
        m1187i.append(this.f3730c);
        m1187i.append(", mLayoutFromEnd=");
        m1187i.append(this.f3731d);
        m1187i.append(", mValid=");
        m1187i.append(this.f3732e);
        m1187i.append('}');
        return m1187i.toString();
    }
}