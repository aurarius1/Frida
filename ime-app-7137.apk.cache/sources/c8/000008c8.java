package com.anysoftkeyboard.keyboards.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p010b.p036g.C0378b;
import p010b.p046j.p047d.AbstractC0472e;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p086w.AbstractC1077v0;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p097b.p099b0.C1138a;
import p093c.p097b.p099b0.C1144g;
import p093c.p097b.p099b0.C1146i;
import p093c.p097b.p099b0.C1147j;
import p093c.p097b.p099b0.InterfaceC1148k;
import p093c.p097b.p100c0.C1151a0;
import p093c.p097b.p100c0.EnumC1178v;
import p093c.p097b.p105f0.C1215b;
import p093c.p097b.p107h0.C1237f;
import p093c.p097b.p107h0.C1238g;
import p093c.p097b.p116p.AbstractC1427e;
import p093c.p097b.p116p.C1433k;
import p093c.p097b.p119s.p120b.AbstractC1441a;
import p093c.p097b.p128x.InterfaceC1566d3;
import p093c.p097b.p130z.AbstractC1681l0;
import p093c.p097b.p130z.AbstractC1762t;
import p093c.p097b.p130z.C1766x;
import p093c.p097b.p130z.InterfaceC1677j0;
import p093c.p097b.p130z.Key;
import p093c.p097b.p130z.p132r0.C1701b0;
import p093c.p097b.p130z.p132r0.C1714c0;
import p093c.p097b.p130z.p132r0.C1716d0;
import p093c.p097b.p130z.p132r0.C1734m0;
import p093c.p097b.p130z.p132r0.C1738o0;
import p093c.p097b.p130z.p132r0.C1740p0;
import p093c.p097b.p130z.p132r0.C1746s0;
import p093c.p097b.p130z.p132r0.C1750u0;
import p093c.p097b.p130z.p132r0.C1752v0;
import p093c.p097b.p130z.p132r0.C1753w;
import p093c.p097b.p130z.p132r0.HandlerC1694a0;
import p093c.p097b.p130z.p132r0.InterfaceC1748t0;
import p093c.p097b.p130z.p132r0.InterfaceC1754w0;
import p093c.p097b.p130z.p132r0.KeyDetector;
import p093c.p097b.p130z.p132r0.PointerTracker;
import p093c.p097b.p130z.p132r0.p134b1.C1710i;
import p093c.p097b.p130z.p132r0.p134b1.C1712k;
import p093c.p097b.p130z.p132r0.p134b1.InterfaceC1706e;
import p093c.p137d.p138a.p139a.C1785g;
import p093c.p176h.p177a.p178a.AbstractC2062a0;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.p187m.C2111b;
import p183e.p184a.p189o.InterfaceC2119a;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p189o.InterfaceC2124f;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p192b.AbstractC2146l;
import p183e.p184a.p203s.AbstractC2285j;
import p183e.p184a.p203s.C2277b;

/* loaded from: classes.dex */
public class AnyKeyboardViewBase extends View implements InterfaceC1566d3, InterfaceC1754w0 {

    /* renamed from: b */
    public static final int[] f6462b = {R.attr.action_done, R.attr.action_search, R.attr.action_go};

    /* renamed from: c */
    public static final int[] f6463c = {R.attr.key_type_function, R.attr.key_type_action};

    /* renamed from: A */
    public CharSequence f6464A;

    /* renamed from: B */
    public int f6465B;

    /* renamed from: C */
    public int f6466C;

    /* renamed from: D */
    public int f6467D;

    /* renamed from: E */
    public int f6468E;

    /* renamed from: F */
    public int f6469F;

    /* renamed from: G */
    public C1738o0 f6470G;

    /* renamed from: H */
    public float f6471H;

    /* renamed from: I */
    public Paint.FontMetrics f6472I;

    /* renamed from: J */
    public Typeface f6473J;

    /* renamed from: K */
    public float f6474K;

    /* renamed from: L */
    public Paint.FontMetrics f6475L;

    /* renamed from: M */
    public float f6476M;

    /* renamed from: N */
    public Paint.FontMetrics f6477N;

    /* renamed from: O */
    public float f6478O;

    /* renamed from: P */
    public float f6479P;

    /* renamed from: Q */
    public Paint.FontMetrics f6480Q;

    /* renamed from: R */
    public int f6481R;

    /* renamed from: S */
    public int f6482S;

    /* renamed from: T */
    public int f6483T;

    /* renamed from: U */
    public int f6484U;

    /* renamed from: V */
    public int f6485V;

    /* renamed from: W */
    public int f6486W;

    /* renamed from: a0 */
    public float f6487a0;

    /* renamed from: b0 */
    public AbstractC1762t f6488b0;

    /* renamed from: c0 */
    public CharSequence f6489c0;

    /* renamed from: d */
    public final C1433k f6490d;

    /* renamed from: d0 */
    public Key[] f6491d0;

    /* renamed from: e */
    public final Paint f6492e;

    /* renamed from: e0 */
    public InterfaceC1706e f6493e0;

    /* renamed from: f */
    public final C1740p0 f6494f;

    /* renamed from: f0 */
    public long f6495f0;

    /* renamed from: g */
    public final C1712k f6496g;

    /* renamed from: g0 */
    public Key f6497g0;

    /* renamed from: h */
    public final HandlerC1694a0 f6498h;

    /* renamed from: h0 */
    public boolean f6499h0;

    /* renamed from: i */
    public final C1701b0 f6500i;

    /* renamed from: i0 */
    public int f6501i0;

    /* renamed from: j */
    public final int f6502j;

    /* renamed from: j0 */
    public int f6503j0;

    /* renamed from: k */
    public final SparseArray f6504k;

    /* renamed from: k0 */
    public boolean f6505k0;

    /* renamed from: l */
    public final SparseArray f6506l;

    /* renamed from: l0 */
    public boolean f6507l0;

    /* renamed from: m */
    public final C1752v0 f6508m;

    /* renamed from: m0 */
    public boolean f6509m0;

    /* renamed from: n */
    public final SparseArray f6510n;

    /* renamed from: n0 */
    public int f6511n0;

    /* renamed from: o */
    public final KeyDetector f6512o;

    /* renamed from: o0 */
    public final float f6513o0;

    /* renamed from: p */
    public final Rect f6514p;

    /* renamed from: p0 */
    public final AbstractC2285j f6515p0;

    /* renamed from: q */
    public final Rect f6516q;

    /* renamed from: q0 */
    public float f6517q0;

    /* renamed from: r */
    public final Rect f6518r;

    /* renamed from: r0 */
    public C1138a f6519r0;

    /* renamed from: s */
    public final Map f6520s;

    /* renamed from: s0 */
    public final C1147j f6521s0;

    /* renamed from: t */
    public final C2111b f6522t;

    /* renamed from: u */
    public InterfaceC1748t0 f6523u;

    /* renamed from: v */
    public C1237f f6524v;

    /* renamed from: w */
    public boolean f6525w;

    /* renamed from: x */
    public float f6526x;

    /* renamed from: y */
    public float f6527y;

    /* renamed from: z */
    public CharSequence f6528z;

