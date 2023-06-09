package p010b.p016c.p017k;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: b.c.k.m */
/* loaded from: classes.dex */
public final class HandlerC0113m extends Handler {

    /* renamed from: a */
    public WeakReference f962a;

    public HandlerC0113m(DialogInterface dialogInterface) {
        this.f962a = new WeakReference(dialogInterface);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i = message.what;
        if (i == -3 || i == -2 || i == -1) {
            ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f962a.get(), message.what);
        } else if (i != 1) {
        } else {
            ((DialogInterface) message.obj).dismiss();
        }
    }
}