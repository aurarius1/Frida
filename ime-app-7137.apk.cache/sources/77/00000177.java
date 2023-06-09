package p010b.p016c.p026q;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.AbstractC0084j;
import p010b.p016c.p024p.p025m.InterfaceC0187h0;
import p010b.p046j.p058l.AbstractC0605j0;

/* renamed from: b.c.q.f2 */
/* loaded from: classes.dex */
public class C0243f2 implements InterfaceC0187h0 {

    /* renamed from: b */
    public static Method f1552b;

    /* renamed from: c */
    public static Method f1553c;

    /* renamed from: d */
    public static Method f1554d;

    /* renamed from: B */
    public Rect f1556B;

    /* renamed from: C */
    public boolean f1557C;

    /* renamed from: D */
    public PopupWindow f1558D;

    /* renamed from: e */
    public Context f1559e;

    /* renamed from: f */
    public ListAdapter f1560f;

    /* renamed from: g */
    public C0305r1 f1561g;

    /* renamed from: j */
    public int f1564j;

    /* renamed from: k */
    public int f1565k;

    /* renamed from: m */
    public boolean f1567m;

    /* renamed from: n */
    public boolean f1568n;

    /* renamed from: o */
    public boolean f1569o;

    /* renamed from: s */
    public DataSetObserver f1573s;

    /* renamed from: t */
    public View f1574t;

    /* renamed from: u */
    public AdapterView.OnItemClickListener f1575u;

    /* renamed from: z */
    public final Handler f1580z;

    /* renamed from: h */
    public int f1562h = -2;

    /* renamed from: i */
    public int f1563i = -2;

    /* renamed from: l */
    public int f1566l = 1002;

    /* renamed from: p */
    public int f1570p = 0;

    /* renamed from: q */
    public int f1571q = Integer.MAX_VALUE;

    /* renamed from: r */
    public int f1572r = 0;

    /* renamed from: v */
    public final RunnableC0237e2 f1576v = new RunnableC0237e2(this);

    /* renamed from: w */
    public final View$OnTouchListenerC0231d2 f1577w = new View$OnTouchListenerC0231d2(this);

    /* renamed from: x */
    public final C0225c2 f1578x = new C0225c2(this);

    /* renamed from: y */
    public final RunnableC0213a2 f1579y = new RunnableC0213a2(this);

    /* renamed from: A */
    public final Rect f1555A = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f1552b = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                f1554d = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f1553c = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public C0243f2(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1559e = context;
        this.f1580z = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0084j.ListPopupWindow, i, i2);
        this.f1564j = obtainStyledAttributes.getDimensionPixelOffset(AbstractC0084j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(AbstractC0084j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f1565k = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1567m = true;
        }
        obtainStyledAttributes.recycle();
        C0264j0 c0264j0 = new C0264j0(context, attributeSet, i, i2);
        this.f1558D = c0264j0;
        c0264j0.setInputMethodMode(1);
    }

