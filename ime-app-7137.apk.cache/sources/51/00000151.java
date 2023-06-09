package p010b.p016c.p024p.p025m;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import p010b.p016c.p024p.InterfaceC0162c;

/* renamed from: b.c.p.m.v */
/* loaded from: classes.dex */
public class C0205v extends FrameLayout implements InterfaceC0162c {

    /* renamed from: b */
    public final CollapsibleActionView f1434b;

    public C0205v(View view) {
        super(view.getContext());
        this.f1434b = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // p010b.p016c.p024p.InterfaceC0162c
    /* renamed from: c */
    public void mo2896c() {
        this.f1434b.onActionViewExpanded();
    }

    @Override // p010b.p016c.p024p.InterfaceC0162c
    /* renamed from: e */
    public void mo2895e() {
        this.f1434b.onActionViewCollapsed();
    }
}