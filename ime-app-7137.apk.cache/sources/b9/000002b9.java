package p010b.p046j.p058l;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p010b.p046j.AbstractC0462b;
import p010b.p046j.p058l.p059d1.C0577b;
import p010b.p046j.p058l.p059d1.C0580e;
import p010b.p046j.p058l.p059d1.C0584i;

/* renamed from: b.j.l.a */
/* loaded from: classes.dex */
public final class C0565a extends View.AccessibilityDelegate {

    /* renamed from: a */
    public final C0568b f2659a;

    public C0565a(C0568b c0568b) {
        this.f2659a = c0568b;
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2659a.mo1648a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C0584i mo1647b = this.f2659a.mo1647b(view);
        if (mo1647b != null) {
            return (AccessibilityNodeProvider) mo1647b.f2707a;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f2659a.mo794c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        C0580e c0580e = new C0580e(accessibilityNodeInfo);
        AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
        Boolean bool = (Boolean) new C0634y(AbstractC0462b.tag_screen_reader_focusable, Boolean.class, 28).m2328d(view);
        boolean booleanValue = bool == null ? false : bool.booleanValue();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(booleanValue);
        } else {
            c0580e.m2306h(1, booleanValue);
        }
        Boolean bool2 = (Boolean) new C0569b0(AbstractC0462b.tag_accessibility_heading, Boolean.class, 28).m2328d(view);
        boolean booleanValue2 = bool2 == null ? false : bool2.booleanValue();
        if (i2 >= 28) {
            accessibilityNodeInfo.setHeading(booleanValue2);
        } else {
            c0580e.m2306h(2, booleanValue2);
        }
        CharSequence m2248j = AbstractC0605j0.m2248j(view);
        if (i2 >= 28) {
            accessibilityNodeInfo.setPaneTitle(m2248j);
        } else if (i2 >= 19) {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", m2248j);
        }
        CharSequence charSequence = (CharSequence) new C0566a0(AbstractC0462b.tag_state_description, CharSequence.class, 64, 30).m2328d(view);
        if (i2 >= 30) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        } else if (i2 >= 19) {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f2659a.mo534d(view, c0580e);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i2 >= 19 && i2 < 26) {
            if (i2 >= 19) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            }
            SparseArray sparseArray = (SparseArray) view.getTag(AbstractC0462b.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                    if (((WeakReference) sparseArray.valueAt(i3)).get() == null) {
                        arrayList.add(Integer.valueOf(i3));
                    }
                }
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    sparseArray.remove(((Integer) arrayList.get(i4)).intValue());
                }
            }
            ClickableSpan[] m2310d = C0580e.m2310d(text);
            if (m2310d != null && m2310d.length > 0) {
                c0580e.m2308f().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", AbstractC0462b.accessibility_action_clickable_span);
                int i5 = AbstractC0462b.tag_accessibility_clickable_spans;
                SparseArray sparseArray2 = (SparseArray) view.getTag(i5);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(i5, sparseArray2);
                }
                for (int i6 = 0; i6 < m2310d.length; i6++) {
                    ClickableSpan clickableSpan = m2310d[i6];
                    int i7 = 0;
                    while (true) {
                        if (i7 >= sparseArray2.size()) {
                            i = C0580e.f2702a;
                            C0580e.f2702a = i + 1;
                            break;
                        } else if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i7)).get())) {
                            i = sparseArray2.keyAt(i7);
                            break;
                        } else {
                            i7++;
                        }
                    }
                    sparseArray2.put(i, new WeakReference(m2310d[i6]));
                    ClickableSpan clickableSpan2 = m2310d[i6];
                    Spanned spanned = (Spanned) text;
                    c0580e.m2312b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    c0580e.m2312b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    c0580e.m2312b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    c0580e.m2312b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                }
            }
        }
        List list = (List) view.getTag(AbstractC0462b.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            c0580e.m2313a((C0577b) list.get(i8));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f2659a.mo687e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2659a.mo1646f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f2659a.mo1219g(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEvent(View view, int i) {
        this.f2659a.mo1645h(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f2659a.mo1644i(view, accessibilityEvent);
    }
}