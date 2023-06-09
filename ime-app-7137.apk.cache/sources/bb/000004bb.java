package p010b.p086w;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;

/* renamed from: b.w.w0 */
/* loaded from: classes.dex */
public class C1079w0 extends ViewGroup {

    /* renamed from: b */
    public ViewGroup f4043b;

    /* renamed from: c */
    public View f4044c;

    /* renamed from: d */
    public ArrayList f4045d;

    /* renamed from: e */
    public AbstractC1081x0 f4046e;

    /* renamed from: f */
    public boolean f4047f;

    static {
        try {
            Class cls = Integer.TYPE;
            ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
        } catch (NoSuchMethodException unused) {
        }
    }

    public C1079w0(Context context, ViewGroup viewGroup, View view, AbstractC1081x0 abstractC1081x0) {
        super(context);
        this.f4045d = null;
        this.f4043b = viewGroup;
        this.f4044c = view;
        setRight(viewGroup.getWidth());
        setBottom(viewGroup.getHeight());
        viewGroup.addView(this);
        this.f4046e = abstractC1081x0;
    }

    /* renamed from: a */
    public final void m1252a() {
        if (getChildCount() == 0) {
            ArrayList arrayList = this.f4045d;
            if (arrayList == null || arrayList.size() == 0) {
                this.f4047f = true;
                this.f4043b.removeView(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        this.f4043b.getLocationOnScreen(iArr);
        this.f4044c.getLocationOnScreen(iArr2);
        canvas.translate(iArr2[0] - iArr[0], iArr2[1] - iArr[1]);
        canvas.clipRect(new Rect(0, 0, this.f4044c.getWidth(), this.f4044c.getHeight()));
        super.dispatchDraw(canvas);
        ArrayList arrayList = this.f4045d;
        int size = arrayList == null ? 0 : arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Drawable) this.f4045d.get(i)).draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        if (this.f4043b != null) {
            rect.offset(iArr[0], iArr[1]);
            ViewGroup viewGroup = this.f4043b;
            if (!(viewGroup instanceof ViewGroup)) {
                invalidate(rect);
                return null;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            this.f4044c.getLocationOnScreen(iArr3);
            int[] iArr4 = {iArr3[0] - iArr2[0], iArr3[1] - iArr2[1]};
            rect.offset(iArr4[0], iArr4[1]);
            return super.invalidateChildInParent(iArr, rect);
        }
        return null;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidate(drawable.getBounds());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        ArrayList arrayList;
        return super.verifyDrawable(drawable) || ((arrayList = this.f4045d) != null && arrayList.contains(drawable));
    }
}