package p093c.p145g.p146a.p147a.p156i0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.concurrent.atomic.AtomicInteger;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p086w.AbstractC1077v0;
import p093c.p145g.p146a.p147a.AbstractC1804b;
import p093c.p145g.p146a.p147a.p154g0.C1851i;

/* renamed from: c.g.a.a.i0.s */
/* loaded from: classes.dex */
public class C1914s implements InterfaceC1913r0 {

    /* renamed from: a */
    public final /* synthetic */ C1923z f5827a;

    public C1914s(C1923z c1923z) {
        this.f5827a = c1923z;
    }

    @Override // p093c.p145g.p146a.p147a.p156i0.InterfaceC1913r0
    /* renamed from: a */
    public void mo686a(TextInputLayout textInputLayout) {
        LayerDrawable layerDrawable;
        Drawable drawable;
        AutoCompleteTextView m682d = C1923z.m682d(textInputLayout.getEditText());
        C1923z c1923z = this.f5827a;
        c1923z.getClass();
        boolean z = C1923z.f5836d;
        if (z) {
            int boxBackgroundMode = c1923z.f5755a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                drawable = c1923z.f5846n;
            } else if (boxBackgroundMode == 1) {
                drawable = c1923z.f5845m;
            }
            m682d.setDropDownBackgroundDrawable(drawable);
        }
        C1923z c1923z2 = this.f5827a;
        c1923z2.getClass();
        if (!(m682d.getKeyListener() != null)) {
            int boxBackgroundMode2 = c1923z2.f5755a.getBoxBackgroundMode();
            C1851i boxBackground = c1923z2.f5755a.getBoxBackground();
            int m1263p = AbstractC1077v0.m1263p(m682d, AbstractC1804b.colorControlHighlight);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode2 == 2) {
                int m1263p2 = AbstractC1077v0.m1263p(m682d, AbstractC1804b.colorSurface);
                C1851i c1851i = new C1851i(boxBackground.f5657d.f5633a);
                int m1297G = AbstractC1077v0.m1297G(m1263p, m1263p2, 0.1f);
                c1851i.m737p(new ColorStateList(iArr, new int[]{m1297G, 0}));
                if (z) {
                    c1851i.setTint(m1263p2);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{m1297G, m1263p2});
                    C1851i c1851i2 = new C1851i(boxBackground.f5657d.f5633a);
                    c1851i2.setTint(-1);
                    layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c1851i, c1851i2), boxBackground});
                } else {
                    layerDrawable = new LayerDrawable(new Drawable[]{c1851i, boxBackground});
                }
                AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
                if (Build.VERSION.SDK_INT >= 16) {
                    m682d.setBackground(layerDrawable);
                } else {
                    m682d.setBackgroundDrawable(layerDrawable);
                }
            } else if (boxBackgroundMode2 == 1) {
                int boxBackgroundColor = c1923z2.f5755a.getBoxBackgroundColor();
                int[] iArr2 = {AbstractC1077v0.m1297G(m1263p, boxBackgroundColor, 0.1f), boxBackgroundColor};
                if (z) {
                    RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, iArr2), boxBackground, boxBackground);
                    AtomicInteger atomicInteger2 = AbstractC0605j0.f2748a;
                    if (Build.VERSION.SDK_INT >= 16) {
                        m682d.setBackground(rippleDrawable);
                    } else {
                        m682d.setBackgroundDrawable(rippleDrawable);
                    }
                } else {
                    C1851i c1851i3 = new C1851i(boxBackground.f5657d.f5633a);
                    c1851i3.m737p(new ColorStateList(iArr, iArr2));
                    LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{boxBackground, c1851i3});
                    int m2237u = AbstractC0605j0.m2237u(m682d);
                    int paddingTop = m682d.getPaddingTop();
                    int m2238t = AbstractC0605j0.m2238t(m682d);
                    int paddingBottom = m682d.getPaddingBottom();
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 16) {
                        m682d.setBackground(layerDrawable2);
                    } else {
                        m682d.setBackgroundDrawable(layerDrawable2);
                    }
                    if (i >= 17) {
                        m682d.setPaddingRelative(m2237u, paddingTop, m2238t, paddingBottom);
                    } else {
                        m682d.setPadding(m2237u, paddingTop, m2238t, paddingBottom);
                    }
                }
            }
        }
        C1923z c1923z3 = this.f5827a;
        c1923z3.getClass();
        m682d.setOnTouchListener(new View$OnTouchListenerC1920w(c1923z3, m682d));
        m682d.setOnFocusChangeListener(c1923z3.f5838f);
        if (z) {
            m682d.setOnDismissListener(new C1921x(c1923z3));
        }
        m682d.setThreshold(0);
        m682d.removeTextChangedListener(this.f5827a.f5837e);
        m682d.addTextChangedListener(this.f5827a.f5837e);
        textInputLayout.setEndIconCheckable(true);
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!(m682d.getKeyListener() != null)) {
            AbstractC0605j0.m2263T(this.f5827a.f5757c, 2);
        }
        textInputLayout.setTextInputAccessibilityDelegate(this.f5827a.f5839g);
        textInputLayout.setEndIconVisible(true);
    }
}