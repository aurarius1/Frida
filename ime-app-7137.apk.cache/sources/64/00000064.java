package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import p010b.p037h.p043c.C0434d;

/* loaded from: classes.dex */
public class Guideline extends View {
    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        C0434d c0434d = (C0434d) getLayoutParams();
        c0434d.f2250a = i;
        setLayoutParams(c0434d);
    }

    public void setGuidelineEnd(int i) {
        C0434d c0434d = (C0434d) getLayoutParams();
        c0434d.f2252b = i;
        setLayoutParams(c0434d);
    }

    public void setGuidelinePercent(float f) {
        C0434d c0434d = (C0434d) getLayoutParams();
        c0434d.f2254c = f;
        setLayoutParams(c0434d);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}