    public AnyKeyboardViewBase(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.style.PlainLightAnySoftKeyboard);
    }

    public AnyKeyboardViewBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6494f = new C1740p0();
        this.f6496g = new C1712k();
        this.f6500i = new C1701b0();
        this.f6504k = new SparseArray(64);
        this.f6506l = new SparseArray(64);
        this.f6508m = new C1752v0();
        this.f6510n = new SparseArray();
        this.f6514p = new Rect();
        this.f6518r = new Rect(0, 0, 0, 0);
        this.f6520s = new C0378b();
        C2111b c2111b = new C2111b();
        this.f6522t = c2111b;
        this.f6524v = null;
        this.f6469F = 0;
        this.f6473J = Typeface.DEFAULT;
        this.f6493e0 = new C1710i();
        this.f6495f0 = 0L;
        this.f6499h0 = false;
        final C2277b c2277b = new C2277b(EnumC1178v.Some);
        this.f6515p0 = c2277b;
        this.f6517q0 = 1.0f;
        this.f6519r0 = new C1138a();
        this.f6521s0 = new C1147j();
        setWillNotDraw(true);
        this.f6513o0 = getResources().getDisplayMetrics().density;
        this.f6490d = new C1433k(context, context);
        this.f6498h = new HandlerC1694a0(this);
        Paint paint = new Paint();
        this.f6492e = paint;
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setAlpha(255);
        this.f6516q = new Rect(0, 0, 0, 0);
        this.f6512o = mo406g(getResources().getDimension(R.dimen.mini_keyboard_slide_allowance));
        this.f6502j = 50;
        this.f6528z = getResources().getString(R.string.change_lang_regular);
        this.f6464A = getResources().getString(R.string.change_symbols_regular);
        C1151a0 m182t = AnyApplication.m182t(context);
        AbstractC2094b abstractC2094b = ((C1785g) m182t.m1172a(R.string.settings_key_show_keyboard_name_text_key, R.bool.settings_default_show_keyboard_name_text_value)).f5459e;
        InterfaceC2123e interfaceC2123e = new InterfaceC2123e() { // from class: c.b.z.r0.f
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnyKeyboardViewBase anyKeyboardViewBase = AnyKeyboardViewBase.this;
                anyKeyboardViewBase.getClass();
                anyKeyboardViewBase.f6507l0 = ((Boolean) obj).booleanValue();
            }
        };
        C1215b c1215b = new C1215b("failed to get settings_default_show_keyboard_name_text_value");
        InterfaceC2119a interfaceC2119a = AbstractC2146l.f7038c;
        InterfaceC2123e interfaceC2123e2 = AbstractC2146l.f7039d;
        c2111b.mo117c(abstractC2094b.m164N(interfaceC2123e, c1215b, interfaceC2119a, interfaceC2123e2));
        c2111b.mo117c(((C1785g) m182t.m1172a(R.string.settings_key_show_hint_text_key, R.bool.settings_default_show_hint_text_value)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.z.r0.o
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnyKeyboardViewBase anyKeyboardViewBase = AnyKeyboardViewBase.this;
                anyKeyboardViewBase.getClass();
                anyKeyboardViewBase.f6509m0 = ((Boolean) obj).booleanValue();
            }
        }, new C1215b("failed to get settings_default_show_hint_text_value"), interfaceC2119a, interfaceC2123e2));
        AbstractC2094b abstractC2094b2 = ((C1785g) m182t.m1172a(R.string.settings_key_use_custom_hint_align_key, R.bool.settings_default_use_custom_hint_align_value)).f5459e;
        AbstractC2094b abstractC2094b3 = ((C1785g) m182t.m1170c(R.string.settings_key_custom_hint_align_key, R.string.settings_default_custom_hint_align_value)).f5459e;
        C1753w c1753w = new InterfaceC2127i() { // from class: c.b.z.r0.w
            @Override // p183e.p184a.p189o.InterfaceC2127i
            /* renamed from: a */
            public final Object mo24a(Object obj) {
                return Integer.valueOf(Integer.parseInt((String) obj));
            }
        };
        c2111b.mo117c(AbstractC2094b.m151n(abstractC2094b2, abstractC2094b3.m172F(c1753w), ((C1785g) m182t.m1170c(R.string.settings_key_custom_hint_valign_key, R.string.settings_default_custom_hint_valign_value)).f5459e.m172F(c1753w), new InterfaceC2124f() { // from class: c.b.z.r0.q
            @Override // p183e.p184a.p189o.InterfaceC2124f
            /* renamed from: a */
            public final Object mo126a(Object obj, Object obj2, Object obj3) {
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj3;
                int[] iArr = AnyKeyboardViewBase.f6462b;
                return Integer.valueOf(((Boolean) obj).booleanValue() ? num.intValue() | num2.intValue() : 0);
            }
        }).m164N(new InterfaceC2123e() { // from class: c.b.z.r0.p
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnyKeyboardViewBase anyKeyboardViewBase = AnyKeyboardViewBase.this;
                anyKeyboardViewBase.getClass();
                anyKeyboardViewBase.f6511n0 = ((Integer) obj).intValue();
            }
        }, new C1215b("failed to get calculate hint-gravity"), interfaceC2119a, interfaceC2123e2));
        c2111b.mo117c(((C1785g) m182t.m1170c(R.string.settings_key_swipe_distance_threshold, R.string.settings_default_swipe_distance_threshold)).f5459e.m172F(c1753w).m164N(new InterfaceC2123e() { // from class: c.b.z.r0.h
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnyKeyboardViewBase anyKeyboardViewBase = AnyKeyboardViewBase.this;
                anyKeyboardViewBase.getClass();
                anyKeyboardViewBase.f6466C = (int) (((Integer) obj).intValue() * anyKeyboardViewBase.f6513o0);
                anyKeyboardViewBase.m408e();
            }
        }, new C1215b("failed to get settings_key_swipe_distance_threshold"), interfaceC2119a, interfaceC2123e2));
        c2111b.mo117c(((C1785g) m182t.m1170c(R.string.settings_key_swipe_velocity_threshold, R.string.settings_default_swipe_velocity_threshold)).f5459e.m172F(c1753w).m164N(new InterfaceC2123e() { // from class: c.b.z.r0.l
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnyKeyboardViewBase anyKeyboardViewBase = AnyKeyboardViewBase.this;
                anyKeyboardViewBase.getClass();
                anyKeyboardViewBase.f6465B = (int) (((Integer) obj).intValue() * anyKeyboardViewBase.f6513o0);
            }
        }, new C1215b("failed to get settings_default_swipe_velocity_threshold"), interfaceC2119a, interfaceC2123e2));
        c2111b.mo117c(((C1785g) m182t.m1170c(R.string.settings_key_theme_case_type_override, R.string.settings_default_theme_case_type_override)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.z.r0.n
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                char c;
                AnyKeyboardViewBase anyKeyboardViewBase = AnyKeyboardViewBase.this;
                String str = (String) obj;
                int[] iArr = AnyKeyboardViewBase.f6462b;
                anyKeyboardViewBase.getClass();
                str.hashCode();
                int hashCode = str.hashCode();
                if (hashCode == 3005871) {
                    if (str.equals("auto")) {
                        c = 0;
                    }
                    c = 65535;
                } else if (hashCode != 103164673) {
                    if (hashCode == 111499426 && str.equals("upper")) {
                        c = 2;
                    }
                    c = 65535;
                } else {
                    if (str.equals("lower")) {
                        c = 1;
                    }
                    c = 65535;
                }
                if (c == 0) {
                    anyKeyboardViewBase.f6501i0 = 0;
                } else if (c == 1) {
                    anyKeyboardViewBase.f6501i0 = 1;
                } else if (c != 2) {
                    anyKeyboardViewBase.f6501i0 = -1;
                } else {
                    anyKeyboardViewBase.f6501i0 = 2;
                }
            }
        }, new C1215b("failed to get settings_key_theme_case_type_override"), interfaceC2119a, interfaceC2123e2));
        c2111b.mo117c(((C1785g) m182t.m1172a(R.string.settings_key_workaround_disable_rtl_fix, R.bool.settings_default_workaround_disable_rtl_fix)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.z.r0.e
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnyKeyboardViewBase anyKeyboardViewBase = AnyKeyboardViewBase.this;
                anyKeyboardViewBase.getClass();
                anyKeyboardViewBase.f6505k0 = ((Boolean) obj).booleanValue();
            }
        }, new C1215b("failed to get settings_key_workaround_disable_rtl_fix"), interfaceC2119a, interfaceC2123e2));
        c2111b.mo117c(AbstractC1681l0.m914c(context).m164N(new InterfaceC2123e() { // from class: c.b.z.r0.g
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnyKeyboardViewBase anyKeyboardViewBase = AnyKeyboardViewBase.this;
                anyKeyboardViewBase.getClass();
                anyKeyboardViewBase.f6517q0 = ((Float) obj).floatValue();
                anyKeyboardViewBase.f6520s.clear();
                anyKeyboardViewBase.m395r();
            }
        }, new C1215b("Failed to getKeyboardHeightFactor"), interfaceC2119a, interfaceC2123e2));
        c2111b.mo117c(((C1785g) m182t.m1170c(R.string.settings_key_hint_size, R.string.settings_key_hint_size_default)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.z.r0.j
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                float f;
                AnyKeyboardViewBase anyKeyboardViewBase = AnyKeyboardViewBase.this;
                String str = (String) obj;
                int[] iArr = AnyKeyboardViewBase.f6462b;
                anyKeyboardViewBase.getClass();
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case 97536:
                        if (str.equals("big")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3387192:
                        if (str.equals("none")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 109548807:
                        if (str.equals("small")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        f = 1.3f;
                        break;
                    case 1:
                        f = 0.0f;
                        break;
                    case 2:
                        f = 0.7f;
                        break;
                    default:
                        f = 1.0f;
                        break;
                }
                anyKeyboardViewBase.f6479P = f;
            }
        }, new C1215b("failed to get settings_key_hint_size"), interfaceC2119a, interfaceC2123e2));
        c2111b.mo117c(EnumC1178v.m1160a(context).m164N(new InterfaceC2123e() { // from class: c.b.z.r0.v
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AbstractC2285j.this.mo25g((EnumC1178v) obj);
            }
        }, new C1215b("mAnimationLevelSubject"), interfaceC2119a, interfaceC2123e2));
        c2111b.mo117c(((C1785g) m182t.m1170c(R.string.settings_key_long_press_timeout, R.string.settings_default_long_press_timeout)).f5459e.m172F(c1753w).m164N(new InterfaceC2123e() { // from class: c.b.z.r0.i
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                C1752v0 c1752v0 = AnyKeyboardViewBase.this.f6508m;
                int intValue = ((Integer) obj).intValue();
                c1752v0.f5381c = intValue;
                c1752v0.f5380b = intValue;
            }
        }, new C1215b("failed to get settings_key_long_press_timeout"), interfaceC2119a, interfaceC2123e2));
        c2111b.mo117c(((C1785g) m182t.m1170c(R.string.settings_key_long_press_timeout, R.string.settings_default_long_press_timeout)).f5459e.m172F(c1753w).m164N(new InterfaceC2123e() { // from class: c.b.z.r0.k
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                C1752v0 c1752v0 = AnyKeyboardViewBase.this.f6508m;
                int intValue = ((Integer) obj).intValue();
                c1752v0.f5381c = intValue;
                c1752v0.f5380b = intValue;
            }
        }, new C1215b("failed to get settings_key_long_press_timeout"), interfaceC2119a, interfaceC2123e2));
        c2111b.mo117c(((C1785g) m182t.m1170c(R.string.settings_key_multitap_timeout, R.string.settings_default_multitap_timeout)).f5459e.m172F(c1753w).m164N(new InterfaceC2123e() { // from class: c.b.z.r0.m
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnyKeyboardViewBase.this.f6508m.f5382d = ((Integer) obj).intValue();
            }
        }, new C1215b("failed to get settings_key_multitap_timeout"), interfaceC2119a, interfaceC2123e2));
    }

    private void setSpecialKeyIconOrLabel(int i) {
        Key m404i = m404i(i);
        if (m404i == null || !TextUtils.isEmpty(m404i.f5219b)) {
            return;
        }
        if (m404i.f5243z == 1) {
            m404i.f5219b = m397p(i);
        } else {
            m404i.f5220c = m402k(i);
        }
    }

    /* renamed from: A */
    public final boolean m417A(C1237f c1237f, TypedArray typedArray, int i, int i2) {
        int i3;
        switch (i) {
            case R.attr.iconKeyAction /* 2130969018 */:
                i3 = 10;
                break;
            case R.attr.iconKeyArrowDown /* 2130969019 */:
                i3 = -23;
                break;
            case R.attr.iconKeyArrowLeft /* 2130969020 */:
                i3 = -20;
                break;
            case R.attr.iconKeyArrowRight /* 2130969021 */:
                i3 = -21;
                break;
            case R.attr.iconKeyArrowUp /* 2130969022 */:
                i3 = -22;
                break;
            case R.attr.iconKeyBackspace /* 2130969023 */:
                i3 = -5;
                break;
            case R.attr.iconKeyCancel /* 2130969024 */:
                i3 = -3;
                break;
            case R.attr.iconKeyClearQuickTextHistory /* 2130969025 */:
                i3 = -103;
                break;
            case R.attr.iconKeyClipboardCopy /* 2130969026 */:
                i3 = -130;
                break;
            case R.attr.iconKeyClipboardCut /* 2130969027 */:
                i3 = -131;
                break;
            case R.attr.iconKeyClipboardFineSelect /* 2130969028 */:
                i3 = -134;
                break;
            case R.attr.iconKeyClipboardPaste /* 2130969029 */:
                i3 = -132;
                break;
            case R.attr.iconKeyClipboardSelect /* 2130969030 */:
                i3 = -135;
                break;
            case R.attr.iconKeyCondenseCompactToLeft /* 2130969031 */:
                i3 = -112;
                break;
            case R.attr.iconKeyCondenseCompactToRight /* 2130969032 */:
                i3 = -113;
                break;
            case R.attr.iconKeyCondenseNormal /* 2130969033 */:
                i3 = -111;
                break;
            case R.attr.iconKeyCondenseSplit /* 2130969034 */:
                i3 = -110;
                break;
            case R.attr.iconKeyControl /* 2130969035 */:
                i3 = -11;
                break;
            case R.attr.iconKeyForwardDelete /* 2130969036 */:
                i3 = -8;
                break;
            case R.attr.iconKeyGlobe /* 2130969037 */:
                i3 = -99;
                break;
            case R.attr.iconKeyImageInsert /* 2130969038 */:
                i3 = -140;
                break;
            case R.attr.iconKeyInputClear /* 2130969039 */:
            case R.attr.iconKeyInputClipboardCopy /* 2130969040 */:
            case R.attr.iconKeyInputClipboardCut /* 2130969041 */:
            case R.attr.iconKeyInputClipboardPaste /* 2130969042 */:
            case R.attr.iconKeyInputSelectAll /* 2130969045 */:
            default:
                i3 = 0;
                break;
            case R.attr.iconKeyInputMoveEnd /* 2130969043 */:
                i3 = -25;
                break;
            case R.attr.iconKeyInputMoveHome /* 2130969044 */:
                i3 = -24;
                break;
            case R.attr.iconKeyMic /* 2130969046 */:
                i3 = -4;
                break;
            case R.attr.iconKeyQuickText /* 2130969047 */:
                i3 = -10;
                break;
            case R.attr.iconKeyQuickTextPopup /* 2130969048 */:
                i3 = -102;
                break;
            case R.attr.iconKeyRedo /* 2130969049 */:
                i3 = -137;
                break;
            case R.attr.iconKeySettings /* 2130969050 */:
                i3 = -100;
                break;
            case R.attr.iconKeyShift /* 2130969051 */:
                i3 = -1;
                break;
            case R.attr.iconKeySpace /* 2130969052 */:
                i3 = 32;
                break;
            case R.attr.iconKeyTab /* 2130969053 */:
                i3 = 9;
                break;
            case R.attr.iconKeyUndo /* 2130969054 */:
                i3 = -136;
                break;
        }
        if (i3 == 0) {
            typedArray.getResourceId(i2, 0);
            return false;
        }
        SparseArray sparseArray = this.f6504k;
        int resourceId = typedArray.getResourceId(i2, 0);
        if (resourceId != 0) {
            sparseArray.put(i3, new C1734m0(c1237f, resourceId));
            this.f6504k.size();
            typedArray.getResourceId(i2, 0);
            return true;
        }
        throw new IllegalArgumentException(AbstractC1124a.m1193c("No resource ID was found at index ", i2));
    }

    /* renamed from: B */
    public void mo380B(AbstractC1762t abstractC1762t, float f) {
        if (this.f6488b0 != null) {
            this.f6493e0.mo878b();
        }
        if (this.f6524v != null) {
            setWillNotDraw(false);
        }
        this.f6498h.m890a();
        this.f6493e0.mo878b();
        this.f6488b0 = abstractC1762t;
        this.f6489c0 = abstractC1762t.mo824r();
        KeyDetector keyDetector = this.f6512o;
        keyDetector.f5339h = abstractC1762t.f5144n;
        keyDetector.f5332a = abstractC1762t;
        Key[] keyArr = (Key[]) abstractC1762t.f5147q.toArray(new Key[0]);
        keyDetector.f5334c = keyArr;
        this.f6491d0 = keyArr;
        KeyDetector keyDetector2 = this.f6512o;
        keyDetector2.f5335d = -getPaddingLeft();
        keyDetector2.f5336e = (int) ((-getPaddingTop()) + f);
        int size = this.f6510n.size();
        for (int i = 0; i < size; i++) {
            ((PointerTracker) this.f6510n.valueAt(i)).m845k(this.f6491d0, this.f6487a0);
        }
        m414E();
        requestLayout();
        this.f6525w = true;
        m395r();
        Key[] keyArr2 = this.f6491d0;
        if (keyArr2 != null) {
            int length = keyArr2.length;
            int i2 = 0;
            for (Key key : keyArr2) {
                i2 += Math.min(key.width, key.height) + key.f5224g;
            }
            if (i2 >= 0 && length != 0) {
                int i3 = (int) ((i2 * 1.4f) / length);
                this.f6512o.f5338g = i3 * i3;
            }
        }
        m408e();
    }

    /* renamed from: C */
    public final void m416C(AbstractC1762t abstractC1762t, CharSequence charSequence, CharSequence charSequence2) {
        this.f6528z = charSequence;
        if (TextUtils.isEmpty(charSequence)) {
            this.f6528z = getResources().getString(R.string.change_lang_regular);
        }
        this.f6464A = charSequence2;
        if (TextUtils.isEmpty(charSequence2)) {
            this.f6464A = getResources().getString(R.string.change_symbols_regular);
        }
        mo380B(abstractC1762t, this.f6527y);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0028  */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m415D(boolean z) {
        boolean z2;
        AbstractC1762t abstractC1762t = this.f6488b0;
        if (abstractC1762t != null) {
            if (abstractC1762t.mo829v()) {
                int i = abstractC1762t.f5419z;
                if (!z) {
                    abstractC1762t.f5419z = 0;
                } else if (i == 0) {
                    abstractC1762t.f5419z = 1;
                }
                if (abstractC1762t.f5419z != i) {
                    z2 = true;
                    if (z2) {
                        m395r();
                        return true;
                    }
                }
            } else if (abstractC1762t.f5143m != z) {
                abstractC1762t.f5143m = z;
            }
            z2 = false;
            if (z2) {
            }
        }
        return false;
    }

    /* renamed from: E */
    public final void m414E() {
        Key m404i = m404i(10);
        if (m404i != null) {
            m404i.f5220c = null;
            m404i.f5221d = null;
            m404i.f5219b = null;
            m404i.f5209A = null;
            Drawable m401l = m401l(m404i, false);
            if (m401l != null) {
                m404i.f5220c = m401l;
                m404i.f5221d = m401l;
            } else {
                CharSequence m397p = m397p(m404i.getPrimaryCode());
                m404i.f5219b = m397p;
                m404i.f5209A = m397p;
            }
            if (m404i.f5220c == null && TextUtils.isEmpty(m404i.f5219b)) {
                Drawable m402k = m402k(10);
                m402k.setState(this.f6470G.f5348h);
                m404i.f5220c = m402k;
                m404i.f5221d = m402k;
            }
        }
        setSpecialKeyIconOrLabel(-99);
        setSpecialKeyIconOrLabel(-2);
        setSpecialKeyIconOrLabel(-94);
        this.f6520s.clear();
    }

    /* renamed from: F */
    public boolean m413F(TypedArray typedArray, int[] iArr, int i, int i2) {
        switch (i) {
            case 16842964:
                Drawable drawable = typedArray.getDrawable(i2);
                if (drawable != null) {
                    C1147j c1147j = this.f6521s0;
                    Drawable drawable2 = c1147j.f4269c.f4265d;
                    if (drawable2 != null) {
                        drawable2.clearColorFilter();
                    }
                    c1147j.f4269c.f4266e = drawable;
                    c1147j.m1173b();
                    Drawable drawable3 = ((C1146i) this.f6521s0.m1174a()).f4266e;
                    AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
                    if (Build.VERSION.SDK_INT < 16) {
                        setBackgroundDrawable(drawable3);
                        break;
                    } else {
                        setBackground(drawable3);
                        break;
                    }
                } else {
                    return false;
                }
            case R.attr.backgroundDimAmount /* 2130968654 */:
                float f = typedArray.getFloat(i2, -1.0f);
                this.f6526x = f;
                if (f == -1.0f) {
                    return false;
                }
                break;
            case R.attr.keyBackground /* 2130969104 */:
                Drawable drawable4 = typedArray.getDrawable(i2);
                if (drawable4 != null) {
                    C1147j c1147j2 = this.f6521s0;
                    Drawable drawable5 = c1147j2.f4269c.f4265d;
                    if (drawable5 != null) {
                        drawable5.clearColorFilter();
                    }
                    c1147j2.f4269c.f4265d = drawable4;
                    c1147j2.m1173b();
                    break;
                } else {
                    return false;
                }
            case R.attr.labelTextSize /* 2130969135 */:
                float dimensionPixelSize = typedArray.getDimensionPixelSize(i2, -1);
                this.f6474K = dimensionPixelSize;
                if (dimensionPixelSize != -1.0f) {
                    this.f6474K = dimensionPixelSize * this.f6517q0;
                    break;
                } else {
                    return false;
                }
            case R.attr.previewAnimationType /* 2130969355 */:
                int integer = typedArray.getInteger(i2, -1);
                if (integer != -1) {
                    this.f6496g.f5296g = integer;
                    break;
                } else {
                    return false;
                }
            case R.attr.verticalCorrection /* 2130969644 */:
                float dimensionPixelOffset = typedArray.getDimensionPixelOffset(i2, -1);
                this.f6527y = dimensionPixelOffset;
                if (dimensionPixelOffset == -1.0f) {
                    return false;
                }
                break;
            default:
                switch (i) {
                    case 16842966:
                        iArr[0] = typedArray.getDimensionPixelSize(i2, -1);
                        if (iArr[0] == -1) {
                            return false;
                        }
                        break;
                    case 16842967:
                        iArr[1] = typedArray.getDimensionPixelSize(i2, -1);
                        if (iArr[1] == -1) {
                            return false;
                        }
                        break;
                    case 16842968:
                        iArr[2] = typedArray.getDimensionPixelSize(i2, -1);
                        if (iArr[2] == -1) {
                            return false;
                        }
                        break;
                    case 16842969:
                        iArr[3] = typedArray.getDimensionPixelSize(i2, -1);
                        if (iArr[3] != -1) {
                            this.f6494f.f5361g = iArr[3];
                            break;
                        } else {
                            return false;
                        }
                    default:
                        switch (i) {
                            case R.attr.hintLabelAlign /* 2130969004 */:
                                this.f6481R = typedArray.getInt(i2, 5);
                                break;
                            case R.attr.hintLabelVAlign /* 2130969005 */:
                                this.f6482S = typedArray.getInt(i2, 80);
                                break;
                            default:
                                switch (i) {
                                    case R.attr.hintTextColor /* 2130969009 */:
                                        this.f6521s0.f4269c.f4263b = typedArray.getColor(i2, -16777216);
                                        break;
                                    case R.attr.hintTextSize /* 2130969010 */:
                                        float dimensionPixelSize2 = typedArray.getDimensionPixelSize(i2, -1);
                                        this.f6478O = dimensionPixelSize2;
                                        if (dimensionPixelSize2 != -1.0f) {
                                            this.f6478O = dimensionPixelSize2 * this.f6517q0;
                                            break;
                                        } else {
                                            return false;
                                        }
                                    default:
                                        switch (i) {
                                            case R.attr.keyHorizontalGap /* 2130969106 */:
                                                float dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(i2, -1);
                                                if (dimensionPixelOffset2 != -1.0f) {
                                                    this.f6494f.f5356b = dimensionPixelOffset2;
                                                    break;
                                                } else {
                                                    return false;
                                                }
                                            case R.attr.keyHysteresisDistance /* 2130969107 */:
                                                float dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(i2, -1);
                                                this.f6487a0 = dimensionPixelOffset3;
                                                if (dimensionPixelOffset3 == -1.0f) {
                                                    return false;
                                                }
                                                break;
                                            default:
                                                switch (i) {
                                                    case R.attr.keyLargeHeight /* 2130969110 */:
                                                        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(i2, -1);
                                                        if (dimensionPixelOffset4 != -1) {
                                                            this.f6494f.f5360f = dimensionPixelOffset4;
                                                            break;
                                                        } else {
                                                            return false;
                                                        }
                                                    case R.attr.keyNormalHeight /* 2130969111 */:
                                                        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(i2, -1);
                                                        if (dimensionPixelOffset5 != -1) {
                                                            this.f6494f.f5358d = dimensionPixelOffset5;
                                                            break;
                                                        } else {
                                                            return false;
                                                        }
                                                    default:
                                                        switch (i) {
                                                            case R.attr.keyPreviewBackground /* 2130969114 */:
                                                                Drawable drawable6 = typedArray.getDrawable(i2);
                                                                if (drawable6 != null) {
                                                                    this.f6496g.f5292c = drawable6;
                                                                    break;
                                                                } else {
                                                                    return false;
                                                                }
                                                            case R.attr.keyPreviewLabelTextSize /* 2130969115 */:
                                                                int dimensionPixelSize3 = typedArray.getDimensionPixelSize(i2, -1);
                                                                if (dimensionPixelSize3 != -1) {
                                                                    this.f6496g.f5291b = (int) (dimensionPixelSize3 * this.f6517q0);
                                                                    break;
                                                                } else {
                                                                    return false;
                                                                }
                                                            case R.attr.keyPreviewOffset /* 2130969116 */:
                                                                this.f6496g.f5295f = typedArray.getDimensionPixelOffset(i2, 0);
                                                                break;
                                                            case R.attr.keyPreviewTextColor /* 2130969117 */:
                                                                this.f6496g.f5293d = typedArray.getColor(i2, 4095);
                                                                break;
                                                            case R.attr.keyPreviewTextSize /* 2130969118 */:
                                                                int dimensionPixelSize4 = typedArray.getDimensionPixelSize(i2, -1);
                                                                if (dimensionPixelSize4 != -1) {
                                                                    this.f6496g.f5290a = (int) (dimensionPixelSize4 * this.f6517q0);
                                                                    break;
                                                                } else {
                                                                    return false;
                                                                }
                                                            case R.attr.keySmallHeight /* 2130969119 */:
                                                                int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(i2, -1);
                                                                if (dimensionPixelOffset6 != -1) {
                                                                    this.f6494f.f5359e = dimensionPixelOffset6;
                                                                    break;
                                                                } else {
                                                                    return false;
                                                                }
                                                            case R.attr.keyTextCaseStyle /* 2130969120 */:
                                                                this.f6503j0 = typedArray.getInt(i2, 0);
                                                                break;
                                                            case R.attr.keyTextColor /* 2130969121 */:
                                                                ColorStateList colorStateList = typedArray.getColorStateList(i2);
                                                                if (colorStateList == null) {
                                                                    colorStateList = new ColorStateList(new int[][]{new int[]{0}}, new int[]{typedArray.getColor(i2, -16777216)});
                                                                }
                                                                this.f6521s0.f4269c.f4262a = colorStateList;
                                                                break;
                                                            case R.attr.keyTextSize /* 2130969122 */:
                                                                float dimensionPixelSize5 = typedArray.getDimensionPixelSize(i2, -1);
                                                                this.f6471H = dimensionPixelSize5;
                                                                if (dimensionPixelSize5 != -1.0f) {
                                                                    this.f6471H = dimensionPixelSize5 * this.f6517q0;
                                                                    break;
                                                                } else {
                                                                    return false;
                                                                }
                                                            case R.attr.keyTextStyle /* 2130969123 */:
                                                                int i3 = typedArray.getInt(i2, 0);
                                                                Typeface defaultFromStyle = i3 != 0 ? i3 != 1 ? i3 != 2 ? Typeface.defaultFromStyle(i3) : Typeface.defaultFromStyle(2) : Typeface.DEFAULT_BOLD : Typeface.DEFAULT;
                                                                this.f6473J = defaultFromStyle;
                                                                this.f6496g.f5294e = defaultFromStyle;
                                                                break;
                                                            case R.attr.keyVerticalGap /* 2130969124 */:
                                                                float dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(i2, -1);
                                                                if (dimensionPixelOffset7 != -1.0f) {
                                                                    this.f6494f.f5357c = dimensionPixelOffset7;
                                                                    break;
                                                                } else {
                                                                    return false;
                                                                }
                                                            default:
                                                                switch (i) {
                                                                    case R.attr.keyboardNameTextColor /* 2130969129 */:
                                                                        this.f6521s0.f4269c.f4264c = typedArray.getColor(i2, -1);
                                                                        break;
                                                                    case R.attr.keyboardNameTextSize /* 2130969130 */:
                                                                        float dimensionPixelSize6 = typedArray.getDimensionPixelSize(i2, -1);
                                                                        this.f6476M = dimensionPixelSize6;
                                                                        if (dimensionPixelSize6 != -1.0f) {
                                                                            this.f6476M = dimensionPixelSize6 * this.f6517q0;
                                                                            break;
                                                                        } else {
                                                                            return false;
                                                                        }
                                                                    default:
                                                                        switch (i) {
                                                                            case R.attr.shadowColor /* 2130969409 */:
                                                                                this.f6483T = typedArray.getColor(i2, 0);
                                                                                break;
                                                                            case R.attr.shadowOffsetX /* 2130969410 */:
                                                                                this.f6485V = typedArray.getDimensionPixelOffset(i2, 0);
                                                                                break;
                                                                            case R.attr.shadowOffsetY /* 2130969411 */:
                                                                                this.f6486W = typedArray.getDimensionPixelOffset(i2, 0);
                                                                                break;
                                                                            case R.attr.shadowRadius /* 2130969412 */:
                                                                                this.f6484U = typedArray.getDimensionPixelOffset(i2, 0);
                                                                                break;
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo412a() {
        AbstractC1762t abstractC1762t = this.f6488b0;
        return abstractC1762t != null && abstractC1762t.mo838h();
    }

    /* renamed from: b */
    public void mo411b() {
        this.f6522t.mo35e();
        mo410c();
        AbstractC1441a.m1035c(getBackground());
        m407f(false);
        this.f6504k.clear();
        this.f6523u = null;
        this.f6488b0 = null;
    }

    /* renamed from: c */
    public boolean mo410c() {
        this.f6493e0.mo878b();
        this.f6498h.m890a();
        this.f6500i.m886a();
        return false;
    }

    /* renamed from: d */
    public boolean m409d(MotionEvent motionEvent) {
        if (motionEvent != null && this.f6499h0) {
            int actionMasked = motionEvent.getActionMasked();
            if (motionEvent.getPointerCount() == 1 && (actionMasked == 3 || actionMasked == 0 || actionMasked == 1)) {
                this.f6499h0 = false;
                return actionMasked == 1;
            }
        }
        return this.f6499h0;
    }

    /* renamed from: e */
    public final void m408e() {
        AbstractC1762t keyboard;
        int mo839e;
        if (getKeyboard() == null) {
            mo839e = 0;
        } else {
            mo839e = (int) ((keyboard.mo839e() / keyboard.mo831g()) * this.f6466C);
        }
        this.f6467D = mo839e;
        this.f6468E = this.f6466C / 2;
        this.f6467D /= 2;
    }

    /* renamed from: f */
    public final void m407f(boolean z) {
        for (int i = 0; i < this.f6506l.size(); i++) {
            Drawable drawable = (Drawable) this.f6506l.valueAt(i);
            if (z) {
                this.f6521s0.getClass();
                drawable.clearColorFilter();
            }
            AbstractC1441a.m1035c(drawable);
        }
        this.f6506l.clear();
    }

    /* renamed from: g */
    public KeyDetector mo406g(float f) {
        return new C1746s0(f);
    }

    public InterfaceC1148k getCurrentResourcesHolder() {
        return this.f6521s0.m1174a();
    }

    public final KeyDetector getKeyDetector() {
        return this.f6512o;
    }

    public float getKeyTextSize() {
        return this.f6471H;
    }

    public AbstractC1762t getKeyboard() {
        return this.f6488b0;
    }

    public float getLabelTextSize() {
        return this.f6474K;
    }

    public C1237f getLastSetKeyboardTheme() {
        return this.f6524v;
    }

    public InterfaceC1748t0 getOnKeyboardActionListener() {
        return this.f6523u;
    }

    @Override // p093c.p097b.p128x.InterfaceC1566d3
    public InterfaceC1677j0 getThemedKeyboardDimens() {
        return this.f6494f;
    }

    /* renamed from: h */
    public void mo405h() {
        this.f6498h.m890a();
        this.f6493e0.mo878b();
        int size = this.f6510n.size();
        for (int i = 0; i < size; i++) {
            PointerTracker pointerTracker = (PointerTracker) this.f6510n.valueAt(i);
            m387z(3, 0L, 0, 0, pointerTracker);
            pointerTracker.f5395k = true;
        }
        this.f6499h0 = true;
    }

    /* renamed from: i */
    public Key m404i(int i) {
        if (getKeyboard() == null) {
            return null;
        }
        for (Key key : getKeyboard().f5147q) {
            if (key.getPrimaryCode() == i) {
                return key;
            }
        }
        return null;
    }

    /* renamed from: j */
    public Drawable m403j(int i) {
        Drawable drawable = (Drawable) this.f6506l.get(i);
        if (drawable == null) {
            C1734m0 c1734m0 = (C1734m0) this.f6504k.get(i);
            Drawable drawable2 = null;
            if (c1734m0 == null) {
                return null;
            }
            Drawable drawable3 = c1734m0.f5330c;
            if (drawable3 != null) {
                drawable = drawable3;
            } else {
                Context m1062a = c1734m0.f5329b.m1062a();
                if (m1062a != null) {
                    drawable2 = AbstractC0472e.m2430c(m1062a, c1734m0.f5328a);
                    c1734m0.f5330c = drawable2;
                }
                drawable = drawable2;
            }
            if (drawable != null) {
                C1147j c1147j = this.f6521s0;
                if (c1147j.f4268b.mo936a()) {
                    drawable.setColorFilter(c1147j.f4268b.f4252c, PorterDuff.Mode.SRC_IN);
                } else {
                    drawable.clearColorFilter();
                }
                this.f6506l.put(i, drawable);
                this.f6506l.size();
            }
        }
        return drawable;
    }

    /* renamed from: k */
    public final Drawable m402k(int i) {
        Drawable m403j = m403j(i);
        if (m403j != null) {
            if (i == -11) {
                AbstractC1762t abstractC1762t = this.f6488b0;
                r2 = (abstractC1762t.f5411C == null || abstractC1762t.f5409A == 0) ? false : false;
                C1738o0 c1738o0 = this.f6470G;
                if (r2) {
                    m403j.setState(c1738o0.f5346f);
                } else {
                    m403j.setState(c1738o0.f5345e);
                }
            } else if (i == -1) {
                AbstractC1762t abstractC1762t2 = this.f6488b0;
                if (abstractC1762t2.f5419z == 2) {
                    m403j.setState(this.f6470G.f5347g);
                } else if (abstractC1762t2.mo838h()) {
                    m403j.setState(this.f6470G.f5346f);
                } else {
                    m403j.setState(this.f6470G.f5345e);
                }
            } else if (i == 10) {
                int i2 = this.f6469F;
                if (i2 == 2) {
                    m403j.setState(this.f6470G.f5351k);
                } else if (i2 == 3) {
                    m403j.setState(this.f6470G.f5350j);
                } else if (i2 != 6) {
                    m403j.setState(this.f6470G.f5348h);
                } else {
                    m403j.setState(this.f6470G.f5349i);
                }
            }
        }
        return m403j;
    }

    /* renamed from: l */
    public final Drawable m401l(Key key, boolean z) {
        Drawable drawable;
        if (key.f5243z == 1) {
            return null;
        }
        if (!z || (drawable = key.f5221d) == null) {
            Drawable drawable2 = key.f5220c;
            return drawable2 != null ? drawable2 : m402k(key.getPrimaryCode());
        }
        return drawable;
    }

    /* renamed from: m */
    public int mo400m(C1237f c1237f) {
        return c1237f.f4417n;
    }

    /* renamed from: n */
    public int mo399n(C1237f c1237f) {
        return c1237f.f4415l;
    }

    /* renamed from: o */
    public PointerTracker m398o(int i) {
        Key[] keyArr = this.f6491d0;
        InterfaceC1748t0 interfaceC1748t0 = this.f6523u;
        if (this.f6510n.get(i) == null) {
            PointerTracker pointerTracker = new PointerTracker(i, this.f6498h, this.f6512o, this, this.f6508m);
            if (keyArr != null) {
                pointerTracker.m845k(keyArr, this.f6487a0);
            }
            if (interfaceC1748t0 != null) {
                pointerTracker.f5389e = interfaceC1748t0;
            }
            this.f6510n.put(i, pointerTracker);
        }
        return (PointerTracker) this.f6510n.get(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        int i;
        boolean z;
        int length;
        int i2;
        boolean z2;
        int i3;
        int colorForState;
        CharSequence charSequence;
        Drawable drawable;
        CharSequence charSequence2;
        boolean z3;
        int i4;
        Key key;
        int i5;
        int i6;
        Drawable drawable2;
        float f;
        Key key2;
        int i7;
        CharSequence charSequence3;
        String charSequence4;
        float f2;
        Paint.FontMetrics fontMetrics;
        float f3;
        float f4;
        float f5;
        int i8;
        int i9;
        super.onDraw(canvas);
        if (this.f6525w) {
            m395r();
            this.f6525w = false;
        }
        canvas.getClipBounds(this.f6514p);
        if (this.f6488b0 == null) {
            return;
        }
        Paint paint = this.f6492e;
        boolean z4 = this.f6507l0 && this.f6476M > 1.0f;
        boolean z5 = this.f6478O > 1.0f && this.f6509m0;
        C1146i c1146i = (C1146i) this.f6521s0.m1174a();
        ColorStateList colorStateList = c1146i.f4262a;
        int i10 = this.f6511n0;
        int i11 = i10 == 0 ? this.f6481R : i10 & 7;
        int i12 = i10 == 0 ? this.f6482S : i10 & 112;
        Drawable drawable3 = c1146i.f4265d;
        Rect rect = this.f6518r;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        Key[] keyArr = this.f6491d0;
        Key key3 = this.f6497g0;
        if (key3 != null && canvas.getClipBounds(rect)) {
            int i13 = key3.x;
            if ((i13 + paddingLeft) - 1 <= rect.left) {
                int i14 = key3.y;
                i = i12;
                if ((i14 + paddingTop) - 1 <= rect.top && i13 + key3.width + paddingLeft + 1 >= rect.right && i14 + key3.height + paddingTop + 1 >= rect.bottom) {
                    z = true;
                    length = keyArr.length;
                    i2 = 0;
                    while (i2 < length) {
                        Key key4 = keyArr[i2];
                        Key[] keyArr2 = keyArr;
                        boolean z6 = key4.getPrimaryCode() == 32;
                        if (!z || key3 == key4) {
                            Rect rect2 = this.f6514p;
                            Key key5 = key3;
                            int i15 = key4.x;
                            int i16 = i2;
                            int i17 = i11;
                            int i18 = key4.y;
                            z2 = z;
                            i3 = length;
                            if (rect2.intersects(i15 + paddingLeft, i18 + paddingTop, i15 + key4.width + paddingLeft, i18 + key4.height + paddingTop)) {
                                int[] mo891c = key4.mo891c(this.f6470G);
                                if (z6) {
                                    colorForState = c1146i.f4264c;
                                } else {
                                    colorForState = colorStateList.getColorForState(mo891c, -16777216);
                                }
                                paint.setColor(colorForState);
                                drawable3.setState(mo891c);
                                CharSequence charSequence5 = key4.f5219b;
                                if (charSequence5 == null) {
                                    charSequence5 = null;
                                } else if (m391v(this.f6488b0.mo838h())) {
                                    if (TextUtils.isEmpty(key4.f5209A)) {
                                        CharSequence charSequence6 = key4.f5231n;
                                        if (charSequence6 != null) {
                                            charSequence5 = charSequence6;
                                        } else if (charSequence5.length() == 1) {
                                            charSequence5 = Character.toString((char) key4.m898b(0, m391v(this.f6512o.isKeyShifted(key4))));
                                        }
                                        if (key4.f5214F) {
                                            key4.f5209A = charSequence5;
                                        }
                                    } else {
                                        charSequence5 = key4.f5209A;
                                    }
                                }
                                Rect bounds = drawable3.getBounds();
                                int i19 = key4.width;
                                if (i19 != bounds.right || key4.height != bounds.bottom) {
                                    drawable3.setBounds(0, 0, i19, key4.height);
                                }
                                canvas.translate(key4.x + paddingLeft, key4.y + paddingTop);
                                drawable3.draw(canvas);
                                if (TextUtils.isEmpty(charSequence5)) {
                                    Drawable m401l = m401l(key4, false);
                                    if (m401l != null) {
                                        boolean z7 = m401l.getCurrent() instanceof NinePatchDrawable;
                                        int intrinsicWidth = z7 ? key4.width : m401l.getIntrinsicWidth();
                                        int intrinsicHeight = z7 ? key4.height : m401l.getIntrinsicHeight();
                                        int i20 = key4.width;
                                        Rect rect3 = this.f6516q;
                                        charSequence = charSequence5;
                                        drawable = drawable3;
                                        canvas.translate((((i20 + rect3.left) - rect3.right) - intrinsicWidth) / 2, (((key4.height + rect3.top) - rect3.bottom) - intrinsicHeight) / 2);
                                        m401l.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                                        m401l.draw(canvas);
                                        canvas.translate(-i8, -i9);
                                        if (z6 && z4) {
                                            charSequence2 = this.f6489c0;
                                        }
                                    } else {
                                        drawable = drawable3;
                                        charSequence2 = m397p(key4.getPrimaryCode());
                                    }
                                    if (charSequence2 == null) {
                                        if (z6) {
                                            paint.setTextSize(this.f6476M);
                                            paint.setTypeface(Typeface.DEFAULT_BOLD);
                                            if (this.f6477N == null) {
                                                this.f6477N = paint.getFontMetrics();
                                            }
                                            fontMetrics = this.f6477N;
                                        } else if (charSequence2.length() <= 1 || key4.f5218a.length >= 2) {
                                            setPaintToKeyText(paint);
                                            if (this.f6472I == null) {
                                                this.f6472I = paint.getFontMetrics();
                                            }
                                            fontMetrics = this.f6472I;
                                        } else {
                                            setPaintForLabelText(paint);
                                            if (this.f6475L == null) {
                                                this.f6475L = paint.getFontMetrics();
                                            }
                                            fontMetrics = this.f6475L;
                                        }
                                        if (AbstractC1077v0.m1301C(charSequence2)) {
                                            paint.setTextSize(paint.getTextSize() * 2.0f);
                                        }
                                        float f6 = -fontMetrics.top;
                                        paint.setShadowLayer(this.f6484U, this.f6485V, this.f6486W, this.f6483T);
                                        int i21 = key4.width;
                                        C1714c0 c1714c0 = new C1714c0(charSequence2, i21, null);
                                        if (this.f6520s.containsKey(c1714c0)) {
                                            C1716d0 c1716d0 = (C1716d0) this.f6520s.get(c1714c0);
                                            paint.setTextSize(c1716d0.f5301a);
                                            f4 = c1716d0.f5302b;
                                            z3 = z4;
                                        } else {
                                            float textSize = paint.getTextSize();
                                            float measureText = paint.measureText(charSequence2, 0, charSequence2.length());
                                            float f7 = i21;
                                            if (measureText > f7) {
                                                textSize = this.f6471H / 1.5f;
                                                paint.setTextSize(textSize);
                                                measureText = paint.measureText(charSequence2, 0, charSequence2.length());
                                                if (measureText > f7) {
                                                    textSize = this.f6471H / 2.5f;
                                                    paint.setTextSize(textSize);
                                                    measureText = paint.measureText(charSequence2, 0, charSequence2.length());
                                                    if (measureText > f7) {
                                                        paint.setTextSize(0.0f);
                                                        measureText = paint.measureText(charSequence2, 0, charSequence2.length());
                                                        f3 = 0.0f;
                                                        z3 = z4;
                                                        this.f6520s.put(c1714c0, new C1716d0(f3, measureText, null));
                                                        f4 = measureText;
                                                    }
                                                }
                                            }
                                            f3 = textSize;
                                            z3 = z4;
                                            this.f6520s.put(c1714c0, new C1716d0(f3, measureText, null));
                                            f4 = measureText;
                                        }
                                        Rect rect4 = this.f6516q;
                                        int i22 = rect4.top;
                                        float f8 = (((key4.height - i22) - rect4.bottom) / (z6 ? 3 : 2)) + i22;
                                        int i23 = rect4.left;
                                        float f9 = (((key4.width - i23) - rect4.right) / 2) + i23;
                                        if (charSequence2.length() <= 1 || this.f6505k0) {
                                            float descent = ((f6 - paint.descent()) / 2.0f) + f8;
                                            canvas.translate(f9, descent);
                                            key2 = key4;
                                            key = key5;
                                            drawable2 = drawable;
                                            i4 = i;
                                            i5 = i16;
                                            i6 = i17;
                                            canvas.drawText(charSequence2, 0, charSequence2.length(), 0.0f, 0.0f, paint);
                                            f5 = descent;
                                        } else {
                                            f5 = f8 - ((f6 - paint.descent()) / 2.0f);
                                            canvas.translate(f9, f5);
                                            new StaticLayout(charSequence2, new TextPaint(paint), (int) f4, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false).draw(canvas);
                                            key2 = key4;
                                            i4 = i;
                                            key = key5;
                                            i5 = i16;
                                            i6 = i17;
                                            drawable2 = drawable;
                                        }
                                        canvas.translate(-f9, -f5);
                                        f = 0.0f;
                                        paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                                    } else {
                                        z3 = z4;
                                        i4 = i;
                                        key = key5;
                                        i5 = i16;
                                        i6 = i17;
                                        drawable2 = drawable;
                                        f = 0.0f;
                                        key2 = key4;
                                    }
                                    if (z5 || this.f6479P <= f || (((charSequence3 = key2.f5234q) == null || charSequence3.length() <= 0) && key2.f5239v == 0 && key2.f5211C == 0)) {
                                        i7 = i4;
                                    } else {
                                        Paint.Align textAlign = paint.getTextAlign();
                                        CharSequence charSequence7 = key2.f5210B;
                                        if (charSequence7 == null || charSequence7.length() <= 0) {
                                            int i24 = key2.f5211C;
                                            if (i24 != 0) {
                                                charSequence4 = Character.isLetterOrDigit(i24) ? new String(new int[]{key2.f5211C}, 0, 1) : "";
                                            } else {
                                                CharSequence charSequence8 = key2.f5234q;
                                                if (charSequence8 != null) {
                                                    charSequence4 = charSequence8.toString();
                                                    if (Character.codePointCount(charSequence4, 0, charSequence4.length()) > 3) {
                                                        charSequence4 = charSequence4.substring(0, Character.offsetByCodePoints(charSequence4, 0, 3));
                                                    }
                                                }
                                            }
                                        } else {
                                            charSequence4 = key2.f5210B.toString();
                                        }
                                        if (this.f6488b0.mo838h()) {
                                            charSequence4 = charSequence4.toUpperCase(getKeyboard().mo823s());
                                        }
                                        paint.setTypeface(Typeface.DEFAULT);
                                        paint.setColor(c1146i.f4263b);
                                        paint.setTextSize(this.f6478O * this.f6479P);
                                        if (this.f6480Q == null) {
                                            this.f6480Q = paint.getFontMetrics();
                                        }
                                        if (i6 == 3) {
                                            paint.setTextAlign(Paint.Align.LEFT);
                                            f2 = this.f6516q.left + 0.5f;
                                        } else if (i6 == 1) {
                                            paint.setTextAlign(Paint.Align.CENTER);
                                            Rect rect5 = this.f6516q;
                                            int i25 = rect5.left;
                                            f2 = (((key2.width - i25) - rect5.right) / 2) + i25;
                                        } else {
                                            paint.setTextAlign(Paint.Align.RIGHT);
                                            f2 = (key2.width - this.f6516q.right) - 0.5f;
                                        }
                                        i7 = i4;
                                        canvas.drawText(charSequence4, f2, i7 == 48 ? (this.f6516q.top - this.f6480Q.top) + 0.5f : ((key2.height - this.f6516q.bottom) - this.f6480Q.bottom) - 0.5f, paint);
                                        paint.setTextAlign(textAlign);
                                    }
                                    canvas.translate((-key2.x) - paddingLeft, (-key2.y) - paddingTop);
                                } else {
                                    charSequence = charSequence5;
                                    drawable = drawable3;
                                }
                                charSequence2 = charSequence;
                                if (charSequence2 == null) {
                                }
                                if (z5) {
                                }
                                i7 = i4;
                                canvas.translate((-key2.x) - paddingLeft, (-key2.y) - paddingTop);
                            } else {
                                z3 = z4;
                                i7 = i;
                                key = key5;
                                i5 = i16;
                                i6 = i17;
                                drawable2 = drawable3;
                            }
                        } else {
                            key = key3;
                            drawable2 = drawable3;
                            z2 = z;
                            i3 = length;
                            z3 = z4;
                            i7 = i;
                            i5 = i2;
                            i6 = i11;
                        }
                        i2 = i5 + 1;
                        i = i7;
                        i11 = i6;
                        key3 = key;
                        keyArr = keyArr2;
                        drawable3 = drawable2;
                        z = z2;
                        length = i3;
                        z4 = z3;
                    }
                    this.f6497g0 = null;
                    this.f6514p.setEmpty();
                }
                z = false;
                length = keyArr.length;
                i2 = 0;
                while (i2 < length) {
                }
                this.f6497g0 = null;
                this.f6514p.setEmpty();
            }
        }
        i = i12;
        z = false;
        length = keyArr.length;
        i2 = 0;
        while (i2 < length) {
        }
        this.f6497g0 = null;
        this.f6514p.setEmpty();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        AbstractC1762t abstractC1762t = this.f6488b0;
        if (abstractC1762t == null) {
            super.onMeasure(i, i2);
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft() + abstractC1762t.mo831g();
        if (View.MeasureSpec.getSize(i) < paddingRight + 10) {
            paddingRight = View.MeasureSpec.getSize(i);
        }
        setMeasuredDimension(paddingRight, getPaddingBottom() + getPaddingTop() + this.f6488b0.mo839e());
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        this.f6493e0.mo878b();
        this.f6498h.m890a();
        super.onStartTemporaryDetach();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r1 != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0140, code lost:
        if (r12 != r13) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0168, code lost:
        if (r12 != r13) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016a, code lost:
        ((com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase) r6.f5386b).m396q(r12, r6);
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f6488b0 == null) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int pointerCount = motionEvent.getPointerCount();
        int i = 1;
        if (pointerCount > 1) {
            this.f6495f0 = SystemClock.elapsedRealtime();
        }
        if (this.f6499h0) {
            if (!m409d(motionEvent)) {
                this.f6499h0 = false;
            }
            return true;
        }
        long eventTime = motionEvent.getEventTime();
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        int x = (int) motionEvent.getX(actionIndex);
        int y = (int) motionEvent.getY(actionIndex);
        if (this.f6498h.f5251b) {
            if (actionMasked == 2) {
                return true;
            }
            PointerTracker m398o = m398o(pointerId);
            if (pointerCount > 1 && !m398o.m851e()) {
                HandlerC1694a0 handlerC1694a0 = this.f6498h;
                handlerC1694a0.f5251b = false;
                handlerC1694a0.removeMessages(3);
            }
        }
        if (actionMasked != 2) {
            m387z(actionMasked, eventTime, x, y, m398o(pointerId));
            return true;
        }
        int i2 = 0;
        while (i2 < pointerCount) {
            PointerTracker m398o2 = m398o(motionEvent.getPointerId(i2));
            int x2 = (int) motionEvent.getX(i2);
            int y2 = (int) motionEvent.getY(i2);
            if (((AnyKeyboardViewBase) m398o2.f5386b).m393t()) {
                m398o2.f5393i = -1;
            } else {
                if (m398o2.f5393i >= i) {
                    m398o2.f5389e.mo428p(x2, y2, eventTime);
                }
            }
            if (!m398o2.f5395k) {
                C1750u0 c1750u0 = m398o2.f5392h;
                int i3 = c1750u0.f5373b;
                c1750u0.f5376e = x2;
                c1750u0.f5377f = y2;
                int mo842a = c1750u0.f5372a.mo842a(x2, y2, null);
                Key key = m398o2.getKey(i3);
                if (m398o2.m850f(mo842a)) {
                    if (key == null) {
                        if (m398o2.f5389e != null) {
                            Key key2 = m398o2.getKey(mo842a);
                            m398o2.f5389e.mo472n(key2.m898b(0, m398o2.mKeyDetector.isKeyShifted(key2)));
                            if (m398o2.f5394j) {
                                m398o2.f5394j = false;
                                c1750u0.f5376e = x2;
                                c1750u0.f5377f = y2;
                                mo842a = c1750u0.f5372a.mo842a(x2, y2, null);
                            }
                        }
                        c1750u0.m856a(mo842a, x2, y2);
                        m398o2.m843m(mo842a);
                    } else if (!m398o2.m852d(x2, y2, mo842a)) {
                        if (m398o2.f5389e != null && !m398o2.m853c()) {
                            m398o2.f5389e.mo447i(key.m898b(0, m398o2.mKeyDetector.isKeyShifted(key)));
                        }
                        m398o2.m846j();
                        if (m398o2.f5389e != null) {
                            Key key3 = m398o2.getKey(mo842a);
                            int i4 = m398o2.f5393i;
                            if (i4 >= 1) {
                                m398o2.f5393i = i4 + 1;
                            } else {
                                m398o2.f5389e.mo472n(key3.m898b(0, m398o2.mKeyDetector.isKeyShifted(key3)));
                            }
                            if (m398o2.f5394j) {
                                m398o2.f5394j = false;
                                c1750u0.f5376e = x2;
                                c1750u0.f5377f = y2;
                                mo842a = c1750u0.f5372a.mo842a(x2, y2, null);
                            }
                        }
                        c1750u0.m856a(mo842a, x2, y2);
                        m398o2.m843m(mo842a);
                    }
                    m398o2.m844l(c1750u0.f5373b);
                } else {
                    if (key != null && !m398o2.m852d(x2, y2, mo842a)) {
                        InterfaceC1748t0 interfaceC1748t0 = m398o2.f5389e;
                        if (interfaceC1748t0 != null) {
                            interfaceC1748t0.mo447i(key.m898b(0, m398o2.mKeyDetector.isKeyShifted(key)));
                        }
                        m398o2.m846j();
                        c1750u0.m856a(mo842a, x2, y2);
                        m398o2.f5387c.removeMessages(4);
                    }
                    m398o2.m844l(c1750u0.f5373b);
                }
            }
            i2++;
            i = 1;
        }
        return true;
    }

    /* renamed from: p */
    public final CharSequence m397p(int i) {
        Context context;
        int i2;
        if (i != -99) {
            if (i == -94) {
                return this.f6488b0 instanceof C1766x ? m397p(-99) : m397p(-2);
            } else if (i != -2) {
                if (i == 9) {
                    context = getContext();
                    i2 = R.string.label_tab_key;
                } else if (i != 10) {
                    switch (i) {
                        case -25:
                            context = getContext();
                            i2 = R.string.label_end_key;
                            break;
                        case -24:
                            context = getContext();
                            i2 = R.string.label_home_key;
                            break;
                        case -23:
                            return "▼";
                        case -22:
                            return "▲";
                        case -21:
                            return "▶";
                        case -20:
                            return "◀";
                        default:
                            return "";
                    }
                } else {
                    switch (this.f6469F) {
                        case 2:
                            context = getContext();
                            i2 = R.string.label_go_key;
                            break;
                        case 3:
                            context = getContext();
                            i2 = R.string.label_search_key;
                            break;
                        case 4:
                            context = getContext();
                            i2 = R.string.label_send_key;
                            break;
                        case 5:
                            context = getContext();
                            i2 = R.string.label_next_key;
                            break;
                        case 6:
                            context = getContext();
                            i2 = R.string.label_done_key;
                            break;
                        case 7:
                            context = getContext();
                            i2 = R.string.label_previous_key;
                            break;
                        default:
                            return "";
                    }
                }
                return context.getText(i2);
            } else {
                return this.f6464A;
            }
        }
        return this.f6528z;
    }

    /* renamed from: q */
    public void m396q(int i, PointerTracker pointerTracker) {
        Key key = pointerTracker.getKey(i);
        if (i == -1 || key == null) {
            return;
        }
        this.f6493e0.mo875e(key);
    }

    /* renamed from: r */
    public void m395r() {
        this.f6514p.union(0, 0, getWidth(), getHeight());
        invalidate();
    }

    /* renamed from: s */
    public void m394s(Key key) {
        if (key == null) {
            return;
        }
        this.f6497g0 = key;
        this.f6514p.union(getPaddingLeft() + key.x, getPaddingTop() + key.y, getPaddingLeft() + key.x + key.width, getPaddingTop() + key.y + key.height);
        invalidate(getPaddingLeft() + key.x, getPaddingTop() + key.y, getPaddingLeft() + key.x + key.width, getPaddingTop() + key.y + key.height);
    }

    public void setKeyPreviewController(InterfaceC1706e interfaceC1706e) {
        this.f6493e0 = interfaceC1706e;
    }

    @Override // p093c.p097b.p128x.InterfaceC1566d3
    public void setKeyboardActionType(int i) {
        this.f6469F = (1073741824 & i) != 0 ? 1 : i & 255;
        m414E();
    }

    public void setKeyboardTheme(C1237f c1237f) {
        int i;
        int i2;
        int i3;
        char c;
        boolean z;
        if (c1237f == this.f6524v) {
            return;
        }
        m407f(true);
        this.f6504k.clear();
        this.f6520s.clear();
        this.f6524v = c1237f;
        if (this.f6488b0 != null) {
            setWillNotDraw(false);
        }
        requestLayout();
        this.f6525w = true;
        m395r();
        int mo399n = mo399n(c1237f);
        int[] mo1065a = c1237f.f4712h.mo1065a(AbstractC2062a0.AnyKeyboardViewTheme);
        int[] mo1065a2 = c1237f.f4712h.mo1065a(AbstractC2062a0.AnyKeyboardViewIconsTheme);
        int[] iArr = {0, 0, 0, 0};
        HashSet hashSet = new HashSet();
        TypedArray obtainStyledAttributes = c1237f.m1062a().obtainStyledAttributes(mo399n, mo1065a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        int i4 = R.attr.key_type_function;
        int i5 = R.attr.key_type_action;
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = obtainStyledAttributes.getIndex(i6);
            int mo1064b = c1237f.f4712h.mo1064b(mo1065a[index]);
            try {
                z = m413F(obtainStyledAttributes, iArr, mo1064b, index);
            } catch (RuntimeException unused) {
                z = false;
            }
            if (z) {
                hashSet.add(Integer.valueOf(mo1064b));
                if (mo1064b == R.attr.keyBackground) {
                    int[] mo1065a3 = c1237f.f4712h.mo1065a(f6463c);
                    int i7 = mo1065a3[0];
                    i5 = mo1065a3[1];
                    i4 = i7;
                }
            }
        }
        obtainStyledAttributes.recycle();
        int mo400m = mo400m(c1237f);
        int i8 = R.attr.action_done;
        int i9 = R.attr.action_go;
        int i10 = R.attr.action_search;
        if (mo400m != 0) {
            TypedArray obtainStyledAttributes2 = c1237f.m1062a().obtainStyledAttributes(mo400m, mo1065a2);
            int indexCount2 = obtainStyledAttributes2.getIndexCount();
            for (int i11 = 0; i11 < indexCount2; i11++) {
                int index2 = obtainStyledAttributes2.getIndex(i11);
                int mo1064b2 = c1237f.f4712h.mo1064b(mo1065a2[index2]);
                if (m417A(c1237f, obtainStyledAttributes2, mo1064b2, index2)) {
                    hashSet.add(Integer.valueOf(mo1064b2));
                    if (mo1064b2 == R.attr.iconKeyAction) {
                        int[] mo1065a4 = c1237f.f4712h.mo1065a(f6462b);
                        i8 = mo1065a4[0];
                        i10 = mo1065a4[1];
                        i9 = mo1065a4[2];
                    }
                }
            }
            obtainStyledAttributes2.recycle();
            i = i8;
            i3 = i9;
            i2 = i10;
        } else {
            i = R.attr.action_done;
            i2 = R.attr.action_search;
            i3 = R.attr.action_go;
        }
        C1238g m190l = AnyApplication.m190l(getContext());
        C1237f c1237f2 = (C1237f) m190l.m1060d(m190l.f4418o);
        TypedArray obtainStyledAttributes3 = c1237f2.m1062a().obtainStyledAttributes(mo399n(c1237f2), AbstractC2062a0.AnyKeyboardViewTheme);
        int indexCount3 = obtainStyledAttributes3.getIndexCount();
        for (int i12 = 0; i12 < indexCount3; i12++) {
            int index3 = obtainStyledAttributes3.getIndex(i12);
            int i13 = AbstractC2062a0.AnyKeyboardViewTheme[index3];
            if (!hashSet.contains(Integer.valueOf(i13))) {
                try {
                    m413F(obtainStyledAttributes3, iArr, i13, index3);
                } catch (RuntimeException unused2) {
                }
            }
        }
        obtainStyledAttributes3.recycle();
        TypedArray obtainStyledAttributes4 = c1237f2.m1062a().obtainStyledAttributes(c1237f2.f4416m, AbstractC2062a0.AnyKeyboardViewIconsTheme);
        int indexCount4 = obtainStyledAttributes4.getIndexCount();
        for (int i14 = 0; i14 < indexCount4; i14++) {
            int index4 = obtainStyledAttributes4.getIndex(i14);
            int i15 = AbstractC2062a0.AnyKeyboardViewIconsTheme[index4];
            if (!hashSet.contains(Integer.valueOf(i15))) {
                m417A(c1237f2, obtainStyledAttributes4, i15, index4);
            }
        }
        obtainStyledAttributes4.recycle();
        this.f6470G = new C1738o0(i4, i5, i, i2, i3);
        Drawable background = super.getBackground();
        if (background != null) {
            Rect rect = new Rect();
            background.getPadding(rect);
            iArr[0] = iArr[0] + rect.left;
            iArr[1] = iArr[1] + rect.top;
            c = 2;
            iArr[2] = iArr[2] + rect.right;
            iArr[3] = iArr[3] + rect.bottom;
        } else {
            c = 2;
        }
        setPadding(iArr[0], iArr[1], iArr[c], iArr[3]);
        this.f6494f.f5355a = ((getWidth() > 0 ? getWidth() : getResources().getDisplayMetrics().widthPixels) - iArr[0]) - iArr[2];
        this.f6492e.setTextSize(this.f6471H);
    }

    @Override // p093c.p097b.p128x.InterfaceC1561c3
    public void setOnKeyboardActionListener(InterfaceC1748t0 interfaceC1748t0) {
        this.f6523u = interfaceC1748t0;
        int size = this.f6510n.size();
        for (int i = 0; i < size; i++) {
            ((PointerTracker) this.f6510n.valueAt(i)).f5389e = interfaceC1748t0;
        }
    }

    public void setPaintForLabelText(Paint paint) {
        paint.setTextSize(this.f6474K);
        paint.setTypeface(Typeface.DEFAULT_BOLD);
    }

    public void setPaintToKeyText(Paint paint) {
        paint.setTextSize(this.f6471H);
        paint.setTypeface(this.f6473J);
    }

    public void setProximityCorrectionEnabled(boolean z) {
        this.f6512o.f5337f = z;
    }

    public void setThemeOverlay(C1138a c1138a) {
        this.f6519r0 = c1138a;
        if (C1144g.f4258a) {
            m407f(true);
            C1147j c1147j = this.f6521s0;
            c1147j.f4268b = c1138a;
            c1147j.m1173b();
            Drawable drawable = ((C1146i) this.f6521s0.m1174a()).f4266e;
            AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
            if (Build.VERSION.SDK_INT >= 16) {
                setBackground(drawable);
            } else {
                setBackgroundDrawable(drawable);
            }
            m395r();
        }
    }

    public void setWatermark(List list) {
    }

    /* renamed from: t */
    public boolean m393t() {
        return SystemClock.elapsedRealtime() - this.f6495f0 < 30;
    }

    /* renamed from: u */
    public boolean mo392u() {
        return false;
    }

    /* renamed from: v */
    public final boolean m391v(boolean z) {
        int i = this.f6501i0;
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    return z;
                }
                return true;
            }
            return false;
        }
        int i2 = this.f6503j0;
        if (i2 != 1) {
            if (i2 != 2) {
                return z;
            }
            return true;
        }
        return false;
    }

    /* renamed from: w */
    public void mo390w(PointerTracker pointerTracker) {
        pointerTracker.m849g();
        this.f6500i.f5267b.remove(pointerTracker);
    }

    /* renamed from: x */
    public boolean mo389x(AbstractC1427e abstractC1427e, Key key, boolean z, PointerTracker pointerTracker) {
        if (key instanceof Key) {
            if (key.f5217I.size() > 0) {
                Object[] array = key.f5217I.toArray();
                for (int i = 0; i < array.length; i++) {
                    StringBuilder m1187i = AbstractC1124a.m1187i(":");
                    m1187i.append(array[i]);
                    array[i] = m1187i.toString();
                }
                Toast makeText = Toast.makeText(getContext().getApplicationContext(), TextUtils.join(", ", array), 0);
                makeText.setGravity(17, 0, 0);
                makeText.show();
            }
            if (key.f5211C != 0) {
                getOnKeyboardActionListener().mo379s(key.f5211C, key, 0, null, true);
                if (key.f5241x) {
                    return true;
                }
                mo390w(pointerTracker);
                return true;
            }
        }
        return false;
    }

    /* renamed from: y */
    public void mo388y(PointerTracker pointerTracker, int i, int i2, long j) {
        PointerTracker[] pointerTrackerArr;
        if (pointerTracker.m851e()) {
            this.f6500i.m885b(pointerTracker, j);
        } else {
            ArrayList arrayList = this.f6500i.f5267b;
            int i3 = -1;
            int size = arrayList.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                } else if (((PointerTracker) arrayList.get(size)) == pointerTracker) {
                    i3 = size;
                    break;
                } else {
                    size--;
                }
            }
            if (i3 < 0) {
                return;
            }
            C1701b0 c1701b0 = this.f6500i;
            for (PointerTracker pointerTracker2 : (PointerTracker[]) c1701b0.f5267b.toArray(C1701b0.f5266a)) {
                if (pointerTracker2 == pointerTracker) {
                    break;
                }
                if (!pointerTracker2.m851e()) {
                    C1750u0 c1750u0 = pointerTracker2.f5392h;
                    pointerTracker2.m848h(c1750u0.f5376e, c1750u0.f5377f, j);
                    pointerTracker2.f5395k = true;
                    c1701b0.f5267b.remove(pointerTracker2);
                }
            }
        }
        pointerTracker.m848h(i, i2, j);
        this.f6500i.f5267b.remove(pointerTracker);
    }

    /* renamed from: z */
    public final void m387z(int i, long j, int i2, int i3, PointerTracker pointerTracker) {
        if (i != 0) {
            if (i != 1) {
                if (i == 3) {
                    mo390w(pointerTracker);
                    return;
                } else if (i != 5) {
                    if (i != 6) {
                        return;
                    }
                }
            }
            mo388y(pointerTracker, i2, i3, j);
            return;
        }
        Key key = pointerTracker.getKey(pointerTracker.mKeyDetector.mo842a(i2, i3, null));
        if (key != null && key.f5236s) {
            this.f6500i.m885b(pointerTracker, j);
        }
        C1750u0 c1750u0 = pointerTracker.f5392h;
        c1750u0.f5376e = i2;
        c1750u0.f5377f = i3;
        int mo842a = c1750u0.f5372a.mo842a(i2, i3, null);
        c1750u0.m856a(mo842a, i2, i3);
        pointerTracker.f5394j = false;
        pointerTracker.f5395k = false;
        pointerTracker.f5396l = false;
        pointerTracker.f5393i = -1;
        Key key2 = pointerTracker.getKey(mo842a);
        if (key2 != null) {
            long j2 = pointerTracker.f5399o;
            C1752v0 c1752v0 = pointerTracker.f5397m;
            boolean z = j < j2 + ((long) c1752v0.f5382d) && mo842a == c1752v0.f5379a;
            if (key2.f5218a.length > 1) {
                pointerTracker.f5400p = true;
                pointerTracker.f5398n = z ? pointerTracker.f5398n + 1 : -1;
            } else if (!z) {
                pointerTracker.m846j();
            }
        }
        if (pointerTracker.f5389e != null && pointerTracker.m850f(mo842a)) {
            Key key3 = pointerTracker.mKeys[mo842a];
            int m898b = key3.m898b(0, pointerTracker.mKeyDetector.isKeyShifted(key3));
            if (!((AnyKeyboardViewBase) pointerTracker.f5386b).m393t() && pointerTracker.f5389e.mo429h(i2, i3, key3, j)) {
                pointerTracker.f5393i = 1;
            }
            if (m898b != 0) {
                pointerTracker.f5389e.mo472n(m898b);
                pointerTracker.f5389e.mo445g(m898b);
            }
            if (pointerTracker.f5394j) {
                pointerTracker.f5394j = false;
                C1750u0 c1750u02 = pointerTracker.f5392h;
                c1750u02.f5376e = i2;
                c1750u02.f5377f = i3;
                mo842a = c1750u02.f5372a.mo842a(i2, i3, null);
                c1750u02.m856a(mo842a, i2, i3);
            }
        }
        if (pointerTracker.m850f(mo842a)) {
            if (pointerTracker.mKeys[mo842a].f5241x) {
                pointerTracker.m847i(mo842a);
                HandlerC1694a0 handlerC1694a0 = pointerTracker.f5387c;
                handlerC1694a0.f5251b = true;
                handlerC1694a0.sendMessageDelayed(handlerC1694a0.obtainMessage(3, mo842a, 0, pointerTracker), pointerTracker.f5397m.f5380b);
                pointerTracker.f5396l = true;
            }
            pointerTracker.m843m(mo842a);
        }
        pointerTracker.m844l(mo842a);
        this.f6500i.f5267b.add(pointerTracker);
    }
}