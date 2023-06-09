package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p010b.p016c.AbstractC0084j;
import p010b.p016c.p026q.InterfaceC0251g4;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: b */
    public int f394b;

    /* renamed from: c */
    public int f395c;

    /* renamed from: d */
    public WeakReference f396d;

    /* renamed from: e */
    public LayoutInflater f397e;

    /* renamed from: f */
    public InterfaceC0251g4 f398f;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f394b = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0084j.ViewStubCompat, 0, 0);
        this.f395c = obtainStyledAttributes.getResourceId(AbstractC0084j.ViewStubCompat_android_inflatedId, -1);
        this.f394b = obtainStyledAttributes.getResourceId(AbstractC0084j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(AbstractC0084j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public View m3373a() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.f394b != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.f397e;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(this.f394b, viewGroup, false);
                int i = this.f395c;
                if (i != -1) {
                    inflate.setId(i);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.f396d = new WeakReference(inflate);
                InterfaceC0251g4 interfaceC0251g4 = this.f398f;
                if (interfaceC0251g4 != null) {
                    interfaceC0251g4.m2818a(this, inflate);
                }
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f395c;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f397e;
    }

    public int getLayoutResource() {
        return this.f394b;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f395c = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f397e = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f394b = i;
    }

    public void setOnInflateListener(InterfaceC0251g4 interfaceC0251g4) {
        this.f398f = interfaceC0251g4;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.f396d;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m3373a();
        }
    }
}