package p010b.p016c.p026q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.AbstractC0075a;
import p010b.p016c.AbstractC0078d;
import p010b.p016c.AbstractC0079e;
import p010b.p016c.p022n.AbstractC0157a;
import p010b.p036g.AbstractC0381e;
import p010b.p036g.C0382f;
import p010b.p036g.C0390n;
import p010b.p036g.C0391o;
import p010b.p046j.p047d.AbstractC0472e;
import p010b.p087x.p088a.p089a.C1105t;

/* renamed from: b.c.q.p2 */
/* loaded from: classes.dex */
public final class C0296p2 {

    /* renamed from: b */
    public static C0296p2 f1691b;

    /* renamed from: d */
    public WeakHashMap f1693d;

    /* renamed from: e */
    public C0390n f1694e;

    /* renamed from: f */
    public C0391o f1695f;

    /* renamed from: g */
    public final WeakHashMap f1696g = new WeakHashMap(0);

    /* renamed from: h */
    public TypedValue f1697h;

    /* renamed from: i */
    public boolean f1698i;

    /* renamed from: j */
    public C0223c0 f1699j;

    /* renamed from: a */
    public static final PorterDuff.Mode f1690a = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public static final C0276l2 f1692c = new C0276l2(6);

    /* renamed from: d */
    public static synchronized C0296p2 m2775d() {
        C0296p2 c0296p2;
        synchronized (C0296p2.class) {
            if (f1691b == null) {
                C0296p2 c0296p22 = new C0296p2();
                f1691b = c0296p22;
                m2769j(c0296p22);
            }
            c0296p2 = f1691b;
        }
        return c0296p2;
    }

