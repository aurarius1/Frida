package p093c.p097b.p130z.p132r0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.anysoftkeyboard.keyboards.views.DemoAnyKeyboardView;
import java.lang.ref.WeakReference;

/* renamed from: c.b.z.r0.l0 */
/* loaded from: classes.dex */
public class HandlerC1732l0 extends Handler {

    /* renamed from: a */
    public final WeakReference f5323a;

    /* renamed from: b */
    public String f5324b;

    /* renamed from: c */
    public int f5325c;

    /* renamed from: d */
    public boolean f5326d;

    public HandlerC1732l0(DemoAnyKeyboardView demoAnyKeyboardView, AbstractC1728j0 abstractC1728j0) {
        super(Looper.getMainLooper());
        this.f5324b = "";
        this.f5325c = 0;
        this.f5323a = new WeakReference(demoAnyKeyboardView);
    }

    /* renamed from: a */
    public void m869a() {
        if (this.f5326d) {
            this.f5326d = false;
            removeMessages(109);
            removeMessages(110);
            removeMessages(111);
            sendMessage(obtainMessage(111));
        }
    }

    /* renamed from: b */
    public void m868b(String str) {
        m867c();
        this.f5324b = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        sendMessageDelayed(obtainMessage(109), 512L);
    }

    /* renamed from: c */
    public void m867c() {
        removeMessages(109);
        removeMessages(110);
        removeMessages(111);
        this.f5324b = "";
        this.f5325c = 0;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Message obtainMessage;
        long j;
        DemoAnyKeyboardView demoAnyKeyboardView = (DemoAnyKeyboardView) this.f5323a.get();
        if (demoAnyKeyboardView == null || this.f5324b.length() == 0) {
            return;
        }
        char charAt = this.f5324b.charAt(this.f5325c);
        switch (message.what) {
            case 109:
                if (this.f5326d) {
                    DemoAnyKeyboardView.m384K(demoAnyKeyboardView, charAt, true);
                }
                if (this.f5326d) {
                    obtainMessage = obtainMessage(110);
                    j = 128;
                    break;
                } else {
                    return;
                }
            case 110:
                DemoAnyKeyboardView.m384K(demoAnyKeyboardView, charAt, false);
                int i = this.f5325c + 1;
                this.f5325c = i;
                if (i == this.f5324b.length()) {
                    this.f5325c = 0;
                    if (this.f5326d) {
                        obtainMessage = obtainMessage(109);
                        j = 1024;
                        break;
                    } else {
                        return;
                    }
                } else if (this.f5326d) {
                    obtainMessage = obtainMessage(109);
                    if (charAt != ' ') {
                        j = 256;
                        break;
                    } else {
                        j = 512;
                        break;
                    }
                } else {
                    return;
                }
            case 111:
                DemoAnyKeyboardView.m383L(demoAnyKeyboardView);
                demoAnyKeyboardView.mo410c();
                return;
            default:
                super.handleMessage(message);
                return;
        }
        sendMessageDelayed(obtainMessage, j);
    }
}