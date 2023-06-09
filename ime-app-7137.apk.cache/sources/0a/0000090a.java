package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.Arrays;
import p010b.p016c.p018l.p019a.AbstractC0142b;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.C0568b;
import p010b.p046j.p058l.p059d1.C0578c;
import p010b.p086w.AbstractC1077v0;
import p093c.p145g.p146a.p147a.AbstractC1804b;
import p093c.p145g.p146a.p147a.AbstractC1827c;
import p093c.p145g.p146a.p147a.AbstractC1829d;
import p093c.p145g.p146a.p147a.AbstractC1840f;
import p093c.p145g.p146a.p147a.AbstractC1868h;
import p093c.p145g.p146a.p147a.AbstractC1926k;
import p093c.p145g.p146a.p147a.AbstractC1940l;
import p093c.p145g.p146a.p147a.p159k0.AbstractC1935i;
import p093c.p145g.p146a.p147a.p159k0.C1930d;
import p093c.p145g.p146a.p147a.p159k0.InterfaceC1933g;
import p093c.p145g.p146a.p147a.p159k0.ViewTreeObserver$OnPreDrawListenerC1929c;

/* loaded from: classes.dex */
public class ClockFaceView extends AbstractC1935i implements InterfaceC1933g {

    /* renamed from: A */
    public final int[] f6933A;

    /* renamed from: B */
    public final float[] f6934B;

    /* renamed from: C */
    public final int f6935C;

    /* renamed from: D */
    public String[] f6936D;

    /* renamed from: E */
    public float f6937E;

    /* renamed from: F */
    public final ColorStateList f6938F;

    /* renamed from: v */
    public final ClockHandView f6939v;

    /* renamed from: w */
    public final Rect f6940w;

    /* renamed from: x */
    public final RectF f6941x;

    /* renamed from: y */
    public final SparseArray f6942y;

    /* renamed from: z */
    public final C0568b f6943z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int i = AbstractC1804b.materialClockStyle;
        this.f6940w = new Rect();
        this.f6941x = new RectF();
        SparseArray sparseArray = new SparseArray();
        this.f6942y = sparseArray;
        this.f6934B = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1940l.ClockFaceView, i, AbstractC1926k.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList m1262q = AbstractC1077v0.m1262q(context, obtainStyledAttributes, AbstractC1940l.ClockFaceView_clockNumberTextColor);
        this.f6938F = m1262q;
        LayoutInflater.from(context).inflate(AbstractC1868h.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(AbstractC1840f.material_clock_hand);
        this.f6939v = clockHandView;
        this.f6935C = resources.getDimensionPixelSize(AbstractC1829d.material_clock_hand_padding);
        int colorForState = m1262q.getColorForState(new int[]{16842913}, m1262q.getDefaultColor());
        this.f6933A = new int[]{colorForState, colorForState, m1262q.getDefaultColor()};
        clockHandView.f6950h.add(this);
        int defaultColor = AbstractC0142b.m3001a(context, AbstractC1827c.material_timepicker_clockface).getDefaultColor();
        ColorStateList m1262q2 = AbstractC1077v0.m1262q(context, obtainStyledAttributes, AbstractC1940l.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(m1262q2 != null ? m1262q2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC1929c(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f6943z = new C1930d(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f6936D = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        for (int i2 = 0; i2 < Math.max(this.f6936D.length, size); i2++) {
            TextView textView = (TextView) this.f6942y.get(i2);
            if (i2 >= this.f6936D.length) {
                removeView(textView);
                this.f6942y.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(AbstractC1868h.material_clockface_textview, (ViewGroup) this, false);
                    this.f6942y.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f6936D[i2]);
                textView.setTag(AbstractC1840f.material_value_index, Integer.valueOf(i2));
                AbstractC0605j0.m2269N(textView, this.f6943z);
                textView.setTextColor(this.f6938F);
            }
        }
    }

    /* renamed from: i */
    public final void m228i() {
        RectF rectF = this.f6939v.f6954l;
        for (int i = 0; i < this.f6942y.size(); i++) {
            TextView textView = (TextView) this.f6942y.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.f6940w);
                this.f6940w.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.f6940w);
                this.f6941x.set(this.f6940w);
                textView.getPaint().setShader(!RectF.intersects(rectF, this.f6941x) ? null : new RadialGradient(rectF.centerX() - this.f6941x.left, rectF.centerY() - this.f6941x.top, 0.5f * rectF.width(), this.f6933A, this.f6934B, Shader.TileMode.CLAMP));
                textView.invalidate();
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0578c m2315a = C0578c.m2315a(1, this.f6936D.length, false, 1);
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) m2315a.f2700a);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m228i();
    }
}