package p010b.p082t;

import android.os.Handler;
import android.os.Message;
import androidx.preference.PreferenceScreen;

/* renamed from: b.t.u */
/* loaded from: classes.dex */
public class HandlerC0898u extends Handler {

    /* renamed from: a */
    public final /* synthetic */ AbstractC0904x f3506a;

    public HandlerC0898u(AbstractC0904x abstractC0904x) {
        this.f3506a = abstractC0904x;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        AbstractC0904x abstractC0904x = this.f3506a;
        PreferenceScreen preferenceScreen = abstractC0904x.f3515X.f3474g;
        if (preferenceScreen != null) {
            abstractC0904x.f3516Y.setAdapter(new C0865d0(preferenceScreen));
            preferenceScreen.mo3262p();
        }
    }
}