package p010b.p067m.p068d;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.C0573c1;
import p010b.p067m.AbstractC0666b;
import p010b.p067m.AbstractC0667c;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.m.d.l0 */
/* loaded from: classes.dex */
public final class C0713l0 extends FrameLayout {

    /* renamed from: b */
    public ArrayList f3048b;

    /* renamed from: c */
    public ArrayList f3049c;

    /* renamed from: d */
    public View.OnApplyWindowInsetsListener f3050d;

    /* renamed from: e */
    public boolean f3051e;

    public C0713l0(Context context, AttributeSet attributeSet, C0690f1 c0690f1) {
        super(context, attributeSet);
        View view;
        this.f3051e = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0667c.FragmentContainerView);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(AbstractC0667c.FragmentContainerView_android_name) : classAttribute;
        String string = obtainStyledAttributes.getString(AbstractC0667c.FragmentContainerView_android_tag);
        obtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0763z m2087J = c0690f1.m2087J(id);
        if (classAttribute != null && m2087J == null) {
            if (id <= 0) {
                throw new IllegalStateException(AbstractC1124a.m1189g("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? AbstractC1124a.m1190f(" with tag ", string) : ""));
            }
            C0752v0 m2081P = c0690f1.m2081P();
            context.getClassLoader();
            AbstractComponentCallbacksC0763z m1936a = m2081P.m1936a(classAttribute);
            m1936a.m1875e0(attributeSet, null);
            C0668a c0668a = new C0668a(c0690f1);
            c0668a.f2912p = true;
            m1936a.f3215H = this;
            c0668a.m2116h(getId(), m1936a, string, 1);
            c0668a.m2117g();
        }
        Iterator it = ((ArrayList) c0690f1.f2969c.m1983f()).iterator();
        while (it.hasNext()) {
            C0718m1 c0718m1 = (C0718m1) it.next();
            AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = c0718m1.f3061c;
            if (abstractComponentCallbacksC0763z.f3253z == getId() && (view = abstractComponentCallbacksC0763z.f3216I) != null && view.getParent() == null) {
                abstractComponentCallbacksC0763z.f3215H = this;
                c0718m1.m2006b();
            }
        }
    }

    /* renamed from: a */
    public final void m2011a(View view) {
        ArrayList arrayList = this.f3049c;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f3048b == null) {
            this.f3048b = new ArrayList();
        }
        this.f3048b.add(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(AbstractC0666b.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0763z ? (AbstractComponentCallbacksC0763z) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        Object tag = view.getTag(AbstractC0666b.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0763z ? (AbstractComponentCallbacksC0763z) tag : null) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C0573c1 m2317j = C0573c1.m2317j(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f3050d;
        C0573c1 m2318i = onApplyWindowInsetsListener != null ? C0573c1.m2318i(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : AbstractC0605j0.m2279D(this, m2317j);
        if (!m2318i.m2321f()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                AbstractC0605j0.m2253e(getChildAt(i), m2318i);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.f3051e && this.f3048b != null) {
            for (int i = 0; i < this.f3048b.size(); i++) {
                super.drawChild(canvas, (View) this.f3048b.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList arrayList;
        if (!this.f3051e || (arrayList = this.f3048b) == null || arrayList.size() <= 0 || !this.f3048b.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList arrayList = this.f3049c;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList arrayList2 = this.f3048b;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f3051e = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m2011a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        if (z) {
            m2011a(view);
        }
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        m2011a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        m2011a(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        m2011a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m2011a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            m2011a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    public void setDrawDisappearingViewsLast(boolean z) {
        this.f3051e = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT >= 18) {
            throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
        }
        super.setLayoutTransition(layoutTransition);
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f3050d = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f3049c == null) {
                this.f3049c = new ArrayList();
            }
            this.f3049c.add(view);
        }
        super.startViewTransition(view);
    }
}