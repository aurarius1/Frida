package com.anysoftkeyboard.ime;

import android.content.Context;
import android.content.res.Configuration;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.anysoftkeyboard.dictionaries.jni.BinaryDictionary;
import com.anysoftkeyboard.dictionaries.jni.ResourceBinaryDictionary;
import com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions;
import com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase;
import com.anysoftkeyboard.keyboards.views.CandidateView;
import com.anysoftkeyboard.keyboards.views.KeyboardViewContainerView;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p010b.p037h.p040b.AbstractC0403k;
import p010b.p046j.p047d.AbstractC0472e;
import p010b.p086w.AbstractC1077v0;
import p093c.p097b.p105f0.AbstractC1216c;
import p093c.p097b.p105f0.C1215b;
import p093c.p097b.p115j0.C1416b;
import p093c.p097b.p121t.C1450g;
import p093c.p097b.p122u.AbstractC1467d0;
import p093c.p097b.p122u.AbstractC1473g0;
import p093c.p097b.p122u.AbstractC1533z;
import p093c.p097b.p122u.C1461a0;
import p093c.p097b.p122u.C1485m0;
import p093c.p097b.p122u.C1487n0;
import p093c.p097b.p122u.C1495r0;
import p093c.p097b.p122u.C1496s;
import p093c.p097b.p122u.C1497s0;
import p093c.p097b.p122u.C1499t0;
import p093c.p097b.p122u.InterfaceC1465c0;
import p093c.p097b.p122u.InterfaceC1481k0;
import p093c.p097b.p122u.p123u0.C1502b;
import p093c.p097b.p122u.p125w0.C1525j;
import p093c.p097b.p122u.p125w0.C1526k;
import p093c.p097b.p128x.C1635u2;
import p093c.p097b.p128x.C1647x2;
import p093c.p097b.p128x.HandlerC1571e3;
import p093c.p097b.p128x.InterfaceC1566d3;
import p093c.p097b.p130z.AbstractC1762t;
import p093c.p097b.p130z.C1671g0;
import p093c.p097b.p130z.C1687o0;
import p093c.p097b.p130z.Key;
import p093c.p137d.p138a.p139a.C1785g;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.p187m.C2111b;
import p183e.p184a.p189o.InterfaceC2119a;
import p183e.p184a.p189o.InterfaceC2121c;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p189o.InterfaceC2124f;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p189o.InterfaceC2128j;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* loaded from: classes.dex */
public abstract class AnySoftKeyboardSuggestions extends AnySoftKeyboardKeyboardSwitchedListener {

    /* renamed from: G */
    public static final InterfaceC1465c0 f6384G = new C1635u2();

    /* renamed from: H */
    public static final CompletionInfo[] f6385H = new CompletionInfo[0];

    /* renamed from: N */
    public InterfaceC1481k0 f6391N;

    /* renamed from: O */
    public CandidateView f6392O;

    /* renamed from: T */
    public boolean f6397T;

    /* renamed from: U */
    public boolean f6398U;

    /* renamed from: V */
    public boolean f6399V;

    /* renamed from: W */
    public boolean f6400W;

    /* renamed from: X */
    public boolean f6401X;

    /* renamed from: Y */
    public boolean f6402Y;

    /* renamed from: e0 */
    public boolean f6408e0;

    /* renamed from: f0 */
    public int f6409f0;

    /* renamed from: I */
    public final HandlerC1571e3 f6386I = new HandlerC1571e3(this);

    /* renamed from: J */
    public final SparseBooleanArray f6387J = new SparseBooleanArray();

    /* renamed from: K */
    public int f6388K = 0;

    /* renamed from: L */
    public C1499t0 f6389L = new C1499t0();

    /* renamed from: M */
    public C1499t0 f6390M = new C1499t0();

    /* renamed from: P */
    public CompletionInfo[] f6393P = f6385H;

    /* renamed from: Q */
    public long f6394Q = -31536000000L;

    /* renamed from: R */
    public long f6395R = -31536000000L;

    /* renamed from: S */
    public boolean f6396S = false;

    /* renamed from: Z */
    public boolean f6403Z = true;

    /* renamed from: a0 */
    public boolean f6404a0 = true;

    /* renamed from: b0 */
    public boolean f6405b0 = false;

    /* renamed from: c0 */
    public final C1647x2 f6406c0 = new C1647x2(new Runnable() { // from class: c.b.x.r0
        @Override // java.lang.Runnable
        public final void run() {
            AnySoftKeyboardSuggestions.this.m467J(true);
        }
    });

    /* renamed from: d0 */
    public boolean f6407d0 = false;

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardBase
    /* renamed from: A */
    public boolean mo468A() {
        return this.f6395R > 0;
    }

    /* renamed from: J */
    public void m467J(boolean z) {
        ((C1487n0) this.f6391N).m1004d();
        this.f6394Q = -31536000000L;
        this.f6405b0 = false;
        this.f6386I.m941a();
        InputConnection currentInputConnection = getCurrentInputConnection();
        m456V();
        if (currentInputConnection != null) {
            currentInputConnection.finishComposingText();
        }
        m464M();
        this.f6389L.m986l();
        this.f6388K = 0;
        this.f6405b0 = false;
        if (z) {
            KeyboardViewContainerView keyboardViewContainerView = this.f6307c;
            if (keyboardViewContainerView != null) {
                keyboardViewContainerView.m381e(this.f6406c0);
            }
            this.f6398U = false;
        }
    }

