package p010b.p016c.p017k;

import android.view.View;

/* renamed from: b.c.k.h */
/* loaded from: classes.dex */
public class RunnableC0103h implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ View f919b;

    /* renamed from: c */
    public final /* synthetic */ View f920c;

    /* renamed from: d */
    public final /* synthetic */ C0117o f921d;

    public RunnableC0103h(C0117o c0117o, View view, View view2) {
        this.f921d = c0117o;
        this.f919b = view;
        this.f920c = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0117o.m3067c(this.f921d.f1005g, this.f919b, this.f920c);
    }
}