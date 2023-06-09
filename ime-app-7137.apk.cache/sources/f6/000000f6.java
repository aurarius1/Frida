package p010b.p016c.p017k;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import p010b.p016c.p018l.p019a.AbstractC0142b;

/* renamed from: b.c.k.m0 */
/* loaded from: classes.dex */
public class C0114m0 extends ContentFrameLayout {

    /* renamed from: j */
    public final /* synthetic */ LayoutInflater$Factory2C0120p0 f963j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0114m0(LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0, Context context) {
        super(context, null);
        this.f963j = layoutInflater$Factory2C0120p0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f963j.m3034w(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0 = this.f963j;
                layoutInflater$Factory2C0120p0.m3036u(layoutInflater$Factory2C0120p0.m3051D(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(AbstractC0142b.m3000b(getContext(), i));
    }
}