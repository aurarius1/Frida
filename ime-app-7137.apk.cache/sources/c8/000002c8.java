package p010b.p046j.p058l.p059d1;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: b.j.l.d1.e */
/* loaded from: classes.dex */
public class C0580e {

    /* renamed from: a */
    public static int f2702a;

    /* renamed from: b */
    public final AccessibilityNodeInfo f2703b;

    /* renamed from: c */
    public int f2704c = -1;

    /* renamed from: d */
    public int f2705d = -1;

    public C0580e(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2703b = accessibilityNodeInfo;
    }

    /* renamed from: c */
    public static String m2311c(int i) {
        if (i != 1) {
            if (i != 2) {
                switch (i) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case 512:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case 2048:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case 8192:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case 16908354:
                        return "ACTION_MOVE_WINDOW";
                    case 16908372:
                        return "ACTION_IME_ENTER";
                    default:
                        switch (i) {
                            case 16908342:
                                return "ACTION_SHOW_ON_SCREEN";
                            case 16908343:
                                return "ACTION_SCROLL_TO_POSITION";
                            case 16908344:
                                return "ACTION_SCROLL_UP";
                            case 16908345:
                                return "ACTION_SCROLL_LEFT";
                            case 16908346:
                                return "ACTION_SCROLL_DOWN";
                            case 16908347:
                                return "ACTION_SCROLL_RIGHT";
                            case 16908348:
                                return "ACTION_CONTEXT_CLICK";
                            case 16908349:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i) {
                                    case 16908356:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case 16908357:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case 16908358:
                                        return "ACTION_PAGE_UP";
                                    case 16908359:
                                        return "ACTION_PAGE_DOWN";
                                    case 16908360:
                                        return "ACTION_PAGE_LEFT";
                                    case 16908361:
                                        return "ACTION_PAGE_RIGHT";
                                    case 16908362:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    /* renamed from: d */
    public static ClickableSpan[] m2310d(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: a */
    public void m2313a(C0577b c0577b) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2703b.addAction((AccessibilityNodeInfo.AccessibilityAction) c0577b.f2696i);
        }
    }

    /* renamed from: b */
    public final List m2312b(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f2703b.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.f2703b.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    /* renamed from: e */
    public CharSequence m2309e() {
        return this.f2703b.getContentDescription();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C0580e)) {
            C0580e c0580e = (C0580e) obj;
            AccessibilityNodeInfo accessibilityNodeInfo = this.f2703b;
            if (accessibilityNodeInfo == null) {
                if (c0580e.f2703b != null) {
                    return false;
                }
            } else if (!accessibilityNodeInfo.equals(c0580e.f2703b)) {
                return false;
            }
            return this.f2705d == c0580e.f2705d && this.f2704c == c0580e.f2704c;
        }
        return false;
    }

    /* renamed from: f */
    public Bundle m2308f() {
        return Build.VERSION.SDK_INT >= 19 ? this.f2703b.getExtras() : new Bundle();
    }

    /* renamed from: g */
    public CharSequence m2307g() {
        if (!m2312b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty()) {
            List m2312b = m2312b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List m2312b2 = m2312b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List m2312b3 = m2312b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List m2312b4 = m2312b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f2703b.getText(), 0, this.f2703b.getText().length()));
            for (int i = 0; i < m2312b.size(); i++) {
                spannableString.setSpan(new C0576a(((Integer) m2312b4.get(i)).intValue(), this, m2308f().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) m2312b.get(i)).intValue(), ((Integer) m2312b2.get(i)).intValue(), ((Integer) m2312b3.get(i)).intValue());
            }
            return spannableString;
        }
        return this.f2703b.getText();
    }

    /* renamed from: h */
    public final void m2306h(int i, boolean z) {
        Bundle m2308f = m2308f();
        if (m2308f != null) {
            int i2 = m2308f.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i ^ (-1));
            if (!z) {
                i = 0;
            }
            m2308f.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2703b;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public void m2305i(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2703b.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((C0578c) obj).f2700a);
        }
    }

    /* renamed from: j */
    public void m2304j(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f2703b.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((C0579d) obj).f2701a);
        }
    }

    /* renamed from: k */
    public void m2303k(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f2703b.setHintText(charSequence);
        } else if (i >= 19) {
            this.f2703b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:41:0x016b */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    public String toString() {
        ?? emptyList;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        this.f2703b.getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        this.f2703b.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(this.f2703b.getPackageName());
        sb.append("; className: ");
        sb.append(this.f2703b.getClassName());
        sb.append("; text: ");
        sb.append(m2307g());
        sb.append("; contentDescription: ");
        sb.append(m2309e());
        sb.append("; viewId: ");
        int i = Build.VERSION.SDK_INT;
        sb.append(i >= 18 ? this.f2703b.getViewIdResourceName() : null);
        sb.append("; checkable: ");
        sb.append(this.f2703b.isCheckable());
        sb.append("; checked: ");
        sb.append(this.f2703b.isChecked());
        sb.append("; focusable: ");
        sb.append(this.f2703b.isFocusable());
        sb.append("; focused: ");
        sb.append(this.f2703b.isFocused());
        sb.append("; selected: ");
        sb.append(this.f2703b.isSelected());
        sb.append("; clickable: ");
        sb.append(this.f2703b.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.f2703b.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.f2703b.isEnabled());
        sb.append("; password: ");
        sb.append(this.f2703b.isPassword());
        sb.append("; scrollable: " + this.f2703b.isScrollable());
        sb.append("; [");
        if (i >= 21) {
            List<AccessibilityNodeInfo.AccessibilityAction> actionList = i >= 21 ? this.f2703b.getActionList() : null;
            if (actionList != null) {
                emptyList = new ArrayList();
                int size = actionList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    emptyList.add(new C0577b(actionList.get(i2), 0, null, null, null));
                }
            } else {
                emptyList = Collections.emptyList();
            }
            for (int i3 = 0; i3 < emptyList.size(); i3++) {
                C0577b c0577b = (C0577b) emptyList.get(i3);
                String m2311c = m2311c(c0577b.m2316a());
                if (m2311c.equals("ACTION_UNKNOWN")) {
                    int i4 = Build.VERSION.SDK_INT;
                    if ((i4 >= 21 ? ((AccessibilityNodeInfo.AccessibilityAction) c0577b.f2696i).getLabel() : null) != null) {
                        m2311c = (i4 >= 21 ? ((AccessibilityNodeInfo.AccessibilityAction) c0577b.f2696i).getLabel() : null).toString();
                    }
                }
                sb.append(m2311c);
                if (i3 != emptyList.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int actions = this.f2703b.getActions();
            while (actions != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(actions);
                actions &= numberOfTrailingZeros ^ (-1);
                sb.append(m2311c(numberOfTrailingZeros));
                if (actions != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }
}