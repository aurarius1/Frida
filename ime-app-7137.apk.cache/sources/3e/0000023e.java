package p010b.p037h.p043c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: b.h.c.l */
/* loaded from: classes.dex */
public class C0442l {

    /* renamed from: a */
    public boolean f2383a = false;

    /* renamed from: b */
    public int f2384b = 0;

    /* renamed from: c */
    public int f2385c = 0;

    /* renamed from: d */
    public float f2386d = 1.0f;

    /* renamed from: e */
    public float f2387e = Float.NaN;

    /* renamed from: a */
    public void m2455a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0447q.PropertySet);
        this.f2383a = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == AbstractC0447q.PropertySet_android_alpha) {
                this.f2386d = obtainStyledAttributes.getFloat(index, this.f2386d);
            } else if (index == AbstractC0447q.PropertySet_android_visibility) {
                int i2 = obtainStyledAttributes.getInt(index, this.f2384b);
                this.f2384b = i2;
                int[] iArr = C0444n.f2402a;
                this.f2384b = C0444n.f2402a[i2];
            } else if (index == AbstractC0447q.PropertySet_visibilityMode) {
                this.f2385c = obtainStyledAttributes.getInt(index, this.f2385c);
            } else if (index == AbstractC0447q.PropertySet_motionProgress) {
                this.f2387e = obtainStyledAttributes.getFloat(index, this.f2387e);
            }
        }
        obtainStyledAttributes.recycle();
    }
}