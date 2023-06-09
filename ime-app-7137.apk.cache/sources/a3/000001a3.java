package p010b.p016c.p026q;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: b.c.q.n3 */
/* loaded from: classes.dex */
public class C0287n3 extends ContextWrapper {

    /* renamed from: a */
    public static final Object f1669a = new Object();

    /* renamed from: b */
    public static ArrayList f1670b;

    /* renamed from: c */
    public final Resources f1671c;

    public C0287n3(Context context) {
        super(context);
        int i = AbstractC0245f4.f1584a;
        this.f1671c = new C0297p3(this, context.getResources());
    }

    /* renamed from: a */
    public static Context m2787a(Context context) {
        boolean z = false;
        if (!(context instanceof C0287n3) && !(context.getResources() instanceof C0297p3)) {
            context.getResources();
            if (Build.VERSION.SDK_INT >= 21) {
                int i = AbstractC0245f4.f1584a;
            } else {
                z = true;
            }
        }
        if (z) {
            synchronized (f1669a) {
                ArrayList arrayList = f1670b;
                if (arrayList == null) {
                    f1670b = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f1670b.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f1670b.remove(size);
                        }
                    }
                    for (int size2 = f1670b.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f1670b.get(size2);
                        C0287n3 c0287n3 = weakReference2 != null ? (C0287n3) weakReference2.get() : null;
                        if (c0287n3 != null && c0287n3.getBaseContext() == context) {
                            return c0287n3;
                        }
                    }
                }
                C0287n3 c0287n32 = new C0287n3(context);
                f1670b.add(new WeakReference(c0287n32));
                return c0287n32;
            }
        }
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1671c.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1671c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        return super.getTheme();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
    }
}