package com.anysoftkeyboard.ime;

import android.view.inputmethod.InputConnection;
import com.anysoftkeyboard.ime.AnySoftKeyboardWithGestureTyping;
import com.menny.android.anysoftkeyboard.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p010b.p046j.p047d.AbstractC0472e;
import p010b.p086w.AbstractC1077v0;
import p093c.p097b.p105f0.C1215b;
import p093c.p097b.p122u.AbstractC1533z;
import p093c.p097b.p122u.C1499t0;
import p093c.p097b.p122u.InterfaceC1465c0;
import p093c.p097b.p127w.C1543i;
import p093c.p097b.p127w.C1544j;
import p093c.p097b.p127w.EnumC1542h;
import p093c.p097b.p128x.C1556b3;
import p093c.p097b.p128x.C1642w1;
import p093c.p097b.p130z.AbstractC1762t;
import p093c.p097b.p130z.Key;
import p093c.p137d.p138a.p139a.C1785g;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p189o.InterfaceC2119a;
import p183e.p184a.p189o.InterfaceC2121c;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p190p.p191a.EnumC2132d;
import p183e.p184a.p190p.p192b.AbstractC2146l;
import p183e.p184a.p203s.C2283h;
import p183e.p184a.p203s.C2284i;

/* loaded from: classes.dex */
public abstract class AnySoftKeyboardWithGestureTyping extends AnySoftKeyboardWithQuickText {

    /* renamed from: u1 */
    public static final /* synthetic */ int f6430u1 = 0;

    /* renamed from: v1 */
    public boolean f6432v1;

    /* renamed from: x1 */
    public C1544j f6434x1;

    /* renamed from: w1 */
    public final Map f6433w1 = new HashMap();

    /* renamed from: y1 */
    public boolean f6435y1 = false;

    /* renamed from: z1 */
    public boolean f6436z1 = false;

    /* renamed from: A1 */
    public InterfaceC2112c f6431A1 = EnumC2132d.INSTANCE;

