package p093c.p145g.p146a.p147a.p160l0;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.transformation.ExpandableBehavior;
import p093c.p145g.p146a.p147a.p174z.InterfaceC2046a;

/* renamed from: c.g.a.a.l0.a */
/* loaded from: classes.dex */
public class ViewTreeObserver$OnPreDrawListenerC1941a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b */
    public final /* synthetic */ View f5882b;

    /* renamed from: c */
    public final /* synthetic */ int f5883c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2046a f5884d;

    /* renamed from: e */
    public final /* synthetic */ ExpandableBehavior f5885e;

    public ViewTreeObserver$OnPreDrawListenerC1941a(ExpandableBehavior expandableBehavior, View view, int i, InterfaceC2046a interfaceC2046a) {
        this.f5885e = expandableBehavior;
        this.f5882b = view;
        this.f5883c = i;
        this.f5884d = interfaceC2046a;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.f5882b.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.f5885e;
        if (expandableBehavior.f6965a == this.f5883c) {
            InterfaceC2046a interfaceC2046a = this.f5884d;
            expandableBehavior.mo205C((View) interfaceC2046a, this.f5882b, interfaceC2046a.m520a(), false);
        }
        return false;
    }
}