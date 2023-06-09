package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p010b.p016c.p018l.p019a.AbstractC0142b;
import p010b.p046j.p048e.p049b.AbstractC0505k;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.p059d1.C0580e;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;
import p010b.p067m.p068d.C0668a;
import p010b.p067m.p068d.C0690f1;
import p010b.p067m.p068d.C0752v0;
import p010b.p082t.AbstractC0883m0;
import p010b.p082t.AbstractC0889p0;
import p010b.p082t.AbstractC0891q0;
import p010b.p082t.AbstractC0897t0;
import p010b.p082t.AbstractC0904x;
import p010b.p082t.C0865d0;
import p010b.p082t.C0875i0;
import p010b.p082t.C0881l0;
import p010b.p082t.C0888p;
import p010b.p082t.InterfaceC0873h0;
import p010b.p082t.InterfaceC0890q;
import p010b.p082t.InterfaceC0894s;
import p010b.p082t.View$OnClickListenerC0886o;
import p010b.p082t.View$OnCreateContextMenuListenerC0892r;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p097b.p108i0.p110p.C1339j;
import p093c.p097b.p108i0.p110p.C1341j1;

/* loaded from: classes.dex */
public class Preference implements Comparable {

    /* renamed from: A */
    public boolean f594A;

    /* renamed from: B */
    public boolean f595B;

    /* renamed from: C */
    public boolean f596C;

    /* renamed from: D */
    public boolean f597D;

    /* renamed from: E */
    public boolean f598E;

    /* renamed from: F */
    public boolean f599F;

    /* renamed from: G */
    public int f600G;

    /* renamed from: H */
    public int f601H;

    /* renamed from: I */
    public C0865d0 f602I;

    /* renamed from: J */
    public List f603J;

    /* renamed from: K */
    public PreferenceGroup f604K;

    /* renamed from: L */
    public boolean f605L;

    /* renamed from: M */
    public View$OnCreateContextMenuListenerC0892r f606M;

    /* renamed from: N */
    public InterfaceC0894s f607N;

    /* renamed from: O */
    public final View.OnClickListener f608O;

    /* renamed from: b */
    public Context f609b;

    /* renamed from: c */
    public C0875i0 f610c;

    /* renamed from: d */
    public long f611d;

    /* renamed from: e */
    public boolean f612e;

    /* renamed from: f */
    public C1339j f613f;

    /* renamed from: g */
    public InterfaceC0890q f614g;

    /* renamed from: h */
    public int f615h;

    /* renamed from: i */
    public CharSequence f616i;

    /* renamed from: j */
    public CharSequence f617j;

    /* renamed from: k */
    public int f618k;

    /* renamed from: l */
    public Drawable f619l;

    /* renamed from: m */
    public String f620m;

    /* renamed from: n */
    public Intent f621n;

    /* renamed from: o */
    public String f622o;

    /* renamed from: p */
    public Bundle f623p;

    /* renamed from: q */
    public boolean f624q;

    /* renamed from: r */
    public boolean f625r;

    /* renamed from: s */
    public boolean f626s;

    /* renamed from: t */
    public boolean f627t;

    /* renamed from: u */
    public String f628u;

    /* renamed from: v */
    public Object f629v;

    /* renamed from: w */
    public boolean f630w;

    /* renamed from: x */
    public boolean f631x;

    /* renamed from: y */
    public boolean f632y;

    /* renamed from: z */
    public boolean f633z;

