package p010b.p067m.p068d;

import android.view.View;
import android.view.ViewGroup;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.m.d.r2 */
/* loaded from: classes.dex */
public enum EnumC0739r2 {
    REMOVED,
    VISIBLE,
    GONE,
    INVISIBLE;

    /* renamed from: b */
    public static EnumC0739r2 m1952b(int i) {
        if (i != 0) {
            if (i != 4) {
                if (i == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException(AbstractC1124a.m1193c("Unknown visibility ", i));
            }
            return INVISIBLE;
        }
        return VISIBLE;
    }

    /* renamed from: c */
    public static EnumC0739r2 m1951c(View view) {
        return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : m1952b(view.getVisibility());
    }

    /* renamed from: a */
    public void m1953a(View view) {
        int i;
        int ordinal = ordinal();
        if (ordinal == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (C0690f1.m2078S(2)) {
                    String str = "SpecialEffectsController: Removing view " + view + " from container " + viewGroup;
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (ordinal == 1) {
            if (C0690f1.m2078S(2)) {
                String str2 = "SpecialEffectsController: Setting view " + view + " to VISIBLE";
            }
            i = 0;
        } else if (ordinal == 2) {
            if (C0690f1.m2078S(2)) {
                String str3 = "SpecialEffectsController: Setting view " + view + " to GONE";
            }
            i = 8;
        } else if (ordinal != 3) {
            return;
        } else {
            if (C0690f1.m2078S(2)) {
                String str4 = "SpecialEffectsController: Setting view " + view + " to INVISIBLE";
            }
            i = 4;
        }
        view.setVisibility(i);
    }
}