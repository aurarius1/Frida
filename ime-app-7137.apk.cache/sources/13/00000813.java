package p093c.p145g.p146a.p147a.p159k0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.atomic.AtomicInteger;
import p010b.p037h.p043c.C0439i;
import p010b.p037h.p043c.C0440j;
import p010b.p037h.p043c.C0444n;
import p010b.p046j.p058l.AbstractC0605j0;
import p093c.p145g.p146a.p147a.AbstractC1840f;
import p093c.p145g.p146a.p147a.AbstractC1868h;
import p093c.p145g.p146a.p147a.AbstractC1940l;
import p093c.p145g.p146a.p147a.p154g0.C1851i;
import p093c.p145g.p146a.p147a.p154g0.C1852j;
import p093c.p145g.p146a.p147a.p154g0.C1855m;
import p093c.p145g.p146a.p147a.p154g0.C1856n;

/* renamed from: c.g.a.a.k0.i */
/* loaded from: classes.dex */
public abstract class AbstractC1935i extends ConstraintLayout {

    /* renamed from: s */
    public final Runnable f5875s;

    /* renamed from: t */
    public int f5876t;

    /* renamed from: u */
    public C1851i f5877u;

    public AbstractC1935i(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(AbstractC1868h.material_radial_view_group, this);
        C1851i c1851i = new C1851i();
        this.f5877u = c1851i;
        C1852j c1852j = new C1852j(0.5f);
        C1856n c1856n = c1851i.f5657d.f5633a;
        c1856n.getClass();
        C1855m c1855m = new C1855m(c1856n);
        c1855m.f5684e = c1852j;
        c1855m.f5685f = c1852j;
        c1855m.f5686g = c1852j;
        c1855m.f5687h = c1852j;
        c1851i.f5657d.f5633a = c1855m.m727a();
        c1851i.invalidateSelf();
        this.f5877u.m737p(ColorStateList.valueOf(-1));
        C1851i c1851i2 = this.f5877u;
        AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(c1851i2);
        } else {
            setBackgroundDrawable(c1851i2);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1940l.RadialViewGroup, i, 0);
        this.f5876t = obtainStyledAttributes.getDimensionPixelSize(AbstractC1940l.RadialViewGroup_materialCircleRadius, 0);
        this.f5875s = new RunnableC1934h(this);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(AbstractC0605j0.m2251g());
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f5875s);
            handler.post(this.f5875s);
        }
    }

    /* renamed from: h */
    public void m675h() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if ("skip".equals(getChildAt(i2).getTag())) {
                i++;
            }
        }
        C0444n c0444n = new C0444n();
        c0444n.m2452b(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            int i4 = AbstractC1840f.circle_center;
            if (id != i4 && !"skip".equals(childAt.getTag())) {
                int id2 = childAt.getId();
                int i5 = this.f5876t;
                if (!c0444n.f2406e.containsKey(Integer.valueOf(id2))) {
                    c0444n.f2406e.put(Integer.valueOf(id2), new C0439i());
                }
                C0440j c0440j = ((C0439i) c0444n.f2406e.get(Integer.valueOf(id2))).f2309d;
                c0440j.f2373y = i4;
                c0440j.f2374z = i5;
                c0440j.f2313A = f;
                f = (360.0f / (childCount - i)) + f;
            }
        }
        c0444n.m2453a(this, true);
        setConstraintSet(null);
        requestLayout();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m675h();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f5875s);
            handler.post(this.f5875s);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f5877u.m737p(ColorStateList.valueOf(i));
    }
}