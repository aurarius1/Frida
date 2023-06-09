package p093c.p145g.p146a.p147a.p156i0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p086w.AbstractC1077v0;
import p093c.p145g.p146a.p147a.AbstractC1829d;
import p093c.p145g.p146a.p147a.p161m.AbstractC1946a;

/* renamed from: c.g.a.a.i0.c0 */
/* loaded from: classes.dex */
public final class C1883c0 {

    /* renamed from: a */
    public final Context f5765a;

    /* renamed from: b */
    public final TextInputLayout f5766b;

    /* renamed from: c */
    public LinearLayout f5767c;

    /* renamed from: d */
    public int f5768d;

    /* renamed from: e */
    public FrameLayout f5769e;

    /* renamed from: f */
    public Animator f5770f;

    /* renamed from: g */
    public final float f5771g;

    /* renamed from: h */
    public int f5772h;

    /* renamed from: i */
    public int f5773i;

    /* renamed from: j */
    public CharSequence f5774j;

    /* renamed from: k */
    public boolean f5775k;

    /* renamed from: l */
    public TextView f5776l;

    /* renamed from: m */
    public CharSequence f5777m;

    /* renamed from: n */
    public int f5778n;

    /* renamed from: o */
    public ColorStateList f5779o;

    /* renamed from: p */
    public CharSequence f5780p;

    /* renamed from: q */
    public boolean f5781q;

    /* renamed from: r */
    public TextView f5782r;

    /* renamed from: s */
    public int f5783s;

    /* renamed from: t */
    public ColorStateList f5784t;

    /* renamed from: u */
    public Typeface f5785u;

    public C1883c0(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f5765a = context;
        this.f5766b = textInputLayout;
        this.f5771g = context.getResources().getDimensionPixelSize(AbstractC1829d.design_textinput_caption_translate_y);
    }

    /* renamed from: a */
    public void m705a(TextView textView, int i) {
        if (this.f5767c == null && this.f5769e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f5765a);
            this.f5767c = linearLayout;
            linearLayout.setOrientation(0);
            this.f5766b.addView(this.f5767c, -1, -2);
            this.f5769e = new FrameLayout(this.f5765a);
            this.f5767c.addView(this.f5769e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f5766b.getEditText() != null) {
                m704b();
            }
        }
        if (i == 0 || i == 1) {
            this.f5769e.setVisibility(0);
            this.f5769e.addView(textView);
        } else {
            this.f5767c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f5767c.setVisibility(0);
        this.f5768d++;
    }

    /* renamed from: b */
    public void m704b() {
        if ((this.f5767c == null || this.f5766b.getEditText() == null) ? false : true) {
            EditText editText = this.f5766b.getEditText();
            boolean m1303A = AbstractC1077v0.m1303A(this.f5765a);
            LinearLayout linearLayout = this.f5767c;
            int i = AbstractC1829d.material_helper_text_font_1_3_padding_horizontal;
            AbstractC0605j0.m2261V(linearLayout, m698h(m1303A, i, AbstractC0605j0.m2237u(editText)), m698h(m1303A, AbstractC1829d.material_helper_text_font_1_3_padding_top, this.f5765a.getResources().getDimensionPixelSize(AbstractC1829d.material_helper_text_default_padding_top)), m698h(m1303A, i, AbstractC0605j0.m2238t(editText)), 0);
        }
    }

    /* renamed from: c */
    public void m703c() {
        Animator animator = this.f5770f;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: d */
    public final void m702d(List list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, i3 == i ? 1.0f : 0.0f);
            ofFloat.setDuration(167L);
            ofFloat.setInterpolator(AbstractC1946a.f5894a);
            list.add(ofFloat);
            if (i3 == i) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f5771g, 0.0f);
                ofFloat2.setDuration(217L);
                ofFloat2.setInterpolator(AbstractC1946a.f5897d);
                list.add(ofFloat2);
            }
        }
    }

    /* renamed from: e */
    public boolean m701e() {
        return (this.f5773i != 1 || this.f5776l == null || TextUtils.isEmpty(this.f5774j)) ? false : true;
    }

    /* renamed from: f */
    public final TextView m700f(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return this.f5782r;
        }
        return this.f5776l;
    }

    /* renamed from: g */
    public int m699g() {
        TextView textView = this.f5776l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: h */
    public final int m698h(boolean z, int i, int i2) {
        return z ? this.f5765a.getResources().getDimensionPixelSize(i) : i2;
    }

    /* renamed from: i */
    public void m697i() {
        this.f5774j = null;
        m703c();
        if (this.f5772h == 1) {
            this.f5773i = (!this.f5781q || TextUtils.isEmpty(this.f5780p)) ? 0 : 2;
        }
        m694l(this.f5772h, this.f5773i, m695k(this.f5776l, null));
    }

    /* renamed from: j */
    public void m696j(TextView textView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f5767c;
        if (linearLayout == null) {
            return;
        }
        if (!(i == 0 || i == 1) || (frameLayout = this.f5769e) == null) {
            linearLayout.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i2 = this.f5768d - 1;
        this.f5768d = i2;
        LinearLayout linearLayout2 = this.f5767c;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* renamed from: k */
    public final boolean m695k(TextView textView, CharSequence charSequence) {
        return AbstractC0605j0.m2232z(this.f5766b) && this.f5766b.isEnabled() && !(this.f5773i == this.f5772h && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: l */
    public final void m694l(int i, int i2, boolean z) {
        TextView m700f;
        TextView m700f2;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f5770f = animatorSet;
            ArrayList arrayList = new ArrayList();
            m702d(arrayList, this.f5781q, this.f5782r, 2, i, i2);
            m702d(arrayList, this.f5775k, this.f5776l, 1, i, i2);
            AbstractC1077v0.m1290N(animatorSet, arrayList);
            animatorSet.addListener(new C1881b0(this, i2, m700f(i), i, m700f(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (m700f2 = m700f(i2)) != null) {
                m700f2.setVisibility(0);
                m700f2.setAlpha(1.0f);
            }
            if (i != 0 && (m700f = m700f(i)) != null) {
                m700f.setVisibility(4);
                if (i == 1) {
                    m700f.setText((CharSequence) null);
                }
            }
            this.f5772h = i2;
        }
        this.f5766b.m240x();
        this.f5766b.m238z(z, false);
        this.f5766b.m264G();
    }
}