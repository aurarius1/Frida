package p010b.p016c.p026q;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.AbstractC0075a;
import p010b.p046j.p061m.View$OnTouchListenerC0641d;

/* renamed from: b.c.q.r1 */
/* loaded from: classes.dex */
public class C0305r1 extends ListView {

    /* renamed from: b */
    public final Rect f1743b;

    /* renamed from: c */
    public int f1744c;

    /* renamed from: d */
    public int f1745d;

    /* renamed from: e */
    public int f1746e;

    /* renamed from: f */
    public int f1747f;

    /* renamed from: g */
    public int f1748g;

    /* renamed from: h */
    public Field f1749h;

    /* renamed from: i */
    public C0295p1 f1750i;

    /* renamed from: j */
    public boolean f1751j;

    /* renamed from: k */
    public boolean f1752k;

    /* renamed from: l */
    public boolean f1753l;

    /* renamed from: m */
    public View$OnTouchListenerC0641d f1754m;

    /* renamed from: n */
    public RunnableC0300q1 f1755n;

    public C0305r1(Context context, boolean z) {
        super(context, null, AbstractC0075a.dropDownListViewStyle);
        this.f1743b = new Rect();
        this.f1744c = 0;
        this.f1745d = 0;
        this.f1746e = 0;
        this.f1747f = 0;
        this.f1752k = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1749h = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public int m2737a(int i, int i2, int i3) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i4 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i4;
        }
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        View view = null;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < count) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i8 = layoutParams.height;
            view.measure(i, i8 > 0 ? View.MeasureSpec.makeMeasureSpec(i8, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i5 > 0) {
                i4 += dividerHeight;
            }
            i4 += view.getMeasuredHeight();
            if (i4 >= i2) {
                return (i3 < 0 || i5 <= i3 || i7 <= 0 || i4 == i2) ? i2 : i7;
            }
            if (i3 >= 0 && i5 >= i3) {
                i7 = i4;
            }
            i5++;
        }
        return i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r3 != 3) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0162  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m2736b(MotionEvent motionEvent, int i) {
        boolean z;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = true;
        if (actionMasked == 1) {
            z = false;
        } else if (actionMasked == 2) {
            z = true;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex >= 0) {
            int x = (int) motionEvent.getX(findPointerIndex);
            int y = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x, y);
            if (pointToPosition != -1) {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.f1753l = true;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 21) {
                    drawableHotspotChanged(f, f2);
                }
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i3 = this.f1748g;
                if (i3 != -1 && (childAt = getChildAt(i3 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f1748g = pointToPosition;
                float left = f - childAt3.getLeft();
                float top = f2 - childAt3.getTop();
                if (i2 >= 21) {
                    childAt3.drawableHotspotChanged(left, top);
                }
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z3 = (selector == null || pointToPosition == -1) ? false : true;
                if (z3) {
                    selector.setVisible(false, false);
                }
                Rect rect = this.f1743b;
                rect.set(childAt3.getLeft(), childAt3.getTop(), childAt3.getRight(), childAt3.getBottom());
                rect.left -= this.f1744c;
                rect.top -= this.f1745d;
                rect.right += this.f1746e;
                rect.bottom += this.f1747f;
                try {
                    boolean z4 = this.f1749h.getBoolean(this);
                    if (childAt3.isEnabled() != z4) {
                        this.f1749h.set(this, Boolean.valueOf(!z4));
                        if (pointToPosition != -1) {
                            refreshDrawableState();
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                if (z3) {
                    Rect rect2 = this.f1743b;
                    float exactCenterX = rect2.exactCenterX();
                    float exactCenterY = rect2.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    AbstractC0022t.m3500d0(selector, exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    AbstractC0022t.m3500d0(selector2, f, f2);
                }
                C0295p1 c0295p1 = this.f1750i;
                if (c0295p1 != null) {
                    c0295p1.f1689c = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z = true;
                z2 = false;
            }
            if (z || z2) {
                this.f1753l = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f1748g - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            if (z) {
                View$OnTouchListenerC0641d view$OnTouchListenerC0641d = this.f1754m;
                if (view$OnTouchListenerC0641d != null) {
                    if (view$OnTouchListenerC0641d.f2837r) {
                        view$OnTouchListenerC0641d.m2166e();
                    }
                    view$OnTouchListenerC0641d.f2837r = false;
                }
            } else {
                if (this.f1754m == null) {
                    this.f1754m = new View$OnTouchListenerC0641d(this);
                }
                View$OnTouchListenerC0641d view$OnTouchListenerC0641d2 = this.f1754m;
                boolean z5 = view$OnTouchListenerC0641d2.f2837r;
                view$OnTouchListenerC0641d2.f2837r = true;
                view$OnTouchListenerC0641d2.onTouch(this, motionEvent);
            }
            return z;
        }
        z = false;
        z2 = false;
        if (z) {
        }
        this.f1753l = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.f1748g - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        if (z) {
        }
        return z;
    }

    /* renamed from: c */
    public final void m2735c() {
        Drawable selector = getSelector();
        if (selector != null && this.f1753l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f1743b.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1743b);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f1755n != null) {
            return;
        }
        super.drawableStateChanged();
        C0295p1 c0295p1 = this.f1750i;
        if (c0295p1 != null) {
            c0295p1.f1689c = true;
        }
        m2735c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1752k || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1752k || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1752k || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1752k && this.f1751j) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f1755n = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1755n == null) {
            RunnableC0300q1 runnableC0300q1 = new RunnableC0300q1(this);
            this.f1755n = runnableC0300q1;
            post(runnableC0300q1);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                m2735c();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1748g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0300q1 runnableC0300q1 = this.f1755n;
        if (runnableC0300q1 != null) {
            C0305r1 c0305r1 = runnableC0300q1.f1730b;
            c0305r1.f1755n = null;
            c0305r1.removeCallbacks(runnableC0300q1);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f1751j = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C0295p1 c0295p1 = drawable != null ? new C0295p1(drawable) : null;
        this.f1750i = c0295p1;
        super.setSelector(c0295p1);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1744c = rect.left;
        this.f1745d = rect.top;
        this.f1746e = rect.right;
        this.f1747f = rect.bottom;
    }
}