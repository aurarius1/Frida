package p010b.p016c.p017k;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p010b.p016c.AbstractC0075a;
import p010b.p016c.AbstractC0076b;
import p010b.p016c.AbstractC0080f;
import p010b.p016c.AbstractC0084j;
import p010b.p016c.p024p.AbstractC0161b;
import p010b.p016c.p024p.C0171l;
import p010b.p016c.p024p.InterfaceC0160a;
import p010b.p016c.p026q.C0215a4;
import p010b.p016c.p026q.InterfaceC0246g;
import p010b.p016c.p026q.InterfaceC0285n1;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.C0615o0;
import p010b.p046j.p058l.InterfaceC0617p0;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.c.k.d1 */
/* loaded from: classes.dex */
public class C0096d1 extends AbstractC0091c implements InterfaceC0246g {

    /* renamed from: a */
    public static final Interpolator f881a = new AccelerateInterpolator();

    /* renamed from: b */
    public static final Interpolator f882b = new DecelerateInterpolator();

    /* renamed from: A */
    public final C0090b1 f883A;

    /* renamed from: c */
    public Context f884c;

    /* renamed from: d */
    public Context f885d;

    /* renamed from: e */
    public ActionBarOverlayLayout f886e;

    /* renamed from: f */
    public ActionBarContainer f887f;

    /* renamed from: g */
    public InterfaceC0285n1 f888g;

    /* renamed from: h */
    public ActionBarContextView f889h;

    /* renamed from: i */
    public View f890i;

    /* renamed from: j */
    public boolean f891j;

    /* renamed from: k */
    public C0093c1 f892k;

    /* renamed from: l */
    public AbstractC0161b f893l;

    /* renamed from: m */
    public InterfaceC0160a f894m;

    /* renamed from: n */
    public boolean f895n;

    /* renamed from: o */
    public ArrayList f896o;

    /* renamed from: p */
    public boolean f897p;

    /* renamed from: q */
    public int f898q;

    /* renamed from: r */
    public boolean f899r;

    /* renamed from: s */
    public boolean f900s;

    /* renamed from: t */
    public boolean f901t;

    /* renamed from: u */
    public boolean f902u;

    /* renamed from: v */
    public C0171l f903v;

    /* renamed from: w */
    public boolean f904w;

    /* renamed from: x */
    public boolean f905x;

    /* renamed from: y */
    public final InterfaceC0617p0 f906y;

    /* renamed from: z */
    public final InterfaceC0617p0 f907z;

    public C0096d1(Activity activity, boolean z) {
        new ArrayList();
        this.f896o = new ArrayList();
        this.f898q = 0;
        this.f899r = true;
        this.f902u = true;
        this.f906y = new C0140z0(this);
        this.f907z = new C0087a1(this);
        this.f883A = new C0090b1(this);
        View decorView = activity.getWindow().getDecorView();
        m3080e(decorView);
        if (z) {
            return;
        }
        this.f890i = decorView.findViewById(16908290);
    }

    public C0096d1(Dialog dialog) {
        new ArrayList();
        this.f896o = new ArrayList();
        this.f898q = 0;
        this.f899r = true;
        this.f902u = true;
        this.f906y = new C0140z0(this);
        this.f907z = new C0087a1(this);
        this.f883A = new C0090b1(this);
        m3080e(dialog.getWindow().getDecorView());
    }

