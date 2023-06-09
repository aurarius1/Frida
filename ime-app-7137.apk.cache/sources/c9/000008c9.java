package com.anysoftkeyboard.keyboards.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions;
import com.anysoftkeyboard.keyboards.views.CandidateView;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p010b.p046j.p047d.AbstractC0472e;
import p010b.p086w.AbstractC1077v0;
import p093c.p097b.p099b0.C1138a;
import p093c.p097b.p099b0.C1146i;
import p093c.p097b.p099b0.C1147j;
import p093c.p097b.p099b0.InterfaceC1148k;
import p093c.p097b.p105f0.C1215b;
import p093c.p097b.p107h0.C1237f;
import p093c.p097b.p116p.InterfaceC1423a;
import p093c.p097b.p130z.p132r0.C1726i0;
import p093c.p097b.p130z.p132r0.InterfaceC1760z0;
import p093c.p137d.p138a.p139a.C1785g;
import p093c.p176h.p177a.p178a.AbstractC2062a0;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* loaded from: classes.dex */
public class CandidateView extends View implements InterfaceC1760z0 {

    /* renamed from: A */
    public boolean f6529A;

    /* renamed from: B */
    public InterfaceC2112c f6530B;

    /* renamed from: b */
    public int f6531b;

    /* renamed from: c */
    public final int[] f6532c;

    /* renamed from: d */
    public final int[] f6533d;

    /* renamed from: e */
    public final ArrayList f6534e;

    /* renamed from: f */
    public float f6535f;

    /* renamed from: g */
    public final C1147j f6536g;

    /* renamed from: h */
    public final Paint f6537h;

    /* renamed from: i */
    public final TextPaint f6538i;

    /* renamed from: j */
    public final GestureDetector f6539j;

    /* renamed from: k */
    public AnySoftKeyboardSuggestions f6540k;

    /* renamed from: l */
    public boolean f6541l;

    /* renamed from: m */
    public CharSequence f6542m;

    /* renamed from: n */
    public CharSequence f6543n;

    /* renamed from: o */
    public int f6544o;

    /* renamed from: p */
    public boolean f6545p;

    /* renamed from: q */
    public boolean f6546q;

    /* renamed from: r */
    public Rect f6547r;

    /* renamed from: s */
    public Drawable f6548s;

    /* renamed from: t */
    public Drawable f6549t;

    /* renamed from: u */
    public Drawable f6550u;

    /* renamed from: v */
    public boolean f6551v;

    /* renamed from: w */
    public boolean f6552w;

    /* renamed from: x */
    public final CharSequence f6553x;

    /* renamed from: y */
    public int f6554y;

    /* renamed from: z */
    public int f6555z;

