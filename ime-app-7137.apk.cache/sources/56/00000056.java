package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import p010b.p016c.p017k.C0086a0;
import p010b.p016c.p017k.LayoutInflater$Factory2C0120p0;
import p010b.p016c.p024p.p025m.C0199p;
import p010b.p016c.p026q.C0215a4;
import p010b.p016c.p026q.C0298q;
import p010b.p016c.p026q.InterfaceC0275l1;
import p010b.p016c.p026q.InterfaceC0280m1;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: b */
    public TypedValue f246b;

    /* renamed from: c */
    public TypedValue f247c;

    /* renamed from: d */
    public TypedValue f248d;

    /* renamed from: e */
    public TypedValue f249e;

    /* renamed from: f */
    public TypedValue f250f;

    /* renamed from: g */
    public TypedValue f251g;

    /* renamed from: h */
    public final Rect f252h;

    /* renamed from: i */
    public InterfaceC0275l1 f253i;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f252h = new Rect();
    }

    /* renamed from: a */
    public void m3419a(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f250f == null) {
            this.f250f = new TypedValue();
        }
        return this.f250f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f251g == null) {
            this.f251g = new TypedValue();
        }
        return this.f251g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f248d == null) {
            this.f248d = new TypedValue();
        }
        return this.f248d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f249e == null) {
            this.f249e = new TypedValue();
        }
        return this.f249e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f246b == null) {
            this.f246b = new TypedValue();
        }
        return this.f246b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f247c == null) {
            this.f247c = new TypedValue();
        }
        return this.f247c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0275l1 interfaceC0275l1 = this.f253i;
        if (interfaceC0275l1 != null) {
            ((C0086a0) interfaceC0275l1).getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        C0298q c0298q;
        super.onDetachedFromWindow();
        InterfaceC0275l1 interfaceC0275l1 = this.f253i;
        if (interfaceC0275l1 != null) {
            LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0 = ((C0086a0) interfaceC0275l1).f869a;
            InterfaceC0280m1 interfaceC0280m1 = layoutInflater$Factory2C0120p0.f1076s;
            if (interfaceC0280m1 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0280m1;
                actionBarOverlayLayout.m3428n();
                ActionMenuView actionMenuView = ((C0215a4) actionBarOverlayLayout.f209g).f1458a.f367b;
                if (actionMenuView != null && (c0298q = actionMenuView.f236u) != null) {
                    c0298q.m2765b();
                }
            }
            if (layoutInflater$Factory2C0120p0.f1081x != null) {
                layoutInflater$Factory2C0120p0.f1070m.getDecorView().removeCallbacks(layoutInflater$Factory2C0120p0.f1082y);
                if (layoutInflater$Factory2C0120p0.f1081x.isShowing()) {
                    try {
                        layoutInflater$Factory2C0120p0.f1081x.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflater$Factory2C0120p0.f1081x = null;
            }
            layoutInflater$Factory2C0120p0.m3032y();
            C0199p c0199p = layoutInflater$Factory2C0120p0.m3051D(0).f971h;
            if (c0199p != null) {
                c0199p.m2936c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        boolean z;
        int measuredWidth;
        TypedValue typedValue;
        int i3;
        int i4;
        float fraction;
        int i5;
        int i6;
        float fraction2;
        int i7;
        int i8;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z2 = true;
        boolean z3 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z3 ? this.f249e : this.f248d;
            if (typedValue2 != null && (i7 = typedValue2.type) != 0) {
                if (i7 == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (i7 == 6) {
                    int i9 = displayMetrics.widthPixels;
                    fraction3 = typedValue2.getFraction(i9, i9);
                } else {
                    i8 = 0;
                    if (i8 > 0) {
                        Rect rect = this.f252h;
                        i = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z3 ? this.f250f : this.f251g;
                            if (typedValue3 != null && (i5 = typedValue3.type) != 0) {
                                if (i5 == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (i5 == 6) {
                                    int i10 = displayMetrics.heightPixels;
                                    fraction2 = typedValue3.getFraction(i10, i10);
                                } else {
                                    i6 = 0;
                                    if (i6 > 0) {
                                        Rect rect2 = this.f252h;
                                        i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect2.top + rect2.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                                    }
                                }
                                i6 = (int) fraction2;
                                if (i6 > 0) {
                                }
                            }
                        }
                        super.onMeasure(i, i2);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z && mode == Integer.MIN_VALUE) {
                            typedValue = !z3 ? this.f247c : this.f246b;
                            if (typedValue != null && (i3 = typedValue.type) != 0) {
                                if (i3 != 5) {
                                    fraction = typedValue.getDimension(displayMetrics);
                                } else if (i3 == 6) {
                                    int i11 = displayMetrics.widthPixels;
                                    fraction = typedValue.getFraction(i11, i11);
                                } else {
                                    i4 = 0;
                                    if (i4 > 0) {
                                        Rect rect3 = this.f252h;
                                        i4 -= rect3.left + rect3.right;
                                    }
                                    if (measuredWidth < i4) {
                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                                        if (z2) {
                                            super.onMeasure(makeMeasureSpec, i2);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                i4 = (int) fraction;
                                if (i4 > 0) {
                                }
                                if (measuredWidth < i4) {
                                }
                            }
                        }
                        z2 = false;
                        if (z2) {
                        }
                    }
                }
                i8 = (int) fraction3;
                if (i8 > 0) {
                }
            }
        }
        z = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        super.onMeasure(i, i2);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z) {
            if (!z3) {
            }
            if (typedValue != null) {
                if (i3 != 5) {
                }
                i4 = (int) fraction;
                if (i4 > 0) {
                }
                if (measuredWidth < i4) {
                }
            }
        }
        z2 = false;
        if (z2) {
        }
    }

    public void setAttachListener(InterfaceC0275l1 interfaceC0275l1) {
        this.f253i = interfaceC0275l1;
    }
}