package p093c.p145g.p146a.p147a.p156i0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;
import p010b.p016c.AbstractC0075a;
import p010b.p016c.p026q.C0243f2;
import p010b.p016c.p026q.C0328w;
import p093c.p145g.p146a.p147a.AbstractC1804b;
import p093c.p145g.p146a.p147a.AbstractC1926k;
import p093c.p145g.p146a.p147a.AbstractC1940l;
import p093c.p145g.p146a.p147a.p149b0.AbstractC1822r;
import p093c.p145g.p146a.p147a.p157j0.p158a.AbstractC1925a;

/* renamed from: c.g.a.a.i0.e0 */
/* loaded from: classes.dex */
public class C1887e0 extends C0328w {

    /* renamed from: e */
    public final C0243f2 f5790e;

    /* renamed from: f */
    public final AccessibilityManager f5791f;

    /* renamed from: g */
    public final Rect f5792g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1887e0(Context context, AttributeSet attributeSet) {
        super(AbstractC1925a.m676a(context, attributeSet, r3, 0), attributeSet, r3);
        int i = AbstractC1804b.autoCompleteTextViewStyle;
        this.f5792g = new Rect();
        Context context2 = getContext();
        TypedArray m764d = AbstractC1822r.m764d(context2, attributeSet, AbstractC1940l.MaterialAutoCompleteTextView, i, AbstractC1926k.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        int i2 = AbstractC1940l.MaterialAutoCompleteTextView_android_inputType;
        if (m764d.hasValue(i2) && m764d.getInt(i2, 0) == 0) {
            setKeyListener(null);
        }
        this.f5791f = (AccessibilityManager) context2.getSystemService("accessibility");
        C0243f2 c0243f2 = new C0243f2(context2, null, AbstractC0075a.listPopupWindowStyle, 0);
        this.f5790e = c0243f2;
        c0243f2.m2826s(true);
        c0243f2.f1574t = this;
        c0243f2.f1558D.setInputMethodMode(2);
        c0243f2.mo2697o(getAdapter());
        c0243f2.f1575u = new C1885d0(this);
        m764d.recycle();
    }

    /* renamed from: a */
    public static void m693a(C1887e0 c1887e0, Object obj) {
        if (Build.VERSION.SDK_INT >= 17) {
            c1887e0.setText(c1887e0.convertSelectionToString(obj), false);
            return;
        }
        ListAdapter adapter = c1887e0.getAdapter();
        c1887e0.setAdapter(null);
        c1887e0.setText(c1887e0.convertSelectionToString(obj));
        c1887e0.setAdapter(adapter);
    }

    /* renamed from: b */
    public final TextInputLayout m692b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout m692b = m692b();
        return (m692b == null || !m692b.f6844C) ? super.getHint() : m692b.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout m692b = m692b();
        if (m692b != null && m692b.f6844C && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout m692b = m692b();
            int i3 = 0;
            if (adapter != null && m692b != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C0243f2 c0243f2 = this.f5790e;
                int min = Math.min(adapter.getCount(), Math.max(0, !c0243f2.mo2835b() ? -1 : c0243f2.f1561g.getSelectedItemPosition()) + 15);
                View view = null;
                int i4 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i3) {
                        view = null;
                        i3 = itemViewType;
                    }
                    view = adapter.getView(max, view, m692b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                }
                Drawable m2831i = this.f5790e.m2831i();
                if (m2831i != null) {
                    m2831i.getPadding(this.f5792g);
                    Rect rect = this.f5792g;
                    i4 += rect.left + rect.right;
                }
                i3 = m692b.getEndIconView().getMeasuredWidth() + i4;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        this.f5790e.mo2697o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f5791f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f5790e.mo2833f();
        }
    }
}