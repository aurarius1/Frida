package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.p059d1.C0578c;
import p010b.p086w.AbstractC1077v0;
import p093c.p145g.p146a.p147a.AbstractC1804b;
import p093c.p145g.p146a.p147a.AbstractC1926k;
import p093c.p145g.p146a.p147a.AbstractC1940l;
import p093c.p145g.p146a.p147a.p149b0.AbstractC1822r;
import p093c.p145g.p146a.p147a.p154g0.C1855m;
import p093c.p145g.p146a.p147a.p154g0.C1856n;
import p093c.p145g.p146a.p147a.p154g0.InterfaceC1845c;
import p093c.p145g.p146a.p147a.p157j0.p158a.AbstractC1925a;
import p093c.p145g.p146a.p147a.p159k0.C1937k;
import p093c.p145g.p146a.p147a.p168t.C1989d;
import p093c.p145g.p146a.p147a.p168t.C1990e;
import p093c.p145g.p146a.p147a.p168t.C1991f;
import p093c.p145g.p146a.p147a.p168t.C1992g;
import p093c.p145g.p146a.p147a.p168t.C1993h;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: b */
    public static final String f6754b = MaterialButtonToggleGroup.class.getSimpleName();

    /* renamed from: c */
    public static final int f6755c = AbstractC1926k.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* renamed from: d */
    public final List f6756d;

    /* renamed from: e */
    public final C1991f f6757e;

    /* renamed from: f */
    public final C1993h f6758f;

    /* renamed from: g */
    public final LinkedHashSet f6759g;

    /* renamed from: h */
    public final Comparator f6760h;

    /* renamed from: i */
    public Integer[] f6761i;

    /* renamed from: j */
    public boolean f6762j;

    /* renamed from: k */
    public boolean f6763k;

    /* renamed from: l */
    public boolean f6764l;

    /* renamed from: m */
    public int f6765m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(AbstractC1925a.m676a(context, attributeSet, r3, r4), attributeSet, r3);
        int i = AbstractC1804b.materialButtonToggleGroupStyle;
        int i2 = f6755c;
        this.f6756d = new ArrayList();
        this.f6757e = new C1991f(this, null);
        this.f6758f = new C1993h(this, null);
        this.f6759g = new LinkedHashSet();
        this.f6760h = new C1989d(this);
        this.f6762j = false;
        TypedArray m764d = AbstractC1822r.m764d(getContext(), attributeSet, AbstractC1940l.MaterialButtonToggleGroup, i, i2, new int[0]);
        setSingleSelection(m764d.getBoolean(AbstractC1940l.MaterialButtonToggleGroup_singleSelection, false));
        this.f6765m = m764d.getResourceId(AbstractC1940l.MaterialButtonToggleGroup_checkedButton, -1);
        this.f6764l = m764d.getBoolean(AbstractC1940l.MaterialButtonToggleGroup_selectionRequired, false);
        setChildrenDrawingOrderEnabled(true);
        m764d.recycle();
        AbstractC0605j0.m2263T(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m311d(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m311d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && m311d(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setCheckedId(int i) {
        this.f6765m = i;
        m313b(i, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(AbstractC0605j0.m2251g());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.f6741h.add(this.f6757e);
        materialButton.setOnPressedChangeListenerInternal(this.f6758f);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* renamed from: a */
    public final void m314a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton m312c = m312c(i);
            int min = Math.min(m312c.getStrokeWidth(), m312c(i - 1).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = m312c.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                AbstractC0022t.m3490i0(layoutParams2, 0);
                AbstractC0022t.m3488j0(layoutParams2, -min);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -min;
                if (Build.VERSION.SDK_INT >= 17) {
                    layoutParams2.setMarginStart(0);
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = 0;
                }
            }
            m312c.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
            return;
        }
        AbstractC0022t.m3490i0(layoutParams3, 0);
        AbstractC0022t.m3488j0(layoutParams3, 0);
        layoutParams3.leftMargin = 0;
        layoutParams3.rightMargin = 0;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            if (materialButton.isChecked()) {
                m309f(materialButton.getId(), true);
                setCheckedId(materialButton.getId());
            }
            C1856n shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.f6756d.add(new C1992g(shapeAppearanceModel.f5696e, shapeAppearanceModel.f5699h, shapeAppearanceModel.f5697f, shapeAppearanceModel.f5698g));
            AbstractC0605j0.m2269N(materialButton, new C1990e(this));
        }
    }

    /* renamed from: b */
    public final void m313b(int i, boolean z) {
        Iterator it = this.f6759g.iterator();
        while (it.hasNext()) {
            ((C1937k) it.next()).f5879a.getClass();
        }
    }

    /* renamed from: c */
    public final MaterialButton m312c(int i) {
        return (MaterialButton) getChildAt(i);
    }

    /* renamed from: d */
    public final boolean m311d(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f6760h);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(m312c(i), Integer.valueOf(i));
        }
        this.f6761i = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* renamed from: e */
    public final void m310e(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof MaterialButton) {
            this.f6762j = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.f6762j = false;
        }
    }

    /* renamed from: f */
    public final boolean m309f(int i, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (this.f6764l && checkedButtonIds.isEmpty()) {
            m310e(i, true);
            this.f6765m = i;
            return false;
        }
        if (z && this.f6763k) {
            checkedButtonIds.remove(Integer.valueOf(i));
            for (Integer num : checkedButtonIds) {
                int intValue = num.intValue();
                m310e(intValue, false);
                m313b(intValue, false);
            }
        }
        return true;
    }

    /* renamed from: g */
    public void m308g() {
        C1992g c1992g;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton m312c = m312c(i);
            if (m312c.getVisibility() != 8) {
                C1856n shapeAppearanceModel = m312c.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                C1855m c1855m = new C1855m(shapeAppearanceModel);
                C1992g c1992g2 = (C1992g) this.f6756d.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z = getOrientation() == 0;
                    if (i == firstVisibleChildIndex) {
                        if (z) {
                            if (AbstractC1077v0.m1300D(this)) {
                                InterfaceC1845c interfaceC1845c = C1992g.f6037a;
                                c1992g = new C1992g(interfaceC1845c, interfaceC1845c, c1992g2.f6039c, c1992g2.f6040d);
                            } else {
                                InterfaceC1845c interfaceC1845c2 = c1992g2.f6038b;
                                InterfaceC1845c interfaceC1845c3 = c1992g2.f6041e;
                                InterfaceC1845c interfaceC1845c4 = C1992g.f6037a;
                                c1992g = new C1992g(interfaceC1845c2, interfaceC1845c3, interfaceC1845c4, interfaceC1845c4);
                            }
                        } else {
                            InterfaceC1845c interfaceC1845c5 = c1992g2.f6038b;
                            InterfaceC1845c interfaceC1845c6 = C1992g.f6037a;
                            c1992g = new C1992g(interfaceC1845c5, interfaceC1845c6, c1992g2.f6039c, interfaceC1845c6);
                        }
                    } else if (i != lastVisibleChildIndex) {
                        c1992g2 = null;
                    } else if (z) {
                        if (AbstractC1077v0.m1300D(this)) {
                            InterfaceC1845c interfaceC1845c7 = c1992g2.f6038b;
                            InterfaceC1845c interfaceC1845c8 = c1992g2.f6041e;
                            InterfaceC1845c interfaceC1845c9 = C1992g.f6037a;
                            c1992g = new C1992g(interfaceC1845c7, interfaceC1845c8, interfaceC1845c9, interfaceC1845c9);
                        } else {
                            InterfaceC1845c interfaceC1845c10 = C1992g.f6037a;
                            c1992g = new C1992g(interfaceC1845c10, interfaceC1845c10, c1992g2.f6039c, c1992g2.f6040d);
                        }
                    } else {
                        InterfaceC1845c interfaceC1845c11 = C1992g.f6037a;
                        c1992g = new C1992g(interfaceC1845c11, c1992g2.f6041e, interfaceC1845c11, c1992g2.f6040d);
                    }
                    c1992g2 = c1992g;
                }
                if (c1992g2 == null) {
                    c1855m.m725c(0.0f);
                } else {
                    c1855m.f5684e = c1992g2.f6038b;
                    c1855m.f5687h = c1992g2.f6041e;
                    c1855m.f5685f = c1992g2.f6039c;
                    c1855m.f5686g = c1992g2.f6040d;
                }
                m312c.setShapeAppearanceModel(c1855m.m727a());
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.f6763k) {
            return this.f6765m;
        }
        return -1;
    }

    public List getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton m312c = m312c(i);
            if (m312c.isChecked()) {
                arrayList.add(Integer.valueOf(m312c.getId()));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f6761i;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f6765m;
        if (i != -1) {
            m310e(i, true);
            m309f(i, true);
            setCheckedId(i);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0578c m2315a = C0578c.m2315a(1, getVisibleButtonCount(), false, this.f6763k ? 1 : 2);
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) m2315a.f2700a);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        m308g();
        m314a();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.f6741h.remove(this.f6757e);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f6756d.remove(indexOfChild);
        }
        m308g();
        m314a();
    }

    public void setSelectionRequired(boolean z) {
        this.f6764l = z;
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.f6763k != z) {
            this.f6763k = z;
            this.f6762j = true;
            for (int i = 0; i < getChildCount(); i++) {
                MaterialButton m312c = m312c(i);
                m312c.setChecked(false);
                m313b(m312c.getId(), false);
            }
            this.f6762j = false;
            setCheckedId(-1);
        }
    }
}