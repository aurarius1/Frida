package p010b.p016c.p026q;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import p010b.p016c.AbstractC0075a;
import p010b.p016c.AbstractC0082h;
import p010b.p016c.AbstractC0084j;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.C0615o0;

/* renamed from: b.c.q.a4 */
/* loaded from: classes.dex */
public class C0215a4 implements InterfaceC0285n1 {

    /* renamed from: a */
    public Toolbar f1458a;

    /* renamed from: b */
    public int f1459b;

    /* renamed from: c */
    public View f1460c;

    /* renamed from: d */
    public View f1461d;

    /* renamed from: e */
    public Drawable f1462e;

    /* renamed from: f */
    public Drawable f1463f;

    /* renamed from: g */
    public Drawable f1464g;

    /* renamed from: h */
    public boolean f1465h;

    /* renamed from: i */
    public CharSequence f1466i;

    /* renamed from: j */
    public CharSequence f1467j;

    /* renamed from: k */
    public CharSequence f1468k;

    /* renamed from: l */
    public Window.Callback f1469l;

    /* renamed from: m */
    public boolean f1470m;

    /* renamed from: n */
    public C0298q f1471n;

    /* renamed from: o */
    public int f1472o;

    /* renamed from: p */
    public Drawable f1473p;

    public C0215a4(Toolbar toolbar, boolean z) {
        int i;
        Drawable drawable;
        int i2 = AbstractC0082h.abc_action_bar_up_description;
        this.f1472o = 0;
        this.f1458a = toolbar;
        this.f1466i = toolbar.getTitle();
        this.f1467j = toolbar.getSubtitle();
        this.f1465h = this.f1466i != null;
        this.f1464g = toolbar.getNavigationIcon();
        C0302q3 m2740r = C0302q3.m2740r(toolbar.getContext(), null, AbstractC0084j.ActionBar, AbstractC0075a.actionBarStyle, 0);
        this.f1473p = m2740r.m2751g(AbstractC0084j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence m2743o = m2740r.m2743o(AbstractC0084j.ActionBar_title);
            if (!TextUtils.isEmpty(m2743o)) {
                this.f1465h = true;
                this.f1466i = m2743o;
                if ((this.f1459b & 8) != 0) {
                    this.f1458a.setTitle(m2743o);
                }
            }
            CharSequence m2743o2 = m2740r.m2743o(AbstractC0084j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(m2743o2)) {
                this.f1467j = m2743o2;
                if ((this.f1459b & 8) != 0) {
                    this.f1458a.setSubtitle(m2743o2);
                }
            }
            Drawable m2751g = m2740r.m2751g(AbstractC0084j.ActionBar_logo);
            if (m2751g != null) {
                this.f1463f = m2751g;
                m2876g();
            }
            Drawable m2751g2 = m2740r.m2751g(AbstractC0084j.ActionBar_icon);
            if (m2751g2 != null) {
                this.f1462e = m2751g2;
                m2876g();
            }
            if (this.f1464g == null && (drawable = this.f1473p) != null) {
                this.f1464g = drawable;
                m2877f();
            }
            m2880c(m2740r.m2748j(AbstractC0084j.ActionBar_displayOptions, 0));
            int m2745m = m2740r.m2745m(AbstractC0084j.ActionBar_customNavigationLayout, 0);
            if (m2745m != 0) {
                m2881b(LayoutInflater.from(this.f1458a.getContext()).inflate(m2745m, (ViewGroup) this.f1458a, false));
                m2880c(this.f1459b | 16);
            }
            int m2746l = m2740r.m2746l(AbstractC0084j.ActionBar_height, 0);
            if (m2746l > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1458a.getLayoutParams();
                layoutParams.height = m2746l;
                this.f1458a.setLayoutParams(layoutParams);
            }
            int m2753e = m2740r.m2753e(AbstractC0084j.ActionBar_contentInsetStart, -1);
            int m2753e2 = m2740r.m2753e(AbstractC0084j.ActionBar_contentInsetEnd, -1);
            if (m2753e >= 0 || m2753e2 >= 0) {
                Toolbar toolbar2 = this.f1458a;
                int max = Math.max(m2753e, 0);
                int max2 = Math.max(m2753e2, 0);
                toolbar2.m3391d();
                toolbar2.f386u.m2758a(max, max2);
            }
            int m2745m2 = m2740r.m2745m(AbstractC0084j.ActionBar_titleTextStyle, 0);
            if (m2745m2 != 0) {
                Toolbar toolbar3 = this.f1458a;
                Context context = toolbar3.getContext();
                toolbar3.f378m = m2745m2;
                TextView textView = toolbar3.f368c;
                if (textView != null) {
                    textView.setTextAppearance(context, m2745m2);
                }
            }
            int m2745m3 = m2740r.m2745m(AbstractC0084j.ActionBar_subtitleTextStyle, 0);
            if (m2745m3 != 0) {
                Toolbar toolbar4 = this.f1458a;
                Context context2 = toolbar4.getContext();
                toolbar4.f379n = m2745m3;
                TextView textView2 = toolbar4.f369d;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, m2745m3);
                }
            }
            int m2745m4 = m2740r.m2745m(AbstractC0084j.ActionBar_popupTheme, 0);
            if (m2745m4 != 0) {
                this.f1458a.setPopupTheme(m2745m4);
            }
        } else {
            if (this.f1458a.getNavigationIcon() != null) {
                i = 15;
                this.f1473p = this.f1458a.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f1459b = i;
        }
        m2740r.f1740b.recycle();
        if (i2 != this.f1472o) {
            this.f1472o = i2;
            if (TextUtils.isEmpty(this.f1458a.getNavigationContentDescription())) {
                int i3 = this.f1472o;
                this.f1468k = i3 != 0 ? m2882a().getString(i3) : null;
                m2878e();
            }
        }
        this.f1468k = this.f1458a.getNavigationContentDescription();
        this.f1458a.setNavigationOnClickListener(new View$OnClickListenerC0342y3(this));
    }

    /* renamed from: a */
    public Context m2882a() {
        return this.f1458a.getContext();
    }

    /* renamed from: b */
    public void m2881b(View view) {
        View view2 = this.f1461d;
        if (view2 != null && (this.f1459b & 16) != 0) {
            this.f1458a.removeView(view2);
        }
        this.f1461d = view;
        if (view == null || (this.f1459b & 16) == 0) {
            return;
        }
        this.f1458a.addView(view);
    }

    /* renamed from: c */
    public void m2880c(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f1459b ^ i;
        this.f1459b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m2878e();
                }
                m2877f();
            }
            if ((i2 & 3) != 0) {
                m2876g();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1458a.setTitle(this.f1466i);
                    toolbar = this.f1458a;
                    charSequence = this.f1467j;
                } else {
                    charSequence = null;
                    this.f1458a.setTitle((CharSequence) null);
                    toolbar = this.f1458a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) == 0 || (view = this.f1461d) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f1458a.addView(view);
            } else {
                this.f1458a.removeView(view);
            }
        }
    }

    /* renamed from: d */
    public C0615o0 m2879d(int i, long j) {
        C0615o0 m2256b = AbstractC0605j0.m2256b(this.f1458a);
        m2256b.m2211a(i == 0 ? 1.0f : 0.0f);
        m2256b.m2209c(j);
        m2256b.m2208d(new C0347z3(this, i));
        return m2256b;
    }

    /* renamed from: e */
    public final void m2878e() {
        if ((this.f1459b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1468k)) {
                this.f1458a.setNavigationContentDescription(this.f1472o);
            } else {
                this.f1458a.setNavigationContentDescription(this.f1468k);
            }
        }
    }

    /* renamed from: f */
    public final void m2877f() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f1459b & 4) != 0) {
            toolbar = this.f1458a;
            drawable = this.f1464g;
            if (drawable == null) {
                drawable = this.f1473p;
            }
        } else {
            toolbar = this.f1458a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* renamed from: g */
    public final void m2876g() {
        Drawable drawable;
        int i = this.f1459b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f1463f) == null) {
            drawable = this.f1462e;
        }
        this.f1458a.setLogo(drawable);
    }
}