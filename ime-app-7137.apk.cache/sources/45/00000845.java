package p093c.p145g.p146a.p147a.p167s;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p064l.p066b.C0664i;

/* renamed from: c.g.a.a.s.h */
/* loaded from: classes.dex */
public class RunnableC1985h implements Runnable {

    /* renamed from: b */
    public final View f6010b;

    /* renamed from: c */
    public boolean f6011c;

    /* renamed from: d */
    public int f6012d;

    /* renamed from: e */
    public final /* synthetic */ BottomSheetBehavior f6013e;

    public RunnableC1985h(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f6013e = bottomSheetBehavior;
        this.f6010b = view;
        this.f6012d = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0664i c0664i = this.f6013e.f6690A;
        if (c0664i == null || !c0664i.m2136i(true)) {
            this.f6013e.m339K(this.f6012d);
        } else {
            AbstractC0605j0.m2276G(this.f6010b, this);
        }
        this.f6011c = false;
    }
}