package p010b.p016c.p026q;

import android.content.Context;
import android.graphics.drawable.Drawable;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.AbstractC0075a;

/* renamed from: b.c.q.m */
/* loaded from: classes.dex */
public class C0278m extends C0253h0 implements InterfaceC0303r {

    /* renamed from: d */
    public final /* synthetic */ C0298q f1658d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0278m(C0298q c0298q, Context context) {
        super(context, null, AbstractC0075a.actionOverflowButtonStyle);
        this.f1658d = c0298q;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC0022t.m3476p0(this, getContentDescription());
        setOnTouchListener(new C0273l(this, this, c0298q));
    }

    @Override // p010b.p016c.p026q.InterfaceC0303r
    /* renamed from: a */
    public boolean mo2739a() {
        return false;
    }

    @Override // p010b.p016c.p026q.InterfaceC0303r
    /* renamed from: b */
    public boolean mo2738b() {
        return false;
    }

    @Override // android.view.View
    public boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f1658d.m2759q();
        return true;
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            AbstractC0022t.m3498e0(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}