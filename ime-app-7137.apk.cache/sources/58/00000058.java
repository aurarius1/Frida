package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p010b.p016c.p017k.C0139z;
import p010b.p016c.p026q.InterfaceC0310s1;
import p010b.p016c.p026q.InterfaceC0315t1;

/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout implements InterfaceC0315t1 {

    /* renamed from: b */
    public InterfaceC0310s1 f254b;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        InterfaceC0310s1 interfaceC0310s1 = this.f254b;
        if (interfaceC0310s1 != null) {
            rect.top = ((C0139z) interfaceC0310s1).f1117a.m3041N(null, rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // p010b.p016c.p026q.InterfaceC0315t1
    public void setOnFitSystemWindowsListener(InterfaceC0310s1 interfaceC0310s1) {
        this.f254b = interfaceC0310s1;
    }
}