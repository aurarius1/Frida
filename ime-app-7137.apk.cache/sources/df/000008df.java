package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import java.lang.ref.WeakReference;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.InterfaceC0610m;
import p010b.p046j.p058l.p059d1.C0577b;
import p093c.p145g.p146a.p147a.p162n.AbstractC1952b;
import p093c.p145g.p146a.p147a.p162n.AbstractC1953c;
import p093c.p145g.p146a.p147a.p162n.C1951a;

/* loaded from: classes.dex */
public class AppBarLayout$BaseBehavior extends AbstractC1953c {

    /* renamed from: i */
    public int f6640i;

    /* renamed from: j */
    public int f6641j;

    /* renamed from: k */
    public boolean f6642k;

    /* renamed from: l */
    public float f6643l;

    /* renamed from: m */
    public WeakReference f6644m;

    /* loaded from: classes.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C1951a();

        /* renamed from: d */
        public int f6645d;

        /* renamed from: e */
        public float f6646e;

        /* renamed from: f */
        public boolean f6647f;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6645d = parcel.readInt();
            this.f6646e = parcel.readFloat();
            this.f6647f = parcel.readByte() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f511c, i);
            parcel.writeInt(this.f6645d);
            parcel.writeFloat(this.f6646e);
            parcel.writeByte(this.f6647f ? (byte) 1 : (byte) 0);
        }
    }

    public AppBarLayout$BaseBehavior() {
        this.f6641j = -1;
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6641j = -1;
    }

    /* renamed from: D */
    public final View m362D(CoordinatorLayout coordinatorLayout) {
        int childCount = coordinatorLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = coordinatorLayout.getChildAt(i);
            if ((childAt instanceof InterfaceC0610m) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: E */
    public int m361E() {
        return m668B() + 0;
    }

    /* renamed from: F */
    public void m360F(CoordinatorLayout coordinatorLayout, AbstractC1952b abstractC1952b, View view, int i, int[] iArr) {
        if (i == 0) {
            throw null;
        }
        if (i < 0) {
            throw null;
        }
        throw null;
    }

    /* renamed from: G */
    public void m359G(CoordinatorLayout coordinatorLayout, AbstractC1952b abstractC1952b, int i, int[] iArr) {
        if (i < 0) {
            throw null;
        }
        if (i == 0) {
            m357I(coordinatorLayout, abstractC1952b);
        }
    }

    /* renamed from: H */
    public boolean m358H(CoordinatorLayout coordinatorLayout, AbstractC1952b abstractC1952b, View view, int i, int i2) {
        if ((i & 2) == 0) {
            this.f6644m = null;
            this.f6640i = i2;
            return false;
        }
        throw null;
    }

    /* renamed from: I */
    public final void m357I(CoordinatorLayout coordinatorLayout, AbstractC1952b abstractC1952b) {
        AbstractC0605j0.m2274I(coordinatorLayout, C0577b.f2689b.m2316a());
        AbstractC0605j0.m2274I(coordinatorLayout, C0577b.f2690c.m2316a());
        if (m362D(coordinatorLayout) != null) {
            throw null;
        }
    }

    @Override // p093c.p145g.p146a.p147a.p162n.AbstractC1954d, p010b.p044i.p045d.AbstractC0452b
    /* renamed from: k */
    public boolean mo221k(CoordinatorLayout coordinatorLayout, View view, int i) {
        super.mo221k(coordinatorLayout, (AbstractC1952b) view, i);
        throw null;
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: l */
    public boolean mo352l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        AbstractC1952b abstractC1952b = (AbstractC1952b) view;
        throw null;
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: p */
    public /* bridge */ /* synthetic */ void mo328p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        m360F(coordinatorLayout, (AbstractC1952b) view, view2, i2, iArr);
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: r */
    public /* bridge */ /* synthetic */ void mo327r(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m359G(coordinatorLayout, (AbstractC1952b) view, i4, iArr);
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: u */
    public void mo326u(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        AbstractC1952b abstractC1952b = (AbstractC1952b) view;
        if (!(parcelable instanceof SavedState)) {
            this.f6641j = -1;
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f6641j = savedState.f6645d;
        this.f6643l = savedState.f6646e;
        this.f6642k = savedState.f6647f;
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: v */
    public Parcelable mo325v(CoordinatorLayout coordinatorLayout, View view) {
        AbstractC1952b abstractC1952b = (AbstractC1952b) view;
        android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
        m668B();
        throw null;
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: x */
    public /* bridge */ /* synthetic */ boolean mo324x(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return m358H(coordinatorLayout, (AbstractC1952b) view, view2, i, i2);
    }

    @Override // p010b.p044i.p045d.AbstractC0452b
    /* renamed from: z */
    public void mo323z(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        AbstractC1952b abstractC1952b = (AbstractC1952b) view;
        if (this.f6640i == 0 || i == 1) {
            m361E();
            throw null;
        } else {
            this.f6644m = new WeakReference(view2);
        }
    }
}