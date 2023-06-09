package com.anysoftkeyboard.keyboards.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.widget.PopupWindow;
import com.anysoftkeyboard.keyboards.views.AnyKeyboardView;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p010b.p046j.p047d.AbstractC0472e;
import p093c.p097b.p100c0.EnumC1178v;
import p093c.p097b.p105f0.C1215b;
import p093c.p097b.p107h0.C1237f;
import p093c.p097b.p116p.AbstractC1427e;
import p093c.p097b.p116p.InterfaceC1423a;
import p093c.p097b.p127w.C1545k;
import p093c.p097b.p127w.C1546l;
import p093c.p097b.p128x.InterfaceC1566d3;
import p093c.p097b.p129y.C1656a;
import p093c.p097b.p130z.AbstractC1762t;
import p093c.p097b.p130z.C1667e0;
import p093c.p097b.p130z.C1765w;
import p093c.p097b.p130z.Key;
import p093c.p097b.p130z.p132r0.AbstractC1718e0;
import p093c.p097b.p130z.p132r0.C1755x;
import p093c.p097b.p130z.p132r0.C1758y0;
import p093c.p097b.p130z.p132r0.GestureDetector$OnGestureListenerC1724h0;
import p093c.p097b.p130z.p132r0.InterfaceC1757y;
import p093c.p097b.p130z.p132r0.KeyDetector;
import p093c.p097b.p130z.p132r0.PointerTracker;
import p093c.p137d.p138a.p139a.C1785g;
import p093c.p176h.p177a.p178a.AbstractC2062a0;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.p187m.C2111b;
import p183e.p184a.p189o.InterfaceC2119a;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* loaded from: classes.dex */
public class AnyKeyboardView extends AbstractC1718e0 implements InterfaceC1566d3, InterfaceC1757y {

    /* renamed from: C0 */
    public EnumC1178v f6441C0;

    /* renamed from: D0 */
    public boolean f6442D0;

    /* renamed from: E0 */
    public int f6443E0;

    /* renamed from: F0 */
    public int f6444F0;

    /* renamed from: G0 */
    public Key f6445G0;

    /* renamed from: H0 */
    public Key f6446H0;

    /* renamed from: I0 */
    public Key f6447I0;

    /* renamed from: J0 */
    public final Point f6448J0;

    /* renamed from: K0 */
    public boolean f6449K0;

    /* renamed from: L0 */
    public Animation f6450L0;

    /* renamed from: M0 */
    public C1546l f6451M0;

    /* renamed from: N0 */
    public boolean f6452N0;

    /* renamed from: O0 */
    public final GestureDetector f6453O0;

    /* renamed from: P0 */
    public boolean f6454P0;

    /* renamed from: Q0 */
    public final int f6455Q0;

    /* renamed from: R0 */
    public final int f6456R0;

    /* renamed from: S0 */
    public final int f6457S0;

    /* renamed from: T0 */
    public int f6458T0;

    /* renamed from: U0 */
    public int f6459U0;

    /* renamed from: V0 */
    public final List f6460V0;

    /* renamed from: W0 */
    public long f6461W0;

