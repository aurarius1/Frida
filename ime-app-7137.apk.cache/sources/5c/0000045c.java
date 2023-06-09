package p010b.p083u.p084e;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: b.u.e.r1 */
/* loaded from: classes.dex */
public class C0984r1 extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public AbstractC0941g2 f3813a;

    /* renamed from: b */
    public final Rect f3814b;

    /* renamed from: c */
    public boolean f3815c;

    /* renamed from: d */
    public boolean f3816d;

    public C0984r1(int i, int i2) {
        super(i, i2);
        this.f3814b = new Rect();
        this.f3815c = true;
        this.f3816d = false;
    }

    public C0984r1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3814b = new Rect();
        this.f3815c = true;
        this.f3816d = false;
    }

    public C0984r1(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f3814b = new Rect();
        this.f3815c = true;
        this.f3816d = false;
    }

    public C0984r1(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f3814b = new Rect();
        this.f3815c = true;
        this.f3816d = false;
    }

    public C0984r1(C0984r1 c0984r1) {
        super((ViewGroup.LayoutParams) c0984r1);
        this.f3814b = new Rect();
        this.f3815c = true;
        this.f3816d = false;
    }

    /* renamed from: a */
    public int m1473a() {
        return this.f3813a.m1666g();
    }

    /* renamed from: b */
    public boolean m1472b() {
        return this.f3813a.m1656q();
    }

    /* renamed from: c */
    public boolean m1471c() {
        return this.f3813a.m1659n();
    }
}