    /* renamed from: x0 */
    public static String m424x0(AbstractC1762t abstractC1762t) {
        return String.format(Locale.US, "%s,%d,%d", abstractC1762t.mo818q(), Integer.valueOf(abstractC1762t.mo831g()), Integer.valueOf(abstractC1762t.mo839e()));
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardThemeOverlay, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, com.anysoftkeyboard.ime.AnySoftKeyboardBase
    /* renamed from: B */
    public void mo434B() {
        super.mo434B();
        m425w0();
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions
    /* renamed from: O */
    public InterfaceC1465c0 mo433O(AbstractC1762t abstractC1762t) {
        return (!this.f6432v1 || this.f6435y1) ? AnySoftKeyboardSuggestions.f6384G : new C1556b3(abstractC1762t, new C1642w1(this));
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardPopText, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardTagsSearcher, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions
    /* renamed from: X */
    public void mo432X(int i, CharSequence charSequence, boolean z) {
        this.f6436z1 = false;
        super.mo432X(i, charSequence, z);
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, p093c.p097b.p130z.InterfaceC1685n0
    /* renamed from: d */
    public void mo431d(AbstractC1762t abstractC1762t) {
        super.mo431d(abstractC1762t);
        if (this.f6432v1) {
            m423y0(abstractC1762t);
        }
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, p093c.p097b.p130z.InterfaceC1685n0
    /* renamed from: e */
    public void mo430e(AbstractC1762t abstractC1762t) {
        this.f6342F = 0;
        this.f6338B = abstractC1762t;
        this.f6339C = false;
        mo478I(abstractC1762t);
        this.f6431A1.mo35e();
        this.f6434x1 = null;
        this.f6435y1 = false;
        m495C();
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: h */
    public boolean mo429h(int i, int i2, Key key, long j) {
        int primaryCode;
        C1544j c1544j = this.f6434x1;
        if (this.f6432v1 && c1544j != null) {
            if ((key.f5215G || (primaryCode = key.getPrimaryCode()) <= 0 || primaryCode == 10 || primaryCode == 32) ? false : true) {
                boolean z = this.f6374q;
                if (this.f6436z1) {
                    CharSequence mo995c = this.f6389L.mo995c();
                    this.f6436z1 = false;
                    super.mo432X(0, mo995c, z);
                }
                c1544j.f4939g.m948c();
                mo428p(i, i2, j);
                return true;
            }
        }
        return false;
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardWithQuickText, com.anysoftkeyboard.ime.AnySoftKeyboardMediaInsertion, com.anysoftkeyboard.ime.AnySoftKeyboardHardware, com.anysoftkeyboard.ime.AnySoftKeyboardPressEffects, com.anysoftkeyboard.ime.AnySoftKeyboardClipboard, com.anysoftkeyboard.ime.AnySoftKeyboardSwipeListener, com.anysoftkeyboard.ime.AnySoftKeyboardPopText, com.anysoftkeyboard.ime.AnySoftKeyboardPowerSaving, com.anysoftkeyboard.ime.AnySoftKeyboardNightMode, com.anysoftkeyboard.ime.AnySoftKeyboardThemeOverlay, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardTagsSearcher, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, com.anysoftkeyboard.ime.AnySoftKeyboardRxPrefs, com.anysoftkeyboard.ime.AnySoftKeyboardDialogProvider, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f6371n.mo117c(AbstractC2094b.m150o(AbstractC1077v0.m1295I(getApplicationContext(), R.string.settings_key_power_save_mode_gesture_control), ((C1785g) this.f6370m.m1172a(R.string.settings_key_gesture_typing, R.bool.settings_default_gesture_typing)).f5459e, new InterfaceC2121c() { // from class: c.b.x.v1
            @Override // p183e.p184a.p189o.InterfaceC2121c
            /* renamed from: a */
            public final Object mo127a(Object obj, Object obj2) {
                Boolean bool = (Boolean) obj2;
                int i = AnySoftKeyboardWithGestureTyping.f6430u1;
                return ((Boolean) obj).booleanValue() ? Boolean.FALSE : bool;
            }
        }).m164N(new InterfaceC2123e() { // from class: c.b.x.r1
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardWithGestureTyping anySoftKeyboardWithGestureTyping = AnySoftKeyboardWithGestureTyping.this;
                anySoftKeyboardWithGestureTyping.getClass();
                anySoftKeyboardWithGestureTyping.f6432v1 = ((Boolean) obj).booleanValue();
                anySoftKeyboardWithGestureTyping.f6431A1.mo35e();
                if (!anySoftKeyboardWithGestureTyping.f6432v1) {
                    anySoftKeyboardWithGestureTyping.m425w0();
                    return;
                }
                AbstractC1762t abstractC1762t = anySoftKeyboardWithGestureTyping.f6337A;
                if (abstractC1762t != null) {
                    anySoftKeyboardWithGestureTyping.m423y0(abstractC1762t);
                }
            }
        }, new C1215b("settings_key_gesture_typing"), AbstractC2146l.f7038c, AbstractC2146l.f7039d));
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, android.app.Service, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        C1544j c1544j = this.f6434x1;
        if (c1544j == null) {
            m425w0();
            return;
        }
        Iterator it = new ArrayList(this.f6433w1.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getValue() != c1544j) {
                C1544j c1544j2 = (C1544j) entry.getValue();
                c1544j2.f4944l.mo35e();
                c1544j2.f4946n.mo25g(EnumC1542h.NOT_LOADED);
                c1544j2.f4946n.mo26d();
                this.f6433w1.remove(entry.getKey());
            }
        }
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: p */
    public void mo428p(int i, int i2, long j) {
        C1544j c1544j;
        if (this.f6432v1 && (c1544j = this.f6434x1) != null && ((C2283h) c1544j.f4946n.f7437e).m33b() == EnumC1542h.LOADED) {
            C1543i c1543i = c1544j.f4939g;
            int i3 = c1543i.f4928a;
            if (i3 > 0) {
                int i4 = i3 - 1;
                int i5 = c1543i.f4929b[i4] - i;
                int i6 = c1543i.f4930c[i4] - i2;
                if ((i6 * i6) + (i5 * i5) <= c1544j.f4935c) {
                    return;
                }
            }
            c1543i.m949b(i, i2);
        }
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardClipboard, com.anysoftkeyboard.ime.AnySoftKeyboardPopText, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: s */
    public void mo379s(int i, Key key, int i2, int[] iArr, boolean z) {
        boolean z2;
        if (this.f6432v1 && (z2 = this.f6436z1) && i > 0) {
            boolean z3 = i != 32 && this.f6374q;
            if (z2) {
                CharSequence mo995c = this.f6389L.mo995c();
                this.f6436z1 = false;
                super.mo432X(0, mo995c, z3);
            }
        }
        this.f6436z1 = false;
        super.mo379s(i, key, i2, iArr, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r33v0, resolved type: com.anysoftkeyboard.ime.AnySoftKeyboardWithGestureTyping */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020f  */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v13 */
    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo427t() {
        ArrayList arrayList;
        InputConnection inputConnection;
        ?? r5;
        InputConnection inputConnection2;
        Key key;
        int i;
        int i2;
        char[][] cArr;
        int[] iArr;
        double d;
        int i3;
        int[] iArr2;
        if (this.f6432v1) {
            InputConnection currentInputConnection = getCurrentInputConnection();
            C1544j c1544j = this.f6434x1;
            if (currentInputConnection == null || c1544j == null) {
                return;
            }
            c1544j.f4936d.clear();
            int i4 = 2;
            int i5 = 0;
            if (((C2283h) c1544j.f4946n.f7437e).m33b() == EnumC1542h.LOADED) {
                int[] m946b = C1544j.m946b(c1544j.f4939g);
                Key key2 = null;
                Iterator it = c1544j.f4940h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Key key3 = (Key) it.next();
                    if (key3.m895f(m946b[0], m946b[1])) {
                        key2 = key3;
                        break;
                    }
                }
                if (key2 != null) {
                    c1544j.f4938f.clear();
                    C1544j c1544j2 = c1544j;
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < c1544j2.f4942j.size()) {
                        char[][] cArr2 = (char[][]) c1544j2.f4942j.get(i6);
                        int[] iArr3 = (int[]) c1544j2.f4943k.get(i6);
                        int i8 = 0;
                        while (i8 < cArr2.length) {
                            if (((Key) c1544j2.f4941i.get(AbstractC1533z.m951m(cArr2[i8][i5]))) != key2) {
                                inputConnection2 = currentInputConnection;
                                key = key2;
                                i = i6;
                                i2 = i7;
                                cArr = cArr2;
                                iArr = iArr3;
                            } else {
                                int[] iArr4 = (int[]) c1544j2.f4947o.get(i8 + i7);
                                if (m946b.length < i4 || iArr4.length == 0 || iArr4.length > m946b.length) {
                                    inputConnection2 = currentInputConnection;
                                    key = key2;
                                    i = i6;
                                    i2 = i7;
                                    cArr = cArr2;
                                    iArr = iArr3;
                                    d = Double.MAX_VALUE;
                                } else {
                                    d = 0.0d;
                                    int i9 = 0;
                                    while (i9 < m946b.length) {
                                        Key key4 = key2;
                                        InputConnection inputConnection3 = currentInputConnection;
                                        double d2 = m946b[i9];
                                        double d3 = m946b[i9 + 1];
                                        int i10 = i6;
                                        int i11 = i7;
                                        char[][] cArr3 = cArr2;
                                        int[] iArr5 = iArr3;
                                        double m947a = C1544j.m947a(d2, d3, iArr4[i5], iArr4[i5 + 1]);
                                        if (i5 < iArr4.length - 2) {
                                            int i12 = i5 + 2;
                                            i3 = i5;
                                            iArr2 = iArr4;
                                            double m947a2 = C1544j.m947a(d2, d3, iArr4[i12], iArr4[i5 + 3]);
                                            if (m947a2 < m947a) {
                                                m947a = m947a2;
                                                i5 = i12;
                                                d += m947a;
                                                i9 += 2;
                                                currentInputConnection = inputConnection3;
                                                key2 = key4;
                                                i6 = i10;
                                                i7 = i11;
                                                cArr2 = cArr3;
                                                iArr3 = iArr5;
                                                iArr4 = iArr2;
                                            }
                                        } else {
                                            i3 = i5;
                                            iArr2 = iArr4;
                                        }
                                        i5 = i3;
                                        d += m947a;
                                        i9 += 2;
                                        currentInputConnection = inputConnection3;
                                        key2 = key4;
                                        i6 = i10;
                                        i7 = i11;
                                        cArr2 = cArr3;
                                        iArr3 = iArr5;
                                        iArr4 = iArr2;
                                    }
                                    inputConnection2 = currentInputConnection;
                                    key = key2;
                                    i = i6;
                                    i2 = i7;
                                    cArr = cArr2;
                                    iArr = iArr3;
                                    int i13 = m946b[m946b.length - 2];
                                    int i14 = m946b[m946b.length - 1];
                                    while (i5 < iArr4.length) {
                                        d += C1544j.m947a(i13, i14, iArr4[i5], iArr4[i5 + 1]);
                                        i5 += 2;
                                        i13 = i13;
                                        i14 = i14;
                                    }
                                }
                                if (d <= 1000000.0d) {
                                    double d4 = c1544j.f4937e;
                                    double d5 = iArr[i8];
                                    Double.isNaN(d5);
                                    Double.isNaN(d5);
                                    Double.isNaN(d5);
                                    double d6 = d - (d4 * d5);
                                    int i15 = 0;
                                    while (i15 < c1544j.f4938f.size() && ((Double) c1544j.f4938f.get(i15)).doubleValue() <= d6) {
                                        i15++;
                                    }
                                    if (i15 < c1544j.f4945m) {
                                        c1544j.f4938f.add(i15, Double.valueOf(d6));
                                        c1544j.f4936d.add(i15, new String(cArr[i8]));
                                        int size = c1544j.f4938f.size();
                                        int i16 = c1544j.f4945m;
                                        if (size > i16) {
                                            c1544j.f4938f.remove(i16);
                                            c1544j.f4936d.remove(c1544j.f4945m);
                                        }
                                    }
                                }
                                c1544j2 = c1544j;
                            }
                            i8++;
                            currentInputConnection = inputConnection2;
                            key2 = key;
                            i6 = i;
                            i7 = i2;
                            cArr2 = cArr;
                            iArr3 = iArr;
                            i4 = 2;
                            i5 = 0;
                        }
                        i7 += cArr2.length;
                        i6++;
                        i4 = 2;
                        i5 = 0;
                    }
                    inputConnection = currentInputConnection;
                    arrayList = c1544j2.f4936d;
                    if (arrayList.isEmpty()) {
                        boolean m1076a = this.f6312h.m1076a();
                        boolean m1075b = this.f6312h.m1075b();
                        Locale mo823s = this.f6337A.mo823s();
                        if (mo823s != null && (m1076a || m1075b)) {
                            StringBuilder sb = new StringBuilder();
                            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                                CharSequence charSequence = (CharSequence) arrayList.get(i17);
                                if (m1075b) {
                                    arrayList.set(i17, charSequence.toString().toUpperCase(mo823s));
                                } else {
                                    sb.append(charSequence.subSequence(0, 1).toString().toUpperCase(mo823s));
                                    sb.append(charSequence.subSequence(1, charSequence.length()));
                                    arrayList.set(i17, sb.toString());
                                    sb.setLength(0);
                                }
                            }
                        }
                        inputConnection.beginBatchEdit();
                        m467J(false);
                        CharSequence charSequence2 = (CharSequence) arrayList.get(0);
                        C1499t0 c1499t0 = this.f6389L;
                        c1499t0.m986l();
                        c1499t0.f4851i = m1076a || m1075b;
                        c1499t0.f4849g -= c1499t0.m993e();
                        c1499t0.f4848f.setLength(0);
                        c1499t0.f4848f.insert(c1499t0.f4849g, charSequence2);
                        int i18 = 0;
                        while (i18 < charSequence2.length()) {
                            int codePointAt = Character.codePointAt(charSequence2, i18);
                            c1499t0.f4845c.add(c1499t0.f4849g, C1499t0.f4843a);
                            if (Character.isUpperCase(codePointAt)) {
                                c1499t0.f4850h++;
                            }
                            i18 += Character.charCount(codePointAt);
                        }
                        c1499t0.f4849g = charSequence2.length() + c1499t0.f4849g;
                        c1499t0.f4847e = c1499t0.mo995c();
                        InputConnection inputConnection4 = inputConnection;
                        CharSequence textBeforeCursor = inputConnection4.getTextBeforeCursor(2, 0);
                        if (textBeforeCursor.length() != 0) {
                            int codePointBefore = Character.codePointBefore(textBeforeCursor, textBeforeCursor.length());
                            if (!Character.isWhitespace(codePointBefore) && codePointBefore != 39 && codePointBefore != 45) {
                                r5 = 1;
                                inputConnection4.commitText(new String(new int[]{32}, 0, 1), 1);
                                inputConnection4.setComposingText(c1499t0.mo995c(), r5);
                                this.f6436z1 = r5;
                                if (arrayList.size() <= r5) {
                                    m448d0(arrayList, r5, r5);
                                } else {
                                    m448d0(Collections.emptyList(), false, false);
                                }
                                inputConnection4.endBatchEdit();
                            }
                        }
                        r5 = 1;
                        inputConnection4.setComposingText(c1499t0.mo995c(), r5);
                        this.f6436z1 = r5;
                        if (arrayList.size() <= r5) {
                        }
                        inputConnection4.endBatchEdit();
                    }
                    c1544j.f4939g.m948c();
                }
                int i19 = m946b[0];
                int i20 = m946b[1];
            }
            arrayList = c1544j.f4936d;
            inputConnection = currentInputConnection;
            if (arrayList.isEmpty()) {
            }
            c1544j.f4939g.m948c();
        }
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardPowerSaving, com.anysoftkeyboard.ime.AnySoftKeyboardNightMode, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardBase
    /* renamed from: v */
    public List mo426v() {
        int i;
        List mo426v = super.mo426v();
        if (this.f6432v1) {
            if (this.f6435y1) {
                i = R.drawable.ic_watermark_gesture;
            } else if (this.f6434x1 != null) {
                i = R.drawable.ic_watermark_gesture_not_loaded;
            }
            ((ArrayList) mo426v).add(AbstractC0472e.m2430c(this, i));
        }
        return mo426v;
    }

    /* renamed from: w0 */
    public final void m425w0() {
        for (C1544j c1544j : this.f6433w1.values()) {
            c1544j.f4944l.mo35e();
            c1544j.f4946n.mo25g(EnumC1542h.NOT_LOADED);
            c1544j.f4946n.mo26d();
        }
        this.f6433w1.clear();
        this.f6434x1 = null;
        this.f6435y1 = false;
        m495C();
    }

    /* renamed from: y0 */
    public final void m423y0(AbstractC1762t abstractC1762t) {
        this.f6431A1.mo35e();
        if (this.f6432v1) {
            String m424x0 = m424x0(abstractC1762t);
            if (this.f6433w1.containsKey(m424x0)) {
                this.f6434x1 = (C1544j) this.f6433w1.get(m424x0);
            } else {
                C1544j c1544j = new C1544j(getResources().getDimension(R.dimen.gesture_typing_frequency_factor), 15, getResources().getDimensionPixelSize(R.dimen.gesture_typing_min_point_distance), abstractC1762t.f5147q);
                this.f6434x1 = c1544j;
                this.f6433w1.put(m424x0, c1544j);
            }
            C2284i c2284i = this.f6434x1.f4946n;
            InterfaceC2119a interfaceC2119a = new InterfaceC2119a() { // from class: c.b.x.u1
                @Override // p183e.p184a.p189o.InterfaceC2119a
                public final void run() {
                    AnySoftKeyboardWithGestureTyping anySoftKeyboardWithGestureTyping = AnySoftKeyboardWithGestureTyping.this;
                    anySoftKeyboardWithGestureTyping.f6435y1 = false;
                    anySoftKeyboardWithGestureTyping.m495C();
                }
            };
            InterfaceC2123e interfaceC2123e = AbstractC2146l.f7039d;
            this.f6431A1 = c2284i.m141x(interfaceC2123e, interfaceC2119a).m164N(new InterfaceC2123e() { // from class: c.b.x.s1
                @Override // p183e.p184a.p189o.InterfaceC2123e
                public final void accept(Object obj) {
                    AnySoftKeyboardWithGestureTyping anySoftKeyboardWithGestureTyping = AnySoftKeyboardWithGestureTyping.this;
                    anySoftKeyboardWithGestureTyping.f6435y1 = ((EnumC1542h) obj) == EnumC1542h.LOADED;
                    anySoftKeyboardWithGestureTyping.m495C();
                }
            }, new InterfaceC2123e() { // from class: c.b.x.x1
                @Override // p183e.p184a.p189o.InterfaceC2123e
                public final void accept(Object obj) {
                    AnySoftKeyboardWithGestureTyping anySoftKeyboardWithGestureTyping = AnySoftKeyboardWithGestureTyping.this;
                    anySoftKeyboardWithGestureTyping.getClass();
                    ((Throwable) obj).getMessage();
                    anySoftKeyboardWithGestureTyping.f6435y1 = false;
                    anySoftKeyboardWithGestureTyping.m495C();
                }
            }, AbstractC2146l.f7038c, interfaceC2123e);
        }
    }
}