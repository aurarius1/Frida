package p093c.p145g.p146a.p147a.p166r;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.p024p.p025m.C0202s;
import p010b.p016c.p024p.p025m.InterfaceC0181e0;
import p010b.p046j.p047d.AbstractC0472e;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.C0628v;
import p010b.p046j.p058l.p059d1.C0577b;
import p010b.p046j.p058l.p059d1.C0579d;
import p093c.p145g.p146a.p147a.AbstractC1829d;
import p093c.p145g.p146a.p147a.AbstractC1835e;
import p093c.p145g.p146a.p147a.AbstractC1840f;
import p093c.p145g.p146a.p147a.AbstractC1868h;
import p093c.p145g.p146a.p147a.AbstractC1924j;
import p093c.p145g.p146a.p147a.p163o.AbstractC1959d;
import p093c.p145g.p146a.p147a.p163o.C1958c;

/* renamed from: c.g.a.a.r.b */
/* loaded from: classes.dex */
public class C1967b extends FrameLayout implements InterfaceC0181e0 {

    /* renamed from: b */
    public static final int[] f5951b = {16842912};

    /* renamed from: c */
    public final int f5952c;

    /* renamed from: d */
    public float f5953d;

    /* renamed from: e */
    public float f5954e;

    /* renamed from: f */
    public float f5955f;

    /* renamed from: g */
    public int f5956g;

    /* renamed from: h */
    public boolean f5957h;

    /* renamed from: i */
    public ImageView f5958i;

    /* renamed from: j */
    public final ViewGroup f5959j;

    /* renamed from: k */
    public final TextView f5960k;

    /* renamed from: l */
    public final TextView f5961l;

    /* renamed from: m */
    public int f5962m;

    /* renamed from: n */
    public C0202s f5963n;

    /* renamed from: o */
    public ColorStateList f5964o;

    /* renamed from: p */
    public Drawable f5965p;

    /* renamed from: q */
    public Drawable f5966q;

    /* renamed from: r */
    public C1958c f5967r;

