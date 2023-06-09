package p010b.p016c.p017k;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.c.k.t0 */
/* loaded from: classes.dex */
public class View$OnClickListenerC0128t0 implements View.OnClickListener {

    /* renamed from: b */
    public final View f1091b;

    /* renamed from: c */
    public final String f1092c;

    /* renamed from: d */
    public Method f1093d;

    /* renamed from: e */
    public Context f1094e;

    public View$OnClickListenerC0128t0(View view, String str) {
        this.f1091b = view;
        this.f1092c = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String sb;
        Method method;
        if (this.f1093d == null) {
            Context context = this.f1091b.getContext();
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f1092c, View.class)) != null) {
                        this.f1093d = method;
                        this.f1094e = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f1091b.getId();
            if (id == -1) {
                sb = "";
            } else {
                StringBuilder m1187i = AbstractC1124a.m1187i(" with id '");
                m1187i.append(this.f1091b.getContext().getResources().getResourceEntryName(id));
                m1187i.append("'");
                sb = m1187i.toString();
            }
            StringBuilder m1187i2 = AbstractC1124a.m1187i("Could not find method ");
            m1187i2.append(this.f1092c);
            m1187i2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
            m1187i2.append(this.f1091b.getClass());
            m1187i2.append(sb);
            throw new IllegalStateException(m1187i2.toString());
        }
        try {
            this.f1093d.invoke(this.f1094e, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}