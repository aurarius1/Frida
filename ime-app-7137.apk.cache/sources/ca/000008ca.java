package com.anysoftkeyboard.keyboards.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p010b.p036g.C0378b;
import p010b.p080s.p081a.AbstractC0856f;
import p010b.p080s.p081a.C0853c;
import p010b.p080s.p081a.C0854d;
import p010b.p080s.p081a.C0855e;
import p010b.p080s.p081a.C0857g;
import p093c.p097b.p105f0.AbstractC1216c;
import p093c.p097b.p107h0.C1237f;
import p093c.p097b.p108i0.p110p.C1365r1;
import p093c.p097b.p108i0.p110p.C1372u;
import p093c.p097b.p130z.AbstractC1762t;
import p093c.p097b.p130z.Key;
import p093c.p097b.p130z.p132r0.HandlerC1732l0;
import p093c.p097b.p130z.p132r0.InterfaceC1730k0;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* loaded from: classes.dex */
public class DemoAnyKeyboardView extends AnyKeyboardView {

    /* renamed from: X0 */
    public final HandlerC1732l0 f6556X0;

    /* renamed from: Y0 */
    public InterfaceC1730k0 f6557Y0;

    /* renamed from: Z0 */
    public final int f6558Z0;

    /* renamed from: a1 */
    public float f6559a1;

