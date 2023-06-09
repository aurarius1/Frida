package p010b.p016c.p024p;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p010b.p046j.p058l.AbstractC0619q0;
import p010b.p046j.p058l.C0615o0;
import p010b.p046j.p058l.InterfaceC0617p0;

/* renamed from: b.c.p.l */
/* loaded from: classes.dex */
public class C0171l {

    /* renamed from: c */
    public Interpolator f1257c;

    /* renamed from: d */
    public InterfaceC0617p0 f1258d;

    /* renamed from: e */
    public boolean f1259e;

    /* renamed from: b */
    public long f1256b = -1;

    /* renamed from: f */
    public final AbstractC0619q0 f1260f = new C0170k(this);

    /* renamed from: a */
    public final ArrayList f1255a = new ArrayList();

    /* renamed from: a */
    public void m2954a() {
        if (this.f1259e) {
            Iterator it = this.f1255a.iterator();
            while (it.hasNext()) {
                ((C0615o0) it.next()).m2210b();
            }
            this.f1259e = false;
        }
    }

    /* renamed from: b */
    public void m2953b() {
        View view;
        if (this.f1259e) {
            return;
        }
        Iterator it = this.f1255a.iterator();
        while (it.hasNext()) {
            C0615o0 c0615o0 = (C0615o0) it.next();
            long j = this.f1256b;
            if (j >= 0) {
                c0615o0.m2209c(j);
            }
            Interpolator interpolator = this.f1257c;
            if (interpolator != null && (view = (View) c0615o0.f2776a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f1258d != null) {
                c0615o0.m2208d(this.f1260f);
            }
            View view2 = (View) c0615o0.f2776a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f1259e = true;
    }
}