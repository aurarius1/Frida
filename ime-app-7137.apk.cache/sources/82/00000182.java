package p010b.p016c.p026q;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: b.c.q.h1 */
/* loaded from: classes.dex */
public class C0254h1 extends C0248g1 {
    @Override // p010b.p016c.p026q.C0248g1, p010b.p016c.p026q.C0260i1
    /* renamed from: a */
    public void mo2816a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // p010b.p016c.p026q.C0260i1
    /* renamed from: b */
    public boolean mo2815b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}