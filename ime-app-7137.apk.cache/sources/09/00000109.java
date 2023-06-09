package p010b.p016c.p017k;

import android.content.res.Resources;
import java.lang.Thread;

/* renamed from: b.c.k.w */
/* loaded from: classes.dex */
public class C0133w implements Thread.UncaughtExceptionHandler {

    /* renamed from: b */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f1104b;

    public C0133w(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f1104b = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        String message;
        boolean z = false;
        if ((th instanceof Resources.NotFoundException) && (message = th.getMessage()) != null && (message.contains("drawable") || message.contains("Drawable"))) {
            z = true;
        }
        if (!z) {
            this.f1104b.uncaughtException(thread, th);
            return;
        }
        Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
        notFoundException.initCause(th.getCause());
        notFoundException.setStackTrace(th.getStackTrace());
        this.f1104b.uncaughtException(thread, notFoundException);
    }
}