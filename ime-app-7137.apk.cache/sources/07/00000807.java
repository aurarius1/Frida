package p093c.p145g.p146a.p147a.p156i0;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p010b.p016c.p018l.p019a.AbstractC0142b;
import p010b.p086w.AbstractC1077v0;
import p093c.p145g.p146a.p147a.AbstractC1804b;
import p093c.p145g.p146a.p147a.AbstractC1829d;
import p093c.p145g.p146a.p147a.AbstractC1835e;
import p093c.p145g.p146a.p147a.AbstractC1924j;
import p093c.p145g.p146a.p147a.p154g0.C1843a;
import p093c.p145g.p146a.p147a.p154g0.C1850h;
import p093c.p145g.p146a.p147a.p154g0.C1851i;
import p093c.p145g.p146a.p147a.p154g0.C1855m;
import p093c.p145g.p146a.p147a.p154g0.C1856n;
import p093c.p145g.p146a.p147a.p161m.AbstractC1946a;
import p093c.p145g.p146a.p147a.p173y.C2045a;

/* renamed from: c.g.a.a.i0.z */
/* loaded from: classes.dex */
public class C1923z extends AbstractC1879a0 {

    /* renamed from: d */
    public static final boolean f5836d;

    /* renamed from: e */
    public final TextWatcher f5837e;

    /* renamed from: f */
    public final View.OnFocusChangeListener f5838f;

    /* renamed from: g */
    public final C1911q0 f5839g;

    /* renamed from: h */
    public final InterfaceC1913r0 f5840h;
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: i */
    public final InterfaceC1915s0 f5841i;

    /* renamed from: j */
    public boolean f5842j;

    /* renamed from: k */
    public boolean f5843k;

    /* renamed from: l */
    public long f5844l;

    /* renamed from: m */
    public StateListDrawable f5845m;

    /* renamed from: n */
    public C1851i f5846n;

    /* renamed from: o */
    public AccessibilityManager f5847o;

    /* renamed from: p */
    public ValueAnimator f5848p;

    /* renamed from: q */
    public ValueAnimator f5849q;

    static {
        f5836d = Build.VERSION.SDK_INT >= 21;
    }

    public C1923z(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f5837e = new C1908p(this);
        this.f5838f = new View$OnFocusChangeListenerC1910q(this);
        this.f5839g = new C1912r(this, this.f5755a);
        this.f5840h = new C1914s(this);
        this.f5841i = new C1918u(this);
        this.f5842j = false;
        this.f5843k = false;
        this.f5844l = Long.MAX_VALUE;
    }

    /* renamed from: d */
    public static AutoCompleteTextView m682d(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: e */
    public static boolean m681e(EditText editText) {
        return editText.getKeyListener() != null;
    }

    /* renamed from: f */
    public static void m680f(C1923z c1923z, boolean z) {
        if (c1923z.f5843k != z) {
            c1923z.f5843k = z;
            c1923z.f5849q.cancel();
            c1923z.f5848p.start();
        }
    }

    /* renamed from: g */
    public static void m679g(C1923z c1923z, AutoCompleteTextView autoCompleteTextView) {
        c1923z.getClass();
        if (autoCompleteTextView == null) {
            return;
        }
        if (c1923z.m677i()) {
            c1923z.f5842j = false;
        }
        if (c1923z.f5842j) {
            c1923z.f5842j = false;
            return;
        }
        if (f5836d) {
            boolean z = c1923z.f5843k;
            boolean z2 = !z;
            if (z != z2) {
                c1923z.f5843k = z2;
                c1923z.f5849q.cancel();
                c1923z.f5848p.start();
            }
        } else {
            c1923z.f5843k = !c1923z.f5843k;
            c1923z.f5757c.toggle();
        }
        if (!c1923z.f5843k) {
            autoCompleteTextView.dismissDropDown();
            return;
        }
        autoCompleteTextView.requestFocus();
        autoCompleteTextView.showDropDown();
    }

    @Override // p093c.p145g.p146a.p147a.p156i0.AbstractC1879a0
    /* renamed from: a */
    public void mo684a() {
        float dimensionPixelOffset = this.f5756b.getResources().getDimensionPixelOffset(AbstractC1829d.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.f5756b.getResources().getDimensionPixelOffset(AbstractC1829d.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f5756b.getResources().getDimensionPixelOffset(AbstractC1829d.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C1851i m678h = m678h(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C1851i m678h2 = m678h(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f5846n = m678h;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f5845m = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, m678h);
        this.f5845m.addState(new int[0], m678h2);
        this.f5755a.setEndIconDrawable(AbstractC0142b.m3000b(this.f5756b, f5836d ? AbstractC1835e.mtrl_dropdown_arrow : AbstractC1835e.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.f5755a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(AbstractC1924j.exposed_dropdown_menu_content_description));
        this.f5755a.setEndIconOnClickListener(new View$OnClickListenerC1919v(this));
        this.f5755a.m263a(this.f5840h);
        this.f5755a.f6887h0.add(this.f5841i);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = AbstractC1946a.f5894a;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(67);
        ofFloat.addUpdateListener(new C1906o(this));
        this.f5849q = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(50);
        ofFloat2.addUpdateListener(new C1906o(this));
        this.f5848p = ofFloat2;
        ofFloat2.addListener(new C1922y(this));
        this.f5847o = (AccessibilityManager) this.f5756b.getSystemService("accessibility");
    }

    @Override // p093c.p145g.p146a.p147a.p156i0.AbstractC1879a0
    /* renamed from: b */
    public boolean mo683b(int i) {
        return i != 0;
    }

    /* renamed from: h */
    public final C1851i m678h(float f, float f2, float f3, int i) {
        C1855m c1855m = new C1855m();
        c1855m.f5684e = new C1843a(f);
        c1855m.f5685f = new C1843a(f);
        c1855m.f5687h = new C1843a(f2);
        c1855m.f5686g = new C1843a(f2);
        C1856n m727a = c1855m.m727a();
        Context context = this.f5756b;
        String str = C1851i.f5655b;
        int m1283U = AbstractC1077v0.m1283U(context, AbstractC1804b.colorSurface, C1851i.class.getSimpleName());
        C1851i c1851i = new C1851i();
        c1851i.f5657d.f5634b = new C2045a(context);
        c1851i.m730w();
        c1851i.m737p(ColorStateList.valueOf(m1283U));
        C1850h c1850h = c1851i.f5657d;
        if (c1850h.f5647o != f3) {
            c1850h.f5647o = f3;
            c1851i.m730w();
        }
        c1851i.f5657d.f5633a = m727a;
        c1851i.invalidateSelf();
        C1850h c1850h2 = c1851i.f5657d;
        if (c1850h2.f5641i == null) {
            c1850h2.f5641i = new Rect();
        }
        c1851i.f5657d.f5641i.set(0, i, 0, i);
        c1851i.invalidateSelf();
        return c1851i;
    }

    /* renamed from: i */
    public final boolean m677i() {
        long currentTimeMillis = System.currentTimeMillis() - this.f5844l;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }
}