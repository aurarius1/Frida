package p000a.p001a.p002a.p004b;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.support.p007v4.media.session.MediaSessionCompat$Token;
import java.lang.ref.WeakReference;
import p000a.p001a.p002a.p004b.p005x.AbstractC0040o;

/* renamed from: a.a.a.b.a */
/* loaded from: classes.dex */
public class HandlerC0003a extends Handler {

    /* renamed from: a */
    public final WeakReference f2a;

    /* renamed from: b */
    public WeakReference f3b;

    public HandlerC0003a(InterfaceC0015m interfaceC0015m) {
        this.f2a = new WeakReference(interfaceC0015m);
    }

    /* renamed from: a */
    public void m3548a(Messenger messenger) {
        this.f3b = new WeakReference(messenger);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        WeakReference weakReference = this.f3b;
        if (weakReference == null || weakReference.get() == null || this.f2a.get() == null) {
            return;
        }
        Bundle data = message.getData();
        AbstractC0040o.m3456a(data);
        InterfaceC0015m interfaceC0015m = (InterfaceC0015m) this.f2a.get();
        Messenger messenger = (Messenger) this.f3b.get();
        try {
            int i = message.what;
            if (i == 1) {
                Bundle bundle = data.getBundle("data_root_hints");
                AbstractC0040o.m3456a(bundle);
                interfaceC0015m.mo3537e(messenger, data.getString("data_media_item_id"), (MediaSessionCompat$Token) data.getParcelable("data_media_session_token"), bundle);
            } else if (i == 2) {
                interfaceC0015m.mo3538a(messenger);
            } else if (i != 3) {
                String str = "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1;
            } else {
                Bundle bundle2 = data.getBundle("data_options");
                AbstractC0040o.m3456a(bundle2);
                Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                AbstractC0040o.m3456a(bundle3);
                interfaceC0015m.mo3536f(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
            }
        } catch (BadParcelableException unused) {
            if (message.what == 1) {
                interfaceC0015m.mo3538a(messenger);
            }
        }
    }
}