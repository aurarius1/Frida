package p010b.p016c.p026q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.p018l.p019a.AbstractC0142b;
import p010b.p046j.p048e.p049b.C0497c;
import p010b.p046j.p050f.AbstractC0511f;
import p010b.p046j.p050f.C0520o;
import p010b.p046j.p056j.AbstractC0553e;
import p010b.p046j.p056j.C0552d;
import p010b.p046j.p058l.InterfaceC0630w;
import p010b.p046j.p061m.InterfaceC0640c;
import p010b.p046j.p061m.InterfaceC0648k;

/* renamed from: b.c.q.f1 */
/* loaded from: classes.dex */
public class C0242f1 extends TextView implements InterfaceC0630w, InterfaceC0648k, InterfaceC0640c {

    /* renamed from: b */
    public final C0333x f1547b;

    /* renamed from: c */
    public final C0236e1 f1548c;

    /* renamed from: d */
    public final C0218b1 f1549d;

    /* renamed from: e */
    public boolean f1550e;

    /* renamed from: f */
    public Future f1551f;

    public C0242f1(Context context) {
        this(context, null, 16842884);
    }

    public C0242f1(Context context, AttributeSet attributeSet, int i) {
        super(C0287n3.m2787a(context), attributeSet, i);
        this.f1550e = false;
        AbstractC0282m3.m2793a(this, getContext());
        C0333x c0333x = new C0333x(this);
        this.f1547b = c0333x;
        c0333x.m2725d(attributeSet, i);
        C0236e1 c0236e1 = new C0236e1(this);
        this.f1548c = c0236e1;
        c0236e1.m2849e(attributeSet, i);
        c0236e1.m2852b();
        this.f1549d = new C0218b1(this);
    }

