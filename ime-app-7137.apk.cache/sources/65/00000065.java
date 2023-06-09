package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p044i.AbstractC0448a;
import p010b.p044i.AbstractC0449b;
import p010b.p044i.AbstractC0450c;
import p010b.p044i.p045d.AbstractC0452b;
import p010b.p044i.p045d.AbstractC0460j;
import p010b.p044i.p045d.C0451a;
import p010b.p044i.p045d.C0455e;
import p010b.p044i.p045d.C0457g;
import p010b.p044i.p045d.C0458h;
import p010b.p044i.p045d.C0459i;
import p010b.p044i.p045d.InterfaceC0453c;
import p010b.p044i.p045d.ViewGroup$OnHierarchyChangeListenerC0454d;
import p010b.p044i.p045d.ViewTreeObserver$OnPreDrawListenerC0456f;
import p010b.p046j.p047d.AbstractC0472e;
import p010b.p046j.p057k.C0562c;
import p010b.p046j.p057k.C0563d;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.C0573c1;
import p010b.p046j.p058l.C0620r;
import p010b.p046j.p058l.InterfaceC0614o;
import p010b.p046j.p058l.InterfaceC0616p;
import p010b.p046j.p058l.InterfaceC0622s;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0614o, InterfaceC0616p {

    /* renamed from: b */
    public static final String f428b;

    /* renamed from: c */
    public static final Class[] f429c;

    /* renamed from: d */
    public static final ThreadLocal f430d;

    /* renamed from: e */
    public static final Comparator f431e;

    /* renamed from: f */
    public static final C0562c f432f;

    /* renamed from: g */
    public final List f433g;

    /* renamed from: h */
    public final C0459i f434h;

    /* renamed from: i */
    public final List f435i;

    /* renamed from: j */
    public final List f436j;

    /* renamed from: k */
    public Paint f437k;

    /* renamed from: l */
    public final int[] f438l;

    /* renamed from: m */
    public final int[] f439m;

    /* renamed from: n */
    public boolean f440n;

    /* renamed from: o */
    public boolean f441o;

    /* renamed from: p */
    public int[] f442p;

    /* renamed from: q */
    public View f443q;

    /* renamed from: r */
    public View f444r;

    /* renamed from: s */
    public ViewTreeObserver$OnPreDrawListenerC0456f f445s;

    /* renamed from: t */
    public boolean f446t;

    /* renamed from: u */
    public C0573c1 f447u;

    /* renamed from: v */
    public boolean f448v;

    /* renamed from: w */
    public Drawable f449w;

    /* renamed from: x */
    public ViewGroup.OnHierarchyChangeListener f450x;

    /* renamed from: y */
    public InterfaceC0622s f451y;

    /* renamed from: z */
    public final C0620r f452z;

    /* loaded from: classes.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C0457g();

        /* renamed from: d */
        public SparseArray f453d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f453d = new SparseArray(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f453d.append(iArr[i], readParcelableArray[i]);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f511c, i);
            SparseArray sparseArray = this.f453d;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f453d.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.f453d.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f428b = r0 != null ? r0.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            f431e = new C0458h();
        } else {
            f431e = null;
        }
        f429c = new Class[]{Context.class, AttributeSet.class};
        f430d = new ThreadLocal();
        f432f = new C0563d(12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r5);
        int i = AbstractC0448a.coordinatorLayoutStyle;
        this.f433g = new ArrayList();
        this.f434h = new C0459i();
        this.f435i = new ArrayList();
        this.f436j = new ArrayList();
        this.f438l = new int[2];
        this.f439m = new int[2];
        this.f452z = new C0620r();
        int[] iArr = AbstractC0450c.CoordinatorLayout;
        TypedArray obtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, AbstractC0449b.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, AbstractC0449b.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(AbstractC0450c.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f442p = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f442p.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr2 = this.f442p;
                iArr2[i2] = (int) (iArr2[i2] * f);
            }
        }
        this.f449w = obtainStyledAttributes.getDrawable(AbstractC0450c.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        m3346w();
        super.setOnHierarchyChangeListener(new ViewGroup$OnHierarchyChangeListenerC0454d(this));
        if (AbstractC0605j0.m2242p(this) == 0) {
            AbstractC0605j0.m2263T(this, 1);
        }
    }

    /* renamed from: g */
    public static Rect m3362g() {
        Rect rect = (Rect) f432f.mo2331a();
        return rect == null ? new Rect() : rect;
    }

    @Override // p010b.p046j.p058l.InterfaceC0614o
    /* renamed from: a */
    public void mo2216a(View view, View view2, int i, int i2) {
        AbstractC0452b abstractC0452b;
        C0620r c0620r = this.f452z;
        if (i2 == 1) {
            c0620r.f2779b = i;
        } else {
            c0620r.f2778a = i;
        }
        this.f444r = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            C0455e c0455e = (C0455e) getChildAt(i3).getLayoutParams();
            if (c0455e.m2439a(i2) && (abstractC0452b = c0455e.f2411a) != null && i2 == 0) {
                abstractC0452b.m2442s();
            }
        }
    }

    @Override // p010b.p046j.p058l.InterfaceC0614o
    /* renamed from: b */
    public void mo2215b(View view, int i) {
        C0620r c0620r = this.f452z;
        if (i == 1) {
            c0620r.f2779b = 0;
        } else {
            c0620r.f2778a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0455e c0455e = (C0455e) childAt.getLayoutParams();
            if (c0455e.m2439a(i)) {
                AbstractC0452b abstractC0452b = c0455e.f2411a;
                if (abstractC0452b != null) {
                    abstractC0452b.mo323z(this, childAt, view, i);
                }
                c0455e.m2438b(i, false);
                c0455e.f2426p = false;
            }
        }
        this.f444r = null;
    }

    @Override // p010b.p046j.p058l.InterfaceC0614o
    /* renamed from: c */
    public void mo2214c(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC0452b abstractC0452b;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0455e c0455e = (C0455e) childAt.getLayoutParams();
                if (c0455e.m2439a(i3) && (abstractC0452b = c0455e.f2411a) != null) {
                    int[] iArr2 = this.f438l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0452b.mo328p(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f438l;
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.f438l;
                    i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            m3353p(1);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0455e) && super.checkLayoutParams(layoutParams);
    }

    @Override // p010b.p046j.p058l.InterfaceC0616p
    /* renamed from: d */
    public void mo2204d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC0452b abstractC0452b;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0455e c0455e = (C0455e) childAt.getLayoutParams();
                if (c0455e.m2439a(i5) && (abstractC0452b = c0455e.f2411a) != null) {
                    int[] iArr2 = this.f438l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0452b.mo327r(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f438l;
                    i6 = i3 > 0 ? Math.max(i6, iArr3[0]) : Math.min(i6, iArr3[0]);
                    i7 = i4 > 0 ? Math.max(i7, this.f438l[1]) : Math.min(i7, this.f438l[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            m3353p(1);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        C0455e c0455e = (C0455e) view.getLayoutParams();
        AbstractC0452b abstractC0452b = c0455e.f2411a;
        if (abstractC0452b != null) {
            float m2447c = abstractC0452b.m2447c();
            if (m2447c > 0.0f) {
                if (this.f437k == null) {
                    this.f437k = new Paint();
                }
                this.f437k.setColor(c0455e.f2411a.m2448b());
                Paint paint = this.f437k;
                int round = Math.round(m2447c * 255.0f);
                if (round < 0) {
                    round = 0;
                } else if (round > 255) {
                    round = 255;
                }
                paint.setAlpha(round);
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f437k);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f449w;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // p010b.p046j.p058l.InterfaceC0614o
    /* renamed from: e */
    public void mo2213e(View view, int i, int i2, int i3, int i4, int i5) {
        mo2204d(view, i, i2, i3, i4, 0, this.f439m);
    }

    @Override // p010b.p046j.p058l.InterfaceC0614o
    /* renamed from: f */
    public boolean mo2212f(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0455e c0455e = (C0455e) childAt.getLayoutParams();
                AbstractC0452b abstractC0452b = c0455e.f2411a;
                if (abstractC0452b != null) {
                    boolean mo324x = abstractC0452b.mo324x(this, childAt, view, view2, i, i2);
                    z |= mo324x;
                    c0455e.m2438b(i2, mo324x);
                } else {
                    c0455e.m2438b(i2, false);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0455e(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0455e(getContext(), attributeSet);
    }

    public final List getDependencySortedChildren() {
        m3350s();
        return Collections.unmodifiableList(this.f433g);
    }

    public final C0573c1 getLastWindowInsets() {
        return this.f447u;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f452z.m2200a();
    }

    public Drawable getStatusBarBackground() {
        return this.f449w;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    /* renamed from: h */
    public final void m3361h(C0455e c0455e, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0455e).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c0455e).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0455e).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c0455e).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: i */
    public void m3360i(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m3358k(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: j */
    public List m3359j(View view) {
        C0459i c0459i = this.f434h;
        int i = c0459i.f2430b.f1943h;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) c0459i.f2430b.m2613k(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c0459i.f2430b.m2616h(i2));
            }
        }
        this.f436j.clear();
        if (arrayList != null) {
            this.f436j.addAll(arrayList);
        }
        return this.f436j;
    }

    /* renamed from: k */
    public void m3358k(View view, Rect rect) {
        ThreadLocal threadLocal = AbstractC0460j.f2433a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = AbstractC0460j.f2433a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        AbstractC0460j.m2435a(this, view, matrix);
        ThreadLocal threadLocal3 = AbstractC0460j.f2434b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: l */
    public final void m3357l(int i, Rect rect, Rect rect2, C0455e c0455e, int i2, int i3) {
        int i4 = c0455e.f2413c;
        if (i4 == 0) {
            i4 = 17;
        }
        int m3460z = AbstractC0022t.m3460z(i4, i);
        int i5 = c0455e.f2414d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int m3460z2 = AbstractC0022t.m3460z(i5, i);
        int i6 = m3460z & 7;
        int i7 = m3460z & 112;
        int i8 = m3460z2 & 7;
        int i9 = m3460z2 & 112;
        int width = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            width -= i2 / 2;
        } else if (i6 != 5) {
            width -= i2;
        }
        if (i7 == 16) {
            height -= i3 / 2;
        } else if (i7 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    /* renamed from: m */
    public final int m3356m(int i) {
        StringBuilder sb;
        int[] iArr = this.f442p;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i);
            sb.append(" out of range for ");
            sb.append(this);
        }
        sb.toString();
        return 0;
    }

    /* renamed from: n */
    public C0455e m3355n(View view) {
        C0455e c0455e = (C0455e) view.getLayoutParams();
        if (!c0455e.f2412b) {
            InterfaceC0453c interfaceC0453c = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                interfaceC0453c = (InterfaceC0453c) cls.getAnnotation(InterfaceC0453c.class);
                if (interfaceC0453c != null) {
                    break;
                }
            }
            if (interfaceC0453c != null) {
                try {
                    AbstractC0452b abstractC0452b = (AbstractC0452b) interfaceC0453c.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    AbstractC0452b abstractC0452b2 = c0455e.f2411a;
                    if (abstractC0452b2 != abstractC0452b) {
                        if (abstractC0452b2 != null) {
                            abstractC0452b2.mo330i();
                        }
                        c0455e.f2411a = abstractC0452b;
                        c0455e.f2412b = true;
                        if (abstractC0452b != null) {
                            abstractC0452b.mo209f(c0455e);
                        }
                    }
                } catch (Exception unused) {
                    interfaceC0453c.value().getName();
                }
            }
            c0455e.f2412b = true;
        }
        return c0455e;
    }

    /* renamed from: o */
    public boolean m3354o(View view, int i, int i2) {
        Rect m3362g = m3362g();
        m3358k(view, m3362g);
        try {
            return m3362g.contains(i, i2);
        } finally {
            m3362g.setEmpty();
            f432f.mo2330b(m3362g);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m3349t(false);
        if (this.f446t) {
            if (this.f445s == null) {
                this.f445s = new ViewTreeObserver$OnPreDrawListenerC0456f(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f445s);
        }
        if (this.f447u == null && AbstractC0605j0.m2243o(this)) {
            AbstractC0605j0.m2271L(this);
        }
        this.f441o = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m3349t(false);
        if (this.f446t && this.f445s != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f445s);
        }
        View view = this.f444r;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f441o = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f448v || this.f449w == null) {
            return;
        }
        C0573c1 c0573c1 = this.f447u;
        int m2323d = c0573c1 != null ? c0573c1.m2323d() : 0;
        if (m2323d > 0) {
            this.f449w.setBounds(0, 0, getWidth(), m2323d);
            this.f449w.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m3349t(true);
        }
        boolean m3351r = m3351r(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m3349t(true);
        }
        return m3351r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC0452b abstractC0452b;
        int m2241q = AbstractC0605j0.m2241q(this);
        int size = this.f433g.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f433g.get(i5);
            if (view.getVisibility() != 8 && ((abstractC0452b = ((C0455e) view.getLayoutParams()).f2411a) == null || !abstractC0452b.mo221k(this, view, m2241q))) {
                m3352q(view, m2241q);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x017e, code lost:
        if (r0.mo352l(r30, r20, r8, r21, r23, 0) == false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0181  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        AbstractC0452b abstractC0452b;
        C0455e c0455e;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        m3350s();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            if (i13 >= childCount) {
                z = false;
                break;
            }
            View childAt = getChildAt(i13);
            C0459i c0459i = this.f434h;
            int i14 = c0459i.f2430b.f1943h;
            int i15 = 0;
            while (true) {
                if (i15 < i14) {
                    ArrayList arrayList = (ArrayList) c0459i.f2430b.m2613k(i15);
                    if (arrayList != null && arrayList.contains(childAt)) {
                        z2 = true;
                        break;
                    }
                    i15++;
                } else {
                    z2 = false;
                    break;
                }
            }
            if (z2) {
                z = true;
                break;
            }
            i13++;
        }
        if (z != this.f446t) {
            if (z) {
                if (this.f441o) {
                    if (this.f445s == null) {
                        this.f445s = new ViewTreeObserver$OnPreDrawListenerC0456f(this);
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.f445s);
                }
                this.f446t = true;
            } else {
                if (this.f441o && this.f445s != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.f445s);
                }
                this.f446t = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int m2241q = AbstractC0605j0.m2241q(this);
        boolean z3 = m2241q == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i16 = paddingLeft + paddingRight;
        int i17 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z4 = this.f447u != null && AbstractC0605j0.m2243o(this);
        int size3 = this.f433g.size();
        int i18 = suggestedMinimumWidth;
        int i19 = suggestedMinimumHeight;
        int i20 = 0;
        int i21 = 0;
        while (i21 < size3) {
            View view = (View) this.f433g.get(i21);
            if (view.getVisibility() == 8) {
                i11 = i21;
                i8 = size3;
                i9 = paddingLeft;
            } else {
                C0455e c0455e2 = (C0455e) view.getLayoutParams();
                int i22 = c0455e2.f2415e;
                if (i22 < 0 || mode == 0) {
                    i3 = i20;
                } else {
                    int m3356m = m3356m(i22);
                    int i23 = c0455e2.f2413c;
                    if (i23 == 0) {
                        i23 = 8388661;
                    }
                    int m3460z = AbstractC0022t.m3460z(i23, m2241q) & 7;
                    i3 = i20;
                    if ((m3460z == 3 && !z3) || (m3460z == 5 && z3)) {
                        i4 = Math.max(0, (size - paddingRight) - m3356m);
                    } else if ((m3460z == 5 && !z3) || (m3460z == 3 && z3)) {
                        i4 = Math.max(0, m3356m - paddingLeft);
                    }
                    if (z4 || AbstractC0605j0.m2243o(view)) {
                        i5 = i;
                        i6 = i2;
                    } else {
                        int m2324c = this.f447u.m2324c() + this.f447u.m2325b();
                        int m2326a = this.f447u.m2326a() + this.f447u.m2323d();
                        i5 = View.MeasureSpec.makeMeasureSpec(size - m2324c, mode);
                        i6 = View.MeasureSpec.makeMeasureSpec(size2 - m2326a, mode2);
                    }
                    abstractC0452b = c0455e2.f2411a;
                    if (abstractC0452b == null) {
                        c0455e = c0455e2;
                        i10 = i3;
                        i11 = i21;
                        i7 = i19;
                        i9 = paddingLeft;
                        i12 = i18;
                        i8 = size3;
                    } else {
                        c0455e = c0455e2;
                        i7 = i19;
                        i8 = size3;
                        i9 = paddingLeft;
                        i10 = i3;
                        i11 = i21;
                        i12 = i18;
                    }
                    measureChildWithMargins(view, i5, i4, i6, 0);
                    C0455e c0455e3 = c0455e;
                    int max = Math.max(i12, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) c0455e3).leftMargin + ((ViewGroup.MarginLayoutParams) c0455e3).rightMargin);
                    int max2 = Math.max(i7, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) c0455e3).topMargin + ((ViewGroup.MarginLayoutParams) c0455e3).bottomMargin);
                    i20 = View.combineMeasuredStates(i10, view.getMeasuredState());
                    i18 = max;
                    i19 = max2;
                }
                i4 = 0;
                if (z4) {
                }
                i5 = i;
                i6 = i2;
                abstractC0452b = c0455e2.f2411a;
                if (abstractC0452b == null) {
                }
                measureChildWithMargins(view, i5, i4, i6, 0);
                C0455e c0455e32 = c0455e;
                int max3 = Math.max(i12, view.getMeasuredWidth() + i16 + ((ViewGroup.MarginLayoutParams) c0455e32).leftMargin + ((ViewGroup.MarginLayoutParams) c0455e32).rightMargin);
                int max22 = Math.max(i7, view.getMeasuredHeight() + i17 + ((ViewGroup.MarginLayoutParams) c0455e32).topMargin + ((ViewGroup.MarginLayoutParams) c0455e32).bottomMargin);
                i20 = View.combineMeasuredStates(i10, view.getMeasuredState());
                i18 = max3;
                i19 = max22;
            }
            i21 = i11 + 1;
            paddingLeft = i9;
            size3 = i8;
        }
        int i24 = i20;
        setMeasuredDimension(View.resolveSizeAndState(i18, i, (-16777216) & i24), View.resolveSizeAndState(i19, i2, i24 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p010b.p046j.p058l.InterfaceC0618q
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        AbstractC0452b abstractC0452b;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0455e c0455e = (C0455e) childAt.getLayoutParams();
                if (c0455e.m2439a(0) && (abstractC0452b = c0455e.f2411a) != null) {
                    z2 |= abstractC0452b.m2445m();
                }
            }
        }
        if (z2) {
            m3353p(1);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p010b.p046j.p058l.InterfaceC0618q
    public boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC0452b abstractC0452b;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0455e c0455e = (C0455e) childAt.getLayoutParams();
                if (c0455e.m2439a(0) && (abstractC0452b = c0455e.f2411a) != null) {
                    z |= abstractC0452b.mo329n(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p010b.p046j.p058l.InterfaceC0618q
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo2214c(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p010b.p046j.p058l.InterfaceC0618q
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo2204d(view, i, i2, i3, i4, 0, this.f439m);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p010b.p046j.p058l.InterfaceC0618q
    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo2216a(view, view2, i, 0);
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
        SparseArray sparseArray = savedState.f453d;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0452b abstractC0452b = m3355n(childAt).f2411a;
            if (id != -1 && abstractC0452b != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                abstractC0452b.mo326u(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable mo325v;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0452b abstractC0452b = ((C0455e) childAt.getLayoutParams()).f2411a;
            if (id != -1 && abstractC0452b != null && (mo325v = abstractC0452b.mo325v(this, childAt)) != null) {
                sparseArray.append(id, mo325v);
            }
        }
        savedState.f453d = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p010b.p046j.p058l.InterfaceC0618q
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo2212f(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p010b.p046j.p058l.InterfaceC0618q
    public void onStopNestedScroll(View view) {
        mo2215b(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean mo208A;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f443q == null) {
            z = m3351r(motionEvent, 1);
        } else {
            z = false;
        }
        AbstractC0452b abstractC0452b = ((C0455e) this.f443q.getLayoutParams()).f2411a;
        if (abstractC0452b != null) {
            mo208A = abstractC0452b.mo208A(this, this.f443q, motionEvent);
            motionEvent2 = null;
            if (this.f443q != null) {
                mo208A |= super.onTouchEvent(motionEvent);
            } else if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                m3349t(false);
            }
            return mo208A;
        }
        mo208A = false;
        motionEvent2 = null;
        if (this.f443q != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked != 1) {
        }
        m3349t(false);
        return mo208A;
    }

    /* renamed from: p */
    public final void m3353p(int i) {
        int i2;
        Rect rect;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Rect rect2;
        int i12;
        C0455e c0455e;
        AbstractC0452b abstractC0452b;
        int m2241q = AbstractC0605j0.m2241q(this);
        int size = this.f433g.size();
        Rect m3362g = m3362g();
        Rect m3362g2 = m3362g();
        Rect m3362g3 = m3362g();
        int i13 = 0;
        while (i13 < size) {
            View view = (View) this.f433g.get(i13);
            C0455e c0455e2 = (C0455e) view.getLayoutParams();
            if (i == 0 && view.getVisibility() == 8) {
                i3 = size;
                rect = m3362g3;
                i2 = i13;
            } else {
                int i14 = 0;
                while (i14 < i13) {
                    if (c0455e2.f2422l == ((View) this.f433g.get(i14))) {
                        C0455e c0455e3 = (C0455e) view.getLayoutParams();
                        if (c0455e3.f2421k != null) {
                            Rect m3362g4 = m3362g();
                            Rect m3362g5 = m3362g();
                            Rect m3362g6 = m3362g();
                            m3358k(c0455e3.f2421k, m3362g4);
                            m3360i(view, false, m3362g5);
                            int measuredWidth = view.getMeasuredWidth();
                            i11 = size;
                            int measuredHeight = view.getMeasuredHeight();
                            i12 = i13;
                            i10 = i14;
                            rect2 = m3362g3;
                            c0455e = c0455e2;
                            m3357l(m2241q, m3362g4, m3362g6, c0455e3, measuredWidth, measuredHeight);
                            boolean z4 = (m3362g6.left == m3362g5.left && m3362g6.top == m3362g5.top) ? false : true;
                            m3361h(c0455e3, m3362g6, measuredWidth, measuredHeight);
                            int i15 = m3362g6.left - m3362g5.left;
                            int i16 = m3362g6.top - m3362g5.top;
                            if (i15 != 0) {
                                AbstractC0605j0.m2281B(view, i15);
                            }
                            if (i16 != 0) {
                                AbstractC0605j0.m2280C(view, i16);
                            }
                            if (z4 && (abstractC0452b = c0455e3.f2411a) != null) {
                                abstractC0452b.mo222g(this, view, c0455e3.f2421k);
                            }
                            m3362g4.setEmpty();
                            C0562c c0562c = f432f;
                            c0562c.mo2330b(m3362g4);
                            m3362g5.setEmpty();
                            c0562c.mo2330b(m3362g5);
                            m3362g6.setEmpty();
                            c0562c.mo2330b(m3362g6);
                            i14 = i10 + 1;
                            c0455e2 = c0455e;
                            size = i11;
                            i13 = i12;
                            m3362g3 = rect2;
                        }
                    }
                    i10 = i14;
                    i11 = size;
                    rect2 = m3362g3;
                    i12 = i13;
                    c0455e = c0455e2;
                    i14 = i10 + 1;
                    c0455e2 = c0455e;
                    size = i11;
                    i13 = i12;
                    m3362g3 = rect2;
                }
                int i17 = size;
                Rect rect3 = m3362g3;
                i2 = i13;
                C0455e c0455e4 = c0455e2;
                m3360i(view, true, m3362g2);
                if (c0455e4.f2417g != 0 && !m3362g2.isEmpty()) {
                    int m3460z = AbstractC0022t.m3460z(c0455e4.f2417g, m2241q);
                    int i18 = m3460z & 112;
                    if (i18 == 48) {
                        m3362g.top = Math.max(m3362g.top, m3362g2.bottom);
                    } else if (i18 == 80) {
                        m3362g.bottom = Math.max(m3362g.bottom, getHeight() - m3362g2.top);
                    }
                    int i19 = m3460z & 7;
                    if (i19 == 3) {
                        m3362g.left = Math.max(m3362g.left, m3362g2.right);
                    } else if (i19 == 5) {
                        m3362g.right = Math.max(m3362g.right, getWidth() - m3362g2.left);
                    }
                }
                if (c0455e4.f2418h != 0 && view.getVisibility() == 0 && AbstractC0605j0.m2232z(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                    C0455e c0455e5 = (C0455e) view.getLayoutParams();
                    AbstractC0452b abstractC0452b2 = c0455e5.f2411a;
                    Rect m3362g7 = m3362g();
                    Rect m3362g8 = m3362g();
                    m3362g8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    if (abstractC0452b2 == null || !abstractC0452b2.mo276a(this, view, m3362g7)) {
                        m3362g7.set(m3362g8);
                    } else if (!m3362g8.contains(m3362g7)) {
                        StringBuilder m1187i = AbstractC1124a.m1187i("Rect should be within the child's bounds. Rect:");
                        m1187i.append(m3362g7.toShortString());
                        m1187i.append(" | Bounds:");
                        m1187i.append(m3362g8.toShortString());
                        throw new IllegalArgumentException(m1187i.toString());
                    }
                    m3362g8.setEmpty();
                    C0562c c0562c2 = f432f;
                    c0562c2.mo2330b(m3362g8);
                    if (!m3362g7.isEmpty()) {
                        int m3460z2 = AbstractC0022t.m3460z(c0455e5.f2418h, m2241q);
                        if ((m3460z2 & 48) != 48 || (i8 = (m3362g7.top - ((ViewGroup.MarginLayoutParams) c0455e5).topMargin) - c0455e5.f2420j) >= (i9 = m3362g.top)) {
                            z2 = false;
                        } else {
                            m3347v(view, i9 - i8);
                            z2 = true;
                        }
                        if ((m3460z2 & 80) == 80 && (height = ((getHeight() - m3362g7.bottom) - ((ViewGroup.MarginLayoutParams) c0455e5).bottomMargin) + c0455e5.f2420j) < (i7 = m3362g.bottom)) {
                            m3347v(view, height - i7);
                            z2 = true;
                        }
                        if (!z2) {
                            m3347v(view, 0);
                        }
                        if ((m3460z2 & 3) != 3 || (i5 = (m3362g7.left - ((ViewGroup.MarginLayoutParams) c0455e5).leftMargin) - c0455e5.f2419i) >= (i6 = m3362g.left)) {
                            z3 = false;
                        } else {
                            m3348u(view, i6 - i5);
                            z3 = true;
                        }
                        if ((m3460z2 & 5) == 5 && (width = ((getWidth() - m3362g7.right) - ((ViewGroup.MarginLayoutParams) c0455e5).rightMargin) + c0455e5.f2419i) < (i4 = m3362g.right)) {
                            m3348u(view, width - i4);
                            z3 = true;
                        }
                        if (!z3) {
                            m3348u(view, 0);
                        }
                    }
                    m3362g7.setEmpty();
                    c0562c2.mo2330b(m3362g7);
                }
                if (i != 2) {
                    rect = rect3;
                    rect.set(((C0455e) view.getLayoutParams()).f2427q);
                    if (rect.equals(m3362g2)) {
                        i3 = i17;
                    } else {
                        ((C0455e) view.getLayoutParams()).f2427q.set(m3362g2);
                    }
                } else {
                    rect = rect3;
                }
                i3 = i17;
                for (int i20 = i2 + 1; i20 < i3; i20++) {
                    View view2 = (View) this.f433g.get(i20);
                    C0455e c0455e6 = (C0455e) view2.getLayoutParams();
                    AbstractC0452b abstractC0452b3 = c0455e6.f2411a;
                    if (abstractC0452b3 != null && abstractC0452b3.mo210d(this, view2, view)) {
                        if (i == 0 && c0455e6.f2426p) {
                            c0455e6.f2426p = false;
                        } else {
                            if (i != 2) {
                                z = abstractC0452b3.mo222g(this, view2, view);
                            } else {
                                abstractC0452b3.mo353h(this, view2, view);
                                z = true;
                            }
                            if (i == 1) {
                                c0455e6.f2426p = z;
                            }
                        }
                    }
                }
            }
            i13 = i2 + 1;
            size = i3;
            m3362g3 = rect;
        }
        Rect rect4 = m3362g3;
        m3362g.setEmpty();
        C0562c c0562c3 = f432f;
        c0562c3.mo2330b(m3362g);
        m3362g2.setEmpty();
        c0562c3.mo2330b(m3362g2);
        rect4.setEmpty();
        c0562c3.mo2330b(rect4);
    }

    /* renamed from: q */
    public void m3352q(View view, int i) {
        Rect m3362g;
        Rect m3362g2;
        C0562c c0562c;
        C0455e c0455e = (C0455e) view.getLayoutParams();
        View view2 = c0455e.f2421k;
        int i2 = 0;
        if (view2 == null && c0455e.f2416f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            m3362g = m3362g();
            m3362g2 = m3362g();
            try {
                m3358k(view2, m3362g);
                C0455e c0455e2 = (C0455e) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                m3357l(i, m3362g, m3362g2, c0455e2, measuredWidth, measuredHeight);
                m3361h(c0455e2, m3362g2, measuredWidth, measuredHeight);
                view.layout(m3362g2.left, m3362g2.top, m3362g2.right, m3362g2.bottom);
                return;
            } finally {
                m3362g.setEmpty();
                c0562c = f432f;
                c0562c.mo2330b(m3362g);
                m3362g2.setEmpty();
                c0562c.mo2330b(m3362g2);
            }
        }
        int i3 = c0455e.f2415e;
        if (i3 >= 0) {
            C0455e c0455e3 = (C0455e) view.getLayoutParams();
            int i4 = c0455e3.f2413c;
            if (i4 == 0) {
                i4 = 8388661;
            }
            int m3460z = AbstractC0022t.m3460z(i4, i);
            int i5 = m3460z & 7;
            int i6 = m3460z & 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            if (i == 1) {
                i3 = width - i3;
            }
            int m3356m = m3356m(i3) - measuredWidth2;
            if (i5 == 1) {
                m3356m += measuredWidth2 / 2;
            } else if (i5 == 5) {
                m3356m += measuredWidth2;
            }
            if (i6 == 16) {
                i2 = 0 + (measuredHeight2 / 2);
            } else if (i6 == 80) {
                i2 = measuredHeight2 + 0;
            }
            int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0455e3).leftMargin, Math.min(m3356m, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c0455e3).rightMargin));
            int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0455e3).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c0455e3).bottomMargin));
            view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
            return;
        }
        C0455e c0455e4 = (C0455e) view.getLayoutParams();
        m3362g = m3362g();
        m3362g.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0455e4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0455e4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0455e4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0455e4).bottomMargin);
        if (this.f447u != null && AbstractC0605j0.m2243o(this) && !AbstractC0605j0.m2243o(view)) {
            m3362g.left = this.f447u.m2325b() + m3362g.left;
            m3362g.top = this.f447u.m2323d() + m3362g.top;
            m3362g.right -= this.f447u.m2324c();
            m3362g.bottom -= this.f447u.m2326a();
        }
        m3362g2 = m3362g();
        int i7 = c0455e4.f2413c;
        if ((i7 & 7) == 0) {
            i7 |= 8388611;
        }
        if ((i7 & 112) == 0) {
            i7 |= 48;
        }
        int i8 = i7;
        int measuredWidth3 = view.getMeasuredWidth();
        int measuredHeight3 = view.getMeasuredHeight();
        if (Build.VERSION.SDK_INT >= 17) {
            Gravity.apply(i8, measuredWidth3, measuredHeight3, m3362g, m3362g2, i);
        } else {
            Gravity.apply(i8, measuredWidth3, measuredHeight3, m3362g, m3362g2);
        }
        view.layout(m3362g2.left, m3362g2.top, m3362g2.right, m3362g2.bottom);
    }

    /* renamed from: r */
    public final boolean m3351r(MotionEvent motionEvent, int i) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f435i;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator comparator = f431e;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) list.get(i3);
            C0455e c0455e = (C0455e) view.getLayoutParams();
            AbstractC0452b abstractC0452b = c0455e.f2411a;
            boolean z4 = true;
            if (!(z2 || z3) || actionMasked == 0) {
                if (!z2 && abstractC0452b != null) {
                    if (i == 0) {
                        z2 = abstractC0452b.mo272j(this, view, motionEvent);
                    } else if (i == 1) {
                        z2 = abstractC0452b.mo208A(this, view, motionEvent);
                    }
                    if (z2) {
                        this.f443q = view;
                    }
                }
                AbstractC0452b abstractC0452b2 = c0455e.f2411a;
                if (abstractC0452b2 == null) {
                    c0455e.f2423m = false;
                }
                boolean z5 = c0455e.f2423m;
                if (z5) {
                    z = true;
                } else {
                    z = (abstractC0452b2 != null && abstractC0452b2.m2447c() > 0.0f) | z5;
                    c0455e.f2423m = z;
                }
                z4 = (!z || z5) ? false : false;
                if (z && !z4) {
                    break;
                }
                z3 = z4;
            } else if (abstractC0452b != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    abstractC0452b.mo272j(this, view, motionEvent2);
                } else if (i == 1) {
                    abstractC0452b.mo208A(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC0452b abstractC0452b = ((C0455e) view.getLayoutParams()).f2411a;
        if (abstractC0452b == null || !abstractC0452b.mo351t(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f440n) {
            return;
        }
        m3349t(false);
        this.f440n = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (r5 != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0106  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3350s() {
        boolean z;
        boolean z2;
        AbstractC0452b abstractC0452b;
        this.f433g.clear();
        C0459i c0459i = this.f434h;
        int i = c0459i.f2430b.f1943h;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList = (ArrayList) c0459i.f2430b.m2613k(i2);
            if (arrayList != null) {
                arrayList.clear();
                c0459i.f2429a.mo2330b(arrayList);
            }
        }
        c0459i.f2430b.clear();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0455e m3355n = m3355n(childAt);
            if (m3355n.f2416f == -1) {
                m3355n.f2422l = null;
                m3355n.f2421k = null;
            } else {
                View view = m3355n.f2421k;
                if (view != null) {
                    if (view.getId() == m3355n.f2416f) {
                        View view2 = m3355n.f2421k;
                        for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                            if (parent == null || parent == childAt) {
                                m3355n.f2422l = null;
                                m3355n.f2421k = null;
                            } else {
                                if (parent instanceof View) {
                                    view2 = (View) parent;
                                }
                            }
                        }
                        m3355n.f2422l = view2;
                        z = true;
                    }
                    z = false;
                    break;
                }
                View findViewById = findViewById(m3355n.f2416f);
                m3355n.f2421k = findViewById;
                if (findViewById != null) {
                    if (findViewById != this) {
                        for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                            if (parent2 != childAt) {
                                if (parent2 instanceof View) {
                                    findViewById = (View) parent2;
                                }
                            } else if (!isInEditMode()) {
                                throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                            }
                        }
                        m3355n.f2422l = findViewById;
                    } else if (!isInEditMode()) {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                } else if (!isInEditMode()) {
                    StringBuilder m1187i = AbstractC1124a.m1187i("Could not find CoordinatorLayout descendant view with id ");
                    m1187i.append(getResources().getResourceName(m3355n.f2416f));
                    m1187i.append(" to anchor view ");
                    m1187i.append(childAt);
                    throw new IllegalStateException(m1187i.toString());
                }
                m3355n.f2422l = null;
                m3355n.f2421k = null;
            }
            this.f434h.m2437a(childAt);
            for (int i4 = 0; i4 < childCount; i4++) {
                if (i4 != i3) {
                    View childAt2 = getChildAt(i4);
                    if (childAt2 != m3355n.f2422l) {
                        int m2241q = AbstractC0605j0.m2241q(this);
                        int m3460z = AbstractC0022t.m3460z(((C0455e) childAt2.getLayoutParams()).f2417g, m2241q);
                        if (!(m3460z != 0 && (AbstractC0022t.m3460z(m3355n.f2418h, m2241q) & m3460z) == m3460z) && ((abstractC0452b = m3355n.f2411a) == null || !abstractC0452b.mo210d(this, childAt, childAt2))) {
                            z2 = false;
                            if (z2) {
                                if (!(this.f434h.f2430b.m2619e(childAt2) >= 0)) {
                                    this.f434h.m2437a(childAt2);
                                }
                                C0459i c0459i2 = this.f434h;
                                if (c0459i2.f2430b.m2619e(childAt2) >= 0) {
                                    if (c0459i2.f2430b.m2619e(childAt) >= 0) {
                                        ArrayList arrayList2 = (ArrayList) c0459i2.f2430b.getOrDefault(childAt2, null);
                                        if (arrayList2 == null) {
                                            arrayList2 = (ArrayList) c0459i2.f2429a.mo2331a();
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                            }
                                            c0459i2.f2430b.put(childAt2, arrayList2);
                                        }
                                        arrayList2.add(childAt);
                                    }
                                }
                                throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                            }
                            continue;
                        }
                    }
                    z2 = true;
                    if (z2) {
                    }
                }
            }
        }
        List list = this.f433g;
        C0459i c0459i3 = this.f434h;
        c0459i3.f2431c.clear();
        c0459i3.f2432d.clear();
        int i5 = c0459i3.f2430b.f1943h;
        for (int i6 = 0; i6 < i5; i6++) {
            c0459i3.m2436b(c0459i3.f2430b.m2616h(i6), c0459i3.f2431c, c0459i3.f2432d);
        }
        list.addAll(c0459i3.f2431c);
        Collections.reverse(this.f433g);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m3346w();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f450x = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f449w;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f449w = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f449w.setState(getDrawableState());
                }
                AbstractC0022t.m3494g0(this.f449w, AbstractC0605j0.m2241q(this));
                this.f449w.setVisible(getVisibility() == 0, false);
                this.f449w.setCallback(this);
            }
            AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
            if (Build.VERSION.SDK_INT >= 16) {
                postInvalidateOnAnimation();
            } else {
                postInvalidate();
            }
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? AbstractC0472e.m2430c(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f449w;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f449w.setVisible(z, false);
    }

    /* renamed from: t */
    public final void m3349t(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC0452b abstractC0452b = ((C0455e) childAt.getLayoutParams()).f2411a;
            if (abstractC0452b != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    abstractC0452b.mo272j(this, childAt, obtain);
                } else {
                    abstractC0452b.mo208A(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0455e) getChildAt(i2).getLayoutParams()).f2423m = false;
        }
        this.f443q = null;
        this.f440n = false;
    }

    /* renamed from: u */
    public final void m3348u(View view, int i) {
        C0455e c0455e = (C0455e) view.getLayoutParams();
        int i2 = c0455e.f2419i;
        if (i2 != i) {
            AbstractC0605j0.m2281B(view, i - i2);
            c0455e.f2419i = i;
        }
    }

    /* renamed from: v */
    public final void m3347v(View view, int i) {
        C0455e c0455e = (C0455e) view.getLayoutParams();
        int i2 = c0455e.f2420j;
        if (i2 != i) {
            AbstractC0605j0.m2280C(view, i - i2);
            c0455e.f2420j = i;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f449w;
    }

    /* renamed from: w */
    public final void m3346w() {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (!AbstractC0605j0.m2243o(this)) {
            AbstractC0605j0.m2262U(this, null);
            return;
        }
        if (this.f451y == null) {
            this.f451y = new C0451a(this);
        }
        AbstractC0605j0.m2262U(this, this.f451y);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0455e ? new C0455e((C0455e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0455e((ViewGroup.MarginLayoutParams) layoutParams) : new C0455e(layoutParams);
    }
}