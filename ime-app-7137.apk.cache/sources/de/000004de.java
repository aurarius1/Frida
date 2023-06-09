package p010b.p091z.p092a;

import android.graphics.Rect;
import android.view.View;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.C0573c1;
import p010b.p046j.p058l.InterfaceC0622s;

/* renamed from: b.z.a.e */
/* loaded from: classes.dex */
public class C1114e implements InterfaceC0622s {

    /* renamed from: a */
    public final Rect f4161a = new Rect();

    /* renamed from: b */
    public final /* synthetic */ AbstractC1123n f4162b;

    public C1114e(AbstractC1123n abstractC1123n) {
        this.f4162b = abstractC1123n;
    }

    @Override // p010b.p046j.p058l.InterfaceC0622s
    /* renamed from: a */
    public C0573c1 mo763a(View view, C0573c1 c0573c1) {
        C0573c1 m2279D = AbstractC0605j0.m2279D(view, c0573c1);
        if (m2279D.m2321f()) {
            return m2279D;
        }
        Rect rect = this.f4161a;
        rect.left = m2279D.m2325b();
        rect.top = m2279D.m2323d();
        rect.right = m2279D.m2324c();
        rect.bottom = m2279D.m2326a();
        int childCount = this.f4162b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0573c1 m2253e = AbstractC0605j0.m2253e(this.f4162b.getChildAt(i), m2279D);
            rect.left = Math.min(m2253e.m2325b(), rect.left);
            rect.top = Math.min(m2253e.m2323d(), rect.top);
            rect.right = Math.min(m2253e.m2324c(), rect.right);
            rect.bottom = Math.min(m2253e.m2326a(), rect.bottom);
        }
        return m2279D.m2320g(rect.left, rect.top, rect.right, rect.bottom);
    }
}