package p010b.p086w;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import p010b.p046j.p058l.AbstractC0605j0;

/* renamed from: b.w.q0 */
/* loaded from: classes.dex */
public class C1067q0 extends AbstractC1081x0 implements InterfaceC1071s0 {
    public C1067q0(Context context, ViewGroup viewGroup, View view) {
        super(context, viewGroup, view);
    }

    @Override // p010b.p086w.InterfaceC1071s0
    /* renamed from: a */
    public void mo1324a(View view) {
        C1079w0 c1079w0 = this.f4048a;
        if (!c1079w0.f4047f) {
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != c1079w0.f4043b && viewGroup.getParent() != null && AbstractC0605j0.m2233y(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    c1079w0.f4043b.getLocationOnScreen(iArr2);
                    AbstractC0605j0.m2281B(view, iArr[0] - iArr2[0]);
                    AbstractC0605j0.m2280C(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            c1079w0.addView(view);
            return;
        }
        throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
    }

    @Override // p010b.p086w.InterfaceC1071s0
    /* renamed from: b */
    public void mo1323b(View view) {
        C1079w0 c1079w0 = this.f4048a;
        c1079w0.removeView(view);
        c1079w0.m1252a();
    }
}