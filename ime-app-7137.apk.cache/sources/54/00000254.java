package p010b.p046j.p047d;

import android.app.Activity;
import android.content.pm.PackageManager;

/* renamed from: b.j.d.a */
/* loaded from: classes.dex */
public class RunnableC0464a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String[] f2435b;

    /* renamed from: c */
    public final /* synthetic */ Activity f2436c;

    /* renamed from: d */
    public final /* synthetic */ int f2437d;

    public RunnableC0464a(String[] strArr, Activity activity, int i) {
        this.f2435b = strArr;
        this.f2436c = activity;
        this.f2437d = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        int[] iArr = new int[this.f2435b.length];
        PackageManager packageManager = this.f2436c.getPackageManager();
        String packageName = this.f2436c.getPackageName();
        int length = this.f2435b.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = packageManager.checkPermission(this.f2435b[i], packageName);
        }
        ((InterfaceC0468c) this.f2436c).onRequestPermissionsResult(this.f2437d, this.f2435b, iArr);
    }
}