package p093c.p097b.p130z.p132r0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase;
import com.menny.android.anysoftkeyboard.R;
import p093c.p097b.p099b0.C1138a;
import p093c.p097b.p100c0.EnumC1178v;
import p093c.p097b.p102d0.p103k.C1199f;
import p093c.p097b.p107h0.C1237f;
import p093c.p097b.p116p.AbstractC1427e;
import p093c.p097b.p119s.p120b.AbstractC1441a;
import p093c.p097b.p121t.C1457n;
import p093c.p097b.p130z.AbstractC1762t;
import p093c.p097b.p130z.C1763u;
import p093c.p097b.p130z.Key;
import p093c.p097b.p130z.p132r0.p134b1.C1712k;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* renamed from: c.b.z.r0.g0 */
/* loaded from: classes.dex */
public abstract class AbstractC1722g0 extends AnyKeyboardViewBase {

    /* renamed from: t0 */
    public AnyKeyboardViewBase f5308t0;

    /* renamed from: u0 */
    public int f5309u0;

    /* renamed from: v0 */
    public int f5310v0;

    /* renamed from: w0 */
    public long f5311w0;

    /* renamed from: x0 */
    public final PopupWindow f5312x0;

    /* renamed from: y0 */
    public final C1744r0 f5313y0;

    /* renamed from: z0 */
    public InterfaceC1720f0 f5314z0;

