package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import p010b.p016c.p026q.C0242f1;
import p010b.p086w.AbstractC1077v0;
import p093c.p145g.p146a.p147a.AbstractC1804b;
import p093c.p145g.p146a.p147a.AbstractC1940l;
import p093c.p145g.p146a.p147a.p157j0.p158a.AbstractC1925a;

/* loaded from: classes.dex */
public class MaterialTextView extends C0242f1 {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        super(AbstractC1925a.m676a(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = getContext();
        if (AbstractC1077v0.m1284T(context2, AbstractC1804b.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC1940l.MaterialTextView;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int m236f = m236f(context2, obtainStyledAttributes, AbstractC1940l.MaterialTextView_android_lineHeight, AbstractC1940l.MaterialTextView_lineHeight);
            obtainStyledAttributes.recycle();
            if (m236f != -1) {
                return;
            }
            TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int resourceId = obtainStyledAttributes2.getResourceId(AbstractC1940l.MaterialTextView_android_textAppearance, -1);
            obtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                m237e(theme, resourceId);
            }
        }
    }

    /* renamed from: f */
    public static int m236f(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            int i3 = iArr[i2];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i3, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i = dimensionPixelSize;
            } else {
                i = typedArray.getDimensionPixelSize(i3, -1);
            }
        }
        return i;
    }

    /* renamed from: e */
    public final void m237e(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, AbstractC1940l.MaterialTextAppearance);
        int m236f = m236f(getContext(), obtainStyledAttributes, AbstractC1940l.MaterialTextAppearance_android_lineHeight, AbstractC1940l.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (m236f >= 0) {
            setLineHeight(m236f);
        }
    }

    @Override // p010b.p016c.p026q.C0242f1, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (AbstractC1077v0.m1284T(context, AbstractC1804b.textAppearanceLineHeightEnabled, true)) {
            m237e(context.getTheme(), i);
        }
    }
}