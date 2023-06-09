package p010b.p016c.p024p;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: b.c.p.h */
/* loaded from: classes.dex */
public class MenuItem$OnMenuItemClickListenerC0167h implements MenuItem.OnMenuItemClickListener {

    /* renamed from: b */
    public static final Class[] f1211b = {MenuItem.class};

    /* renamed from: c */
    public Object f1212c;

    /* renamed from: d */
    public Method f1213d;

    public MenuItem$OnMenuItemClickListenerC0167h(Object obj, String str) {
        this.f1212c = obj;
        Class<?> cls = obj.getClass();
        try {
            this.f1213d = cls.getMethod(str, f1211b);
        } catch (Exception e) {
            InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
            inflateException.initCause(e);
            throw inflateException;
        }
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        try {
            if (this.f1213d.getReturnType() == Boolean.TYPE) {
                return ((Boolean) this.f1213d.invoke(this.f1212c, menuItem)).booleanValue();
            }
            this.f1213d.invoke(this.f1212c, menuItem);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}