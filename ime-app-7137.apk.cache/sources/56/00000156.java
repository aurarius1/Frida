package p010b.p016c.p026q;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import p010b.p046j.p058l.InterfaceC0617p0;

/* renamed from: b.c.q.a */
/* loaded from: classes.dex */
public class C0210a implements InterfaceC0617p0 {

    /* renamed from: a */
    public boolean f1442a = false;

    /* renamed from: b */
    public int f1443b;

    /* renamed from: c */
    public final /* synthetic */ ActionBarContextView f1444c;

    public C0210a(ActionBarContextView actionBarContextView) {
        this.f1444c = actionBarContextView;
    }

    @Override // p010b.p046j.p058l.InterfaceC0617p0
    /* renamed from: a */
    public void mo2203a(View view) {
        if (this.f1442a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f1444c;
        actionBarContextView.f182g = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f1443b);
    }

    @Override // p010b.p046j.p058l.InterfaceC0617p0
    /* renamed from: b */
    public void mo2202b(View view) {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f1442a = false;
    }

    @Override // p010b.p046j.p058l.InterfaceC0617p0
    /* renamed from: c */
    public void mo2201c(View view) {
        this.f1442a = true;
    }
}