package p093c.p145g.p146a.p175b;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.view.inputmethod.InputMethodManager;
import com.google.android.voiceime.ServiceHelper;

/* renamed from: c.g.a.b.j */
/* loaded from: classes.dex */
public class ServiceConnectionC2056j implements ServiceConnection {

    /* renamed from: a */
    public final String f6241a;

    /* renamed from: b */
    public final Context f6242b;

    public ServiceConnectionC2056j(Context context, String str, C2054h c2054h) {
        this.f6241a = str;
        this.f6242b = context;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ServiceHelper serviceHelper = ((BinderC2058l) iBinder).f6244a;
        String str = this.f6241a;
        C2054h c2054h = serviceHelper.f6978c;
        if (c2054h != null) {
            C2053g c2053g = c2054h.f6238c.f6243a.f6228a;
            c2053g.f6232c = str;
            ((InputMethodManager) c2053g.f6230a.getSystemService("input_method")).showSoftInputFromInputMethod(c2053g.f6235f, 1);
            try {
                c2054h.f6236a.unbindService(c2054h.f6237b);
            } catch (IllegalArgumentException unused) {
            }
        }
        this.f6242b.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }
}