    public DemoAnyKeyboardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f6557Y0 = null;
        this.f6559a1 = 1.0f;
        this.f6556X0 = new HandlerC1732l0(this, null);
        setKeyboardTheme((C1237f) AnyApplication.m190l(getContext()).m1058f());
        this.f6558Z0 = getThemedKeyboardDimens().mo862e();
    }

    /* renamed from: K */
    public static void m384K(DemoAnyKeyboardView demoAnyKeyboardView, char c, boolean z) {
        AbstractC1762t keyboard = demoAnyKeyboardView.getKeyboard();
        if (keyboard == null) {
            return;
        }
        for (Key key : keyboard.f5147q) {
            if (key.getPrimaryCode() == c) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis - (z ? 0L : 128L), uptimeMillis, !z ? 1 : 0, key.centerX, key.centerY, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
    }

    /* renamed from: L */
    public static void m383L(DemoAnyKeyboardView demoAnyKeyboardView) {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        HandlerC1732l0 handlerC1732l0 = this.f6556X0;
        if (handlerC1732l0.f5326d) {
            return;
        }
        handlerC1732l0.f5326d = true;
        handlerC1732l0.m868b(handlerC1732l0.f5324b);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6556X0.m869a();
    }

    @Override // com.anysoftkeyboard.keyboards.views.AnyKeyboardView, p093c.p097b.p130z.p132r0.AbstractC1718e0, p093c.p097b.p130z.p132r0.AbstractC1722g0, com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase, android.view.View
    public void onDraw(Canvas canvas) {
        float f = this.f6559a1;
        canvas.scale(f, f);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        HandlerC1732l0 handlerC1732l0 = this.f6556X0;
        if (handlerC1732l0.f5326d) {
            return;
        }
        handlerC1732l0.f5326d = true;
        handlerC1732l0.m868b(handlerC1732l0.f5324b);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        InterfaceC1730k0 interfaceC1730k0 = this.f6557Y0;
        if (!z || interfaceC1730k0 == null || getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        draw(new Canvas(createBitmap));
        if (createBitmap != null) {
            final C1365r1 c1365r1 = ((C1372u) interfaceC1730k0).f4606a;
            List list = C1365r1.f4586W;
            c1365r1.getClass();
            c1365r1.f4594e0 = AbstractC2094b.m173E(createBitmap).m163P(AbstractC1216c.f4391a).m172F(new InterfaceC2127i() { // from class: c.b.i0.p.x
                /* JADX WARN: Removed duplicated region for block: B:58:0x0185  */
                /* JADX WARN: Removed duplicated region for block: B:79:0x01f8  */
                @Override // p183e.p184a.p189o.InterfaceC2127i
                /* renamed from: a */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object mo24a(Object obj) {
                    Bitmap createScaledBitmap;
                    boolean z2;
                    ArrayList arrayList;
                    int i5;
                    int i6;
                    char c;
                    float f;
                    float f2;
                    Bitmap bitmap = (Bitmap) obj;
                    List list2 = C1365r1.f4586W;
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    if (bitmap != null && !bitmap.isRecycled()) {
                        arrayList3.add(AbstractC0856f.f3433a);
                        arrayList2.add(C0857g.f3434a);
                        arrayList2.add(C0857g.f3435b);
                        arrayList2.add(C0857g.f3436c);
                        arrayList2.add(C0857g.f3437d);
                        arrayList2.add(C0857g.f3438e);
                        arrayList2.add(C0857g.f3439f);
                        double d = -1.0d;
                        int height = bitmap.getHeight() * bitmap.getWidth();
                        if (height > 12544) {
                            double d2 = 12544;
                            double d3 = height;
                            Double.isNaN(d2);
                            Double.isNaN(d3);
                            Double.isNaN(d2);
                            Double.isNaN(d3);
                            Double.isNaN(d2);
                            Double.isNaN(d3);
                            Double.isNaN(d2);
                            Double.isNaN(d3);
                            d = Math.sqrt(d2 / d3);
                        }
                        char c2 = 0;
                        if (d <= 0.0d) {
                            createScaledBitmap = bitmap;
                        } else {
                            double width = bitmap.getWidth();
                            Double.isNaN(width);
                            Double.isNaN(width);
                            Double.isNaN(width);
                            Double.isNaN(width);
                            double height2 = bitmap.getHeight();
                            Double.isNaN(height2);
                            Double.isNaN(height2);
                            Double.isNaN(height2);
                            Double.isNaN(height2);
                            createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(width * d), (int) Math.ceil(height2 * d), false);
                        }
                        int width2 = createScaledBitmap.getWidth();
                        int height3 = createScaledBitmap.getHeight();
                        int[] iArr = new int[width2 * height3];
                        createScaledBitmap.getPixels(iArr, 0, width2, 0, 0, width2, height3);
                        C0853c c0853c = new C0853c(iArr, 16, arrayList3.isEmpty() ? null : (C0854d[]) arrayList3.toArray(new C0854d[arrayList3.size()]));
                        if (createScaledBitmap != bitmap) {
                            createScaledBitmap.recycle();
                        }
                        List list3 = c0853c.f3421d;
                        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                        C0378b c0378b = new C0378b();
                        int size = list3.size();
                        int i7 = Integer.MIN_VALUE;
                        C0855e c0855e = null;
                        for (int i8 = 0; i8 < size; i8++) {
                            C0855e c0855e2 = (C0855e) list3.get(i8);
                            int i9 = c0855e2.f3428e;
                            if (i9 > i7) {
                                c0855e = c0855e2;
                                i7 = i9;
                            }
                        }
                        int size2 = arrayList2.size();
                        int i10 = 0;
                        while (i10 < size2) {
                            C0857g c0857g = (C0857g) arrayList2.get(i10);
                            int length = c0857g.f3442i.length;
                            float f3 = 0.0f;
                            for (int i11 = 0; i11 < length; i11++) {
                                float f4 = c0857g.f3442i[i11];
                                if (f4 > 0.0f) {
                                    f3 += f4;
                                }
                            }
                            if (f3 != 0.0f) {
                                int length2 = c0857g.f3442i.length;
                                for (int i12 = 0; i12 < length2; i12++) {
                                    float[] fArr = c0857g.f3442i;
                                    if (fArr[i12] > 0.0f) {
                                        fArr[i12] = fArr[i12] / f3;
                                    }
                                }
                            }
                            int size3 = list3.size();
                            int i13 = 0;
                            C0855e c0855e3 = null;
                            float f5 = 0.0f;
                            while (i13 < size3) {
                                C0855e c0855e4 = (C0855e) list3.get(i13);
                                float[] m1762b = c0855e4.m1762b();
                                float f6 = m1762b[1];
                                float[] fArr2 = c0857g.f3440g;
                                if (f6 >= fArr2[c2] && m1762b[1] <= fArr2[2]) {
                                    float f7 = m1762b[2];
                                    float[] fArr3 = c0857g.f3441h;
                                    if (f7 >= fArr3[c2] && m1762b[2] <= fArr3[2] && !sparseBooleanArray.get(c0855e4.f3427d)) {
                                        z2 = true;
                                        if (z2) {
                                            arrayList = arrayList2;
                                            i5 = size2;
                                        } else {
                                            float[] m1762b2 = c0855e4.m1762b();
                                            if (c0855e != null) {
                                                i6 = c0855e.f3428e;
                                                arrayList = arrayList2;
                                            } else {
                                                arrayList = arrayList2;
                                                i6 = 1;
                                            }
                                            float[] fArr4 = c0857g.f3442i;
                                            if (fArr4[c2] > 0.0f) {
                                                c = 1;
                                                f = fArr4[c2] * (1.0f - Math.abs(m1762b2[1] - c0857g.f3440g[1]));
                                            } else {
                                                c = 1;
                                                f = 0.0f;
                                            }
                                            float[] fArr5 = c0857g.f3442i;
                                            if (fArr5[c] > 0.0f) {
                                                i5 = size2;
                                                f2 = fArr5[c] * (1.0f - Math.abs(m1762b2[2] - c0857g.f3441h[c]));
                                            } else {
                                                i5 = size2;
                                                f2 = 0.0f;
                                            }
                                            float[] fArr6 = c0857g.f3442i;
                                            float f8 = f + f2 + (fArr6[2] > 0.0f ? fArr6[2] * (c0855e4.f3428e / i6) : 0.0f);
                                            if (c0855e3 == null || f8 > f5) {
                                                f5 = f8;
                                                c0855e3 = c0855e4;
                                            }
                                        }
                                        i13++;
                                        arrayList2 = arrayList;
                                        size2 = i5;
                                        c2 = 0;
                                    }
                                }
                                z2 = false;
                                if (z2) {
                                }
                                i13++;
                                arrayList2 = arrayList;
                                size2 = i5;
                                c2 = 0;
                            }
                            ArrayList arrayList4 = arrayList2;
                            int i14 = size2;
                            if (c0855e3 != null) {
                                sparseBooleanArray.append(c0855e3.f3427d, true);
                            }
                            c0378b.put(c0857g, c0855e3);
                            i10++;
                            arrayList2 = arrayList4;
                            size2 = i14;
                            c2 = 0;
                        }
                        sparseBooleanArray.clear();
                        C0855e c0855e5 = null;
                        for (C0855e c0855e6 : Collections.unmodifiableList(list3)) {
                            if (c0855e5 == null || c0855e5.f3428e < c0855e6.f3428e) {
                                c0855e5 = c0855e6;
                            }
                        }
                        return c0855e5;
                    }
                    throw new IllegalArgumentException("Bitmap is not valid");
                }
            }).m171G(AbstractC1216c.f4392b).m164N(new InterfaceC2123e() { // from class: c.b.i0.p.q
                @Override // p183e.p184a.p189o.InterfaceC2123e
                public final void accept(Object obj) {
                    C0855e c0855e = (C0855e) obj;
                    View view = C1365r1.this.f3216I;
                    if (c0855e == null || view == null) {
                        return;
                    }
                    int argb = Color.argb(200, Color.red(c0855e.f3427d), Color.green(c0855e.f3427d), Color.blue(c0855e.f3427d));
                    TextView textView = (TextView) view.findViewById(R.id.ask_social_link);
                    c0855e.m1763a();
                    textView.setTextColor(c0855e.f3430g);
                    textView.setBackgroundColor(argb);
                }
            }, new InterfaceC2123e() { // from class: c.b.i0.p.s
                @Override // p183e.p184a.p189o.InterfaceC2123e
                public final void accept(Object obj) {
                    Throwable th = (Throwable) obj;
                    List list2 = C1365r1.f4586W;
                }
            }, AbstractC2146l.f7038c, AbstractC2146l.f7039d);
        }
    }

    @Override // com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase, android.view.View
    public void onMeasure(int i, int i2) {
        float f;
        AbstractC1762t keyboard = getKeyboard();
        if (keyboard == null) {
            super.onMeasure(i, i2);
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft() + keyboard.mo831g();
        if (View.MeasureSpec.getSize(i) < paddingRight + 10) {
            paddingRight = View.MeasureSpec.getSize(i);
            f = paddingRight / this.f6558Z0;
        } else {
            f = 1.0f;
        }
        this.f6559a1 = f;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + keyboard.mo839e();
        float f2 = this.f6559a1;
        setMeasuredDimension((int) (paddingRight / f2), (int) (paddingBottom * f2));
    }

    @Override // com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase, android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.f6556X0.m869a();
    }

    @Override // com.anysoftkeyboard.keyboards.views.AnyKeyboardView, p093c.p097b.p130z.p132r0.AbstractC1722g0, com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void setOnViewBitmapReadyListener(InterfaceC1730k0 interfaceC1730k0) {
        this.f6557Y0 = interfaceC1730k0;
    }

    public void setSimulatedTypingText(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f6556X0.m867c();
        } else {
            this.f6556X0.m868b(str);
        }
    }
}