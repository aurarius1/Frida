package p010b.p091z.p092a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: b.z.a.h */
/* loaded from: classes.dex */
public class C1117h extends ViewGroup.LayoutParams {

    /* renamed from: a */
    public boolean f4168a;

    /* renamed from: b */
    public int f4169b;

    /* renamed from: c */
    public float f4170c;

    /* renamed from: d */
    public boolean f4171d;

    /* renamed from: e */
    public int f4172e;

    /* renamed from: f */
    public int f4173f;

    public C1117h() {
        super(-1, -1);
        this.f4170c = 0.0f;
    }

    public C1117h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4170c = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1123n.f4176b);
        this.f4169b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }
}