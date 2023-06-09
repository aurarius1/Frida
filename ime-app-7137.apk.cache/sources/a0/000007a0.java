package p093c.p145g.p146a.p147a.p149b0;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;
import p010b.p086w.AbstractC1034e0;
import p010b.p086w.C1063o0;

/* renamed from: c.g.a.a.b0.p */
/* loaded from: classes.dex */
public class C1820p extends AbstractC1034e0 {
    /* renamed from: H */
    public final void m771H(C1063o0 c1063o0) {
        View view = c1063o0.f4014b;
        if (view instanceof TextView) {
            c1063o0.f4013a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // p010b.p086w.AbstractC1034e0
    /* renamed from: d */
    public void mo770d(C1063o0 c1063o0) {
        m771H(c1063o0);
    }

    @Override // p010b.p086w.AbstractC1034e0
    /* renamed from: g */
    public void mo769g(C1063o0 c1063o0) {
        m771H(c1063o0);
    }

    @Override // p010b.p086w.AbstractC1034e0
    /* renamed from: k */
    public Animator mo768k(ViewGroup viewGroup, C1063o0 c1063o0, C1063o0 c1063o02) {
        if (c1063o0 == null || c1063o02 == null || !(c1063o0.f4014b instanceof TextView)) {
            return null;
        }
        View view = c1063o02.f4014b;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            Map map = c1063o0.f4013a;
            Map map2 = c1063o02.f4013a;
            float floatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
            float floatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
            if (floatValue == floatValue2) {
                return null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
            ofFloat.addUpdateListener(new C1819o(this, textView));
            return ofFloat;
        }
        return null;
    }
}