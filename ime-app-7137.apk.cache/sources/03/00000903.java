package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicInteger;
import p010b.p046j.p058l.AbstractC0605j0;
import p093c.p145g.p146a.p147a.AbstractC1829d;
import p093c.p145g.p146a.p147a.AbstractC1840f;
import p093c.p145g.p146a.p147a.AbstractC1940l;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: b */
    public TextView f6833b;

    /* renamed from: c */
    public Button f6834c;

    /* renamed from: d */
    public int f6835d;

    /* renamed from: e */
    public int f6836e;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1940l.SnackbarLayout);
        this.f6835d = obtainStyledAttributes.getDimensionPixelSize(AbstractC1940l.SnackbarLayout_android_maxWidth, -1);
        this.f6836e = obtainStyledAttributes.getDimensionPixelSize(AbstractC1940l.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final boolean m271a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f6833b.getPaddingTop() == i2 && this.f6833b.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f6833b;
        AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 17 ? textView.isPaddingRelative() : false) {
            int m2237u = AbstractC0605j0.m2237u(textView);
            int m2238t = AbstractC0605j0.m2238t(textView);
            if (i4 >= 17) {
                textView.setPaddingRelative(m2237u, i2, m2238t, i3);
                return true;
            }
            textView.setPadding(m2237u, i2, m2238t, i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.f6834c;
    }

    public TextView getMessageView() {
        return this.f6833b;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f6833b = (TextView) findViewById(AbstractC1840f.snackbar_text);
        this.f6834c = (Button) findViewById(AbstractC1840f.snackbar_action);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (m271a(1, r0, r0 - r1) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
        if (m271a(0, r0, r0) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        r3 = true;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f6835d > 0) {
            int measuredWidth = getMeasuredWidth();
            int i3 = this.f6835d;
            if (measuredWidth > i3) {
                i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                super.onMeasure(i, i2);
            }
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(AbstractC1829d.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(AbstractC1829d.design_snackbar_padding_vertical);
        boolean z = false;
        boolean z2 = this.f6833b.getLayout().getLineCount() > 1;
        if (!z2 || this.f6836e <= 0 || this.f6834c.getMeasuredWidth() <= this.f6836e) {
            if (!z2) {
                dimensionPixelSize = dimensionPixelSize2;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
    }

    public void setMaxInlineActionWidth(int i) {
        this.f6836e = i;
    }
}