    /* loaded from: classes.dex */
    public class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C0888p();

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Preference(Context context) {
        this(context, null);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0505k.m2404a(context, AbstractC0883m0.preferenceStyle, 16842894));
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x010a, code lost:
        if (r5.hasValue(r6) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f615h = Integer.MAX_VALUE;
        this.f624q = true;
        this.f625r = true;
        this.f627t = true;
        this.f630w = true;
        this.f631x = true;
        this.f632y = true;
        this.f633z = true;
        this.f594A = true;
        this.f596C = true;
        this.f599F = true;
        int i3 = AbstractC0891q0.preference;
        this.f600G = i3;
        this.f608O = new View$OnClickListenerC0886o(this);
        this.f609b = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0897t0.Preference, i, i2);
        this.f618k = AbstractC0505k.m2399f(obtainStyledAttributes, AbstractC0897t0.Preference_icon, AbstractC0897t0.Preference_android_icon, 0);
        int i4 = AbstractC0897t0.Preference_key;
        int i5 = AbstractC0897t0.Preference_android_key;
        String string = obtainStyledAttributes.getString(i4);
        this.f620m = string == null ? obtainStyledAttributes.getString(i5) : string;
        int i6 = AbstractC0897t0.Preference_title;
        int i7 = AbstractC0897t0.Preference_android_title;
        CharSequence text = obtainStyledAttributes.getText(i6);
        this.f616i = text == null ? obtainStyledAttributes.getText(i7) : text;
        int i8 = AbstractC0897t0.Preference_summary;
        int i9 = AbstractC0897t0.Preference_android_summary;
        CharSequence text2 = obtainStyledAttributes.getText(i8);
        this.f617j = text2 == null ? obtainStyledAttributes.getText(i9) : text2;
        this.f615h = obtainStyledAttributes.getInt(AbstractC0897t0.Preference_order, obtainStyledAttributes.getInt(AbstractC0897t0.Preference_android_order, Integer.MAX_VALUE));
        int i10 = AbstractC0897t0.Preference_fragment;
        int i11 = AbstractC0897t0.Preference_android_fragment;
        String string2 = obtainStyledAttributes.getString(i10);
        this.f622o = string2 == null ? obtainStyledAttributes.getString(i11) : string2;
        this.f600G = obtainStyledAttributes.getResourceId(AbstractC0897t0.Preference_layout, obtainStyledAttributes.getResourceId(AbstractC0897t0.Preference_android_layout, i3));
        this.f601H = obtainStyledAttributes.getResourceId(AbstractC0897t0.Preference_widgetLayout, obtainStyledAttributes.getResourceId(AbstractC0897t0.Preference_android_widgetLayout, 0));
        this.f624q = obtainStyledAttributes.getBoolean(AbstractC0897t0.Preference_enabled, obtainStyledAttributes.getBoolean(AbstractC0897t0.Preference_android_enabled, true));
        this.f625r = obtainStyledAttributes.getBoolean(AbstractC0897t0.Preference_selectable, obtainStyledAttributes.getBoolean(AbstractC0897t0.Preference_android_selectable, true));
        this.f627t = obtainStyledAttributes.getBoolean(AbstractC0897t0.Preference_persistent, obtainStyledAttributes.getBoolean(AbstractC0897t0.Preference_android_persistent, true));
        int i12 = AbstractC0897t0.Preference_dependency;
        int i13 = AbstractC0897t0.Preference_android_dependency;
        String string3 = obtainStyledAttributes.getString(i12);
        this.f628u = string3 == null ? obtainStyledAttributes.getString(i13) : string3;
        int i14 = AbstractC0897t0.Preference_allowDividerAbove;
        this.f633z = obtainStyledAttributes.getBoolean(i14, obtainStyledAttributes.getBoolean(i14, this.f625r));
        int i15 = AbstractC0897t0.Preference_allowDividerBelow;
        this.f594A = obtainStyledAttributes.getBoolean(i15, obtainStyledAttributes.getBoolean(i15, this.f625r));
        int i16 = AbstractC0897t0.Preference_defaultValue;
        if (!obtainStyledAttributes.hasValue(i16)) {
            i16 = AbstractC0897t0.Preference_android_defaultValue;
        }
        this.f629v = mo3246v(obtainStyledAttributes, i16);
        this.f599F = obtainStyledAttributes.getBoolean(AbstractC0897t0.Preference_shouldDisableView, obtainStyledAttributes.getBoolean(AbstractC0897t0.Preference_android_shouldDisableView, true));
        int i17 = AbstractC0897t0.Preference_singleLineTitle;
        boolean hasValue = obtainStyledAttributes.hasValue(i17);
        this.f595B = hasValue;
        if (hasValue) {
            this.f596C = obtainStyledAttributes.getBoolean(i17, obtainStyledAttributes.getBoolean(AbstractC0897t0.Preference_android_singleLineTitle, true));
        }
        this.f597D = obtainStyledAttributes.getBoolean(AbstractC0897t0.Preference_iconSpaceReserved, obtainStyledAttributes.getBoolean(AbstractC0897t0.Preference_android_iconSpaceReserved, false));
        int i18 = AbstractC0897t0.Preference_isPreferenceVisible;
        this.f632y = obtainStyledAttributes.getBoolean(i18, obtainStyledAttributes.getBoolean(i18, true));
        int i19 = AbstractC0897t0.Preference_enableCopying;
        this.f598E = obtainStyledAttributes.getBoolean(i19, obtainStyledAttributes.getBoolean(i19, false));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: A */
    public void mo3254A(Object obj) {
    }