    /* renamed from: a */
    public void m2836a(int i) {
        this.f1564j = i;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0187h0
    /* renamed from: b */
    public boolean mo2835b() {
        return this.f1558D.isShowing();
    }

    /* renamed from: c */
    public int m2834c() {
        return this.f1564j;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0187h0
    public void dismiss() {
        this.f1558D.dismiss();
        this.f1558D.setContentView(null);
        this.f1561g = null;
        this.f1580z.removeCallbacks(this.f1576v);
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0187h0
    /* renamed from: f */
    public void mo2833f() {
        int i;
        int maxAvailableHeight;
        int i2;
        int paddingBottom;
        C0305r1 c0305r1;
        if (this.f1561g == null) {
            C0305r1 mo2812q = mo2812q(this.f1559e, !this.f1557C);
            this.f1561g = mo2812q;
            mo2812q.setAdapter(this.f1560f);
            this.f1561g.setOnItemClickListener(this.f1575u);
            this.f1561g.setFocusable(true);
            this.f1561g.setFocusableInTouchMode(true);
            this.f1561g.setOnItemSelectedListener(new C0345z1(this));
            this.f1561g.setOnScrollListener(this.f1578x);
            this.f1558D.setContentView(this.f1561g);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f1558D.getContentView();
        }
        Drawable background = this.f1558D.getBackground();
        if (background != null) {
            background.getPadding(this.f1555A);
            Rect rect = this.f1555A;
            int i3 = rect.top;
            i = rect.bottom + i3;
            if (!this.f1567m) {
                this.f1565k = -i3;
            }
        } else {
            this.f1555A.setEmpty();
            i = 0;
        }
        boolean z = this.f1558D.getInputMethodMode() == 2;
        View view = this.f1574t;
        int i4 = this.f1565k;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f1553c;
            if (method != null) {
                try {
                    maxAvailableHeight = ((Integer) method.invoke(this.f1558D, view, Integer.valueOf(i4), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                }
            }
            maxAvailableHeight = this.f1558D.getMaxAvailableHeight(view, i4);
        } else {
            maxAvailableHeight = this.f1558D.getMaxAvailableHeight(view, i4, z);
        }
        if (this.f1562h == -1) {
            paddingBottom = maxAvailableHeight + i;
        } else {
            int i5 = this.f1563i;
            if (i5 != -2) {
                i2 = 1073741824;
                if (i5 == -1) {
                    int i6 = this.f1559e.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.f1555A;
                    i5 = i6 - (rect2.left + rect2.right);
                }
            } else {
                int i7 = this.f1559e.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.f1555A;
                i5 = i7 - (rect3.left + rect3.right);
                i2 = Integer.MIN_VALUE;
            }
            int m2737a = this.f1561g.m2737a(View.MeasureSpec.makeMeasureSpec(i5, i2), maxAvailableHeight - 0, -1);
            paddingBottom = m2737a + (m2737a > 0 ? this.f1561g.getPaddingBottom() + this.f1561g.getPaddingTop() + i + 0 : 0);
        }
        boolean z2 = this.f1558D.getInputMethodMode() == 2;
        AbstractC0022t.m3474q0(this.f1558D, this.f1566l);
        if (this.f1558D.isShowing()) {
            if (AbstractC0605j0.m2233y(this.f1574t)) {
                int i8 = this.f1563i;
                if (i8 == -1) {
                    i8 = -1;
                } else if (i8 == -2) {
                    i8 = this.f1574t.getWidth();
                }
                int i9 = this.f1562h;
                if (i9 == -1) {
                    if (!z2) {
                        paddingBottom = -1;
                    }
                    if (z2) {
                        this.f1558D.setWidth(this.f1563i == -1 ? -1 : 0);
                        this.f1558D.setHeight(0);
                    } else {
                        this.f1558D.setWidth(this.f1563i == -1 ? -1 : 0);
                        this.f1558D.setHeight(-1);
                    }
                } else if (i9 != -2) {
                    paddingBottom = i9;
                }
                this.f1558D.setOutsideTouchable(true);
                this.f1558D.update(this.f1574t, this.f1564j, this.f1565k, i8 < 0 ? -1 : i8, paddingBottom < 0 ? -1 : paddingBottom);
                return;
            }
            return;
        }
        int i10 = this.f1563i;
        if (i10 == -1) {
            i10 = -1;
        } else if (i10 == -2) {
            i10 = this.f1574t.getWidth();
        }
        int i11 = this.f1562h;
        if (i11 == -1) {
            paddingBottom = -1;
        } else if (i11 != -2) {
            paddingBottom = i11;
        }
        this.f1558D.setWidth(i10);
        this.f1558D.setHeight(paddingBottom);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f1552b;
            if (method2 != null) {
                try {
                    method2.invoke(this.f1558D, Boolean.TRUE);
                } catch (Exception unused2) {
                }
            }
        } else {
            this.f1558D.setIsClippedToScreen(true);
        }
        this.f1558D.setOutsideTouchable(true);
        this.f1558D.setTouchInterceptor(this.f1577w);
        if (this.f1569o) {
            AbstractC0022t.m3486k0(this.f1558D, this.f1568n);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f1554d;
            if (method3 != null) {
                try {
                    method3.invoke(this.f1558D, this.f1556B);
                } catch (Exception unused3) {
                }
            }
        } else {
            this.f1558D.setEpicenterBounds(this.f1556B);
        }
        PopupWindow popupWindow = this.f1558D;
        View view2 = this.f1574t;
        int i12 = this.f1564j;
        int i13 = this.f1565k;
        int i14 = this.f1570p;
        if (Build.VERSION.SDK_INT >= 19) {
            popupWindow.showAsDropDown(view2, i12, i13, i14);
        } else {
            if ((AbstractC0022t.m3460z(i14, AbstractC0605j0.m2241q(view2)) & 7) == 5) {
                i12 -= popupWindow.getWidth() - view2.getWidth();
            }
            popupWindow.showAsDropDown(view2, i12, i13);
        }
        this.f1561g.setSelection(-1);
        if ((!this.f1557C || this.f1561g.isInTouchMode()) && (c0305r1 = this.f1561g) != null) {
            c0305r1.setListSelectionHidden(true);
            c0305r1.requestLayout();
        }
        if (this.f1557C) {
            return;
        }
        this.f1580z.post(this.f1579y);
    }

    /* renamed from: g */
    public int m2832g() {
        if (this.f1567m) {
            return this.f1565k;
        }
        return 0;
    }

    /* renamed from: i */
    public Drawable m2831i() {
        return this.f1558D.getBackground();
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0187h0
    /* renamed from: k */
    public ListView mo2830k() {
        return this.f1561g;
    }

    /* renamed from: m */
    public void m2829m(Drawable drawable) {
        this.f1558D.setBackgroundDrawable(drawable);
    }

    /* renamed from: n */
    public void m2828n(int i) {
        this.f1565k = i;
        this.f1567m = true;
    }

    /* renamed from: o */
    public void mo2697o(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1573s;
        if (dataSetObserver == null) {
            this.f1573s = new C0219b2(this);
        } else {
            ListAdapter listAdapter2 = this.f1560f;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1560f = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1573s);
        }
        C0305r1 c0305r1 = this.f1561g;
        if (c0305r1 != null) {
            c0305r1.setAdapter(this.f1560f);
        }
    }

    /* renamed from: q */
    public C0305r1 mo2812q(Context context, boolean z) {
        return new C0305r1(context, z);
    }

    /* renamed from: r */
    public void m2827r(int i) {
        Drawable background = this.f1558D.getBackground();
        if (background == null) {
            this.f1563i = i;
            return;
        }
        background.getPadding(this.f1555A);
        Rect rect = this.f1555A;
        this.f1563i = rect.left + rect.right + i;
    }

    /* renamed from: s */
    public void m2826s(boolean z) {
        this.f1557C = z;
        this.f1558D.setFocusable(z);
    }
}