    public CandidateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f6531b = -1;
        this.f6532c = new int[32];
        this.f6533d = new int[32];
        this.f6534e = new ArrayList();
        this.f6536g = new C1147j();
        this.f6541l = false;
        this.f6530B = AbstractC1077v0.m1266m();
        this.f6553x = context.getString(R.string.hint_add_to_dictionary);
        Paint paint = new Paint();
        this.f6537h = paint;
        this.f6538i = new TextPaint(paint);
        this.f6539j = new GestureDetector(context, new C1726i0(this, context.getResources().getDimensionPixelOffset(R.dimen.candidate_min_touchable_width)));
        setWillNotDraw(false);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        scrollTo(0, getScrollY());
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return this.f6555z;
    }

    /* renamed from: d */
    public void m386d() {
        this.f6534e.clear();
        this.f6541l = false;
        this.f6531b = -1;
        this.f6542m = null;
        this.f6544o = -1;
        this.f6552w = false;
        invalidate();
        Arrays.fill(this.f6532c, 0);
        Arrays.fill(this.f6533d, 0);
    }

    /* renamed from: e */
    public void m385e(List list, boolean z, boolean z2) {
        m386d();
        int min = Math.min(list.size(), 32);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f6534e.add((CharSequence) it.next());
            min--;
            if (min == 0) {
                break;
            }
        }
        this.f6545p = z;
        scrollTo(0, getScrollY());
        this.f6554y = 0;
        this.f6546q = z2;
        invalidate();
    }

    public Drawable getCloseIcon() {
        return this.f6549t;
    }

    public List getSuggestions() {
        return this.f6534e;
    }

    public int getTextOthersColor() {
        return ((C1146i) this.f6536g.m1174a()).f4263b;
    }

    public float getTextSize() {
        return this.f6537h.getTextSize();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6530B = ((C1785g) AnyApplication.m182t(getContext()).m1172a(R.string.settings_key_workaround_disable_rtl_fix, R.bool.settings_default_workaround_disable_rtl_fix)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.z.r0.u
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                CandidateView candidateView = CandidateView.this;
                candidateView.getClass();
                candidateView.f6529A = ((Boolean) obj).booleanValue();
            }
        }, new C1215b("Failed reading settings_key_workaround_disable_rtl_fix in CandidateView."), AbstractC2146l.f7038c, AbstractC2146l.f7039d);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6530B.mo35e();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        C1146i c1146i;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        int i8;
        int i9;
        int i10;
        Canvas canvas2;
        int i11;
        int i12;
        Canvas canvas3 = canvas;
        if (canvas3 != null) {
            super.onDraw(canvas);
        }
        this.f6555z = 0;
        int height = getHeight();
        if (this.f6547r == null) {
            this.f6547r = new Rect(0, 0, 0, 0);
            if (getBackground() != null) {
                getBackground().getPadding(this.f6547r);
            }
            Drawable drawable = this.f6548s;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f6548s.getIntrinsicHeight());
        }
        int minimumHeight = (height - this.f6548s.getMinimumHeight()) / 2;
        int size = this.f6534e.size();
        Rect rect = this.f6547r;
        Paint paint = this.f6537h;
        int i13 = this.f6531b;
        int scrollX = getScrollX();
        boolean z3 = this.f6551v;
        boolean z4 = this.f6545p;
        InterfaceC1148k m1174a = this.f6536g.m1174a();
        Canvas canvas4 = canvas3;
        int i14 = 0;
        int i15 = 0;
        while (i15 < size) {
            CharSequence charSequence = (CharSequence) this.f6534e.get(i15);
            if (charSequence == null) {
                i11 = i14;
                z = z4;
                i8 = scrollX;
                i9 = minimumHeight;
                i10 = size;
                i4 = i13;
                z2 = z3;
                i5 = height;
                i7 = i15;
                canvas2 = canvas3;
            } else {
                int length = charSequence.length();
                int i16 = minimumHeight;
                C1146i c1146i2 = (C1146i) m1174a;
                paint.setColor(c1146i2.f4264c);
                int i17 = height;
                if (!this.f6546q || ((i15 != 1 || z4) && !(i15 == 0 && z4))) {
                    if (i15 != 0 || (length == 1 && size > 1)) {
                        i2 = c1146i2.f4263b;
                    }
                    i3 = this.f6532c[i15];
                    if (i3 == 0) {
                        i3 = (int) ((this.f6535f * 2.0f) + paint.measureText(charSequence, 0, length));
                        this.f6532c[i15] = i3;
                    }
                    this.f6533d[i15] = i14;
                    int i18 = size;
                    if (i13 != -1 || z3 || (i12 = i13 + scrollX) < i14 || i12 >= i14 + i3) {
                        c1146i = c1146i2;
                        i4 = i13;
                        i5 = i17;
                    } else {
                        if (canvas4 == null || this.f6552w) {
                            c1146i = c1146i2;
                            i4 = i13;
                            i5 = i17;
                        } else {
                            canvas4.translate(i14, 0.0f);
                            c1146i = c1146i2;
                            i4 = i13;
                            i5 = i17;
                            this.f6550u.setBounds(0, rect.top, i3, i5);
                            this.f6550u.draw(canvas4);
                            canvas4.translate(-i14, 0.0f);
                        }
                        this.f6542m = charSequence;
                        this.f6544o = i15;
                    }
                    if (canvas4 == null) {
                        if (this.f6529A) {
                            i6 = i14;
                            i7 = i15;
                            z2 = z3;
                            z = z4;
                            i8 = scrollX;
                            canvas.drawText(charSequence, 0, length, (i3 / 2) + i14, ((int) ((paint.getTextSize() + i5) - paint.descent())) / 2, paint);
                            canvas2 = canvas;
                        } else {
                            i6 = i14;
                            i7 = i15;
                            z = z4;
                            z2 = z3;
                            i8 = scrollX;
                            float textSize = i5 - paint.getTextSize();
                            float f = ((i3 / 2) + i6) - this.f6535f;
                            float descent = ((((int) (paint.descent() + textSize)) / 2) - rect.bottom) - rect.top;
                            canvas2 = canvas;
                            canvas2.translate(f, descent);
                            this.f6538i.setTypeface(paint.getTypeface());
                            this.f6538i.setColor(paint.getColor());
                            new StaticLayout(charSequence, this.f6538i, i3, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false).draw(canvas2);
                            canvas2.translate(-f, -descent);
                        }
                        paint.setColor(c1146i.f4263b);
                        canvas2.translate(i6 + i3, 0.0f);
                        i10 = i18;
                        if (i10 <= 1 || this.f6552w || i7 == i10 - 1) {
                            i9 = i16;
                        } else {
                            i9 = i16;
                            canvas2.translate(0.0f, i9);
                            this.f6548s.draw(canvas2);
                            canvas2.translate(0.0f, -i9);
                        }
                        canvas2.translate((-i6) - i3, 0.0f);
                        canvas4 = canvas2;
                    } else {
                        i6 = i14;
                        i7 = i15;
                        z = z4;
                        z2 = z3;
                        i8 = scrollX;
                        i9 = i16;
                        i10 = i18;
                        canvas2 = canvas;
                    }
                    paint.setTypeface(Typeface.DEFAULT);
                    i11 = i6 + i3;
                } else {
                    paint.setTypeface(Typeface.DEFAULT_BOLD);
                    i2 = c1146i2.f4262a.getDefaultColor();
                }
                paint.setColor(i2);
                i3 = this.f6532c[i15];
                if (i3 == 0) {
                }
                this.f6533d[i15] = i14;
                int i182 = size;
                if (i13 != -1) {
                }
                c1146i = c1146i2;
                i4 = i13;
                i5 = i17;
                if (canvas4 == null) {
                }
                paint.setTypeface(Typeface.DEFAULT);
                i11 = i6 + i3;
            }
            canvas3 = canvas2;
            minimumHeight = i9;
            i15 = i7 + 1;
            scrollX = i8;
            z3 = z2;
            height = i5;
            i13 = i4;
            z4 = z;
            size = i10;
            i14 = i11;
        }
        int i19 = scrollX;
        this.f6555z = i14;
        if (this.f6554y != i19) {
            int scrollX2 = getScrollX();
            int i20 = this.f6554y;
            if (i20 <= scrollX2 ? scrollX2 - 20 > i20 : (i = scrollX2 + 20) < i20) {
                scrollTo(i, getScrollY());
            } else {
                scrollTo(i20, getScrollY());
                requestLayout();
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        CharSequence charSequence;
        if (this.f6539j.onTouchEvent(motionEvent)) {
            return true;
        }
        int action = motionEvent.getAction();
        int y = (int) motionEvent.getY();
        this.f6531b = (int) motionEvent.getX();
        if (action != 1) {
            if (action == 2 && y <= 0 && this.f6542m != null) {
                this.f6540k.m451b0(this.f6542m.toString());
                m386d();
            }
        } else if (!this.f6551v && (charSequence = this.f6542m) != null) {
            if (this.f6552w) {
                CharSequence charSequence2 = (CharSequence) this.f6534e.get(0);
                if (charSequence2.length() >= 2 && !this.f6541l) {
                    this.f6540k.m466K(charSequence2.toString());
                }
            } else if (!this.f6541l) {
                AnySoftKeyboardSuggestions anySoftKeyboardSuggestions = this.f6540k;
                anySoftKeyboardSuggestions.mo432X(this.f6544o, charSequence, anySoftKeyboardSuggestions.f6400W);
            } else if (this.f6544o == 1 && !TextUtils.isEmpty(this.f6543n)) {
                this.f6540k.m451b0(this.f6543n.toString());
            }
        }
        invalidate();
        return true;
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1760z0
    public void setKeyboardTheme(C1237f c1237f) {
        Context context = getContext();
        InterfaceC1423a interfaceC1423a = c1237f.f4712h;
        int[] mo1065a = interfaceC1423a.mo1065a(AbstractC2062a0.AnyKeyboardViewTheme);
        TypedArray obtainStyledAttributes = c1237f.m1062a().obtainStyledAttributes(c1237f.f4414k, mo1065a);
        int i = 1;
        this.f6536g.f4269c.f4262a = new ColorStateList(new int[][]{new int[]{0}}, new int[]{AbstractC0472e.m2431b(context, R.color.candidate_normal)});
        this.f6536g.f4269c.f4264c = AbstractC0472e.m2431b(context, R.color.candidate_recommended);
        this.f6536g.f4269c.f4263b = AbstractC0472e.m2431b(context, R.color.candidate_other);
        this.f6535f = context.getResources().getDimensionPixelSize(R.dimen.candidate_strip_x_gap);
        this.f6548s = null;
        this.f6549t = null;
        this.f6550u = null;
        setBackgroundDrawable(null);
        setBackgroundColor(-16777216);
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.candidate_font_height);
        int indexCount = obtainStyledAttributes.getIndexCount();
        int i2 = 0;
        while (i2 < indexCount) {
            int index = obtainStyledAttributes.getIndex(i2);
            try {
                switch (interfaceC1423a.mo1064b(mo1065a[index])) {
                    case R.attr.suggestionBackgroundImage /* 2130969481 */:
                        Drawable drawable = obtainStyledAttributes.getDrawable(index);
                        if (drawable == null) {
                            break;
                        } else {
                            setBackgroundColor(0);
                            C1147j c1147j = this.f6536g;
                            Drawable drawable2 = c1147j.f4269c.f4265d;
                            if (drawable2 != null) {
                                drawable2.clearColorFilter();
                            }
                            c1147j.f4269c.f4266e = drawable;
                            c1147j.m1173b();
                            setBackgroundDrawable(((C1146i) this.f6536g.m1174a()).f4266e);
                            break;
                        }
                    case R.attr.suggestionCloseImage /* 2130969482 */:
                        this.f6549t = obtainStyledAttributes.getDrawable(index);
                        break;
                    case R.attr.suggestionDividerImage /* 2130969483 */:
                        this.f6548s = obtainStyledAttributes.getDrawable(index);
                        break;
                    case R.attr.suggestionNormalTextColor /* 2130969484 */:
                        this.f6536g.f4269c.f4264c = obtainStyledAttributes.getColor(index, AbstractC0472e.m2431b(context, R.color.candidate_normal));
                        break;
                    case R.attr.suggestionOthersTextColor /* 2130969485 */:
                        this.f6536g.f4269c.f4263b = obtainStyledAttributes.getColor(index, AbstractC0472e.m2431b(context, R.color.candidate_other));
                        break;
                    case R.attr.suggestionRecommendedTextColor /* 2130969487 */:
                        C1147j c1147j2 = this.f6536g;
                        try {
                            int[][] iArr = new int[i];
                            try {
                                int[] iArr2 = new int[i];
                                iArr2[0] = 0;
                                iArr[0] = iArr2;
                                int[] iArr3 = new int[i];
                                iArr3[0] = obtainStyledAttributes.getColor(index, AbstractC0472e.m2431b(context, R.color.candidate_recommended));
                                c1147j2.f4269c.f4262a = new ColorStateList(iArr, iArr3);
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                        }
                        break;
                    case R.attr.suggestionSelectionHighlight /* 2130969489 */:
                        this.f6550u = obtainStyledAttributes.getDrawable(index);
                        break;
                    case R.attr.suggestionTextSize /* 2130969491 */:
                        dimensionPixelSize = obtainStyledAttributes.getDimension(index, dimensionPixelSize);
                        break;
                    case R.attr.suggestionWordXGap /* 2130969492 */:
                        this.f6535f = obtainStyledAttributes.getDimension(index, this.f6535f);
                        break;
                }
            } catch (Exception unused3) {
            }
            i2++;
            i = 1;
        }
        obtainStyledAttributes.recycle();
        if (this.f6548s == null) {
            this.f6548s = AbstractC0472e.m2430c(context, R.drawable.dark_suggestions_divider);
        }
        if (this.f6549t == null) {
            this.f6549t = AbstractC0472e.m2430c(context, R.drawable.close_suggestions_strip_icon);
        }
        if (this.f6550u == null) {
            this.f6550u = AbstractC0472e.m2430c(context, R.drawable.dark_candidate_selected_background);
        }
        this.f6537h.setColor(((C1146i) this.f6536g.m1174a()).f4262a.getDefaultColor());
        this.f6537h.setAntiAlias(true);
        this.f6537h.setTextSize(dimensionPixelSize);
        this.f6537h.setStrokeWidth(0.0f);
        this.f6537h.setTextAlign(Paint.Align.CENTER);
        this.f6538i.set(this.f6537h);
    }

    public void setService(AnySoftKeyboardSuggestions anySoftKeyboardSuggestions) {
        this.f6540k = anySoftKeyboardSuggestions;
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1760z0
    public void setThemeOverlay(C1138a c1138a) {
        C1147j c1147j = this.f6536g;
        c1147j.f4268b = c1138a;
        c1147j.m1173b();
        setBackgroundDrawable(((C1146i) this.f6536g.m1174a()).f4266e);
        invalidate();
    }
}