    @Deprecated
    /* renamed from: B */
    public void mo1B(boolean z, Object obj) {
        mo3254A(obj);
    }

    /* renamed from: C */
    public void mo3256C(View view) {
        InterfaceC0873h0 interfaceC0873h0;
        if (mo3272l() && this.f625r) {
            mo3247s();
            InterfaceC0890q interfaceC0890q = this.f614g;
            if (interfaceC0890q == null || !interfaceC0890q.mo1123a(this)) {
                C0875i0 c0875i0 = this.f610c;
                if (c0875i0 != null && (interfaceC0873h0 = c0875i0.f3475h) != null) {
                    AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = (AbstractC0904x) interfaceC0873h0;
                    boolean z = false;
                    if (this.f622o != null) {
                        abstractComponentCallbacksC0763z.m1872h();
                        C0690f1 m2102l = abstractComponentCallbacksC0763z.m1913A0().m2102l();
                        if (this.f623p == null) {
                            this.f623p = new Bundle();
                        }
                        Bundle bundle = this.f623p;
                        C0752v0 m2081P = m2102l.m2081P();
                        abstractComponentCallbacksC0763z.m1913A0().getClassLoader();
                        AbstractComponentCallbacksC0763z m1936a = m2081P.m1936a(this.f622o);
                        m1936a.m1901G0(bundle);
                        m1936a.m1889M0(abstractComponentCallbacksC0763z, 0);
                        C0668a c0668a = new C0668a(m2102l);
                        c0668a.m2110n(((View) abstractComponentCallbacksC0763z.f3216I.getParent()).getId(), m1936a);
                        c0668a.m2121c(null);
                        c0668a.m2119e();
                        z = true;
                    }
                    if (z) {
                        return;
                    }
                }
                Intent intent = this.f621n;
                if (intent != null) {
                    this.f609b.startActivity(intent);
                }
            }
        }
    }

