package p010b.p086w;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: b.w.x0 */
/* loaded from: classes.dex */
public abstract class AbstractC1081x0 {

    /* renamed from: a */
    public C1079w0 f4048a;

    public AbstractC1081x0(Context context, ViewGroup viewGroup, View view) {
        this.f4048a = new C1079w0(context, viewGroup, view, this);
    }

    /* renamed from: c */
    public static AbstractC1081x0 m1251c(View view) {
        ViewGroup viewGroup;
        View view2 = view;
        while (true) {
            if (view2 == null) {
                viewGroup = null;
                break;
            } else if (view2.getId() == 16908290 && (view2 instanceof ViewGroup)) {
                viewGroup = (ViewGroup) view2;
                break;
            } else if (view2.getParent() instanceof ViewGroup) {
                view2 = (ViewGroup) view2.getParent();
            }
        }
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof C1079w0) {
                    return ((C1079w0) childAt).f4046e;
                }
            }
            return new C1067q0(viewGroup.getContext(), viewGroup, view);
        }
        return null;
    }
}