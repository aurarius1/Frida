package p010b.p082t;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;

/* renamed from: b.t.x */
/* loaded from: classes.dex */
public abstract class AbstractC0904x extends AbstractComponentCallbacksC0763z implements InterfaceC0873h0, InterfaceC0869f0, InterfaceC0871g0, InterfaceC0860b {

    /* renamed from: X */
    public C0875i0 f3515X;

    /* renamed from: Y */
    public RecyclerView f3516Y;

    /* renamed from: Z */
    public boolean f3517Z;

    /* renamed from: a0 */
    public boolean f3518a0;

    /* renamed from: W */
    public final C0902w f3514W = new C0902w(this);

    /* renamed from: b0 */
    public int f3519b0 = AbstractC0891q0.preference_list_fragment;

    /* renamed from: c0 */
    public Handler f3520c0 = new HandlerC0898u(this);

    /* renamed from: d0 */
    public final Runnable f3521d0 = new RunnableC0900v(this);

    /* renamed from: Q0 */
    public void m1735Q0(int i) {
        C0875i0 c0875i0 = this.f3515X;
        if (c0875i0 != null) {
            Context m1866k = m1866k();
            PreferenceScreen preferenceScreen = this.f3515X.f3474g;
            c0875i0.f3472e = true;
            C0867e0 c0867e0 = new C0867e0(m1866k, c0875i0);
            XmlResourceParser xml = m1866k.getResources().getXml(i);
            try {
                Preference m1750c = c0867e0.m1750c(xml, preferenceScreen);
                xml.close();
                PreferenceScreen preferenceScreen2 = (PreferenceScreen) m1750c;
                preferenceScreen2.m3275q(c0875i0);
                SharedPreferences.Editor editor = c0875i0.f3471d;
                if (editor != null) {
                    editor.apply();
                }
                boolean z = false;
                c0875i0.f3472e = false;
                C0875i0 c0875i02 = this.f3515X;
                PreferenceScreen preferenceScreen3 = c0875i02.f3474g;
                if (preferenceScreen2 != preferenceScreen3) {
                    if (preferenceScreen3 != null) {
                        preferenceScreen3.mo3261u();
                    }
                    c0875i02.f3474g = preferenceScreen2;
                    z = true;
                }
                if (z) {
                    this.f3517Z = true;
                    if (!this.f3518a0 || this.f3520c0.hasMessages(1)) {
                        return;
                    }
                    this.f3520c0.obtainMessage(1).sendToTarget();
                    return;
                }
                return;
            } catch (Throwable th) {
                xml.close();
                throw th;
            }
        }
        throw new RuntimeException("This should be called after super.onCreate.");
    }

    /* renamed from: R0 */
    public Preference m1734R0(CharSequence charSequence) {
        PreferenceScreen preferenceScreen;
        C0875i0 c0875i0 = this.f3515X;
        if (c0875i0 == null || (preferenceScreen = c0875i0.f3474g) == null) {
            return null;
        }
        return preferenceScreen.m3269N(charSequence);
    }

    /* renamed from: S0 */
    public abstract void mo1107S0(Bundle bundle, String str);

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: T */
    public void mo523T(Bundle bundle) {
        super.mo523T(bundle);
        TypedValue typedValue = new TypedValue();
        m1872h().getTheme().resolveAttribute(AbstractC0883m0.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = AbstractC0895s0.PreferenceThemeOverlay;
        }
        m1872h().getTheme().applyStyle(i, false);
        C0875i0 c0875i0 = new C0875i0(m1866k());
        this.f3515X = c0875i0;
        c0875i0.f3477j = this;
        Bundle bundle2 = this.f3236i;
        mo1107S0(bundle, bundle2 != null ? bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    /* renamed from: T0 */
    public RecyclerView m1733T0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView;
        if (!m1866k().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup.findViewById(AbstractC0889p0.recycler_view)) == null) {
            RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(AbstractC0891q0.preference_recyclerview, viewGroup, false);
            recyclerView2.setLayoutManager(new LinearLayoutManager(m1866k()));
            recyclerView2.setAccessibilityDelegateCompat(new C0879k0(recyclerView2));
            return recyclerView2;
        }
        return recyclerView;
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: X */
    public View mo522X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = m1866k().obtainStyledAttributes(null, AbstractC0897t0.PreferenceFragmentCompat, AbstractC0883m0.preferenceFragmentCompatStyle, 0);
        this.f3519b0 = obtainStyledAttributes.getResourceId(AbstractC0897t0.PreferenceFragmentCompat_android_layout, this.f3519b0);
        Drawable drawable = obtainStyledAttributes.getDrawable(AbstractC0897t0.PreferenceFragmentCompat_android_divider);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(AbstractC0897t0.PreferenceFragmentCompat_android_dividerHeight, -1);
        boolean z = obtainStyledAttributes.getBoolean(AbstractC0897t0.PreferenceFragmentCompat_allowDividerAfterLastItem, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(m1866k());
        View inflate = cloneInContext.inflate(this.f3519b0, viewGroup, false);
        View findViewById = inflate.findViewById(16908351);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            RecyclerView m1733T0 = m1733T0(cloneInContext, viewGroup2);
            if (m1733T0 != null) {
                this.f3516Y = m1733T0;
                m1733T0.m3162g(this.f3514W);
                C0902w c0902w = this.f3514W;
                c0902w.getClass();
                c0902w.f3511b = drawable != null ? drawable.getIntrinsicHeight() : 0;
                c0902w.f3510a = drawable;
                c0902w.f3513d.f3516Y.m3185O();
                if (dimensionPixelSize != -1) {
                    C0902w c0902w2 = this.f3514W;
                    c0902w2.f3511b = dimensionPixelSize;
                    c0902w2.f3513d.f3516Y.m3185O();
                }
                this.f3514W.f3512c = z;
                if (this.f3516Y.getParent() == null) {
                    viewGroup2.addView(this.f3516Y);
                }
                this.f3520c0.post(this.f3521d0);
                return inflate;
            }
            throw new RuntimeException("Could not create RecyclerView");
        }
        throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: Z */
    public void mo1096Z() {
        this.f3520c0.removeCallbacks(this.f3521d0);
        this.f3520c0.removeMessages(1);
        if (this.f3517Z) {
            this.f3516Y.setAdapter(null);
            PreferenceScreen preferenceScreen = this.f3515X.f3474g;
            if (preferenceScreen != null) {
                preferenceScreen.mo3261u();
            }
        }
        this.f3516Y = null;
        this.f3214G = true;
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: n0 */
    public void mo521n0(Bundle bundle) {
        PreferenceScreen preferenceScreen = this.f3515X.f3474g;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.mo3264c(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: o0 */
    public void mo527o0() {
        this.f3214G = true;
        C0875i0 c0875i0 = this.f3515X;
        c0875i0.f3475h = this;
        c0875i0.f3476i = this;
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: p0 */
    public void mo526p0() {
        this.f3214G = true;
        C0875i0 c0875i0 = this.f3515X;
        c0875i0.f3475h = null;
        c0875i0.f3476i = null;
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: q0 */
    public void mo1080q0(View view, Bundle bundle) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen2 = this.f3515X.f3474g) != null) {
            preferenceScreen2.mo3265b(bundle2);
        }
        if (this.f3517Z && (preferenceScreen = this.f3515X.f3474g) != null) {
            this.f3516Y.setAdapter(new C0865d0(preferenceScreen));
            preferenceScreen.mo3262p();
        }
        this.f3518a0 = true;
    }
}