    public AbstractC1722g0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5308t0 = null;
        this.f5313y0 = new C1744r0(new C1747t(this), new Runnable() { // from class: c.b.z.r0.a
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1722g0.this.mo418G();
            }
        });
        PopupWindow popupWindow = new PopupWindow(context.getApplicationContext());
        this.f5312x0 = popupWindow;
        AbstractC1441a.m1036b(popupWindow);
        popupWindow.setBackgroundDrawable(null);
        this.f6522t.mo117c(this.f6515p0.m164N(new InterfaceC2123e() { // from class: c.b.z.r0.s
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AbstractC1722g0.this.f5312x0.setAnimationStyle(((EnumC1178v) obj) == EnumC1178v.None ? 0 : R.style.MiniKeyboardAnimation);
            }
        }, AbstractC2146l.f7040e, AbstractC2146l.f7038c, AbstractC2146l.f7039d));
    }

    /* renamed from: G */
    public boolean mo418G() {
        boolean z = false;
        if (this.f5312x0.isShowing()) {
            AnyKeyboardViewBase anyKeyboardViewBase = this.f5308t0;
            if (anyKeyboardViewBase != null) {
                anyKeyboardViewBase.mo410c();
            }
            this.f5312x0.dismiss();
            this.f5309u0 = 0;
            this.f5310v0 = 0;
            this.f6500i.m886a();
            m395r();
            InterfaceC1720f0 interfaceC1720f0 = this.f5314z0;
            z = true;
            if (interfaceC1720f0 != null) {
                C1199f c1199f = (C1199f) interfaceC1720f0;
                c1199f.f4347a.setEnabled(true);
                c1199f.f4348b.setEnabled(true);
            }
        }
        return z;
    }

    /* renamed from: H */
    public final MotionEvent m872H(int i, int i2, int i3, long j) {
        return MotionEvent.obtain(this.f5311w0, j, i, i2 - this.f5309u0, i3 - this.f5310v0, 0);
    }

    /* renamed from: I */
    public void m871I(AbstractC1427e abstractC1427e, Key key, boolean z) {
        C1763u c1763u;
        boolean z2;
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        if (this.f5308t0 == null) {
            AnyKeyboardViewBase anyKeyboardViewBase = (AnyKeyboardViewBase) ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.popup_keyboard_layout, (ViewGroup) null);
            this.f5308t0 = anyKeyboardViewBase;
            anyKeyboardViewBase.setKeyboardTheme(getLastSetKeyboardTheme());
            this.f5308t0.setOnKeyboardActionListener(this.f5313y0);
            this.f5308t0.setThemeOverlay(this.f6519r0);
        }
        if (key.f5234q != null) {
            c1763u = new C1763u(this.f6490d, getContext().getApplicationContext(), key.f5234q, this.f5308t0.getThemedKeyboardDimens(), "");
        } else {
            abstractC1427e.m1062a().getPackageName();
            getContext().getApplicationContext().getPackageName();
            if (!key.f5240w) {
                abstractC1427e = this.f6490d;
            }
            c1763u = new C1763u(abstractC1427e, getContext().getApplicationContext(), key.f5239v, this.f5308t0.getThemedKeyboardDimens(), "", null, null);
        }
        AnyKeyboardViewBase anyKeyboardViewBase2 = this.f5308t0;
        if (z) {
            anyKeyboardViewBase2.mo380B(c1763u, this.f6527y);
        } else {
            anyKeyboardViewBase2.m416C(c1763u, this.f6528z, this.f6464A);
        }
        this.f5308t0.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
        AnyKeyboardViewBase anyKeyboardViewBase3 = this.f5308t0;
        C1712k c1712k = this.f6496g;
        Point point = new Point(key.x + iArr[0], key.y + iArr[1]);
        point.offset(0, c1712k.f5295f);
        point.offset(-anyKeyboardViewBase3.getPaddingLeft(), 0);
        point.offset(0, anyKeyboardViewBase3.getPaddingBottom());
        point.offset(0, -anyKeyboardViewBase3.getMeasuredHeight());
        if (anyKeyboardViewBase3.getMeasuredWidth() + point.x > getMeasuredWidth()) {
            point = new Point(anyKeyboardViewBase3.getPaddingRight() + ((key.x + iArr[0]) - anyKeyboardViewBase3.getMeasuredWidth()) + key.width, point.y);
            z2 = true;
        } else {
            z2 = false;
        }
        int i = point.x;
        if (i < 0) {
            point.offset(-i, 0);
            z2 = false;
        }
        if (z2) {
            C1763u c1763u2 = (C1763u) anyKeyboardViewBase3.getKeyboard();
            int mo831g = c1763u2.mo831g();
            for (Key key2 : c1763u2.f5147q) {
                int i2 = key2.x * (-1);
                key2.x = i2;
                int i3 = i2 + mo831g;
                key2.x = i3;
                key2.x = i3 - key2.width;
            }
        }
        int i4 = point.x;
        int i5 = point.y;
        int i6 = i4 - iArr[0];
        int paddingTop = (this.f5308t0.getPaddingTop() + i5) - iArr[1];
        this.f5308t0.m415D(getKeyboard() != null && getKeyboard().mo838h());
        AnyKeyboardViewBase anyKeyboardViewBase4 = this.f5308t0;
        this.f5309u0 = i6;
        this.f5310v0 = paddingTop;
        this.f5312x0.setContentView(anyKeyboardViewBase4);
        AbstractC1441a.m1036b(this.f5312x0);
        this.f5312x0.setWidth(anyKeyboardViewBase4.getMeasuredWidth());
        this.f5312x0.setHeight(anyKeyboardViewBase4.getMeasuredHeight());
        this.f5312x0.showAtLocation(this, 0, i4, i5);
        m395r();
        boolean z3 = !z;
        int i7 = key.centerX;
        int i8 = key.centerY;
        this.f5313y0.f5366d = z3;
        if (z3) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f5311w0 = uptimeMillis;
            MotionEvent m872H = m872H(0, i7, i8, uptimeMillis);
            this.f5308t0.onTouchEvent(m872H);
            m872H.recycle();
        }
        this.f6493e0.mo878b();
        InterfaceC1720f0 interfaceC1720f0 = this.f5314z0;
        if (interfaceC1720f0 != null) {
            C1199f c1199f = (C1199f) interfaceC1720f0;
            c1199f.f4347a.setEnabled(false);
            c1199f.f4348b.setEnabled(false);
        }
    }

    @Override // com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase, p093c.p097b.p128x.InterfaceC1566d3
    /* renamed from: a */
    public boolean mo412a() {
        return this.f5312x0.isShowing() ? this.f5308t0.mo412a() : super.mo412a();
    }

    @Override // com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase, p093c.p097b.p128x.InterfaceC1566d3
    /* renamed from: b */
    public void mo411b() {
        super.mo411b();
        AbstractC1441a.m1035c(this.f6496g.f5292c);
        AnyKeyboardViewBase anyKeyboardViewBase = this.f5308t0;
        if (anyKeyboardViewBase != null) {
            anyKeyboardViewBase.mo411b();
        }
        this.f5308t0 = null;
    }

    @Override // com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase, p093c.p097b.p128x.InterfaceC1566d3
    /* renamed from: c */
    public boolean mo410c() {
        if (mo418G()) {
            return true;
        }
        super.mo410c();
        return false;
    }

    public final AnyKeyboardViewBase getMiniKeyboard() {
        return this.f5308t0;
    }

    @Override // com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase
    /* renamed from: h */
    public void mo405h() {
        super.mo405h();
        mo418G();
    }

    @Override // com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f5312x0.isShowing()) {
            this.f6492e.setColor(((int) (this.f6526x * 255.0f)) << 24);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f6492e);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (getKeyboard() != null) {
            this.f6494f.f5355a = (i - getPaddingLeft()) - getPaddingRight();
            AbstractC1762t keyboard = getKeyboard();
            if (i3 == 0) {
                i3 = keyboard.f5149s;
            }
            keyboard.f5149s = i;
            double d = i;
            double d2 = i3;
            Double.isNaN(d);
            Double.isNaN(d2);
            Double.isNaN(d);
            Double.isNaN(d2);
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d / d2;
            for (Key key : keyboard.f5147q) {
                double d4 = key.x;
                Double.isNaN(d4);
                Double.isNaN(d4);
                Double.isNaN(d4);
                key.x = (int) (d4 * d3);
                double d5 = key.width;
                Double.isNaN(d5);
                Double.isNaN(d5);
                Double.isNaN(d5);
                key.width = (int) (d5 * d3);
            }
            m416C(getKeyboard(), this.f6528z, this.f6464A);
        }
    }

    @Override // com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getMiniKeyboard() == null || !this.f5312x0.isShowing()) {
            return super.onTouchEvent(motionEvent);
        }
        MotionEvent m872H = m872H(motionEvent.getActionMasked(), (int) motionEvent.getX(), (int) motionEvent.getY(), motionEvent.getEventTime());
        getMiniKeyboard().onTouchEvent(m872H);
        m872H.recycle();
        return true;
    }

    @Override // com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase, p093c.p097b.p130z.p132r0.InterfaceC1760z0
    public void setKeyboardTheme(C1237f c1237f) {
        super.setKeyboardTheme(c1237f);
        this.f5308t0 = null;
    }

    public void setOnPopupShownListener(InterfaceC1720f0 interfaceC1720f0) {
        this.f5314z0 = interfaceC1720f0;
    }

    @Override // com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase, p093c.p097b.p130z.p132r0.InterfaceC1760z0
    public void setThemeOverlay(C1138a c1138a) {
        super.setThemeOverlay(c1138a);
        AnyKeyboardViewBase anyKeyboardViewBase = this.f5308t0;
        if (anyKeyboardViewBase != null) {
            anyKeyboardViewBase.setThemeOverlay(this.f6519r0);
        }
    }

    @Override // com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase
    /* renamed from: x */
    public boolean mo389x(AbstractC1427e abstractC1427e, Key key, boolean z, PointerTracker pointerTracker) {
        if (super.mo389x(abstractC1427e, key, z, pointerTracker)) {
            return true;
        }
        if (key.f5239v == 0) {
            return false;
        }
        C1457n.f4752a = true;
        m871I(abstractC1427e, key, z);
        return true;
    }
}