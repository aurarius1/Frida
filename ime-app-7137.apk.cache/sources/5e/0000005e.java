package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.AbstractC0075a;
import p010b.p016c.AbstractC0084j;
import p010b.p016c.p017k.AbstractC0085a;
import p010b.p016c.p018l.p019a.AbstractC0142b;
import p010b.p016c.p024p.C0169j;
import p010b.p016c.p024p.p025m.C0199p;
import p010b.p016c.p024p.p025m.C0202s;
import p010b.p016c.p026q.AbstractC0257h4;
import p010b.p016c.p026q.C0215a4;
import p010b.p016c.p026q.C0241f0;
import p010b.p016c.p026q.C0242f1;
import p010b.p016c.p026q.C0253h0;
import p010b.p016c.p026q.C0298q;
import p010b.p016c.p026q.C0301q2;
import p010b.p016c.p026q.C0302q3;
import p010b.p016c.p026q.C0307r3;
import p010b.p016c.p026q.C0322u3;
import p010b.p016c.p026q.C0327v3;
import p010b.p016c.p026q.C0337x3;
import p010b.p016c.p026q.InterfaceC0285n1;
import p010b.p016c.p026q.InterfaceC0323v;
import p010b.p016c.p026q.InterfaceC0332w3;
import p010b.p016c.p026q.RunnableC0312s3;
import p010b.p016c.p026q.View$OnClickListenerC0317t3;
import p010b.p046j.p058l.AbstractC0605j0;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    public ColorStateList f353A;

    /* renamed from: B */
    public ColorStateList f354B;

    /* renamed from: C */
    public boolean f355C;

    /* renamed from: D */
    public boolean f356D;

    /* renamed from: E */
    public final ArrayList f357E;

    /* renamed from: F */
    public final ArrayList f358F;

    /* renamed from: G */
    public final int[] f359G;

    /* renamed from: H */
    public InterfaceC0332w3 f360H;

    /* renamed from: I */
    public final InterfaceC0323v f361I;

    /* renamed from: J */
    public C0215a4 f362J;

    /* renamed from: K */
    public C0298q f363K;

    /* renamed from: L */
    public C0322u3 f364L;

    /* renamed from: M */
    public boolean f365M;

    /* renamed from: N */
    public final Runnable f366N;

    /* renamed from: b */
    public ActionMenuView f367b;

    /* renamed from: c */
    public TextView f368c;

    /* renamed from: d */
    public TextView f369d;

    /* renamed from: e */
    public ImageButton f370e;

    /* renamed from: f */
    public ImageView f371f;

    /* renamed from: g */
    public Drawable f372g;

    /* renamed from: h */
    public CharSequence f373h;

    /* renamed from: i */
    public ImageButton f374i;

    /* renamed from: j */
    public View f375j;

    /* renamed from: k */
    public Context f376k;

    /* renamed from: l */
    public int f377l;

    /* renamed from: m */
    public int f378m;

    /* renamed from: n */
    public int f379n;

    /* renamed from: o */
    public int f380o;

    /* renamed from: p */
    public int f381p;

    /* renamed from: q */
    public int f382q;

    /* renamed from: r */
    public int f383r;

    /* renamed from: s */
    public int f384s;

    /* renamed from: t */
    public int f385t;

    /* renamed from: u */
    public C0301q2 f386u;

    /* renamed from: v */
    public int f387v;

    /* renamed from: w */
    public int f388w;

    /* renamed from: x */
    public int f389x;

    /* renamed from: y */
    public CharSequence f390y;

    /* renamed from: z */
    public CharSequence f391z;

    /* loaded from: classes.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C0337x3();

        /* renamed from: d */
        public int f392d;

        /* renamed from: e */
        public boolean f393e;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f392d = parcel.readInt();
            this.f393e = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f511c, i);
            parcel.writeInt(this.f392d);
            parcel.writeInt(this.f393e ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0075a.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f389x = 8388627;
        this.f357E = new ArrayList();
        this.f358F = new ArrayList();
        this.f359G = new int[2];
        this.f361I = new C0307r3(this);
        this.f366N = new RunnableC0312s3(this);
        Context context2 = getContext();
        int[] iArr = AbstractC0084j.Toolbar;
        C0302q3 m2740r = C0302q3.m2740r(context2, attributeSet, iArr, i, 0);
        AbstractC0605j0.m2270M(this, context, iArr, attributeSet, m2740r.f1740b, i, 0);
        this.f378m = m2740r.m2745m(AbstractC0084j.Toolbar_titleTextAppearance, 0);
        this.f379n = m2740r.m2745m(AbstractC0084j.Toolbar_subtitleTextAppearance, 0);
        this.f389x = m2740r.m2747k(AbstractC0084j.Toolbar_android_gravity, this.f389x);
        this.f380o = m2740r.m2747k(AbstractC0084j.Toolbar_buttonGravity, 48);
        int m2753e = m2740r.m2753e(AbstractC0084j.Toolbar_titleMargin, 0);
        int i2 = AbstractC0084j.Toolbar_titleMargins;
        m2753e = m2740r.m2742p(i2) ? m2740r.m2753e(i2, m2753e) : m2753e;
        this.f385t = m2753e;
        this.f384s = m2753e;
        this.f383r = m2753e;
        this.f382q = m2753e;
        int m2753e2 = m2740r.m2753e(AbstractC0084j.Toolbar_titleMarginStart, -1);
        if (m2753e2 >= 0) {
            this.f382q = m2753e2;
        }
        int m2753e3 = m2740r.m2753e(AbstractC0084j.Toolbar_titleMarginEnd, -1);
        if (m2753e3 >= 0) {
            this.f383r = m2753e3;
        }
        int m2753e4 = m2740r.m2753e(AbstractC0084j.Toolbar_titleMarginTop, -1);
        if (m2753e4 >= 0) {
            this.f384s = m2753e4;
        }
        int m2753e5 = m2740r.m2753e(AbstractC0084j.Toolbar_titleMarginBottom, -1);
        if (m2753e5 >= 0) {
            this.f385t = m2753e5;
        }
        this.f381p = m2740r.m2752f(AbstractC0084j.Toolbar_maxButtonHeight, -1);
        int m2753e6 = m2740r.m2753e(AbstractC0084j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int m2753e7 = m2740r.m2753e(AbstractC0084j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int m2752f = m2740r.m2752f(AbstractC0084j.Toolbar_contentInsetLeft, 0);
        int m2752f2 = m2740r.m2752f(AbstractC0084j.Toolbar_contentInsetRight, 0);
        m3391d();
        C0301q2 c0301q2 = this.f386u;
        c0301q2.f1738h = false;
        if (m2752f != Integer.MIN_VALUE) {
            c0301q2.f1735e = m2752f;
            c0301q2.f1731a = m2752f;
        }
        if (m2752f2 != Integer.MIN_VALUE) {
            c0301q2.f1736f = m2752f2;
            c0301q2.f1732b = m2752f2;
        }
        if (m2753e6 != Integer.MIN_VALUE || m2753e7 != Integer.MIN_VALUE) {
            c0301q2.m2758a(m2753e6, m2753e7);
        }
        this.f387v = m2740r.m2753e(AbstractC0084j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f388w = m2740r.m2753e(AbstractC0084j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f372g = m2740r.m2751g(AbstractC0084j.Toolbar_collapseIcon);
        this.f373h = m2740r.m2743o(AbstractC0084j.Toolbar_collapseContentDescription);
        CharSequence m2743o = m2740r.m2743o(AbstractC0084j.Toolbar_title);
        if (!TextUtils.isEmpty(m2743o)) {
            setTitle(m2743o);
        }
        CharSequence m2743o2 = m2740r.m2743o(AbstractC0084j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(m2743o2)) {
            setSubtitle(m2743o2);
        }
        this.f376k = getContext();
        setPopupTheme(m2740r.m2745m(AbstractC0084j.Toolbar_popupTheme, 0));
        Drawable m2751g = m2740r.m2751g(AbstractC0084j.Toolbar_navigationIcon);
        if (m2751g != null) {
            setNavigationIcon(m2751g);
        }
        CharSequence m2743o3 = m2740r.m2743o(AbstractC0084j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(m2743o3)) {
            setNavigationContentDescription(m2743o3);
        }
        Drawable m2751g2 = m2740r.m2751g(AbstractC0084j.Toolbar_logo);
        if (m2751g2 != null) {
            setLogo(m2751g2);
        }
        CharSequence m2743o4 = m2740r.m2743o(AbstractC0084j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(m2743o4)) {
            setLogoDescription(m2743o4);
        }
        int i3 = AbstractC0084j.Toolbar_titleTextColor;
        if (m2740r.m2742p(i3)) {
            setTitleTextColor(m2740r.m2755c(i3));
        }
        int i4 = AbstractC0084j.Toolbar_subtitleTextColor;
        if (m2740r.m2742p(i4)) {
            setSubtitleTextColor(m2740r.m2755c(i4));
        }
        int i5 = AbstractC0084j.Toolbar_menu;
        if (m2740r.m2742p(i5)) {
            getMenuInflater().inflate(m2740r.m2745m(i5, 0), getMenu());
        }
        m2740r.f1740b.recycle();
    }

    private MenuInflater getMenuInflater() {
        return new C0169j(getContext());
    }

    /* renamed from: a */
    public final void m3394a(List list, int i) {
        boolean z = AbstractC0605j0.m2241q(this) == 1;
        int childCount = getChildCount();
        int m3460z = AbstractC0022t.m3460z(i, AbstractC0605j0.m2241q(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C0327v3 c0327v3 = (C0327v3) childAt.getLayoutParams();
                if (c0327v3.f1783b == 0 && m3375t(childAt) && m3385j(c0327v3.f868a) == m3460z) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            C0327v3 c0327v32 = (C0327v3) childAt2.getLayoutParams();
            if (c0327v32.f1783b == 0 && m3375t(childAt2) && m3385j(c0327v32.f868a) == m3460z) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: b */
    public final void m3393b(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C0327v3 generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0327v3) layoutParams;
        generateDefaultLayoutParams.f1783b = 1;
        if (!z || this.f375j == null) {
            addView(view, generateDefaultLayoutParams);
            return;
        }
        view.setLayoutParams(generateDefaultLayoutParams);
        this.f358F.add(view);
    }

    /* renamed from: c */
    public void m3392c() {
        if (this.f374i == null) {
            C0241f0 c0241f0 = new C0241f0(getContext(), null, AbstractC0075a.toolbarNavigationButtonStyle);
            this.f374i = c0241f0;
            c0241f0.setImageDrawable(this.f372g);
            this.f374i.setContentDescription(this.f373h);
            C0327v3 generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f868a = 8388611 | (this.f380o & 112);
            generateDefaultLayoutParams.f1783b = 2;
            this.f374i.setLayoutParams(generateDefaultLayoutParams);
            this.f374i.setOnClickListener(new View$OnClickListenerC0317t3(this));
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0327v3);
    }

    /* renamed from: d */
    public final void m3391d() {
        if (this.f386u == null) {
            this.f386u = new C0301q2();
        }
    }

    /* renamed from: e */
    public final void m3390e() {
        m3389f();
        ActionMenuView actionMenuView = this.f367b;
        if (actionMenuView.f232q == null) {
            C0199p c0199p = (C0199p) actionMenuView.getMenu();
            if (this.f364L == null) {
                this.f364L = new C0322u3(this);
            }
            this.f367b.setExpandedActionViewsExclusive(true);
            c0199p.m2937b(this.f364L, this.f376k);
        }
    }

    /* renamed from: f */
    public final void m3389f() {
        if (this.f367b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f367b = actionMenuView;
            actionMenuView.setPopupTheme(this.f377l);
            this.f367b.setOnMenuItemClickListener(this.f361I);
            ActionMenuView actionMenuView2 = this.f367b;
            actionMenuView2.f237v = null;
            actionMenuView2.f238w = null;
            C0327v3 generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f868a = 8388613 | (this.f380o & 112);
            this.f367b.setLayoutParams(generateDefaultLayoutParams);
            m3393b(this.f367b, false);
        }
    }

    /* renamed from: g */
    public final void m3388g() {
        if (this.f370e == null) {
            this.f370e = new C0241f0(getContext(), null, AbstractC0075a.toolbarNavigationButtonStyle);
            C0327v3 generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f868a = 8388611 | (this.f380o & 112);
            this.f370e.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0327v3(getContext(), attributeSet);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f374i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f374i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0301q2 c0301q2 = this.f386u;
        if (c0301q2 != null) {
            return c0301q2.f1737g ? c0301q2.f1731a : c0301q2.f1732b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f388w;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0301q2 c0301q2 = this.f386u;
        if (c0301q2 != null) {
            return c0301q2.f1731a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0301q2 c0301q2 = this.f386u;
        if (c0301q2 != null) {
            return c0301q2.f1732b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0301q2 c0301q2 = this.f386u;
        if (c0301q2 != null) {
            return c0301q2.f1737g ? c0301q2.f1732b : c0301q2.f1731a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f387v;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        C0199p c0199p;
        ActionMenuView actionMenuView = this.f367b;
        return actionMenuView != null && (c0199p = actionMenuView.f232q) != null && c0199p.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f388w, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return AbstractC0605j0.m2241q(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return AbstractC0605j0.m2241q(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f387v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f371f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f371f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m3390e();
        return this.f367b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f370e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f370e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public C0298q getOuterActionMenuPresenter() {
        return this.f363K;
    }

    public Drawable getOverflowIcon() {
        m3390e();
        return this.f367b.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f376k;
    }

    public int getPopupTheme() {
        return this.f377l;
    }

    public CharSequence getSubtitle() {
        return this.f391z;
    }

    public final TextView getSubtitleTextView() {
        return this.f369d;
    }

    public CharSequence getTitle() {
        return this.f390y;
    }

    public int getTitleMarginBottom() {
        return this.f385t;
    }

    public int getTitleMarginEnd() {
        return this.f383r;
    }

    public int getTitleMarginStart() {
        return this.f382q;
    }

    public int getTitleMarginTop() {
        return this.f384s;
    }

    public final TextView getTitleTextView() {
        return this.f368c;
    }

    public InterfaceC0285n1 getWrapper() {
        if (this.f362J == null) {
            this.f362J = new C0215a4(this, true);
        }
        return this.f362J;
    }

    /* JADX DEBUG: Method merged with bridge method */
    @Override // android.view.ViewGroup
    /* renamed from: h */
    public C0327v3 generateDefaultLayoutParams() {
        return new C0327v3(-2, -2);
    }

    /* JADX DEBUG: Method merged with bridge method */
    @Override // android.view.ViewGroup
    /* renamed from: i */
    public C0327v3 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0327v3 ? new C0327v3((C0327v3) layoutParams) : layoutParams instanceof AbstractC0085a ? new C0327v3((AbstractC0085a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0327v3((ViewGroup.MarginLayoutParams) layoutParams) : new C0327v3(layoutParams);
    }

    /* renamed from: j */
    public final int m3385j(int i) {
        int m2241q = AbstractC0605j0.m2241q(this);
        int m3460z = AbstractC0022t.m3460z(i, m2241q) & 7;
        return (m3460z == 1 || m3460z == 3 || m3460z == 5) ? m3460z : m2241q == 1 ? 5 : 3;
    }

    /* renamed from: k */
    public final int m3384k(View view, int i) {
        C0327v3 c0327v3 = (C0327v3) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = c0327v3.f868a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f389x & 112;
        }
        if (i3 != 48) {
            if (i3 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i5 = ((ViewGroup.MarginLayoutParams) c0327v3).topMargin;
                if (i4 < i5) {
                    i4 = i5;
                } else {
                    int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
                    int i7 = ((ViewGroup.MarginLayoutParams) c0327v3).bottomMargin;
                    if (i6 < i7) {
                        i4 = Math.max(0, i4 - (i7 - i6));
                    }
                }
                return paddingTop + i4;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0327v3).bottomMargin) - i2;
        }
        return getPaddingTop() - i2;
    }

    /* renamed from: l */
    public final int m3383l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return AbstractC0022t.m3528F(marginLayoutParams) + (Build.VERSION.SDK_INT >= 17 ? marginLayoutParams.getMarginEnd() : marginLayoutParams.rightMargin);
    }

    /* renamed from: m */
    public final int m3382m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: n */
    public final boolean m3381n(View view) {
        return view.getParent() == this || this.f358F.contains(view);
    }

    /* renamed from: o */
    public boolean m3380o() {
        ActionMenuView actionMenuView = this.f367b;
        if (actionMenuView != null) {
            C0298q c0298q = actionMenuView.f236u;
            if (c0298q != null && c0298q.m2760p()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f366N);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f356D = false;
        }
        if (!this.f356D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f356D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f356D = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0295 A[LOOP:0: B:109:0x0293->B:110:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b7 A[LOOP:1: B:112:0x02b5->B:113:0x02b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02dc A[LOOP:2: B:115:0x02da->B:116:0x02dc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x032e A[LOOP:3: B:124:0x032c->B:125:0x032e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        boolean m3375t;
        boolean m3375t2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int paddingTop;
        int i14;
        int i15;
        int i16;
        int i17;
        int size;
        int i18;
        int i19;
        int size2;
        int i20;
        int size3;
        int i21;
        int i22;
        int size4;
        int i23;
        boolean z2 = AbstractC0605j0.m2241q(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i24 = width - paddingRight;
        int[] iArr = this.f359G;
        iArr[1] = 0;
        iArr[0] = 0;
        int m2240r = AbstractC0605j0.m2240r(this);
        int min = m2240r >= 0 ? Math.min(m2240r, i4 - i2) : 0;
        if (m3375t(this.f370e)) {
            ImageButton imageButton = this.f370e;
            if (z2) {
                i6 = m3378q(imageButton, i24, iArr, min);
                i5 = paddingLeft;
                if (m3375t(this.f374i)) {
                    ImageButton imageButton2 = this.f374i;
                    if (z2) {
                        i6 = m3378q(imageButton2, i6, iArr, min);
                    } else {
                        i5 = m3379p(imageButton2, i5, iArr, min);
                    }
                }
                if (m3375t(this.f367b)) {
                    ActionMenuView actionMenuView = this.f367b;
                    if (z2) {
                        i5 = m3379p(actionMenuView, i5, iArr, min);
                    } else {
                        i6 = m3378q(actionMenuView, i6, iArr, min);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i5);
                iArr[1] = Math.max(0, currentContentInsetRight - (i24 - i6));
                int max = Math.max(i5, currentContentInsetLeft);
                int min2 = Math.min(i6, i24 - currentContentInsetRight);
                if (m3375t(this.f375j)) {
                    View view = this.f375j;
                    if (z2) {
                        min2 = m3378q(view, min2, iArr, min);
                    } else {
                        max = m3379p(view, max, iArr, min);
                    }
                }
                if (m3375t(this.f371f)) {
                    ImageView imageView = this.f371f;
                    if (z2) {
                        min2 = m3378q(imageView, min2, iArr, min);
                    } else {
                        max = m3379p(imageView, max, iArr, min);
                    }
                }
                m3375t = m3375t(this.f368c);
                m3375t2 = m3375t(this.f369d);
                if (m3375t) {
                    i7 = paddingRight;
                    i8 = 0;
                } else {
                    C0327v3 c0327v3 = (C0327v3) this.f368c.getLayoutParams();
                    i7 = paddingRight;
                    i8 = this.f368c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0327v3).topMargin + ((ViewGroup.MarginLayoutParams) c0327v3).bottomMargin + 0;
                }
                if (m3375t2) {
                    i9 = width;
                } else {
                    C0327v3 c0327v32 = (C0327v3) this.f369d.getLayoutParams();
                    i9 = width;
                    i8 += this.f369d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0327v32).topMargin + ((ViewGroup.MarginLayoutParams) c0327v32).bottomMargin;
                }
                if (!m3375t || m3375t2) {
                    TextView textView = !m3375t ? this.f368c : this.f369d;
                    TextView textView2 = !m3375t2 ? this.f369d : this.f368c;
                    C0327v3 c0327v33 = (C0327v3) textView.getLayoutParams();
                    C0327v3 c0327v34 = (C0327v3) textView2.getLayoutParams();
                    boolean z3 = (!m3375t && this.f368c.getMeasuredWidth() > 0) || (m3375t2 && this.f369d.getMeasuredWidth() > 0);
                    i10 = this.f389x & 112;
                    i11 = paddingLeft;
                    if (i10 != 48) {
                        i12 = max;
                        i13 = min;
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0327v33).topMargin + this.f384s;
                    } else if (i10 != 80) {
                        int i25 = (((height - paddingTop2) - paddingBottom) - i8) / 2;
                        int i26 = ((ViewGroup.MarginLayoutParams) c0327v33).topMargin;
                        i13 = min;
                        int i27 = this.f384s;
                        i12 = max;
                        if (i25 < i26 + i27) {
                            i25 = i26 + i27;
                        } else {
                            int i28 = (((height - paddingBottom) - i8) - i25) - paddingTop2;
                            int i29 = ((ViewGroup.MarginLayoutParams) c0327v33).bottomMargin;
                            int i30 = this.f385t;
                            if (i28 < i29 + i30) {
                                i25 = Math.max(0, i25 - ((((ViewGroup.MarginLayoutParams) c0327v34).bottomMargin + i30) - i28));
                            }
                        }
                        paddingTop = paddingTop2 + i25;
                    } else {
                        i12 = max;
                        i13 = min;
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c0327v34).bottomMargin) - this.f385t) - i8;
                    }
                    if (z2) {
                        int i31 = (z3 ? this.f382q : 0) - iArr[0];
                        int max2 = Math.max(0, i31) + i12;
                        iArr[0] = Math.max(0, -i31);
                        if (m3375t) {
                            int measuredWidth = this.f368c.getMeasuredWidth() + max2;
                            int measuredHeight = this.f368c.getMeasuredHeight() + paddingTop;
                            this.f368c.layout(max2, paddingTop, measuredWidth, measuredHeight);
                            i14 = measuredWidth + this.f383r;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) ((C0327v3) this.f368c.getLayoutParams())).bottomMargin;
                        } else {
                            i14 = max2;
                        }
                        if (m3375t2) {
                            int i32 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0327v3) this.f369d.getLayoutParams())).topMargin;
                            int measuredWidth2 = this.f369d.getMeasuredWidth() + max2;
                            this.f369d.layout(max2, i32, measuredWidth2, this.f369d.getMeasuredHeight() + i32);
                            i15 = measuredWidth2 + this.f383r;
                        } else {
                            i15 = max2;
                        }
                        max = z3 ? Math.max(i14, i15) : max2;
                    } else {
                        int i33 = (z3 ? this.f382q : 0) - iArr[1];
                        min2 -= Math.max(0, i33);
                        iArr[1] = Math.max(0, -i33);
                        if (m3375t) {
                            int measuredWidth3 = min2 - this.f368c.getMeasuredWidth();
                            int measuredHeight2 = this.f368c.getMeasuredHeight() + paddingTop;
                            this.f368c.layout(measuredWidth3, paddingTop, min2, measuredHeight2);
                            i16 = measuredWidth3 - this.f383r;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) ((C0327v3) this.f368c.getLayoutParams())).bottomMargin;
                        } else {
                            i16 = min2;
                        }
                        if (m3375t2) {
                            int i34 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0327v3) this.f369d.getLayoutParams())).topMargin;
                            this.f369d.layout(min2 - this.f369d.getMeasuredWidth(), i34, min2, this.f369d.getMeasuredHeight() + i34);
                            i17 = min2 - this.f383r;
                        } else {
                            i17 = min2;
                        }
                        if (z3) {
                            min2 = Math.min(i16, i17);
                        }
                        max = i12;
                    }
                } else {
                    i11 = paddingLeft;
                    i13 = min;
                }
                m3394a(this.f357E, 3);
                size = this.f357E.size();
                i18 = max;
                for (i19 = 0; i19 < size; i19++) {
                    i18 = m3379p((View) this.f357E.get(i19), i18, iArr, i13);
                }
                int i35 = i13;
                m3394a(this.f357E, 5);
                size2 = this.f357E.size();
                for (i20 = 0; i20 < size2; i20++) {
                    min2 = m3378q((View) this.f357E.get(i20), min2, iArr, i35);
                }
                m3394a(this.f357E, 1);
                ArrayList arrayList = this.f357E;
                int i36 = iArr[0];
                int i37 = iArr[1];
                size3 = arrayList.size();
                int i38 = i36;
                i21 = 0;
                int i39 = 0;
                while (i21 < size3) {
                    View view2 = (View) arrayList.get(i21);
                    C0327v3 c0327v35 = (C0327v3) view2.getLayoutParams();
                    int i40 = ((ViewGroup.MarginLayoutParams) c0327v35).leftMargin - i38;
                    int i41 = ((ViewGroup.MarginLayoutParams) c0327v35).rightMargin - i37;
                    int max3 = Math.max(0, i40);
                    int max4 = Math.max(0, i41);
                    int max5 = Math.max(0, -i40);
                    int max6 = Math.max(0, -i41);
                    i39 += view2.getMeasuredWidth() + max3 + max4;
                    i21++;
                    i37 = max6;
                    i38 = max5;
                }
                i22 = ((((i9 - i11) - i7) / 2) + i11) - (i39 / 2);
                int i42 = i39 + i22;
                if (i22 >= i18) {
                    i18 = i42 > min2 ? i22 - (i42 - min2) : i22;
                }
                size4 = this.f357E.size();
                int i43 = i18;
                for (i23 = 0; i23 < size4; i23++) {
                    i43 = m3379p((View) this.f357E.get(i23), i43, iArr, i35);
                }
                this.f357E.clear();
            }
            i5 = m3379p(imageButton, paddingLeft, iArr, min);
        } else {
            i5 = paddingLeft;
        }
        i6 = i24;
        if (m3375t(this.f374i)) {
        }
        if (m3375t(this.f367b)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i5);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i24 - i6));
        int max7 = Math.max(i5, currentContentInsetLeft2);
        int min22 = Math.min(i6, i24 - currentContentInsetRight2);
        if (m3375t(this.f375j)) {
        }
        if (m3375t(this.f371f)) {
        }
        m3375t = m3375t(this.f368c);
        m3375t2 = m3375t(this.f369d);
        if (m3375t) {
        }
        if (m3375t2) {
        }
        if (m3375t) {
        }
        if (!m3375t) {
        }
        if (!m3375t2) {
        }
        C0327v3 c0327v332 = (C0327v3) textView.getLayoutParams();
        C0327v3 c0327v342 = (C0327v3) textView2.getLayoutParams();
        if (m3375t) {
        }
        i10 = this.f389x & 112;
        i11 = paddingLeft;
        if (i10 != 48) {
        }
        if (z2) {
        }
        m3394a(this.f357E, 3);
        size = this.f357E.size();
        i18 = max7;
        while (i19 < size) {
        }
        int i352 = i13;
        m3394a(this.f357E, 5);
        size2 = this.f357E.size();
        while (i20 < size2) {
        }
        m3394a(this.f357E, 1);
        ArrayList arrayList2 = this.f357E;
        int i362 = iArr[0];
        int i372 = iArr[1];
        size3 = arrayList2.size();
        int i382 = i362;
        i21 = 0;
        int i392 = 0;
        while (i21 < size3) {
        }
        i22 = ((((i9 - i11) - i7) / 2) + i11) - (i392 / 2);
        int i422 = i392 + i22;
        if (i22 >= i18) {
        }
        size4 = this.f357E.size();
        int i432 = i18;
        while (i23 < size4) {
        }
        this.f357E.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0296  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f359G;
        boolean z = true;
        if (AbstractC0257h4.m2817a(this)) {
            c = 1;
            c2 = 0;
        } else {
            c = 0;
            c2 = 1;
        }
        if (m3375t(this.f370e)) {
            m3376s(this.f370e, i, 0, i2, 0, this.f381p);
            i3 = m3383l(this.f370e) + this.f370e.getMeasuredWidth();
            i4 = Math.max(0, m3382m(this.f370e) + this.f370e.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.f370e.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (m3375t(this.f374i)) {
            m3376s(this.f374i, i, 0, i2, 0, this.f381p);
            i3 = m3383l(this.f374i) + this.f374i.getMeasuredWidth();
            i4 = Math.max(i4, m3382m(this.f374i) + this.f374i.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f374i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3) + 0;
        iArr[c] = Math.max(0, currentContentInsetStart - i3);
        if (m3375t(this.f367b)) {
            m3376s(this.f367b, i, max, i2, 0, this.f381p);
            i6 = m3383l(this.f367b) + this.f367b.getMeasuredWidth();
            i4 = Math.max(i4, m3382m(this.f367b) + this.f367b.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f367b.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = Math.max(currentContentInsetEnd, i6) + max;
        iArr[c2] = Math.max(0, currentContentInsetEnd - i6);
        if (m3375t(this.f375j)) {
            max2 += m3377r(this.f375j, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, m3382m(this.f375j) + this.f375j.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f375j.getMeasuredState());
        }
        if (m3375t(this.f371f)) {
            max2 += m3377r(this.f371f, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, m3382m(this.f371f) + this.f371f.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.f371f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (((C0327v3) childAt.getLayoutParams()).f1783b == 0 && m3375t(childAt)) {
                max2 += m3377r(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, m3382m(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i11 = this.f384s + this.f385t;
        int i12 = this.f382q + this.f383r;
        if (m3375t(this.f368c)) {
            m3377r(this.f368c, i, max2 + i12, i2, i11, iArr);
            int m3383l = m3383l(this.f368c) + this.f368c.getMeasuredWidth();
            i9 = m3382m(this.f368c) + this.f368c.getMeasuredHeight();
            i7 = View.combineMeasuredStates(i5, this.f368c.getMeasuredState());
            i8 = m3383l;
        } else {
            i7 = i5;
            i8 = 0;
            i9 = 0;
        }
        if (m3375t(this.f369d)) {
            i8 = Math.max(i8, m3377r(this.f369d, i, max2 + i12, i2, i9 + i11, iArr));
            i9 = m3382m(this.f369d) + this.f369d.getMeasuredHeight() + i9;
            i7 = View.combineMeasuredStates(i7, this.f369d.getMeasuredState());
        }
        int max3 = Math.max(i4, i9);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max3;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max2 + i8, getSuggestedMinimumWidth()), i, (-16777216) & i7);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i7 << 16);
        if (this.f365M) {
            int childCount2 = getChildCount();
            for (int i13 = 0; i13 < childCount2; i13++) {
                View childAt2 = getChildAt(i13);
                if (!m3375t(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, z ? 0 : resolveSizeAndState2);
        }
        z = false;
        setMeasuredDimension(resolveSizeAndState, z ? 0 : resolveSizeAndState2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f511c);
        ActionMenuView actionMenuView = this.f367b;
        C0199p c0199p = actionMenuView != null ? actionMenuView.f232q : null;
        int i = savedState.f392d;
        if (i != 0 && this.f364L != null && c0199p != null && (findItem = c0199p.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (savedState.f393e) {
            removeCallbacks(this.f366N);
            post(this.f366N);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
        if (r1 != Integer.MIN_VALUE) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003b, code lost:
        if (r1 != Integer.MIN_VALUE) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onRtlPropertiesChanged(int i) {
        int i2;
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m3391d();
        C0301q2 c0301q2 = this.f386u;
        boolean z = i == 1;
        if (z == c0301q2.f1737g) {
            return;
        }
        c0301q2.f1737g = z;
        if (!c0301q2.f1738h) {
            c0301q2.f1731a = c0301q2.f1735e;
        } else if (z) {
            int i3 = c0301q2.f1734d;
            if (i3 == Integer.MIN_VALUE) {
                i3 = c0301q2.f1735e;
            }
            c0301q2.f1731a = i3;
            i2 = c0301q2.f1733c;
        } else {
            int i4 = c0301q2.f1733c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = c0301q2.f1735e;
            }
            c0301q2.f1731a = i4;
            i2 = c0301q2.f1734d;
        }
        i2 = c0301q2.f1736f;
        c0301q2.f1732b = i2;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0202s c0202s;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0322u3 c0322u3 = this.f364L;
        if (c0322u3 != null && (c0202s = c0322u3.f1778c) != null) {
            savedState.f392d = c0202s.f1404a;
        }
        savedState.f393e = m3380o();
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f355C = false;
        }
        if (!this.f355C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f355C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f355C = false;
        }
        return true;
    }

    /* renamed from: p */
    public final int m3379p(View view, int i, int[] iArr, int i2) {
        C0327v3 c0327v3 = (C0327v3) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0327v3).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int m3384k = m3384k(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, m3384k, max + measuredWidth, view.getMeasuredHeight() + m3384k);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c0327v3).rightMargin + max;
    }

    /* renamed from: q */
    public final int m3378q(View view, int i, int[] iArr, int i2) {
        C0327v3 c0327v3 = (C0327v3) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0327v3).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int m3384k = m3384k(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, m3384k, max, view.getMeasuredHeight() + m3384k);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) c0327v3).leftMargin);
    }

    /* renamed from: r */
    public final int m3377r(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: s */
    public final void m3376s(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m3392c();
        }
        ImageButton imageButton = this.f374i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(AbstractC0142b.m3000b(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m3392c();
            this.f374i.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f374i;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f372g);
        }
    }

    public void setCollapsible(boolean z) {
        this.f365M = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f388w) {
            this.f388w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f387v) {
            this.f387v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(AbstractC0142b.m3000b(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f371f == null) {
                this.f371f = new C0253h0(getContext(), null, 0);
            }
            if (!m3381n(this.f371f)) {
                m3393b(this.f371f, true);
            }
        } else {
            ImageView imageView = this.f371f;
            if (imageView != null && m3381n(imageView)) {
                removeView(this.f371f);
                this.f358F.remove(this.f371f);
            }
        }
        ImageView imageView2 = this.f371f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f371f == null) {
            this.f371f = new C0253h0(getContext(), null, 0);
        }
        ImageView imageView = this.f371f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m3388g();
        }
        ImageButton imageButton = this.f370e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(AbstractC0142b.m3000b(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m3388g();
            if (!m3381n(this.f370e)) {
                m3393b(this.f370e, true);
            }
        } else {
            ImageButton imageButton = this.f370e;
            if (imageButton != null && m3381n(imageButton)) {
                removeView(this.f370e);
                this.f358F.remove(this.f370e);
            }
        }
        ImageButton imageButton2 = this.f370e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m3388g();
        this.f370e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC0332w3 interfaceC0332w3) {
        this.f360H = interfaceC0332w3;
    }

    public void setOverflowIcon(Drawable drawable) {
        m3390e();
        this.f367b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f377l != i) {
            this.f377l = i;
            if (i == 0) {
                this.f376k = getContext();
            } else {
                this.f376k = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f369d;
            if (textView != null && m3381n(textView)) {
                removeView(this.f369d);
                this.f358F.remove(this.f369d);
            }
        } else {
            if (this.f369d == null) {
                Context context = getContext();
                C0242f1 c0242f1 = new C0242f1(context);
                this.f369d = c0242f1;
                c0242f1.setSingleLine();
                this.f369d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f379n;
                if (i != 0) {
                    this.f369d.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f354B;
                if (colorStateList != null) {
                    this.f369d.setTextColor(colorStateList);
                }
            }
            if (!m3381n(this.f369d)) {
                m3393b(this.f369d, true);
            }
        }
        TextView textView2 = this.f369d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f391z = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f354B = colorStateList;
        TextView textView = this.f369d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f368c;
            if (textView != null && m3381n(textView)) {
                removeView(this.f368c);
                this.f358F.remove(this.f368c);
            }
        } else {
            if (this.f368c == null) {
                Context context = getContext();
                C0242f1 c0242f1 = new C0242f1(context);
                this.f368c = c0242f1;
                c0242f1.setSingleLine();
                this.f368c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f378m;
                if (i != 0) {
                    this.f368c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f353A;
                if (colorStateList != null) {
                    this.f368c.setTextColor(colorStateList);
                }
            }
            if (!m3381n(this.f368c)) {
                m3393b(this.f368c, true);
            }
        }
        TextView textView2 = this.f368c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f390y = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.f385t = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f383r = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f382q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f384s = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f353A = colorStateList;
        TextView textView = this.f368c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: t */
    public final boolean m3375t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: u */
    public boolean m3374u() {
        ActionMenuView actionMenuView = this.f367b;
        if (actionMenuView != null) {
            C0298q c0298q = actionMenuView.f236u;
            if (c0298q != null && c0298q.m2759q()) {
                return true;
            }
        }
        return false;
    }
}