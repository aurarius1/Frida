package p010b.p016c.p017k;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import java.util.List;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.AbstractC0075a;
import p010b.p016c.AbstractC0080f;
import p010b.p016c.p024p.AbstractC0161b;
import p010b.p016c.p024p.C0163d;
import p010b.p016c.p024p.C0164e;
import p010b.p016c.p024p.C0165f;
import p010b.p016c.p024p.p025m.C0199p;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.C0615o0;

/* renamed from: b.c.k.h0 */
/* loaded from: classes.dex */
public class Window$CallbackC0104h0 implements Window.Callback {

    /* renamed from: b */
    public final Window.Callback f922b;

    /* renamed from: c */
    public final /* synthetic */ LayoutInflater$Factory2C0120p0 f923c;

    public Window$CallbackC0104h0(LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0, Window.Callback callback) {
        this.f923c = layoutInflater$Factory2C0120p0;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f922b = callback;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ActionMode m3076a(ActionMode.Callback callback) {
        AbstractC0161b abstractC0161b;
        Context context;
        AbstractC0161b abstractC0161b2;
        InterfaceC0129u interfaceC0129u;
        InterfaceC0129u interfaceC0129u2;
        C0165f c0165f = new C0165f(this.f923c.f1069l, callback);
        LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0 = this.f923c;
        layoutInflater$Factory2C0120p0.getClass();
        AbstractC0161b abstractC0161b3 = layoutInflater$Factory2C0120p0.f1079v;
        if (abstractC0161b3 != null) {
            abstractC0161b3.mo2979c();
        }
        C0102g0 c0102g0 = new C0102g0(layoutInflater$Factory2C0120p0, c0165f);
        layoutInflater$Factory2C0120p0.m3049F();
        AbstractC0091c abstractC0091c = layoutInflater$Factory2C0120p0.f1073p;
        if (abstractC0091c != null) {
            C0096d1 c0096d1 = (C0096d1) abstractC0091c;
            C0093c1 c0093c1 = c0096d1.f892k;
            if (c0093c1 != null) {
                c0093c1.mo2979c();
            }
            c0096d1.f886e.setHideOnContentScrollEnabled(false);
            c0096d1.f889h.m3439e();
            C0093c1 c0093c12 = new C0093c1(c0096d1, c0096d1.f889h.getContext(), c0102g0);
            c0093c12.f875e.m2938A();
            try {
                if (c0093c12.f876f.mo2963c(c0093c12, c0093c12.f875e)) {
                    c0096d1.f892k = c0093c12;
                    c0093c12.mo2973i();
                    c0096d1.f889h.m3441c(c0093c12);
                    c0096d1.m3081d(true);
                    c0096d1.f889h.sendAccessibilityEvent(32);
                } else {
                    c0093c12 = null;
                }
                layoutInflater$Factory2C0120p0.f1079v = c0093c12;
                if (c0093c12 != null && (interfaceC0129u2 = layoutInflater$Factory2C0120p0.f1072o) != null) {
                    interfaceC0129u2.mo3022d(c0093c12);
                }
            } finally {
                c0093c12.f875e.m2913z();
            }
        }
        if (layoutInflater$Factory2C0120p0.f1079v == null) {
            layoutInflater$Factory2C0120p0.m3032y();
            AbstractC0161b abstractC0161b4 = layoutInflater$Factory2C0120p0.f1079v;
            if (abstractC0161b4 != null) {
                abstractC0161b4.mo2979c();
            }
            InterfaceC0129u interfaceC0129u3 = layoutInflater$Factory2C0120p0.f1072o;
            if (interfaceC0129u3 != null && !layoutInflater$Factory2C0120p0.f1053T) {
                try {
                    abstractC0161b = interfaceC0129u3.mo3020h(c0102g0);
                } catch (AbstractMethodError unused) {
                }
                if (abstractC0161b == null) {
                    layoutInflater$Factory2C0120p0.f1079v = abstractC0161b;
                } else {
                    if (layoutInflater$Factory2C0120p0.f1080w == null) {
                        if (layoutInflater$Factory2C0120p0.f1044K) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = layoutInflater$Factory2C0120p0.f1069l.getTheme();
                            theme.resolveAttribute(AbstractC0075a.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                Resources.Theme newTheme = layoutInflater$Factory2C0120p0.f1069l.getResources().newTheme();
                                newTheme.setTo(theme);
                                newTheme.applyStyle(typedValue.resourceId, true);
                                context = new C0163d(layoutInflater$Factory2C0120p0.f1069l, 0);
                                context.getTheme().setTo(newTheme);
                            } else {
                                context = layoutInflater$Factory2C0120p0.f1069l;
                            }
                            layoutInflater$Factory2C0120p0.f1080w = new ActionBarContextView(context, null);
                            PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, AbstractC0075a.actionModePopupWindowStyle);
                            layoutInflater$Factory2C0120p0.f1081x = popupWindow;
                            AbstractC0022t.m3474q0(popupWindow, 2);
                            layoutInflater$Factory2C0120p0.f1081x.setContentView(layoutInflater$Factory2C0120p0.f1080w);
                            layoutInflater$Factory2C0120p0.f1081x.setWidth(-1);
                            context.getTheme().resolveAttribute(AbstractC0075a.actionBarSize, typedValue, true);
                            layoutInflater$Factory2C0120p0.f1080w.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                            layoutInflater$Factory2C0120p0.f1081x.setHeight(-2);
                            layoutInflater$Factory2C0120p0.f1082y = new RunnableC0092c0(layoutInflater$Factory2C0120p0);
                        } else {
                            ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflater$Factory2C0120p0.f1036C.findViewById(AbstractC0080f.action_mode_bar_stub);
                            if (viewStubCompat != null) {
                                layoutInflater$Factory2C0120p0.m3049F();
                                AbstractC0091c abstractC0091c2 = layoutInflater$Factory2C0120p0.f1073p;
                                Context mo3083b = abstractC0091c2 != null ? abstractC0091c2.mo3083b() : null;
                                if (mo3083b == null) {
                                    mo3083b = layoutInflater$Factory2C0120p0.f1069l;
                                }
                                viewStubCompat.setLayoutInflater(LayoutInflater.from(mo3083b));
                                layoutInflater$Factory2C0120p0.f1080w = (ActionBarContextView) viewStubCompat.m3373a();
                            }
                        }
                    }
                    if (layoutInflater$Factory2C0120p0.f1080w != null) {
                        layoutInflater$Factory2C0120p0.m3032y();
                        layoutInflater$Factory2C0120p0.f1080w.m3439e();
                        C0164e c0164e = new C0164e(layoutInflater$Factory2C0120p0.f1080w.getContext(), layoutInflater$Factory2C0120p0.f1080w, c0102g0, layoutInflater$Factory2C0120p0.f1081x == null);
                        if (c0102g0.mo2963c(c0164e, c0164e.f1204i)) {
                            c0164e.mo2973i();
                            layoutInflater$Factory2C0120p0.f1080w.m3441c(c0164e);
                            layoutInflater$Factory2C0120p0.f1079v = c0164e;
                            if (layoutInflater$Factory2C0120p0.m3043L()) {
                                layoutInflater$Factory2C0120p0.f1080w.setAlpha(0.0f);
                                C0615o0 m2256b = AbstractC0605j0.m2256b(layoutInflater$Factory2C0120p0.f1080w);
                                m2256b.m2211a(1.0f);
                                layoutInflater$Factory2C0120p0.f1083z = m2256b;
                                m2256b.m2208d(new C0095d0(layoutInflater$Factory2C0120p0));
                            } else {
                                layoutInflater$Factory2C0120p0.f1080w.setAlpha(1.0f);
                                layoutInflater$Factory2C0120p0.f1080w.setVisibility(0);
                                layoutInflater$Factory2C0120p0.f1080w.sendAccessibilityEvent(32);
                                if (layoutInflater$Factory2C0120p0.f1080w.getParent() instanceof View) {
                                    AbstractC0605j0.m2271L((View) layoutInflater$Factory2C0120p0.f1080w.getParent());
                                }
                            }
                            if (layoutInflater$Factory2C0120p0.f1081x != null) {
                                layoutInflater$Factory2C0120p0.f1070m.getDecorView().post(layoutInflater$Factory2C0120p0.f1082y);
                            }
                        } else {
                            layoutInflater$Factory2C0120p0.f1079v = null;
                        }
                    }
                }
                abstractC0161b2 = layoutInflater$Factory2C0120p0.f1079v;
                if (abstractC0161b2 != null && (interfaceC0129u = layoutInflater$Factory2C0120p0.f1072o) != null) {
                    interfaceC0129u.mo3022d(abstractC0161b2);
                }
                layoutInflater$Factory2C0120p0.f1079v = layoutInflater$Factory2C0120p0.f1079v;
            }
            abstractC0161b = null;
            if (abstractC0161b == null) {
            }
            abstractC0161b2 = layoutInflater$Factory2C0120p0.f1079v;
            if (abstractC0161b2 != null) {
                interfaceC0129u.mo3022d(abstractC0161b2);
            }
            layoutInflater$Factory2C0120p0.f1079v = layoutInflater$Factory2C0120p0.f1079v;
        }
        AbstractC0161b abstractC0161b5 = layoutInflater$Factory2C0120p0.f1079v;
        if (abstractC0161b5 != null) {
            return c0165f.m2961e(abstractC0161b5);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f922b.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f923c.m3034w(keyEvent) || this.f922b.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (r3 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
        if (r7 != false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        C0199p c0199p;
        if (this.f922b.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0 = this.f923c;
        int keyCode = keyEvent.getKeyCode();
        layoutInflater$Factory2C0120p0.m3049F();
        AbstractC0091c abstractC0091c = layoutInflater$Factory2C0120p0.f1073p;
        if (abstractC0091c != null) {
            C0093c1 c0093c1 = ((C0096d1) abstractC0091c).f892k;
            if (c0093c1 == null || (c0199p = c0093c1.f875e) == null) {
                z2 = false;
            } else {
                c0199p.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                z2 = c0199p.performShortcut(keyCode, keyEvent, 0);
            }
        }
        C0116n0 c0116n0 = layoutInflater$Factory2C0120p0.f1048O;
        if (c0116n0 == null || !layoutInflater$Factory2C0120p0.m3045J(c0116n0, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (layoutInflater$Factory2C0120p0.f1048O == null) {
                C0116n0 m3051D = layoutInflater$Factory2C0120p0.m3051D(0);
                layoutInflater$Factory2C0120p0.m3044K(m3051D, keyEvent);
                boolean m3045J = layoutInflater$Factory2C0120p0.m3045J(m3051D, keyEvent.getKeyCode(), keyEvent, 1);
                m3051D.f974k = false;
            }
            z = false;
            return !z;
        }
        C0116n0 c0116n02 = layoutInflater$Factory2C0120p0.f1048O;
        if (c0116n02 != null) {
            c0116n02.f975l = true;
        }
        z = true;
        if (!z) {
        }
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f922b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f922b.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f922b.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        this.f922b.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        this.f922b.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f922b.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof C0199p)) {
            return this.f922b.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i) {
        return this.f922b.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f922b.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f922b.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        this.f922b.onMenuOpened(i, menu);
        LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0 = this.f923c;
        layoutInflater$Factory2C0120p0.getClass();
        if (i == 108) {
            layoutInflater$Factory2C0120p0.m3049F();
            AbstractC0091c abstractC0091c = layoutInflater$Factory2C0120p0.f1073p;
            if (abstractC0091c != null) {
                abstractC0091c.mo3084a(true);
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        this.f922b.onPanelClosed(i, menu);
        LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0 = this.f923c;
        layoutInflater$Factory2C0120p0.getClass();
        if (i == 108) {
            layoutInflater$Factory2C0120p0.m3049F();
            AbstractC0091c abstractC0091c = layoutInflater$Factory2C0120p0.f1073p;
            if (abstractC0091c != null) {
                abstractC0091c.mo3084a(false);
            }
        } else if (i == 0) {
            C0116n0 m3051D = layoutInflater$Factory2C0120p0.m3051D(i);
            if (m3051D.f976m) {
                layoutInflater$Factory2C0120p0.m3036u(m3051D, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z) {
        this.f922b.onPointerCaptureChanged(z);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        C0199p c0199p = menu instanceof C0199p ? (C0199p) menu : null;
        if (i == 0 && c0199p == null) {
            return false;
        }
        if (c0199p != null) {
            c0199p.f1395y = true;
        }
        boolean onPreparePanel = this.f922b.onPreparePanel(i, view, menu);
        if (c0199p != null) {
            c0199p.f1395y = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        C0199p c0199p = this.f923c.m3051D(0).f971h;
        if (c0199p != null) {
            this.f922b.onProvideKeyboardShortcuts(list, c0199p, i);
        } else {
            this.f922b.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f922b.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f922b.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        this.f922b.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        if (this.f923c.f1034A) {
            return m3076a(callback);
        }
        return this.f922b.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f922b.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (this.f923c.f1034A && i == 0) {
            return m3076a(callback);
        }
        return this.f922b.onWindowStartingActionMode(callback, i);
    }
}