package p093c.p145g.p146a.p147a.p166r;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.HashSet;
import p010b.p016c.AbstractC0075a;
import p010b.p016c.p018l.p019a.AbstractC0142b;
import p010b.p016c.p024p.p025m.C0199p;
import p010b.p016c.p024p.p025m.C0202s;
import p010b.p016c.p024p.p025m.InterfaceC0183f0;
import p010b.p046j.p057k.C0562c;
import p010b.p046j.p057k.C0563d;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.p059d1.C0578c;
import p010b.p069n.p070a.p071a.C0767b;
import p010b.p086w.C1024b;
import p010b.p086w.C1058m0;
import p093c.p145g.p146a.p147a.AbstractC1829d;
import p093c.p145g.p146a.p147a.p149b0.C1820p;
import p093c.p145g.p146a.p147a.p163o.AbstractC1959d;
import p093c.p145g.p146a.p147a.p163o.C1958c;

/* renamed from: c.g.a.a.r.e */
/* loaded from: classes.dex */
public class C1970e extends ViewGroup implements InterfaceC0183f0 {

    /* renamed from: b */
    public static final int[] f5969b = {16842912};

    /* renamed from: c */
    public static final int[] f5970c = {-16842910};

    /* renamed from: A */
    public SparseArray f5971A;

    /* renamed from: B */
    public C1972g f5972B;

    /* renamed from: C */
    public C0199p f5973C;

    /* renamed from: d */
    public final C1058m0 f5974d;

    /* renamed from: e */
    public final int f5975e;

    /* renamed from: f */
    public final int f5976f;

    /* renamed from: g */
    public final int f5977g;

    /* renamed from: h */
    public final int f5978h;

    /* renamed from: i */
    public final int f5979i;

    /* renamed from: j */
    public final View.OnClickListener f5980j;

    /* renamed from: k */
    public final C0562c f5981k;

    /* renamed from: l */
    public final SparseArray f5982l;

    /* renamed from: m */
    public boolean f5983m;

    /* renamed from: n */
    public int f5984n;

    /* renamed from: o */
    public C1967b[] f5985o;

    /* renamed from: p */
    public int f5986p;

    /* renamed from: q */
    public int f5987q;

    /* renamed from: r */
    public ColorStateList f5988r;

    /* renamed from: s */
    public int f5989s;

    /* renamed from: t */
    public ColorStateList f5990t;

    /* renamed from: u */
    public final ColorStateList f5991u;

    /* renamed from: v */
    public int f5992v;

    /* renamed from: w */
    public int f5993w;

    /* renamed from: x */
    public Drawable f5994x;

    /* renamed from: y */
    public int f5995y;

    /* renamed from: z */
    public int[] f5996z;

    public C1970e(Context context) {
        super(context, null);
        this.f5981k = new C0563d(5);
        this.f5982l = new SparseArray(5);
        this.f5986p = 0;
        this.f5987q = 0;
        this.f5971A = new SparseArray(5);
        Resources resources = getResources();
        this.f5975e = resources.getDimensionPixelSize(AbstractC1829d.design_bottom_navigation_item_max_width);
        this.f5976f = resources.getDimensionPixelSize(AbstractC1829d.design_bottom_navigation_item_min_width);
        this.f5977g = resources.getDimensionPixelSize(AbstractC1829d.design_bottom_navigation_active_item_max_width);
        this.f5978h = resources.getDimensionPixelSize(AbstractC1829d.design_bottom_navigation_active_item_min_width);
        this.f5979i = resources.getDimensionPixelSize(AbstractC1829d.design_bottom_navigation_height);
        this.f5991u = m651c(16842808);
        C1024b c1024b = new C1024b();
        this.f5974d = c1024b;
        c1024b.m1347L(0);
        c1024b.m1349J(115L);
        c1024b.m1348K(new C0767b());
        c1024b.m1351H(new C1820p());
        this.f5980j = new View$OnClickListenerC1969d(this);
        this.f5996z = new int[5];
        AbstractC0605j0.m2263T(this, 1);
    }

    private C1967b getNewItem() {
        C1967b c1967b = (C1967b) this.f5981k.mo2331a();
        return c1967b == null ? new C1967b(getContext()) : c1967b;
    }

