package androidx.core.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;
import p010b.p046j.p047d.AbstractC0486s;
import p010b.p046j.p047d.AsyncTaskC0479l;
import p010b.p046j.p047d.C0481n;
import p010b.p046j.p047d.C0482o;
import p010b.p046j.p047d.InterfaceC0480m;
import p010b.p046j.p047d.jobJobServiceEngineC0485r;

/* loaded from: classes.dex */
public abstract class JobIntentService extends Service {

    /* renamed from: b */
    public static final HashMap f454b = new HashMap();

    /* renamed from: c */
    public InterfaceC0480m f455c;

    /* renamed from: d */
    public AbstractC0486s f456d;

    /* renamed from: e */
    public AsyncTaskC0479l f457e;

    /* renamed from: f */
    public boolean f458f = false;

    /* renamed from: g */
    public final ArrayList f459g;

    public JobIntentService() {
        this.f459g = Build.VERSION.SDK_INT >= 26 ? null : new ArrayList();
    }

    /* renamed from: a */
    public void m3345a(boolean z) {
        if (this.f457e == null) {
            this.f457e = new AsyncTaskC0479l(this);
            AbstractC0486s abstractC0486s = this.f456d;
            if (abstractC0486s != null && z) {
                abstractC0486s.mo2421b();
            }
            this.f457e.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* renamed from: b */
    public abstract void m3344b(Intent intent);

    /* renamed from: c */
    public void m3343c() {
        ArrayList arrayList = this.f459g;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f457e = null;
                ArrayList arrayList2 = this.f459g;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    m3345a(false);
                } else if (!this.f458f) {
                    this.f456d.mo2422a();
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        InterfaceC0480m interfaceC0480m = this.f455c;
        if (interfaceC0480m != null) {
            return ((jobJobServiceEngineC0485r) interfaceC0480m).getBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f455c = new jobJobServiceEngineC0485r(this);
            this.f456d = null;
            return;
        }
        this.f455c = null;
        ComponentName componentName = new ComponentName(this, getClass());
        HashMap hashMap = f454b;
        AbstractC0486s abstractC0486s = (AbstractC0486s) hashMap.get(componentName);
        if (abstractC0486s == null) {
            if (i >= 26) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            abstractC0486s = new C0481n(this, componentName);
            hashMap.put(componentName, abstractC0486s);
        }
        this.f456d = abstractC0486s;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f459g;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f458f = true;
                this.f456d.mo2422a();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.f459g != null) {
            this.f456d.mo2420c();
            synchronized (this.f459g) {
                ArrayList arrayList = this.f459g;
                if (intent == null) {
                    intent = new Intent();
                }
                arrayList.add(new C0482o(this, intent, i2));
                m3345a(true);
            }
            return 3;
        }
        return 2;
    }
}