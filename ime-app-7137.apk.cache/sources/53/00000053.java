package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.AbstractC0080f;
import p010b.p016c.p026q.AbstractC0340y1;
import p010b.p016c.p026q.C0335x1;
import p010b.p046j.p058l.AbstractC0605j0;

/* loaded from: classes.dex */
public class AlertDialogLayout extends AbstractC0340y1 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    /* renamed from: q */
    public static int m3422q(View view) {
        int m2240r = AbstractC0605j0.m2240r(view);
        if (m2240r > 0) {
            return m2240r;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return m3422q(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    @Override // p010b.p016c.p026q.AbstractC0340y1, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int i7 = i3 - i;
        int paddingRight = i7 - getPaddingRight();
        int paddingRight2 = (i7 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i8 = gravity & 112;
        int i9 = gravity & 8388615;
        int paddingTop = i8 != 16 ? i8 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - measuredHeight : (((i4 - i2) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                C0335x1 c0335x1 = (C0335x1) childAt.getLayoutParams();
                int i11 = ((LinearLayout.LayoutParams) c0335x1).gravity;
                if (i11 < 0) {
                    i11 = i9;
                }
                int m3460z = AbstractC0022t.m3460z(i11, AbstractC0605j0.m2241q(this)) & 7;
                if (m3460z == 1) {
                    i5 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c0335x1).leftMargin;
                } else if (m3460z != 5) {
                    i6 = ((LinearLayout.LayoutParams) c0335x1).leftMargin + paddingLeft;
                    if (m2710n(i10)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i12 = paddingTop + ((LinearLayout.LayoutParams) c0335x1).topMargin;
                    childAt.layout(i6, i12, measuredWidth + i6, measuredHeight2 + i12);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c0335x1).bottomMargin + i12;
                } else {
                    i5 = paddingRight - measuredWidth;
                }
                i6 = i5 - ((LinearLayout.LayoutParams) c0335x1).rightMargin;
                if (m2710n(i10)) {
                }
                int i122 = paddingTop + ((LinearLayout.LayoutParams) c0335x1).topMargin;
                childAt.layout(i6, i122, measuredWidth + i6, measuredHeight2 + i122);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c0335x1).bottomMargin + i122;
            }
        }
    }

    @Override // p010b.p016c.p026q.AbstractC0340y1, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int childCount = getChildCount();
        View view = null;
        boolean z = false;
        View view2 = null;
        View view3 = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == AbstractC0080f.topPanel) {
                    view = childAt;
                } else if (id != AbstractC0080f.buttonPanel) {
                    if ((id != AbstractC0080f.contentPanel && id != AbstractC0080f.customPanel) || view3 != null) {
                        break;
                    }
                    view3 = childAt;
                } else {
                    view2 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (view != null) {
            view.measure(i, 0);
            paddingBottom += view.getMeasuredHeight();
            i3 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i3 = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            i4 = m3422q(view2);
            i5 = view2.getMeasuredHeight() - i4;
            paddingBottom += i4;
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            i6 = view3.getMeasuredHeight();
            paddingBottom += i6;
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        } else {
            i6 = 0;
        }
        int i8 = size - paddingBottom;
        if (view2 != null) {
            int i9 = paddingBottom - i4;
            int min = Math.min(i8, i5);
            if (min > 0) {
                i8 -= min;
                i4 += min;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
            paddingBottom = i9 + view2.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        }
        if (view3 != null && i8 > 0) {
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(i6 + i8, mode));
            paddingBottom = (paddingBottom - i6) + view3.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        }
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                i10 = Math.max(i10, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + i10, i, i3), View.resolveSizeAndState(paddingBottom, i2, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt3 = getChildAt(i12);
                if (childAt3.getVisibility() != 8) {
                    C0335x1 c0335x1 = (C0335x1) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c0335x1).width == -1) {
                        int i13 = ((LinearLayout.LayoutParams) c0335x1).height;
                        ((LinearLayout.LayoutParams) c0335x1).height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, makeMeasureSpec, 0, i2, 0);
                        ((LinearLayout.LayoutParams) c0335x1).height = i13;
                    }
                }
            }
        }
        z = true;
        if (z) {
            return;
        }
        super.onMeasure(i, i2);
    }
}