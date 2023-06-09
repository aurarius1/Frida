package p010b.p016c.p026q;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p010b.p016c.AbstractC0075a;

/* renamed from: b.c.q.o0 */
/* loaded from: classes.dex */
public class C0289o0 extends SeekBar {

    /* renamed from: b */
    public final C0294p0 f1673b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0289o0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int i = AbstractC0075a.seekBarStyle;
        AbstractC0282m3.m2793a(this, getContext());
        C0294p0 c0294p0 = new C0294p0(this);
        this.f1673b = c0294p0;
        c0294p0.mo2781a(attributeSet, i);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0294p0 c0294p0 = this.f1673b;
        Drawable drawable = c0294p0.f1683e;
        if (drawable != null && drawable.isStateful() && drawable.setState(c0294p0.f1682d.getDrawableState())) {
            c0294p0.f1682d.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1673b.f1683e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1673b.m2779d(canvas);
    }
}