    /* renamed from: c */
    public final void m2837c() {
        Future future = this.f1551f;
        if (future != null) {
            try {
                this.f1551f = null;
                AbstractC0553e abstractC0553e = (AbstractC0553e) future.get();
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                AbstractC0022t.m3523K(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0333x c0333x = this.f1547b;
        if (c0333x != null) {
            c0333x.m2728a();
        }
        C0236e1 c0236e1 = this.f1548c;
        if (c0236e1 != null) {
            c0236e1.m2852b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC0640c.f2820a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0236e1 c0236e1 = this.f1548c;
        if (c0236e1 != null) {
            return Math.round(c0236e1.f1531i.f1618h);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (InterfaceC0640c.f2820a) {
            return super.getAutoSizeMinTextSize();
        }
        C0236e1 c0236e1 = this.f1548c;
        if (c0236e1 != null) {
            return Math.round(c0236e1.f1531i.f1617g);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (InterfaceC0640c.f2820a) {
            return super.getAutoSizeStepGranularity();
        }
        C0236e1 c0236e1 = this.f1548c;
        if (c0236e1 != null) {
            return Math.round(c0236e1.f1531i.f1616f);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (InterfaceC0640c.f2820a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0236e1 c0236e1 = this.f1548c;
        return c0236e1 != null ? c0236e1.f1531i.f1619i : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (InterfaceC0640c.f2820a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0236e1 c0236e1 = this.f1548c;
        if (c0236e1 != null) {
            return c0236e1.f1531i.f1614d;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public ColorStateList getSupportBackgroundTintList() {
        C0333x c0333x = this.f1547b;
        if (c0333x != null) {
            return c0333x.m2727b();
        }
        return null;
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0333x c0333x = this.f1547b;
        if (c0333x != null) {
            return c0333x.m2726c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        C0292o3 c0292o3 = this.f1548c.f1530h;
        if (c0292o3 != null) {
            return c0292o3.f1678a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        C0292o3 c0292o3 = this.f1548c.f1530h;
        if (c0292o3 != null) {
            return c0292o3.f1679b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m2837c();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0218b1 c0218b1;
        return (Build.VERSION.SDK_INT >= 28 || (c0218b1 = this.f1549d) == null) ? super.getTextClassifier() : c0218b1.m2872a();
    }

    public C0552d getTextMetricsParamsCompat() {
        return AbstractC0022t.m3523K(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1548c.m2847g(this, onCreateInputConnection, editorInfo);
        AbstractC0022t.m3513U(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0236e1 c0236e1 = this.f1548c;
        if (c0236e1 == null || InterfaceC0640c.f2820a) {
            return;
        }
        c0236e1.f1531i.m2809b();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        m2837c();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0236e1 c0236e1 = this.f1548c;
        if (c0236e1 == null || InterfaceC0640c.f2820a || !c0236e1.m2850d()) {
            return;
        }
        this.f1548c.f1531i.m2809b();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (InterfaceC0640c.f2820a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0236e1 c0236e1 = this.f1548c;
        if (c0236e1 != null) {
            c0236e1.m2846h(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (InterfaceC0640c.f2820a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0236e1 c0236e1 = this.f1548c;
        if (c0236e1 != null) {
            c0236e1.m2845i(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (InterfaceC0640c.f2820a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0236e1 c0236e1 = this.f1548c;
        if (c0236e1 != null) {
            c0236e1.m2844j(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0333x c0333x = this.f1547b;
        if (c0333x != null) {
            c0333x.m2724e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0333x c0333x = this.f1547b;
        if (c0333x != null) {
            c0333x.m2723f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0236e1 c0236e1 = this.f1548c;
        if (c0236e1 != null) {
            c0236e1.m2852b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0236e1 c0236e1 = this.f1548c;
        if (c0236e1 != null) {
            c0236e1.m2852b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? AbstractC0142b.m3000b(context, i) : null, i2 != 0 ? AbstractC0142b.m3000b(context, i2) : null, i3 != 0 ? AbstractC0142b.m3000b(context, i3) : null, i4 != 0 ? AbstractC0142b.m3000b(context, i4) : null);
        C0236e1 c0236e1 = this.f1548c;
        if (c0236e1 != null) {
            c0236e1.m2852b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? AbstractC0142b.m3000b(context, i) : null, i2 != 0 ? AbstractC0142b.m3000b(context, i2) : null, i3 != 0 ? AbstractC0142b.m3000b(context, i3) : null, i4 != 0 ? AbstractC0142b.m3000b(context, i4) : null);
        C0236e1 c0236e1 = this.f1548c;
        if (c0236e1 != null) {
            c0236e1.m2852b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0022t.m3464v0(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            AbstractC0022t.m3502c0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            AbstractC0022t.m3496f0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        AbstractC0022t.m3492h0(this, i);
    }

    public void setPrecomputedText(AbstractC0553e abstractC0553e) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC0022t.m3523K(this);
        throw null;
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0333x c0333x = this.f1547b;
        if (c0333x != null) {
            c0333x.m2721h(colorStateList);
        }
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0333x c0333x = this.f1547b;
        if (c0333x != null) {
            c0333x.m2720i(mode);
        }
    }

    @Override // p010b.p046j.p061m.InterfaceC0648k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1548c.m2843k(colorStateList);
        this.f1548c.m2852b();
    }

    @Override // p010b.p046j.p061m.InterfaceC0648k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1548c.m2842l(mode);
        this.f1548c.m2852b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0236e1 c0236e1 = this.f1548c;
        if (c0236e1 != null) {
            c0236e1.m2848f(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0218b1 c0218b1;
        if (Build.VERSION.SDK_INT < 28 && (c0218b1 = this.f1549d) != null) {
            c0218b1.f1482b = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future future) {
        this.f1551f = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0552d c0552d) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18) {
            TextDirectionHeuristic textDirectionHeuristic = c0552d.f2643b;
            int i2 = 1;
            if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL && textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                    i2 = 2;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                    i2 = 3;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                    i2 = 4;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                    i2 = 5;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                    i2 = 6;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                    i2 = 7;
                }
            }
            setTextDirection(i2);
        }
        if (i < 23) {
            float textScaleX = c0552d.f2642a.getTextScaleX();
            getPaint().set(c0552d.f2642a);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
            return;
        }
        getPaint().set(c0552d.f2642a);
        setBreakStrategy(c0552d.f2644c);
        setHyphenationFrequency(c0552d.f2645d);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z = InterfaceC0640c.f2820a;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        C0236e1 c0236e1 = this.f1548c;
        if (c0236e1 == null || z || c0236e1.m2850d()) {
            return;
        }
        c0236e1.f1531i.m2804g(i, f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
        if (r0 != null) goto L22;
     */
    @Override // android.widget.TextView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setTypeface(Typeface typeface, int i) {
        if (this.f1550e) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            C0520o c0520o = AbstractC0511f.f2550a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            if (Build.VERSION.SDK_INT < 21) {
                C0520o c0520o2 = AbstractC0511f.f2550a;
                c0520o2.getClass();
                long m2356g = C0520o.m2356g(typeface);
                C0497c c0497c = m2356g == 0 ? null : (C0497c) c0520o2.f2568a.get(Long.valueOf(m2356g));
                r0 = c0497c != null ? c0520o2.mo2362a(context, c0497c, context.getResources(), i) : null;
            }
            r0 = Typeface.create(typeface, i);
        }
        this.f1550e = true;
        if (r0 != null) {
            typeface = r0;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f1550e = false;
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0236e1 c0236e1 = this.f1548c;
        if (c0236e1 != null) {
            c0236e1.m2852b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0236e1 c0236e1 = this.f1548c;
        if (c0236e1 != null) {
            c0236e1.m2852b();
        }
    }
}