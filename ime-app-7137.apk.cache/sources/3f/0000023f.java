package p010b.p037h.p043c;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* renamed from: b.h.c.m */
/* loaded from: classes.dex */
public class C0443m {

    /* renamed from: a */
    public static SparseIntArray f2388a;

    /* renamed from: b */
    public boolean f2389b = false;

    /* renamed from: c */
    public float f2390c = 0.0f;

    /* renamed from: d */
    public float f2391d = 0.0f;

    /* renamed from: e */
    public float f2392e = 0.0f;

    /* renamed from: f */
    public float f2393f = 1.0f;

    /* renamed from: g */
    public float f2394g = 1.0f;

    /* renamed from: h */
    public float f2395h = Float.NaN;

    /* renamed from: i */
    public float f2396i = Float.NaN;

    /* renamed from: j */
    public float f2397j = 0.0f;

    /* renamed from: k */
    public float f2398k = 0.0f;

    /* renamed from: l */
    public float f2399l = 0.0f;

    /* renamed from: m */
    public boolean f2400m = false;

    /* renamed from: n */
    public float f2401n = 0.0f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2388a = sparseIntArray;
        sparseIntArray.append(AbstractC0447q.Transform_android_rotation, 1);
        f2388a.append(AbstractC0447q.Transform_android_rotationX, 2);
        f2388a.append(AbstractC0447q.Transform_android_rotationY, 3);
        f2388a.append(AbstractC0447q.Transform_android_scaleX, 4);
        f2388a.append(AbstractC0447q.Transform_android_scaleY, 5);
        f2388a.append(AbstractC0447q.Transform_android_transformPivotX, 6);
        f2388a.append(AbstractC0447q.Transform_android_transformPivotY, 7);
        f2388a.append(AbstractC0447q.Transform_android_translationX, 8);
        f2388a.append(AbstractC0447q.Transform_android_translationY, 9);
        f2388a.append(AbstractC0447q.Transform_android_translationZ, 10);
        f2388a.append(AbstractC0447q.Transform_android_elevation, 11);
    }

    /* renamed from: a */
    public void m2454a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0447q.Transform);
        this.f2389b = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (f2388a.get(index)) {
                case 1:
                    this.f2390c = obtainStyledAttributes.getFloat(index, this.f2390c);
                    break;
                case 2:
                    this.f2391d = obtainStyledAttributes.getFloat(index, this.f2391d);
                    break;
                case 3:
                    this.f2392e = obtainStyledAttributes.getFloat(index, this.f2392e);
                    break;
                case 4:
                    this.f2393f = obtainStyledAttributes.getFloat(index, this.f2393f);
                    break;
                case 5:
                    this.f2394g = obtainStyledAttributes.getFloat(index, this.f2394g);
                    break;
                case 6:
                    this.f2395h = obtainStyledAttributes.getDimension(index, this.f2395h);
                    break;
                case 7:
                    this.f2396i = obtainStyledAttributes.getDimension(index, this.f2396i);
                    break;
                case 8:
                    this.f2397j = obtainStyledAttributes.getDimension(index, this.f2397j);
                    break;
                case 9:
                    this.f2398k = obtainStyledAttributes.getDimension(index, this.f2398k);
                    break;
                case 10:
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.f2399l = obtainStyledAttributes.getDimension(index, this.f2399l);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.f2400m = true;
                        this.f2401n = obtainStyledAttributes.getDimension(index, this.f2401n);
                        break;
                    } else {
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}