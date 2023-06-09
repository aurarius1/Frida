package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import p010b.p072o.EnumC0777f;
import p010b.p072o.InterfaceC0780i;
import p010b.p072o.InterfaceC0782k;

/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements InterfaceC0780i {

    /* renamed from: a */
    public static int f120a;

    /* renamed from: b */
    public static Field f121b;

    /* renamed from: c */
    public static Field f122c;

    /* renamed from: d */
    public static Field f123d;

    /* renamed from: e */
    public Activity f124e;

    public ImmLeaksCleaner(Activity activity) {
        this.f124e = activity;
    }

    @Override // p010b.p072o.InterfaceC0780i
    /* renamed from: d */
    public void mo1827d(InterfaceC0782k interfaceC0782k, EnumC0777f enumC0777f) {
        if (enumC0777f != EnumC0777f.ON_DESTROY) {
            return;
        }
        if (f120a == 0) {
            try {
                f120a = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f122c = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f123d = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f121b = declaredField3;
                declaredField3.setAccessible(true);
                f120a = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f120a == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f124e.getSystemService("input_method");
            try {
                Object obj = f121b.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f122c.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f123d.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (ClassCastException unused3) {
                        } catch (IllegalAccessException unused4) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}