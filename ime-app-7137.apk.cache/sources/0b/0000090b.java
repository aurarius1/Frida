package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;
import p010b.p046j.p058l.AbstractC0605j0;
import p093c.p145g.p146a.p147a.AbstractC1804b;
import p093c.p145g.p146a.p147a.AbstractC1829d;
import p093c.p145g.p146a.p147a.AbstractC1926k;
import p093c.p145g.p146a.p147a.AbstractC1940l;
import p093c.p145g.p146a.p147a.p159k0.C1931e;
import p093c.p145g.p146a.p147a.p159k0.C1932f;
import p093c.p145g.p146a.p147a.p159k0.InterfaceC1933g;

/* loaded from: classes.dex */
public class ClockHandView extends View {

    /* renamed from: b */
    public static final /* synthetic */ int f6944b = 0;

    /* renamed from: c */
    public ValueAnimator f6945c;

    /* renamed from: d */
    public float f6946d;

    /* renamed from: e */
    public float f6947e;

    /* renamed from: f */
    public boolean f6948f;

    /* renamed from: g */
    public int f6949g;

    /* renamed from: h */
    public final List f6950h;

    /* renamed from: i */
    public final int f6951i;

    /* renamed from: j */
    public final float f6952j;

    /* renamed from: k */
    public final Paint f6953k;

    /* renamed from: l */
    public final RectF f6954l;

    /* renamed from: m */
    public final int f6955m;

    /* renamed from: n */
    public float f6956n;

    /* renamed from: o */
    public boolean f6957o;

    /* renamed from: p */
    public double f6958p;

    /* renamed from: q */
    public int f6959q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int i = AbstractC1804b.materialClockStyle;
        this.f6950h = new ArrayList();
        Paint paint = new Paint();
        this.f6953k = paint;
        this.f6954l = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1940l.ClockHandView, i, AbstractC1926k.Widget_MaterialComponents_TimePicker_Clock);
        this.f6959q = obtainStyledAttributes.getDimensionPixelSize(AbstractC1940l.ClockHandView_materialCircleRadius, 0);
        this.f6951i = obtainStyledAttributes.getDimensionPixelSize(AbstractC1940l.ClockHandView_selectorSize, 0);
        Resources resources = getResources();
        this.f6955m = resources.getDimensionPixelSize(AbstractC1829d.material_clock_hand_stroke_width);
        this.f6952j = resources.getDimensionPixelSize(AbstractC1829d.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(AbstractC1940l.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m226b(0.0f, false);
        this.f6949g = ViewConfiguration.get(context).getScaledTouchSlop();
        AbstractC0605j0.m2263T(this, 2);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final int m227a(float f, float f2) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    /* renamed from: b */
    public void m226b(float f, boolean z) {
        ValueAnimator valueAnimator = this.f6945c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            m225c(f, false);
            return;
        }
        float f2 = this.f6956n;
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (f2 < 180.0f && f > 180.0f) {
                f2 += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f2), Float.valueOf(f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
        this.f6945c = ofFloat;
        ofFloat.setDuration(200L);
        this.f6945c.addUpdateListener(new C1931e(this));
        this.f6945c.addListener(new C1932f(this));
        this.f6945c.start();
    }

    /* renamed from: c */
    public final void m225c(float f, boolean z) {
        float f2 = f % 360.0f;
        this.f6956n = f2;
        this.f6958p = Math.toRadians(f2 - 90.0f);
        float cos = (this.f6959q * ((float) Math.cos(this.f6958p))) + (getWidth() / 2);
        float sin = (this.f6959q * ((float) Math.sin(this.f6958p))) + (getHeight() / 2);
        RectF rectF = this.f6954l;
        int i = this.f6951i;
        rectF.set(cos - i, sin - i, cos + i, sin + i);
        for (InterfaceC1933g interfaceC1933g : this.f6950h) {
            ClockFaceView clockFaceView = (ClockFaceView) interfaceC1933g;
            if (Math.abs(clockFaceView.f6937E - f2) > 0.001f) {
                clockFaceView.f6937E = f2;
                clockFaceView.m228i();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        int height = getHeight() / 2;
        float width2 = getWidth() / 2;
        float f = height;
        this.f6953k.setStrokeWidth(0.0f);
        canvas.drawCircle((this.f6959q * ((float) Math.cos(this.f6958p))) + width2, (this.f6959q * ((float) Math.sin(this.f6958p))) + f, this.f6951i, this.f6953k);
        double sin = Math.sin(this.f6958p);
        double cos = Math.cos(this.f6958p);
        Double.isNaN(r6);
        Double.isNaN(r6);
        Double.isNaN(r6);
        Double.isNaN(r6);
        this.f6953k.setStrokeWidth(this.f6955m);
        canvas.drawLine(width2, f, width + ((int) (cos * r6)), height + ((int) (r6 * sin)), this.f6953k);
        canvas.drawCircle(width2, f, this.f6952j, this.f6953k);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m226b(this.f6956n, false);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                int i = (int) (x - this.f6946d);
                int i2 = (int) (y - this.f6947e);
                this.f6948f = (i2 * i2) + (i * i) > this.f6949g;
                z = this.f6957o;
                if (actionMasked == 1) {
                }
            } else {
                z = false;
            }
            z2 = false;
        } else {
            this.f6946d = x;
            this.f6947e = y;
            this.f6948f = true;
            this.f6957o = false;
            z = false;
            z2 = true;
        }
        boolean z4 = this.f6957o;
        float m227a = m227a(x, y);
        boolean z5 = this.f6956n != m227a;
        if (!z2 || !z5) {
            if (z5 || z) {
                m226b(m227a, false);
            }
            this.f6957o = z4 | z3;
            return true;
        }
        z3 = true;
        this.f6957o = z4 | z3;
        return true;
    }
}