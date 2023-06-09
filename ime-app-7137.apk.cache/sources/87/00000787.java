package p093c.p140e.p141a;

import android.content.Context;
import com.getkeepsafe.relinker.MissingLibraryException;

/* renamed from: c.e.a.d */
/* loaded from: classes.dex */
public class RunnableC1795d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Context f5470b;

    /* renamed from: c */
    public final /* synthetic */ String f5471c;

    /* renamed from: d */
    public final /* synthetic */ String f5472d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC1794c f5473e;

    /* renamed from: f */
    public final /* synthetic */ C1797f f5474f;

    public RunnableC1795d(C1797f c1797f, Context context, String str, String str2, InterfaceC1794c interfaceC1794c) {
        this.f5474f = c1797f;
        this.f5470b = context;
        this.f5471c = str;
        this.f5472d = str2;
        this.f5473e = interfaceC1794c;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f5474f.m796d(this.f5470b, this.f5471c, this.f5472d);
            this.f5473e.m800b();
        } catch (MissingLibraryException | UnsatisfiedLinkError e) {
            this.f5473e.m801a(e);
        }
    }
}