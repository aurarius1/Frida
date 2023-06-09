package p010b.p046j.p047d;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000a.p001a.p002a.p004b.AbstractC0022t;

/* renamed from: b.j.d.u */
/* loaded from: classes.dex */
public class C0488u {

    /* renamed from: a */
    public Context f2490a;

    /* renamed from: e */
    public CharSequence f2494e;

    /* renamed from: f */
    public CharSequence f2495f;

    /* renamed from: g */
    public PendingIntent f2496g;

    /* renamed from: i */
    public CharSequence f2498i;

    /* renamed from: j */
    public Bundle f2499j;

    /* renamed from: l */
    public String f2501l;

    /* renamed from: m */
    public boolean f2502m;

    /* renamed from: n */
    public Notification f2503n;
    @Deprecated

    /* renamed from: o */
    public ArrayList f2504o;

    /* renamed from: b */
    public ArrayList f2491b = new ArrayList();

    /* renamed from: c */
    public ArrayList f2492c = new ArrayList();

    /* renamed from: d */
    public ArrayList f2493d = new ArrayList();

    /* renamed from: h */
    public boolean f2497h = true;

    /* renamed from: k */
    public int f2500k = 0;

    public C0488u(Context context, String str) {
        Notification notification = new Notification();
        this.f2503n = notification;
        this.f2490a = context;
        this.f2501l = str;
        notification.when = System.currentTimeMillis();
        this.f2503n.audioStreamType = -1;
        this.f2504o = new ArrayList();
        this.f2502m = true;
    }

    /* renamed from: b */
    public static CharSequence m2418b(CharSequence charSequence) {
        return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* renamed from: a */
    public Notification m2419a() {
        List m2416a;
        ArrayList arrayList = new ArrayList();
        Bundle bundle = new Bundle();
        int i = Build.VERSION.SDK_INT;
        Context context = this.f2490a;
        Notification.Builder builder = i >= 26 ? new Notification.Builder(context, this.f2501l) : new Notification.Builder(context);
        Notification notification = this.f2503n;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.f2494e).setContentText(this.f2495f).setContentInfo(null).setContentIntent(this.f2496g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setLargeIcon((Bitmap) null).setNumber(0).setProgress(0, 0, false);
        if (i < 21) {
            builder.setSound(notification.sound, notification.audioStreamType);
        }
        if (i >= 16) {
            builder.setSubText(this.f2498i).setUsesChronometer(false).setPriority(0);
            Iterator it = this.f2491b.iterator();
            while (it.hasNext()) {
                AbstractC0487t abstractC0487t = (AbstractC0487t) it.next();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 20) {
                    throw null;
                }
                if (i2 >= 16) {
                    Object obj = AbstractC0490w.f2505a;
                    throw null;
                }
            }
            Bundle bundle2 = this.f2499j;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 17) {
            builder.setShowWhen(this.f2497h);
        }
        if (i3 >= 19 && i3 < 21 && (m2416a = AbstractC0489v.m2416a(AbstractC0489v.m2415b(this.f2492c), this.f2504o)) != null && !m2416a.isEmpty()) {
            bundle.putStringArray("android.people", (String[]) m2416a.toArray(new String[m2416a.size()]));
        }
        if (i3 >= 20) {
            builder.setLocalOnly(false).setGroup(null).setGroupSummary(false).setSortKey(null);
        }
        if (i3 >= 21) {
            builder.setCategory(null).setColor(this.f2500k).setVisibility(0).setPublicVersion(null).setSound(notification.sound, notification.audioAttributes);
            List<String> m2416a2 = i3 < 28 ? AbstractC0489v.m2416a(AbstractC0489v.m2415b(this.f2492c), this.f2504o) : this.f2504o;
            if (m2416a2 != null && !m2416a2.isEmpty()) {
                for (String str : m2416a2) {
                    builder.addPerson(str);
                }
            }
            if (this.f2493d.size() > 0) {
                if (this.f2499j == null) {
                    this.f2499j = new Bundle();
                }
                Bundle bundle3 = this.f2499j.getBundle("android.car.EXTENSIONS");
                if (bundle3 == null) {
                    bundle3 = new Bundle();
                }
                Bundle bundle4 = new Bundle(bundle3);
                Bundle bundle5 = new Bundle();
                if (this.f2493d.size() <= 0) {
                    bundle3.putBundle("invisible_actions", bundle5);
                    bundle4.putBundle("invisible_actions", bundle5);
                    if (this.f2499j == null) {
                        this.f2499j = new Bundle();
                    }
                    this.f2499j.putBundle("android.car.EXTENSIONS", bundle3);
                    bundle.putBundle("android.car.EXTENSIONS", bundle4);
                } else {
                    Integer.toString(0);
                    AbstractC0487t abstractC0487t2 = (AbstractC0487t) this.f2493d.get(0);
                    Object obj2 = AbstractC0490w.f2505a;
                    new Bundle();
                    throw null;
                }
            }
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 24) {
            builder.setExtras(this.f2499j).setRemoteInputHistory(null);
        }
        if (i4 >= 26) {
            builder.setBadgeIconType(0).setSettingsText(null).setShortcutId(null).setTimeoutAfter(0L).setGroupAlertBehavior(0);
            if (!TextUtils.isEmpty(this.f2501l)) {
                builder.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i4 >= 28) {
            Iterator it2 = this.f2492c.iterator();
            if (it2.hasNext()) {
                AbstractC0471d0 abstractC0471d0 = (AbstractC0471d0) it2.next();
                throw null;
            }
        }
        if (i4 >= 29) {
            builder.setAllowSystemGeneratedContextualActions(this.f2502m);
            builder.setBubbleMetadata(null);
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 26 && i5 < 24) {
            if (i5 < 21 && i5 < 20) {
                if (i5 < 19) {
                    if (i5 >= 16) {
                        Notification build = builder.build();
                        Bundle m3530D = AbstractC0022t.m3530D(build);
                        Bundle bundle6 = new Bundle(bundle);
                        for (String str2 : bundle.keySet()) {
                            if (m3530D.containsKey(str2)) {
                                bundle6.remove(str2);
                            }
                        }
                        m3530D.putAll(bundle6);
                        SparseArray<? extends Parcelable> m2414a = AbstractC0490w.m2414a(arrayList);
                        if (m2414a != null) {
                            AbstractC0022t.m3530D(build).putSparseParcelableArray("android.support.actionExtras", m2414a);
                        }
                        return build;
                    }
                    return builder.getNotification();
                }
                SparseArray<? extends Parcelable> m2414a2 = AbstractC0490w.m2414a(arrayList);
                if (m2414a2 != null) {
                    bundle.putSparseParcelableArray("android.support.actionExtras", m2414a2);
                }
            }
            builder.setExtras(bundle);
        }
        return builder.build();
    }

    /* renamed from: c */
    public final void m2417c(int i, boolean z) {
        Notification notification;
        int i2;
        if (z) {
            notification = this.f2503n;
            i2 = i | notification.flags;
        } else {
            notification = this.f2503n;
            i2 = (i ^ (-1)) & notification.flags;
        }
        notification.flags = i2;
    }
}