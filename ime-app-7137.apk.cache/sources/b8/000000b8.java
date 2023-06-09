package p010b.p011a;

import android.text.TextUtils;

/* renamed from: b.a.b */
/* loaded from: classes.dex */
public class RunnableC0052b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AbstractActivityC0057g f829b;

    public RunnableC0052b(AbstractActivityC0057g abstractActivityC0057g) {
        this.f829b = abstractActivityC0057g;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            super/*android.app.Activity*/.onBackPressed();
        } catch (IllegalStateException e) {
            if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        }
    }
}