    /* renamed from: K */
    public void m466K(final String str) {
        C2111b c2111b = this.f6314j;
        AbstractC2094b m163P = AbstractC2094b.m173E(str).m163P(AbstractC1216c.f4391a);
        final InterfaceC1481k0 interfaceC1481k0 = this.f6391N;
        interfaceC1481k0.getClass();
        c2111b.mo117c(m163P.m172F(new InterfaceC2127i() { // from class: c.b.x.a
            @Override // p183e.p184a.p189o.InterfaceC2127i
            /* renamed from: a */
            public final Object mo24a(Object obj) {
                String str2 = (String) obj;
                C1495r0 c1495r0 = ((C1487n0) InterfaceC1481k0.this).f4785a;
                boolean z = false;
                if (!c1495r0.f4829u && c1495r0.f4816h.size() > 0) {
                    z = ((AbstractC1473g0) c1495r0.f4816h.get(0)).mo968n(str2, 128);
                }
                return Boolean.valueOf(z);
            }
        }).m140y(new InterfaceC2128j() { // from class: c.b.x.s0
            @Override // p183e.p184a.p189o.InterfaceC2128j
            /* renamed from: a */
            public final boolean mo40a(Object obj) {
                InterfaceC1465c0 interfaceC1465c0 = AnySoftKeyboardSuggestions.f6384G;
                return ((Boolean) obj).booleanValue();
            }
        }).m171G(AbstractC1216c.f4392b).m164N(new InterfaceC2123e() { // from class: c.b.x.v0
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardSuggestions anySoftKeyboardSuggestions = AnySoftKeyboardSuggestions.this;
                String str2 = str;
                Boolean bool = (Boolean) obj;
                CandidateView candidateView = anySoftKeyboardSuggestions.f6392O;
                if (candidateView != null) {
                    candidateView.f6543n = str2;
                    ArrayList arrayList = new ArrayList(2);
                    arrayList.add(candidateView.getContext().getResources().getString(R.string.added_word, candidateView.f6543n));
                    arrayList.add(candidateView.getContext().getResources().getString(R.string.revert_added_word_question));
                    candidateView.m385e(arrayList, true, false);
                    candidateView.f6541l = true;
                }
            }
        }, new InterfaceC2123e() { // from class: c.b.x.x0
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                Throwable th = (Throwable) obj;
                InterfaceC1465c0 interfaceC1465c0 = AnySoftKeyboardSuggestions.f6384G;
            }
        }, AbstractC2146l.f7038c, AbstractC2146l.f7039d));
    }

    /* renamed from: L */
    public final void m465L(CharSequence charSequence, int i) {
        boolean z = false;
        this.f6405b0 = false;
        C1495r0 c1495r0 = ((C1487n0) this.f6391N).f4785a;
        int m2566b = AbstractC0403k.m2566b(i);
        if (!c1495r0.f4829u && c1495r0.f4821m && !c1495r0.m1000d(charSequence)) {
            z = c1495r0.f4825q.mo968n(charSequence.toString(), m2566b);
        }
        if (z) {
            m466K(charSequence.toString());
            this.f6405b0 = true;
        }
    }

    /* renamed from: M */
    public void m464M() {
        this.f6386I.m941a();
        m448d0(Collections.emptyList(), false, false);
    }

    /* renamed from: N */
    public void mo463N(CharSequence charSequence, CharSequence charSequence2) {
        InputConnection currentInputConnection = getCurrentInputConnection();
        if (currentInputConnection != null) {
            boolean mo468A = mo468A();
            m456V();
            if (!TextUtils.equals(charSequence, charSequence2) && !mo468A) {
                AnyApplication.f6979b.getClass();
                currentInputConnection.commitText(charSequence, 1);
                currentInputConnection.commitCorrection(new CorrectionInfo(m491w() - charSequence2.length(), charSequence2, charSequence));
            } else {
                currentInputConnection.commitText(charSequence, 1);
            }
        }
        m464M();
    }

    /* renamed from: O */
    public InterfaceC1465c0 mo433O(AbstractC1762t abstractC1762t) {
        return f6384G;
    }

    /* renamed from: P */
    public void m462P(int i, Key key, int i2, int[] iArr) {
        int i3;
        if (this.f6389L.m993e() == 0 && mo460R(i)) {
            this.f6388K = 0;
            this.f6389L.m986l();
            this.f6402Y = this.f6398U && this.f6408e0 && this.f6401X;
            if (this.f6312h.m1076a()) {
                this.f6389L.f4852j = true;
            }
        }
        InterfaceC1566d3 interfaceC1566d3 = this.f6308d;
        this.f6396S = interfaceC1566d3 != null && interfaceC1566d3.mo412a();
        InputConnection currentInputConnection = getCurrentInputConnection();
        this.f6389L.m994d(i, iArr);
        if (this.f6398U) {
            if (currentInputConnection != null) {
                C1499t0 c1499t0 = this.f6389L;
                if (c1499t0.f4849g != c1499t0.m993e()) {
                    i3 = m491w() + (i2 > 0 ? Character.charCount(i) - Character.charCount(key.m897d(i2 - 1)) : Character.charCount(i));
                    currentInputConnection.beginBatchEdit();
                } else {
                    i3 = -1;
                }
                m456V();
                currentInputConnection.setComposingText(this.f6389L.mo995c(), 1);
                if (i3 > 0) {
                    currentInputConnection.setSelection(i3, i3);
                    currentInputConnection.endBatchEdit();
                }
            }
            if (mo458T(i)) {
                m453Z();
            } else {
                CandidateView candidateView = this.f6392O;
                CharSequence mo995c = this.f6389L.mo995c();
                if (candidateView.f6534e.size() > 0) {
                    candidateView.f6534e.set(0, mo995c);
                    candidateView.invalidate();
                }
            }
        } else {
            if (currentInputConnection != null) {
                currentInputConnection.beginBatchEdit();
            }
            m456V();
            for (char c : Character.toChars(i)) {
                sendKeyChar(c);
            }
            if (currentInputConnection != null) {
                currentInputConnection.endBatchEdit();
            }
        }
        this.f6405b0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013c  */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m461Q(int i) {
        m455W();
        boolean z = true;
        if (!(!this.f6337A.f5413E)) {
            if (i == 41) {
                i = 40;
            } else if (i == 40) {
                i = 41;
            }
        }
        boolean m459S = m459S();
        boolean z2 = i == 10;
        boolean z3 = z2 || this.f6387J.get(i, false);
        boolean z4 = i == 32;
        InputConnection currentInputConnection = getCurrentInputConnection();
        if (currentInputConnection != null) {
            currentInputConnection.beginBatchEdit();
        }
        C1499t0 m452a0 = m452a0();
        CharSequence mo995c = m452a0.mo995c();
        if ((this.f6402Y && this.f6401X && this.f6398U) && !z2 && !TextUtils.equals(mo995c, m452a0.m991g())) {
            mo995c = m452a0.m991g();
        }
        boolean z5 = m452a0.f4849g < m452a0.m993e();
        if (m459S && !z5) {
            mo463N(mo995c, m452a0.mo995c());
            if (TextUtils.equals(m452a0.mo995c(), mo995c)) {
                m465L(mo995c, 2);
            }
            this.f6388K = mo995c.length() + 1;
        } else if (z5) {
            m467J(false);
        }
        if (currentInputConnection != null) {
            if (z4) {
                if (this.f6379v && SystemClock.uptimeMillis() - this.f6394Q < this.f6380w) {
                    currentInputConnection.deleteSurroundingText(1, 0);
                    currentInputConnection.commitText(". ", 1);
                    z3 = true;
                }
            } else if (this.f6394Q != -31536000000L && (this.f6382y || z2)) {
                if (this.f6387J.get(i, false) && !(this.f6397T && (i == 33 || i == 63 || i == 58 || i == 59))) {
                    currentInputConnection.deleteSurroundingText(1, 0);
                    StringBuilder sb = new StringBuilder();
                    sb.append(new String(new int[]{i}, 0, 1));
                    sb.append(z2 ? "" : " ");
                    currentInputConnection.commitText(sb.toString(), 1);
                }
            }
            if (!z) {
                for (char c : Character.toChars(i)) {
                    sendKeyChar(c);
                }
            }
            m456V();
            if (currentInputConnection != null) {
                currentInputConnection.endBatchEdit();
            }
            InterfaceC1481k0 interfaceC1481k0 = this.f6391N;
            if (z3) {
                m448d0(((C1487n0) interfaceC1481k0).m1006b(mo995c, m452a0.m989i()), false, false);
                return;
            }
            ((C1487n0) interfaceC1481k0).m1004d();
            m464M();
            return;
        }
        z = false;
        if (!z) {
        }
        m456V();
        if (currentInputConnection != null) {
        }
        InterfaceC1481k0 interfaceC1481k02 = this.f6391N;
        if (z3) {
        }
    }

    /* renamed from: R */
    public abstract boolean mo460R(int i);

    /* renamed from: S */
    public boolean m459S() {
        return this.f6398U && !this.f6389L.m987k();
    }

    /* renamed from: T */
    public boolean mo458T(int i) {
        return Character.isLetter(i);
    }

    /* renamed from: U */
    public boolean m457U(int i) {
        return !mo460R(i);
    }

    /* renamed from: V */
    public void m456V() {
        this.f6395R = SystemClock.uptimeMillis() + 1500;
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x035b  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m455W() {
        String str;
        CharSequence charSequence;
        List list;
        boolean z;
        String str2;
        C1499t0 c1499t0;
        CharSequence charSequence2;
        this.f6386I.removeMessages(R.id.keyboard_ui_handler_MSG_UPDATE_SUGGESTIONS);
        if (!this.f6398U || !this.f6407d0) {
            m464M();
            return;
        }
        CharSequence mo995c = this.f6389L.mo995c();
        InterfaceC1481k0 interfaceC1481k0 = this.f6391N;
        C1499t0 c1499t02 = this.f6389L;
        C1487n0 c1487n0 = (C1487n0) interfaceC1481k0;
        if (c1487n0.f4803s) {
            c1487n0.f4789e.clear();
            c1487n0.f4796l = false;
            c1487n0.f4798n = c1499t02.f4852j;
            c1487n0.f4799o = c1499t02.m989i();
            c1487n0.m1007a();
            Arrays.fill(c1487n0.f4795k, 0);
            String str3 = (String) c1499t02.mo995c();
            if (str3.length() > 0) {
                str3 = str3.toString();
                str = str3.toString().toLowerCase(c1487n0.f4791g);
            } else {
                str = "";
            }
            c1487n0.f4797m = str;
            if (!c1499t02.m988j() || !c1487n0.f4794j.isEnabled()) {
                if (c1499t02.mo997a() >= c1487n0.f4792h) {
                    if (TextUtils.isEmpty(c1487n0.f4797m)) {
                        throw new IllegalStateException("mLowerOriginalWord is empty");
                    }
                    C1495r0 c1495r0 = c1487n0.f4785a;
                    C1485m0 c1485m0 = c1487n0.f4800p;
                    c1495r0.f4828t.mo499h(c1499t02, c1485m0);
                    C1495r0.m1003a(c1495r0.f4816h, c1499t02, c1485m0);
                    C1495r0.m1003a(c1495r0.f4815g, c1499t02, c1485m0);
                    C1495r0.m1003a(c1487n0.f4785a.f4832x, c1499t02, c1487n0.f4790f);
                    if (c1487n0.f4786b.size() > 0) {
                        c1487n0.f4796l = true;
                    }
                }
                int length = c1487n0.f4797m.length();
                int i = 0;
                for (CharSequence charSequence3 : c1487n0.f4787c) {
                    if (charSequence3.length() >= length && TextUtils.equals(charSequence3.subSequence(0, length), str3)) {
                        c1487n0.f4786b.add(i, charSequence3);
                        i++;
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    c1487n0.f4786b.add(0, str3.toString());
                    if (c1487n0.f4789e.size() > 0) {
                        int i2 = 1;
                        for (String str4 : c1487n0.f4789e) {
                            c1487n0.f4786b.add(i2, str4);
                            i2++;
                        }
                        c1487n0.f4796l = true;
                    }
                }
                if (c1487n0.f4797m.length() > 0) {
                    C1495r0 c1495r02 = c1487n0.f4785a;
                    String str5 = c1487n0.f4797m;
                    Iterator it = c1495r02.f4820l.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str2 = null;
                            break;
                        }
                        C1496s c1496s = (C1496s) it.next();
                        char c = c1496s.f4834a[0];
                        int length2 = str5.length();
                        for (int i3 = 0; i3 < length2; i3++) {
                            char charAt = str5.charAt(i3);
                            while (true) {
                                if (c == 65535) {
                                    break;
                                }
                                char[] cArr = c1496s.f4834a;
                                if (charAt == cArr[c + 0]) {
                                    if (i3 == length2 - 1) {
                                        int i4 = c + 1;
                                        if (cArr[i4] != 65535) {
                                            char c2 = cArr[i4];
                                            char charAt2 = c1496s.f4836c.charAt(c2);
                                            int i5 = c2 + 1;
                                            str2 = c1496s.f4836c.substring(i5, charAt2 + i5);
                                            continue;
                                            break;
                                        }
                                    }
                                    c = cArr[c + 2];
                                } else {
                                    c = cArr[c + 3];
                                }
                            }
                            if (c == 65535) {
                                break;
                            }
                        }
                        str2 = null;
                        continue;
                        if (str2 != null) {
                            break;
                        }
                    }
                    if ((TextUtils.isEmpty(str2) || TextUtils.equals(str2, str3)) ? false : true) {
                        c1487n0.f4796l = true;
                        if (c1487n0.f4786b.size() == 0) {
                            c1487n0.f4786b.add(str3);
                        }
                        String str6 = str2.toString();
                        if (c1487n0.f4798n) {
                            c1487n0.f4786b.add(1, str6.substring(0, 1).toUpperCase() + str6.substring(1));
                        } else {
                            c1487n0.f4786b.add(1, str2);
                        }
                    }
                }
                List list2 = c1487n0.f4786b;
                List list3 = c1487n0.f4788d;
                if (list2.size() >= 2) {
                    int i6 = 1;
                    while (i6 < list2.size()) {
                        CharSequence charSequence4 = (CharSequence) list2.get(i6);
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i6) {
                                break;
                            } else if (TextUtils.equals(charSequence4, (CharSequence) list2.get(i7))) {
                                CharSequence charSequence5 = (CharSequence) list2.remove(i6);
                                if (charSequence5 instanceof StringBuilder) {
                                    list3.add(charSequence5);
                                }
                                i6--;
                            } else {
                                i7++;
                            }
                        }
                        i6++;
                    }
                }
                if (c1487n0.f4796l && c1487n0.f4786b.size() > 1 && c1487n0.f4789e.size() == 0) {
                    String str7 = c1487n0.f4797m;
                    CharSequence charSequence6 = (CharSequence) c1487n0.f4786b.get(1);
                    if (charSequence6.length() - str7.length() <= c1487n0.f4801q) {
                        int length3 = str7.length();
                        int length4 = charSequence6.length();
                        int[][] iArr = (int[][]) Array.newInstance(int.class, length3 + 1, length4 + 1);
                        for (int i8 = 0; i8 <= length3; i8++) {
                            iArr[i8][0] = i8;
                        }
                        for (int i9 = 0; i9 <= length4; i9++) {
                            iArr[0][i9] = i9;
                        }
                        for (int i10 = 0; i10 < length3; i10++) {
                            int i11 = 0;
                            while (i11 < length4) {
                                char lowerCase = Character.toLowerCase(str7.charAt(i10));
                                char lowerCase2 = Character.toLowerCase(charSequence6.charAt(i11));
                                int i12 = lowerCase == lowerCase2 ? 0 : 1;
                                int i13 = i10 + 1;
                                int i14 = i11 + 1;
                                CharSequence charSequence7 = mo995c;
                                iArr[i13][i14] = Math.min(iArr[i10][i14] + 1, Math.min(iArr[i13][i11] + 1, iArr[i10][i11] + i12));
                                if (i10 > 0 && i11 > 0) {
                                    int i15 = i11 - 1;
                                    if (lowerCase == Character.toLowerCase(charSequence6.charAt(i15))) {
                                        int i16 = i10 - 1;
                                        if (lowerCase2 == Character.toLowerCase(str7.charAt(i16))) {
                                            iArr[i13][i14] = Math.min(iArr[i13][i14], iArr[i16][i15] + i12);
                                        }
                                    }
                                }
                                i11 = i14;
                                mo995c = charSequence7;
                            }
                        }
                        charSequence = mo995c;
                        if (iArr[length3][length4] <= c1487n0.f4802r) {
                            z = true;
                            if (!z) {
                                c1487n0.f4796l = false;
                                list = c1487n0.f4786b;
                                InterfaceC1481k0 interfaceC1481k02 = this.f6391N;
                                boolean z2 = ((C1487n0) interfaceC1481k02).f4796l;
                                CharSequence charSequence8 = charSequence;
                                boolean z3 = (((C1487n0) interfaceC1481k02).m1005c(charSequence8) || this.f6389L.m988j()) ? false : true;
                                if (this.f6407d0) {
                                    z2 |= z3;
                                }
                                boolean z4 = (!(this.f6389L.f4850h > 1)) & z2;
                                m448d0(list, z3, z4);
                                if (list.size() <= 0) {
                                    c1499t0 = this.f6389L;
                                    charSequence2 = null;
                                } else if (!z4 || z3 || list.size() <= 1) {
                                    this.f6389L.f4847e = charSequence8;
                                    return;
                                } else {
                                    c1499t0 = this.f6389L;
                                    charSequence2 = (CharSequence) list.get(1);
                                }
                                c1499t0.f4847e = charSequence2;
                            }
                        }
                    } else {
                        charSequence = mo995c;
                    }
                    z = false;
                    if (!z) {
                    }
                } else {
                    charSequence = mo995c;
                }
                list = c1487n0.f4786b;
                InterfaceC1481k0 interfaceC1481k022 = this.f6391N;
                boolean z22 = ((C1487n0) interfaceC1481k022).f4796l;
                CharSequence charSequence82 = charSequence;
                if (((C1487n0) interfaceC1481k022).m1005c(charSequence82)) {
                }
                if (this.f6407d0) {
                }
                boolean z42 = (!(this.f6389L.f4850h > 1)) & z22;
                m448d0(list, z3, z42);
                if (list.size() <= 0) {
                }
                c1499t0.f4847e = charSequence2;
            }
            list = c1487n0.f4794j.mo1150a(c1487n0.f4797m.substring(1), c1499t02);
        } else {
            list = Collections.emptyList();
        }
        charSequence = mo995c;
        InterfaceC1481k0 interfaceC1481k0222 = this.f6391N;
        boolean z222 = ((C1487n0) interfaceC1481k0222).f4796l;
        CharSequence charSequence822 = charSequence;
        if (((C1487n0) interfaceC1481k0222).m1005c(charSequence822)) {
        }
        if (this.f6407d0) {
        }
        boolean z422 = (!(this.f6389L.f4850h > 1)) & z222;
        m448d0(list, z3, z422);
        if (list.size() <= 0) {
        }
        c1499t0.f4847e = charSequence2;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE] complete} */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008a A[Catch: all -> 0x00b8, TryCatch #0 {all -> 0x00b8, blocks: (B:6:0x000d, B:9:0x0013, B:11:0x0018, B:13:0x001c, B:14:0x001f, B:16:0x0023, B:20:0x002c, B:23:0x0033, B:25:0x0039, B:26:0x0044, B:30:0x0050, B:31:0x0057, B:34:0x005d, B:36:0x0061, B:38:0x006d, B:43:0x008a, B:45:0x008e, B:46:0x00a1), top: B:54:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1 A[Catch: all -> 0x00b8, TRY_LEAVE, TryCatch #0 {all -> 0x00b8, blocks: (B:6:0x000d, B:9:0x0013, B:11:0x0018, B:13:0x001c, B:14:0x001f, B:16:0x0023, B:20:0x002c, B:23:0x0033, B:25:0x0039, B:26:0x0044, B:30:0x0050, B:31:0x0057, B:34:0x005d, B:36:0x0061, B:38:0x006d, B:43:0x008a, B:45:0x008e, B:46:0x00a1), top: B:54:0x000d }] */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo432X(int i, CharSequence charSequence, boolean z) {
        boolean z2;
        InputConnection currentInputConnection = getCurrentInputConnection();
        if (currentInputConnection != null) {
            currentInputConnection.beginBatchEdit();
        }
        C1499t0 m452a0 = m452a0();
        try {
            if (this.f6399V && i >= 0) {
                CompletionInfo[] completionInfoArr = this.f6393P;
                if (i < completionInfoArr.length) {
                    CompletionInfo completionInfo = completionInfoArr[i];
                    if (currentInputConnection != null) {
                        currentInputConnection.commitCompletion(completionInfo);
                    }
                    CandidateView candidateView = this.f6392O;
                    if (candidateView != null) {
                        candidateView.m386d();
                    }
                    if (currentInputConnection != null) {
                        return;
                    }
                    return;
                }
            }
            mo463N(charSequence, charSequence);
            if (z && (i == 0 || !m452a0.m988j())) {
                sendKeyChar(' ');
                this.f6394Q = SystemClock.uptimeMillis();
            }
            this.f6405b0 = false;
            if (!m452a0.m988j()) {
                if (i == 0) {
                    m465L(m452a0.mo995c(), 1);
                }
                if (!this.f6405b0 && i == 0 && this.f6407d0 && !((C1487n0) this.f6391N).f4785a.m1000d(charSequence)) {
                    if (!((C1487n0) this.f6391N).m1005c(charSequence.toString().toLowerCase(this.f6337A.mo823s()))) {
                        z2 = true;
                        if (z2) {
                            m448d0(((C1487n0) this.f6391N).m1006b(charSequence, this.f6389L.m989i()), false, false);
                        } else {
                            CandidateView candidateView2 = this.f6392O;
                            if (candidateView2 != null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(charSequence);
                                arrayList.add(candidateView2.f6553x);
                                candidateView2.m385e(arrayList, false, false);
                                candidateView2.f6552w = true;
                            }
                        }
                    }
                }
                z2 = false;
                if (z2) {
                }
            }
            if (currentInputConnection != null) {
                currentInputConnection.endBatchEdit();
            }
        } finally {
            if (currentInputConnection != null) {
                currentInputConnection.endBatchEdit();
            }
        }
    }

    /* renamed from: Y */
    public final void m454Y() {
        this.f6386I.removeMessages(R.id.keyboard_ui_handler_MSG_UPDATE_SUGGESTIONS);
        this.f6386I.removeMessages(R.id.keyboard_ui_handler_MSG_RESTART_NEW_WORD_SUGGESTIONS);
        this.f6386I.sendEmptyMessageDelayed(R.id.keyboard_ui_handler_MSG_RESTART_NEW_WORD_SUGGESTIONS, 160L);
    }

    /* renamed from: Z */
    public void m453Z() {
        this.f6386I.removeMessages(R.id.keyboard_ui_handler_MSG_UPDATE_SUGGESTIONS);
        HandlerC1571e3 handlerC1571e3 = this.f6386I;
        handlerC1571e3.sendMessageDelayed(handlerC1571e3.obtainMessage(R.id.keyboard_ui_handler_MSG_UPDATE_SUGGESTIONS), 80L);
    }

    /* renamed from: a0 */
    public final C1499t0 m452a0() {
        if (this.f6389L.m987k()) {
            return this.f6389L;
        }
        C1499t0 c1499t0 = this.f6389L;
        C1499t0 c1499t02 = this.f6390M;
        this.f6389L = c1499t02;
        this.f6390M = c1499t0;
        c1499t02.m986l();
        return c1499t0;
    }

    /* renamed from: b0 */
    public void m451b0(final String str) {
        this.f6314j.mo117c(AbstractC2094b.m173E(str).m163P(AbstractC1216c.f4391a).m172F(new InterfaceC2127i() { // from class: c.b.x.w0
            @Override // p183e.p184a.p189o.InterfaceC2127i
            /* renamed from: a */
            public final Object mo24a(Object obj) {
                String str2 = (String) obj;
                for (AbstractC1473g0 abstractC1473g0 : ((C1487n0) AnySoftKeyboardSuggestions.this.f6391N).f4785a.f4816h) {
                    abstractC1473g0.mo967o(str2);
                }
                return str2;
            }
        }).m171G(AbstractC1216c.f4392b).m164N(new InterfaceC2123e() { // from class: c.b.x.y0
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                String str2 = (String) obj;
                CandidateView candidateView = AnySoftKeyboardSuggestions.this.f6392O;
                if (candidateView != null) {
                    candidateView.f6543n = null;
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(candidateView.getContext().getResources().getString(R.string.removed_word, str2));
                    candidateView.m385e(arrayList, true, false);
                    candidateView.f6541l = true;
                }
            }
        }, new InterfaceC2123e() { // from class: c.b.x.q0
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                Throwable th = (Throwable) obj;
                InterfaceC1465c0 interfaceC1465c0 = AnySoftKeyboardSuggestions.f6384G;
            }
        }, AbstractC2146l.f7038c, AbstractC2146l.f7039d));
        this.f6405b0 = false;
        m467J(false);
    }

    /* renamed from: c */
    public void mo450c(Key key, CharSequence charSequence) {
        InputConnection currentInputConnection = getCurrentInputConnection();
        if (currentInputConnection == null) {
            return;
        }
        currentInputConnection.beginBatchEdit();
        C1499t0 c1499t0 = new C1499t0();
        C1499t0 c1499t02 = this.f6389L;
        c1499t02.getClass();
        c1499t0.m986l();
        Iterator it = c1499t02.f4845c.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            int[] iArr2 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            c1499t0.f4845c.add(iArr2);
        }
        c1499t0.f4848f.append((CharSequence) c1499t02.f4848f);
        c1499t0.f4847e = c1499t02.f4847e;
        c1499t0.f4851i = c1499t02.f4851i;
        c1499t0.f4850h = c1499t02.f4850h;
        c1499t0.f4849g = c1499t02.f4849g;
        c1499t0.f4852j = c1499t02.f4852j;
        m467J(false);
        currentInputConnection.commitText(charSequence, 1);
        this.f6388K = charSequence.length() + c1499t0.m993e();
        this.f6390M = c1499t0;
        m456V();
        currentInputConnection.endBatchEdit();
    }

    /* renamed from: c0 */
    public void m449c0() {
        AbstractC1762t abstractC1762t;
        Context m1062a;
        AbstractC1533z resourceBinaryDictionary;
        ((C1487n0) this.f6391N).m1004d();
        if (this.f6398U && (abstractC1762t = this.f6337A) != null && this.f6339C) {
            SparseBooleanArray sparseBooleanArray = this.f6387J;
            char[] mo822t = abstractC1762t.mo822t();
            sparseBooleanArray.clear();
            for (char c : mo822t) {
                sparseBooleanArray.put(c, true);
            }
            this.f6387J.put(10, true);
            C1450g c1450g = AnyApplication.f6979b;
            List m1011s = ((AnyApplication) getApplicationContext()).f6983f.m1011s(abstractC1762t);
            InterfaceC1481k0 interfaceC1481k0 = this.f6391N;
            InterfaceC1465c0 mo433O = mo433O(abstractC1762t);
            C1487n0 c1487n0 = (C1487n0) interfaceC1481k0;
            if (c1487n0.f4803s) {
                ArrayList arrayList = (ArrayList) m1011s;
                if (arrayList.size() > 0) {
                    C1495r0 c1495r0 = c1487n0.f4785a;
                    c1495r0.getClass();
                    int hashCode = Arrays.hashCode(arrayList.toArray());
                    if (hashCode == c1495r0.f4814f) {
                        for (AbstractC1533z abstractC1533z : c1495r0.f4815g) {
                            mo433O.mo940a(abstractC1533z);
                            mo433O.mo939b(abstractC1533z);
                        }
                        return;
                    }
                    c1495r0.m1001c();
                    c1495r0.f4814f = hashCode;
                    C2111b c2111b = c1495r0.f4813e;
                    for (int i = 0; i < arrayList.size(); i++) {
                        C1461a0 c1461a0 = (C1461a0) arrayList.get(i);
                        try {
                            String str = c1461a0.f4705a;
                            if (c1461a0.f4762m == 0) {
                                resourceBinaryDictionary = new BinaryDictionary(c1461a0.m1062a(), c1461a0.f4706b, c1461a0.m1062a().getAssets().openFd(c1461a0.f4761l));
                            } else {
                                resourceBinaryDictionary = new ResourceBinaryDictionary(c1461a0.f4706b, c1461a0.m1062a(), c1461a0.f4762m);
                            }
                            c1495r0.f4815g.add(resourceBinaryDictionary);
                            c2111b.mo117c(AbstractC1467d0.m1016b(mo433O, resourceBinaryDictionary));
                        } catch (Exception unused) {
                            String str2 = c1461a0.f4705a;
                        }
                        if (c1495r0.f4827s) {
                            C1497s0 c1497s0 = new C1497s0(c1495r0.f4811c, c1461a0.f4760k);
                            c1495r0.f4816h.add(c1497s0);
                            c2111b.mo117c(AbstractC1467d0.m1017a(c1497s0));
                            c1495r0.f4817i.add(c1497s0.f4837f);
                        }
                        if (c1495r0.f4818j && (i == 0 || !c1495r0.f4819k)) {
                            C1496s c1496s = null;
                            if (c1461a0.f4763n != 0) {
                                try {
                                    c1496s = new C1496s(c1461a0.m1062a().getResources(), c1461a0.f4763n);
                                } catch (OutOfMemoryError unused2) {
                                }
                            }
                            if (c1496s != null) {
                                c1495r0.f4820l.add(c1496s);
                            }
                            C1525j c1525j = new C1525j(c1495r0.f4811c, c1461a0.f4760k);
                            c1495r0.f4832x.add(c1525j);
                            c2111b.mo117c(AbstractC1467d0.m1017a(c1525j));
                        }
                        c1495r0.f4812d.addAll((c1461a0.f4764o == 0 || (m1062a = c1461a0.m1062a()) == null) ? Collections.emptyList() : Arrays.asList(m1062a.getResources().getStringArray(c1461a0.f4764o)));
                        C1526k c1526k = new C1526k(c1495r0.f4811c, c1461a0.f4760k);
                        c1495r0.f4825q = c1526k;
                        c2111b.mo117c(AbstractC1467d0.m1017a(c1526k));
                    }
                    if (c1495r0.f4826r && c1495r0.f4828t == C1495r0.f4809a) {
                        C1502b c1502b = new C1502b(c1495r0.f4811c);
                        c1495r0.f4828t = c1502b;
                        c1495r0.f4830v = c1502b;
                        c2111b.mo117c(AbstractC1467d0.m1016b(c1495r0.f4831w, c1502b));
                        return;
                    }
                    return;
                }
            }
            c1487n0.f4785a.m1001c();
        }
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, p093c.p097b.p130z.InterfaceC1685n0
    /* renamed from: d */
    public void mo431d(AbstractC1762t abstractC1762t) {
        super.mo431d(abstractC1762t);
        this.f6397T = this.f6382y && abstractC1762t.mo823s().toString().toLowerCase(Locale.US).startsWith("fr");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
        if ((r6.f6402Y && r6.f6401X && r6.f6398U) != false) goto L24;
     */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m448d0(List list, boolean z, boolean z2) {
        C1647x2 c1647x2 = this.f6406c0;
        boolean z3 = true;
        boolean z4 = !list.isEmpty();
        View view = c1647x2.f5084f;
        if (view != null) {
            if (view.getVisibility() != (z4 ? 0 : 8)) {
                c1647x2.f5084f.setVisibility(0);
                c1647x2.f5081c.reset();
                c1647x2.f5080b.reset();
                c1647x2.f5084f.startAnimation(z4 ? c1647x2.f5081c : c1647x2.f5080b);
            }
        }
        CandidateView candidateView = this.f6392O;
        if (candidateView != null) {
            if (z2) {
            }
            z3 = false;
            candidateView.m385e(list, z, z3);
        }
    }

    /* renamed from: i */
    public void mo447i(int i) {
        if (i == -132) {
            this.f6388K = 0;
        }
        this.f6394Q = i == 32 ? SystemClock.uptimeMillis() : -31536000000L;
        if (m459S()) {
            return;
        }
        if (i == -5 || i == -7 || i == -8) {
            m454Y();
        }
    }

    /* renamed from: k */
    public void mo446k() {
        InterfaceC1566d3 interfaceC1566d3 = this.f6308d;
        if (interfaceC1566d3 != null) {
            ((AnyKeyboardViewBase) interfaceC1566d3).m415D(this.f6396S);
        }
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, android.inputmethodservice.InputMethodService, android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
        if (i != this.f6409f0) {
            this.f6409f0 = i;
            m467J(false);
            C1687o0 c1687o0 = this.f6343z;
            String str = null;
            if (c1687o0.f5204u) {
                c1687o0.m912b();
                int i2 = c1687o0.f5203t;
                C1671g0[] c1671g0Arr = c1687o0.f5201r;
                if (i2 < c1671g0Arr.length) {
                    str = c1671g0Arr[i2].f5162q;
                }
            }
            if (str == null) {
                this.f6387J.clear();
                return;
            }
            SparseBooleanArray sparseBooleanArray = this.f6387J;
            char[] charArray = str.toCharArray();
            sparseBooleanArray.clear();
            for (char c : charArray) {
                sparseBooleanArray.put(c, true);
            }
        }
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, com.anysoftkeyboard.ime.AnySoftKeyboardRxPrefs, com.anysoftkeyboard.ime.AnySoftKeyboardDialogProvider, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f6409f0 = getResources().getConfiguration().orientation;
        this.f6391N = new C1487n0(this);
        AbstractC2094b abstractC2094b = ((C1785g) this.f6370m.m1172a(R.string.settings_key_allow_suggestions_restart, R.bool.settings_default_allow_suggestions_restart)).f5459e;
        InterfaceC2123e interfaceC2123e = new InterfaceC2123e() { // from class: c.b.x.b1
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardSuggestions anySoftKeyboardSuggestions = AnySoftKeyboardSuggestions.this;
                anySoftKeyboardSuggestions.getClass();
                anySoftKeyboardSuggestions.f6403Z = ((Boolean) obj).booleanValue();
            }
        };
        C1215b c1215b = new C1215b("settings_key_allow_suggestions_restart");
        InterfaceC2119a interfaceC2119a = AbstractC2146l.f7038c;
        InterfaceC2123e interfaceC2123e2 = AbstractC2146l.f7039d;
        this.f6371n.mo117c(abstractC2094b.m164N(interfaceC2123e, c1215b, interfaceC2119a, interfaceC2123e2));
        this.f6371n.mo117c(AbstractC2094b.m151n(AbstractC2094b.m150o(((C1785g) this.f6370m.m1172a(R.string.settings_key_show_suggestions, R.bool.settings_default_show_suggestions)).f5459e, AbstractC1077v0.m1295I(getApplicationContext(), R.string.settings_key_power_save_mode_suggestions_control), new InterfaceC2121c() { // from class: c.b.x.z0
            @Override // p183e.p184a.p189o.InterfaceC2121c
            /* renamed from: a */
            public final Object mo127a(Object obj, Object obj2) {
                Boolean bool = (Boolean) obj;
                InterfaceC1465c0 interfaceC1465c0 = AnySoftKeyboardSuggestions.f6384G;
                return ((Boolean) obj2).booleanValue() ? Boolean.FALSE : bool;
            }
        }), ((C1785g) this.f6370m.m1170c(R.string.settings_key_auto_pick_suggestion_aggressiveness, R.string.settings_default_auto_pick_suggestion_aggressiveness)).f5459e, ((C1785g) this.f6370m.m1171b(R.string.settings_key_min_length_for_word_correction__, R.integer.settings_default_min_word_length_for_suggestion)).f5459e, new InterfaceC2124f() { // from class: c.b.x.e2
            @Override // p183e.p184a.p189o.InterfaceC2124f
            /* renamed from: a */
            public final Object mo126a(Object obj, Object obj2, Object obj3) {
                return new C1416b((Boolean) obj, (String) obj2, (Integer) obj3);
            }
        }).m164N(new InterfaceC2123e() { // from class: c.b.x.a1
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboardSuggestions anySoftKeyboardSuggestions = AnySoftKeyboardSuggestions.this;
                C1416b c1416b = (C1416b) obj;
                int i = 0;
                boolean z = anySoftKeyboardSuggestions.f6407d0 != ((Boolean) c1416b.f4671a).booleanValue();
                anySoftKeyboardSuggestions.f6407d0 = ((Boolean) c1416b.f4671a).booleanValue();
                String str = (String) c1416b.f4672b;
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1231938408:
                        if (str.equals("high_aggressiveness")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -603793330:
                        if (str.equals("extreme_aggressiveness")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3387192:
                        if (str.equals("none")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 839356089:
                        if (str.equals("minimal_aggressiveness")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                int i2 = 5;
                if (c == 0) {
                    anySoftKeyboardSuggestions.f6408e0 = true;
                    i2 = 4;
                    i = 3;
                } else if (c == 1) {
                    anySoftKeyboardSuggestions.f6408e0 = true;
                    i = 5;
                } else if (c != 2) {
                    anySoftKeyboardSuggestions.f6408e0 = true;
                    if (c != 3) {
                        i2 = 3;
                        i = 2;
                    } else {
                        i2 = 1;
                        i = 1;
                    }
                } else {
                    anySoftKeyboardSuggestions.f6408e0 = false;
                    i2 = 0;
                }
                InterfaceC1481k0 interfaceC1481k0 = anySoftKeyboardSuggestions.f6391N;
                boolean z2 = anySoftKeyboardSuggestions.f6407d0;
                int intValue = ((Integer) c1416b.f4673c).intValue();
                C1487n0 c1487n0 = (C1487n0) interfaceC1481k0;
                c1487n0.f4803s = z2;
                c1487n0.f4792h = intValue;
                c1487n0.f4801q = i;
                c1487n0.f4802r = i2;
                if (z) {
                    if (anySoftKeyboardSuggestions.f6407d0) {
                        anySoftKeyboardSuggestions.m449c0();
                    } else {
                        ((C1487n0) anySoftKeyboardSuggestions.f6391N).f4785a.m1001c();
                    }
                }
            }
        }, new C1215b("combineLatest settings_key_show_suggestions"), interfaceC2119a, interfaceC2123e2));
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, com.anysoftkeyboard.ime.AnySoftKeyboardDialogProvider, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService
    public View onCreateInputView() {
        View onCreateInputView = super.onCreateInputView();
        CandidateView candidateView = this.f6307c.getCandidateView();
        this.f6392O = candidateView;
        candidateView.setService(this);
        this.f6406c0.f5086h = this.f6392O;
        return onCreateInputView;
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, com.anysoftkeyboard.ime.AnySoftKeyboardRxPrefs, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService, android.inputmethodservice.AbstractInputMethodService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        HandlerC1571e3 handlerC1571e3 = this.f6386I;
        handlerC1571e3.m941a();
        handlerC1571e3.removeMessages(R.id.keyboard_ui_handler_MSG_CLOSE_DICTIONARIES);
        C1487n0 c1487n0 = (C1487n0) this.f6391N;
        c1487n0.f4785a.m1001c();
        C1495r0 c1495r0 = c1487n0.f4785a;
        c1495r0.m1001c();
        c1495r0.f4833y.mo35e();
    }

    @Override // android.inputmethodservice.InputMethodService
    public void onDisplayCompletions(CompletionInfo[] completionInfoArr) {
        CompletionInfo[] completionInfoArr2;
        if (this.f6399V || (isFullscreenMode() && completionInfoArr != null)) {
            CompletionInfo[] completionInfoArr3 = completionInfoArr == null ? new CompletionInfo[0] : (CompletionInfo[]) Arrays.copyOf(completionInfoArr, completionInfoArr.length);
            this.f6393P = completionInfoArr3;
            this.f6399V = true;
            if (completionInfoArr3.length == 0) {
                m464M();
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (CompletionInfo completionInfo : this.f6393P) {
                if (completionInfo != null) {
                    arrayList.add(completionInfo.getText());
                }
            }
            m448d0(arrayList, true, true);
            this.f6389L.f4847e = null;
        }
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService
    public void onFinishInput() {
        super.onFinishInput();
        this.f6398U = false;
        this.f6386I.sendEmptyMessageDelayed(R.id.keyboard_ui_handler_MSG_CLOSE_DICTIONARIES, 160L);
        this.f6395R = -31536000000L;
    }

    @Override // android.inputmethodservice.InputMethodService
    public void onFinishInputView(boolean z) {
        super.onFinishInputView(z);
        m467J(true);
    }

    @Override // android.inputmethodservice.InputMethodService
    public void onStartInput(EditorInfo editorInfo, boolean z) {
        super.onStartInput(editorInfo, z);
        this.f6386I.removeMessages(R.id.keyboard_ui_handler_MSG_CLOSE_DICTIONARIES);
        m467J(false);
        this.f6404a0 = z ? false : this.f6403Z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0088, code lost:
        if (r1 != 208) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0093  */
    @Override // android.inputmethodservice.InputMethodService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onStartInputView(EditorInfo editorInfo, boolean z) {
        C1687o0 c1687o0;
        super.onStartInputView(editorInfo, z);
        this.f6398U = false;
        this.f6399V = false;
        this.f6393P = f6385H;
        this.f6401X = false;
        int i = editorInfo.inputType & 15;
        int i2 = 4;
        if (i != 1) {
            if (i == 2) {
                c1687o0 = this.f6343z;
                i2 = 8;
            } else if (i == 3) {
                this.f6343z.m899o(3, editorInfo, z);
            } else if (i != 4) {
                this.f6398U = false;
                this.f6400W = this.f6374q;
                this.f6343z.m899o(1, editorInfo, z);
            } else {
                c1687o0 = this.f6343z;
                i2 = 7;
            }
            c1687o0.m899o(i2, editorInfo, z);
        } else {
            int i3 = editorInfo.inputType & 4080;
            if (i3 != 16 && i3 != 32) {
                if (i3 != 128 && i3 != 144) {
                    if (i3 != 208) {
                        if (i3 != 224) {
                            this.f6401X = true;
                            this.f6398U = true;
                            if (i3 != 16 || i3 == 32 || i3 == 208) {
                                this.f6400W = false;
                            } else {
                                this.f6400W = this.f6374q;
                            }
                            if ((editorInfo.inputType & 16773120 & 524288) == 524288) {
                                this.f6398U = false;
                            }
                            if (i3 != 16) {
                                if (i3 != 32) {
                                    if (i3 == 64) {
                                        c1687o0 = this.f6343z;
                                        i2 = 6;
                                    }
                                }
                                c1687o0 = this.f6343z;
                                i2 = 5;
                            } else {
                                c1687o0 = this.f6343z;
                            }
                            c1687o0.m899o(i2, editorInfo, z);
                        }
                    }
                }
                this.f6398U = false;
                if (i3 != 16) {
                }
                this.f6400W = false;
                if ((editorInfo.inputType & 16773120 & 524288) == 524288) {
                }
                if (i3 != 16) {
                }
                c1687o0.m899o(i2, editorInfo, z);
            }
            this.f6398U = true;
            this.f6401X = false;
            if (i3 != 16) {
            }
            this.f6400W = false;
            if ((editorInfo.inputType & 16773120 & 524288) == 524288) {
            }
            if (i3 != 16) {
            }
            c1687o0.m899o(i2, editorInfo, z);
        }
        boolean z2 = this.f6398U && this.f6407d0;
        this.f6398U = z2;
        if (z2) {
            this.f6307c.setActionsStripVisibility(true);
            this.f6307c.m382d(this.f6406c0);
        } else {
            this.f6307c.setActionsStripVisibility(false);
        }
        m464M();
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService
    public void onUpdateSelection(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f6310f = i4;
        this.f6311g = i3;
        this.f6389L.mo995c();
        int i7 = this.f6389L.f4849g;
        boolean z = SystemClock.uptimeMillis() < this.f6395R;
        this.f6395R = -31536000000L;
        if (z) {
            return;
        }
        boolean z2 = (i == i3 && i2 == i4) ? false : true;
        if (z2) {
            this.f6394Q = -31536000000L;
            if (this.f6388K > 0) {
                this.f6388K = 0;
            }
        }
        if (this.f6398U && getCurrentInputConnection() != null) {
            if (i3 != i4) {
                m467J(false);
            } else if (z2) {
                if (m459S()) {
                    if (i3 >= i5 && i3 <= i6) {
                        this.f6389L.f4849g = i4 - i5;
                        return;
                    }
                    m467J(false);
                }
                m454Y();
            }
        }
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: s */
    public void mo379s(int i, Key key, int i2, int[] iArr, boolean z) {
        super.mo379s(i, key, i2, iArr, z);
        if (i != -5) {
            this.f6388K = 0;
        }
        CandidateView candidateView = this.f6392O;
        if (candidateView.f6552w) {
            candidateView.m386d();
        }
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardBase
    /* renamed from: v */
    public List mo426v() {
        ((AnyApplication) getApplication()).getClass();
        ArrayList arrayList = new ArrayList();
        if (((C1487n0) this.f6391N).f4785a.f4829u) {
            arrayList.add(AbstractC0472e.m2430c(this, R.drawable.ic_watermark_incognito));
        }
        return arrayList;
    }
}