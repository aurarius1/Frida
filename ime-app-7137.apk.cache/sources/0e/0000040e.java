package p010b.p082t;

import androidx.preference.PreferenceGroup;

/* renamed from: b.t.y */
/* loaded from: classes.dex */
public class RunnableC0906y implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ PreferenceGroup f3523b;

    public RunnableC0906y(PreferenceGroup preferenceGroup) {
        this.f3523b = preferenceGroup;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this) {
            this.f3523b.f634P.clear();
        }
    }
}