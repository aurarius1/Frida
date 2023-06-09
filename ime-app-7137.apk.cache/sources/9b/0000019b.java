package p010b.p016c.p026q;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p010b.p016c.AbstractC0075a;

/* renamed from: b.c.q.m0 */
/* loaded from: classes.dex */
public class C0279m0 extends RatingBar {

    /* renamed from: b */
    public final C0269k0 f1659b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0279m0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int i = AbstractC0075a.ratingBarStyle;
        AbstractC0282m3.m2793a(this, getContext());
        C0269k0 c0269k0 = new C0269k0(this);
        this.f1659b = c0269k0;
        c0269k0.mo2781a(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f1659b.f1634c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}