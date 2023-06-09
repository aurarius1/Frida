package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.StateSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.customview.view.AbsSavedState;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.p024p.C0169j;
import p010b.p016c.p024p.p025m.C0199p;
import p010b.p016c.p024p.p025m.InterfaceC0179d0;
import p010b.p016c.p026q.C0302q3;
import p010b.p046j.p047d.AbstractC0472e;
import p010b.p086w.AbstractC1077v0;
import p093c.p145g.p146a.p147a.AbstractC1804b;
import p093c.p145g.p146a.p147a.AbstractC1827c;
import p093c.p145g.p146a.p147a.AbstractC1829d;
import p093c.p145g.p146a.p147a.AbstractC1926k;
import p093c.p145g.p146a.p147a.AbstractC1940l;
import p093c.p145g.p146a.p147a.p149b0.AbstractC1822r;
import p093c.p145g.p146a.p147a.p152e0.AbstractC1839d;
import p093c.p145g.p146a.p147a.p154g0.C1851i;
import p093c.p145g.p146a.p147a.p157j0.p158a.AbstractC1925a;
import p093c.p145g.p146a.p147a.p166r.C1968c;
import p093c.p145g.p146a.p147a.p166r.C1970e;
import p093c.p145g.p146a.p147a.p166r.C1972g;
import p093c.p145g.p146a.p147a.p166r.C1973h;
import p093c.p145g.p146a.p147a.p166r.C1974i;
import p093c.p145g.p146a.p147a.p166r.C1977l;
import p093c.p145g.p146a.p147a.p166r.InterfaceC1975j;
import p093c.p145g.p146a.p147a.p166r.InterfaceC1976k;
import p093c.p145g.p146a.p147a.p173y.C2045a;

/* loaded from: classes.dex */
public class BottomNavigationView extends FrameLayout {

    /* renamed from: b */
    public static final int f6680b = AbstractC1926k.Widget_Design_BottomNavigationView;

    /* renamed from: c */
    public final C0199p f6681c;

    /* renamed from: d */
    public final C1970e f6682d;

    /* renamed from: e */
    public final C1972g f6683e;

    /* renamed from: f */
    public ColorStateList f6684f;

    /* renamed from: g */
    public MenuInflater f6685g;

    /* renamed from: h */
    public InterfaceC1976k f6686h;

    /* renamed from: i */
    public InterfaceC1975j f6687i;

