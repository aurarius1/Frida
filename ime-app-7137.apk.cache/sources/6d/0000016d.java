package p010b.p016c.p026q;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import java.lang.reflect.Method;
import p010b.p016c.AbstractC0078d;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.AbstractC0607k0;

/* renamed from: b.c.q.d4 */
/* loaded from: classes.dex */
public class View$OnLongClickListenerC0233d4 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    public static View$OnLongClickListenerC0233d4 f1507b;

    /* renamed from: c */
    public static View$OnLongClickListenerC0233d4 f1508c;

    /* renamed from: d */
    public final View f1509d;

    /* renamed from: e */
    public final CharSequence f1510e;

    /* renamed from: f */
    public final int f1511f;

    /* renamed from: g */
    public final Runnable f1512g = new RunnableC0221b4(this);

    /* renamed from: h */
    public final Runnable f1513h = new RunnableC0227c4(this);

    /* renamed from: i */
    public int f1514i;

    /* renamed from: j */
    public int f1515j;

    /* renamed from: k */
    public C0239e4 f1516k;

    /* renamed from: l */
    public boolean f1517l;

    public View$OnLongClickListenerC0233d4(View view, CharSequence charSequence) {
        this.f1509d = view;
        this.f1510e = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = AbstractC0607k0.f2760a;
        this.f1511f = Build.VERSION.SDK_INT >= 28 ? viewConfiguration.getScaledHoverSlop() : viewConfiguration.getScaledTouchSlop() / 2;
        m2857a();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: c */
    public static void m2855c(View$OnLongClickListenerC0233d4 view$OnLongClickListenerC0233d4) {
        View$OnLongClickListenerC0233d4 view$OnLongClickListenerC0233d42 = f1507b;
        if (view$OnLongClickListenerC0233d42 != null) {
            view$OnLongClickListenerC0233d42.f1509d.removeCallbacks(view$OnLongClickListenerC0233d42.f1512g);
        }
        f1507b = view$OnLongClickListenerC0233d4;
        if (view$OnLongClickListenerC0233d4 != null) {
            view$OnLongClickListenerC0233d4.f1509d.postDelayed(view$OnLongClickListenerC0233d4.f1512g, ViewConfiguration.getLongPressTimeout());
        }
    }

    /* renamed from: a */
    public final void m2857a() {
        this.f1514i = Integer.MAX_VALUE;
        this.f1515j = Integer.MAX_VALUE;
    }

    /* renamed from: b */
    public void m2856b() {
        if (f1508c == this) {
            f1508c = null;
            C0239e4 c0239e4 = this.f1516k;
            if (c0239e4 != null) {
                c0239e4.m2838a();
                this.f1516k = null;
                m2857a();
                this.f1509d.removeOnAttachStateChangeListener(this);
            }
        }
        if (f1507b == this) {
            m2855c(null);
        }
        this.f1509d.removeCallbacks(this.f1513h);
    }

    /* renamed from: d */
    public void m2854d(boolean z) {
        int height;
        int i;
        long longPressTimeout;
        if (AbstractC0605j0.m2233y(this.f1509d)) {
            m2855c(null);
            View$OnLongClickListenerC0233d4 view$OnLongClickListenerC0233d4 = f1508c;
            if (view$OnLongClickListenerC0233d4 != null) {
                view$OnLongClickListenerC0233d4.m2856b();
            }
            f1508c = this;
            this.f1517l = z;
            C0239e4 c0239e4 = new C0239e4(this.f1509d.getContext());
            this.f1516k = c0239e4;
            View view = this.f1509d;
            int i2 = this.f1514i;
            int i3 = this.f1515j;
            boolean z2 = this.f1517l;
            CharSequence charSequence = this.f1510e;
            if (c0239e4.f1538b.getParent() != null) {
                c0239e4.m2838a();
            }
            c0239e4.f1539c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = c0239e4.f1540d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = c0239e4.f1537a.getResources().getDimensionPixelOffset(AbstractC0078d.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i2 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = c0239e4.f1537a.getResources().getDimensionPixelOffset(AbstractC0078d.tooltip_precise_anchor_extra_offset);
                height = i3 + dimensionPixelOffset2;
                i = i3 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = c0239e4.f1537a.getResources().getDimensionPixelOffset(z2 ? AbstractC0078d.tooltip_y_offset_touch : AbstractC0078d.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
            }
            if (rootView != null) {
                rootView.getWindowVisibleDisplayFrame(c0239e4.f1541e);
                Rect rect = c0239e4.f1541e;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = c0239e4.f1537a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    c0239e4.f1541e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(c0239e4.f1543g);
                view.getLocationOnScreen(c0239e4.f1542f);
                int[] iArr = c0239e4.f1542f;
                int i4 = iArr[0];
                int[] iArr2 = c0239e4.f1543g;
                iArr[0] = i4 - iArr2[0];
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (iArr[0] + i2) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                c0239e4.f1538b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = c0239e4.f1538b.getMeasuredHeight();
                int[] iArr3 = c0239e4.f1542f;
                int i5 = ((iArr3[1] + i) - dimensionPixelOffset3) - measuredHeight;
                int i6 = iArr3[1] + height + dimensionPixelOffset3;
                if (!z2 ? measuredHeight + i6 <= c0239e4.f1541e.height() : i5 < 0) {
                    layoutParams.y = i5;
                } else {
                    layoutParams.y = i6;
                }
            }
            ((WindowManager) c0239e4.f1537a.getSystemService("window")).addView(c0239e4.f1538b, c0239e4.f1540d);
            this.f1509d.addOnAttachStateChangeListener(this);
            if (this.f1517l) {
                longPressTimeout = 2500;
            } else {
                longPressTimeout = ((AbstractC0605j0.m2234x(this.f1509d) & 1) == 1 ? 3000L : 15000L) - ViewConfiguration.getLongPressTimeout();
            }
            this.f1509d.removeCallbacks(this.f1513h);
            this.f1509d.postDelayed(this.f1513h, longPressTimeout);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        boolean z;
        if (this.f1516k == null || !this.f1517l) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1509d.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    m2857a();
                    m2856b();
                }
            } else if (this.f1509d.isEnabled() && this.f1516k == null) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (Math.abs(x - this.f1514i) > this.f1511f || Math.abs(y - this.f1515j) > this.f1511f) {
                    this.f1514i = x;
                    this.f1515j = y;
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    m2855c(this);
                }
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1514i = view.getWidth() / 2;
        this.f1515j = view.getHeight() / 2;
        m2854d(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m2856b();
    }
}