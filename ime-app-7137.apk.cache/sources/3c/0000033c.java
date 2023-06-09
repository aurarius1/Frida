package p010b.p067m.p068d;

import android.view.View;
import android.view.ViewGroup;
import p010b.p046j.p054h.InterfaceC0528a;

/* renamed from: b.m.d.h */
/* loaded from: classes.dex */
public class C0696h implements InterfaceC0528a {

    /* renamed from: a */
    public final /* synthetic */ View f3002a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup f3003b;

    /* renamed from: c */
    public final /* synthetic */ C0716m f3004c;

    public C0696h(C0728p c0728p, View view, ViewGroup viewGroup, C0716m c0716m) {
        this.f3002a = view;
        this.f3003b = viewGroup;
        this.f3004c = c0716m;
    }

    @Override // p010b.p046j.p054h.InterfaceC0528a
    /* renamed from: a */
    public void mo1968a() {
        this.f3002a.clearAnimation();
        this.f3003b.endViewTransition(this.f3002a);
        this.f3004c.m1990a();
    }
}