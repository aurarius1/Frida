package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p010b.p037h.p040b.p041n.C0406a;
import p010b.p037h.p043c.AbstractC0432b;
import p010b.p037h.p043c.AbstractC0447q;

/* loaded from: classes.dex */
public class Barrier extends AbstractC0432b {

    /* renamed from: h */
    public int f408h;

    /* renamed from: i */
    public int f409i;

    /* renamed from: j */
    public C0406a f410j;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    @Override // p010b.p037h.p043c.AbstractC0432b
    /* renamed from: d */
    public void mo2466d(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0447q.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == AbstractC0447q.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2221f = string;
                    setIds(string);
                }
            }
        }
        this.f410j = new C0406a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, AbstractC0447q.ConstraintLayout_Layout);
            int indexCount2 = obtainStyledAttributes2.getIndexCount();
            for (int i2 = 0; i2 < indexCount2; i2++) {
                int index2 = obtainStyledAttributes2.getIndex(i2);
                if (index2 == AbstractC0447q.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes2.getInt(index2, 0));
                } else if (index2 == AbstractC0447q.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f410j.f2031h0 = obtainStyledAttributes2.getBoolean(index2, true);
                } else if (index2 == AbstractC0447q.ConstraintLayout_Layout_barrierMargin) {
                    this.f410j.f2032i0 = obtainStyledAttributes2.getDimensionPixelSize(index2, 0);
                }
            }
        }
        this.f2220e = this.f410j;
        m2462h();
    }

    public int getMargin() {
        return this.f410j.f2032i0;
    }

    public int getType() {
        return this.f408h;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f410j.f2031h0 = z;
    }

    public void setDpMargin(int i) {
        this.f410j.f2032i0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f410j.f2032i0 = i;
    }

    public void setType(int i) {
        this.f408h = i;
    }
}