package p010b.p016c.p026q;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* renamed from: b.c.q.g1 */
/* loaded from: classes.dex */
public class C0248g1 extends C0260i1 {
    @Override // p010b.p016c.p026q.C0260i1
    /* renamed from: a */
    public void mo2816a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) C0265j1.m2805f(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
}