    /* renamed from: h */
    public static synchronized PorterDuffColorFilter m2771h(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C0296p2.class) {
            C0276l2 c0276l2 = f1692c;
            c0276l2.getClass();
            int i2 = (i + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) c0276l2.m2639a(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                c0276l2.getClass();
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) c0276l2.m2638b(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    /* renamed from: j */
    public static void m2769j(C0296p2 c0296p2) {
        if (Build.VERSION.SDK_INT < 24) {
            c0296p2.m2778a("vector", new C0291o2());
            c0296p2.m2778a("animated-vector", new C0271k2());
            c0296p2.m2778a("animated-selector", new C0266j2());
            c0296p2.m2778a("drawable", new C0281m2());
        }
    }

    /* renamed from: a */
    public final void m2778a(String str, InterfaceC0286n2 interfaceC0286n2) {
        if (this.f1694e == null) {
            this.f1694e = new C0390n();
        }
        this.f1694e.put(str, interfaceC0286n2);
    }

    /* renamed from: b */
    public final synchronized boolean m2777b(Context context, long j, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C0382f c0382f = (C0382f) this.f1696g.get(context);
            if (c0382f == null) {
                c0382f = new C0382f();
                this.f1696g.put(context, c0382f);
            }
            c0382f.m2642g(j, new WeakReference(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    public final Drawable m2776c(Context context, int i) {
        int i2;
        if (this.f1697h == null) {
            this.f1697h = new TypedValue();
        }
        TypedValue typedValue = this.f1697h;
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable m2774e = m2774e(context, j);
        if (m2774e != null) {
            return m2774e;
        }
        C0223c0 c0223c0 = this.f1699j;
        LayerDrawable layerDrawable = null;
        if (c0223c0 != null) {
            if (i == AbstractC0079e.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{m2773f(context, AbstractC0079e.abc_cab_background_internal_bg), m2773f(context, AbstractC0079e.abc_cab_background_top_mtrl_alpha)});
            } else {
                if (i == AbstractC0079e.abc_ratingbar_material) {
                    i2 = AbstractC0078d.abc_star_big;
                } else if (i == AbstractC0079e.abc_ratingbar_indicator_material) {
                    i2 = AbstractC0078d.abc_star_medium;
                } else if (i == AbstractC0079e.abc_ratingbar_small_material) {
                    i2 = AbstractC0078d.abc_star_small;
                }
                layerDrawable = c0223c0.m2869c(this, context, i2);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            m2777b(context, j, layerDrawable);
        }
        return layerDrawable;
    }

    /* renamed from: e */
    public final synchronized Drawable m2774e(Context context, long j) {
        C0382f c0382f = (C0382f) this.f1696g.get(context);
        if (c0382f == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c0382f.m2643f(j, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int m2653b = AbstractC0381e.m2653b(c0382f.f1912d, c0382f.f1914f, j);
            if (m2653b >= 0) {
                Object[] objArr = c0382f.f1913e;
                Object obj = objArr[m2653b];
                Object obj2 = C0382f.f1910b;
                if (obj != obj2) {
                    objArr[m2653b] = obj2;
                    c0382f.f1911c = true;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public synchronized Drawable m2773f(Context context, int i) {
        return m2772g(context, i, false);
    }

    /* renamed from: g */
    public synchronized Drawable m2772g(Context context, int i, boolean z) {
        Drawable m2768k;
        if (!this.f1698i) {
            boolean z2 = true;
            this.f1698i = true;
            Drawable m2773f = m2773f(context, AbstractC0157a.abc_vector_test);
            if (m2773f != null) {
                if (!(m2773f instanceof C1105t) && !"android.graphics.drawable.VectorDrawable".equals(m2773f.getClass().getName())) {
                    z2 = false;
                }
            }
            this.f1698i = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
        m2768k = m2768k(context, i);
        if (m2768k == null) {
            m2768k = m2776c(context, i);
        }
        if (m2768k == null) {
            m2768k = AbstractC0472e.m2430c(context, i);
        }
        if (m2768k != null) {
            m2768k = m2767l(context, i, z, m2768k);
        }
        if (m2768k != null) {
            AbstractC0290o1.m2785b(m2768k);
        }
        return m2768k;
    }

    /* renamed from: i */
    public synchronized ColorStateList m2770i(Context context, int i) {
        ColorStateList colorStateList;
        C0391o c0391o;
        WeakHashMap weakHashMap = this.f1693d;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (c0391o = (C0391o) weakHashMap.get(context)) == null) ? null : (ColorStateList) c0391o.m2609d(i, null);
        if (colorStateList == null) {
            C0223c0 c0223c0 = this.f1699j;
            if (c0223c0 != null) {
                colorStateList2 = c0223c0.m2868d(context, i);
            }
            if (colorStateList2 != null) {
                if (this.f1693d == null) {
                    this.f1693d = new WeakHashMap();
                }
                C0391o c0391o2 = (C0391o) this.f1693d.get(context);
                if (c0391o2 == null) {
                    c0391o2 = new C0391o();
                    this.f1693d.put(context, c0391o2);
                }
                c0391o2.m2612a(i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* renamed from: k */
    public final Drawable m2768k(Context context, int i) {
        int next;
        C0390n c0390n = this.f1694e;
        if (c0390n == null || c0390n.isEmpty()) {
            return null;
        }
        C0391o c0391o = this.f1695f;
        if (c0391o != null) {
            String str = (String) c0391o.m2609d(i, null);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f1694e.getOrDefault(str, null) == null)) {
                return null;
            }
        } else {
            this.f1695f = new C0391o();
        }
        if (this.f1697h == null) {
            this.f1697h = new TypedValue();
        }
        TypedValue typedValue = this.f1697h;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable m2774e = m2774e(context, j);
        if (m2774e != null) {
            return m2774e;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f1695f.m2612a(i, name);
                InterfaceC0286n2 interfaceC0286n2 = (InterfaceC0286n2) this.f1694e.get(name);
                if (interfaceC0286n2 != null) {
                    m2774e = interfaceC0286n2.mo2782a(context, xml, asAttributeSet, context.getTheme());
                }
                if (m2774e != null) {
                    m2774e.setChangingConfigurations(typedValue.changingConfigurations);
                    m2777b(context, j, m2774e);
                }
            } catch (Exception unused) {
            }
        }
        if (m2774e == null) {
            this.f1695f.m2612a(i, "appcompat_skip_skip");
        }
        return m2774e;
    }

    /* renamed from: l */
    public final Drawable m2767l(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList m2770i = m2770i(context, i);
        PorterDuff.Mode mode = null;
        if (m2770i != null) {
            if (AbstractC0290o1.m2786a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable m3466u0 = AbstractC0022t.m3466u0(drawable);
            AbstractC0022t.m3480n0(m3466u0, m2770i);
            if (this.f1699j != null && i == AbstractC0079e.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                AbstractC0022t.m3478o0(m3466u0, mode);
                return m3466u0;
            }
            return m3466u0;
        }
        C0223c0 c0223c0 = this.f1699j;
        if (c0223c0 != null) {
            boolean z2 = true;
            if (i == AbstractC0079e.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int i2 = AbstractC0075a.colorControlNormal;
                int m2791c = AbstractC0282m3.m2791c(context, i2);
                PorterDuff.Mode mode2 = C0229d0.f1500a;
                c0223c0.m2867e(findDrawableByLayerId, m2791c, mode2);
                c0223c0.m2867e(layerDrawable.findDrawableByLayerId(16908303), AbstractC0282m3.m2791c(context, i2), mode2);
                c0223c0.m2867e(layerDrawable.findDrawableByLayerId(16908301), AbstractC0282m3.m2791c(context, AbstractC0075a.colorControlActivated), mode2);
            } else if (i == AbstractC0079e.abc_ratingbar_material || i == AbstractC0079e.abc_ratingbar_indicator_material || i == AbstractC0079e.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                int m2792b = AbstractC0282m3.m2792b(context, AbstractC0075a.colorControlNormal);
                PorterDuff.Mode mode3 = C0229d0.f1500a;
                c0223c0.m2867e(findDrawableByLayerId2, m2792b, mode3);
                Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(16908303);
                int i3 = AbstractC0075a.colorControlActivated;
                c0223c0.m2867e(findDrawableByLayerId3, AbstractC0282m3.m2791c(context, i3), mode3);
                c0223c0.m2867e(layerDrawable2.findDrawableByLayerId(16908301), AbstractC0282m3.m2791c(context, i3), mode3);
            } else {
                z2 = false;
            }
            if (z2) {
                return drawable;
            }
        }
        if (m2766m(context, i, drawable) || !z) {
            return drawable;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m2766m(Context context, int i, Drawable drawable) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        C0223c0 c0223c0 = this.f1699j;
        if (c0223c0 != null) {
            c0223c0.getClass();
            PorterDuff.Mode mode = C0229d0.f1500a;
            int i4 = 16842801;
            if (c0223c0.m2871a(c0223c0.f1487a, i)) {
                i4 = AbstractC0075a.colorControlNormal;
            } else if (c0223c0.m2871a(c0223c0.f1489c, i)) {
                i4 = AbstractC0075a.colorControlActivated;
            } else if (c0223c0.m2871a(c0223c0.f1490d, i)) {
                mode = PorterDuff.Mode.MULTIPLY;
            } else if (i == AbstractC0079e.abc_list_divider_mtrl_alpha) {
                i2 = 16842800;
                i3 = Math.round(40.8f);
                z = true;
                if (z) {
                    if (AbstractC0290o1.m2786a(drawable)) {
                        drawable = drawable.mutate();
                    }
                    drawable.setColorFilter(C0229d0.m2863c(AbstractC0282m3.m2791c(context, i2), mode));
                    if (i3 != -1) {
                        drawable.setAlpha(i3);
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return true;
                }
            } else if (i != AbstractC0079e.abc_dialog_material_background) {
                i2 = 0;
                i3 = -1;
                z = false;
                if (z) {
                }
                if (z2) {
                }
            }
            i2 = i4;
            i3 = -1;
            z = true;
            if (z) {
            }
            if (z2) {
            }
        }
        return false;
    }
}