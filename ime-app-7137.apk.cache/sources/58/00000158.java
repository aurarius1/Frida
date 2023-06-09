package p010b.p016c.p026q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.AppCompatSpinner$SavedState;
import p010b.p016c.AbstractC0075a;
import p010b.p016c.AbstractC0081g;
import p010b.p016c.AbstractC0084j;
import p010b.p016c.p018l.p019a.AbstractC0142b;
import p010b.p016c.p024p.C0163d;
import p010b.p046j.p058l.InterfaceC0630w;

/* renamed from: b.c.q.a1 */
/* loaded from: classes.dex */
public class C0212a1 extends Spinner implements InterfaceC0630w {

    /* renamed from: b */
    public static final int[] f1447b = {16843505};

    /* renamed from: c */
    public final C0333x f1448c;

    /* renamed from: d */
    public final Context f1449d;

    /* renamed from: e */
    public AbstractView$OnTouchListenerC0330w1 f1450e;

    /* renamed from: f */
    public SpinnerAdapter f1451f;

    /* renamed from: g */
    public final boolean f1452g;

    /* renamed from: h */
    public InterfaceC0344z0 f1453h;

    /* renamed from: i */
    public int f1454i;

    /* renamed from: j */
    public final Rect f1455j;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
        if (r5 == null) goto L13;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0212a1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        TypedArray typedArray;
        int i = AbstractC0075a.spinnerStyle;
        this.f1455j = new Rect();
        AbstractC0282m3.m2793a(this, getContext());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0084j.Spinner, i, 0);
        this.f1448c = new C0333x(this);
        int resourceId = obtainStyledAttributes.getResourceId(AbstractC0084j.Spinner_popupTheme, 0);
        if (resourceId != 0) {
            this.f1449d = new C0163d(context, resourceId);
        } else {
            this.f1449d = context;
        }
        TypedArray typedArray2 = null;
        int i2 = -1;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, f1447b, i, 0);
        } catch (Exception unused) {
            typedArray = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (typedArray.hasValue(0)) {
                i2 = typedArray.getInt(0, 0);
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
            typedArray2 = typedArray;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        typedArray.recycle();
        if (i2 == 0) {
            DialogInterface$OnClickListenerC0309s0 dialogInterface$OnClickListenerC0309s0 = new DialogInterface$OnClickListenerC0309s0(this);
            this.f1453h = dialogInterface$OnClickListenerC0309s0;
            dialogInterface$OnClickListenerC0309s0.mo2700l(obtainStyledAttributes.getString(AbstractC0084j.Spinner_android_prompt));
        } else if (i2 == 1) {
            C0334x0 c0334x0 = new C0334x0(this, this.f1449d, attributeSet, i);
            C0302q3 m2740r = C0302q3.m2740r(this.f1449d, attributeSet, AbstractC0084j.Spinner, i, 0);
            this.f1454i = m2740r.m2746l(AbstractC0084j.Spinner_android_dropDownWidth, -2);
            c0334x0.f1558D.setBackgroundDrawable(m2740r.m2751g(AbstractC0084j.Spinner_android_popupBackground));
            c0334x0.f1805E = obtainStyledAttributes.getString(AbstractC0084j.Spinner_android_prompt);
            m2740r.f1740b.recycle();
            this.f1453h = c0334x0;
            this.f1450e = new C0299q0(this, this, c0334x0);
        }
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(AbstractC0084j.Spinner_android_entries);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367048, textArray);
            arrayAdapter.setDropDownViewResource(AbstractC0081g.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        obtainStyledAttributes.recycle();
        this.f1452g = true;
        SpinnerAdapter spinnerAdapter = this.f1451f;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f1451f = null;
        }
        this.f1448c.m2725d(attributeSet, i);
    }

    /* renamed from: a */
    public int m2884a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f1455j);
            Rect rect = this.f1455j;
            return i2 + rect.left + rect.right;
        }
        return i2;
    }

    /* renamed from: b */
    public void m2883b() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f1453h.mo2704d(getTextDirection(), getTextAlignment());
        } else {
            this.f1453h.mo2704d(-1, -1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0333x c0333x = this.f1448c;
        if (c0333x != null) {
            c0333x.m2728a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC0344z0 interfaceC0344z0 = this.f1453h;
        if (interfaceC0344z0 != null) {
            return interfaceC0344z0.mo2705c();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC0344z0 interfaceC0344z0 = this.f1453h;
        if (interfaceC0344z0 != null) {
            return interfaceC0344z0.mo2703g();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f1453h != null) {
            return this.f1454i;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public final InterfaceC0344z0 getInternalPopup() {
        return this.f1453h;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC0344z0 interfaceC0344z0 = this.f1453h;
        if (interfaceC0344z0 != null) {
            return interfaceC0344z0.mo2702i();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1449d;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC0344z0 interfaceC0344z0 = this.f1453h;
        return interfaceC0344z0 != null ? interfaceC0344z0.mo2701j() : super.getPrompt();
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public ColorStateList getSupportBackgroundTintList() {
        C0333x c0333x = this.f1448c;
        if (c0333x != null) {
            return c0333x.m2727b();
        }
        return null;
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0333x c0333x = this.f1448c;
        if (c0333x != null) {
            return c0333x.m2726c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0344z0 interfaceC0344z0 = this.f1453h;
        if (interfaceC0344z0 == null || !interfaceC0344z0.mo2706b()) {
            return;
        }
        this.f1453h.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1453h == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m2884a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = (AppCompatSpinner$SavedState) parcelable;
        super.onRestoreInstanceState(appCompatSpinner$SavedState.getSuperState());
        if (!appCompatSpinner$SavedState.f243b || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC0304r0(this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = new AppCompatSpinner$SavedState(super.onSaveInstanceState());
        InterfaceC0344z0 interfaceC0344z0 = this.f1453h;
        appCompatSpinner$SavedState.f243b = interfaceC0344z0 != null && interfaceC0344z0.mo2706b();
        return appCompatSpinner$SavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnTouchListenerC0330w1 abstractView$OnTouchListenerC0330w1 = this.f1450e;
        if (abstractView$OnTouchListenerC0330w1 == null || !abstractView$OnTouchListenerC0330w1.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        InterfaceC0344z0 interfaceC0344z0 = this.f1453h;
        if (interfaceC0344z0 != null) {
            if (interfaceC0344z0.mo2706b()) {
                return true;
            }
            m2883b();
            return true;
        }
        return super.performClick();
    }

    /* JADX DEBUG: Method merged with bridge method */
    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1452g) {
            this.f1451f = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1453h != null) {
            Context context = this.f1449d;
            if (context == null) {
                context = getContext();
            }
            this.f1453h.mo2697o(new C0314t0(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0333x c0333x = this.f1448c;
        if (c0333x != null) {
            c0333x.m2724e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0333x c0333x = this.f1448c;
        if (c0333x != null) {
            c0333x.m2723f(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC0344z0 interfaceC0344z0 = this.f1453h;
        if (interfaceC0344z0 != null) {
            interfaceC0344z0.mo2696p(i);
            this.f1453h.mo2707a(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC0344z0 interfaceC0344z0 = this.f1453h;
        if (interfaceC0344z0 != null) {
            interfaceC0344z0.mo2698n(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f1453h != null) {
            this.f1454i = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC0344z0 interfaceC0344z0 = this.f1453h;
        if (interfaceC0344z0 != null) {
            interfaceC0344z0.mo2699m(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(AbstractC0142b.m3000b(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC0344z0 interfaceC0344z0 = this.f1453h;
        if (interfaceC0344z0 != null) {
            interfaceC0344z0.mo2700l(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0333x c0333x = this.f1448c;
        if (c0333x != null) {
            c0333x.m2721h(colorStateList);
        }
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0333x c0333x = this.f1448c;
        if (c0333x != null) {
            c0333x.m2720i(mode);
        }
    }
}