    @Override // p010b.p016c.p017k.AbstractC0091c
    /* renamed from: a */
    public void mo3084a(boolean z) {
        if (z == this.f895n) {
            return;
        }
        this.f895n = z;
        int size = this.f896o.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC0088b) this.f896o.get(i)).m3085a(z);
        }
    }

    @Override // p010b.p016c.p017k.AbstractC0091c
    /* renamed from: b */
    public Context mo3083b() {
        if (this.f885d == null) {
            TypedValue typedValue = new TypedValue();
            this.f884c.getTheme().resolveAttribute(AbstractC0075a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f885d = new ContextThemeWrapper(this.f884c, i);
            } else {
                this.f885d = this.f884c;
            }
        }
        return this.f885d;
    }

    @Override // p010b.p016c.p017k.AbstractC0091c
    /* renamed from: c */
    public void mo3082c(CharSequence charSequence) {
        C0215a4 c0215a4 = (C0215a4) this.f888g;
        if (c0215a4.f1465h) {
            return;
        }
        c0215a4.f1466i = charSequence;
        if ((c0215a4.f1459b & 8) != 0) {
            c0215a4.f1458a.setTitle(charSequence);
        }
    }

    /* renamed from: d */
    public void m3081d(boolean z) {
        C0615o0 m2879d;
        C0615o0 m3436h;
        if (z) {
            if (!this.f901t) {
                this.f901t = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f886e;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m3077h(false);
            }
        } else if (this.f901t) {
            this.f901t = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f886e;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m3077h(false);
        }
        if (!AbstractC0605j0.m2232z(this.f887f)) {
            if (z) {
                ((C0215a4) this.f888g).f1458a.setVisibility(4);
                this.f889h.setVisibility(0);
                return;
            }
            ((C0215a4) this.f888g).f1458a.setVisibility(0);
            this.f889h.setVisibility(8);
            return;
        }
        if (z) {
            m3436h = ((C0215a4) this.f888g).m2879d(4, 100L);
            m2879d = this.f889h.m3436h(0, 200L);
        } else {
            m2879d = ((C0215a4) this.f888g).m2879d(0, 200L);
            m3436h = this.f889h.m3436h(8, 100L);
        }
        C0171l c0171l = new C0171l();
        c0171l.f1255a.add(m3436h);
        View view = (View) m3436h.f2776a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) m2879d.f2776a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        c0171l.f1255a.add(m2879d);
        c0171l.m2953b();
    }

    /* renamed from: e */
    public final void m3080e(View view) {
        InterfaceC0285n1 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(AbstractC0080f.decor_content_parent);
        this.f886e = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(AbstractC0080f.action_bar);
        if (findViewById instanceof InterfaceC0285n1) {
            wrapper = (InterfaceC0285n1) findViewById;
        } else if (!(findViewById instanceof Toolbar)) {
            StringBuilder m1187i = AbstractC1124a.m1187i("Can't make a decor toolbar out of ");
            m1187i.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(m1187i.toString());
        } else {
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f888g = wrapper;
        this.f889h = (ActionBarContextView) view.findViewById(AbstractC0080f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(AbstractC0080f.action_bar_container);
        this.f887f = actionBarContainer;
        InterfaceC0285n1 interfaceC0285n1 = this.f888g;
        if (interfaceC0285n1 == null || this.f889h == null || actionBarContainer == null) {
            throw new IllegalStateException(C0096d1.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        Context m2882a = ((C0215a4) interfaceC0285n1).m2882a();
        this.f884c = m2882a;
        if ((((C0215a4) this.f888g).f1459b & 4) != 0) {
            this.f891j = true;
        }
        int i = m2882a.getApplicationInfo().targetSdkVersion;
        ((C0215a4) this.f888g).getClass();
        m3078g(m2882a.getResources().getBoolean(AbstractC0076b.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f884c.obtainStyledAttributes(null, AbstractC0084j.ActionBar, AbstractC0075a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(AbstractC0084j.ActionBar_hideOnContentScroll, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f886e;
            if (!actionBarOverlayLayout2.f212j) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f905x = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(AbstractC0084j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            AbstractC0605j0.m2265R(this.f887f, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: f */
    public void m3079f(int i, int i2) {
        InterfaceC0285n1 interfaceC0285n1 = this.f888g;
        int i3 = ((C0215a4) interfaceC0285n1).f1459b;
        if ((i2 & 4) != 0) {
            this.f891j = true;
        }
        ((C0215a4) interfaceC0285n1).m2880c((i & i2) | ((i2 ^ (-1)) & i3));
    }

    /* renamed from: g */
    public final void m3078g(boolean z) {
        this.f897p = z;
        if (!z) {
            C0215a4 c0215a4 = (C0215a4) this.f888g;
            View view = c0215a4.f1460c;
            if (view != null) {
                ViewParent parent = view.getParent();
                Toolbar toolbar = c0215a4.f1458a;
                if (parent == toolbar) {
                    toolbar.removeView(c0215a4.f1460c);
                }
            }
            c0215a4.f1460c = null;
            this.f887f.setTabContainer(null);
        } else {
            this.f887f.setTabContainer(null);
            C0215a4 c0215a42 = (C0215a4) this.f888g;
            View view2 = c0215a42.f1460c;
            if (view2 != null) {
                ViewParent parent2 = view2.getParent();
                Toolbar toolbar2 = c0215a42.f1458a;
                if (parent2 == toolbar2) {
                    toolbar2.removeView(c0215a42.f1460c);
                }
            }
            c0215a42.f1460c = null;
        }
        this.f888g.getClass();
        ((C0215a4) this.f888g).f1458a.setCollapsible(false);
        this.f886e.setHasNonEmbeddedTabs(false);
    }

    /* renamed from: h */
    public final void m3077h(boolean z) {
        View view;
        int[] iArr;
        View view2;
        View view3;
        int[] iArr2;
        if (!(this.f901t || !this.f900s)) {
            if (this.f902u) {
                this.f902u = false;
                C0171l c0171l = this.f903v;
                if (c0171l != null) {
                    c0171l.m2954a();
                }
                if (this.f898q != 0 || (!this.f904w && !z)) {
                    this.f906y.mo2203a(null);
                    return;
                }
                this.f887f.setAlpha(1.0f);
                this.f887f.setTransitioning(true);
                C0171l c0171l2 = new C0171l();
                float f = -this.f887f.getHeight();
                if (z) {
                    this.f887f.getLocationInWindow(new int[]{0, 0});
                    f -= iArr[1];
                }
                C0615o0 m2256b = AbstractC0605j0.m2256b(this.f887f);
                m2256b.m2205g(f);
                m2256b.m2206f(this.f883A);
                if (!c0171l2.f1259e) {
                    c0171l2.f1255a.add(m2256b);
                }
                if (this.f899r && (view = this.f890i) != null) {
                    C0615o0 m2256b2 = AbstractC0605j0.m2256b(view);
                    m2256b2.m2205g(f);
                    if (!c0171l2.f1259e) {
                        c0171l2.f1255a.add(m2256b2);
                    }
                }
                Interpolator interpolator = f881a;
                boolean z2 = c0171l2.f1259e;
                if (!z2) {
                    c0171l2.f1257c = interpolator;
                }
                if (!z2) {
                    c0171l2.f1256b = 250L;
                }
                InterfaceC0617p0 interfaceC0617p0 = this.f906y;
                if (!z2) {
                    c0171l2.f1258d = interfaceC0617p0;
                }
                this.f903v = c0171l2;
                c0171l2.m2953b();
            }
        } else if (this.f902u) {
        } else {
            this.f902u = true;
            C0171l c0171l3 = this.f903v;
            if (c0171l3 != null) {
                c0171l3.m2954a();
            }
            this.f887f.setVisibility(0);
            if (this.f898q == 0 && (this.f904w || z)) {
                this.f887f.setTranslationY(0.0f);
                float f2 = -this.f887f.getHeight();
                if (z) {
                    this.f887f.getLocationInWindow(new int[]{0, 0});
                    f2 -= iArr2[1];
                }
                this.f887f.setTranslationY(f2);
                C0171l c0171l4 = new C0171l();
                C0615o0 m2256b3 = AbstractC0605j0.m2256b(this.f887f);
                m2256b3.m2205g(0.0f);
                m2256b3.m2206f(this.f883A);
                if (!c0171l4.f1259e) {
                    c0171l4.f1255a.add(m2256b3);
                }
                if (this.f899r && (view3 = this.f890i) != null) {
                    view3.setTranslationY(f2);
                    C0615o0 m2256b4 = AbstractC0605j0.m2256b(this.f890i);
                    m2256b4.m2205g(0.0f);
                    if (!c0171l4.f1259e) {
                        c0171l4.f1255a.add(m2256b4);
                    }
                }
                Interpolator interpolator2 = f882b;
                boolean z3 = c0171l4.f1259e;
                if (!z3) {
                    c0171l4.f1257c = interpolator2;
                }
                if (!z3) {
                    c0171l4.f1256b = 250L;
                }
                InterfaceC0617p0 interfaceC0617p02 = this.f907z;
                if (!z3) {
                    c0171l4.f1258d = interfaceC0617p02;
                }
                this.f903v = c0171l4;
                c0171l4.m2953b();
            } else {
                this.f887f.setAlpha(1.0f);
                this.f887f.setTranslationY(0.0f);
                if (this.f899r && (view2 = this.f890i) != null) {
                    view2.setTranslationY(0.0f);
                }
                this.f907z.mo2203a(null);
            }
            ActionBarOverlayLayout actionBarOverlayLayout = this.f886e;
            if (actionBarOverlayLayout != null) {
                AbstractC0605j0.m2271L(actionBarOverlayLayout);
            }
        }
    }
}