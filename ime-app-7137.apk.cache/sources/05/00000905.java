package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p016c.p018l.p019a.AbstractC0142b;
import p010b.p016c.p026q.AbstractC0290o1;
import p010b.p016c.p026q.C0229d0;
import p010b.p016c.p026q.C0242f1;
import p010b.p016c.p026q.C0302q3;
import p010b.p046j.p047d.AbstractC0472e;
import p010b.p046j.p050f.AbstractC0506a;
import p010b.p046j.p056j.C0550b;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p086w.AbstractC1077v0;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p145g.p146a.p147a.AbstractC1804b;
import p093c.p145g.p146a.p147a.AbstractC1827c;
import p093c.p145g.p146a.p147a.AbstractC1829d;
import p093c.p145g.p146a.p147a.AbstractC1840f;
import p093c.p145g.p146a.p147a.AbstractC1868h;
import p093c.p145g.p146a.p147a.AbstractC1924j;
import p093c.p145g.p146a.p147a.AbstractC1926k;
import p093c.p145g.p146a.p147a.AbstractC1940l;
import p093c.p145g.p146a.p147a.p149b0.AbstractC1809e;
import p093c.p145g.p146a.p147a.p149b0.AbstractC1822r;
import p093c.p145g.p146a.p147a.p149b0.C1807c;
import p093c.p145g.p146a.p147a.p149b0.C1808d;
import p093c.p145g.p146a.p147a.p151d0.C1830a;
import p093c.p145g.p146a.p147a.p151d0.C1833d;
import p093c.p145g.p146a.p147a.p154g0.C1851i;
import p093c.p145g.p146a.p147a.p154g0.C1855m;
import p093c.p145g.p146a.p147a.p154g0.C1856n;
import p093c.p145g.p146a.p147a.p156i0.AbstractC1879a0;
import p093c.p145g.p146a.p147a.p156i0.C1883c0;
import p093c.p145g.p146a.p147a.p156i0.C1889f0;
import p093c.p145g.p146a.p147a.p156i0.C1898k;
import p093c.p145g.p146a.p147a.p156i0.C1900l;
import p093c.p145g.p146a.p147a.p156i0.C1901l0;
import p093c.p145g.p146a.p147a.p156i0.C1902m;
import p093c.p145g.p146a.p147a.p156i0.C1903m0;
import p093c.p145g.p146a.p147a.p156i0.C1909p0;
import p093c.p145g.p146a.p147a.p156i0.C1911q0;
import p093c.p145g.p146a.p147a.p156i0.C1917t0;
import p093c.p145g.p146a.p147a.p156i0.C1923z;
import p093c.p145g.p146a.p147a.p156i0.InterfaceC1913r0;
import p093c.p145g.p146a.p147a.p156i0.InterfaceC1915s0;
import p093c.p145g.p146a.p147a.p156i0.RunnableC1905n0;
import p093c.p145g.p146a.p147a.p156i0.RunnableC1907o0;
import p093c.p145g.p146a.p147a.p157j0.p158a.AbstractC1925a;
import p093c.p145g.p146a.p147a.p161m.AbstractC1946a;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: b */
    public static final int f6839b = AbstractC1926k.Widget_Design_TextInputLayout;

    /* renamed from: A */
    public boolean f6840A;

    /* renamed from: A0 */
    public int f6841A0;

    /* renamed from: B */
    public CharSequence f6842B;

    /* renamed from: B0 */
    public int f6843B0;

    /* renamed from: C */
    public boolean f6844C;

    /* renamed from: C0 */
    public int f6845C0;

    /* renamed from: D */
    public C1851i f6846D;

    /* renamed from: D0 */
    public int f6847D0;

    /* renamed from: E */
    public C1851i f6848E;

    /* renamed from: E0 */
    public boolean f6849E0;

    /* renamed from: F */
    public C1856n f6850F;

    /* renamed from: F0 */
    public final C1808d f6851F0;

    /* renamed from: G */
    public final int f6852G;

    /* renamed from: G0 */
    public boolean f6853G0;

    /* renamed from: H */
    public int f6854H;

    /* renamed from: H0 */
    public boolean f6855H0;

    /* renamed from: I */
    public int f6856I;

    /* renamed from: I0 */
    public ValueAnimator f6857I0;

    /* renamed from: J */
    public int f6858J;

    /* renamed from: J0 */
    public boolean f6859J0;

    /* renamed from: K */
    public int f6860K;

    /* renamed from: K0 */
    public boolean f6861K0;

    /* renamed from: L */
    public int f6862L;

    /* renamed from: M */
    public int f6863M;

    /* renamed from: N */
    public int f6864N;

    /* renamed from: O */
    public final Rect f6865O;

    /* renamed from: P */
    public final Rect f6866P;

    /* renamed from: Q */
    public final RectF f6867Q;

    /* renamed from: R */
    public Typeface f6868R;

    /* renamed from: S */
    public final CheckableImageButton f6869S;

    /* renamed from: T */
    public ColorStateList f6870T;

    /* renamed from: U */
    public boolean f6871U;

    /* renamed from: V */
    public PorterDuff.Mode f6872V;

    /* renamed from: W */
    public boolean f6873W;

    /* renamed from: a0 */
    public Drawable f6874a0;

    /* renamed from: b0 */
    public int f6875b0;

    /* renamed from: c */
    public final FrameLayout f6876c;

    /* renamed from: c0 */
    public View.OnLongClickListener f6877c0;

    /* renamed from: d */
    public final LinearLayout f6878d;

    /* renamed from: d0 */
    public final LinkedHashSet f6879d0;

    /* renamed from: e */
    public final LinearLayout f6880e;

    /* renamed from: e0 */
    public int f6881e0;

    /* renamed from: f */
    public final FrameLayout f6882f;

    /* renamed from: f0 */
    public final SparseArray f6883f0;

    /* renamed from: g */
    public EditText f6884g;

    /* renamed from: g0 */
    public final CheckableImageButton f6885g0;

    /* renamed from: h */
    public CharSequence f6886h;

    /* renamed from: h0 */
    public final LinkedHashSet f6887h0;

    /* renamed from: i */
    public final C1883c0 f6888i;

    /* renamed from: i0 */
    public ColorStateList f6889i0;

    /* renamed from: j */
    public boolean f6890j;

    /* renamed from: j0 */
    public boolean f6891j0;

    /* renamed from: k */
    public int f6892k;

    /* renamed from: k0 */
    public PorterDuff.Mode f6893k0;

    /* renamed from: l */
    public boolean f6894l;

    /* renamed from: l0 */
    public boolean f6895l0;

    /* renamed from: m */
    public TextView f6896m;

    /* renamed from: m0 */
    public Drawable f6897m0;

    /* renamed from: n */
    public int f6898n;

    /* renamed from: n0 */
    public int f6899n0;

    /* renamed from: o */
    public int f6900o;

    /* renamed from: o0 */
    public Drawable f6901o0;

    /* renamed from: p */
    public CharSequence f6902p;

    /* renamed from: p0 */
    public View.OnLongClickListener f6903p0;

    /* renamed from: q */
    public boolean f6904q;

    /* renamed from: q0 */
    public View.OnLongClickListener f6905q0;

    /* renamed from: r */
    public TextView f6906r;

    /* renamed from: r0 */
    public final CheckableImageButton f6907r0;

    /* renamed from: s */
    public ColorStateList f6908s;

    /* renamed from: s0 */
    public ColorStateList f6909s0;

    /* renamed from: t */
    public int f6910t;

    /* renamed from: t0 */
    public ColorStateList f6911t0;

    /* renamed from: u */
    public ColorStateList f6912u;

    /* renamed from: u0 */
    public ColorStateList f6913u0;

    /* renamed from: v */
    public ColorStateList f6914v;

    /* renamed from: v0 */
    public int f6915v0;

    /* renamed from: w */
    public CharSequence f6916w;

    /* renamed from: w0 */
    public int f6917w0;

    /* renamed from: x */
    public final TextView f6918x;

    /* renamed from: x0 */
    public int f6919x0;

    /* renamed from: y */
    public CharSequence f6920y;

    /* renamed from: y0 */
    public ColorStateList f6921y0;

    /* renamed from: z */
    public final TextView f6922z;

    /* renamed from: z0 */
    public int f6923z0;

    /* loaded from: classes.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C1917t0();

        /* renamed from: d */
        public CharSequence f6924d;

        /* renamed from: e */
        public boolean f6925e;

        /* renamed from: f */
        public CharSequence f6926f;

        /* renamed from: g */
        public CharSequence f6927g;

        /* renamed from: h */
        public CharSequence f6928h;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f6924d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f6925e = parcel.readInt() == 1;
            this.f6926f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f6927g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f6928h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder m1187i = AbstractC1124a.m1187i("TextInputLayout.SavedState{");
            m1187i.append(Integer.toHexString(System.identityHashCode(this)));
            m1187i.append(" error=");
            m1187i.append((Object) this.f6924d);
            m1187i.append(" hint=");
            m1187i.append((Object) this.f6926f);
            m1187i.append(" helperText=");
            m1187i.append((Object) this.f6927g);
            m1187i.append(" placeholderText=");
            m1187i.append((Object) this.f6928h);
            m1187i.append("}");
            return m1187i.toString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f511c, i);
            TextUtils.writeToParcel(this.f6924d, parcel, i);
            parcel.writeInt(this.f6925e ? 1 : 0);
            TextUtils.writeToParcel(this.f6926f, parcel, i);
            TextUtils.writeToParcel(this.f6927g, parcel, i);
            TextUtils.writeToParcel(this.f6928h, parcel, i);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v13, resolved type: b.c.q.q3 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v4, resolved type: android.view.LayoutInflater */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0597  */
    /* JADX WARN: Type inference failed for: r2v157 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(AbstractC1925a.m676a(context, attributeSet, r8, r9), attributeSet, r8);
        int i;
        ?? r2;
        int i2;
        AttributeSet attributeSet2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int colorForState;
        int i12 = AbstractC1804b.textInputStyle;
        int i13 = f6839b;
        this.f6888i = new C1883c0(this);
        this.f6865O = new Rect();
        this.f6866P = new Rect();
        this.f6867Q = new RectF();
        this.f6879d0 = new LinkedHashSet();
        this.f6881e0 = 0;
        this.f6883f0 = new SparseArray();
        this.f6887h0 = new LinkedHashSet();
        C1808d c1808d = new C1808d(this);
        this.f6851F0 = c1808d;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f6876c = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(frameLayout);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f6878d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        frameLayout.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(context2);
        this.f6880e = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout.addView(linearLayout2);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f6882f = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        TimeInterpolator timeInterpolator = AbstractC1946a.f5894a;
        c1808d.f5497K = timeInterpolator;
        c1808d.m783k();
        c1808d.f5496J = timeInterpolator;
        c1808d.m783k();
        c1808d.m780n(8388659);
        int[] iArr = AbstractC1940l.TextInputLayout;
        int i14 = AbstractC1940l.TextInputLayout_counterTextAppearance;
        int i15 = AbstractC1940l.TextInputLayout_counterOverflowTextAppearance;
        int i16 = AbstractC1940l.TextInputLayout_errorTextAppearance;
        int i17 = AbstractC1940l.TextInputLayout_helperTextTextAppearance;
        int i18 = AbstractC1940l.TextInputLayout_hintTextAppearance;
        AbstractC1822r.m767a(context2, attributeSet, i12, i13);
        AbstractC1822r.m766b(context2, attributeSet, iArr, i12, i13, i14, i15, i16, i17, i18);
        C0302q3 c0302q3 = new C0302q3(context2, context2.obtainStyledAttributes(attributeSet, iArr, i12, i13));
        this.f6840A = c0302q3.m2757a(AbstractC1940l.TextInputLayout_hintEnabled, true);
        setHint(c0302q3.m2743o(AbstractC1940l.TextInputLayout_android_hint));
        this.f6855H0 = c0302q3.m2757a(AbstractC1940l.TextInputLayout_hintAnimationEnabled, true);
        this.f6853G0 = c0302q3.m2757a(AbstractC1940l.TextInputLayout_expandedHintEnabled, true);
        this.f6850F = C1856n.m719b(context2, attributeSet, i12, i13).m727a();
        this.f6852G = context2.getResources().getDimensionPixelOffset(AbstractC1829d.mtrl_textinput_box_label_cutout_padding);
        this.f6856I = c0302q3.m2753e(AbstractC1940l.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.f6860K = c0302q3.m2752f(AbstractC1940l.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(AbstractC1829d.mtrl_textinput_box_stroke_width_default));
        this.f6862L = c0302q3.m2752f(AbstractC1940l.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(AbstractC1829d.mtrl_textinput_box_stroke_width_focused));
        this.f6858J = this.f6860K;
        float m2754d = c0302q3.m2754d(AbstractC1940l.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float m2754d2 = c0302q3.m2754d(AbstractC1940l.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float m2754d3 = c0302q3.m2754d(AbstractC1940l.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float m2754d4 = c0302q3.m2754d(AbstractC1940l.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        C1856n c1856n = this.f6850F;
        c1856n.getClass();
        C1855m c1855m = new C1855m(c1856n);
        if (m2754d >= 0.0f) {
            c1855m.m722f(m2754d);
        }
        if (m2754d2 >= 0.0f) {
            c1855m.m721g(m2754d2);
        }
        if (m2754d3 >= 0.0f) {
            c1855m.m723e(m2754d3);
        }
        if (m2754d4 >= 0.0f) {
            c1855m.m724d(m2754d4);
        }
        this.f6850F = c1855m.m727a();
        ColorStateList m1261r = AbstractC1077v0.m1261r(context2, c0302q3, AbstractC1940l.TextInputLayout_boxBackgroundColor);
        if (m1261r != null) {
            int defaultColor = m1261r.getDefaultColor();
            this.f6923z0 = defaultColor;
            this.f6864N = defaultColor;
            if (m1261r.isStateful()) {
                this.f6841A0 = m1261r.getColorForState(new int[]{-16842910}, -1);
                i = 2;
                this.f6843B0 = m1261r.getColorForState(new int[]{16842908, 16842910}, -1);
                colorForState = m1261r.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                i = 2;
                this.f6843B0 = this.f6923z0;
                ColorStateList m3001a = AbstractC0142b.m3001a(context2, AbstractC1827c.mtrl_filled_background_color);
                this.f6841A0 = m3001a.getColorForState(new int[]{-16842910}, -1);
                colorForState = m3001a.getColorForState(new int[]{16843623}, -1);
            }
            this.f6845C0 = colorForState;
        } else {
            i = 2;
            this.f6864N = 0;
            this.f6923z0 = 0;
            this.f6841A0 = 0;
            this.f6843B0 = 0;
            this.f6845C0 = 0;
        }
        int i19 = AbstractC1940l.TextInputLayout_android_textColorHint;
        if (c0302q3.m2742p(i19)) {
            ColorStateList m2755c = c0302q3.m2755c(i19);
            this.f6913u0 = m2755c;
            this.f6911t0 = m2755c;
        }
        int i20 = AbstractC1940l.TextInputLayout_boxStrokeColor;
        ColorStateList m1261r2 = AbstractC1077v0.m1261r(context2, c0302q3, i20);
        this.f6919x0 = c0302q3.m2756b(i20, 0);
        this.f6915v0 = AbstractC0472e.m2431b(context2, AbstractC1827c.mtrl_textinput_default_box_stroke_color);
        this.f6847D0 = AbstractC0472e.m2431b(context2, AbstractC1827c.mtrl_textinput_disabled_color);
        this.f6917w0 = AbstractC0472e.m2431b(context2, AbstractC1827c.mtrl_textinput_hovered_box_stroke_color);
        if (m1261r2 != null) {
            setBoxStrokeColorStateList(m1261r2);
        }
        int i21 = AbstractC1940l.TextInputLayout_boxStrokeErrorColor;
        if (c0302q3.m2742p(i21)) {
            setBoxStrokeErrorColor(AbstractC1077v0.m1261r(context2, c0302q3, i21));
        }
        if (c0302q3.m2745m(i18, -1) != -1) {
            r2 = 0;
            setHintTextAppearance(c0302q3.m2745m(i18, 0));
        } else {
            r2 = 0;
        }
        int m2745m = c0302q3.m2745m(i16, r2);
        CharSequence m2743o = c0302q3.m2743o(AbstractC1940l.TextInputLayout_errorContentDescription);
        boolean m2757a = c0302q3.m2757a(AbstractC1940l.TextInputLayout_errorEnabled, r2);
        LayoutInflater from = LayoutInflater.from(getContext());
        int i22 = AbstractC1868h.design_text_input_end_icon;
        CheckableImageButton checkableImageButton = (CheckableImageButton) from.inflate(i22, linearLayout2, (boolean) r2);
        this.f6907r0 = checkableImageButton;
        checkableImageButton.setId(AbstractC1840f.text_input_error_icon);
        checkableImageButton.setVisibility(8);
        if (AbstractC1077v0.m1303A(context2)) {
            AbstractC0022t.m3488j0((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), r2);
        }
        int i23 = AbstractC1940l.TextInputLayout_errorIconDrawable;
        if (c0302q3.m2742p(i23)) {
            setErrorIconDrawable(c0302q3.m2751g(i23));
        }
        int i24 = AbstractC1940l.TextInputLayout_errorIconTint;
        if (c0302q3.m2742p(i24)) {
            setErrorIconTintList(AbstractC1077v0.m1261r(context2, c0302q3, i24));
        }
        int i25 = AbstractC1940l.TextInputLayout_errorIconTintMode;
        if (c0302q3.m2742p(i25)) {
            setErrorIconTintMode(AbstractC1077v0.m1291M(c0302q3.m2748j(i25, -1), null));
        }
        checkableImageButton.setContentDescription(getResources().getText(AbstractC1924j.error_icon_content_description));
        AbstractC0605j0.m2263T(checkableImageButton, i);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int m2745m2 = c0302q3.m2745m(i17, 0);
        boolean m2757a2 = c0302q3.m2757a(AbstractC1940l.TextInputLayout_helperTextEnabled, false);
        CharSequence m2743o2 = c0302q3.m2743o(AbstractC1940l.TextInputLayout_helperText);
        int m2745m3 = c0302q3.m2745m(AbstractC1940l.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence m2743o3 = c0302q3.m2743o(AbstractC1940l.TextInputLayout_placeholderText);
        int m2745m4 = c0302q3.m2745m(AbstractC1940l.TextInputLayout_prefixTextAppearance, 0);
        CharSequence m2743o4 = c0302q3.m2743o(AbstractC1940l.TextInputLayout_prefixText);
        int m2745m5 = c0302q3.m2745m(AbstractC1940l.TextInputLayout_suffixTextAppearance, 0);
        CharSequence m2743o5 = c0302q3.m2743o(AbstractC1940l.TextInputLayout_suffixText);
        boolean m2757a3 = c0302q3.m2757a(AbstractC1940l.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(c0302q3.m2748j(AbstractC1940l.TextInputLayout_counterMaxLength, -1));
        this.f6900o = c0302q3.m2745m(i14, 0);
        this.f6898n = c0302q3.m2745m(i15, 0);
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(AbstractC1868h.design_text_input_start_icon, (ViewGroup) this.f6878d, false);
        this.f6869S = checkableImageButton2;
        checkableImageButton2.setVisibility(8);
        if (AbstractC1077v0.m1303A(context2)) {
            AbstractC0022t.m3490i0((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams(), 0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        int i26 = AbstractC1940l.TextInputLayout_startIconDrawable;
        if (c0302q3.m2742p(i26)) {
            setStartIconDrawable(c0302q3.m2751g(i26));
            int i27 = AbstractC1940l.TextInputLayout_startIconContentDescription;
            if (c0302q3.m2742p(i27)) {
                setStartIconContentDescription(c0302q3.m2743o(i27));
            }
            setStartIconCheckable(c0302q3.m2757a(AbstractC1940l.TextInputLayout_startIconCheckable, true));
        }
        int i28 = AbstractC1940l.TextInputLayout_startIconTint;
        if (c0302q3.m2742p(i28)) {
            setStartIconTintList(AbstractC1077v0.m1261r(context2, c0302q3, i28));
        }
        int i29 = AbstractC1940l.TextInputLayout_startIconTintMode;
        if (c0302q3.m2742p(i29)) {
            setStartIconTintMode(AbstractC1077v0.m1291M(c0302q3.m2748j(i29, -1), null));
        }
        setBoxBackgroundMode(c0302q3.m2748j(AbstractC1940l.TextInputLayout_boxBackgroundMode, 0));
        this.f6885g0 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(i22, (ViewGroup) this.f6882f, false);
        this.f6882f.addView(this.f6885g0);
        this.f6885g0.setVisibility(8);
        if (AbstractC1077v0.m1303A(context2)) {
            i2 = 0;
            AbstractC0022t.m3488j0((ViewGroup.MarginLayoutParams) this.f6885g0.getLayoutParams(), 0);
        } else {
            i2 = 0;
        }
        this.f6883f0.append(-1, new C1900l(this));
        this.f6883f0.append(i2, new C1889f0(this));
        this.f6883f0.append(1, new C1901l0(this));
        this.f6883f0.append(2, new C1898k(this));
        this.f6883f0.append(3, new C1923z(this));
        int i30 = AbstractC1940l.TextInputLayout_endIconMode;
        if (c0302q3.m2742p(i30)) {
            setEndIconMode(c0302q3.m2748j(i30, 0));
            int i31 = AbstractC1940l.TextInputLayout_endIconDrawable;
            if (c0302q3.m2742p(i31)) {
                setEndIconDrawable(c0302q3.m2751g(i31));
            }
            int i32 = AbstractC1940l.TextInputLayout_endIconContentDescription;
            if (c0302q3.m2742p(i32)) {
                setEndIconContentDescription(c0302q3.m2743o(i32));
            }
            setEndIconCheckable(c0302q3.m2757a(AbstractC1940l.TextInputLayout_endIconCheckable, true));
        } else {
            int i33 = AbstractC1940l.TextInputLayout_passwordToggleEnabled;
            if (c0302q3.m2742p(i33)) {
                setEndIconMode(c0302q3.m2757a(i33, false) ? 1 : 0);
                setEndIconDrawable(c0302q3.m2751g(AbstractC1940l.TextInputLayout_passwordToggleDrawable));
                setEndIconContentDescription(c0302q3.m2743o(AbstractC1940l.TextInputLayout_passwordToggleContentDescription));
                int i34 = AbstractC1940l.TextInputLayout_passwordToggleTint;
                if (c0302q3.m2742p(i34)) {
                    setEndIconTintList(AbstractC1077v0.m1261r(context2, c0302q3, i34));
                }
                int i35 = AbstractC1940l.TextInputLayout_passwordToggleTintMode;
                if (c0302q3.m2742p(i35)) {
                    setEndIconTintMode(AbstractC1077v0.m1291M(c0302q3.m2748j(i35, -1), null));
                }
            }
        }
        if (!c0302q3.m2742p(AbstractC1940l.TextInputLayout_passwordToggleEnabled)) {
            int i36 = AbstractC1940l.TextInputLayout_endIconTint;
            if (c0302q3.m2742p(i36)) {
                setEndIconTintList(AbstractC1077v0.m1261r(context2, c0302q3, i36));
            }
            int i37 = AbstractC1940l.TextInputLayout_endIconTintMode;
            if (c0302q3.m2742p(i37)) {
                attributeSet2 = null;
                setEndIconTintMode(AbstractC1077v0.m1291M(c0302q3.m2748j(i37, -1), null));
                C0242f1 c0242f1 = new C0242f1(context2, attributeSet2, 16842884);
                this.f6918x = c0242f1;
                c0242f1.setId(AbstractC1840f.textinput_prefix_text);
                c0242f1.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                AbstractC0605j0.m2268O(c0242f1, 1);
                this.f6878d.addView(this.f6869S);
                this.f6878d.addView(c0242f1);
                C0242f1 c0242f12 = new C0242f1(context2, null, 16842884);
                this.f6922z = c0242f12;
                c0242f12.setId(AbstractC1840f.textinput_suffix_text);
                c0242f12.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
                AbstractC0605j0.m2268O(c0242f12, 1);
                this.f6880e.addView(c0242f12);
                this.f6880e.addView(this.f6907r0);
                this.f6880e.addView(this.f6882f);
                setHelperTextEnabled(m2757a2);
                setHelperText(m2743o2);
                setHelperTextTextAppearance(m2745m2);
                setErrorEnabled(m2757a);
                setErrorTextAppearance(m2745m);
                setErrorContentDescription(m2743o);
                setCounterTextAppearance(this.f6900o);
                setCounterOverflowTextAppearance(this.f6898n);
                setPlaceholderText(m2743o3);
                setPlaceholderTextAppearance(m2745m3);
                setPrefixText(m2743o4);
                setPrefixTextAppearance(m2745m4);
                setSuffixText(m2743o5);
                setSuffixTextAppearance(m2745m5);
                i3 = AbstractC1940l.TextInputLayout_errorTextColor;
                if (c0302q3.m2742p(i3)) {
                    setErrorTextColor(c0302q3.m2755c(i3));
                }
                i4 = AbstractC1940l.TextInputLayout_helperTextTextColor;
                if (c0302q3.m2742p(i4)) {
                    setHelperTextColor(c0302q3.m2755c(i4));
                }
                i5 = AbstractC1940l.TextInputLayout_hintTextColor;
                if (c0302q3.m2742p(i5)) {
                    setHintTextColor(c0302q3.m2755c(i5));
                }
                i6 = AbstractC1940l.TextInputLayout_counterTextColor;
                if (c0302q3.m2742p(i6)) {
                    setCounterTextColor(c0302q3.m2755c(i6));
                }
                i7 = AbstractC1940l.TextInputLayout_counterOverflowTextColor;
                if (c0302q3.m2742p(i7)) {
                    setCounterOverflowTextColor(c0302q3.m2755c(i7));
                }
                i8 = AbstractC1940l.TextInputLayout_placeholderTextColor;
                if (c0302q3.m2742p(i8)) {
                    setPlaceholderTextColor(c0302q3.m2755c(i8));
                }
                i9 = AbstractC1940l.TextInputLayout_prefixTextColor;
                if (c0302q3.m2742p(i9)) {
                    setPrefixTextColor(c0302q3.m2755c(i9));
                }
                i10 = AbstractC1940l.TextInputLayout_suffixTextColor;
                if (c0302q3.m2742p(i10)) {
                    setSuffixTextColor(c0302q3.m2755c(i10));
                }
                setCounterEnabled(m2757a3);
                setEnabled(c0302q3.m2757a(AbstractC1940l.TextInputLayout_android_enabled, true));
                c0302q3.f1740b.recycle();
                AbstractC0605j0.m2263T(this, 2);
                i11 = Build.VERSION.SDK_INT;
                if (i11 >= 26 || i11 < 26) {
                }
                setImportantForAutofill(1);
                return;
            }
        }
        attributeSet2 = null;
        C0242f1 c0242f13 = new C0242f1(context2, attributeSet2, 16842884);
        this.f6918x = c0242f13;
        c0242f13.setId(AbstractC1840f.textinput_prefix_text);
        c0242f13.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        AbstractC0605j0.m2268O(c0242f13, 1);
        this.f6878d.addView(this.f6869S);
        this.f6878d.addView(c0242f13);
        C0242f1 c0242f122 = new C0242f1(context2, null, 16842884);
        this.f6922z = c0242f122;
        c0242f122.setId(AbstractC1840f.textinput_suffix_text);
        c0242f122.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        AbstractC0605j0.m2268O(c0242f122, 1);
        this.f6880e.addView(c0242f122);
        this.f6880e.addView(this.f6907r0);
        this.f6880e.addView(this.f6882f);
        setHelperTextEnabled(m2757a2);
        setHelperText(m2743o2);
        setHelperTextTextAppearance(m2745m2);
        setErrorEnabled(m2757a);
        setErrorTextAppearance(m2745m);
        setErrorContentDescription(m2743o);
        setCounterTextAppearance(this.f6900o);
        setCounterOverflowTextAppearance(this.f6898n);
        setPlaceholderText(m2743o3);
        setPlaceholderTextAppearance(m2745m3);
        setPrefixText(m2743o4);
        setPrefixTextAppearance(m2745m4);
        setSuffixText(m2743o5);
        setSuffixTextAppearance(m2745m5);
        i3 = AbstractC1940l.TextInputLayout_errorTextColor;
        if (c0302q3.m2742p(i3)) {
        }
        i4 = AbstractC1940l.TextInputLayout_helperTextTextColor;
        if (c0302q3.m2742p(i4)) {
        }
        i5 = AbstractC1940l.TextInputLayout_hintTextColor;
        if (c0302q3.m2742p(i5)) {
        }
        i6 = AbstractC1940l.TextInputLayout_counterTextColor;
        if (c0302q3.m2742p(i6)) {
        }
        i7 = AbstractC1940l.TextInputLayout_counterOverflowTextColor;
        if (c0302q3.m2742p(i7)) {
        }
        i8 = AbstractC1940l.TextInputLayout_placeholderTextColor;
        if (c0302q3.m2742p(i8)) {
        }
        i9 = AbstractC1940l.TextInputLayout_prefixTextColor;
        if (c0302q3.m2742p(i9)) {
        }
        i10 = AbstractC1940l.TextInputLayout_suffixTextColor;
        if (c0302q3.m2742p(i10)) {
        }
        setCounterEnabled(m2757a3);
        setEnabled(c0302q3.m2757a(AbstractC1940l.TextInputLayout_android_enabled, true));
        c0302q3.f1740b.recycle();
        AbstractC0605j0.m2263T(this, 2);
        i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
        }
    }

    private AbstractC1879a0 getEndIconDelegate() {
        AbstractC1879a0 abstractC1879a0 = (AbstractC1879a0) this.f6883f0.get(this.f6881e0);
        return abstractC1879a0 != null ? abstractC1879a0 : (AbstractC1879a0) this.f6883f0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f6907r0.getVisibility() == 0) {
            return this.f6907r0;
        }
        if (m254j() && m253k()) {
            return this.f6885g0;
        }
        return null;
    }

    /* renamed from: o */
    public static void m249o(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m249o((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: r */
    public static void m246r(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = false;
        boolean z2 = onLongClickListener != null;
        z = (hasOnClickListeners || z2) ? true : true;
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        AbstractC0605j0.m2263T(checkableImageButton, z ? 1 : 2);
    }

    private void setEditText(EditText editText) {
        if (this.f6884g != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.f6881e0 != 3) {
            boolean z = editText instanceof TextInputEditText;
        }
        this.f6884g = editText;
        m251m();
        setTextInputAccessibilityDelegate(new C1911q0(this));
        this.f6851F0.m777q(this.f6884g.getTypeface());
        C1808d c1808d = this.f6851F0;
        float textSize = this.f6884g.getTextSize();
        if (c1808d.f5516j != textSize) {
            c1808d.f5516j = textSize;
            c1808d.m783k();
        }
        int gravity = this.f6884g.getGravity();
        this.f6851F0.m780n((gravity & (-113)) | 48);
        C1808d c1808d2 = this.f6851F0;
        if (c1808d2.f5514h != gravity) {
            c1808d2.f5514h = gravity;
            c1808d2.m783k();
        }
        this.f6884g.addTextChangedListener(new C1903m0(this));
        if (this.f6911t0 == null) {
            this.f6911t0 = this.f6884g.getHintTextColors();
        }
        if (this.f6840A) {
            if (TextUtils.isEmpty(this.f6842B)) {
                CharSequence hint = this.f6884g.getHint();
                this.f6886h = hint;
                setHint(hint);
                this.f6884g.setHint((CharSequence) null);
            }
            this.f6844C = true;
        }
        if (this.f6896m != null) {
            m243u(this.f6884g.getText().length());
        }
        m240x();
        this.f6888i.m704b();
        this.f6878d.bringToFront();
        this.f6880e.bringToFront();
        this.f6882f.bringToFront();
        this.f6907r0.bringToFront();
        Iterator it = this.f6879d0.iterator();
        while (it.hasNext()) {
            ((InterfaceC1913r0) it.next()).mo686a(this);
        }
        m269B();
        m266E();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m238z(false, true);
    }

    private void setErrorIconVisible(boolean z) {
        this.f6907r0.setVisibility(z ? 0 : 8);
        this.f6882f.setVisibility(z ? 8 : 0);
        m266E();
        if (m254j()) {
            return;
        }
        m241w();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f6842B)) {
            return;
        }
        this.f6842B = charSequence;
        C1808d c1808d = this.f6851F0;
        if (charSequence == null || !TextUtils.equals(c1808d.f5530x, charSequence)) {
            c1808d.f5530x = charSequence;
            c1808d.f5531y = null;
            Bitmap bitmap = c1808d.f5488B;
            if (bitmap != null) {
                bitmap.recycle();
                c1808d.f5488B = null;
            }
            c1808d.m783k();
        }
        if (this.f6849E0) {
            return;
        }
        m250n();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f6904q == z) {
            return;
        }
        if (z) {
            C0242f1 c0242f1 = new C0242f1(getContext());
            this.f6906r = c0242f1;
            c0242f1.setId(AbstractC1840f.textinput_placeholder);
            AbstractC0605j0.m2268O(this.f6906r, 1);
            setPlaceholderTextAppearance(this.f6910t);
            setPlaceholderTextColor(this.f6908s);
            TextView textView = this.f6906r;
            if (textView != null) {
                this.f6876c.addView(textView);
                this.f6906r.setVisibility(0);
            }
        } else {
            TextView textView2 = this.f6906r;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            this.f6906r = null;
        }
        this.f6904q = z;
    }

    /* renamed from: A */
    public final void m270A(int i) {
        if (i == 0 && !this.f6849E0) {
            TextView textView = this.f6906r;
            if (textView == null || !this.f6904q) {
                return;
            }
            textView.setText(this.f6902p);
            this.f6906r.setVisibility(0);
            this.f6906r.bringToFront();
            return;
        }
        TextView textView2 = this.f6906r;
        if (textView2 == null || !this.f6904q) {
            return;
        }
        textView2.setText((CharSequence) null);
        this.f6906r.setVisibility(4);
    }

    /* renamed from: B */
    public final void m269B() {
        if (this.f6884g == null) {
            return;
        }
        AbstractC0605j0.m2261V(this.f6918x, this.f6869S.getVisibility() == 0 ? 0 : AbstractC0605j0.m2237u(this.f6884g), this.f6884g.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(AbstractC1829d.material_input_text_to_prefix_suffix_padding), this.f6884g.getCompoundPaddingBottom());
    }

    /* renamed from: C */
    public final void m268C() {
        this.f6918x.setVisibility((this.f6916w == null || this.f6849E0) ? 8 : 0);
        m241w();
    }

    /* renamed from: D */
    public final void m267D(boolean z, boolean z2) {
        int defaultColor = this.f6921y0.getDefaultColor();
        int colorForState = this.f6921y0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f6921y0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f6863M = colorForState2;
        } else if (z2) {
            this.f6863M = colorForState;
        } else {
            this.f6863M = defaultColor;
        }
    }

    /* renamed from: E */
    public final void m266E() {
        if (this.f6884g == null) {
            return;
        }
        int i = 0;
        if (!m253k()) {
            if (!(this.f6907r0.getVisibility() == 0)) {
                i = AbstractC0605j0.m2238t(this.f6884g);
            }
        }
        AbstractC0605j0.m2261V(this.f6922z, getContext().getResources().getDimensionPixelSize(AbstractC1829d.material_input_text_to_prefix_suffix_padding), this.f6884g.getPaddingTop(), i, this.f6884g.getPaddingBottom());
    }

    /* renamed from: F */
    public final void m265F() {
        int visibility = this.f6922z.getVisibility();
        boolean z = (this.f6920y == null || this.f6849E0) ? false : true;
        this.f6922z.setVisibility(z ? 0 : 8);
        if (visibility != this.f6922z.getVisibility()) {
            getEndIconDelegate().mo691c(z);
        }
        m241w();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e5  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m264G() {
        int i;
        TextView textView;
        AbstractC1879a0 endIconDelegate;
        EditText editText;
        EditText editText2;
        if (this.f6846D == null || this.f6854H == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.f6884g) != null && editText2.hasFocus());
        boolean z3 = isHovered() || ((editText = this.f6884g) != null && editText.isHovered());
        if (isEnabled()) {
            if (this.f6888i.m701e()) {
                if (this.f6921y0 == null) {
                    i = this.f6888i.m699g();
                }
                m267D(z2, z3);
            } else if (!this.f6894l || (textView = this.f6896m) == null) {
                i = z2 ? this.f6919x0 : z3 ? this.f6917w0 : this.f6915v0;
            } else {
                if (this.f6921y0 == null) {
                    i = textView.getCurrentTextColor();
                }
                m267D(z2, z3);
            }
            if (getErrorIconDrawable() != null) {
                C1883c0 c1883c0 = this.f6888i;
                if (c1883c0.f5775k && c1883c0.m701e()) {
                    z = true;
                }
            }
            setErrorIconVisible(z);
            m247q(this.f6907r0, this.f6909s0);
            m247q(this.f6869S, this.f6870T);
            m248p();
            endIconDelegate = getEndIconDelegate();
            endIconDelegate.getClass();
            if (endIconDelegate instanceof C1923z) {
                if (!this.f6888i.m701e() || getEndIconDrawable() == null) {
                    m260d();
                } else {
                    Drawable mutate = AbstractC0022t.m3466u0(getEndIconDrawable()).mutate();
                    AbstractC0022t.m3482m0(mutate, this.f6888i.m699g());
                    this.f6885g0.setImageDrawable(mutate);
                }
            }
            this.f6858J = (z2 || !isEnabled()) ? this.f6860K : this.f6862L;
            if (this.f6854H == 1) {
                this.f6864N = !isEnabled() ? this.f6841A0 : (!z3 || z2) ? z2 ? this.f6843B0 : this.f6923z0 : this.f6845C0;
            }
            m261c();
        }
        i = this.f6847D0;
        this.f6863M = i;
        if (getErrorIconDrawable() != null) {
        }
        setErrorIconVisible(z);
        m247q(this.f6907r0, this.f6909s0);
        m247q(this.f6869S, this.f6870T);
        m248p();
        endIconDelegate = getEndIconDelegate();
        endIconDelegate.getClass();
        if (endIconDelegate instanceof C1923z) {
        }
        this.f6858J = (z2 || !isEnabled()) ? this.f6860K : this.f6862L;
        if (this.f6854H == 1) {
        }
        m261c();
    }

    /* renamed from: a */
    public void m263a(InterfaceC1913r0 interfaceC1913r0) {
        this.f6879d0.add(interfaceC1913r0);
        if (this.f6884g != null) {
            interfaceC1913r0.mo686a(this);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f6876c.addView(view, layoutParams2);
        this.f6876c.setLayoutParams(layoutParams);
        m239y();
        setEditText((EditText) view);
    }

    /* renamed from: b */
    public void m262b(float f) {
        if (this.f6851F0.f5510d == f) {
            return;
        }
        if (this.f6857I0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f6857I0 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC1946a.f5895b);
            this.f6857I0.setDuration(167L);
            this.f6857I0.addUpdateListener(new C1909p0(this));
        }
        this.f6857I0.setFloatValues(this.f6851F0.f5510d, f);
        this.f6857I0.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m261c() {
        boolean z;
        C1851i c1851i;
        C1851i c1851i2 = this.f6846D;
        if (c1851i2 == null) {
            return;
        }
        c1851i2.setShapeAppearanceModel(this.f6850F);
        boolean z2 = false;
        if (this.f6854H == 2) {
            if (this.f6858J > -1 && this.f6863M != 0) {
                z = true;
                if (z) {
                    this.f6846D.m735r(this.f6858J, this.f6863M);
                }
                int i = this.f6864N;
                if (this.f6854H == 1) {
                    i = AbstractC0506a.m2389e(this.f6864N, AbstractC1077v0.m1264o(getContext(), AbstractC1804b.colorSurface, 0));
                }
                this.f6864N = i;
                this.f6846D.m737p(ColorStateList.valueOf(i));
                if (this.f6881e0 == 3) {
                    this.f6884g.getBackground().invalidateSelf();
                }
                c1851i = this.f6848E;
                if (c1851i != null) {
                    if (this.f6858J > -1 && this.f6863M != 0) {
                        z2 = true;
                    }
                    if (z2) {
                        c1851i.m737p(ColorStateList.valueOf(this.f6863M));
                    }
                    invalidate();
                }
                invalidate();
            }
        }
        z = false;
        if (z) {
        }
        int i2 = this.f6864N;
        if (this.f6854H == 1) {
        }
        this.f6864N = i2;
        this.f6846D.m737p(ColorStateList.valueOf(i2));
        if (this.f6881e0 == 3) {
        }
        c1851i = this.f6848E;
        if (c1851i != null) {
        }
        invalidate();
    }

    /* renamed from: d */
    public final void m260d() {
        m259e(this.f6885g0, this.f6891j0, this.f6889i0, this.f6895l0, this.f6893k0);
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f6884g;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f6886h != null) {
            boolean z = this.f6844C;
            this.f6844C = false;
            CharSequence hint = editText.getHint();
            this.f6884g.setHint(this.f6886h);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f6884g.setHint(hint);
                this.f6844C = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.f6876c.getChildCount());
        for (int i2 = 0; i2 < this.f6876c.getChildCount(); i2++) {
            View childAt = this.f6876c.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.f6884g) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f6861K0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f6861K0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f6840A) {
            C1808d c1808d = this.f6851F0;
            c1808d.getClass();
            int save = canvas.save();
            if (c1808d.f5531y != null && c1808d.f5509c) {
                boolean z = false;
                c1808d.f5503Q.getLineLeft(0);
                c1808d.f5494H.setTextSize(c1808d.f5491E);
                float f = c1808d.f5524r;
                float f2 = c1808d.f5525s;
                if (c1808d.f5487A && c1808d.f5488B != null) {
                    z = true;
                }
                float f3 = c1808d.f5490D;
                if (f3 != 1.0f) {
                    canvas.scale(f3, f3, f, f2);
                }
                if (z) {
                    canvas.drawBitmap(c1808d.f5488B, f, f2, c1808d.f5489C);
                } else {
                    canvas.translate(f, f2);
                    c1808d.f5503Q.draw(canvas);
                }
                canvas.restoreToCount(save);
            }
        }
        C1851i c1851i = this.f6848E;
        if (c1851i != null) {
            Rect bounds = c1851i.getBounds();
            bounds.top = bounds.bottom - this.f6858J;
            this.f6848E.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        boolean z2;
        if (this.f6859J0) {
            return;
        }
        boolean z3 = true;
        this.f6859J0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C1808d c1808d = this.f6851F0;
        if (c1808d != null) {
            c1808d.f5492F = drawableState;
            ColorStateList colorStateList2 = c1808d.f5519m;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = c1808d.f5518l) != null && colorStateList.isStateful())) {
                c1808d.m783k();
                z2 = true;
            } else {
                z2 = false;
            }
            z = z2 | false;
        } else {
            z = false;
        }
        if (this.f6884g != null) {
            m238z((AbstractC0605j0.m2232z(this) && isEnabled()) ? false : false, false);
        }
        m240x();
        m264G();
        if (z) {
            invalidate();
        }
        this.f6859J0 = false;
    }

    /* renamed from: e */
    public final void m259e(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = AbstractC0022t.m3466u0(drawable).mutate();
            if (z) {
                AbstractC0022t.m3480n0(drawable, colorStateList);
            }
            if (z2) {
                AbstractC0022t.m3478o0(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: f */
    public final int m258f() {
        float m788f;
        if (this.f6840A) {
            int i = this.f6854H;
            if (i == 0 || i == 1) {
                m788f = this.f6851F0.m788f();
            } else if (i != 2) {
                return 0;
            } else {
                m788f = this.f6851F0.m788f() / 2.0f;
            }
            return (int) m788f;
        }
        return 0;
    }

    /* renamed from: g */
    public final boolean m257g() {
        return this.f6840A && !TextUtils.isEmpty(this.f6842B) && (this.f6846D instanceof C1902m);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f6884g;
        if (editText != null) {
            return m258f() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    public C1851i getBoxBackground() {
        int i = this.f6854H;
        if (i == 1 || i == 2) {
            return this.f6846D;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f6864N;
    }

    public int getBoxBackgroundMode() {
        return this.f6854H;
    }

    public float getBoxCornerRadiusBottomEnd() {
        C1851i c1851i = this.f6846D;
        return c1851i.f5657d.f5633a.f5699h.mo729a(c1851i.m745h());
    }

    public float getBoxCornerRadiusBottomStart() {
        C1851i c1851i = this.f6846D;
        return c1851i.f5657d.f5633a.f5698g.mo729a(c1851i.m745h());
    }

    public float getBoxCornerRadiusTopEnd() {
        C1851i c1851i = this.f6846D;
        return c1851i.f5657d.f5633a.f5697f.mo729a(c1851i.m745h());
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f6846D.m741l();
    }

    public int getBoxStrokeColor() {
        return this.f6919x0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f6921y0;
    }

    public int getBoxStrokeWidth() {
        return this.f6860K;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f6862L;
    }

    public int getCounterMaxLength() {
        return this.f6892k;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f6890j && this.f6894l && (textView = this.f6896m) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f6912u;
    }

    public ColorStateList getCounterTextColor() {
        return this.f6912u;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f6911t0;
    }

    public EditText getEditText() {
        return this.f6884g;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f6885g0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f6885g0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f6881e0;
    }

    public CheckableImageButton getEndIconView() {
        return this.f6885g0;
    }

    public CharSequence getError() {
        C1883c0 c1883c0 = this.f6888i;
        if (c1883c0.f5775k) {
            return c1883c0.f5774j;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f6888i.f5777m;
    }

    public int getErrorCurrentTextColors() {
        return this.f6888i.m699g();
    }

    public Drawable getErrorIconDrawable() {
        return this.f6907r0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.f6888i.m699g();
    }

    public CharSequence getHelperText() {
        C1883c0 c1883c0 = this.f6888i;
        if (c1883c0.f5781q) {
            return c1883c0.f5780p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.f6888i.f5782r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f6840A) {
            return this.f6842B;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f6851F0.m788f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.f6851F0.m787g();
    }

    public ColorStateList getHintTextColor() {
        return this.f6913u0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f6885g0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f6885g0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f6904q) {
            return this.f6902p;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f6910t;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f6908s;
    }

    public CharSequence getPrefixText() {
        return this.f6916w;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f6918x.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f6918x;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f6869S.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f6869S.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.f6920y;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f6922z.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f6922z;
    }

    public Typeface getTypeface() {
        return this.f6868R;
    }

    /* renamed from: h */
    public final int m256h(int i, boolean z) {
        int compoundPaddingLeft = this.f6884g.getCompoundPaddingLeft() + i;
        return (this.f6916w == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.f6918x.getMeasuredWidth()) + this.f6918x.getPaddingLeft();
    }

    /* renamed from: i */
    public final int m255i(int i, boolean z) {
        int compoundPaddingRight = i - this.f6884g.getCompoundPaddingRight();
        return (this.f6916w == null || !z) ? compoundPaddingRight : compoundPaddingRight + (this.f6918x.getMeasuredWidth() - this.f6918x.getPaddingRight());
    }

    /* renamed from: j */
    public final boolean m254j() {
        return this.f6881e0 != 0;
    }

    /* renamed from: k */
    public boolean m253k() {
        return this.f6882f.getVisibility() == 0 && this.f6885g0.getVisibility() == 0;
    }

    /* renamed from: l */
    public final boolean m252l() {
        return this.f6854H == 1 && (Build.VERSION.SDK_INT < 16 || this.f6884g.getMinLines() <= 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m251m() {
        EditText editText;
        EditText editText2;
        int m2237u;
        int dimensionPixelSize;
        int m2238t;
        Resources resources;
        int i;
        Resources resources2;
        int i2;
        int i3 = this.f6854H;
        if (i3 == 0) {
            this.f6846D = null;
        } else if (i3 == 1) {
            this.f6846D = new C1851i(this.f6850F);
            this.f6848E = new C1851i();
            editText = this.f6884g;
            if (editText == null && this.f6846D != null && editText.getBackground() == null && this.f6854H != 0) {
                AbstractC0605j0.m2267P(this.f6884g, this.f6846D);
            }
            m264G();
            if (this.f6854H == 1) {
                if (AbstractC1077v0.m1302B(getContext())) {
                    resources2 = getResources();
                    i2 = AbstractC1829d.material_font_2_0_box_collapsed_padding_top;
                } else if (AbstractC1077v0.m1303A(getContext())) {
                    resources2 = getResources();
                    i2 = AbstractC1829d.material_font_1_3_box_collapsed_padding_top;
                }
                this.f6856I = resources2.getDimensionPixelSize(i2);
            }
            if (this.f6884g != null && this.f6854H == 1) {
                if (!AbstractC1077v0.m1302B(getContext())) {
                    editText2 = this.f6884g;
                    m2237u = AbstractC0605j0.m2237u(editText2);
                    dimensionPixelSize = getResources().getDimensionPixelSize(AbstractC1829d.material_filled_edittext_font_2_0_padding_top);
                    m2238t = AbstractC0605j0.m2238t(this.f6884g);
                    resources = getResources();
                    i = AbstractC1829d.material_filled_edittext_font_2_0_padding_bottom;
                } else if (AbstractC1077v0.m1303A(getContext())) {
                    editText2 = this.f6884g;
                    m2237u = AbstractC0605j0.m2237u(editText2);
                    dimensionPixelSize = getResources().getDimensionPixelSize(AbstractC1829d.material_filled_edittext_font_1_3_padding_top);
                    m2238t = AbstractC0605j0.m2238t(this.f6884g);
                    resources = getResources();
                    i = AbstractC1829d.material_filled_edittext_font_1_3_padding_bottom;
                }
                AbstractC0605j0.m2261V(editText2, m2237u, dimensionPixelSize, m2238t, resources.getDimensionPixelSize(i));
            }
            if (this.f6854H == 0) {
                m239y();
                return;
            }
            return;
        } else if (i3 != 2) {
            throw new IllegalArgumentException(this.f6854H + " is illegal; only @BoxBackgroundMode constants are supported.");
        } else {
            this.f6846D = (!this.f6840A || (this.f6846D instanceof C1902m)) ? new C1851i(this.f6850F) : new C1902m(this.f6850F);
        }
        this.f6848E = null;
        editText = this.f6884g;
        if (editText == null && this.f6846D != null && editText.getBackground() == null && this.f6854H != 0) {
        }
        m264G();
        if (this.f6854H == 1) {
        }
        if (this.f6884g != null) {
            if (!AbstractC1077v0.m1302B(getContext())) {
            }
            AbstractC0605j0.m2261V(editText2, m2237u, dimensionPixelSize, m2238t, resources.getDimensionPixelSize(i));
        }
        if (this.f6854H == 0) {
        }
    }

    /* renamed from: n */
    public final void m250n() {
        float f;
        float m792b;
        float f2;
        if (m257g()) {
            RectF rectF = this.f6867Q;
            C1808d c1808d = this.f6851F0;
            int width = this.f6884g.getWidth();
            int gravity = this.f6884g.getGravity();
            boolean m791c = c1808d.m791c(c1808d.f5530x);
            c1808d.f5532z = m791c;
            if (gravity == 17 || (gravity & 7) == 1) {
                f = width / 2.0f;
                m792b = c1808d.m792b() / 2.0f;
            } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5 ? m791c : !m791c) {
                f2 = c1808d.f5512f.left;
                rectF.left = f2;
                Rect rect = c1808d.f5512f;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    float m792b2 = (width / 2.0f) + (c1808d.m792b() / 2.0f);
                } else {
                    m792b2 = ((gravity & 8388613) == 8388613 || (gravity & 5) == 5 ? !c1808d.f5532z : c1808d.f5532z) ? rect.right : c1808d.m792b() + f2;
                }
                rectF.right = m792b2;
                float m788f = c1808d.m788f() + c1808d.f5512f.top;
                rectF.bottom = m788f;
                float f3 = rectF.left;
                float f4 = this.f6852G;
                rectF.left = f3 - f4;
                rectF.top -= f4;
                rectF.right += f4;
                rectF.bottom = m788f + f4;
                rectF.offset(-getPaddingLeft(), -getPaddingTop());
                C1902m c1902m = (C1902m) this.f6846D;
                c1902m.getClass();
                c1902m.m688x(rectF.left, rectF.top, rectF.right, rectF.bottom);
            } else {
                f = c1808d.f5512f.right;
                m792b = c1808d.m792b();
            }
            f2 = f - m792b;
            rectF.left = f2;
            Rect rect2 = c1808d.f5512f;
            rectF.top = rect2.top;
            if (gravity != 17) {
            }
            float m792b22 = (width / 2.0f) + (c1808d.m792b() / 2.0f);
            rectF.right = m792b22;
            float m788f2 = c1808d.m788f() + c1808d.f5512f.top;
            rectF.bottom = m788f2;
            float f32 = rectF.left;
            float f42 = this.f6852G;
            rectF.left = f32 - f42;
            rectF.top -= f42;
            rectF.right += f42;
            rectF.bottom = m788f2 + f42;
            rectF.offset(-getPaddingLeft(), -getPaddingTop());
            C1902m c1902m2 = (C1902m) this.f6846D;
            c1902m2.getClass();
            c1902m2.m688x(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0164  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f6884g;
        if (editText == null) {
            return;
        }
        Rect rect = this.f6865O;
        AbstractC1809e.m776a(this, editText, rect);
        C1851i c1851i = this.f6848E;
        if (c1851i != null) {
            int i11 = rect.bottom;
            c1851i.setBounds(rect.left, i11 - this.f6862L, rect.right, i11);
        }
        if (!this.f6840A) {
            return;
        }
        C1808d c1808d = this.f6851F0;
        float textSize = this.f6884g.getTextSize();
        if (c1808d.f5516j != textSize) {
            c1808d.f5516j = textSize;
            c1808d.m783k();
        }
        int gravity = this.f6884g.getGravity();
        this.f6851F0.m780n((gravity & (-113)) | 48);
        C1808d c1808d2 = this.f6851F0;
        if (c1808d2.f5514h != gravity) {
            c1808d2.f5514h = gravity;
            c1808d2.m783k();
        }
        C1808d c1808d3 = this.f6851F0;
        if (this.f6884g != null) {
            Rect rect2 = this.f6866P;
            boolean z2 = AbstractC0605j0.m2241q(this) == 1;
            rect2.bottom = rect.bottom;
            int i12 = this.f6854H;
            if (i12 == 1) {
                rect2.left = m256h(rect.left, z2);
                i5 = rect.top + this.f6856I;
            } else if (i12 == 2) {
                rect2.left = this.f6884g.getPaddingLeft() + rect.left;
                rect2.top = rect.top - m258f();
                i6 = rect.right - this.f6884g.getPaddingRight();
                rect2.right = i6;
                c1808d3.getClass();
                i7 = rect2.left;
                i8 = rect2.top;
                i9 = rect2.right;
                i10 = rect2.bottom;
                if (!C1808d.m782l(c1808d3.f5512f, i7, i8, i9, i10)) {
                    c1808d3.f5512f.set(i7, i8, i9, i10);
                    c1808d3.f5493G = true;
                    c1808d3.m784j();
                }
                C1808d c1808d4 = this.f6851F0;
                if (this.f6884g == null) {
                    Rect rect3 = this.f6866P;
                    TextPaint textPaint = c1808d4.f5495I;
                    textPaint.setTextSize(c1808d4.f5516j);
                    textPaint.setTypeface(c1808d4.f5527u);
                    if (Build.VERSION.SDK_INT >= 21) {
                        textPaint.setLetterSpacing(0.0f);
                    }
                    float f = -c1808d4.f5495I.ascent();
                    rect3.left = this.f6884g.getCompoundPaddingLeft() + rect.left;
                    rect3.top = m252l() ? (int) (rect.centerY() - (f / 2.0f)) : rect.top + this.f6884g.getCompoundPaddingTop();
                    rect3.right = rect.right - this.f6884g.getCompoundPaddingRight();
                    int compoundPaddingBottom = m252l() ? (int) (rect3.top + f) : rect.bottom - this.f6884g.getCompoundPaddingBottom();
                    rect3.bottom = compoundPaddingBottom;
                    int i13 = rect3.left;
                    int i14 = rect3.top;
                    int i15 = rect3.right;
                    if (!C1808d.m782l(c1808d4.f5511e, i13, i14, i15, compoundPaddingBottom)) {
                        c1808d4.f5511e.set(i13, i14, i15, compoundPaddingBottom);
                        c1808d4.f5493G = true;
                        c1808d4.m784j();
                    }
                    this.f6851F0.m783k();
                    if (!m257g() || this.f6849E0) {
                        return;
                    }
                    m250n();
                    return;
                }
                throw new IllegalStateException();
            } else {
                rect2.left = m256h(rect.left, z2);
                i5 = getPaddingTop();
            }
            rect2.top = i5;
            i6 = m255i(rect.right, z2);
            rect2.right = i6;
            c1808d3.getClass();
            i7 = rect2.left;
            i8 = rect2.top;
            i9 = rect2.right;
            i10 = rect2.bottom;
            if (!C1808d.m782l(c1808d3.f5512f, i7, i8, i9, i10)) {
            }
            C1808d c1808d42 = this.f6851F0;
            if (this.f6884g == null) {
            }
        } else {
            throw new IllegalStateException();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        EditText editText;
        int max;
        super.onMeasure(i, i2);
        boolean z = false;
        if (this.f6884g != null && this.f6884g.getMeasuredHeight() < (max = Math.max(this.f6880e.getMeasuredHeight(), this.f6878d.getMeasuredHeight()))) {
            this.f6884g.setMinimumHeight(max);
            z = true;
        }
        boolean m241w = m241w();
        if (z || m241w) {
            this.f6884g.post(new RunnableC1907o0(this));
        }
        if (this.f6906r != null && (editText = this.f6884g) != null) {
            this.f6906r.setGravity(editText.getGravity());
            this.f6906r.setPadding(this.f6884g.getCompoundPaddingLeft(), this.f6884g.getCompoundPaddingTop(), this.f6884g.getCompoundPaddingRight(), this.f6884g.getCompoundPaddingBottom());
        }
        m269B();
        m266E();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f511c);
        setError(savedState.f6924d);
        if (savedState.f6925e) {
            this.f6885g0.post(new RunnableC1905n0(this));
        }
        setHint(savedState.f6926f);
        setHelperText(savedState.f6927g);
        setPlaceholderText(savedState.f6928h);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f6888i.m701e()) {
            savedState.f6924d = getError();
        }
        savedState.f6925e = m254j() && this.f6885g0.isChecked();
        savedState.f6926f = getHint();
        savedState.f6927g = getHelperText();
        savedState.f6928h = getPlaceholderText();
        return savedState;
    }

    /* renamed from: p */
    public void m248p() {
        m247q(this.f6885g0, this.f6889i0);
    }

    /* renamed from: q */
    public final void m247q(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = AbstractC0022t.m3466u0(drawable).mutate();
        AbstractC0022t.m3480n0(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r3.getTextColors().getDefaultColor() == (-65281)) goto L8;
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m245s(TextView textView, int i) {
        boolean z = true;
        try {
            AbstractC0022t.m3484l0(textView, i);
            if (Build.VERSION.SDK_INT >= 23) {
            }
            z = false;
        } catch (Exception unused) {
        }
        if (z) {
            AbstractC0022t.m3484l0(textView, AbstractC1926k.TextAppearance_AppCompat_Caption);
            textView.setTextColor(AbstractC0472e.m2431b(getContext(), AbstractC1827c.design_error));
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f6864N != i) {
            this.f6864N = i;
            this.f6923z0 = i;
            this.f6843B0 = i;
            this.f6845C0 = i;
            m261c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(AbstractC0472e.m2431b(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f6923z0 = defaultColor;
        this.f6864N = defaultColor;
        this.f6841A0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f6843B0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f6845C0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        m261c();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f6854H) {
            return;
        }
        this.f6854H = i;
        if (this.f6884g != null) {
            m251m();
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.f6919x0 != i) {
            this.f6919x0 = i;
            m264G();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.f6919x0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            m264G();
        }
        this.f6915v0 = colorStateList.getDefaultColor();
        this.f6847D0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f6917w0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f6919x0 = defaultColor;
        m264G();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f6921y0 != colorStateList) {
            this.f6921y0 = colorStateList;
            m264G();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f6860K = i;
        m264G();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f6862L = i;
        m264G();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f6890j != z) {
            if (z) {
                C0242f1 c0242f1 = new C0242f1(getContext());
                this.f6896m = c0242f1;
                c0242f1.setId(AbstractC1840f.textinput_counter);
                Typeface typeface = this.f6868R;
                if (typeface != null) {
                    this.f6896m.setTypeface(typeface);
                }
                this.f6896m.setMaxLines(1);
                this.f6888i.m705a(this.f6896m, 2);
                AbstractC0022t.m3488j0((ViewGroup.MarginLayoutParams) this.f6896m.getLayoutParams(), getResources().getDimensionPixelOffset(AbstractC1829d.mtrl_textinput_counter_margin_start));
                m242v();
                m244t();
            } else {
                this.f6888i.m696j(this.f6896m, 2);
                this.f6896m = null;
            }
            this.f6890j = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f6892k != i) {
            if (i <= 0) {
                i = -1;
            }
            this.f6892k = i;
            if (this.f6890j) {
                m244t();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f6898n != i) {
            this.f6898n = i;
            m242v();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f6914v != colorStateList) {
            this.f6914v = colorStateList;
            m242v();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f6900o != i) {
            this.f6900o = i;
            m242v();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f6912u != colorStateList) {
            this.f6912u = colorStateList;
            m242v();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f6911t0 = colorStateList;
        this.f6913u0 = colorStateList;
        if (this.f6884g != null) {
            m238z(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m249o(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f6885g0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f6885g0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f6885g0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? AbstractC0142b.m3000b(getContext(), i) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f6885g0.setImageDrawable(drawable);
        m248p();
    }

    public void setEndIconMode(int i) {
        int i2 = this.f6881e0;
        this.f6881e0 = i;
        Iterator it = this.f6887h0.iterator();
        while (it.hasNext()) {
            ((InterfaceC1915s0) it.next()).mo685a(this, i2);
        }
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().mo683b(this.f6854H)) {
            getEndIconDelegate().mo684a();
            m260d();
            return;
        }
        StringBuilder m1187i = AbstractC1124a.m1187i("The current box background mode ");
        m1187i.append(this.f6854H);
        m1187i.append(" is not supported by the end icon mode ");
        m1187i.append(i);
        throw new IllegalStateException(m1187i.toString());
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f6885g0;
        View.OnLongClickListener onLongClickListener = this.f6903p0;
        checkableImageButton.setOnClickListener(onClickListener);
        m246r(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f6903p0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f6885g0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m246r(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f6889i0 != colorStateList) {
            this.f6889i0 = colorStateList;
            this.f6891j0 = true;
            m260d();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f6893k0 != mode) {
            this.f6893k0 = mode;
            this.f6895l0 = true;
            m260d();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (m253k() != z) {
            this.f6885g0.setVisibility(z ? 0 : 8);
            m266E();
            m241w();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f6888i.f5775k) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            C1883c0 c1883c0 = this.f6888i;
            c1883c0.m703c();
            c1883c0.f5774j = charSequence;
            c1883c0.f5776l.setText(charSequence);
            int i = c1883c0.f5772h;
            if (i != 1) {
                c1883c0.f5773i = 1;
            }
            c1883c0.m694l(i, c1883c0.f5773i, c1883c0.m695k(c1883c0.f5776l, charSequence));
            return;
        }
        this.f6888i.m697i();
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C1883c0 c1883c0 = this.f6888i;
        c1883c0.f5777m = charSequence;
        TextView textView = c1883c0.f5776l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        C1883c0 c1883c0 = this.f6888i;
        if (c1883c0.f5775k == z) {
            return;
        }
        c1883c0.m703c();
        if (z) {
            C0242f1 c0242f1 = new C0242f1(c1883c0.f5765a);
            c1883c0.f5776l = c0242f1;
            c0242f1.setId(AbstractC1840f.textinput_error);
            if (Build.VERSION.SDK_INT >= 17) {
                c1883c0.f5776l.setTextAlignment(5);
            }
            Typeface typeface = c1883c0.f5785u;
            if (typeface != null) {
                c1883c0.f5776l.setTypeface(typeface);
            }
            int i = c1883c0.f5778n;
            c1883c0.f5778n = i;
            TextView textView = c1883c0.f5776l;
            if (textView != null) {
                c1883c0.f5766b.m245s(textView, i);
            }
            ColorStateList colorStateList = c1883c0.f5779o;
            c1883c0.f5779o = colorStateList;
            TextView textView2 = c1883c0.f5776l;
            if (textView2 != null && colorStateList != null) {
                textView2.setTextColor(colorStateList);
            }
            CharSequence charSequence = c1883c0.f5777m;
            c1883c0.f5777m = charSequence;
            TextView textView3 = c1883c0.f5776l;
            if (textView3 != null) {
                textView3.setContentDescription(charSequence);
            }
            c1883c0.f5776l.setVisibility(4);
            AbstractC0605j0.m2268O(c1883c0.f5776l, 1);
            c1883c0.m705a(c1883c0.f5776l, 0);
        } else {
            c1883c0.m697i();
            c1883c0.m696j(c1883c0.f5776l, 0);
            c1883c0.f5776l = null;
            c1883c0.f5766b.m240x();
            c1883c0.f5766b.m264G();
        }
        c1883c0.f5775k = z;
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? AbstractC0142b.m3000b(getContext(), i) : null);
        m247q(this.f6907r0, this.f6909s0);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f6907r0;
        View.OnLongClickListener onLongClickListener = this.f6905q0;
        checkableImageButton.setOnClickListener(onClickListener);
        m246r(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f6905q0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f6907r0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m246r(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f6909s0 = colorStateList;
        Drawable drawable = this.f6907r0.getDrawable();
        if (drawable != null) {
            drawable = AbstractC0022t.m3466u0(drawable).mutate();
            AbstractC0022t.m3480n0(drawable, colorStateList);
        }
        if (this.f6907r0.getDrawable() != drawable) {
            this.f6907r0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f6907r0.getDrawable();
        if (drawable != null) {
            drawable = AbstractC0022t.m3466u0(drawable).mutate();
            AbstractC0022t.m3478o0(drawable, mode);
        }
        if (this.f6907r0.getDrawable() != drawable) {
            this.f6907r0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        C1883c0 c1883c0 = this.f6888i;
        c1883c0.f5778n = i;
        TextView textView = c1883c0.f5776l;
        if (textView != null) {
            c1883c0.f5766b.m245s(textView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C1883c0 c1883c0 = this.f6888i;
        c1883c0.f5779o = colorStateList;
        TextView textView = c1883c0.f5776l;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f6853G0 != z) {
            this.f6853G0 = z;
            m238z(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (this.f6888i.f5781q) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!this.f6888i.f5781q) {
            setHelperTextEnabled(true);
        }
        C1883c0 c1883c0 = this.f6888i;
        c1883c0.m703c();
        c1883c0.f5780p = charSequence;
        c1883c0.f5782r.setText(charSequence);
        int i = c1883c0.f5772h;
        if (i != 2) {
            c1883c0.f5773i = 2;
        }
        c1883c0.m694l(i, c1883c0.f5773i, c1883c0.m695k(c1883c0.f5782r, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C1883c0 c1883c0 = this.f6888i;
        c1883c0.f5784t = colorStateList;
        TextView textView = c1883c0.f5782r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        C1883c0 c1883c0 = this.f6888i;
        if (c1883c0.f5781q == z) {
            return;
        }
        c1883c0.m703c();
        if (z) {
            C0242f1 c0242f1 = new C0242f1(c1883c0.f5765a);
            c1883c0.f5782r = c0242f1;
            c0242f1.setId(AbstractC1840f.textinput_helper_text);
            if (Build.VERSION.SDK_INT >= 17) {
                c1883c0.f5782r.setTextAlignment(5);
            }
            Typeface typeface = c1883c0.f5785u;
            if (typeface != null) {
                c1883c0.f5782r.setTypeface(typeface);
            }
            c1883c0.f5782r.setVisibility(4);
            AbstractC0605j0.m2268O(c1883c0.f5782r, 1);
            int i = c1883c0.f5783s;
            c1883c0.f5783s = i;
            TextView textView = c1883c0.f5782r;
            if (textView != null) {
                AbstractC0022t.m3484l0(textView, i);
            }
            ColorStateList colorStateList = c1883c0.f5784t;
            c1883c0.f5784t = colorStateList;
            TextView textView2 = c1883c0.f5782r;
            if (textView2 != null && colorStateList != null) {
                textView2.setTextColor(colorStateList);
            }
            c1883c0.m705a(c1883c0.f5782r, 1);
        } else {
            c1883c0.m703c();
            int i2 = c1883c0.f5772h;
            if (i2 == 2) {
                c1883c0.f5773i = 0;
            }
            c1883c0.m694l(i2, c1883c0.f5773i, c1883c0.m695k(c1883c0.f5782r, null));
            c1883c0.m696j(c1883c0.f5782r, 1);
            c1883c0.f5782r = null;
            c1883c0.f5766b.m240x();
            c1883c0.f5766b.m264G();
        }
        c1883c0.f5781q = z;
    }

    public void setHelperTextTextAppearance(int i) {
        C1883c0 c1883c0 = this.f6888i;
        c1883c0.f5783s = i;
        TextView textView = c1883c0.f5782r;
        if (textView != null) {
            AbstractC0022t.m3484l0(textView, i);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f6840A) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f6855H0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f6840A) {
            this.f6840A = z;
            if (z) {
                CharSequence hint = this.f6884g.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f6842B)) {
                        setHint(hint);
                    }
                    this.f6884g.setHint((CharSequence) null);
                }
                this.f6844C = true;
            } else {
                this.f6844C = false;
                if (!TextUtils.isEmpty(this.f6842B) && TextUtils.isEmpty(this.f6884g.getHint())) {
                    this.f6884g.setHint(this.f6842B);
                }
                setHintInternal(null);
            }
            if (this.f6884g != null) {
                m239y();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        C1808d c1808d = this.f6851F0;
        C1833d c1833d = new C1833d(c1808d.f5508b.getContext(), i);
        ColorStateList colorStateList = c1833d.f5586a;
        if (colorStateList != null) {
            c1808d.f5519m = colorStateList;
        }
        float f = c1833d.f5596k;
        if (f != 0.0f) {
            c1808d.f5517k = f;
        }
        ColorStateList colorStateList2 = c1833d.f5587b;
        if (colorStateList2 != null) {
            c1808d.f5501O = colorStateList2;
        }
        c1808d.f5499M = c1833d.f5591f;
        c1808d.f5500N = c1833d.f5592g;
        c1808d.f5498L = c1833d.f5593h;
        c1808d.f5502P = c1833d.f5595j;
        C1830a c1830a = c1808d.f5529w;
        if (c1830a != null) {
            c1830a.f5580c = true;
        }
        C1807c c1807c = new C1807c(c1808d);
        c1833d.m759a();
        c1808d.f5529w = new C1830a(c1807c, c1833d.f5599n);
        c1833d.m758b(c1808d.f5508b.getContext(), c1808d.f5529w);
        c1808d.m783k();
        this.f6913u0 = this.f6851F0.f5519m;
        if (this.f6884g != null) {
            m238z(false, false);
            m239y();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f6913u0 != colorStateList) {
            if (this.f6911t0 == null) {
                C1808d c1808d = this.f6851F0;
                if (c1808d.f5519m != colorStateList) {
                    c1808d.f5519m = colorStateList;
                    c1808d.m783k();
                }
            }
            this.f6913u0 = colorStateList;
            if (this.f6884g != null) {
                m238z(false, false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f6885g0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? AbstractC0142b.m3000b(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f6885g0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f6881e0 != 1) {
            setEndIconMode(1);
        } else if (z) {
        } else {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f6889i0 = colorStateList;
        this.f6891j0 = true;
        m260d();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f6893k0 = mode;
        this.f6895l0 = true;
        m260d();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f6904q && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f6904q) {
                setPlaceholderTextEnabled(true);
            }
            this.f6902p = charSequence;
        }
        EditText editText = this.f6884g;
        m270A(editText != null ? editText.getText().length() : 0);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f6910t = i;
        TextView textView = this.f6906r;
        if (textView != null) {
            AbstractC0022t.m3484l0(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f6908s != colorStateList) {
            this.f6908s = colorStateList;
            TextView textView = this.f6906r;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f6916w = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f6918x.setText(charSequence);
        m268C();
    }

    public void setPrefixTextAppearance(int i) {
        AbstractC0022t.m3484l0(this.f6918x, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f6918x.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f6869S.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f6869S.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? AbstractC0142b.m3000b(getContext(), i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f6869S.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            m247q(this.f6869S, this.f6870T);
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f6869S;
        View.OnLongClickListener onLongClickListener = this.f6877c0;
        checkableImageButton.setOnClickListener(onClickListener);
        m246r(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f6877c0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f6869S;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m246r(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f6870T != colorStateList) {
            this.f6870T = colorStateList;
            this.f6871U = true;
            m259e(this.f6869S, true, colorStateList, this.f6873W, this.f6872V);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f6872V != mode) {
            this.f6872V = mode;
            this.f6873W = true;
            m259e(this.f6869S, this.f6871U, this.f6870T, true, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        if ((this.f6869S.getVisibility() == 0) != z) {
            this.f6869S.setVisibility(z ? 0 : 8);
            m269B();
            m241w();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f6920y = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f6922z.setText(charSequence);
        m265F();
    }

    public void setSuffixTextAppearance(int i) {
        AbstractC0022t.m3484l0(this.f6922z, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f6922z.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C1911q0 c1911q0) {
        EditText editText = this.f6884g;
        if (editText != null) {
            AbstractC0605j0.m2269N(editText, c1911q0);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f6868R) {
            this.f6868R = typeface;
            this.f6851F0.m777q(typeface);
            C1883c0 c1883c0 = this.f6888i;
            if (typeface != c1883c0.f5785u) {
                c1883c0.f5785u = typeface;
                TextView textView = c1883c0.f5776l;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = c1883c0.f5782r;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.f6896m;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    /* renamed from: t */
    public final void m244t() {
        if (this.f6896m != null) {
            EditText editText = this.f6884g;
            m243u(editText == null ? 0 : editText.getText().length());
        }
    }

    /* renamed from: u */
    public void m243u(int i) {
        boolean z = this.f6894l;
        int i2 = this.f6892k;
        if (i2 == -1) {
            this.f6896m.setText(String.valueOf(i));
            this.f6896m.setContentDescription(null);
            this.f6894l = false;
        } else {
            this.f6894l = i > i2;
            Context context = getContext();
            this.f6896m.setContentDescription(context.getString(this.f6894l ? AbstractC1924j.character_counter_overflowed_content_description : AbstractC1924j.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(this.f6892k)));
            if (z != this.f6894l) {
                m242v();
            }
            C0550b m2339c = C0550b.m2339c();
            TextView textView = this.f6896m;
            String string = getContext().getString(AbstractC1924j.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.f6892k));
            textView.setText(string != null ? m2339c.m2338d(string, m2339c.f2639h, true).toString() : null);
        }
        if (this.f6884g == null || z == this.f6894l) {
            return;
        }
        m238z(false, false);
        m264G();
        m240x();
    }

    /* renamed from: v */
    public final void m242v() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f6896m;
        if (textView != null) {
            m245s(textView, this.f6894l ? this.f6898n : this.f6900o);
            if (!this.f6894l && (colorStateList2 = this.f6912u) != null) {
                this.f6896m.setTextColor(colorStateList2);
            }
            if (!this.f6894l || (colorStateList = this.f6914v) == null) {
                return;
            }
            this.f6896m.setTextColor(colorStateList);
        }
    }

    /* renamed from: w */
    public final boolean m241w() {
        boolean z;
        if (this.f6884g == null) {
            return false;
        }
        boolean z2 = true;
        if (!(getStartIconDrawable() == null && this.f6916w == null) && this.f6878d.getMeasuredWidth() > 0) {
            int measuredWidth = this.f6878d.getMeasuredWidth() - this.f6884g.getPaddingLeft();
            if (this.f6874a0 == null || this.f6875b0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f6874a0 = colorDrawable;
                this.f6875b0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] m3531C = AbstractC0022t.m3531C(this.f6884g);
            Drawable drawable = m3531C[0];
            Drawable drawable2 = this.f6874a0;
            if (drawable != drawable2) {
                AbstractC0022t.m3506a0(this.f6884g, drawable2, m3531C[1], m3531C[2], m3531C[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.f6874a0 != null) {
                Drawable[] m3531C2 = AbstractC0022t.m3531C(this.f6884g);
                AbstractC0022t.m3506a0(this.f6884g, null, m3531C2[1], m3531C2[2], m3531C2[3]);
                this.f6874a0 = null;
                z = true;
            }
            z = false;
        }
        if ((this.f6907r0.getVisibility() == 0 || ((m254j() && m253k()) || this.f6920y != null)) && this.f6880e.getMeasuredWidth() > 0) {
            int measuredWidth2 = this.f6922z.getMeasuredWidth() - this.f6884g.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = AbstractC0022t.m3528F((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()) + endIconToUpdateDummyDrawable.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] m3531C3 = AbstractC0022t.m3531C(this.f6884g);
            Drawable drawable3 = this.f6897m0;
            if (drawable3 == null || this.f6899n0 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f6897m0 = colorDrawable2;
                    this.f6899n0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = m3531C3[2];
                Drawable drawable5 = this.f6897m0;
                if (drawable4 != drawable5) {
                    this.f6901o0 = m3531C3[2];
                    AbstractC0022t.m3506a0(this.f6884g, m3531C3[0], m3531C3[1], drawable5, m3531C3[3]);
                } else {
                    z2 = z;
                }
            } else {
                this.f6899n0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                AbstractC0022t.m3506a0(this.f6884g, m3531C3[0], m3531C3[1], this.f6897m0, m3531C3[3]);
            }
        } else if (this.f6897m0 == null) {
            return z;
        } else {
            Drawable[] m3531C4 = AbstractC0022t.m3531C(this.f6884g);
            if (m3531C4[2] == this.f6897m0) {
                AbstractC0022t.m3506a0(this.f6884g, m3531C4[0], m3531C4[1], this.f6901o0, m3531C4[3]);
            } else {
                z2 = z;
            }
            this.f6897m0 = null;
        }
        return z2;
    }

    /* renamed from: x */
    public void m240x() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.f6884g;
        if (editText == null || this.f6854H != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (AbstractC0290o1.m2786a(background)) {
            background = background.mutate();
        }
        if (this.f6888i.m701e()) {
            currentTextColor = this.f6888i.m699g();
        } else if (!this.f6894l || (textView = this.f6896m) == null) {
            AbstractC0022t.m3487k(background);
            this.f6884g.refreshDrawableState();
            return;
        } else {
            currentTextColor = textView.getCurrentTextColor();
        }
        background.setColorFilter(C0229d0.m2863c(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: y */
    public final void m239y() {
        if (this.f6854H != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f6876c.getLayoutParams();
            int m258f = m258f();
            if (m258f != layoutParams.topMargin) {
                layoutParams.topMargin = m258f;
                this.f6876c.requestLayout();
            }
        }
    }

    /* renamed from: z */
    public final void m238z(boolean z, boolean z2) {
        ColorStateList colorStateList;
        C1808d c1808d;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f6884g;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f6884g;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean m701e = this.f6888i.m701e();
        ColorStateList colorStateList2 = this.f6911t0;
        if (colorStateList2 != null) {
            C1808d c1808d2 = this.f6851F0;
            if (c1808d2.f5519m != colorStateList2) {
                c1808d2.f5519m = colorStateList2;
                c1808d2.m783k();
            }
            C1808d c1808d3 = this.f6851F0;
            ColorStateList colorStateList3 = this.f6911t0;
            if (c1808d3.f5518l != colorStateList3) {
                c1808d3.f5518l = colorStateList3;
                c1808d3.m783k();
            }
        }
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.f6911t0;
            int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(new int[]{-16842910}, this.f6847D0) : this.f6847D0;
            this.f6851F0.m781m(ColorStateList.valueOf(colorForState));
            C1808d c1808d4 = this.f6851F0;
            ColorStateList valueOf = ColorStateList.valueOf(colorForState);
            if (c1808d4.f5518l != valueOf) {
                c1808d4.f5518l = valueOf;
                c1808d4.m783k();
            }
        } else if (m701e) {
            C1808d c1808d5 = this.f6851F0;
            TextView textView2 = this.f6888i.f5776l;
            c1808d5.m781m(textView2 != null ? textView2.getTextColors() : null);
        } else {
            if (this.f6894l && (textView = this.f6896m) != null) {
                c1808d = this.f6851F0;
                colorStateList = textView.getTextColors();
            } else if (z4 && (colorStateList = this.f6913u0) != null) {
                c1808d = this.f6851F0;
            }
            c1808d.m781m(colorStateList);
        }
        if (z3 || !this.f6853G0 || (isEnabled() && z4)) {
            if (z2 || this.f6849E0) {
                ValueAnimator valueAnimator = this.f6857I0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f6857I0.cancel();
                }
                if (z && this.f6855H0) {
                    m262b(1.0f);
                } else {
                    this.f6851F0.m779o(1.0f);
                }
                this.f6849E0 = false;
                if (m257g()) {
                    m250n();
                }
                EditText editText3 = this.f6884g;
                m270A(editText3 != null ? editText3.getText().length() : 0);
                m268C();
                m265F();
            }
        } else if (z2 || !this.f6849E0) {
            ValueAnimator valueAnimator2 = this.f6857I0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f6857I0.cancel();
            }
            if (z && this.f6855H0) {
                m262b(0.0f);
            } else {
                this.f6851F0.m779o(0.0f);
            }
            if (m257g() && (!((C1902m) this.f6846D).f5813A.isEmpty()) && m257g()) {
                ((C1902m) this.f6846D).m688x(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f6849E0 = true;
            TextView textView3 = this.f6906r;
            if (textView3 != null && this.f6904q) {
                textView3.setText((CharSequence) null);
                this.f6906r.setVisibility(4);
            }
            m268C();
            m265F();
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f6907r0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f6888i.f5775k);
    }
}