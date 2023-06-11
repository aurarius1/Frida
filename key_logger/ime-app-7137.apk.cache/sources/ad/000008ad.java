package com.anysoftkeyboard;

import android.content.ClipData;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Debug;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;
import com.anysoftkeyboard.AnySoftKeyboard;
import com.anysoftkeyboard.ime.AnySoftKeyboardClipboard;
import com.anysoftkeyboard.ime.AnySoftKeyboardColorizeNavBar;
import com.anysoftkeyboard.ime.AnySoftKeyboardMediaInsertion;
import com.anysoftkeyboard.keyboards.views.AnyKeyboardView;
import com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase;
import com.anysoftkeyboard.p180ui.VoiceInputNotInstalledActivity;
import com.anysoftkeyboard.p180ui.settings.MainSettingsActivity;
import com.anysoftkeyboard.receivers.PackagesChangedReceiver;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p010b.p036g.C0391o;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p046j.p058l.p060e1.AbstractC0589a;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p097b.C1414j;
import p093c.p097b.p099b0.C1146i;
import p093c.p097b.p100c0.EnumC1178v;
import p093c.p097b.p102d0.C1186c;
import p093c.p097b.p102d0.C1187d;
import p093c.p097b.p104e0.C1212g;
import p093c.p097b.p105f0.C1215b;
import p093c.p097b.p108i0.p109o.AbstractC1260g;
import p093c.p097b.p115j0.C1415a;
import p093c.p097b.p121t.C1450g;
import p093c.p097b.p122u.C1461a0;
import p093c.p097b.p122u.C1487n0;
import p093c.p097b.p122u.C1499t0;
import p093c.p097b.p128x.C1579g2;
import p093c.p097b.p128x.C1627s2;
import p093c.p097b.p128x.InterfaceC1566d3;
import p093c.p097b.p130z.AbstractC1762t;
import p093c.p097b.p130z.C1667e0;
import p093c.p097b.p130z.C1671g0;
import p093c.p097b.p130z.C1673h0;
import p093c.p097b.p130z.C1675i0;
import p093c.p097b.p130z.C1687o0;
import p093c.p097b.p130z.EnumC1764v;
import p093c.p097b.p130z.InterfaceC1677j0;
import p093c.p097b.p130z.Key;
import p093c.p097b.p130z.p132r0.AbstractC1718e0;
import p093c.p097b.p130z.p132r0.p133a1.C1696b;
import p093c.p097b.p130z.p132r0.p133a1.C1697c;
import p093c.p137d.p138a.p139a.C1785g;
import p093c.p145g.p146a.p175b.C2060n;
import p093c.p145g.p146a.p175b.InterfaceC2059m;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.p189o.InterfaceC2119a;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* loaded from: classes.dex */
public abstract class AnySoftKeyboard extends AnySoftKeyboardColorizeNavBar {

    /* renamed from: G1 */
    public static final /* synthetic */ int f6279G1 = 0;

    /* renamed from: H1 */
    public final PackagesChangedReceiver f6280H1 = new PackagesChangedReceiver(this);

    /* renamed from: I1 */
    public final StringBuilder f6281I1 = new StringBuilder();

    /* renamed from: J1 */
    public boolean f6282J1;

    /* renamed from: K1 */
    public final C0391o f6283K1;

    /* renamed from: L1 */
    public EnumC1764v f6284L1;

    /* renamed from: M1 */
    public EnumC1764v f6285M1;

    /* renamed from: N1 */
    public EnumC1764v f6286N1;

    /* renamed from: O1 */
    public InputMethodManager f6287O1;

    /* renamed from: P1 */
    public C2060n f6288P1;

    /* renamed from: Q1 */
    public View f6289Q1;

    /* renamed from: R1 */
    public EditText f6290R1;

    /* renamed from: S1 */
    public boolean f6291S1;

    /* renamed from: T1 */
    public boolean f6292T1;

    /* renamed from: U1 */
    public int f6293U1;