    public AnyKeyboardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AnyKeyboardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6442D0 = false;
        this.f6447I0 = null;
        this.f6448J0 = new Point(0, 0);
        this.f6449K0 = false;
        this.f6452N0 = false;
        this.f6459U0 = 0;
        this.f6460V0 = new ArrayList();
        this.f6461W0 = -1L;
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.watermark_size);
        this.f6455Q0 = dimensionPixelOffset;
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.watermark_margin);
        this.f6456R0 = dimensionPixelOffset2;
        int i2 = dimensionPixelOffset + dimensionPixelOffset2;
        this.f6457S0 = i2;
        this.f6458T0 = i2;
        GestureDetector mo1027c = AnyApplication.f6979b.mo1027c(getContext(), new GestureDetector$OnGestureListenerC1724h0(this));
        this.f6453O0 = mo1027c;
        mo1027c.setIsLongpressEnabled(false);
        C2111b c2111b = this.f6522t;
        AbstractC2094b abstractC2094b = ((C1785g) AnyApplication.m182t(context).m1172a(R.string.settings_key_extension_keyboard_enabled, R.bool.settings_default_extension_keyboard_enabled)).f5459e;
        InterfaceC2123e interfaceC2123e = new InterfaceC2123e() { // from class: c.b.z.r0.d
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnyKeyboardView anyKeyboardView = AnyKeyboardView.this;
                anyKeyboardView.getClass();
                anyKeyboardView.f6443E0 = ((Boolean) obj).booleanValue() ? anyKeyboardView.getResources().getDimensionPixelOffset(R.dimen.extension_keyboard_reveal_point) : Integer.MIN_VALUE;
            }
        };
        C1215b c1215b = new C1215b("settings_key_extension_keyboard_enabled");
        InterfaceC2119a interfaceC2119a = AbstractC2146l.f7038c;
        InterfaceC2123e interfaceC2123e2 = AbstractC2146l.f7039d;
        c2111b.mo117c(abstractC2094b.m164N(interfaceC2123e, c1215b, interfaceC2119a, interfaceC2123e2));
        this.f6450L0 = null;
        this.f6522t.mo117c(this.f6515p0.m164N(new InterfaceC2123e() { // from class: c.b.z.r0.c
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnyKeyboardView.this.f6441C0 = (EnumC1178v) obj;
            }
        }, new C1215b("mAnimationLevelSubject"), interfaceC2119a, interfaceC2123e2));
        this.f6522t.mo117c(((C1785g) AnyApplication.m182t(context).m1172a(R.string.settings_key_is_sticky_extesion_keyboard, R.bool.settings_default_is_sticky_extesion_keyboard)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.z.r0.b
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnyKeyboardView anyKeyboardView = AnyKeyboardView.this;
                anyKeyboardView.getClass();
                anyKeyboardView.f6454P0 = ((Boolean) obj).booleanValue();
            }
        }, new C1215b("settings_key_is_sticky_extesion_keyboard"), interfaceC2119a, interfaceC2123e2));
    }

    @Override // com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase
    /* renamed from: B */
    public void mo380B(AbstractC1762t abstractC1762t, float f) {
        this.f6445G0 = null;
        this.f6442D0 = false;
        this.f6446H0 = null;
        super.mo380B(abstractC1762t, f);
        setProximityCorrectionEnabled(true);
        this.f6447I0 = null;
        Iterator it = abstractC1762t.f5147q.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Key key = (Key) it.next();
            if (key.getPrimaryCode() == 32) {
                this.f6447I0 = key;
                break;
            }
        }
        List list = abstractC1762t.f5147q;
        Key key2 = (Key) list.get(list.size() - 1);
        this.f6459U0 = key2.x + key2.width;
    }

    @Override // p093c.p097b.p130z.p132r0.AbstractC1722g0
    /* renamed from: G */
    public boolean mo418G() {
        this.f6461W0 = -1L;
        this.f6442D0 = false;
        return super.mo418G();
    }

    @Override // com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase
    /* renamed from: g */
    public KeyDetector mo406g(float f) {
        return new C1758y0();
    }

    @Override // com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase
    /* renamed from: m */
    public int mo400m(C1237f c1237f) {
        return c1237f.f4416m;
    }

    @Override // com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase
    /* renamed from: n */
    public int mo399n(C1237f c1237f) {
        return c1237f.f4414k;
    }

    @Override // p093c.p097b.p130z.p132r0.AbstractC1718e0, p093c.p097b.p130z.p132r0.AbstractC1722g0, com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase, android.view.View
    public void onDraw(Canvas canvas) {
        Animation animation;
        boolean z = this.f6525w;
        super.onDraw(canvas);
        C1545k c1545k = null;
        if (this.f6441C0 != EnumC1178v.None && z && (animation = this.f6450L0) != null) {
            startAnimation(animation);
            this.f6450L0 = null;
        }
        if (this.f6452N0) {
            C1546l c1546l = this.f6451M0;
            int size = c1546l.f4960c.size();
            if (size != 0) {
                if (size > 0) {
                    c1545k = (C1545k) c1546l.f4960c.get(0);
                    c1545k.m944b();
                }
                if (size == 0) {
                    c1546l.f4960c.clear();
                } else {
                    c1545k.f4954g.reset();
                    Path path = c1545k.f4954g;
                    PointF[] pointFArr = c1545k.f4955h;
                    path.moveTo(pointFArr[0].x, pointFArr[0].y);
                    Path path2 = c1545k.f4954g;
                    PointF[] pointFArr2 = c1545k.f4955h;
                    path2.lineTo(pointFArr2[1].x, pointFArr2[1].y);
                    Path path3 = c1545k.f4954g;
                    PointF[] pointFArr3 = c1545k.f4955h;
                    path3.lineTo(pointFArr3[2].x, pointFArr3[2].y);
                    Path path4 = c1545k.f4954g;
                    PointF[] pointFArr4 = c1545k.f4955h;
                    path4.lineTo(pointFArr4[3].x, pointFArr4[3].y);
                    c1545k.f4954g.close();
                    int size2 = c1546l.f4960c.size();
                    for (int i = 1; i < size2; i++) {
                        C1545k c1545k2 = (C1545k) c1546l.f4960c.get(i);
                        c1545k2.m944b();
                        PointF[] pointFArr5 = ((C1545k) c1546l.f4960c.get(i - 1)).f4955h;
                        PointF pointF = pointFArr5[3];
                        PointF pointF2 = pointFArr5[2];
                        c1545k2.f4954g.reset();
                        c1545k2.f4954g.moveTo(pointF.x, pointF.y);
                        c1545k2.f4954g.lineTo(pointF2.x, pointF2.y);
                        Path path5 = c1545k2.f4954g;
                        PointF[] pointFArr6 = c1545k2.f4955h;
                        path5.lineTo(pointFArr6[2].x, pointFArr6[2].y);
                        Path path6 = c1545k2.f4954g;
                        PointF[] pointFArr7 = c1545k2.f4955h;
                        path6.lineTo(pointFArr7[3].x, pointFArr7[3].y);
                        c1545k2.f4954g.close();
                    }
                }
            }
            for (C1545k c1545k3 : c1546l.f4960c) {
                if (c1545k3.f4949b >= 0.0f && c1545k3.f4952e >= 0.0f && !c1545k3.f4954g.isEmpty()) {
                    Paint paint = c1546l.f4962e;
                    if (paint != null) {
                        c1545k3.f4953f.setColor(paint.getColor());
                    }
                    canvas.drawPath(c1545k3.f4954g, c1545k3.f4953f);
                }
            }
            int size3 = c1546l.f4960c.size();
            int i2 = size3 - 1;
            if (size3 != 0) {
                int i3 = 235;
                while (i2 >= 0) {
                    C1545k c1545k4 = (C1545k) c1546l.f4960c.get(i2);
                    int i4 = c1545k4.f4948a;
                    if (i4 != 255) {
                        int i5 = i4 - 20;
                        if (i5 > 0 && c1545k4.f4956i >= 1.0f) {
                            c1545k4.m945a(i5);
                            i2--;
                            i3 -= 20;
                        }
                        i2++;
                        break;
                    }
                    if (i3 > 0 && c1545k4.f4956i >= 1.0f) {
                        c1545k4.m945a(i3);
                        i2--;
                        i3 -= 20;
                    }
                    i2++;
                    break;
                }
                if (i2 >= size3) {
                    c1546l.f4960c.clear();
                } else if (i2 >= 0) {
                    int i6 = size3 - i2;
                    while (c1546l.f4960c.size() > i6) {
                        c1546l.f4960c.remove(0);
                    }
                }
            }
        }
        float f = this.f6459U0;
        float height = (getHeight() - this.f6455Q0) - this.f6456R0;
        for (Drawable drawable : this.f6460V0) {
            f -= this.f6455Q0 + this.f6456R0;
            canvas.translate(f, height);
            drawable.draw(canvas);
            canvas.translate(-f, -height);
        }
    }

    @Override // p093c.p097b.p130z.p132r0.AbstractC1722g0, com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (getKeyboard() == null) {
            return false;
        }
        if (m409d(motionEvent)) {
            this.f6452N0 = false;
            return super.onTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        boolean m853c = m398o(motionEvent.getPointerId(motionEvent.getActionIndex())).m853c();
        this.f6452N0 = m853c;
        if (m853c) {
            C1546l c1546l = this.f6451M0;
            c1546l.getClass();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 1) {
                C1545k c1545k = c1546l.f4959b;
                if (c1546l.m943a(c1545k.f4949b, c1545k.f4950c, x, y)) {
                    C1545k c1545k2 = c1546l.f4959b;
                    c1545k2.f4951d = x;
                    c1545k2.f4952e = y;
                    c1546l.f4960c.add(c1545k2);
                }
                c1546l.f4960c.clear();
                c1546l.f4959b = new C1545k(c1546l.f4961d);
            } else if (action == 2) {
                C1545k c1545k3 = c1546l.f4959b;
                if (c1546l.m943a(c1545k3.f4949b, c1545k3.f4950c, x, y)) {
                    C1545k c1545k4 = c1546l.f4959b;
                    if (c1545k4.f4949b == -1.0f) {
                        c1545k4.f4949b = x;
                        c1545k4.f4950c = y;
                    }
                    c1545k4.f4951d = x;
                    c1545k4.f4952e = y;
                    c1546l.f4960c.add(c1545k4);
                    C1545k c1545k5 = new C1545k(c1546l.f4961d);
                    c1546l.f4959b = c1545k5;
                    c1545k5.f4949b = x;
                    c1545k5.f4950c = y;
                }
            }
            c1546l.f4958a.f5384a.invalidate();
        }
        if (!this.f5312x0.isShowing() && !this.f6452N0 && this.f6453O0.onTouchEvent(motionEvent)) {
            this.f6498h.m890a();
            this.f6493e0.mo878b();
            return true;
        }
        if (actionMasked == 0) {
            this.f6452N0 = false;
            this.f6448J0.x = (int) motionEvent.getX();
            this.f6448J0.y = (int) motionEvent.getY();
            Key key = this.f6447I0;
            if (key != null) {
                Point point = this.f6448J0;
                if (key.m895f(point.x, point.y)) {
                    z = true;
                    this.f6449K0 = z;
                }
            }
            z = false;
            this.f6449K0 = z;
        } else if (actionMasked != 2) {
            this.f6452N0 = false;
        }
        if (this.f6449K0 || motionEvent.getY() >= this.f6443E0 || this.f5312x0.isShowing() || this.f6442D0 || actionMasked != 2) {
            if (!this.f6442D0 || motionEvent.getY() <= this.f6444F0) {
                return super.onTouchEvent(motionEvent);
            }
            mo418G();
            return true;
        }
        if (this.f6461W0 <= 0) {
            this.f6461W0 = SystemClock.uptimeMillis();
        }
        if (SystemClock.uptimeMillis() - this.f6461W0 > 35) {
            C1656a c1656a = ((C1765w) getKeyboard()).f5438R;
            if (c1656a == null || c1656a.f5096k == 0) {
                return super.onTouchEvent(motionEvent);
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 3, motionEvent.getX(), motionEvent.getY(), 0);
            super.onTouchEvent(obtain);
            obtain.recycle();
            this.f6442D0 = true;
            this.f6493e0.mo878b();
            if (this.f6445G0 == null) {
                Key key2 = new Key(new C1667e0(getKeyboard()), getThemedKeyboardDimens());
                this.f6445G0 = key2;
                key2.f5235r = 0;
                key2.height = 1;
                key2.width = 1;
                int i = c1656a.f5096k;
                key2.f5239v = i;
                key2.f5240w = i != 0;
                key2.x = getWidth() / 2;
                this.f6445G0.y = 0;
            }
            this.f6445G0.x = (int) motionEvent.getX();
            mo389x(c1656a, this.f6445G0, this.f6454P0, m398o(motionEvent.getPointerId(motionEvent.getActionIndex())));
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBottomOffset(int i) {
        this.f6458T0 = Math.max(i, this.f6457S0);
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), (int) Math.max(this.f6458T0, getThemedKeyboardDimens().mo863d()));
        requestLayout();
    }

    @Override // p093c.p097b.p130z.p132r0.AbstractC1722g0, com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase, p093c.p097b.p130z.p132r0.InterfaceC1760z0
    public void setKeyboardTheme(C1237f c1237f) {
        super.setKeyboardTheme(c1237f);
        this.f6444F0 = getThemedKeyboardDimens().mo860g();
        InterfaceC1423a interfaceC1423a = c1237f.f4712h;
        int[] mo1065a = interfaceC1423a.mo1065a(AbstractC2062a0.AnyKeyboardViewTheme);
        TypedArray obtainStyledAttributes = c1237f.m1062a().obtainStyledAttributes(c1237f.f4414k, mo1065a);
        Paint paint = new Paint();
        paint.setColor(-16711936);
        paint.setStrokeWidth(getContext().getResources().getDimension(R.dimen.gesture_stroke_width));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.BEVEL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            try {
                int mo1064b = interfaceC1423a.mo1064b(mo1065a[index]);
                if (mo1064b == R.attr.swipeTypingColor) {
                    paint.setColor(obtainStyledAttributes.getColor(index, AbstractC0472e.m2431b(getContext(), R.color.candidate_normal)));
                } else if (mo1064b == R.attr.swipeTypingStrokeWidth) {
                    paint.setStrokeWidth(obtainStyledAttributes.getDimension(index, paint.getStrokeWidth()));
                }
            } catch (Exception unused) {
            }
        }
        obtainStyledAttributes.recycle();
        this.f6451M0 = new C1546l(new C1755x(this), paint);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, Math.max(this.f6458T0, i4));
    }

    @Override // com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase, p093c.p097b.p128x.InterfaceC1566d3
    public void setWatermark(List list) {
        this.f6460V0.clear();
        this.f6460V0.addAll(list);
        for (Drawable drawable : this.f6460V0) {
            int i = this.f6455Q0;
            drawable.setBounds(0, 0, i, i);
        }
        invalidate();
    }

    @Override // com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase
    /* renamed from: u */
    public final boolean mo392u() {
        return this.f6449K0;
    }

    @Override // com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase
    /* renamed from: w */
    public void mo390w(PointerTracker pointerTracker) {
        super.mo390w(pointerTracker);
        this.f6449K0 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        r0 = r2.f5312x0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r0 != com.menny.android.anysoftkeyboard.R.style.MiniKeyboardAnimation) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r0 != com.menny.android.anysoftkeyboard.R.style.ExtensionKeyboardAnimation) goto L12;
     */
    @Override // p093c.p097b.p130z.p132r0.AbstractC1722g0, com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo389x(AbstractC1427e abstractC1427e, Key key, boolean z, PointerTracker pointerTracker) {
        int i;
        PopupWindow popupWindow;
        if (this.f6441C0 != EnumC1178v.None) {
            if (this.f6442D0) {
                int animationStyle = this.f5312x0.getAnimationStyle();
                i = R.style.ExtensionKeyboardAnimation;
            }
            if (!this.f6442D0) {
                int animationStyle2 = this.f5312x0.getAnimationStyle();
                i = R.style.MiniKeyboardAnimation;
            }
            return super.mo389x(abstractC1427e, key, z, pointerTracker);
        }
        popupWindow = this.f5312x0;
        i = 0;
        popupWindow.setAnimationStyle(i);
        return super.mo389x(abstractC1427e, key, z, pointerTracker);
    }

    @Override // com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase
    /* renamed from: y */
    public void mo388y(PointerTracker pointerTracker, int i, int i2, long j) {
        super.mo388y(pointerTracker, i, i2, j);
        this.f6449K0 = false;
    }
}