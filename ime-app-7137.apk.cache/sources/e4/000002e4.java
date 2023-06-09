package p010b.p046j.p058l;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p010b.p046j.AbstractC0462b;

/* renamed from: b.j.l.l */
/* loaded from: classes.dex */
public abstract class AbstractC0608l {

    /* renamed from: a */
    public static boolean f2761a = false;

    /* renamed from: b */
    public static Method f2762b = null;

    /* renamed from: c */
    public static boolean f2763c = false;

    /* renamed from: d */
    public static Field f2764d;

    /* renamed from: a */
    public static boolean m2229a(View view, KeyEvent keyEvent) {
        int indexOfKey;
        AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = C0603i0.f2743a;
            int i = AbstractC0462b.tag_unhandled_key_event_manager;
            C0603i0 c0603i0 = (C0603i0) view.getTag(i);
            if (c0603i0 == null) {
                c0603i0 = new C0603i0();
                view.setTag(i, c0603i0);
            }
            WeakReference weakReference = c0603i0.f2746d;
            if (weakReference == null || weakReference.get() != keyEvent) {
                c0603i0.f2746d = new WeakReference(keyEvent);
                WeakReference weakReference2 = null;
                if (c0603i0.f2745c == null) {
                    c0603i0.f2745c = new SparseArray();
                }
                SparseArray sparseArray = c0603i0.f2745c;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference2 = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference2 == null) {
                    weakReference2 = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference2 != null) {
                    View view2 = (View) weakReference2.get();
                    if (view2 == null || !AbstractC0605j0.m2233y(view2)) {
                        return true;
                    }
                    c0603i0.m2283b(view2, keyEvent);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m2228b(InterfaceC0606k interfaceC0606k, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z = false;
        if (interfaceC0606k == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return interfaceC0606k.mo2231a(keyEvent);
        }
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window2 = activity.getWindow();
            if (window2.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                    if (!f2761a) {
                        try {
                            f2762b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                        } catch (NoSuchMethodException unused) {
                        }
                        f2761a = true;
                    }
                    Method method = f2762b;
                    if (method != null) {
                        try {
                            z = ((Boolean) method.invoke(actionBar, keyEvent)).booleanValue();
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                    if (z) {
                        return true;
                    }
                }
            }
            if (window2.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window2.getDecorView();
            if (AbstractC0605j0.m2252f(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
        } else if (!(callback instanceof Dialog)) {
            return (view != null && AbstractC0605j0.m2252f(view, keyEvent)) || interfaceC0606k.mo2231a(keyEvent);
        } else {
            Dialog dialog = (Dialog) callback;
            if (!f2763c) {
                try {
                    Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                    f2764d = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused3) {
                }
                f2763c = true;
            }
            Field field = f2764d;
            if (field != null) {
                try {
                    onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                } catch (IllegalAccessException unused4) {
                }
                if (onKeyListener == null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                window = dialog.getWindow();
                if (window.superDispatchKeyEvent(keyEvent)) {
                    View decorView2 = window.getDecorView();
                    if (AbstractC0605j0.m2252f(decorView2, keyEvent)) {
                        return true;
                    }
                    return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
                }
                return true;
            }
            onKeyListener = null;
            if (onKeyListener == null) {
            }
            window = dialog.getWindow();
            if (window.superDispatchKeyEvent(keyEvent)) {
            }
        }
    }
}