    public AnySoftKeyboard() {
        EnumC1764v enumC1764v = EnumC1764v.None;
        this.f6284L1 = enumC1764v;
        this.f6285M1 = enumC1764v;
        this.f6286N1 = enumC1764v;
        this.f6293U1 = 1;
        this.f6283K1 = new C0391o();
        char[] charArray = "\"'-_*`~()[]{}<>".toCharArray();
        char[] charArray2 = "\"\"''--__**``~~()()[][]{}{}<><>".toCharArray();
        if (charArray.length * 2 != charArray2.length) {
            throw new IllegalArgumentException("outputArray should be twice as large as inputArray");
        }
        for (int i = 0; i < charArray.length; i++) {
            int i2 = i * 2;
            this.f6283K1.m2607f(charArray[i], new int[]{charArray2[i2], charArray2[i2 + 1]});
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
        if (r2.f5409A != r3) goto L15;
     */
    /* renamed from: C0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m513C0() {
        InterfaceC1566d3 interfaceC1566d3 = this.f6308d;
        if (interfaceC1566d3 == null || !this.f6339C) {
            return;
        }
        boolean m1076a = this.f6313i.m1076a();
        AnyKeyboardViewBase anyKeyboardViewBase = (AnyKeyboardViewBase) interfaceC1566d3;
        AbstractC1762t abstractC1762t = anyKeyboardViewBase.f6488b0;
        if (abstractC1762t != null) {
            boolean z = true;
            if (abstractC1762t.f5411C != null) {
                int i = abstractC1762t.f5409A;
                if (!m1076a) {
                    abstractC1762t.f5409A = 0;
                } else if (i == 0) {
                    abstractC1762t.f5409A = 1;
                }
            }
            z = false;
            if (z) {
                anyKeyboardViewBase.m395r();
            }
        }
    }

    /* renamed from: D0 */
    public final void m512D0(boolean z) {
        boolean z2;
        InputConnection currentInputConnection = getCurrentInputConnection();
        C1499t0 c1499t0 = this.f6389L;
        boolean z3 = this.f6398U && c1499t0.f4849g > 0 && !c1499t0.m987k();
        if (mo468A() || currentInputConnection == null) {
            m456V();
            if (z3) {
                c1499t0.m992f();
            }
            sendDownUpKeyEvents(67);
            return;
        }
        m456V();
        int i = this.f6388K;
        if (!(i > 0)) {
            if (!z3) {
                if (z) {
                    CharSequence textBeforeCursor = currentInputConnection.getTextBeforeCursor(2, 0);
                    int charCount = TextUtils.isEmpty(textBeforeCursor) ? 0 : Character.charCount(Character.codePointBefore(textBeforeCursor, textBeforeCursor.length()));
                    if (charCount > 0) {
                        currentInputConnection.deleteSurroundingText(charCount, 0);
                        return;
                    }
                }
                sendDownUpKeyEvents(67);
                return;
            }
            int m992f = c1499t0.m992f();
            int m491w = c1499t0.f4849g != c1499t0.m993e() ? m491w() : -1;
            if (m491w >= 0) {
                currentInputConnection.beginBatchEdit();
            }
            currentInputConnection.setComposingText(c1499t0.mo995c(), 1);
            if (m491w >= 0 && !c1499t0.m987k()) {
                int i2 = m491w - m992f;
                currentInputConnection.setSelection(i2, i2);
            }
            if (m491w >= 0) {
                currentInputConnection.endBatchEdit();
            }
            m453Z();
            return;
        }
        if (i == 0) {
            sendDownUpKeyEvents(67);
        } else {
            this.f6402Y = false;
            InputConnection currentInputConnection2 = getCurrentInputConnection();
            int m491w2 = m491w();
            currentInputConnection2.setComposingRegion(m491w2 - i, m491w2);
            C1499t0 c1499t02 = this.f6389L;
            C1499t0 c1499t03 = this.f6390M;
            this.f6389L = c1499t03;
            this.f6390M = c1499t02;
            this.f6388K = 0;
            CharSequence mo995c = c1499t03.mo995c();
            currentInputConnection2.setComposingText(mo995c, 1);
            m455W();
            if (this.f6405b0) {
                m451b0(((String) mo995c).toString());
            }
        }
        C1697c c1697c = this.f6359y0;
        if (c1697c == null || (z2 = c1697c.f5252e)) {
            return;
        }
        InterfaceC1566d3 interfaceC1566d3 = this.f6308d;
        if (interfaceC1566d3 instanceof AbstractC1718e0) {
            AbstractC1718e0 abstractC1718e0 = (AbstractC1718e0) interfaceC1566d3;
            if (!z2) {
                c1697c.f5252e = true;
                abstractC1718e0.m873J(new C1696b(c1697c.f5253a, new Point(c1697c.f5255c.x, c1697c.f5256d), c1697c.f5255c.y, SystemClock.elapsedRealtime() - c1697c.f5254b));
            } else {
                throw new IllegalStateException("Already in mFinished state!");
            }
        }
        this.f6359y0 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r3 != r2.f5419z) goto L12;
     */
    /* renamed from: E0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m511E0() {
        if (this.f6308d != null) {
            this.f6312h.m1076a();
            this.f6312h.m1075b();
            ((AnyKeyboardViewBase) this.f6308d).m415D(this.f6312h.m1076a());
            InterfaceC1566d3 interfaceC1566d3 = this.f6308d;
            boolean m1075b = this.f6312h.m1075b();
            AnyKeyboardViewBase anyKeyboardViewBase = (AnyKeyboardViewBase) interfaceC1566d3;
            AbstractC1762t keyboard = anyKeyboardViewBase.getKeyboard();
            if (keyboard != null) {
                boolean z = true;
                if (keyboard.mo829v()) {
                    int i = keyboard.f5419z;
                    if (m1075b) {
                        keyboard.f5419z = 2;
                    } else if (i == 2) {
                        keyboard.f5419z = 1;
                    }
                }
                z = false;
                if (z) {
                    anyKeyboardViewBase.m395r();
                }
            }
        }
    }

    /* renamed from: F0 */
    public final boolean m510F0() {
        EditorInfo currentInputEditorInfo = getCurrentInputEditorInfo();
        if (currentInputEditorInfo == null) {
            return false;
        }
        String str = currentInputEditorInfo.packageName;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2013032828:
                if (str.equals("org.woltage.irssiconnectbot")) {
                    c = 0;
                    break;
                }
                break;
            case -1599615690:
                if (str.equals("com.pslib.connectbot")) {
                    c = 1;
                    break;
                }
                break;
            case -791061017:
                if (str.equals("org.connectbot")) {
                    c = 2;
                    break;
                }
                break;
            case 836709229:
                if (str.equals("com.sonelli.juicessh")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
                return currentInputEditorInfo.inputType == 0;
            default:
                return false;
        }
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, com.anysoftkeyboard.ime.AnySoftKeyboardRxPrefs
    /* renamed from: G */
    public void mo469G(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("keyboard_") && str.endsWith("_override_dictionary")) {
            m449c0();
        } else {
            super.mo469G(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x021c, code lost:
        if (r15 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0279, code lost:
        if (r13.m1075b() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x035b, code lost:
        if (r15 != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0362, code lost:
        mo472n(r13);
        mo447i(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:?, code lost:
        return;
     */
    /* renamed from: G0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m509G0(int i, final Key key, boolean z) {
        int i2;
        int i3;
        EnumC1764v enumC1764v;
        EditorInfo currentInputEditorInfo;
        int i4;
        InputConnection currentInputConnection = getCurrentInputConnection();
        if (i == -140) {
            if (getCurrentInputConnection() != null) {
                EditorInfo currentInputEditorInfo2 = getCurrentInputEditorInfo();
                this.f6352o1 = 0;
                this.f6353p1 = null;
                C1212g c1212g = this.f6351n1;
                String[] m2298a = AbstractC0589a.m2298a(currentInputEditorInfo2);
                int m475s0 = AnySoftKeyboardMediaInsertion.m475s0(currentInputEditorInfo2);
                C1627s2 c1627s2 = this.f6350m1;
                c1212g.f4385d.mo35e();
                c1212g.f4386e = Integer.valueOf(m475s0);
                c1212g.f4387f = c1627s2;
                Intent intent = new Intent("com.anysoftkeyboard.api.INTENT_MEDIA_INSERTION_REQUEST_ACTION");
                intent.addFlags(268435456);
                intent.addFlags(8388608);
                intent.putExtra("com.anysoftkeyboard.api.INTENT_MEDIA_INSERTION_REQUEST_MEDIA_REQUEST_ID_KEY", m475s0);
                intent.putExtra("com.anysoftkeyboard.api.INTENT_MEDIA_INSERTION_REQUEST_MEDIA_MIMES_KEY", m2298a);
                c1212g.f4382a.startActivity(intent);
                return;
            }
            return;
        }
        int i5 = 2;
        if (i == -120) {
            InterfaceC1566d3 interfaceC1566d3 = this.f6308d;
            if (interfaceC1566d3 instanceof AnyKeyboardView) {
                AnyKeyboardView anyKeyboardView = (AnyKeyboardView) interfaceC1566d3;
                anyKeyboardView.f6493e0.mo878b();
                if (anyKeyboardView.f6446H0 == null) {
                    Key key2 = new Key(new C1667e0(anyKeyboardView.getKeyboard()), anyKeyboardView.getThemedKeyboardDimens());
                    anyKeyboardView.f6446H0 = key2;
                    key2.f5235r = 8;
                    key2.height = 0;
                    key2.width = 0;
                    key2.f5239v = R.xml.ext_kbd_utility_utility;
                    key2.f5240w = false;
                    key2.x = anyKeyboardView.getWidth() / 2;
                    anyKeyboardView.f6446H0.y = (anyKeyboardView.getHeight() - anyKeyboardView.getPaddingBottom()) - anyKeyboardView.getThemedKeyboardDimens().mo861f();
                }
                anyKeyboardView.m871I(anyKeyboardView.f6490d, anyKeyboardView.f6446H0, true);
            }
        } else if (i == -103) {
            C1187d c1187d = this.f6345i0;
            c1187d.f4319a.clear();
            c1187d.f4319a.add(new C1186c("😃", "😃"));
            ((C1785g) c1187d.f4320b).m808c(C1187d.m1158a(c1187d.f4319a));
        } else if (i == -102) {
            if (this.f6437q1) {
                m420v0();
            } else {
                m421u0(key);
            }
        } else if (i != -11) {
            if (i != -10) {
                switch (i) {
                    case -137:
                    case -136:
                    case -135:
                    case -134:
                    case -133:
                    case -132:
                    case -131:
                    case -130:
                        m467J(false);
                        switch (i) {
                            case -137:
                                i2 = 4097;
                                m487m0(54, i2);
                                return;
                            case -136:
                                i2 = 4096;
                                m487m0(54, i2);
                                return;
                            case -135:
                                CharSequence textBeforeCursor = currentInputConnection.getTextBeforeCursor(10240, 0);
                                CharSequence textAfterCursor = currentInputConnection.getTextAfterCursor(10240, 0);
                                int length = textBeforeCursor == null ? 0 : textBeforeCursor.length();
                                int length2 = textAfterCursor == null ? 0 : textAfterCursor.length();
                                if (length == 0 && length2 == 0) {
                                    return;
                                }
                                currentInputConnection.setSelection(0, length + length2);
                                return;
                            case -134:
                                boolean z2 = !this.f6315O0;
                                this.f6315O0 = z2;
                                if (z2) {
                                    i3 = R.string.clipboard_fine_select_enabled_toast;
                                    m483F(i3, true);
                                    return;
                                }
                                return;
                            case -133:
                                if (this.f6316P0.m1030b() == 0) {
                                    m483F(R.string.clipboard_is_empty_toast, true);
                                    return;
                                }
                                ArrayList arrayList = new ArrayList(this.f6316P0.m1030b());
                                for (int i6 = 0; i6 < this.f6316P0.m1030b(); i6++) {
                                    arrayList.add((CharSequence) this.f6316P0.f4748a.get(i6));
                                }
                                final CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
                                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: c.b.x.d
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i7) {
                                        AnySoftKeyboardClipboard anySoftKeyboardClipboard = AnySoftKeyboardClipboard.this;
                                        Key key3 = key;
                                        CharSequence[] charSequenceArr2 = charSequenceArr;
                                        anySoftKeyboardClipboard.getClass();
                                        anySoftKeyboardClipboard.mo450c(key3, charSequenceArr2[i7]);
                                    }
                                };
                                m484E(getText(R.string.clipboard_paste_entries_title), R.drawable.ic_clipboard_paste_light, new CharSequence[0], onClickListener, new C1579g2(this, charSequenceArr, onClickListener));
                                return;
                            case -132:
                                String str = this.f6316P0.m1030b() > 0 ? (CharSequence) this.f6316P0.f4748a.get(0) : "";
                                if (TextUtils.isEmpty(str)) {
                                    m483F(R.string.clipboard_is_empty_toast, true);
                                    return;
                                } else {
                                    mo450c(null, str);
                                    return;
                                }
                            case -131:
                            case -130:
                                if (currentInputConnection != null) {
                                    CharSequence selectedText = currentInputConnection.getSelectedText(1);
                                    if (TextUtils.isEmpty(selectedText)) {
                                        return;
                                    }
                                    this.f6316P0.f4749b.setPrimaryClip(ClipData.newPlainText("Styled Text", selectedText));
                                    if (i == -131) {
                                        sendDownUpKeyEvents(67);
                                        return;
                                    }
                                    i3 = R.string.clipboard_copy_done_toast;
                                    m483F(i3, true);
                                    return;
                                }
                                return;
                            default:
                                throw new IllegalArgumentException(AbstractC1124a.m1192d("The keycode ", i, " is not covered by handleClipboardOperation!"));
                        }
                    default:
                        switch (i) {
                            case -113:
                            case -112:
                            case -111:
                            case -110:
                                if (this.f6308d != null) {
                                    switch (i) {
                                        case -113:
                                            enumC1764v = EnumC1764v.CompactToRight;
                                            break;
                                        case -112:
                                            enumC1764v = EnumC1764v.CompactToLeft;
                                            break;
                                        case -111:
                                            enumC1764v = EnumC1764v.None;
                                            break;
                                        case -110:
                                            enumC1764v = EnumC1764v.Split;
                                            break;
                                        default:
                                            throw new IllegalArgumentException(AbstractC1124a.m1193c("Unknown primary code for condenseType: ", i));
                                    }
                                    this.f6286N1 = enumC1764v;
                                    mo478I(m479H());
                                    return;
                                }
                                return;
                            default:
                                switch (i) {
                                    case -100:
                                        m484E(getText(R.string.ime_name), R.mipmap.ic_launcher, new CharSequence[]{getText(R.string.ime_settings), getText(R.string.override_dictionary), getText(R.string.change_ime), getString(R.string.switch_incognito_template, new Object[]{getText(R.string.switch_incognito)})}, new DialogInterface.OnClickListener() { // from class: c.b.h
                                            @Override // android.content.DialogInterface.OnClickListener
                                            public final void onClick(DialogInterface dialogInterface, int i7) {
                                                AnySoftKeyboard anySoftKeyboard = AnySoftKeyboard.this;
                                                anySoftKeyboard.getClass();
                                                if (i7 == 0) {
                                                    anySoftKeyboard.hideWindow();
                                                    Intent intent2 = new Intent();
                                                    intent2.setClass(anySoftKeyboard, MainSettingsActivity.class);
                                                    intent2.setFlags(268435456);
                                                    anySoftKeyboard.startActivity(intent2);
                                                } else if (i7 == 1) {
                                                    C1450g c1450g = AnyApplication.f6979b;
                                                    List m1011s = ((AnyApplication) anySoftKeyboard.getApplicationContext()).f6983f.m1011s(anySoftKeyboard.f6337A);
                                                    List m1059e = ((AnyApplication) anySoftKeyboard.getApplicationContext()).f6983f.m1059e();
                                                    int size = m1059e.size();
                                                    CharSequence[] charSequenceArr2 = new CharSequence[size];
                                                    boolean[] zArr = new boolean[size];
                                                    ArrayList arrayList2 = new ArrayList(m1059e.size());
                                                    arrayList2.addAll(m1011s);
                                                    for (int i8 = 0; i8 < m1059e.size(); i8++) {
                                                        if (!arrayList2.contains(m1059e.get(i8))) {
                                                            arrayList2.add((C1461a0) m1059e.get(i8));
                                                        }
                                                    }
                                                    for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                                                        C1461a0 c1461a0 = (C1461a0) arrayList2.get(i9);
                                                        String str2 = c1461a0.f4706b;
                                                        if (!TextUtils.isEmpty(c1461a0.f4707c)) {
                                                            str2 = str2 + " (" + ((Object) c1461a0.f4707c) + ")";
                                                        }
                                                        charSequenceArr2[i9] = str2;
                                                        zArr[i9] = ((ArrayList) m1011s).contains(c1461a0);
                                                    }
                                                    anySoftKeyboard.m484E(anySoftKeyboard.getString(R.string.override_dictionary_title, new Object[]{anySoftKeyboard.f6337A.mo824r()}), R.drawable.ic_settings_language, charSequenceArr2, new DialogInterface.OnClickListener() { // from class: c.b.m
                                                        @Override // android.content.DialogInterface.OnClickListener
                                                        public final void onClick(DialogInterface dialogInterface2, int i10) {
                                                            int i11 = AnySoftKeyboard.f6279G1;
                                                        }
                                                    }, new C1421n(anySoftKeyboard, charSequenceArr2, zArr, m1011s, arrayList2));
                                                } else if (i7 == 2) {
                                                    ((InputMethodManager) anySoftKeyboard.getSystemService("input_method")).showInputMethodPicker();
                                                } else if (i7 != 3) {
                                                    throw new IllegalArgumentException(AbstractC1124a.m1192d("Position ", i7, " is not covered by the ASK settings dialog."));
                                                } else {
                                                    anySoftKeyboard.m480z0(!((C1487n0) anySoftKeyboard.f6391N).f4785a.f4829u, true);
                                                }
                                            }
                                        }, null);
                                        return;
                                    case -99:
                                        C1687o0 c1687o0 = this.f6343z;
                                        if (c1687o0.f5204u) {
                                            c1687o0.m912b();
                                            if (c1687o0.f5200q.length > 2 && c1687o0.f5190g) {
                                                r1 = 1;
                                            }
                                        }
                                        if (r1 == 0) {
                                            currentInputEditorInfo = getCurrentInputEditorInfo();
                                            this.f6343z.m903k(currentInputEditorInfo, i5);
                                            return;
                                        }
                                        m504L0();
                                        return;
                                    case -98:
                                        m504L0();
                                        return;
                                    case -97:
                                        currentInputEditorInfo = getCurrentInputEditorInfo();
                                        i5 = 4;
                                        this.f6343z.m903k(currentInputEditorInfo, i5);
                                        return;
                                    case -96:
                                        currentInputEditorInfo = getCurrentInputEditorInfo();
                                        i5 = 5;
                                        this.f6343z.m903k(currentInputEditorInfo, i5);
                                        return;
                                    case -95:
                                        currentInputEditorInfo = getCurrentInputEditorInfo();
                                        i5 = 6;
                                        this.f6343z.m903k(currentInputEditorInfo, i5);
                                        return;
                                    case -94:
                                        currentInputEditorInfo = getCurrentInputEditorInfo();
                                        i5 = 7;
                                        this.f6343z.m903k(currentInputEditorInfo, i5);
                                        return;
                                    default:
                                        switch (i) {
                                            case -25:
                                                i4 = 123;
                                                break;
                                            case -24:
                                                i4 = 122;
                                                break;
                                            case -23:
                                                i4 = 20;
                                                break;
                                            case -22:
                                                i4 = 19;
                                                break;
                                            case -21:
                                            case -20:
                                                i4 = i == -20 ? 21 : 22;
                                                if (m489k0(i4, currentInputConnection)) {
                                                    return;
                                                }
                                                break;
                                            default:
                                                switch (i) {
                                                    case -15:
                                                        this.f6313i.m1072e();
                                                        m513C0();
                                                        return;
                                                    case -14:
                                                        this.f6312h.m1072e();
                                                        break;
                                                    case -13:
                                                        if (currentInputConnection != null) {
                                                            currentInputConnection.beginBatchEdit();
                                                            m467J(false);
                                                            currentInputConnection.deleteSurroundingText(Integer.MAX_VALUE, Integer.MAX_VALUE);
                                                            currentInputConnection.endBatchEdit();
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        switch (i) {
                                                            case -8:
                                                                if (currentInputConnection != null) {
                                                                    C1499t0 c1499t0 = this.f6389L;
                                                                    if (!(this.f6398U && c1499t0.f4849g < c1499t0.m993e() && !c1499t0.m987k())) {
                                                                        sendDownUpKeyEvents(112);
                                                                        return;
                                                                    }
                                                                    if (c1499t0.f4849g < c1499t0.m993e()) {
                                                                        c1499t0.f4846d.add((int[]) c1499t0.f4845c.remove(c1499t0.f4848f.codePointCount(0, c1499t0.f4849g)));
                                                                        int codePointAt = Character.codePointAt(c1499t0.f4848f, c1499t0.f4849g);
                                                                        StringBuilder sb = c1499t0.f4848f;
                                                                        int i7 = c1499t0.f4849g;
                                                                        sb.delete(i7, Character.charCount(codePointAt) + i7);
                                                                        if (Character.isUpperCase(codePointAt)) {
                                                                            c1499t0.f4850h--;
                                                                        }
                                                                        Character.charCount(codePointAt);
                                                                    }
                                                                    int m491w = c1499t0.f4849g != c1499t0.m993e() ? m491w() : -1;
                                                                    if (m491w >= 0) {
                                                                        currentInputConnection.beginBatchEdit();
                                                                    }
                                                                    m456V();
                                                                    currentInputConnection.setComposingText(c1499t0.mo995c(), 1);
                                                                    if (m491w >= 0 && !c1499t0.m987k()) {
                                                                        currentInputConnection.setSelection(m491w, m491w);
                                                                    }
                                                                    if (m491w >= 0) {
                                                                        currentInputConnection.endBatchEdit();
                                                                    }
                                                                    m453Z();
                                                                    return;
                                                                }
                                                                return;
                                                            case -7:
                                                                if (currentInputConnection == null) {
                                                                    return;
                                                                }
                                                                break;
                                                            case -6:
                                                                EditorInfo currentInputEditorInfo3 = getCurrentInputEditorInfo();
                                                                C1687o0 c1687o02 = this.f6343z;
                                                                if (c1687o02.m906h(currentInputEditorInfo3) == null) {
                                                                    c1687o02.m908f();
                                                                    if (!c1687o02.f5204u) {
                                                                        r1 = c1687o02.f5198o == 0 ? 1 : 0;
                                                                        c1687o02.f5198o = r1;
                                                                        AbstractC1762t m905i = c1687o02.m905i(r1);
                                                                        c1687o02.f5192i.getResources();
                                                                        m905i.m833x();
                                                                        c1687o02.f5191h.mo430e(m905i);
                                                                    }
                                                                }
                                                                this.f6338B.mo824r();
                                                                return;
                                                            case -5:
                                                                if (currentInputConnection != null) {
                                                                    if (this.f6334j1) {
                                                                        C1415a c1415a = this.f6312h;
                                                                        if (c1415a.f4664a == 1) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    m512D0(false);
                                                                    return;
                                                                }
                                                                return;
                                                            case -4:
                                                                C2060n c2060n = this.f6288P1;
                                                                if ((c2060n.f6246b != null ? 1 : 0) != 0) {
                                                                    String mo826o = this.f6337A.mo826o();
                                                                    InterfaceC2059m interfaceC2059m = c2060n.f6246b;
                                                                    if (interfaceC2059m != null) {
                                                                        interfaceC2059m.mo517a(mo826o);
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                Intent intent2 = new Intent(getApplicationContext(), VoiceInputNotInstalledActivity.class);
                                                                intent2.setFlags(268435456);
                                                                startActivity(intent2);
                                                                return;
                                                            case -3:
                                                                if (mo419z()) {
                                                                    return;
                                                                }
                                                                hideWindow();
                                                                return;
                                                            case -2:
                                                                currentInputEditorInfo = getCurrentInputEditorInfo();
                                                                i5 = 1;
                                                                this.f6343z.m903k(currentInputEditorInfo, i5);
                                                                return;
                                                            case -1:
                                                                break;
                                                            default:
                                                                return;
                                                        }
                                                        mo482p0(currentInputConnection);
                                                        return;
                                                }
                                                m511E0();
                                                return;
                                        }
                                        sendDownUpKeyEvents(i4);
                                        return;
                                }
                        }
                }
            } else if (this.f6437q1) {
                m421u0(key);
            } else {
                m420v0();
            }
        }
    }

    /* renamed from: H0 */
    public final void m508H0(InputConnection inputConnection, int i, int i2, int i3) {
        if (inputConnection == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        inputConnection.sendKeyEvent(new KeyEvent(currentTimeMillis, currentTimeMillis, i, i2, 0, i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo478I(AbstractC1762t abstractC1762t) {
        int i;
        EnumC1764v enumC1764v = this.f6286N1;
        C1675i0 c1675i0 = abstractC1762t.f5418J;
        InterfaceC1677j0 interfaceC1677j0 = abstractC1762t.f5131a;
        boolean z = true;
        if (!c1675i0.f5171a.equals(enumC1764v)) {
            int ordinal = enumC1764v.ordinal();
            float f = (ordinal == 2 || ordinal == 3) ? c1675i0.f5175e : c1675i0.f5174d;
            if (enumC1764v.equals(EnumC1764v.None) || f <= 0.97f) {
                int mo866a = (int) (interfaceC1677j0.mo866a() / 2.0f);
                List list = c1675i0.f5173c.f5147q;
                if (c1675i0.f5172b == null) {
                    c1675i0.f5172b = new ArrayList(list.size());
                }
                List list2 = c1675i0.f5172b;
                if (list2.size() > 0) {
                    if (list2.size() != list.size()) {
                        throw new IllegalStateException("The size of the stashed keys and the actual keyboard keys is not the same!");
                    }
                    for (int i2 = 0; i2 < list2.size(); i2++) {
                        Key key = (Key) list.get(i2);
                        C1673h0 c1673h0 = (C1673h0) c1675i0.f5172b.get(i2);
                        int i3 = c1673h0.f5166a;
                        key.width = i3;
                        int i4 = c1673h0.f5167b;
                        key.height = i4;
                        int i5 = c1673h0.f5168c;
                        key.x = i5;
                        key.centerX = (i3 / 2) + i5;
                        int i6 = c1673h0.f5169d;
                        key.y = i6;
                        key.centerY = (i4 / 2) + i6;
                    }
                }
                c1675i0.f5172b.clear();
                int mo831g = c1675i0.f5173c.mo831g();
                int ordinal2 = enumC1764v.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        i = mo831g / 2;
                    } else if (ordinal2 == 2) {
                        i = 0;
                    } else if (ordinal2 != 3) {
                        throw new IllegalArgumentException("Unknown condensing type given: " + enumC1764v);
                    } else {
                        c1675i0.m919c(mo831g, mo831g, mo866a, f);
                    }
                    c1675i0.m919c(mo831g, i, mo866a, f);
                }
                c1675i0.f5171a = enumC1764v;
                if (z) {
                    abstractC1762t.m927a();
                }
                super.mo478I(abstractC1762t);
            }
        }
        z = false;
        if (z) {
        }
        super.mo478I(abstractC1762t);
    }

    /* renamed from: I0 */
    public final void m507I0() {
        KeyEvent keyEvent;
        InputConnection currentInputConnection = getCurrentInputConnection();
        if (currentInputConnection == null) {
            return;
        }
        if (m510F0()) {
            currentInputConnection.sendKeyEvent(new KeyEvent(0, 23));
            currentInputConnection.sendKeyEvent(new KeyEvent(1, 23));
            currentInputConnection.sendKeyEvent(new KeyEvent(0, 37));
            keyEvent = new KeyEvent(1, 37);
        } else {
            currentInputConnection.sendKeyEvent(new KeyEvent(0, 61));
            keyEvent = new KeyEvent(1, 61);
        }
        currentInputConnection.sendKeyEvent(keyEvent);
    }

    /* renamed from: J0 */
    public final void m506J0(Configuration configuration) {
        EnumC1764v enumC1764v = this.f6286N1;
        EnumC1764v enumC1764v2 = configuration.orientation == 2 ? this.f6284L1 : this.f6285M1;
        this.f6286N1 = enumC1764v2;
        if (enumC1764v != enumC1764v2) {
            this.f6343z.m910d();
            hideWindow();
        }
    }

    /* renamed from: K0 */
    public final void m505K0() {
        AbstractC1762t abstractC1762t = this.f6337A;
        IBinder iBinder = this.f6383k;
        if (!this.f6282J1 || abstractC1762t == null || iBinder == null) {
            return;
        }
        this.f6287O1.showStatusIcon(iBinder, abstractC1762t.f5134d.f4708d, abstractC1762t.mo825p());
    }

    /* renamed from: L0 */
    public final void m504L0() {
        C1687o0 c1687o0 = this.f6343z;
        c1687o0.m912b();
        List<C1671g0> asList = Arrays.asList(c1687o0.f5201r);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C1671g0 c1671g0 : asList) {
            arrayList.add(c1671g0.f4705a);
            arrayList2.add(c1671g0.f4706b);
        }
        int size = arrayList.size() + 1;
        final CharSequence[] charSequenceArr = new CharSequence[size];
        final CharSequence[] charSequenceArr2 = new CharSequence[arrayList2.size() + 1];
        arrayList.toArray(charSequenceArr);
        arrayList2.toArray(charSequenceArr2);
        int i = size - 1;
        charSequenceArr[i] = "ASK_LANG_SETTINGS_ID";
        charSequenceArr2[i] = getText(R.string.setup_wizard_step_three_action_languages);
        m484E(getText(R.string.select_keyboard_popup_title), R.drawable.ic_keyboard_globe_menu, charSequenceArr2, new DialogInterface.OnClickListener() { // from class: c.b.k
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                AnySoftKeyboard anySoftKeyboard = AnySoftKeyboard.this;
                CharSequence[] charSequenceArr3 = charSequenceArr;
                CharSequence[] charSequenceArr4 = charSequenceArr2;
                anySoftKeyboard.getClass();
                CharSequence charSequence = charSequenceArr3[i2];
                CharSequence charSequence2 = charSequenceArr4[i2];
                EditorInfo currentInputEditorInfo = anySoftKeyboard.getCurrentInputEditorInfo();
                if ("ASK_LANG_SETTINGS_ID".equals(charSequence.toString())) {
                    anySoftKeyboard.startActivity(new Intent(anySoftKeyboard.getApplicationContext(), MainSettingsActivity.class).putExtra("shortcut_id", "keyboards").setAction("android.intent.action.VIEW").addFlags(268435456));
                } else {
                    anySoftKeyboard.f6343z.m904j(currentInputEditorInfo, charSequence.toString());
                }
            }
        }, null);
    }

    /* renamed from: M0 */
    public final void m503M0() {
        int i;
        InputConnection currentInputConnection = getCurrentInputConnection();
        EditorInfo currentInputEditorInfo = getCurrentInputEditorInfo();
        int i2 = ((!this.f6292T1 || !this.f6291S1 || currentInputConnection == null || currentInputEditorInfo == null || (i = currentInputEditorInfo.inputType) == 0) ? 0 : currentInputConnection.getCursorCapsMode(i)) != 0 ? 1 : 0;
        C1415a c1415a = this.f6312h;
        if (c1415a.f4665b != 2) {
            c1415a.f4665b = i2;
            if (i2 == 1) {
                c1415a.f4666c = 0L;
                c1415a.f4669f = false;
            }
        }
        m511E0();
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardTagsSearcher, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions
    /* renamed from: R */
    public boolean mo460R(int i) {
        if (super.mo460R(i)) {
            return true;
        }
        AbstractC1762t abstractC1762t = this.f6337A;
        if (abstractC1762t == null) {
            return false;
        }
        if (this.f6389L.m987k()) {
            return Character.isLetter(i);
        }
        return abstractC1762t.mo821u(i);
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardWithGestureTyping, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, p093c.p097b.p130z.InterfaceC1685n0
    /* renamed from: d */
    public void mo431d(AbstractC1762t abstractC1762t) {
        super.mo431d(abstractC1762t);
        C1415a c1415a = this.f6312h;
        c1415a.f4664a = 0;
        c1415a.f4668e = false;
        c1415a.f4665b = 0;
        c1415a.f4666c = 0L;
        c1415a.f4669f = false;
        C1415a c1415a2 = this.f6313i;
        c1415a2.f4664a = 0;
        c1415a2.f4668e = false;
        c1415a2.f4665b = 0;
        c1415a2.f4666c = 0L;
        c1415a2.f4669f = false;
        m449c0();
        m505K0();
        m464M();
        m503M0();
        this.f6292T1 = abstractC1762t.f5142l;
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: f */
    public void mo502f() {
        InputConnection currentInputConnection = getCurrentInputConnection();
        if (currentInputConnection != null) {
            currentInputConnection.endBatchEdit();
        }
        m503M0();
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: i */
    public void mo447i(int i) {
        super.mo447i(i);
        InputConnection currentInputConnection = getCurrentInputConnection();
        if (i == -1) {
            this.f6312h.m1073d(this.f6380w, this.f6381x);
            m511E0();
        } else if (this.f6312h.m1074c()) {
            m503M0();
        }
        if (i == -11) {
            if (currentInputConnection != null) {
                currentInputConnection.sendKeyEvent(new KeyEvent(1, 113));
            }
            this.f6313i.m1073d(this.f6380w, this.f6381x);
        } else {
            this.f6313i.m1074c();
        }
        m513C0();
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: k */
    public void mo446k() {
        InputConnection currentInputConnection = getCurrentInputConnection();
        if (currentInputConnection != null) {
            currentInputConnection.beginBatchEdit();
        }
        m512D0(true);
        super.mo446k();
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardPressEffects, com.anysoftkeyboard.ime.AnySoftKeyboardClipboard, p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: n */
    public void mo472n(int i) {
        ExtractedText m490x;
        StringBuilder sb;
        String lowerCase;
        super.mo472n(i);
        InputConnection currentInputConnection = getCurrentInputConnection();
        if (i == -1) {
            C1415a c1415a = this.f6312h;
            c1415a.f4664a = 1;
            c1415a.f4669f = false;
            c1415a.f4667d = SystemClock.elapsedRealtime();
            InputConnection currentInputConnection2 = getCurrentInputConnection();
            if (currentInputConnection2 != null && this.f6311g != this.f6310f && (m490x = m490x()) != null) {
                int i2 = m490x.selectionStart;
                int i3 = m490x.selectionEnd;
                CharSequence charSequence = m490x.text;
                if (charSequence != null && i2 != i3 && i3 != -1 && i2 != -1) {
                    CharSequence subSequence = charSequence.subSequence(i2, i3);
                    if (subSequence.length() > 0) {
                        currentInputConnection2.beginBatchEdit();
                        String charSequence2 = subSequence.toString();
                        AbstractC1762t abstractC1762t = this.f6337A;
                        Locale mo823s = abstractC1762t != null ? abstractC1762t.mo823s() : Locale.ROOT;
                        this.f6281I1.setLength(0);
                        if (charSequence2.compareTo(charSequence2.toLowerCase(mo823s)) == 0) {
                            this.f6281I1.append(charSequence2.toLowerCase(mo823s));
                            this.f6281I1.setCharAt(0, Character.toUpperCase(charSequence2.charAt(0)));
                        } else {
                            if (charSequence2.compareTo(charSequence2.toUpperCase(mo823s)) != 0) {
                                String substring = charSequence2.substring(1);
                                if (Character.isUpperCase(charSequence2.charAt(0)) && substring.compareTo(substring.toLowerCase(mo823s)) == 0) {
                                    sb = this.f6281I1;
                                    lowerCase = charSequence2.toUpperCase(mo823s);
                                    sb.append(lowerCase);
                                }
                            }
                            sb = this.f6281I1;
                            lowerCase = charSequence2.toLowerCase(mo823s);
                            sb.append(lowerCase);
                        }
                        currentInputConnection2.setComposingText(this.f6281I1.toString(), 0);
                        currentInputConnection2.endBatchEdit();
                        currentInputConnection2.setSelection(i2, i3);
                    }
                }
            }
            m511E0();
        } else {
            C1415a c1415a2 = this.f6312h;
            if (c1415a2.f4664a == 1) {
                c1415a2.f4668e = true;
            } else if (c1415a2.f4665b == 1) {
                c1415a2.f4669f = true;
            }
        }
        if (i == -11) {
            C1415a c1415a3 = this.f6313i;
            c1415a3.f4664a = 1;
            c1415a3.f4669f = false;
            c1415a3.f4667d = SystemClock.elapsedRealtime();
            m513C0();
            if (currentInputConnection != null) {
                currentInputConnection.sendKeyEvent(new KeyEvent(0, 113));
                return;
            }
            return;
        }
        C1415a c1415a4 = this.f6313i;
        if (c1415a4.f4664a == 1) {
            c1415a4.f4668e = true;
        } else if (c1415a4.f4665b == 1) {
            c1415a4.f4669f = true;
        }
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardColorizeNavBar, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, android.inputmethodservice.InputMethodService, android.app.Service, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
        if (i != this.f6293U1) {
            this.f6293U1 = i;
            m506J0(configuration);
        }
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardColorizeNavBar, com.anysoftkeyboard.ime.AnySoftKeyboardWithGestureTyping, com.anysoftkeyboard.ime.AnySoftKeyboardWithQuickText, com.anysoftkeyboard.ime.AnySoftKeyboardMediaInsertion, com.anysoftkeyboard.ime.AnySoftKeyboardHardware, com.anysoftkeyboard.ime.AnySoftKeyboardPressEffects, com.anysoftkeyboard.ime.AnySoftKeyboardClipboard, com.anysoftkeyboard.ime.AnySoftKeyboardSwipeListener, com.anysoftkeyboard.ime.AnySoftKeyboardPopText, com.anysoftkeyboard.ime.AnySoftKeyboardPowerSaving, com.anysoftkeyboard.ime.AnySoftKeyboardNightMode, com.anysoftkeyboard.ime.AnySoftKeyboardThemeOverlay, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardTagsSearcher, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, com.anysoftkeyboard.ime.AnySoftKeyboardRxPrefs, com.anysoftkeyboard.ime.AnySoftKeyboardDialogProvider, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f6293U1 = getResources().getConfiguration().orientation;
        if (AbstractC1260g.m1138d(getApplicationContext())) {
            try {
                Debug.startMethodTracing(AbstractC1260g.m1139c().getAbsolutePath());
                AbstractC1260g.f4452b = true;
                Toast.makeText(getApplicationContext(), (int) R.string.debug_tracing_starting, 0).show();
            } catch (Exception e) {
                e.printStackTrace();
                Toast.makeText(getApplicationContext(), (int) R.string.debug_tracing_starting_failed, 1).show();
            }
        }
        AbstractC2094b m1160a = EnumC1178v.m1160a(this);
        InterfaceC2123e interfaceC2123e = new InterfaceC2123e() { // from class: c.b.l
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboard anySoftKeyboard = AnySoftKeyboard.this;
                EnumC1178v enumC1178v = (EnumC1178v) obj;
                int identifier = anySoftKeyboard.getResources().getIdentifier("Animation_InputMethodFancy", "style", "android");
                Window window = anySoftKeyboard.getWindow().getWindow();
                if (window == null) {
                    return;
                }
                if (identifier == 0) {
                    identifier = 16973910;
                }
                window.setWindowAnimations(identifier);
            }
        };
        C1215b c1215b = new C1215b("AnimationsLevel");
        InterfaceC2119a interfaceC2119a = AbstractC2146l.f7038c;
        InterfaceC2123e interfaceC2123e2 = AbstractC2146l.f7039d;
        this.f6371n.mo117c(m1160a.m164N(interfaceC2123e, c1215b, interfaceC2119a, interfaceC2123e2));
        this.f6371n.mo117c(((C1785g) this.f6370m.m1172a(R.string.settings_key_auto_capitalization, R.bool.settings_default_auto_capitalization)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.g
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboard anySoftKeyboard = AnySoftKeyboard.this;
                anySoftKeyboard.getClass();
                anySoftKeyboard.f6291S1 = ((Boolean) obj).booleanValue();
            }
        }, new C1215b("settings_key_auto_capitalization"), interfaceC2119a, interfaceC2123e2));
        AbstractC2094b abstractC2094b = ((C1785g) this.f6370m.m1170c(R.string.settings_key_default_split_state_portrait, R.string.settings_default_default_split_state)).f5459e;
        C1414j c1414j = new InterfaceC2127i() { // from class: c.b.j
            @Override // p183e.p184a.p189o.InterfaceC2127i
            /* renamed from: a */
            public final Object mo24a(Object obj) {
                String str = (String) obj;
                int i = AnySoftKeyboard.f6279G1;
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -753059328:
                        if (str.equals("compact_right")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 109648666:
                        if (str.equals("split")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 114072483:
                        if (str.equals("compact_left")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return EnumC1764v.CompactToRight;
                    case 1:
                        return EnumC1764v.Split;
                    case 2:
                        return EnumC1764v.CompactToLeft;
                    default:
                        return EnumC1764v.None;
                }
            }
        };
        this.f6371n.mo117c(abstractC2094b.m172F(c1414j).m164N(new InterfaceC2123e() { // from class: c.b.f
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboard anySoftKeyboard = AnySoftKeyboard.this;
                anySoftKeyboard.f6285M1 = (EnumC1764v) obj;
                anySoftKeyboard.m506J0(anySoftKeyboard.getResources().getConfiguration());
            }
        }, new C1215b("settings_key_default_split_state_portrait"), interfaceC2119a, interfaceC2123e2));
        this.f6371n.mo117c(((C1785g) this.f6370m.m1170c(R.string.settings_key_default_split_state_landscape, R.string.settings_default_default_split_state)).f5459e.m172F(c1414j).m164N(new InterfaceC2123e() { // from class: c.b.i
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboard anySoftKeyboard = AnySoftKeyboard.this;
                anySoftKeyboard.f6284L1 = (EnumC1764v) obj;
                anySoftKeyboard.m506J0(anySoftKeyboard.getResources().getConfiguration());
            }
        }, new C1215b("settings_key_default_split_state_landscape"), interfaceC2119a, interfaceC2123e2));
        m506J0(getResources().getConfiguration());
        this.f6287O1 = (InputMethodManager) getSystemService("input_method");
        PackagesChangedReceiver packagesChangedReceiver = this.f6280H1;
        packagesChangedReceiver.getClass();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.intent.category.DEFAULT");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addDataScheme("package");
        registerReceiver(packagesChangedReceiver, intentFilter);
        this.f6371n.mo117c(((C1785g) this.f6370m.m1172a(R.string.settings_key_keyboard_icon_in_status_bar, R.bool.settings_default_keyboard_icon_in_status_bar)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.e
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                AnySoftKeyboard anySoftKeyboard = AnySoftKeyboard.this;
                anySoftKeyboard.getClass();
                anySoftKeyboard.f6282J1 = ((Boolean) obj).booleanValue();
            }
        }, new C1215b("settings_key_keyboard_icon_in_status_bar"), interfaceC2119a, interfaceC2123e2));
        this.f6288P1 = new C2060n(this);
    }

    @Override // android.inputmethodservice.InputMethodService
    public View onCreateExtractTextView() {
        View onCreateExtractTextView = super.onCreateExtractTextView();
        this.f6289Q1 = onCreateExtractTextView;
        if (onCreateExtractTextView != null) {
            this.f6290R1 = (EditText) onCreateExtractTextView.findViewById(16908325);
        }
        return this.f6289Q1;
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardMediaInsertion, com.anysoftkeyboard.ime.AnySoftKeyboardPressEffects, com.anysoftkeyboard.ime.AnySoftKeyboardSwipeListener, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardTagsSearcher, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, com.anysoftkeyboard.ime.AnySoftKeyboardRxPrefs, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService, android.inputmethodservice.AbstractInputMethodService, android.app.Service
    public void onDestroy() {
        unregisterReceiver(this.f6280H1);
        IBinder iBinder = this.f6383k;
        if (iBinder != null) {
            this.f6287O1.hideStatusIcon(iBinder);
        }
        hideWindow();
        if (AbstractC1260g.f4452b) {
            try {
                Debug.stopMethodTracing();
            } catch (Exception e) {
                e.printStackTrace();
            }
            AbstractC1260g.f4452b = false;
            Toast.makeText(getApplicationContext(), getString(R.string.debug_tracing_finished, new Object[]{AbstractC1260g.m1139c()}), 0).show();
        }
        super.onDestroy();
    }

    @Override // android.inputmethodservice.InputMethodService
    public boolean onEvaluateFullscreenMode() {
        if (getCurrentInputEditorInfo() != null) {
            int i = getCurrentInputEditorInfo().imeOptions;
            if ((33554432 & i) != 0 || (i & 268435456) != 0) {
                return false;
            }
        }
        return getResources().getConfiguration().orientation == 2 ? this.f6376s : this.f6377t;
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardHardware, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService
    public void onFinishInput() {
        super.onFinishInput();
        IBinder iBinder = this.f6383k;
        if (this.f6282J1 && iBinder != null) {
            this.f6287O1.hideStatusIcon(iBinder);
        }
        InterfaceC1566d3 interfaceC1566d3 = this.f6308d;
        if (interfaceC1566d3 != null) {
            interfaceC1566d3.mo410c();
        }
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardHardware, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, android.inputmethodservice.InputMethodService
    public void onStartInput(EditorInfo editorInfo, boolean z) {
        super.onStartInput(editorInfo, z);
        m505K0();
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardColorizeNavBar, com.anysoftkeyboard.ime.AnySoftKeyboardIncognito, com.anysoftkeyboard.ime.AnySoftKeyboardMediaInsertion, com.anysoftkeyboard.ime.AnySoftKeyboardPressEffects, com.anysoftkeyboard.ime.AnySoftKeyboardClipboard, com.anysoftkeyboard.ime.AnySoftKeyboardThemeOverlay, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, android.inputmethodservice.InputMethodService
    public void onStartInputView(EditorInfo editorInfo, boolean z) {
        int i = editorInfo.imeOptions;
        super.onStartInputView(editorInfo, z);
        C2060n c2060n = this.f6288P1;
        if (c2060n != null) {
            InterfaceC2059m interfaceC2059m = c2060n.f6246b;
            if (interfaceC2059m != null) {
                interfaceC2059m.mo516b();
            }
            c2060n.f6246b = c2060n.m515a();
        }
        InterfaceC1566d3 interfaceC1566d3 = this.f6308d;
        if (interfaceC1566d3 == null) {
            return;
        }
        interfaceC1566d3.mo410c();
        this.f6308d.setKeyboardActionType(editorInfo.imeOptions);
        m503M0();
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService
    public void onUpdateSelection(int i, int i2, int i3, int i4, int i5, int i6) {
        m503M0();
        super.onUpdateSelection(i, i2, i3, i4, i5, i6);
    }

    @Override // android.inputmethodservice.InputMethodService
    public void onWindowHidden() {
        super.onWindowHidden();
        m467J(true);
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardHardware
    /* renamed from: p0 */
    public void mo482p0(InputConnection inputConnection) {
        if (inputConnection == null) {
            return;
        }
        m456V();
        C1499t0 c1499t0 = this.f6389L;
        if (this.f6398U && c1499t0.f4849g > 0 && !c1499t0.m987k()) {
            CharSequence subSequence = ((String) c1499t0.mo995c()).subSequence(c1499t0.f4849g, c1499t0.m993e());
            c1499t0.m986l();
            ((C1487n0) this.f6391N).m1004d();
            inputConnection.setComposingText(subSequence, 0);
            m453Z();
            return;
        }
        CharSequence textBeforeCursor = inputConnection.getTextBeforeCursor(128, 0);
        if (TextUtils.isEmpty(textBeforeCursor)) {
            return;
        }
        int length = textBeforeCursor.length();
        int codePointBefore = Character.codePointBefore(textBeforeCursor, length);
        int i = length;
        while (Character.isWhitespace(codePointBefore) && (i = i - Character.charCount(codePointBefore)) != 0) {
            codePointBefore = Character.codePointBefore(textBeforeCursor, i);
        }
        if (i > 0) {
            int i2 = i;
            while (Character.isLetterOrDigit(codePointBefore) && (i2 = i2 - Character.charCount(codePointBefore)) != 0) {
                codePointBefore = Character.codePointBefore(textBeforeCursor, i2);
            }
            i = i2 == i ? i2 - Character.charCount(codePointBefore) : i2;
        }
        inputConnection.deleteSurroundingText(length - i, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc  */
    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardWithGestureTyping, com.anysoftkeyboard.ime.AnySoftKeyboardClipboard, com.anysoftkeyboard.ime.AnySoftKeyboardPopText, com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions, com.anysoftkeyboard.ime.AnySoftKeyboardKeyboardSwitchedListener, p093c.p097b.p130z.p132r0.InterfaceC1748t0
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo379s(int i, Key key, int i2, int[] iArr, boolean z) {
        int i3;
        ExtractedText m490x;
        super.mo379s(i, key, i2, iArr, z);
        if (i > 0) {
            InputConnection currentInputConnection = getCurrentInputConnection();
            if (i != 9) {
                if (i == 10) {
                    if ((this.f6312h.f4664a == 1) && currentInputConnection != null) {
                        currentInputConnection.commitText("\n", 1);
                        return;
                    }
                    EditorInfo currentInputEditorInfo = getCurrentInputEditorInfo();
                    int i4 = currentInputEditorInfo.imeOptions;
                    int i5 = (1073741824 & i4) != 0 ? 1 : currentInputEditorInfo.actionLabel != null ? 256 : i4 & 255;
                    if (currentInputConnection != null && 256 == i5) {
                        currentInputConnection.performEditorAction(currentInputEditorInfo.actionId);
                        return;
                    } else if (currentInputConnection != null && 1 != i5) {
                        currentInputConnection.performEditorAction(i5);
                        return;
                    }
                } else if (i != 27) {
                    if (this.f6311g != this.f6310f && this.f6283K1.m2609d(i, null) != null) {
                        int[] iArr2 = (int[]) this.f6283K1.m2609d(i, null);
                        int i6 = iArr2[0];
                        int i7 = iArr2[1];
                        InputConnection currentInputConnection2 = getCurrentInputConnection();
                        if (currentInputConnection2 == null || (m490x = m490x()) == null) {
                            return;
                        }
                        int i8 = m490x.selectionStart;
                        int i9 = m490x.selectionEnd;
                        CharSequence charSequence = m490x.text;
                        if (charSequence == null || i8 == i9 || i9 == -1 || i8 == -1) {
                            return;
                        }
                        CharSequence subSequence = charSequence.subSequence(i8, i9);
                        if (subSequence.length() > 0) {
                            StringBuilder sb = new StringBuilder();
                            char[] chars = Character.toChars(i6);
                            sb.append(chars);
                            sb.append(subSequence);
                            sb.append(Character.toChars(i7));
                            currentInputConnection2.beginBatchEdit();
                            currentInputConnection2.commitText(sb.toString(), 0);
                            currentInputConnection2.endBatchEdit();
                            currentInputConnection2.setSelection(i8 + chars.length, i9 + chars.length);
                            return;
                        }
                        return;
                    } else if (!(!mo460R(i))) {
                        if (this.f6313i.m1076a()) {
                            int i10 = 65;
                            if (i < 65 || i > 90) {
                                i10 = 97;
                                if (i < 97 || i > 122) {
                                    i3 = 0;
                                    if (i3 == 0) {
                                        m508H0(currentInputConnection, 0, i3, 28672);
                                        m508H0(currentInputConnection, 1, i3, 28672);
                                        return;
                                    } else if (i >= 32 && i < 127) {
                                        int i11 = i & 31;
                                        if (i11 != 9) {
                                            currentInputConnection.commitText(new String(new int[]{i11}, 0, 1), 1);
                                            return;
                                        }
                                    }
                                }
                            }
                            i3 = (i + 29) - i10;
                            if (i3 == 0) {
                            }
                        }
                        m462P(i, key, i2, iArr);
                        return;
                    }
                } else {
                    InputConnection currentInputConnection3 = getCurrentInputConnection();
                    if (currentInputConnection3 == null) {
                        return;
                    }
                    if (m510F0()) {
                        sendKeyChar((char) 27);
                        return;
                    }
                    currentInputConnection3.sendKeyEvent(new KeyEvent(0, 111));
                    currentInputConnection3.sendKeyEvent(new KeyEvent(1, 111));
                    return;
                }
                m461Q(i);
                return;
            }
            m507I0();
            return;
        }
        m509G0(i, key, z);
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardBase
    /* renamed from: u */
    public void mo492u(int i) {
        boolean z;
        if (i == 0) {
            return;
        }
        C1499t0 c1499t0 = this.f6389L;
        int mo997a = c1499t0.mo997a();
        if (mo997a > 0) {
            if (mo997a > i) {
                for (int i2 = i; i2 > 0; i2--) {
                    c1499t0.m992f();
                }
            } else {
                c1499t0.m986l();
            }
            z = true;
        } else {
            z = false;
        }
        InputConnection currentInputConnection = getCurrentInputConnection();
        if (currentInputConnection != null) {
            if (this.f6398U && z) {
                currentInputConnection.setComposingText(c1499t0.mo995c(), 1);
            } else {
                currentInputConnection.deleteSurroundingText(i, 0);
            }
        }
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardBase, android.inputmethodservice.InputMethodService
    public void updateFullscreenMode() {
        super.updateFullscreenMode();
        InterfaceC1566d3 interfaceC1566d3 = this.f6308d;
        View view = this.f6289Q1;
        if (view == null || interfaceC1566d3 == null) {
            return;
        }
        AnyKeyboardView anyKeyboardView = (AnyKeyboardView) interfaceC1566d3;
        AbstractC0605j0.m2267P(view, anyKeyboardView.getBackground());
        EditText editText = this.f6290R1;
        if (editText != null) {
            editText.setTextColor(((C1146i) anyKeyboardView.getCurrentResourcesHolder()).f4262a);
        }
    }

    @Override // com.anysoftkeyboard.ime.AnySoftKeyboardWithQuickText, com.anysoftkeyboard.ime.AnySoftKeyboardDialogProvider, com.anysoftkeyboard.ime.AnySoftKeyboardBase
    /* renamed from: z */
    public boolean mo419z() {
        InterfaceC1566d3 interfaceC1566d3;
        return super.mo419z() || ((interfaceC1566d3 = this.f6308d) != null && interfaceC1566d3.mo410c());
    }
}