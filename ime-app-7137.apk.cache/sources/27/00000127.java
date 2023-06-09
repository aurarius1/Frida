package p010b.p016c.p024p;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import p010b.p016c.AbstractC0083i;

/* renamed from: b.c.p.d */
/* loaded from: classes.dex */
public class C0163d extends ContextWrapper {

    /* renamed from: a */
    public int f1194a;

    /* renamed from: b */
    public Resources.Theme f1195b;

    /* renamed from: c */
    public LayoutInflater f1196c;

    /* renamed from: d */
    public Configuration f1197d;

    /* renamed from: e */
    public Resources f1198e;

    public C0163d(Context context, int i) {
        super(context);
        this.f1194a = i;
    }

    /* renamed from: a */
    public void m2981a(Configuration configuration) {
        if (this.f1198e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f1197d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f1197d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: b */
    public final void m2980b() {
        if (this.f1195b == null) {
            this.f1195b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1195b.setTo(theme);
            }
        }
        this.f1195b.applyStyle(this.f1194a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources;
        if (this.f1198e == null) {
            Configuration configuration = this.f1197d;
            if (configuration == null) {
                resources = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(configuration).getResources();
            } else {
                Resources resources2 = super.getResources();
                Configuration configuration2 = new Configuration(resources2.getConfiguration());
                configuration2.updateFrom(this.f1197d);
                this.f1198e = new Resources(resources2.getAssets(), resources2.getDisplayMetrics(), configuration2);
            }
            this.f1198e = resources;
        }
        return this.f1198e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f1196c == null) {
                this.f1196c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f1196c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1195b;
        if (theme != null) {
            return theme;
        }
        if (this.f1194a == 0) {
            this.f1194a = AbstractC0083i.Theme_AppCompat_Light;
        }
        m2980b();
        return this.f1195b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f1194a != i) {
            this.f1194a = i;
            m2980b();
        }
    }
}