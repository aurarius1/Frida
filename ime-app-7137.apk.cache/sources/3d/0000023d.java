package p010b.p037h.p043c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import p010b.p037h.p038a.p039a.AbstractC0392a;

/* renamed from: b.h.c.k */
/* loaded from: classes.dex */
public class C0441k {

    /* renamed from: a */
    public static SparseIntArray f2375a;

    /* renamed from: b */
    public boolean f2376b = false;

    /* renamed from: c */
    public int f2377c = -1;

    /* renamed from: d */
    public String f2378d = null;

    /* renamed from: e */
    public int f2379e = -1;

    /* renamed from: f */
    public int f2380f = 0;

    /* renamed from: g */
    public float f2381g = Float.NaN;

    /* renamed from: h */
    public float f2382h = Float.NaN;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2375a = sparseIntArray;
        sparseIntArray.append(AbstractC0447q.Motion_motionPathRotate, 1);
        f2375a.append(AbstractC0447q.Motion_pathMotionArc, 2);
        f2375a.append(AbstractC0447q.Motion_transitionEasing, 3);
        f2375a.append(AbstractC0447q.Motion_drawPath, 4);
        f2375a.append(AbstractC0447q.Motion_animate_relativeTo, 5);
        f2375a.append(AbstractC0447q.Motion_motionStagger, 6);
    }

    /* renamed from: a */
    public void m2456a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0447q.Motion);
        this.f2376b = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (f2375a.get(index)) {
                case 1:
                    this.f2382h = obtainStyledAttributes.getFloat(index, this.f2382h);
                    break;
                case 2:
                    this.f2379e = obtainStyledAttributes.getInt(index, this.f2379e);
                    break;
                case 3:
                    this.f2378d = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : AbstractC0392a.f1948a[obtainStyledAttributes.getInteger(index, 0)];
                    break;
                case 4:
                    this.f2380f = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    int i2 = this.f2377c;
                    int[] iArr = C0444n.f2402a;
                    int resourceId = obtainStyledAttributes.getResourceId(index, i2);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    this.f2377c = resourceId;
                    break;
                case 6:
                    this.f2381g = obtainStyledAttributes.getFloat(index, this.f2381g);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}