package p010b.p016c.p017k;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Deque;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.xmlpull.v1.XmlPullParser;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.AbstractC0075a;
import p010b.p016c.AbstractC0077c;
import p010b.p016c.AbstractC0080f;
import p010b.p016c.AbstractC0081g;
import p010b.p016c.AbstractC0083i;
import p010b.p016c.AbstractC0084j;
import p010b.p016c.p024p.AbstractC0161b;
import p010b.p016c.p024p.C0163d;
import p010b.p016c.p024p.C0171l;
import p010b.p016c.p024p.p025m.C0192k;
import p010b.p016c.p024p.p025m.C0194l;
import p010b.p016c.p024p.p025m.C0199p;
import p010b.p016c.p024p.p025m.C0202s;
import p010b.p016c.p024p.p025m.InterfaceC0197n;
import p010b.p016c.p026q.AbstractC0245f4;
import p010b.p016c.p026q.AbstractC0257h4;
import p010b.p016c.p026q.C0211a0;
import p010b.p016c.p026q.C0212a1;
import p010b.p016c.p026q.C0215a4;
import p010b.p016c.p026q.C0229d0;
import p010b.p016c.p026q.C0235e0;
import p010b.p016c.p026q.C0241f0;
import p010b.p016c.p026q.C0253h0;
import p010b.p016c.p026q.C0259i0;
import p010b.p016c.p026q.C0270k1;
import p010b.p016c.p026q.C0279m0;
import p010b.p016c.p026q.C0289o0;
import p010b.p016c.p026q.C0298q;
import p010b.p016c.p026q.C0302q3;
import p010b.p016c.p026q.C0322u3;
import p010b.p016c.p026q.InterfaceC0280m1;
import p010b.p016c.p026q.InterfaceC0285n1;
import p010b.p016c.p026q.InterfaceC0315t1;
import p010b.p036g.C0390n;
import p010b.p046j.p047d.AbstractC0472e;
import p010b.p046j.p047d.RunnableC0466b;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.AbstractC0608l;
import p010b.p046j.p058l.C0573c1;
import p010b.p046j.p058l.C0615o0;
import p010b.p046j.p058l.InterfaceC0606k;
import p010b.p072o.InterfaceC0782k;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.c.k.p0 */
/* loaded from: classes.dex */
public class LayoutInflater$Factory2C0120p0 extends AbstractC0131v implements InterfaceC0197n, LayoutInflater.Factory2 {

    /* renamed from: e */
    public static final C0390n f1028e = new C0390n();

    /* renamed from: f */
    public static final boolean f1029f;

    /* renamed from: g */
    public static final int[] f1030g;

    /* renamed from: h */
    public static final boolean f1031h;

    /* renamed from: i */
    public static final boolean f1032i;

    /* renamed from: j */
    public static boolean f1033j;

    /* renamed from: B */
    public boolean f1035B;

    /* renamed from: C */
    public ViewGroup f1036C;

    /* renamed from: D */
    public TextView f1037D;

    /* renamed from: E */
    public View f1038E;

    /* renamed from: F */
    public boolean f1039F;

    /* renamed from: G */
    public boolean f1040G;

    /* renamed from: H */
    public boolean f1041H;

    /* renamed from: I */
    public boolean f1042I;

    /* renamed from: J */
    public boolean f1043J;

    /* renamed from: K */
    public boolean f1044K;

    /* renamed from: L */
    public boolean f1045L;

    /* renamed from: M */
    public boolean f1046M;

    /* renamed from: N */
    public C0116n0[] f1047N;

    /* renamed from: O */
    public C0116n0 f1048O;

    /* renamed from: P */
    public boolean f1049P;

    /* renamed from: Q */
    public boolean f1050Q;

    /* renamed from: R */
    public boolean f1051R;

    /* renamed from: S */
    public boolean f1052S;

    /* renamed from: T */
    public boolean f1053T;

    /* renamed from: U */
    public int f1054U;

    /* renamed from: V */
    public int f1055V;

    /* renamed from: W */
    public boolean f1056W;

    /* renamed from: X */
    public boolean f1057X;

    /* renamed from: Y */
    public AbstractC0110k0 f1058Y;

    /* renamed from: Z */
    public AbstractC0110k0 f1059Z;

    /* renamed from: a0 */
    public boolean f1060a0;

    /* renamed from: b0 */
    public int f1061b0;

    /* renamed from: d0 */
    public boolean f1063d0;

    /* renamed from: e0 */
    public Rect f1064e0;

    /* renamed from: f0 */
    public Rect f1065f0;

    /* renamed from: g0 */
    public C0130u0 f1066g0;

    /* renamed from: h0 */
    public C0132v0 f1067h0;

    /* renamed from: k */
    public final Object f1068k;

    /* renamed from: l */
    public final Context f1069l;

    /* renamed from: m */
    public Window f1070m;

    /* renamed from: n */
    public Window$CallbackC0104h0 f1071n;

    /* renamed from: o */
    public final InterfaceC0129u f1072o;

    /* renamed from: p */
    public AbstractC0091c f1073p;

    /* renamed from: q */
    public MenuInflater f1074q;

    /* renamed from: r */
    public CharSequence f1075r;

    /* renamed from: s */
    public InterfaceC0280m1 f1076s;

    /* renamed from: t */
    public C0098e0 f1077t;

    /* renamed from: u */
    public C0118o0 f1078u;

    /* renamed from: v */
    public AbstractC0161b f1079v;

    /* renamed from: w */
    public ActionBarContextView f1080w;

    /* renamed from: x */
    public PopupWindow f1081x;

    /* renamed from: y */
    public Runnable f1082y;

    /* renamed from: z */
    public C0615o0 f1083z = null;

    /* renamed from: A */
    public boolean f1034A = true;

