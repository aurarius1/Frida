package p093c.p097b.p121t;

import android.annotation.TargetApi;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import com.anysoftkeyboard.ime.AnySoftKeyboardClipboard;
import java.util.ArrayList;
import java.util.List;
import p093c.p097b.p128x.C1572f;

@TargetApi(11)
/* renamed from: c.b.t.e */
/* loaded from: classes.dex */
public class C1448e {

    /* renamed from: b */
    public final ClipboardManager f4749b;

    /* renamed from: c */
    public C1572f f4750c;

    /* renamed from: a */
    public final List f4748a = new ArrayList(16);

    /* renamed from: d */
    public final ClipboardManager.OnPrimaryClipChangedListener f4751d = new ClipboardManager.OnPrimaryClipChangedListener() { // from class: c.b.t.a
        @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
        public final void onPrimaryClipChanged() {
            ClipData primaryClip;
            C1448e c1448e = C1448e.this;
            C1572f c1572f = c1448e.f4750c;
            if (c1572f == null || (primaryClip = c1448e.f4749b.getPrimaryClip()) == null) {
                return;
            }
            for (int i = 0; i < primaryClip.getItemCount(); i++) {
                CharSequence text = primaryClip.getItemAt(i).getText();
                if (!TextUtils.isEmpty(text)) {
                    c1448e.f4748a.add(0, text);
                    while (c1448e.f4748a.size() > 15) {
                        c1448e.f4748a.remove(15);
                    }
                    AnySoftKeyboardClipboard anySoftKeyboardClipboard = c1572f.f4996a;
                    anySoftKeyboardClipboard.f6318R0 = text;
                    EditorInfo currentInputEditorInfo = anySoftKeyboardClipboard.getCurrentInputEditorInfo();
                    anySoftKeyboardClipboard.f6319S0 = currentInputEditorInfo != null && AnySoftKeyboardClipboard.m488l0(currentInputEditorInfo);
                    anySoftKeyboardClipboard.f6317Q0 = SystemClock.uptimeMillis();
                }
            }
        }
    };

    public C1448e(Context context) {
        this.f4749b = (ClipboardManager) context.getSystemService("clipboard");
    }

    /* renamed from: a */
    public void mo1029a(int i) {
        this.f4748a.remove(i);
        if (i == 0) {
            this.f4749b.setPrimaryClip(ClipData.newPlainText("Styled Text", ""));
        }
    }

    /* renamed from: b */
    public int m1030b() {
        return this.f4748a.size();
    }
}