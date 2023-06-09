package p010b.p046j.p047d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000a.p001a.p002a.p003a.AbstractBinderC0001b;
import p000a.p001a.p002a.p003a.C0000a;
import p000a.p001a.p002a.p003a.InterfaceC0002c;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.j.d.b0 */
/* loaded from: classes.dex */
public class ServiceConnectionC0467b0 implements Handler.Callback, ServiceConnection {

    /* renamed from: a */
    public final Context f2444a;

    /* renamed from: b */
    public final HandlerThread f2445b;

    /* renamed from: c */
    public final Handler f2446c;

    /* renamed from: d */
    public final Map f2447d = new HashMap();

    /* renamed from: e */
    public Set f2448e = new HashSet();

    public ServiceConnectionC0467b0(Context context) {
        this.f2444a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        this.f2445b = handlerThread;
        handlerThread.start();
        this.f2446c = new Handler(handlerThread.getLooper(), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2434a(C0465a0 c0465a0) {
        boolean z;
        StringBuilder sb;
        String str;
        if (Log.isLoggable("NotifManCompat", 3)) {
            StringBuilder m1187i = AbstractC1124a.m1187i("Processing component ");
            m1187i.append(c0465a0.f2438a);
            m1187i.append(", ");
            m1187i.append(c0465a0.f2441d.size());
            m1187i.append(" queued tasks");
            m1187i.toString();
        }
        if (c0465a0.f2441d.isEmpty()) {
            return;
        }
        if (c0465a0.f2439b) {
            z = true;
        } else {
            boolean bindService = this.f2444a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(c0465a0.f2438a), this, 33);
            c0465a0.f2439b = bindService;
            if (bindService) {
                c0465a0.f2442e = 0;
            } else {
                StringBuilder m1187i2 = AbstractC1124a.m1187i("Unable to bind to listener ");
                m1187i2.append(c0465a0.f2438a);
                m1187i2.toString();
                this.f2444a.unbindService(this);
            }
            z = c0465a0.f2439b;
        }
        if (!z || c0465a0.f2440c == null) {
            m2433b(c0465a0);
            return;
        }
        while (true) {
            C0492y c0492y = (C0492y) c0465a0.f2441d.peek();
            if (c0492y == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    String str2 = "Sending task " + c0492y;
                }
                c0465a0.f2440c.mo2413a(c0492y.f2509a, c0492y.f2510b, c0492y.f2511c, c0492y.f2512d);
                c0465a0.f2441d.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    sb = new StringBuilder();
                    str = "Remote service has died: ";
                    sb.append(str);
                    sb.append(c0465a0.f2438a);
                    sb.toString();
                }
            } catch (RemoteException unused2) {
                sb = new StringBuilder();
                str = "RemoteException communicating with ";
                sb.append(str);
                sb.append(c0465a0.f2438a);
                sb.toString();
                if (c0465a0.f2441d.isEmpty()) {
                }
            }
        }
        if (c0465a0.f2441d.isEmpty()) {
            m2433b(c0465a0);
        }
    }

    /* renamed from: b */
    public final void m2433b(C0465a0 c0465a0) {
        if (this.f2446c.hasMessages(3, c0465a0.f2438a)) {
            return;
        }
        int i = c0465a0.f2442e + 1;
        c0465a0.f2442e = i;
        if (i <= 6) {
            this.f2446c.sendMessageDelayed(this.f2446c.obtainMessage(3, c0465a0.f2438a), (1 << (i - 1)) * 1000);
            return;
        }
        StringBuilder m1187i = AbstractC1124a.m1187i("Giving up on delivering ");
        m1187i.append(c0465a0.f2441d.size());
        m1187i.append(" tasks to ");
        m1187i.append(c0465a0.f2438a);
        m1187i.append(" after ");
        m1187i.append(c0465a0.f2442e);
        m1187i.append(" retries");
        m1187i.toString();
        c0465a0.f2441d.clear();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Set set;
        int i = message.what;
        InterfaceC0002c interfaceC0002c = null;
        if (i != 0) {
            if (i == 1) {
                C0493z c0493z = (C0493z) message.obj;
                ComponentName componentName = c0493z.f2513a;
                IBinder iBinder = c0493z.f2514b;
                C0465a0 c0465a0 = (C0465a0) this.f2447d.get(componentName);
                if (c0465a0 != null) {
                    int i2 = AbstractBinderC0001b.f1a;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                        interfaceC0002c = (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0002c)) ? new C0000a(iBinder) : (InterfaceC0002c) queryLocalInterface;
                    }
                    c0465a0.f2440c = interfaceC0002c;
                    c0465a0.f2442e = 0;
                    m2434a(c0465a0);
                }
                return true;
            } else if (i != 2) {
                if (i != 3) {
                    return false;
                }
                C0465a0 c0465a02 = (C0465a0) this.f2447d.get((ComponentName) message.obj);
                if (c0465a02 != null) {
                    m2434a(c0465a02);
                }
                return true;
            } else {
                C0465a0 c0465a03 = (C0465a0) this.f2447d.get((ComponentName) message.obj);
                if (c0465a03 != null) {
                    if (c0465a03.f2439b) {
                        this.f2444a.unbindService(this);
                        c0465a03.f2439b = false;
                    }
                    c0465a03.f2440c = null;
                }
                return true;
            }
        }
        C0492y c0492y = (C0492y) message.obj;
        String string = Settings.Secure.getString(this.f2444a.getContentResolver(), "enabled_notification_listeners");
        synchronized (C0469c0.f2449a) {
            if (string != null) {
                if (!string.equals(C0469c0.f2450b)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    C0469c0.f2451c = hashSet;
                    C0469c0.f2450b = string;
                }
            }
            set = C0469c0.f2451c;
        }
        if (!set.equals(this.f2448e)) {
            this.f2448e = set;
            List<ResolveInfo> queryIntentServices = this.f2444a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet hashSet2 = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (set.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        String str2 = "Permission present on component " + componentName2 + ", not adding listener record.";
                    } else {
                        hashSet2.add(componentName2);
                    }
                }
            }
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                ComponentName componentName3 = (ComponentName) it.next();
                if (!this.f2447d.containsKey(componentName3)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        String str3 = "Adding listener record for " + componentName3;
                    }
                    this.f2447d.put(componentName3, new C0465a0(componentName3));
                }
            }
            Iterator it2 = this.f2447d.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet2.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        StringBuilder m1187i = AbstractC1124a.m1187i("Removing listener record for ");
                        m1187i.append(entry.getKey());
                        m1187i.toString();
                    }
                    C0465a0 c0465a04 = (C0465a0) entry.getValue();
                    if (c0465a04.f2439b) {
                        this.f2444a.unbindService(this);
                        c0465a04.f2439b = false;
                    }
                    c0465a04.f2440c = null;
                    it2.remove();
                }
            }
        }
        for (C0465a0 c0465a05 : this.f2447d.values()) {
            c0465a05.f2441d.add(c0492y);
            m2434a(c0465a05);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            String str = "Connected to service " + componentName;
        }
        this.f2446c.obtainMessage(1, new C0493z(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            String str = "Disconnected from service " + componentName;
        }
        this.f2446c.obtainMessage(2, componentName).sendToTarget();
    }
}