    /* renamed from: c0 */
    public final Runnable f1062c0 = new RunnableC0135x(this);

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = i < 21;
        f1029f = z;
        f1030g = new int[]{16842836};
        f1031h = !"robolectric".equals(Build.FINGERPRINT);
        f1032i = i >= 17;
        if (!z || f1033j) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new C0133w(Thread.getDefaultUncaughtExceptionHandler()));
        f1033j = true;
    }

    public LayoutInflater$Factory2C0120p0(Context context, Window window, InterfaceC0129u interfaceC0129u, Object obj) {
        AbstractActivityC0127t abstractActivityC0127t;
        this.f1054U = -100;
        this.f1069l = context;
        this.f1072o = interfaceC0129u;
        this.f1068k = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC0127t)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    abstractActivityC0127t = (AbstractActivityC0127t) context;
                    break;
                }
            }
            abstractActivityC0127t = null;
            if (abstractActivityC0127t != null) {
                this.f1054U = ((LayoutInflater$Factory2C0120p0) abstractActivityC0127t.m3026p()).f1054U;
            }
        }
        if (this.f1054U == -100) {
            C0390n c0390n = f1028e;
            Integer num = (Integer) c0390n.getOrDefault(this.f1068k.getClass().getName(), null);
            if (num != null) {
                this.f1054U = num.intValue();
                c0390n.remove(this.f1068k.getClass().getName());
            }
        }
        if (window != null) {
            m3039r(window);
        }
        C0229d0.m2861e();
    }

    /* renamed from: A */
    public final void m3054A() {
        if (this.f1070m == null) {
            Object obj = this.f1068k;
            if (obj instanceof Activity) {
                m3039r(((Activity) obj).getWindow());
            }
        }
        if (this.f1070m == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: B */
    public C0116n0 m3053B(Menu menu) {
        C0116n0[] c0116n0Arr = this.f1047N;
        int length = c0116n0Arr != null ? c0116n0Arr.length : 0;
        for (int i = 0; i < length; i++) {
            C0116n0 c0116n0 = c0116n0Arr[i];
            if (c0116n0 != null && c0116n0.f971h == menu) {
                return c0116n0;
            }
        }
        return null;
    }

    /* renamed from: C */
    public final AbstractC0110k0 m3052C(Context context) {
        if (this.f1058Y == null) {
            if (C0138y0.f1113a == null) {
                Context applicationContext = context.getApplicationContext();
                C0138y0.f1113a = new C0138y0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f1058Y = new C0112l0(this, C0138y0.f1113a);
        }
        return this.f1058Y;
    }

    /* renamed from: D */
    public C0116n0 m3051D(int i) {
        C0116n0[] c0116n0Arr = this.f1047N;
        if (c0116n0Arr == null || c0116n0Arr.length <= i) {
            C0116n0[] c0116n0Arr2 = new C0116n0[i + 1];
            if (c0116n0Arr != null) {
                System.arraycopy(c0116n0Arr, 0, c0116n0Arr2, 0, c0116n0Arr.length);
            }
            this.f1047N = c0116n0Arr2;
            c0116n0Arr = c0116n0Arr2;
        }
        C0116n0 c0116n0 = c0116n0Arr[i];
        if (c0116n0 == null) {
            C0116n0 c0116n02 = new C0116n0(i);
            c0116n0Arr[i] = c0116n02;
            return c0116n02;
        }
        return c0116n0;
    }

    /* renamed from: E */
    public final Window.Callback m3050E() {
        return this.f1070m.getCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3049F() {
        C0096d1 c0096d1;
        AbstractC0091c abstractC0091c;
        m3031z();
        if (!this.f1041H || this.f1073p != null) {
            return;
        }
        Object obj = this.f1068k;
        if (!(obj instanceof Activity)) {
            if (obj instanceof Dialog) {
                c0096d1 = new C0096d1((Dialog) this.f1068k);
            }
            abstractC0091c = this.f1073p;
            if (abstractC0091c == null) {
                boolean z = this.f1063d0;
                C0096d1 c0096d12 = (C0096d1) abstractC0091c;
                if (c0096d12.f891j) {
                    return;
                }
                c0096d12.m3079f(z ? 4 : 0, 4);
                return;
            }
            return;
        }
        c0096d1 = new C0096d1((Activity) this.f1068k, this.f1042I);
        this.f1073p = c0096d1;
        abstractC0091c = this.f1073p;
        if (abstractC0091c == null) {
        }
    }

    /* renamed from: G */
    public final void m3048G(int i) {
        this.f1061b0 = (1 << i) | this.f1061b0;
        if (this.f1060a0) {
            return;
        }
        AbstractC0605j0.m2276G(this.f1070m.getDecorView(), this.f1062c0);
        this.f1060a0 = true;
    }

    /* renamed from: H */
    public int m3047H(Context context, int i) {
        AbstractC0110k0 m3052C;
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f1059Z == null) {
                            this.f1059Z = new C0106i0(this, context);
                        }
                        m3052C = this.f1059Z;
                    }
                } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                } else {
                    m3052C = m3052C(context);
                }
                return m3052C.mo3072c();
            }
            return i;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0151, code lost:
        if (r14 != null) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0158  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3046I(C0116n0 c0116n0, KeyEvent keyEvent) {
        boolean z;
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (c0116n0.f976m || this.f1053T) {
            return;
        }
        if (c0116n0.f964a == 0) {
            if ((this.f1069l.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback m3050E = m3050E();
        if (m3050E != null && !m3050E.onMenuOpened(c0116n0.f964a, c0116n0.f971h)) {
            m3036u(c0116n0, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f1069l.getSystemService("window");
        if (windowManager != null && m3044K(c0116n0, keyEvent)) {
            ViewGroup viewGroup = c0116n0.f968e;
            if (viewGroup == null || c0116n0.f978o) {
                if (viewGroup == null) {
                    m3049F();
                    AbstractC0091c abstractC0091c = this.f1073p;
                    Context mo3083b = abstractC0091c != null ? abstractC0091c.mo3083b() : null;
                    if (mo3083b == null) {
                        mo3083b = this.f1069l;
                    }
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme newTheme = mo3083b.getResources().newTheme();
                    newTheme.setTo(mo3083b.getTheme());
                    newTheme.resolveAttribute(AbstractC0075a.actionBarPopupTheme, typedValue, true);
                    int i2 = typedValue.resourceId;
                    if (i2 != 0) {
                        newTheme.applyStyle(i2, true);
                    }
                    newTheme.resolveAttribute(AbstractC0075a.panelMenuListTheme, typedValue, true);
                    int i3 = typedValue.resourceId;
                    if (i3 == 0) {
                        i3 = AbstractC0083i.Theme_AppCompat_CompactMenu;
                    }
                    newTheme.applyStyle(i3, true);
                    C0163d c0163d = new C0163d(mo3083b, 0);
                    c0163d.getTheme().setTo(newTheme);
                    c0116n0.f973j = c0163d;
                    TypedArray obtainStyledAttributes = c0163d.obtainStyledAttributes(AbstractC0084j.AppCompatTheme);
                    c0116n0.f965b = obtainStyledAttributes.getResourceId(AbstractC0084j.AppCompatTheme_panelBackground, 0);
                    c0116n0.f967d = obtainStyledAttributes.getResourceId(AbstractC0084j.AppCompatTheme_android_windowAnimationStyle, 0);
                    obtainStyledAttributes.recycle();
                    c0116n0.f968e = new C0114m0(this, c0116n0.f973j);
                    c0116n0.f966c = 81;
                } else if (c0116n0.f978o && viewGroup.getChildCount() > 0) {
                    c0116n0.f968e.removeAllViews();
                }
                View view = c0116n0.f970g;
                if (view == null) {
                    if (c0116n0.f971h != null) {
                        if (this.f1078u == null) {
                            this.f1078u = new C0118o0(this);
                        }
                        C0118o0 c0118o0 = this.f1078u;
                        if (c0116n0.f972i == null) {
                            C0194l c0194l = new C0194l(c0116n0.f973j, AbstractC0081g.abc_list_menu_item_layout);
                            c0116n0.f972i = c0194l;
                            c0194l.f1361g = c0118o0;
                            C0199p c0199p = c0116n0.f971h;
                            c0199p.m2937b(c0194l, c0199p.f1372b);
                        }
                        C0194l c0194l2 = c0116n0.f972i;
                        ViewGroup viewGroup2 = c0116n0.f968e;
                        if (c0194l2.f1359e == null) {
                            c0194l2.f1359e = (ExpandedMenuView) c0194l2.f1357c.inflate(AbstractC0081g.abc_expanded_menu_layout, viewGroup2, false);
                            if (c0194l2.f1362h == null) {
                                c0194l2.f1362h = new C0192k(c0194l2);
                            }
                            c0194l2.f1359e.setAdapter((ListAdapter) c0194l2.f1362h);
                            c0194l2.f1359e.setOnItemClickListener(c0194l2);
                        }
                        ExpandedMenuView expandedMenuView = c0194l2.f1359e;
                        c0116n0.f969f = expandedMenuView;
                    }
                    z = false;
                    if (z) {
                        if (c0116n0.f969f != null && (c0116n0.f970g != null || ((C0192k) c0116n0.f972i.m2942b()).getCount() > 0)) {
                            ViewGroup.LayoutParams layoutParams2 = c0116n0.f969f.getLayoutParams();
                            if (layoutParams2 == null) {
                                layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                            }
                            c0116n0.f968e.setBackgroundResource(c0116n0.f965b);
                            ViewParent parent = c0116n0.f969f.getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(c0116n0.f969f);
                            }
                            c0116n0.f968e.addView(c0116n0.f969f, layoutParams2);
                            if (!c0116n0.f969f.hasFocus()) {
                                c0116n0.f969f.requestFocus();
                            }
                        }
                    }
                    c0116n0.f978o = true;
                    return;
                }
                c0116n0.f969f = view;
                z = true;
                if (z) {
                }
                c0116n0.f978o = true;
                return;
            }
            View view2 = c0116n0.f970g;
            if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
                i = -1;
                c0116n0.f975l = false;
                WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
                layoutParams3.gravity = c0116n0.f966c;
                layoutParams3.windowAnimations = c0116n0.f967d;
                windowManager.addView(c0116n0.f968e, layoutParams3);
                c0116n0.f976m = true;
            }
            i = -2;
            c0116n0.f975l = false;
            WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams32.gravity = c0116n0.f966c;
            layoutParams32.windowAnimations = c0116n0.f967d;
            windowManager.addView(c0116n0.f968e, layoutParams32);
            c0116n0.f976m = true;
        }
    }

    /* renamed from: J */
    public final boolean m3045J(C0116n0 c0116n0, int i, KeyEvent keyEvent, int i2) {
        C0199p c0199p;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0116n0.f974k || m3044K(c0116n0, keyEvent)) && (c0199p = c0116n0.f971h) != null) {
            z = c0199p.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f1076s == null) {
            m3036u(c0116n0, true);
        }
        return z;
    }

    /* renamed from: K */
    public final boolean m3044K(C0116n0 c0116n0, KeyEvent keyEvent) {
        InterfaceC0280m1 interfaceC0280m1;
        InterfaceC0280m1 interfaceC0280m12;
        Resources.Theme theme;
        InterfaceC0280m1 interfaceC0280m13;
        InterfaceC0280m1 interfaceC0280m14;
        if (this.f1053T) {
            return false;
        }
        if (c0116n0.f974k) {
            return true;
        }
        C0116n0 c0116n02 = this.f1048O;
        if (c0116n02 != null && c0116n02 != c0116n0) {
            m3036u(c0116n02, false);
        }
        Window.Callback m3050E = m3050E();
        if (m3050E != null) {
            c0116n0.f970g = m3050E.onCreatePanelView(c0116n0.f964a);
        }
        int i = c0116n0.f964a;
        boolean z = i == 0 || i == 108;
        if (z && (interfaceC0280m14 = this.f1076s) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0280m14;
            actionBarOverlayLayout.m3428n();
            ((C0215a4) actionBarOverlayLayout.f209g).f1470m = true;
        }
        if (c0116n0.f970g == null) {
            C0199p c0199p = c0116n0.f971h;
            if (c0199p == null || c0116n0.f979p) {
                if (c0199p == null) {
                    Context context = this.f1069l;
                    int i2 = c0116n0.f964a;
                    if ((i2 == 0 || i2 == 108) && this.f1076s != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(AbstractC0075a.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(AbstractC0075a.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(AbstractC0075a.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            C0163d c0163d = new C0163d(context, 0);
                            c0163d.getTheme().setTo(theme);
                            context = c0163d;
                        }
                    }
                    C0199p c0199p2 = new C0199p(context);
                    c0199p2.f1376f = this;
                    c0116n0.m3070a(c0199p2);
                    if (c0116n0.f971h == null) {
                        return false;
                    }
                }
                if (z && (interfaceC0280m12 = this.f1076s) != null) {
                    if (this.f1077t == null) {
                        this.f1077t = new C0098e0(this);
                    }
                    ((ActionBarOverlayLayout) interfaceC0280m12).m3427o(c0116n0.f971h, this.f1077t);
                }
                c0116n0.f971h.m2938A();
                if (!m3050E.onCreatePanelMenu(c0116n0.f964a, c0116n0.f971h)) {
                    c0116n0.m3070a(null);
                    if (z && (interfaceC0280m1 = this.f1076s) != null) {
                        ((ActionBarOverlayLayout) interfaceC0280m1).m3427o(null, this.f1077t);
                    }
                    return false;
                }
                c0116n0.f979p = false;
            }
            c0116n0.f971h.m2938A();
            Bundle bundle = c0116n0.f980q;
            if (bundle != null) {
                c0116n0.f971h.m2917v(bundle);
                c0116n0.f980q = null;
            }
            if (!m3050E.onPreparePanel(0, c0116n0.f970g, c0116n0.f971h)) {
                if (z && (interfaceC0280m13 = this.f1076s) != null) {
                    ((ActionBarOverlayLayout) interfaceC0280m13).m3427o(null, this.f1077t);
                }
                c0116n0.f971h.m2913z();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            c0116n0.f977n = z2;
            c0116n0.f971h.setQwertyMode(z2);
            c0116n0.f971h.m2913z();
        }
        c0116n0.f974k = true;
        c0116n0.f975l = false;
        this.f1048O = c0116n0;
        return true;
    }

    /* renamed from: L */
    public final boolean m3043L() {
        ViewGroup viewGroup;
        return this.f1035B && (viewGroup = this.f1036C) != null && AbstractC0605j0.m2232z(viewGroup);
    }

    /* renamed from: M */
    public final void m3042M() {
        if (this.f1035B) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: N */
    public final int m3041N(C0573c1 c0573c1, Rect rect) {
        boolean z;
        boolean z2;
        Context context;
        int i;
        int m2323d = c0573c1 != null ? c0573c1.m2323d() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f1080w;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1080w.getLayoutParams();
            if (this.f1080w.isShown()) {
                if (this.f1064e0 == null) {
                    this.f1064e0 = new Rect();
                    this.f1065f0 = new Rect();
                }
                Rect rect2 = this.f1064e0;
                Rect rect3 = this.f1065f0;
                if (c0573c1 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(c0573c1.m2325b(), c0573c1.m2323d(), c0573c1.m2324c(), c0573c1.m2326a());
                }
                ViewGroup viewGroup = this.f1036C;
                Method method = AbstractC0257h4.f1595a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect2, rect3);
                    } catch (Exception unused) {
                    }
                }
                int i2 = rect2.top;
                int i3 = rect2.left;
                int i4 = rect2.right;
                C0573c1 m2236v = AbstractC0605j0.m2236v(this.f1036C);
                int m2325b = m2236v == null ? 0 : m2236v.m2325b();
                int m2324c = m2236v == null ? 0 : m2236v.m2324c();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                if (i2 <= 0 || this.f1038E != null) {
                    View view = this.f1038E;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != m2325b || marginLayoutParams2.rightMargin != m2324c) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = m2325b;
                            marginLayoutParams2.rightMargin = m2324c;
                            this.f1038E.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f1069l);
                    this.f1038E = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = m2325b;
                    layoutParams.rightMargin = m2324c;
                    this.f1036C.addView(this.f1038E, -1, layoutParams);
                }
                View view3 = this.f1038E;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    View view4 = this.f1038E;
                    if ((AbstractC0605j0.m2234x(view4) & 8192) != 0) {
                        context = this.f1069l;
                        i = AbstractC0077c.abc_decor_view_status_guard_light;
                    } else {
                        context = this.f1069l;
                        i = AbstractC0077c.abc_decor_view_status_guard;
                    }
                    view4.setBackgroundColor(AbstractC0472e.m2431b(context, i));
                }
                if (!this.f1043J && z) {
                    m2323d = 0;
                }
                r5 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                r5 = false;
            }
            if (r5) {
                this.f1080w.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = this.f1038E;
        if (view5 != null) {
            view5.setVisibility(z ? 0 : 8);
        }
        return m2323d;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0197n
    /* renamed from: a */
    public boolean mo639a(C0199p c0199p, MenuItem menuItem) {
        C0116n0 m3053B;
        Window.Callback m3050E = m3050E();
        if (m3050E == null || this.f1053T || (m3053B = m3053B(c0199p.mo2928k())) == null) {
            return false;
        }
        return m3050E.onMenuItemSelected(m3053B.f964a, menuItem);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
        if (r6 == false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    @Override // p010b.p016c.p024p.p025m.InterfaceC0197n
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo638b(C0199p c0199p) {
        boolean z;
        InterfaceC0280m1 interfaceC0280m1 = this.f1076s;
        if (interfaceC0280m1 != null && ((ActionBarOverlayLayout) interfaceC0280m1).m3434h()) {
            if (ViewConfiguration.get(this.f1069l).hasPermanentMenuKey()) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1076s;
                actionBarOverlayLayout.m3428n();
                ActionMenuView actionMenuView = ((C0215a4) actionBarOverlayLayout.f209g).f1458a.f367b;
                if (actionMenuView != null) {
                    C0298q c0298q = actionMenuView.f236u;
                    if (c0298q != null) {
                        if (c0298q.f1725x != null || c0298q.m2760p()) {
                            z = true;
                            boolean z2 = z;
                        }
                    }
                    z = false;
                    if (z) {
                    }
                }
            }
            Window.Callback m3050E = m3050E();
            if (((ActionBarOverlayLayout) this.f1076s).m3429m()) {
                ((ActionBarOverlayLayout) this.f1076s).m3432j();
                if (this.f1053T) {
                    return;
                }
                m3050E.onPanelClosed(108, m3051D(0).f971h);
                return;
            } else if (m3050E == null || this.f1053T) {
                return;
            } else {
                if (this.f1060a0 && (1 & this.f1061b0) != 0) {
                    this.f1070m.getDecorView().removeCallbacks(this.f1062c0);
                    this.f1062c0.run();
                }
                C0116n0 m3051D = m3051D(0);
                C0199p c0199p2 = m3051D.f971h;
                if (c0199p2 == null || m3051D.f979p || !m3050E.onPreparePanel(0, m3051D.f970g, c0199p2)) {
                    return;
                }
                m3050E.onMenuOpened(108, m3051D.f971h);
                ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f1076s;
                actionBarOverlayLayout2.m3428n();
                ((C0215a4) actionBarOverlayLayout2.f209g).f1458a.m3374u();
                return;
            }
        }
        C0116n0 m3051D2 = m3051D(0);
        m3051D2.f978o = true;
        m3036u(m3051D2, false);
        m3046I(m3051D2, null);
    }

    @Override // p010b.p016c.p017k.AbstractC0131v
    /* renamed from: c */
    public void mo3016c(View view, ViewGroup.LayoutParams layoutParams) {
        m3031z();
        ((ViewGroup) this.f1036C.findViewById(16908290)).addView(view, layoutParams);
        this.f1071n.f922b.onContentChanged();
    }

    @Override // p010b.p016c.p017k.AbstractC0131v
    /* renamed from: d */
    public boolean mo3015d() {
        return m3040q(true);
    }

    @Override // p010b.p016c.p017k.AbstractC0131v
    /* renamed from: e */
    public void mo3014e() {
        LayoutInflater from = LayoutInflater.from(this.f1069l);
        if (from.getFactory() == null) {
            AbstractC0022t.m3504b0(from, this);
        } else {
            boolean z = from.getFactory2() instanceof LayoutInflater$Factory2C0120p0;
        }
    }

    @Override // p010b.p016c.p017k.AbstractC0131v
    /* renamed from: f */
    public void mo3013f() {
        m3049F();
        AbstractC0091c abstractC0091c = this.f1073p;
        m3048G(0);
    }

    @Override // p010b.p016c.p017k.AbstractC0131v
    /* renamed from: g */
    public void mo3012g(Bundle bundle) {
        this.f1050Q = true;
        m3040q(false);
        m3054A();
        Object obj = this.f1068k;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                try {
                    str = AbstractC0022t.m3525I(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                AbstractC0091c abstractC0091c = this.f1073p;
                if (abstractC0091c == null) {
                    this.f1063d0 = true;
                } else {
                    C0096d1 c0096d1 = (C0096d1) abstractC0091c;
                    if (!c0096d1.f891j) {
                        c0096d1.m3079f(4, 4);
                    }
                }
            }
            synchronized (AbstractC0131v.f1102d) {
                AbstractC0131v.m3009j(this);
                AbstractC0131v.f1101c.add(new WeakReference(this));
            }
        }
        this.f1051R = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // p010b.p016c.p017k.AbstractC0131v
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo3011h() {
        AbstractC0091c abstractC0091c;
        AbstractC0110k0 abstractC0110k0;
        AbstractC0110k0 abstractC0110k02;
        if (this.f1068k instanceof Activity) {
            synchronized (AbstractC0131v.f1102d) {
                AbstractC0131v.m3009j(this);
            }
        }
        if (this.f1060a0) {
            this.f1070m.getDecorView().removeCallbacks(this.f1062c0);
        }
        this.f1052S = false;
        this.f1053T = true;
        if (this.f1054U != -100) {
            Object obj = this.f1068k;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f1028e.put(this.f1068k.getClass().getName(), Integer.valueOf(this.f1054U));
                abstractC0091c = this.f1073p;
                if (abstractC0091c != null) {
                    abstractC0091c.getClass();
                }
                abstractC0110k0 = this.f1058Y;
                if (abstractC0110k0 != null) {
                    abstractC0110k0.m3075a();
                }
                abstractC0110k02 = this.f1059Z;
                if (abstractC0110k02 == null) {
                    abstractC0110k02.m3075a();
                    return;
                }
                return;
            }
        }
        f1028e.remove(this.f1068k.getClass().getName());
        abstractC0091c = this.f1073p;
        if (abstractC0091c != null) {
        }
        abstractC0110k0 = this.f1058Y;
        if (abstractC0110k0 != null) {
        }
        abstractC0110k02 = this.f1059Z;
        if (abstractC0110k02 == null) {
        }
    }

    @Override // p010b.p016c.p017k.AbstractC0131v
    /* renamed from: i */
    public void mo3010i() {
        this.f1052S = false;
        m3049F();
        AbstractC0091c abstractC0091c = this.f1073p;
        if (abstractC0091c != null) {
            C0096d1 c0096d1 = (C0096d1) abstractC0091c;
            c0096d1.f904w = false;
            C0171l c0171l = c0096d1.f903v;
            if (c0171l != null) {
                c0171l.m2954a();
            }
        }
    }

    @Override // p010b.p016c.p017k.AbstractC0131v
    /* renamed from: k */
    public boolean mo3008k(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.f1045L && i == 108) {
            return false;
        }
        if (this.f1041H && i == 1) {
            this.f1041H = false;
        }
        if (i == 1) {
            m3042M();
            this.f1045L = true;
            return true;
        } else if (i == 2) {
            m3042M();
            this.f1039F = true;
            return true;
        } else if (i == 5) {
            m3042M();
            this.f1040G = true;
            return true;
        } else if (i == 10) {
            m3042M();
            this.f1043J = true;
            return true;
        } else if (i == 108) {
            m3042M();
            this.f1041H = true;
            return true;
        } else if (i != 109) {
            return this.f1070m.requestFeature(i);
        } else {
            m3042M();
            this.f1042I = true;
            return true;
        }
    }

    @Override // p010b.p016c.p017k.AbstractC0131v
    /* renamed from: l */
    public void mo3007l(int i) {
        m3031z();
        ViewGroup viewGroup = (ViewGroup) this.f1036C.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1069l).inflate(i, viewGroup);
        this.f1071n.f922b.onContentChanged();
    }

    @Override // p010b.p016c.p017k.AbstractC0131v
    /* renamed from: m */
    public void mo3006m(View view) {
        m3031z();
        ViewGroup viewGroup = (ViewGroup) this.f1036C.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1071n.f922b.onContentChanged();
    }

    @Override // p010b.p016c.p017k.AbstractC0131v
    /* renamed from: n */
    public void mo3005n(View view, ViewGroup.LayoutParams layoutParams) {
        m3031z();
        ViewGroup viewGroup = (ViewGroup) this.f1036C.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1071n.f922b.onContentChanged();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01b7, code lost:
        if (r13.equals("TextView") == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ba, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r15).getDepth() > 1) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x023b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0278 A[Catch: all -> 0x0284, Exception -> 0x028c, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x028c, all -> 0x0284, blocks: (B:165:0x024b, B:168:0x025a, B:170:0x025f, B:175:0x0278), top: B:201:0x024b }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0089 A[EDGE_INSN: B:202:0x0089->B:35:0x0089 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084 A[LOOP:0: B:21:0x005e->B:33:0x0084, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x015b  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        C0130u0 c0130u0;
        C0163d context2;
        int resourceId;
        View c0279m0;
        boolean z2;
        XmlPullParser xmlPullParser;
        boolean z3;
        boolean z4;
        C0130u0 c0130u02;
        if (this.f1066g0 == null) {
            String string = this.f1069l.obtainStyledAttributes(AbstractC0084j.AppCompatTheme).getString(AbstractC0084j.AppCompatTheme_viewInflaterClass);
            if (string == null) {
                c0130u02 = new C0130u0();
            } else {
                try {
                    this.f1066g0 = (C0130u0) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable unused) {
                    c0130u02 = new C0130u0();
                }
            }
            this.f1066g0 = c0130u02;
        }
        View view2 = null;
        char c = 3;
        if (f1029f) {
            if (this.f1067h0 == null) {
                this.f1067h0 = new C0132v0();
            }
            C0132v0 c0132v0 = this.f1067h0;
            c0132v0.getClass();
            boolean z5 = attributeSet instanceof XmlPullParser;
            if (z5) {
                XmlPullParser xmlPullParser2 = (XmlPullParser) attributeSet;
                if (xmlPullParser2.getDepth() == 1) {
                    Deque deque = c0132v0.f1103a;
                    while (true) {
                        if (deque.isEmpty()) {
                            xmlPullParser = null;
                            break;
                        }
                        xmlPullParser = (XmlPullParser) ((WeakReference) deque.peek()).get();
                        if (xmlPullParser != null) {
                            if (xmlPullParser.getEventType() != 3 && xmlPullParser.getEventType() != 1) {
                                z4 = false;
                                if (z4) {
                                    break;
                                }
                                deque.pop();
                            }
                        }
                        z4 = true;
                        if (z4) {
                        }
                    }
                    c0132v0.f1103a.push(new WeakReference(xmlPullParser2));
                    if (xmlPullParser != null && xmlPullParser2 != xmlPullParser) {
                        if (xmlPullParser.getEventType() == 2) {
                            z3 = "include".equals(xmlPullParser.getName());
                            if (z3) {
                                z2 = true;
                                if (!z2) {
                                    if (!z5) {
                                        ViewParent viewParent = (ViewParent) view;
                                        if (viewParent != null) {
                                            View decorView = this.f1070m.getDecorView();
                                            while (viewParent != null) {
                                                if (viewParent != decorView && (viewParent instanceof View) && !AbstractC0605j0.m2233y((View) viewParent)) {
                                                    viewParent = viewParent.getParent();
                                                }
                                            }
                                        }
                                    }
                                    c0130u0 = this.f1066g0;
                                    boolean z6 = f1029f;
                                    int i = AbstractC0245f4.f1584a;
                                    c0130u0.getClass();
                                    context2 = (z || view == null) ? context : view.getContext();
                                    TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC0084j.View, 0, 0);
                                    resourceId = !z6 ? obtainStyledAttributes.getResourceId(AbstractC0084j.View_android_theme, 0) : 0;
                                    if (resourceId == 0) {
                                        resourceId = obtainStyledAttributes.getResourceId(AbstractC0084j.View_theme, 0);
                                    }
                                    obtainStyledAttributes.recycle();
                                    if (resourceId != 0 && (!(context2 instanceof C0163d) || ((C0163d) context2).f1194a != resourceId)) {
                                        context2 = new C0163d(context2, resourceId);
                                    }
                                    str.hashCode();
                                    switch (str.hashCode()) {
                                        case -1946472170:
                                            if (str.equals("RatingBar")) {
                                                c = 0;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1455429095:
                                            if (str.equals("CheckedTextView")) {
                                                c = 1;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -1346021293:
                                            if (str.equals("MultiAutoCompleteTextView")) {
                                                c = 2;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -938935918:
                                            break;
                                        case -937446323:
                                            if (str.equals("ImageButton")) {
                                                c = 4;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -658531749:
                                            if (str.equals("SeekBar")) {
                                                c = 5;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case -339785223:
                                            if (str.equals("Spinner")) {
                                                c = 6;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 776382189:
                                            if (str.equals("RadioButton")) {
                                                c = 7;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 799298502:
                                            if (str.equals("ToggleButton")) {
                                                c = '\b';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1125864064:
                                            if (str.equals("ImageView")) {
                                                c = '\t';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1413872058:
                                            if (str.equals("AutoCompleteTextView")) {
                                                c = '\n';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1601505219:
                                            if (str.equals("CheckBox")) {
                                                c = 11;
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 1666676343:
                                            if (str.equals("EditText")) {
                                                c = '\f';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        case 2001146706:
                                            if (str.equals("Button")) {
                                                c = '\r';
                                                break;
                                            }
                                            c = 65535;
                                            break;
                                        default:
                                            c = 65535;
                                            break;
                                    }
                                    switch (c) {
                                        case 0:
                                            c0279m0 = new C0279m0(context2, attributeSet);
                                            c0130u0.m3017h(c0279m0, str);
                                            break;
                                        case 1:
                                            c0279m0 = new C0211a0(context2, attributeSet);
                                            c0130u0.m3017h(c0279m0, str);
                                            break;
                                        case 2:
                                            c0279m0 = new C0259i0(context2, attributeSet);
                                            c0130u0.m3017h(c0279m0, str);
                                            break;
                                        case 3:
                                            c0279m0 = c0130u0.mo231e(context2, attributeSet);
                                            c0130u0.m3017h(c0279m0, str);
                                            break;
                                        case 4:
                                            c0279m0 = new C0241f0(context2, attributeSet, AbstractC0075a.imageButtonStyle);
                                            c0130u0.m3017h(c0279m0, str);
                                            break;
                                        case 5:
                                            c0279m0 = new C0289o0(context2, attributeSet);
                                            c0130u0.m3017h(c0279m0, str);
                                            break;
                                        case 6:
                                            c0279m0 = new C0212a1(context2, attributeSet);
                                            c0130u0.m3017h(c0279m0, str);
                                            break;
                                        case 7:
                                            c0279m0 = c0130u0.mo232d(context2, attributeSet);
                                            c0130u0.m3017h(c0279m0, str);
                                            break;
                                        case '\b':
                                            c0279m0 = new C0270k1(context2, attributeSet);
                                            c0130u0.m3017h(c0279m0, str);
                                            break;
                                        case '\t':
                                            c0279m0 = new C0253h0(context2, attributeSet, 0);
                                            c0130u0.m3017h(c0279m0, str);
                                            break;
                                        case '\n':
                                            c0279m0 = c0130u0.mo235a(context2, attributeSet);
                                            c0130u0.m3017h(c0279m0, str);
                                            break;
                                        case 11:
                                            c0279m0 = c0130u0.mo233c(context2, attributeSet);
                                            c0130u0.m3017h(c0279m0, str);
                                            break;
                                        case '\f':
                                            c0279m0 = new C0235e0(context2, attributeSet, AbstractC0075a.editTextStyle);
                                            c0130u0.m3017h(c0279m0, str);
                                            break;
                                        case '\r':
                                            c0279m0 = c0130u0.mo234b(context2, attributeSet);
                                            c0130u0.m3017h(c0279m0, str);
                                            break;
                                        default:
                                            c0279m0 = c0130u0.m3019f();
                                            break;
                                    }
                                    if (c0279m0 == null && context != context2) {
                                        if (str.equals("view")) {
                                            str = attributeSet.getAttributeValue(null, "class");
                                        }
                                        try {
                                            Object[] objArr = c0130u0.f1099e;
                                            objArr[0] = context2;
                                            objArr[1] = attributeSet;
                                            if (-1 != str.indexOf(46)) {
                                                int i2 = 0;
                                                while (true) {
                                                    String[] strArr = C0130u0.f1097c;
                                                    if (i2 < strArr.length) {
                                                        c0279m0 = c0130u0.m3018g(context2, str, strArr[i2]);
                                                        if (c0279m0 == null) {
                                                            i2++;
                                                        }
                                                    }
                                                }
                                            } else {
                                                View m3018g = c0130u0.m3018g(context2, str, null);
                                                Object[] objArr2 = c0130u0.f1099e;
                                                objArr2[0] = null;
                                                objArr2[1] = null;
                                                view2 = m3018g;
                                            }
                                        } catch (Exception unused2) {
                                        } finally {
                                            Object[] objArr3 = c0130u0.f1099e;
                                            objArr3[0] = null;
                                            objArr3[1] = null;
                                        }
                                        if (view2 != null) {
                                            Context context3 = view2.getContext();
                                            if (context3 instanceof ContextWrapper) {
                                                AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
                                                if (view2.hasOnClickListeners()) {
                                                    TypedArray obtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet, C0130u0.f1096b);
                                                    String string2 = obtainStyledAttributes2.getString(0);
                                                    if (string2 != null) {
                                                        view2.setOnClickListener(new View$OnClickListenerC0128t0(view2, string2));
                                                    }
                                                    obtainStyledAttributes2.recycle();
                                                }
                                            }
                                        }
                                        return view2;
                                    }
                                    view2 = c0279m0;
                                    if (view2 != null) {
                                    }
                                    return view2;
                                }
                                z = true;
                                c0130u0 = this.f1066g0;
                                boolean z62 = f1029f;
                                int i3 = AbstractC0245f4.f1584a;
                                c0130u0.getClass();
                                if (z) {
                                }
                                TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, AbstractC0084j.View, 0, 0);
                                if (!z62) {
                                }
                                if (resourceId == 0) {
                                }
                                obtainStyledAttributes3.recycle();
                                if (resourceId != 0) {
                                    context2 = new C0163d(context2, resourceId);
                                }
                                str.hashCode();
                                switch (str.hashCode()) {
                                    case -1946472170:
                                        break;
                                    case -1455429095:
                                        break;
                                    case -1346021293:
                                        break;
                                    case -938935918:
                                        break;
                                    case -937446323:
                                        break;
                                    case -658531749:
                                        break;
                                    case -339785223:
                                        break;
                                    case 776382189:
                                        break;
                                    case 799298502:
                                        break;
                                    case 1125864064:
                                        break;
                                    case 1413872058:
                                        break;
                                    case 1601505219:
                                        break;
                                    case 1666676343:
                                        break;
                                    case 2001146706:
                                        break;
                                }
                                switch (c) {
                                }
                                if (c0279m0 == null) {
                                    if (str.equals("view")) {
                                    }
                                    Object[] objArr4 = c0130u0.f1099e;
                                    objArr4[0] = context2;
                                    objArr4[1] = attributeSet;
                                    if (-1 != str.indexOf(46)) {
                                    }
                                    if (view2 != null) {
                                    }
                                    return view2;
                                }
                                view2 = c0279m0;
                                if (view2 != null) {
                                }
                                return view2;
                            }
                        }
                    }
                    z3 = false;
                    if (z3) {
                    }
                }
            }
            z2 = false;
            if (!z2) {
            }
            z = true;
            c0130u0 = this.f1066g0;
            boolean z622 = f1029f;
            int i32 = AbstractC0245f4.f1584a;
            c0130u0.getClass();
            if (z) {
            }
            TypedArray obtainStyledAttributes32 = context2.obtainStyledAttributes(attributeSet, AbstractC0084j.View, 0, 0);
            if (!z622) {
            }
            if (resourceId == 0) {
            }
            obtainStyledAttributes32.recycle();
            if (resourceId != 0) {
            }
            str.hashCode();
            switch (str.hashCode()) {
                case -1946472170:
                    break;
                case -1455429095:
                    break;
                case -1346021293:
                    break;
                case -938935918:
                    break;
                case -937446323:
                    break;
                case -658531749:
                    break;
                case -339785223:
                    break;
                case 776382189:
                    break;
                case 799298502:
                    break;
                case 1125864064:
                    break;
                case 1413872058:
                    break;
                case 1601505219:
                    break;
                case 1666676343:
                    break;
                case 2001146706:
                    break;
            }
            switch (c) {
            }
            if (c0279m0 == null) {
            }
            view2 = c0279m0;
            if (view2 != null) {
            }
            return view2;
        }
        z = false;
        c0130u0 = this.f1066g0;
        boolean z6222 = f1029f;
        int i322 = AbstractC0245f4.f1584a;
        c0130u0.getClass();
        if (z) {
        }
        TypedArray obtainStyledAttributes322 = context2.obtainStyledAttributes(attributeSet, AbstractC0084j.View, 0, 0);
        if (!z6222) {
        }
        if (resourceId == 0) {
        }
        obtainStyledAttributes322.recycle();
        if (resourceId != 0) {
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1946472170:
                break;
            case -1455429095:
                break;
            case -1346021293:
                break;
            case -938935918:
                break;
            case -937446323:
                break;
            case -658531749:
                break;
            case -339785223:
                break;
            case 776382189:
                break;
            case 799298502:
                break;
            case 1125864064:
                break;
            case 1413872058:
                break;
            case 1601505219:
                break;
            case 1666676343:
                break;
            case 2001146706:
                break;
        }
        switch (c) {
        }
        if (c0279m0 == null) {
        }
        view2 = c0279m0;
        if (view2 != null) {
        }
        return view2;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // p010b.p016c.p017k.AbstractC0131v
    /* renamed from: p */
    public final void mo3003p(CharSequence charSequence) {
        this.f1075r = charSequence;
        InterfaceC0280m1 interfaceC0280m1 = this.f1076s;
        if (interfaceC0280m1 != null) {
            interfaceC0280m1.setWindowTitle(charSequence);
            return;
        }
        AbstractC0091c abstractC0091c = this.f1073p;
        if (abstractC0091c != null) {
            abstractC0091c.mo3082c(charSequence);
            return;
        }
        TextView textView = this.f1037D;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x01c2, code lost:
        if ((((p010b.p072o.C0784m) ((p010b.p072o.InterfaceC0782k) r13).mo1826g()).f3283b.compareTo(p010b.p072o.EnumC0778g.STARTED) >= 0) != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01c7, code lost:
        if (r12.f1052S != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01c9, code lost:
        r13.onConfigurationChanged(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c0, code lost:
        if (p010b.p046j.p047d.AbstractC0477j.m2426b(r13) == false) goto L143;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ca A[ADDED_TO_REGION] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3040q(boolean z) {
        boolean z2;
        int i;
        int i2;
        boolean z3;
        Object obj;
        Object obj2;
        int i3;
        if (this.f1053T) {
            return false;
        }
        int i4 = this.f1054U;
        if (i4 == -100) {
            i4 = AbstractC0131v.f1100b;
        }
        Map map = null;
        r4 = null;
        r4 = null;
        Object obj3 = null;
        Object obj4 = null;
        Configuration m3035v = m3035v(this.f1069l, m3047H(this.f1069l, i4), null);
        boolean z4 = true;
        if (!this.f1057X && (this.f1068k instanceof Activity)) {
            PackageManager packageManager = this.f1069l.getPackageManager();
            if (packageManager == null) {
                z2 = false;
                i = this.f1069l.getResources().getConfiguration().uiMode & 48;
                i2 = m3035v.uiMode & 48;
                if (i != i2 && z && !z2 && this.f1050Q && (f1031h || this.f1051R)) {
                    obj2 = this.f1068k;
                    if ((obj2 instanceof Activity) && !((Activity) obj2).isChild()) {
                        Activity activity = (Activity) this.f1068k;
                        Object obj5 = AbstractC0472e.f2456a;
                        i3 = Build.VERSION.SDK_INT;
                        if (i3 < 28) {
                            if (i3 <= 23) {
                                new Handler(activity.getMainLooper()).post(new RunnableC0466b(activity));
                            }
                            z3 = true;
                            if (!z3 || i == i2) {
                                z4 = z3;
                            } else {
                                Resources resources = this.f1069l.getResources();
                                Configuration configuration = new Configuration(resources.getConfiguration());
                                configuration.uiMode = i2 | (resources.getConfiguration().uiMode & (-49));
                                resources.updateConfiguration(configuration, null);
                                int i5 = Build.VERSION.SDK_INT;
                                if (i5 < 26 && i5 < 28) {
                                    if (i5 >= 24) {
                                        if (!AbstractC0022t.f45h) {
                                            try {
                                                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                                                AbstractC0022t.f44g = declaredField;
                                                declaredField.setAccessible(true);
                                            } catch (NoSuchFieldException unused) {
                                            }
                                            AbstractC0022t.f45h = true;
                                        }
                                        Field field = AbstractC0022t.f44g;
                                        if (field != null) {
                                            try {
                                                obj = field.get(resources);
                                            } catch (IllegalAccessException unused2) {
                                                obj = null;
                                            }
                                            if (obj != null) {
                                                if (!AbstractC0022t.f39b) {
                                                    try {
                                                        Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                                        AbstractC0022t.f38a = declaredField2;
                                                        declaredField2.setAccessible(true);
                                                    } catch (NoSuchFieldException unused3) {
                                                    }
                                                    AbstractC0022t.f39b = true;
                                                }
                                                Field field2 = AbstractC0022t.f38a;
                                                if (field2 != null) {
                                                    try {
                                                        obj3 = field2.get(obj);
                                                    } catch (IllegalAccessException unused4) {
                                                    }
                                                }
                                                if (obj3 != null) {
                                                    AbstractC0022t.m3462x(obj3);
                                                }
                                            }
                                        }
                                    } else if (i5 >= 23) {
                                        if (!AbstractC0022t.f39b) {
                                            try {
                                                Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                                                AbstractC0022t.f38a = declaredField3;
                                                declaredField3.setAccessible(true);
                                            } catch (NoSuchFieldException unused5) {
                                            }
                                            AbstractC0022t.f39b = true;
                                        }
                                        Field field3 = AbstractC0022t.f38a;
                                        if (field3 != null) {
                                            try {
                                                obj4 = field3.get(resources);
                                            } catch (IllegalAccessException unused6) {
                                            }
                                        }
                                        if (obj4 != null) {
                                            AbstractC0022t.m3462x(obj4);
                                        }
                                    } else if (i5 >= 21) {
                                        if (!AbstractC0022t.f39b) {
                                            try {
                                                Field declaredField4 = Resources.class.getDeclaredField("mDrawableCache");
                                                AbstractC0022t.f38a = declaredField4;
                                                declaredField4.setAccessible(true);
                                            } catch (NoSuchFieldException unused7) {
                                            }
                                            AbstractC0022t.f39b = true;
                                        }
                                        Field field4 = AbstractC0022t.f38a;
                                        if (field4 != null) {
                                            try {
                                                map = (Map) field4.get(resources);
                                            } catch (IllegalAccessException unused8) {
                                            }
                                            if (map != null) {
                                                map.clear();
                                            }
                                        }
                                    }
                                }
                                int i6 = this.f1055V;
                                if (i6 != 0) {
                                    this.f1069l.setTheme(i6);
                                    if (Build.VERSION.SDK_INT >= 23) {
                                        this.f1069l.getTheme().applyStyle(this.f1055V, true);
                                    }
                                }
                                if (z2) {
                                    Object obj6 = this.f1068k;
                                    if (obj6 instanceof Activity) {
                                        Activity activity2 = (Activity) obj6;
                                        if (activity2 instanceof InterfaceC0782k) {
                                        }
                                    }
                                }
                            }
                            if (z4) {
                                Object obj7 = this.f1068k;
                                if (obj7 instanceof AbstractActivityC0127t) {
                                    ((AbstractActivityC0127t) obj7).m3024r();
                                }
                            }
                            if (i4 == 0) {
                                m3052C(this.f1069l).m3074e();
                            } else {
                                AbstractC0110k0 abstractC0110k0 = this.f1058Y;
                                if (abstractC0110k0 != null) {
                                    abstractC0110k0.m3075a();
                                }
                            }
                            if (i4 == 3) {
                                Context context = this.f1069l;
                                if (this.f1059Z == null) {
                                    this.f1059Z = new C0106i0(this, context);
                                }
                                this.f1059Z.m3074e();
                            } else {
                                AbstractC0110k0 abstractC0110k02 = this.f1059Z;
                                if (abstractC0110k02 != null) {
                                    abstractC0110k02.m3075a();
                                }
                            }
                            return z4;
                        }
                        activity.recreate();
                        z3 = true;
                        if (z3) {
                        }
                        z4 = z3;
                        if (z4) {
                        }
                        if (i4 == 0) {
                        }
                        if (i4 == 3) {
                        }
                        return z4;
                    }
                }
                z3 = false;
                if (z3) {
                }
                z4 = z3;
                if (z4) {
                }
                if (i4 == 0) {
                }
                if (i4 == 3) {
                }
                return z4;
            }
            try {
                int i7 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f1069l, this.f1068k.getClass()), i7 >= 29 ? 269221888 : i7 >= 24 ? 786432 : 0);
                this.f1056W = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException unused9) {
                this.f1056W = false;
            }
        }
        this.f1057X = true;
        z2 = this.f1056W;
        i = this.f1069l.getResources().getConfiguration().uiMode & 48;
        i2 = m3035v.uiMode & 48;
        if (i != i2) {
            obj2 = this.f1068k;
            if (obj2 instanceof Activity) {
                Activity activity3 = (Activity) this.f1068k;
                Object obj52 = AbstractC0472e.f2456a;
                i3 = Build.VERSION.SDK_INT;
                if (i3 < 28) {
                }
                activity3.recreate();
                z3 = true;
                if (z3) {
                }
                z4 = z3;
                if (z4) {
                }
                if (i4 == 0) {
                }
                if (i4 == 3) {
                }
                return z4;
            }
        }
        z3 = false;
        if (z3) {
        }
        z4 = z3;
        if (z4) {
        }
        if (i4 == 0) {
        }
        if (i4 == 3) {
        }
        return z4;
    }

    /* renamed from: r */
    public final void m3039r(Window window) {
        if (this.f1070m != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof Window$CallbackC0104h0) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window$CallbackC0104h0 window$CallbackC0104h0 = new Window$CallbackC0104h0(this, callback);
        this.f1071n = window$CallbackC0104h0;
        window.setCallback(window$CallbackC0104h0);
        C0302q3 m2741q = C0302q3.m2741q(this.f1069l, null, f1030g);
        Drawable m2750h = m2741q.m2750h(0);
        if (m2750h != null) {
            window.setBackgroundDrawable(m2750h);
        }
        m2741q.f1740b.recycle();
        this.f1070m = window;
    }

    /* renamed from: s */
    public void m3038s(int i, C0116n0 c0116n0, Menu menu) {
        if (menu == null && c0116n0 != null) {
            menu = c0116n0.f971h;
        }
        if ((c0116n0 == null || c0116n0.f976m) && !this.f1053T) {
            this.f1071n.f922b.onPanelClosed(i, menu);
        }
    }

    /* renamed from: t */
    public void m3037t(C0199p c0199p) {
        C0298q c0298q;
        if (this.f1046M) {
            return;
        }
        this.f1046M = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1076s;
        actionBarOverlayLayout.m3428n();
        ActionMenuView actionMenuView = ((C0215a4) actionBarOverlayLayout.f209g).f1458a.f367b;
        if (actionMenuView != null && (c0298q = actionMenuView.f236u) != null) {
            c0298q.m2765b();
        }
        Window.Callback m3050E = m3050E();
        if (m3050E != null && !this.f1053T) {
            m3050E.onPanelClosed(108, c0199p);
        }
        this.f1046M = false;
    }

    /* renamed from: u */
    public void m3036u(C0116n0 c0116n0, boolean z) {
        ViewGroup viewGroup;
        InterfaceC0280m1 interfaceC0280m1;
        if (z && c0116n0.f964a == 0 && (interfaceC0280m1 = this.f1076s) != null && ((ActionBarOverlayLayout) interfaceC0280m1).m3429m()) {
            m3037t(c0116n0.f971h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f1069l.getSystemService("window");
        if (windowManager != null && c0116n0.f976m && (viewGroup = c0116n0.f968e) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                m3038s(c0116n0.f964a, c0116n0, null);
            }
        }
        c0116n0.f974k = false;
        c0116n0.f975l = false;
        c0116n0.f976m = false;
        c0116n0.f969f = null;
        c0116n0.f978o = true;
        if (this.f1048O == c0116n0) {
            this.f1048O = null;
        }
    }

    /* renamed from: v */
    public final Configuration m3035v(Context context, int i, Configuration configuration) {
        int i2 = i != 1 ? i != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x013d, code lost:
        if (r7 == false) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m3034w(KeyEvent keyEvent) {
        View decorView;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        AudioManager audioManager;
        Object obj = this.f1068k;
        if (((obj instanceof InterfaceC0606k) || (obj instanceof DialogC0124r0)) && (decorView = this.f1070m.getDecorView()) != null && AbstractC0608l.m2229a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f1071n.f922b.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f1049P = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() == 0) {
                    C0116n0 m3051D = m3051D(0);
                    if (m3051D.f976m) {
                        return true;
                    }
                    m3044K(m3051D, keyEvent);
                    return true;
                }
                return true;
            }
        } else if (keyCode == 4) {
            boolean z5 = this.f1049P;
            this.f1049P = false;
            C0116n0 m3051D2 = m3051D(0);
            if (m3051D2.f976m) {
                if (z5) {
                    return true;
                }
                m3036u(m3051D2, true);
                return true;
            }
            AbstractC0161b abstractC0161b = this.f1079v;
            if (abstractC0161b != null) {
                abstractC0161b.mo2979c();
            } else {
                m3049F();
                AbstractC0091c abstractC0091c = this.f1073p;
                if (abstractC0091c != null) {
                    InterfaceC0285n1 interfaceC0285n1 = ((C0096d1) abstractC0091c).f888g;
                    if (interfaceC0285n1 != null) {
                        C0322u3 c0322u3 = ((C0215a4) interfaceC0285n1).f1458a.f364L;
                        if ((c0322u3 == null || c0322u3.f1778c == null) ? false : true) {
                            C0202s c0202s = c0322u3 == null ? null : c0322u3.f1778c;
                            if (c0202s != null) {
                                c0202s.collapseActionView();
                            }
                            z2 = true;
                        }
                    }
                    z2 = false;
                }
                z = false;
                if (!z) {
                    return true;
                }
            }
            z = true;
            if (!z) {
            }
        } else if (keyCode == 82) {
            if (this.f1079v != null) {
                return true;
            }
            C0116n0 m3051D3 = m3051D(0);
            InterfaceC0280m1 interfaceC0280m1 = this.f1076s;
            if (interfaceC0280m1 == null || !((ActionBarOverlayLayout) interfaceC0280m1).m3434h() || ViewConfiguration.get(this.f1069l).hasPermanentMenuKey()) {
                boolean z6 = m3051D3.f976m;
                if (z6 || m3051D3.f975l) {
                    m3036u(m3051D3, true);
                    z3 = z6;
                } else {
                    if (m3051D3.f974k) {
                        if (m3051D3.f979p) {
                            m3051D3.f974k = false;
                            z4 = m3044K(m3051D3, keyEvent);
                        } else {
                            z4 = true;
                        }
                        if (z4) {
                            m3046I(m3051D3, keyEvent);
                            z3 = true;
                        }
                    }
                    z3 = false;
                }
            } else if (((ActionBarOverlayLayout) this.f1076s).m3429m()) {
                z3 = ((ActionBarOverlayLayout) this.f1076s).m3432j();
            } else {
                if (!this.f1053T && m3044K(m3051D3, keyEvent)) {
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1076s;
                    actionBarOverlayLayout.m3428n();
                    z3 = ((C0215a4) actionBarOverlayLayout.f209g).f1458a.m3374u();
                }
                z3 = false;
            }
            if (!z3 || (audioManager = (AudioManager) this.f1069l.getApplicationContext().getSystemService("audio")) == null) {
                return true;
            }
            audioManager.playSoundEffect(0);
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public void m3033x(int i) {
        C0116n0 m3051D = m3051D(i);
        if (m3051D.f971h != null) {
            Bundle bundle = new Bundle();
            m3051D.f971h.m2916w(bundle);
            if (bundle.size() > 0) {
                m3051D.f980q = bundle;
            }
            m3051D.f971h.m2938A();
            m3051D.f971h.clear();
        }
        m3051D.f979p = true;
        m3051D.f978o = true;
        if ((i == 108 || i == 0) && this.f1076s != null) {
            C0116n0 m3051D2 = m3051D(0);
            m3051D2.f974k = false;
            m3044K(m3051D2, null);
        }
    }

    /* renamed from: y */
    public void m3032y() {
        C0615o0 c0615o0 = this.f1083z;
        if (c0615o0 != null) {
            c0615o0.m2210b();
        }
    }

    /* renamed from: z */
    public final void m3031z() {
        ViewGroup viewGroup;
        if (this.f1035B) {
            return;
        }
        TypedArray obtainStyledAttributes = this.f1069l.obtainStyledAttributes(AbstractC0084j.AppCompatTheme);
        int i = AbstractC0084j.AppCompatTheme_windowActionBar;
        if (!obtainStyledAttributes.hasValue(i)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(AbstractC0084j.AppCompatTheme_windowNoTitle, false)) {
            mo3008k(1);
        } else if (obtainStyledAttributes.getBoolean(i, false)) {
            mo3008k(108);
        }
        if (obtainStyledAttributes.getBoolean(AbstractC0084j.AppCompatTheme_windowActionBarOverlay, false)) {
            mo3008k(109);
        }
        if (obtainStyledAttributes.getBoolean(AbstractC0084j.AppCompatTheme_windowActionModeOverlay, false)) {
            mo3008k(10);
        }
        this.f1044K = obtainStyledAttributes.getBoolean(AbstractC0084j.AppCompatTheme_android_windowIsFloating, false);
        obtainStyledAttributes.recycle();
        m3054A();
        this.f1070m.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f1069l);
        if (this.f1045L) {
            viewGroup = (ViewGroup) from.inflate(this.f1043J ? AbstractC0081g.abc_screen_simple_overlay_action_mode : AbstractC0081g.abc_screen_simple, (ViewGroup) null);
        } else if (this.f1044K) {
            viewGroup = (ViewGroup) from.inflate(AbstractC0081g.abc_dialog_title_material, (ViewGroup) null);
            this.f1042I = false;
            this.f1041H = false;
        } else if (this.f1041H) {
            TypedValue typedValue = new TypedValue();
            this.f1069l.getTheme().resolveAttribute(AbstractC0075a.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0163d(this.f1069l, typedValue.resourceId) : this.f1069l).inflate(AbstractC0081g.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0280m1 interfaceC0280m1 = (InterfaceC0280m1) viewGroup.findViewById(AbstractC0080f.decor_content_parent);
            this.f1076s = interfaceC0280m1;
            interfaceC0280m1.setWindowCallback(m3050E());
            if (this.f1042I) {
                ((ActionBarOverlayLayout) this.f1076s).m3430l(109);
            }
            if (this.f1039F) {
                ((ActionBarOverlayLayout) this.f1076s).m3430l(2);
            }
            if (this.f1040G) {
                ((ActionBarOverlayLayout) this.f1076s).m3430l(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 21) {
                AbstractC0605j0.m2262U(viewGroup, new C0137y(this));
            } else if (viewGroup instanceof InterfaceC0315t1) {
                ((InterfaceC0315t1) viewGroup).setOnFitSystemWindowsListener(new C0139z(this));
            }
            if (this.f1076s == null) {
                this.f1037D = (TextView) viewGroup.findViewById(AbstractC0080f.title);
            }
            Method method = AbstractC0257h4.f1595a;
            if (i2 >= 16) {
                try {
                    Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                    if (!method2.isAccessible()) {
                        method2.setAccessible(true);
                    }
                    method2.invoke(viewGroup, new Object[0]);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            }
            ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(AbstractC0080f.action_bar_activity_content);
            ViewGroup viewGroup2 = (ViewGroup) this.f1070m.findViewById(16908290);
            if (viewGroup2 != null) {
                while (viewGroup2.getChildCount() > 0) {
                    View childAt = viewGroup2.getChildAt(0);
                    viewGroup2.removeViewAt(0);
                    contentFrameLayout.addView(childAt);
                }
                viewGroup2.setId(-1);
                contentFrameLayout.setId(16908290);
                if (viewGroup2 instanceof FrameLayout) {
                    ((FrameLayout) viewGroup2).setForeground(null);
                }
            }
            this.f1070m.setContentView(viewGroup);
            contentFrameLayout.setAttachListener(new C0086a0(this));
            this.f1036C = viewGroup;
            Object obj = this.f1068k;
            CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f1075r;
            if (!TextUtils.isEmpty(title)) {
                InterfaceC0280m1 interfaceC0280m12 = this.f1076s;
                if (interfaceC0280m12 != null) {
                    interfaceC0280m12.setWindowTitle(title);
                } else {
                    AbstractC0091c abstractC0091c = this.f1073p;
                    if (abstractC0091c != null) {
                        abstractC0091c.mo3082c(title);
                    } else {
                        TextView textView = this.f1037D;
                        if (textView != null) {
                            textView.setText(title);
                        }
                    }
                }
            }
            ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f1036C.findViewById(16908290);
            View decorView = this.f1070m.getDecorView();
            contentFrameLayout2.f252h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
            if (AbstractC0605j0.m2232z(contentFrameLayout2)) {
                contentFrameLayout2.requestLayout();
            }
            TypedArray obtainStyledAttributes2 = this.f1069l.obtainStyledAttributes(AbstractC0084j.AppCompatTheme);
            obtainStyledAttributes2.getValue(AbstractC0084j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
            obtainStyledAttributes2.getValue(AbstractC0084j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
            int i3 = AbstractC0084j.AppCompatTheme_windowFixedWidthMajor;
            if (obtainStyledAttributes2.hasValue(i3)) {
                obtainStyledAttributes2.getValue(i3, contentFrameLayout2.getFixedWidthMajor());
            }
            int i4 = AbstractC0084j.AppCompatTheme_windowFixedWidthMinor;
            if (obtainStyledAttributes2.hasValue(i4)) {
                obtainStyledAttributes2.getValue(i4, contentFrameLayout2.getFixedWidthMinor());
            }
            int i5 = AbstractC0084j.AppCompatTheme_windowFixedHeightMajor;
            if (obtainStyledAttributes2.hasValue(i5)) {
                obtainStyledAttributes2.getValue(i5, contentFrameLayout2.getFixedHeightMajor());
            }
            int i6 = AbstractC0084j.AppCompatTheme_windowFixedHeightMinor;
            if (obtainStyledAttributes2.hasValue(i6)) {
                obtainStyledAttributes2.getValue(i6, contentFrameLayout2.getFixedHeightMinor());
            }
            obtainStyledAttributes2.recycle();
            contentFrameLayout2.requestLayout();
            this.f1035B = true;
            C0116n0 m3051D = m3051D(0);
            if (this.f1053T || m3051D.f971h != null) {
                return;
            }
            m3048G(108);
            return;
        }
        StringBuilder m1187i = AbstractC1124a.m1187i("AppCompat does not support the current theme features: { windowActionBar: ");
        m1187i.append(this.f1041H);
        m1187i.append(", windowActionBarOverlay: ");
        m1187i.append(this.f1042I);
        m1187i.append(", android:windowIsFloating: ");
        m1187i.append(this.f1044K);
        m1187i.append(", windowActionModeOverlay: ");
        m1187i.append(this.f1043J);
        m1187i.append(", windowNoTitle: ");
        m1187i.append(this.f1045L);
        m1187i.append(" }");
        throw new IllegalArgumentException(m1187i.toString());
    }
}