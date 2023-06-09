package p093c.p097b.p128x;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.inputmethod.InputConnection;
import com.anysoftkeyboard.ime.AnySoftKeyboardSuggestions;
import com.menny.android.anysoftkeyboard.R;
import java.lang.ref.WeakReference;
import p093c.p097b.p122u.C1487n0;

/* renamed from: c.b.x.e3 */
/* loaded from: classes.dex */
public final class HandlerC1571e3 extends Handler {

    /* renamed from: a */
    public final WeakReference f4995a;

    public HandlerC1571e3(AnySoftKeyboardSuggestions anySoftKeyboardSuggestions) {
        super(Looper.getMainLooper());
        this.f4995a = new WeakReference(anySoftKeyboardSuggestions);
    }

    /* renamed from: a */
    public void m941a() {
        removeMessages(R.id.keyboard_ui_handler_MSG_UPDATE_SUGGESTIONS);
        removeMessages(R.id.keyboard_ui_handler_MSG_RESTART_NEW_WORD_SUGGESTIONS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
        if (r0.m457U(r11.charAt(0)) == false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void handleMessage(Message message) {
        boolean z;
        boolean z2;
        AnySoftKeyboardSuggestions anySoftKeyboardSuggestions = (AnySoftKeyboardSuggestions) this.f4995a.get();
        if (anySoftKeyboardSuggestions == null) {
            return;
        }
        InputConnection currentInputConnection = anySoftKeyboardSuggestions.getCurrentInputConnection();
        switch (message.what) {
            case R.id.keyboard_ui_handler_MSG_CLOSE_DICTIONARIES /* 2131296541 */:
                ((C1487n0) anySoftKeyboardSuggestions.f6391N).f4785a.m1001c();
                return;
            case R.id.keyboard_ui_handler_MSG_RESTART_NEW_WORD_SUGGESTIONS /* 2131296542 */:
                anySoftKeyboardSuggestions.f6386I.removeMessages(R.id.keyboard_ui_handler_MSG_RESTART_NEW_WORD_SUGGESTIONS);
                anySoftKeyboardSuggestions.f6386I.removeMessages(R.id.keyboard_ui_handler_MSG_UPDATE_SUGGESTIONS);
                InterfaceC1566d3 interfaceC1566d3 = anySoftKeyboardSuggestions.f6308d;
                if (anySoftKeyboardSuggestions.f6398U && anySoftKeyboardSuggestions.f6403Z && anySoftKeyboardSuggestions.f6404a0 && interfaceC1566d3 != null && interfaceC1566d3.isShown()) {
                    InputConnection currentInputConnection2 = anySoftKeyboardSuggestions.getCurrentInputConnection();
                    if (currentInputConnection2 != null) {
                        CharSequence textBeforeCursor = currentInputConnection2.getTextBeforeCursor(1, 0);
                        if (TextUtils.isEmpty(textBeforeCursor) || anySoftKeyboardSuggestions.m457U(textBeforeCursor.charAt(0))) {
                            CharSequence textAfterCursor = currentInputConnection2.getTextAfterCursor(1, 0);
                            if (!TextUtils.isEmpty(textAfterCursor)) {
                                break;
                            }
                        }
                        z2 = true;
                        if (z2) {
                            z = true;
                            if (z) {
                                return;
                            }
                            currentInputConnection.beginBatchEdit();
                            anySoftKeyboardSuggestions.m467J(false);
                            CharSequence charSequence = "";
                            CharSequence charSequence2 = "";
                            while (true) {
                                CharSequence textBeforeCursor2 = currentInputConnection.getTextBeforeCursor(charSequence2.length() + 1, 0);
                                if (!TextUtils.isEmpty(textBeforeCursor2) && !anySoftKeyboardSuggestions.m457U(textBeforeCursor2.charAt(0)) && textBeforeCursor2.length() != charSequence2.length()) {
                                    charSequence2 = textBeforeCursor2;
                                }
                            }
                            while (true) {
                                CharSequence textAfterCursor2 = currentInputConnection.getTextAfterCursor(charSequence.length() + 1, 0);
                                if (!TextUtils.isEmpty(textAfterCursor2) && !anySoftKeyboardSuggestions.m457U(textAfterCursor2.charAt(textAfterCursor2.length() - 1)) && textAfterCursor2.length() != charSequence.length()) {
                                    charSequence = textAfterCursor2;
                                }
                            }
                            String str = charSequence2.toString() + charSequence.toString();
                            anySoftKeyboardSuggestions.f6389L.m986l();
                            int[] iArr = new int[1];
                            int i = 0;
                            while (i < str.length()) {
                                int codePointAt = Character.codePointAt(str, Character.offsetByCodePoints(str, 0, i));
                                if (i == 0) {
                                    anySoftKeyboardSuggestions.f6389L.f4852j = Character.isUpperCase(codePointAt);
                                }
                                iArr[0] = codePointAt;
                                anySoftKeyboardSuggestions.f6389L.m994d(codePointAt, iArr);
                                i += Character.charCount(codePointAt);
                            }
                            anySoftKeyboardSuggestions.f6389L.f4849g = charSequence2.length();
                            int m491w = anySoftKeyboardSuggestions.m491w();
                            currentInputConnection.setComposingRegion(m491w - charSequence2.length(), charSequence.length() + m491w);
                            anySoftKeyboardSuggestions.m456V();
                            currentInputConnection.endBatchEdit();
                            anySoftKeyboardSuggestions.m455W();
                            return;
                        }
                    }
                    z2 = false;
                    if (z2) {
                    }
                }
                z = false;
                if (z) {
                }
                break;
            case R.id.keyboard_ui_handler_MSG_UPDATE_SUGGESTIONS /* 2131296543 */:
                anySoftKeyboardSuggestions.m455W();
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }
}