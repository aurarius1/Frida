package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import p010b.p016c.p017k.C0139z;
import p010b.p016c.p026q.InterfaceC0310s1;
import p010b.p016c.p026q.InterfaceC0315t1;

/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout implements InterfaceC0315t1 {

    /* renamed from: b */
    public InterfaceC0310s1 f255b;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        InterfaceC0310s1 interfaceC0310s1 = this.f255b;
        if (interfaceC0310s1 != null) {
            rect.top = ((C0139z) interfaceC0310s1).f1117a.m3041N(null, rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // p010b.p016c.p026q.InterfaceC0315t1
    public void setOnFitSystemWindowsListener(InterfaceC0310s1 interfaceC0310s1) {
        this.f255b = interfaceC0310s1;
    }
}