    public C1967b(Context context) {
        super(context, null, 0);
        this.f5962m = -1;
        Resources resources = getResources();
        LayoutInflater.from(context).inflate(AbstractC1868h.design_bottom_navigation_item, (ViewGroup) this, true);
        setBackgroundResource(AbstractC1835e.design_bottom_navigation_item_background);
        this.f5952c = resources.getDimensionPixelSize(AbstractC1829d.design_bottom_navigation_margin);
        this.f5958i = (ImageView) findViewById(AbstractC1840f.icon);
        ViewGroup viewGroup = (ViewGroup) findViewById(AbstractC1840f.labelGroup);
        this.f5959j = viewGroup;
        TextView textView = (TextView) findViewById(AbstractC1840f.smallLabel);
        this.f5960k = textView;
        TextView textView2 = (TextView) findViewById(AbstractC1840f.largeLabel);
        this.f5961l = textView2;
        viewGroup.setTag(AbstractC1840f.mtrl_view_tag_bottom_padding, Integer.valueOf(viewGroup.getPaddingBottom()));
        AbstractC0605j0.m2263T(textView, 2);
        AbstractC0605j0.m2263T(textView2, 2);
        setFocusable(true);
        m658a(textView.getTextSize(), textView2.getTextSize());
        ImageView imageView = this.f5958i;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC1966a(this));
        }
    }

    /* renamed from: c */
    public static void m656c(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: e */
    public static void m655e(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    /* renamed from: f */
    public static void m654f(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof C1967b) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public final void m658a(float f, float f2) {
        this.f5953d = f - f2;
        this.f5954e = (f2 * 1.0f) / f;
        this.f5955f = (f * 1.0f) / f2;
    }

    /* renamed from: b */
    public final boolean m657b() {
        return this.f5967r != null;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0181e0
    /* renamed from: d */
    public void mo275d(C0202s c0202s, int i) {
        CharSequence charSequence;
        this.f5963n = c0202s;
        setCheckable(c0202s.isCheckable());
        setChecked(c0202s.isChecked());
        setEnabled(c0202s.isEnabled());
        setIcon(c0202s.getIcon());
        setTitle(c0202s.f1408e);
        setId(c0202s.f1404a);
        if (!TextUtils.isEmpty(c0202s.f1420q)) {
            setContentDescription(c0202s.f1420q);
        }
        if (!TextUtils.isEmpty(c0202s.f1421r)) {
            charSequence = c0202s.f1421r;
        } else {
            charSequence = c0202s.f1408e;
        }
        AbstractC0022t.m3476p0(this, charSequence);
        setVisibility(c0202s.isVisible() ? 0 : 8);
    }

    public C1958c getBadge() {
        return this.f5967r;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0181e0
    public C0202s getItemData() {
        return this.f5963n;
    }

    public int getItemPosition() {
        return this.f5962m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0202s c0202s = this.f5963n;
        if (c0202s != null && c0202s.isCheckable() && this.f5963n.isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f5951b);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1958c c1958c = this.f5967r;
        if (c1958c != null && c1958c.isVisible()) {
            C0202s c0202s = this.f5963n;
            CharSequence charSequence = c0202s.f1408e;
            if (!TextUtils.isEmpty(c0202s.f1420q)) {
                charSequence = this.f5963n.f1420q;
            }
            StringBuilder sb = new StringBuilder();
            sb.append((Object) charSequence);
            sb.append(", ");
            C1958c c1958c2 = this.f5967r;
            Object obj = null;
            if (c1958c2.isVisible()) {
                if (c1958c2.m663e()) {
                    if (c1958c2.f5930i.f6659h > 0 && (context = (Context) c1958c2.f5923b.get()) != null) {
                        int m664d = c1958c2.m664d();
                        int i = c1958c2.f5933l;
                        if (m664d <= i) {
                            obj = context.getResources().getQuantityString(c1958c2.f5930i.f6659h, c1958c2.m664d(), Integer.valueOf(c1958c2.m664d()));
                        } else {
                            obj = context.getString(c1958c2.f5930i.f6660i, Integer.valueOf(i));
                        }
                    }
                } else {
                    obj = c1958c2.f5930i.f6658g;
                }
            }
            sb.append(obj);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
        C0579d m2314a = C0579d.m2314a(0, 1, getItemVisiblePosition(), 1, false, isSelected());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) m2314a.f2701a);
        }
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            C0577b c0577b = C0577b.f2688a;
            if (i2 >= 21) {
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) c0577b.f2696i);
            }
        }
        String string = getResources().getString(AbstractC1924j.item_view_role_description);
        if (i2 >= 19) {
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", string);
        }
    }

    public void setBadge(C1958c c1958c) {
        this.f5967r = c1958c;
        ImageView imageView = this.f5958i;
        if (imageView == null || !m657b() || imageView == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        C1958c c1958c2 = this.f5967r;
        ImageView imageView2 = this.f5958i;
        FrameLayout frameLayout = null;
        if (imageView == imageView2 && AbstractC1959d.f5939a) {
            frameLayout = (FrameLayout) imageView2.getParent();
        }
        boolean z = AbstractC1959d.f5939a;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        c1958c2.setBounds(rect);
        c1958c2.m662f(imageView, frameLayout);
        if (c1958c2.m665c() != null) {
            c1958c2.m665c().setForeground(c1958c2);
        } else if (AbstractC1959d.f5939a) {
            throw new IllegalArgumentException("Trying to reference null customBadgeParent");
        } else {
            imageView.getOverlay().add(c1958c2);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
        if (r9 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
        m656c(r8.f5958i, (int) (r8.f5952c + r8.f5953d), 49);
        m655e(r8.f5961l, 1.0f, 1.0f, 0);
        r0 = r8.f5960k;
        r1 = r8.f5954e;
        m655e(r0, r1, r1, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0082, code lost:
        m656c(r8.f5958i, r8.f5952c, 49);
        r0 = r8.f5961l;
        r1 = r8.f5955f;
        m655e(r0, r1, r1, 4);
        m655e(r8.f5960k, 1.0f, 1.0f, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009a, code lost:
        if (r9 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009c, code lost:
        m656c(r0, r1, 49);
        r0 = r8.f5959j;
        m654f(r0, ((java.lang.Integer) r0.getTag(p093c.p145g.p146a.p147a.AbstractC1840f.mtrl_view_tag_bottom_padding)).intValue());
        r8.f5961l.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b6, code lost:
        m656c(r0, r1, 17);
        m654f(r8.f5959j, 0);
        r8.f5961l.setVisibility(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c3, code lost:
        r8.f5960k.setVisibility(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d1, code lost:
        if (r9 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e5, code lost:
        if (r9 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setChecked(boolean z) {
        ImageView imageView;
        int i;
        TextView textView = this.f5961l;
        textView.setPivotX(textView.getWidth() / 2);
        TextView textView2 = this.f5961l;
        textView2.setPivotY(textView2.getBaseline());
        TextView textView3 = this.f5960k;
        textView3.setPivotX(textView3.getWidth() / 2);
        TextView textView4 = this.f5960k;
        textView4.setPivotY(textView4.getBaseline());
        int i2 = this.f5956g;
        if (i2 != -1) {
            if (i2 == 0) {
                imageView = this.f5958i;
                i = this.f5952c;
            } else if (i2 == 1) {
                ViewGroup viewGroup = this.f5959j;
                m654f(viewGroup, ((Integer) viewGroup.getTag(AbstractC1840f.mtrl_view_tag_bottom_padding)).intValue());
            } else if (i2 == 2) {
                m656c(this.f5958i, this.f5952c, 17);
                this.f5961l.setVisibility(8);
                this.f5960k.setVisibility(8);
            }
        } else if (this.f5957h) {
            imageView = this.f5958i;
            i = this.f5952c;
        } else {
            ViewGroup viewGroup2 = this.f5959j;
            m654f(viewGroup2, ((Integer) viewGroup2.getTag(AbstractC1840f.mtrl_view_tag_bottom_padding)).intValue());
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f5960k.setEnabled(z);
        this.f5961l.setEnabled(z);
        this.f5958i.setEnabled(z);
        if (!z) {
            AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
            if (Build.VERSION.SDK_INT >= 24) {
                setPointerIcon(null);
                return;
            }
            return;
        }
        Context context = getContext();
        int i = Build.VERSION.SDK_INT;
        C0628v c0628v = i >= 24 ? new C0628v(PointerIcon.getSystemIcon(context, 1002)) : new C0628v(null);
        AtomicInteger atomicInteger2 = AbstractC0605j0.f2748a;
        if (i >= 24) {
            setPointerIcon((PointerIcon) c0628v.f2794a);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.f5965p) {
            return;
        }
        this.f5965p = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = AbstractC0022t.m3466u0(drawable).mutate();
            this.f5966q = drawable;
            ColorStateList colorStateList = this.f5964o;
            if (colorStateList != null) {
                AbstractC0022t.m3480n0(drawable, colorStateList);
            }
        }
        this.f5958i.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f5958i.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f5958i.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.f5964o = colorStateList;
        if (this.f5963n == null || (drawable = this.f5966q) == null) {
            return;
        }
        AbstractC0022t.m3480n0(drawable, colorStateList);
        this.f5966q.invalidateSelf();
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : AbstractC0472e.m2430c(getContext(), i));
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(drawable);
        } else {
            setBackgroundDrawable(drawable);
        }
    }

    public void setItemPosition(int i) {
        this.f5962m = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f5956g != i) {
            this.f5956g = i;
            C0202s c0202s = this.f5963n;
            if (c0202s != null) {
                setChecked(c0202s.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.f5957h != z) {
            this.f5957h = z;
            C0202s c0202s = this.f5963n;
            if (c0202s != null) {
                setChecked(c0202s.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i) {
        AbstractC0022t.m3484l0(this.f5961l, i);
        m658a(this.f5960k.getTextSize(), this.f5961l.getTextSize());
    }

    public void setTextAppearanceInactive(int i) {
        AbstractC0022t.m3484l0(this.f5960k, i);
        m658a(this.f5960k.getTextSize(), this.f5961l.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f5960k.setTextColor(colorStateList);
            this.f5961l.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f5960k.setText(charSequence);
        this.f5961l.setText(charSequence);
        C0202s c0202s = this.f5963n;
        if (c0202s == null || TextUtils.isEmpty(c0202s.f1420q)) {
            setContentDescription(charSequence);
        }
        C0202s c0202s2 = this.f5963n;
        if (c0202s2 != null && !TextUtils.isEmpty(c0202s2.f1421r)) {
            charSequence = this.f5963n.f1421r;
        }
        AbstractC0022t.m3476p0(this, charSequence);
    }
}