package p010b.p046j.p058l;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* renamed from: b.j.l.n0 */
/* loaded from: classes.dex */
public class C0613n0 implements InterfaceC0617p0 {

    /* renamed from: a */
    public C0615o0 f2774a;

    /* renamed from: b */
    public boolean f2775b;

    public C0613n0(C0615o0 c0615o0) {
        this.f2774a = c0615o0;
    }

    @Override // p010b.p046j.p058l.InterfaceC0617p0
    @SuppressLint({"WrongConstant"})
    /* renamed from: a */
    public void mo2203a(View view) {
        int i = this.f2774a.f2777b;
        if (i > -1) {
            view.setLayerType(i, null);
            this.f2774a.f2777b = -1;
        }
        if (Build.VERSION.SDK_INT >= 16 || !this.f2775b) {
            this.f2774a.getClass();
            Object tag = view.getTag(2113929216);
            InterfaceC0617p0 interfaceC0617p0 = tag instanceof InterfaceC0617p0 ? (InterfaceC0617p0) tag : null;
            if (interfaceC0617p0 != null) {
                interfaceC0617p0.mo2203a(view);
            }
            this.f2775b = true;
        }
    }

    @Override // p010b.p046j.p058l.InterfaceC0617p0
    /* renamed from: b */
    public void mo2202b(View view) {
        this.f2775b = false;
        if (this.f2774a.f2777b > -1) {
            view.setLayerType(2, null);
        }
        this.f2774a.getClass();
        Object tag = view.getTag(2113929216);
        InterfaceC0617p0 interfaceC0617p0 = tag instanceof InterfaceC0617p0 ? (InterfaceC0617p0) tag : null;
        if (interfaceC0617p0 != null) {
            interfaceC0617p0.mo2202b(view);
        }
    }

    @Override // p010b.p046j.p058l.InterfaceC0617p0
    /* renamed from: c */
    public void mo2201c(View view) {
        Object tag = view.getTag(2113929216);
        InterfaceC0617p0 interfaceC0617p0 = tag instanceof InterfaceC0617p0 ? (InterfaceC0617p0) tag : null;
        if (interfaceC0617p0 != null) {
            interfaceC0617p0.mo2201c(view);
        }
    }
}