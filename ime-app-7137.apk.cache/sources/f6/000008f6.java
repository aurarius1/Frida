package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;
import p010b.p046j.p057k.C0561b;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p086w.AbstractC1077v0;
import p093c.p145g.p146a.p147a.AbstractC1804b;
import p093c.p145g.p146a.p147a.AbstractC1840f;
import p093c.p145g.p146a.p147a.p171w.AbstractC2024j0;
import p093c.p145g.p146a.p147a.p171w.C2008b0;
import p093c.p145g.p146a.p147a.p171w.C2011d;
import p093c.p145g.p146a.p147a.p171w.C2035r;
import p093c.p145g.p146a.p147a.p171w.C2040w;

/* loaded from: classes.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: b */
    public final Calendar f6803b;

    /* renamed from: c */
    public final boolean f6804c;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f6803b = AbstractC2024j0.m548e();
        if (C2040w.m532V0(getContext())) {
            setNextFocusLeftId(AbstractC1840f.cancel_button);
            setNextFocusRightId(AbstractC1840f.confirm_button);
        }
        this.f6804c = C2040w.m531W0(getContext(), AbstractC1804b.nestedScrollable);
        AbstractC0605j0.m2269N(this, new C2035r(this));
    }

    /* JADX DEBUG: Method merged with bridge method */
    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: a */
    public C2008b0 getAdapter2() {
        return (C2008b0) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int m566a;
        int width;
        int m566a2;
        int width2;
        int width3;
        int i;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C2008b0 adapter2 = getAdapter2();
        DateSelector dateSelector = adapter2.f6124d;
        C2011d c2011d = adapter2.f6126f;
        Long item = adapter2.getItem(adapter2.m565b());
        Long item2 = adapter2.getItem(adapter2.m563d());
        for (C0561b c0561b : dateSelector.m290e()) {
            Object obj = c0561b.f2654a;
            if (obj != null) {
                if (c0561b.f2655b != null) {
                    long longValue = ((Long) obj).longValue();
                    long longValue2 = ((Long) c0561b.f2655b).longValue();
                    Long valueOf = Long.valueOf(longValue);
                    Long valueOf2 = Long.valueOf(longValue2);
                    if (!(item == null || item2 == null || valueOf == null || valueOf2 == null || valueOf.longValue() > item2.longValue() || valueOf2.longValue() < item.longValue())) {
                        boolean m1300D = AbstractC1077v0.m1300D(this);
                        if (longValue < item.longValue()) {
                            m566a = adapter2.m565b();
                            if (m566a % adapter2.f6123c.f6808e == 0) {
                                width = 0;
                            } else {
                                View childAt = materialCalendarGridView.getChildAt(m566a - 1);
                                width = !m1300D ? childAt.getRight() : childAt.getLeft();
                            }
                        } else {
                            materialCalendarGridView.f6803b.setTimeInMillis(longValue);
                            m566a = adapter2.m566a(materialCalendarGridView.f6803b.get(5));
                            View childAt2 = materialCalendarGridView.getChildAt(m566a);
                            width = (childAt2.getWidth() / 2) + childAt2.getLeft();
                        }
                        if (longValue2 > item2.longValue()) {
                            m566a2 = Math.min(adapter2.m563d(), getChildCount() - 1);
                            if ((m566a2 + 1) % adapter2.f6123c.f6808e == 0) {
                                width2 = getWidth();
                            } else {
                                View childAt3 = materialCalendarGridView.getChildAt(m566a2);
                                width2 = !m1300D ? childAt3.getRight() : childAt3.getLeft();
                            }
                        } else {
                            materialCalendarGridView.f6803b.setTimeInMillis(longValue2);
                            m566a2 = adapter2.m566a(materialCalendarGridView.f6803b.get(5));
                            View childAt4 = materialCalendarGridView.getChildAt(m566a2);
                            width2 = (childAt4.getWidth() / 2) + childAt4.getLeft();
                        }
                        int itemId = (int) adapter2.getItemId(m566a);
                        int itemId2 = (int) adapter2.getItemId(m566a2);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt5 = materialCalendarGridView.getChildAt(numColumns);
                            int top = childAt5.getTop() + c2011d.f6136a.f6128a.top;
                            int bottom = childAt5.getBottom() - c2011d.f6136a.f6128a.bottom;
                            if (m1300D) {
                                int i2 = m566a2 > numColumns2 ? 0 : width2;
                                width3 = numColumns > m566a ? getWidth() : width;
                                i = i2;
                            } else {
                                i = numColumns > m566a ? 0 : width;
                                width3 = m566a2 > numColumns2 ? getWidth() : width2;
                            }
                            canvas.drawRect(i, top, width3, bottom, c2011d.f6143h);
                            itemId++;
                            materialCalendarGridView = this;
                            adapter2 = adapter2;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
            adapter2 = adapter2;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        int m565b;
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            m565b = getAdapter2().m563d();
        } else if (i != 130) {
            super.onFocusChanged(true, i, rect);
            return;
        } else {
            m565b = getAdapter2().m565b();
        }
        setSelection(m565b);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (super.onKeyDown(i, keyEvent)) {
            if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().m565b()) {
                return true;
            }
            if (19 == i) {
                setSelection(getAdapter2().m565b());
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        if (!this.f6804c) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    /* JADX DEBUG: Method merged with bridge method */
    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C2008b0)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C2008b0.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter2().m565b()) {
            i = getAdapter2().m565b();
        }
        super.setSelection(i);
    }
}