    private void setBadgeIfNeeded(C1967b c1967b) {
        C1958c c1958c;
        int id = c1967b.getId();
        if ((id != -1) && (c1958c = (C1958c) this.f5971A.get(id)) != null) {
            c1967b.setBadge(c1958c);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: a */
    public void m652a() {
        removeAllViews();
        C1967b[] c1967bArr = this.f5985o;
        if (c1967bArr != null) {
            for (C1967b c1967b : c1967bArr) {
                if (c1967b != null) {
                    this.f5981k.mo2330b(c1967b);
                    ImageView imageView = c1967b.f5958i;
                    if (c1967b.m657b()) {
                        if (imageView != null) {
                            c1967b.setClipChildren(true);
                            c1967b.setClipToPadding(true);
                            C1958c c1958c = c1967b.f5967r;
                            boolean z = AbstractC1959d.f5939a;
                            if (c1958c != null) {
                                if (AbstractC1959d.f5939a || c1958c.m665c() != null) {
                                    c1958c.m665c().setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(c1958c);
                                }
                            }
                        }
                        c1967b.f5967r = null;
                    }
                }
            }
        }
        if (this.f5973C.size() == 0) {
            this.f5986p = 0;
            this.f5987q = 0;
            this.f5985o = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f5973C.size(); i++) {
            hashSet.add(Integer.valueOf(this.f5973C.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.f5971A.size(); i2++) {
            int keyAt = this.f5971A.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f5971A.delete(keyAt);
            }
        }
        this.f5985o = new C1967b[this.f5973C.size()];
        boolean m650d = m650d(this.f5984n, this.f5973C.m2927l().size());
        for (int i3 = 0; i3 < this.f5973C.size(); i3++) {
            this.f5972B.f5999d = true;
            this.f5973C.getItem(i3).setCheckable(true);
            this.f5972B.f5999d = false;
            C1967b newItem = getNewItem();
            this.f5985o[i3] = newItem;
            newItem.setIconTintList(this.f5988r);
            newItem.setIconSize(this.f5989s);
            newItem.setTextColor(this.f5991u);
            newItem.setTextAppearanceInactive(this.f5992v);
            newItem.setTextAppearanceActive(this.f5993w);
            newItem.setTextColor(this.f5990t);
            Drawable drawable = this.f5994x;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f5995y);
            }
            newItem.setShifting(m650d);
            newItem.setLabelVisibilityMode(this.f5984n);
            C0202s c0202s = (C0202s) this.f5973C.getItem(i3);
            newItem.mo275d(c0202s, 0);
            newItem.setItemPosition(i3);
            int i4 = c0202s.f1404a;
            newItem.setOnTouchListener((View.OnTouchListener) this.f5982l.get(i4));
            newItem.setOnClickListener(this.f5980j);
            int i5 = this.f5986p;
            if (i5 != 0 && i4 == i5) {
                this.f5987q = i3;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.f5973C.size() - 1, this.f5987q);
        this.f5987q = min;
        this.f5973C.getItem(min).setChecked(true);
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0183f0
    /* renamed from: b */
    public void mo274b(C0199p c0199p) {
        this.f5973C = c0199p;
    }

    /* renamed from: c */
    public ColorStateList m651c(int i) {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            ColorStateList m3001a = AbstractC0142b.m3001a(getContext(), typedValue.resourceId);
            if (getContext().getTheme().resolveAttribute(AbstractC0075a.colorPrimary, typedValue, true)) {
                int i2 = typedValue.data;
                int defaultColor = m3001a.getDefaultColor();
                int[] iArr = f5970c;
                return new ColorStateList(new int[][]{iArr, f5969b, ViewGroup.EMPTY_STATE_SET}, new int[]{m3001a.getColorForState(iArr, defaultColor), i2, defaultColor});
            }
            return null;
        }
        return null;
    }

    /* renamed from: d */
    public final boolean m650d(int i, int i2) {
        if (i == -1) {
            if (i2 > 3) {
                return true;
            }
        } else if (i == 0) {
            return true;
        }
        return false;
    }

    public SparseArray getBadgeDrawables() {
        return this.f5971A;
    }

    public ColorStateList getIconTintList() {
        return this.f5988r;
    }

    public Drawable getItemBackground() {
        C1967b[] c1967bArr = this.f5985o;
        return (c1967bArr == null || c1967bArr.length <= 0) ? this.f5994x : c1967bArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f5995y;
    }

    public int getItemIconSize() {
        return this.f5989s;
    }

    public int getItemTextAppearanceActive() {
        return this.f5993w;
    }

    public int getItemTextAppearanceInactive() {
        return this.f5992v;
    }

    public ColorStateList getItemTextColor() {
        return this.f5990t;
    }

    public int getLabelVisibilityMode() {
        return this.f5984n;
    }

    public int getSelectedItemId() {
        return this.f5986p;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0578c m2315a = C0578c.m2315a(1, this.f5973C.m2927l().size(), false, 1);
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) m2315a.f2700a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (AbstractC0605j0.m2241q(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f5973C.m2927l().size();
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f5979i, 1073741824);
        if (m650d(this.f5984n, size2) && this.f5983m) {
            View childAt = getChildAt(this.f5987q);
            int i3 = this.f5978h;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f5977g, Integer.MIN_VALUE), makeMeasureSpec);
                i3 = Math.max(i3, childAt.getMeasuredWidth());
            }
            int i4 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min = Math.min(size - (this.f5976f * i4), Math.min(i3, this.f5977g));
            int i5 = size - min;
            int min2 = Math.min(i5 / (i4 == 0 ? 1 : i4), this.f5975e);
            int i6 = i5 - (i4 * min2);
            int i7 = 0;
            while (i7 < childCount) {
                if (getChildAt(i7).getVisibility() != 8) {
                    int[] iArr = this.f5996z;
                    iArr[i7] = i7 == this.f5987q ? min : min2;
                    if (i6 > 0) {
                        iArr[i7] = iArr[i7] + 1;
                        i6--;
                    }
                } else {
                    this.f5996z[i7] = 0;
                }
                i7++;
            }
        } else {
            int min3 = Math.min(size / (size2 == 0 ? 1 : size2), this.f5977g);
            int i8 = size - (size2 * min3);
            for (int i9 = 0; i9 < childCount; i9++) {
                if (getChildAt(i9).getVisibility() != 8) {
                    int[] iArr2 = this.f5996z;
                    iArr2[i9] = min3;
                    if (i8 > 0) {
                        iArr2[i9] = iArr2[i9] + 1;
                        i8--;
                    }
                } else {
                    this.f5996z[i9] = 0;
                }
            }
        }
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.f5996z[i11], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i10 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i10, View.MeasureSpec.makeMeasureSpec(i10, 1073741824), 0), View.resolveSizeAndState(this.f5979i, makeMeasureSpec, 0));
    }

    public void setBadgeDrawables(SparseArray sparseArray) {
        this.f5971A = sparseArray;
        C1967b[] c1967bArr = this.f5985o;
        if (c1967bArr != null) {
            for (C1967b c1967b : c1967bArr) {
                c1967b.setBadge((C1958c) sparseArray.get(c1967b.getId()));
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f5988r = colorStateList;
        C1967b[] c1967bArr = this.f5985o;
        if (c1967bArr != null) {
            for (C1967b c1967b : c1967bArr) {
                c1967b.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f5994x = drawable;
        C1967b[] c1967bArr = this.f5985o;
        if (c1967bArr != null) {
            for (C1967b c1967b : c1967bArr) {
                c1967b.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f5995y = i;
        C1967b[] c1967bArr = this.f5985o;
        if (c1967bArr != null) {
            for (C1967b c1967b : c1967bArr) {
                c1967b.setItemBackground(i);
            }
        }
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.f5983m = z;
    }

    public void setItemIconSize(int i) {
        this.f5989s = i;
        C1967b[] c1967bArr = this.f5985o;
        if (c1967bArr != null) {
            for (C1967b c1967b : c1967bArr) {
                c1967b.setIconSize(i);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f5993w = i;
        C1967b[] c1967bArr = this.f5985o;
        if (c1967bArr != null) {
            for (C1967b c1967b : c1967bArr) {
                c1967b.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f5990t;
                if (colorStateList != null) {
                    c1967b.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f5992v = i;
        C1967b[] c1967bArr = this.f5985o;
        if (c1967bArr != null) {
            for (C1967b c1967b : c1967bArr) {
                c1967b.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f5990t;
                if (colorStateList != null) {
                    c1967b.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f5990t = colorStateList;
        C1967b[] c1967bArr = this.f5985o;
        if (c1967bArr != null) {
            for (C1967b c1967b : c1967bArr) {
                c1967b.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f5984n = i;
    }

    public void setPresenter(C1972g c1972g) {
        this.f5972B = c1972g;
    }
}