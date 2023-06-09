package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import p010b.p046j.p047d.AbstractC0472e;
import p010b.p046j.p048e.p049b.AbstractC0505k;
import p010b.p046j.p058l.p059d1.C0579d;
import p010b.p046j.p058l.p059d1.C0580e;
import p010b.p082t.AbstractC0883m0;
import p010b.p082t.AbstractC0885n0;
import p010b.p082t.C0881l0;

/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context) {
        this(context, null);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0505k.m2404a(context, AbstractC0883m0.preferenceCategoryStyle, 16842892));
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.preference.Preference
    /* renamed from: J */
    public boolean mo3253J() {
        return !super.mo3272l();
    }

    @Override // androidx.preference.Preference
    /* renamed from: l */
    public boolean mo3272l() {
        return false;
    }

    @Override // androidx.preference.Preference
    /* renamed from: r */
    public void mo0r(C0881l0 c0881l0) {
        TextView textView;
        super.mo0r(c0881l0);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            c0881l0.f3605c.setAccessibilityHeading(true);
        } else if (i < 21) {
            TypedValue typedValue = new TypedValue();
            if (this.f609b.getTheme().resolveAttribute(AbstractC0883m0.colorAccent, typedValue, true) && (textView = (TextView) c0881l0.m1743x(16908310)) != null) {
                if (textView.getCurrentTextColor() != AbstractC0472e.m2431b(this.f609b, AbstractC0885n0.preference_fallback_accent_color)) {
                    return;
                }
                textView.setTextColor(typedValue.data);
            }
        }
    }

    @Override // androidx.preference.Preference
    @Deprecated
    /* renamed from: w */
    public void mo3271w(C0580e c0580e) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            c0580e.getClass();
            C0579d c0579d = (i < 19 || (collectionItemInfo = c0580e.f2703b.getCollectionItemInfo()) == null) ? null : new C0579d(collectionItemInfo);
            if (c0579d == null) {
                return;
            }
            c0580e.m2304j(C0579d.m2314a(i >= 19 ? ((AccessibilityNodeInfo.CollectionItemInfo) c0579d.f2701a).getRowIndex() : 0, i >= 19 ? ((AccessibilityNodeInfo.CollectionItemInfo) c0579d.f2701a).getRowSpan() : 0, i >= 19 ? ((AccessibilityNodeInfo.CollectionItemInfo) c0579d.f2701a).getColumnIndex() : 0, i >= 19 ? ((AccessibilityNodeInfo.CollectionItemInfo) c0579d.f2701a).getColumnSpan() : 0, true, i >= 21 ? ((AccessibilityNodeInfo.CollectionItemInfo) c0579d.f2701a).isSelected() : false));
        }
    }
}