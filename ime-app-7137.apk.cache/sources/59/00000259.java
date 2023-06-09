package p010b.p046j.p047d;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;
import java.util.Set;

/* renamed from: b.j.d.c0 */
/* loaded from: classes.dex */
public final class C0469c0 {

    /* renamed from: b */
    public static String f2450b;

    /* renamed from: e */
    public static ServiceConnectionC0467b0 f2453e;

    /* renamed from: f */
    public final Context f2454f;

    /* renamed from: g */
    public final NotificationManager f2455g;

    /* renamed from: a */
    public static final Object f2449a = new Object();

    /* renamed from: c */
    public static Set f2451c = new HashSet();

    /* renamed from: d */
    public static final Object f2452d = new Object();

    public C0469c0(Context context) {
        this.f2454f = context;
        this.f2455g = (NotificationManager) context.getSystemService("notification");
    }
}