    /* renamed from: D */
    public boolean m3293D(int i) {
        if (m3287K()) {
            if (i == m3283f(i ^ (-1))) {
                return true;
            }
            m3280i();
            SharedPreferences.Editor m1745b = this.f610c.m1745b();
            m1745b.putInt(this.f620m, i);
            if (!this.f610c.f3472e) {
                m1745b.apply();
            }
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public boolean m3292E(String str) {
        if (m3287K()) {
            if (TextUtils.equals(str, m3282g(null))) {
                return true;
            }
            m3280i();
            SharedPreferences.Editor m1745b = this.f610c.m1745b();
            m1745b.putString(this.f620m, str);
            if (!this.f610c.f3472e) {
                m1745b.apply();
            }
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public void m3291F(boolean z) {
        if (this.f624q != z) {
            this.f624q = z;
            mo3263n(mo3253J());
            mo3277m();
        }
    }

    /* renamed from: G */
    public final void m3290G(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                m3290G(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    /* renamed from: H */
    public void mo3289H(CharSequence charSequence) {
        if (this.f607N != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.f617j, charSequence)) {
            return;
        }
        this.f617j = charSequence;
        mo3277m();
    }

    /* renamed from: I */
    public void m3288I(CharSequence charSequence) {
        if ((charSequence != null || this.f616i == null) && (charSequence == null || charSequence.equals(this.f616i))) {
            return;
        }
        this.f616i = charSequence;
        mo3277m();
    }

    /* renamed from: J */
    public boolean mo3253J() {
        return !mo3272l();
    }

    /* renamed from: K */
    public boolean m3287K() {
        return this.f610c != null && this.f627t && m3278k();
    }

    /* renamed from: L */
    public final void m3286L() {
        List list;
        PreferenceScreen preferenceScreen;
        String str = this.f628u;
        if (str != null) {
            C0875i0 c0875i0 = this.f610c;
            Preference preference = null;
            if (c0875i0 != null && (preferenceScreen = c0875i0.f3474g) != null) {
                preference = preferenceScreen.m3269N(str);
            }
            if (preference == null || (list = preference.f603J) == null) {
                return;
            }
            list.remove(this);
        }
    }

    /* renamed from: a */
    public boolean m3285a(Object obj) {
        C1339j c1339j = this.f613f;
        if (c1339j != null) {
            C1341j1 c1341j1 = c1339j.f4555a;
            c1341j1.getClass();
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (booleanValue) {
                c1341j1.f4558f0.m20b(1, null);
            }
            Iterator it = ((ArrayList) c1341j1.m1122U0()).iterator();
            while (it.hasNext()) {
                ((Preference) it.next()).m3291F(!booleanValue);
            }
        }
        return true;
    }

    /* renamed from: b */
    public void mo3265b(Bundle bundle) {
        Parcelable parcelable;
        if (!m3278k() || (parcelable = bundle.getParcelable(this.f620m)) == null) {
            return;
        }
        this.f605L = false;
        mo3245y(parcelable);
        if (!this.f605L) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    /* renamed from: c */
    public void mo3264c(Bundle bundle) {
        if (m3278k()) {
            this.f605L = false;
            Parcelable mo3244z = mo3244z();
            if (!this.f605L) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (mo3244z != null) {
                bundle.putParcelable(this.f620m, mo3244z);
            }
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i = this.f615h;
        int i2 = preference.f615h;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.f616i;
        CharSequence charSequence2 = preference.f616i;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f616i.toString());
    }

    /* renamed from: d */
    public long mo1747d() {
        return this.f611d;
    }

    /* renamed from: e */
    public boolean m3284e(boolean z) {
        if (m3287K()) {
            m3280i();
            return this.f610c.m1744c().getBoolean(this.f620m, z);
        }
        return z;
    }

    /* renamed from: f */
    public int m3283f(int i) {
        if (m3287K()) {
            m3280i();
            return this.f610c.m1744c().getInt(this.f620m, i);
        }
        return i;
    }

    /* renamed from: g */
    public String m3282g(String str) {
        if (m3287K()) {
            m3280i();
            return this.f610c.m1744c().getString(this.f620m, str);
        }
        return str;
    }

    /* renamed from: h */
    public Set m3281h(Set set) {
        if (m3287K()) {
            m3280i();
            return this.f610c.m1744c().getStringSet(this.f620m, set);
        }
        return set;
    }

    /* renamed from: i */
    public void m3280i() {
        C0875i0 c0875i0 = this.f610c;
    }

    /* renamed from: j */
    public CharSequence mo3279j() {
        InterfaceC0894s interfaceC0894s = this.f607N;
        return interfaceC0894s != null ? interfaceC0894s.mo1742a(this) : this.f617j;
    }

    /* renamed from: k */
    public boolean m3278k() {
        return !TextUtils.isEmpty(this.f620m);
    }

    /* renamed from: l */
    public boolean mo3272l() {
        return this.f624q && this.f630w && this.f631x;
    }

    /* renamed from: m */
    public void mo3277m() {
        int indexOf;
        C0865d0 c0865d0 = this.f602I;
        if (c0865d0 == null || (indexOf = c0865d0.f3453f.indexOf(this)) == -1) {
            return;
        }
        c0865d0.f3589a.m1678d(indexOf, 1, this);
    }

    /* renamed from: n */
    public void mo3263n(boolean z) {
        List list = this.f603J;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((Preference) list.get(i)).m3274t(z);
        }
    }

    /* renamed from: o */
    public void m3276o() {
        C0865d0 c0865d0 = this.f602I;
        if (c0865d0 != null) {
            c0865d0.m1754l();
        }
    }

    /* renamed from: p */
    public void mo3262p() {
        PreferenceScreen preferenceScreen;
        if (TextUtils.isEmpty(this.f628u)) {
            return;
        }
        String str = this.f628u;
        C0875i0 c0875i0 = this.f610c;
        Preference preference = null;
        if (c0875i0 != null && (preferenceScreen = c0875i0.f3474g) != null) {
            preference = preferenceScreen.m3269N(str);
        }
        if (preference != null) {
            if (preference.f603J == null) {
                preference.f603J = new ArrayList();
            }
            preference.f603J.add(this);
            m3274t(preference.mo3253J());
            return;
        }
        StringBuilder m1187i = AbstractC1124a.m1187i("Dependency \"");
        m1187i.append(this.f628u);
        m1187i.append("\" not found for preference \"");
        m1187i.append(this.f620m);
        m1187i.append("\" (title: \"");
        m1187i.append((Object) this.f616i);
        m1187i.append("\"");
        throw new IllegalStateException(m1187i.toString());
    }

    /* renamed from: q */
    public void m3275q(C0875i0 c0875i0) {
        SharedPreferences sharedPreferences;
        long j;
        this.f610c = c0875i0;
        if (!this.f612e) {
            synchronized (c0875i0) {
                j = c0875i0.f3469b;
                c0875i0.f3469b = 1 + j;
            }
            this.f611d = j;
        }
        m3280i();
        if (m3287K()) {
            if (this.f610c != null) {
                m3280i();
                sharedPreferences = this.f610c.m1744c();
            } else {
                sharedPreferences = null;
            }
            if (sharedPreferences.contains(this.f620m)) {
                mo1B(true, null);
                return;
            }
        }
        Object obj = this.f629v;
        if (obj != null) {
            mo1B(false, obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fb  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo0r(C0881l0 c0881l0) {
        Integer num;
        TextView textView;
        ImageView imageView;
        View m1743x;
        boolean z;
        View view = c0881l0.f3605c;
        view.setOnClickListener(this.f608O);
        view.setId(0);
        TextView textView2 = (TextView) c0881l0.m1743x(16908304);
        if (textView2 != null) {
            CharSequence mo3279j = mo3279j();
            if (!TextUtils.isEmpty(mo3279j)) {
                textView2.setText(mo3279j);
                textView2.setVisibility(0);
                num = Integer.valueOf(textView2.getCurrentTextColor());
                textView = (TextView) c0881l0.m1743x(16908310);
                if (textView != null) {
                    CharSequence charSequence = this.f616i;
                    if (TextUtils.isEmpty(charSequence)) {
                        textView.setVisibility(8);
                    } else {
                        textView.setText(charSequence);
                        textView.setVisibility(0);
                        if (this.f595B) {
                            textView.setSingleLine(this.f596C);
                        }
                        if (!this.f625r && mo3272l() && num != null) {
                            textView.setTextColor(num.intValue());
                        }
                    }
                }
                imageView = (ImageView) c0881l0.m1743x(16908294);
                if (imageView != null) {
                    int i = this.f618k;
                    if (i != 0 || this.f619l != null) {
                        if (this.f619l == null) {
                            this.f619l = AbstractC0142b.m3000b(this.f609b, i);
                        }
                        Drawable drawable = this.f619l;
                        if (drawable != null) {
                            imageView.setImageDrawable(drawable);
                        }
                    }
                    if (this.f619l != null) {
                        imageView.setVisibility(0);
                    } else {
                        imageView.setVisibility(this.f597D ? 4 : 8);
                    }
                }
                m1743x = c0881l0.m1743x(AbstractC0889p0.icon_frame);
                if (m1743x == null) {
                    m1743x = c0881l0.m1743x(16908350);
                }
                if (m1743x != null) {
                    if (this.f619l != null) {
                        m1743x.setVisibility(0);
                    } else {
                        m1743x.setVisibility(this.f597D ? 4 : 8);
                    }
                }
                m3290G(view, !this.f599F ? mo3272l() : true);
                boolean z2 = this.f625r;
                view.setFocusable(z2);
                view.setClickable(z2);
                c0881l0.f3487w = this.f633z;
                c0881l0.f3488x = this.f594A;
                z = this.f598E;
                if (z && this.f606M == null) {
                    this.f606M = new View$OnCreateContextMenuListenerC0892r(this);
                }
                view.setOnCreateContextMenuListener(!z ? this.f606M : null);
                view.setLongClickable(z);
                if (z || z2) {
                }
                AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
                if (Build.VERSION.SDK_INT >= 16) {
                    view.setBackground(null);
                    return;
                } else {
                    view.setBackgroundDrawable(null);
                    return;
                }
            }
            textView2.setVisibility(8);
        }
        num = null;
        textView = (TextView) c0881l0.m1743x(16908310);
        if (textView != null) {
        }
        imageView = (ImageView) c0881l0.m1743x(16908294);
        if (imageView != null) {
        }
        m1743x = c0881l0.m1743x(AbstractC0889p0.icon_frame);
        if (m1743x == null) {
        }
        if (m1743x != null) {
        }
        m3290G(view, !this.f599F ? mo3272l() : true);
        boolean z22 = this.f625r;
        view.setFocusable(z22);
        view.setClickable(z22);
        c0881l0.f3487w = this.f633z;
        c0881l0.f3488x = this.f594A;
        z = this.f598E;
        if (z) {
            this.f606M = new View$OnCreateContextMenuListenerC0892r(this);
        }
        view.setOnCreateContextMenuListener(!z ? this.f606M : null);
        view.setLongClickable(z);
        if (z) {
        }
    }

    /* renamed from: s */
    public void mo3247s() {
    }

    /* renamed from: t */
    public void m3274t(boolean z) {
        if (this.f630w == z) {
            this.f630w = !z;
            mo3263n(mo3253J());
            mo3277m();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f616i;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence mo3279j = mo3279j();
        if (!TextUtils.isEmpty(mo3279j)) {
            sb.append(mo3279j);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    /* renamed from: u */
    public void mo3261u() {
        m3286L();
    }

    /* renamed from: v */
    public Object mo3246v(TypedArray typedArray, int i) {
        return null;
    }

    @Deprecated
    /* renamed from: w */
    public void mo3271w(C0580e c0580e) {
    }

    /* renamed from: x */
    public void m3273x(boolean z) {
        if (this.f631x == z) {
            this.f631x = !z;
            mo3263n(mo3253J());
            mo3277m();
        }
    }

    /* renamed from: y */
    public void mo3245y(Parcelable parcelable) {
        this.f605L = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    /* renamed from: z */
    public Parcelable mo3244z() {
        this.f605L = true;
        return AbsSavedState.EMPTY_STATE;
    }
}