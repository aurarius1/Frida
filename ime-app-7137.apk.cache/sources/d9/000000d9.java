package p010b.p016c.p017k;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import p010b.p016c.AbstractC0084j;

/* renamed from: b.c.k.a */
/* loaded from: classes.dex */
public abstract class AbstractC0085a extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public int f868a;

    public AbstractC0085a(int i, int i2) {
        super(i, i2);
        this.f868a = 0;
        this.f868a = 8388627;
    }

    public AbstractC0085a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f868a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0084j.ActionBarLayout);
        this.f868a = obtainStyledAttributes.getInt(AbstractC0084j.ActionBarLayout_android_layout_gravity, 0);
        obtainStyledAttributes.recycle();
    }

    public AbstractC0085a(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f868a = 0;
    }

    public AbstractC0085a(AbstractC0085a abstractC0085a) {
        super((ViewGroup.MarginLayoutParams) abstractC0085a);
        this.f868a = 0;
        this.f868a = abstractC0085a.f868a;
    }
}