    /* loaded from: classes.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C1977l();

        /* renamed from: d */
        public Bundle f6688d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6688d = parcel.readBundle(classLoader == null ? SavedState.class.getClassLoader() : classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f511c, i);
            parcel.writeBundle(this.f6688d);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        super(AbstractC1925a.m676a(context, attributeSet, r8, f6680b), attributeSet, r8);
        int i;
        C1968c c1968c;
        int i2 = AbstractC1804b.bottomNavigationStyle;
        C1972g c1972g = new C1972g();
        this.f6683e = c1972g;
        Context context2 = getContext();
        C1968c c1968c2 = new C1968c(context2);
        this.f6681c = c1968c2;
        C1970e c1970e = new C1970e(context2);
        this.f6682d = c1970e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        c1970e.setLayoutParams(layoutParams);
        c1972g.f5998c = c1970e;
        c1972g.f6000e = 1;
        c1970e.setPresenter(c1972g);
        c1968c2.m2937b(c1972g, c1968c2.f1372b);
        getContext();
        c1972g.f5997b = c1968c2;
        c1972g.f5998c.f5973C = c1968c2;
        int[] iArr = AbstractC1940l.BottomNavigationView;
        int i3 = AbstractC1926k.Widget_Design_BottomNavigationView;
        int i4 = AbstractC1940l.BottomNavigationView_itemTextAppearanceInactive;
        int i5 = AbstractC1940l.BottomNavigationView_itemTextAppearanceActive;
        AbstractC1822r.m767a(context2, attributeSet, i2, i3);
        AbstractC1822r.m766b(context2, attributeSet, iArr, i2, i3, i4, i5);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i2, i3);
        C0302q3 c0302q3 = new C0302q3(context2, obtainStyledAttributes);
        int i6 = AbstractC1940l.BottomNavigationView_itemIconTint;
        c1970e.setIconTintList(c0302q3.m2742p(i6) ? c0302q3.m2755c(i6) : c1970e.m651c(16842808));
        setItemIconSize(c0302q3.m2752f(AbstractC1940l.BottomNavigationView_itemIconSize, getResources().getDimensionPixelSize(AbstractC1829d.design_bottom_navigation_icon_size)));
        if (c0302q3.m2742p(i4)) {
            i = 0;
            setItemTextAppearanceInactive(c0302q3.m2745m(i4, 0));
        } else {
            i = 0;
        }
        if (c0302q3.m2742p(i5)) {
            setItemTextAppearanceActive(c0302q3.m2745m(i5, i));
        }
        int i7 = AbstractC1940l.BottomNavigationView_itemTextColor;
        if (c0302q3.m2742p(i7)) {
            setItemTextColor(c0302q3.m2755c(i7));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            C1851i c1851i = new C1851i();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                c1851i.m737p(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            c1851i.f5657d.f5634b = new C2045a(context2);
            c1851i.m730w();
            if (Build.VERSION.SDK_INT >= 16) {
                setBackground(c1851i);
            } else {
                setBackgroundDrawable(c1851i);
            }
        }
        int i8 = AbstractC1940l.BottomNavigationView_elevation;
        if (c0302q3.m2742p(i8)) {
            setElevation(c0302q3.m2752f(i8, 0));
        }
        AbstractC0022t.m3480n0(getBackground().mutate(), AbstractC1077v0.m1261r(context2, c0302q3, AbstractC1940l.BottomNavigationView_backgroundTint));
        setLabelVisibilityMode(c0302q3.m2747k(AbstractC1940l.BottomNavigationView_labelVisibilityMode, -1));
        setItemHorizontalTranslationEnabled(c0302q3.m2757a(AbstractC1940l.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        int m2745m = c0302q3.m2745m(AbstractC1940l.BottomNavigationView_itemBackground, 0);
        if (m2745m != 0) {
            c1970e.setItemBackgroundRes(m2745m);
        } else {
            setItemRippleColor(AbstractC1077v0.m1261r(context2, c0302q3, AbstractC1940l.BottomNavigationView_itemRippleColor));
        }
        int i9 = AbstractC1940l.BottomNavigationView_menu;
        if (c0302q3.m2742p(i9)) {
            int m2745m2 = c0302q3.m2745m(i9, 0);
            c1972g.f5999d = true;
            c1968c = c1968c2;
            getMenuInflater().inflate(m2745m2, c1968c);
            c1972g.f5999d = false;
            c1972g.mo640n(true);
        } else {
            c1968c = c1968c2;
        }
        obtainStyledAttributes.recycle();
        addView(c1970e, layoutParams);
        if (Build.VERSION.SDK_INT < 21 && !(getBackground() instanceof C1851i)) {
            View view = new View(context2);
            view.setBackgroundColor(AbstractC0472e.m2431b(context2, AbstractC1827c.design_bottom_navigation_shadow_color));
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(AbstractC1829d.design_bottom_navigation_shadow_height)));
            addView(view);
        }
        c1968c.mo2915x(new C1973h(this));
        AbstractC1077v0.m1267l(this, new C1974i(this));
    }

    private MenuInflater getMenuInflater() {
        if (this.f6685g == null) {
            this.f6685g = new C0169j(getContext());
        }
        return this.f6685g;
    }

    public Drawable getItemBackground() {
        return this.f6682d.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f6682d.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f6682d.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f6682d.getIconTintList();
    }

    public ColorStateList getItemRippleColor() {
        return this.f6684f;
    }

    public int getItemTextAppearanceActive() {
        return this.f6682d.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f6682d.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f6682d.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f6682d.getLabelVisibilityMode();
    }

    public int getMaxItemCount() {
        return 5;
    }

    public Menu getMenu() {
        return this.f6681c;
    }

    public int getSelectedItemId() {
        return this.f6682d.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C1851i) {
            AbstractC1077v0.m1280X(this, (C1851i) background);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f511c);
        C0199p c0199p = this.f6681c;
        Bundle bundle = savedState.f6688d;
        c0199p.getClass();
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || c0199p.f1392v.isEmpty()) {
            return;
        }
        Iterator it = c0199p.f1392v.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC0179d0 interfaceC0179d0 = (InterfaceC0179d0) weakReference.get();
            if (interfaceC0179d0 == null) {
                c0199p.f1392v.remove(weakReference);
            } else {
                int mo648c = interfaceC0179d0.mo648c();
                if (mo648c > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(mo648c)) != null) {
                    interfaceC0179d0.mo644h(parcelable2);
                }
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable mo646e;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f6688d = bundle;
        C0199p c0199p = this.f6681c;
        if (!c0199p.f1392v.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            Iterator it = c0199p.f1392v.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC0179d0 interfaceC0179d0 = (InterfaceC0179d0) weakReference.get();
                if (interfaceC0179d0 == null) {
                    c0199p.f1392v.remove(weakReference);
                } else {
                    int mo648c = interfaceC0179d0.mo648c();
                    if (mo648c > 0 && (mo646e = interfaceC0179d0.mo646e()) != null) {
                        sparseArray.put(mo648c, mo646e);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
        return savedState;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.setElevation(f);
        }
        AbstractC1077v0.m1281W(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        this.f6682d.setItemBackground(drawable);
        this.f6684f = null;
    }

    public void setItemBackgroundResource(int i) {
        this.f6682d.setItemBackgroundRes(i);
        this.f6684f = null;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        C1970e c1970e = this.f6682d;
        if (c1970e.f5983m != z) {
            c1970e.setItemHorizontalTranslationEnabled(z);
            this.f6683e.mo640n(false);
        }
    }

    public void setItemIconSize(int i) {
        this.f6682d.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f6682d.setIconTintList(colorStateList);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        if (this.f6684f == colorStateList) {
            if (colorStateList != null || this.f6682d.getItemBackground() == null) {
                return;
            }
            this.f6682d.setItemBackground(null);
            return;
        }
        this.f6684f = colorStateList;
        if (colorStateList == null) {
            this.f6682d.setItemBackground(null);
            return;
        }
        if (AbstractC1839d.f5603a) {
            colorStateList2 = new ColorStateList(new int[][]{AbstractC1839d.f5612j, StateSet.NOTHING}, new int[]{AbstractC1839d.m755a(colorStateList, AbstractC1839d.f5608f), AbstractC1839d.m755a(colorStateList, AbstractC1839d.f5604b)});
        } else {
            int[] iArr = AbstractC1839d.f5608f;
            int[] iArr2 = AbstractC1839d.f5609g;
            int[] iArr3 = AbstractC1839d.f5610h;
            int[] iArr4 = AbstractC1839d.f5611i;
            int[] iArr5 = AbstractC1839d.f5604b;
            int[] iArr6 = AbstractC1839d.f5605c;
            int[] iArr7 = AbstractC1839d.f5606d;
            int[] iArr8 = AbstractC1839d.f5607e;
            colorStateList2 = new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, AbstractC1839d.f5612j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{AbstractC1839d.m755a(colorStateList, iArr), AbstractC1839d.m755a(colorStateList, iArr2), AbstractC1839d.m755a(colorStateList, iArr3), AbstractC1839d.m755a(colorStateList, iArr4), 0, AbstractC1839d.m755a(colorStateList, iArr5), AbstractC1839d.m755a(colorStateList, iArr6), AbstractC1839d.m755a(colorStateList, iArr7), AbstractC1839d.m755a(colorStateList, iArr8), 0});
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f6682d.setItemBackground(new RippleDrawable(colorStateList2, null, null));
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(1.0E-5f);
        Drawable m3466u0 = AbstractC0022t.m3466u0(gradientDrawable);
        AbstractC0022t.m3480n0(m3466u0, colorStateList2);
        this.f6682d.setItemBackground(m3466u0);
    }

    public void setItemTextAppearanceActive(int i) {
        this.f6682d.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f6682d.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f6682d.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f6682d.getLabelVisibilityMode() != i) {
            this.f6682d.setLabelVisibilityMode(i);
            this.f6683e.mo640n(false);
        }
    }

    public void setOnNavigationItemReselectedListener(InterfaceC1975j interfaceC1975j) {
        this.f6687i = interfaceC1975j;
    }

    public void setOnNavigationItemSelectedListener(InterfaceC1976k interfaceC1976k) {
        this.f6686h = interfaceC1976k;
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.f6681c.findItem(i);
        if (findItem == null || this.f6681c.m2920s(findItem, this.f6683e, 0)) {
            return;
        }
        findItem.setChecked(true);
    }
}