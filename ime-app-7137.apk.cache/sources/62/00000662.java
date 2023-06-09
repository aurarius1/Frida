package p093c.p097b.p122u.p123u0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import com.anysoftkeyboard.p180ui.settings.MainSettingsActivity;
import com.menny.android.anysoftkeyboard.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p036g.C0378b;
import p010b.p046j.p047d.AbstractC0472e;
import p010b.p046j.p047d.C0469c0;
import p010b.p046j.p047d.C0488u;
import p010b.p046j.p047d.C0492y;
import p010b.p046j.p047d.ServiceConnectionC0467b0;
import p093c.p097b.p098a0.C1126a;
import p093c.p097b.p098a0.C1127b;
import p093c.p097b.p098a0.InterfaceC1133h;
import p093c.p097b.p122u.AbstractC1531x;
import p093c.p097b.p122u.InterfaceC1515w;

/* renamed from: c.b.u.u0.b */
/* loaded from: classes.dex */
public class C1502b extends AbstractC1531x implements InterfaceC1133h {

    /* renamed from: o */
    public static final String[] f4859o = {"_id", "display_name", "starred", "times_contacted"};

    /* renamed from: p */
    public final Map f4860p;

    /* renamed from: q */
    public final Map f4861q;

    public C1502b(Context context) {
        super("ContactsDictionary", context, false);
        this.f4860p = new C0378b();
        this.f4861q = new C0378b();
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE] complete} */
    @Override // p093c.p097b.p122u.AbstractC1531x
    /* renamed from: B */
    public void mo970B(InterfaceC1515w interfaceC1515w) {
        boolean z = true;
        if (AbstractC0472e.m2432a(this.f4897g, "android.permission.READ_CONTACTS") == 0) {
            Cursor query = this.f4897g.getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, f4859o, "in_visible_group=?", new String[]{"1"}, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        while (!query.isAfterLast()) {
                            String string = query.getString(1);
                            int i = 255;
                            if (!(query.getInt(2) > 0)) {
                                i = Math.min(Math.max(64, query.getInt(3)), 255);
                            }
                            if (!interfaceC1515w.mo979a(string, i)) {
                                break;
                            }
                            query.moveToNext();
                        }
                    }
                } finally {
                    try {
                        query.close();
                    } catch (Throwable unused) {
                    }
                }
            }
            if (query != null) {
                return;
            }
            return;
        }
        Intent intent = new Intent("ACTION_REQUEST_PERMISSION_ACTIVITY");
        intent.putExtra("EXTRA_KEY_ACTION_REQUEST_PERMISSION_ACTIVITY", "android.permission.READ_CONTACTS");
        intent.setClass(this.f4897g, MainSettingsActivity.class);
        intent.addFlags(268435456);
        PendingIntent activity = PendingIntent.getActivity(this.f4897g, 456451, intent, 0);
        C0488u c0488u = new C0488u(this.f4897g, "Permissions");
        c0488u.f2503n.tickerText = C0488u.m2418b(this.f4897g.getString(R.string.notification_read_contacts_ticker));
        c0488u.f2503n.icon = R.drawable.ic_notification_contacts_permission_required;
        c0488u.f2496g = activity;
        c0488u.f2494e = C0488u.m2418b(this.f4897g.getString(R.string.notification_read_contacts_title));
        c0488u.f2495f = C0488u.m2418b(this.f4897g.getString(R.string.notification_read_contacts_text));
        c0488u.m2417c(16, true);
        Context context = this.f4897g;
        C0469c0 c0469c0 = new C0469c0(context);
        Notification m2419a = c0488u.m2419a();
        Bundle m3530D = AbstractC0022t.m3530D(m2419a);
        if ((m3530D == null || !m3530D.getBoolean("android.support.useSideChannel")) ? false : false) {
            C0492y c0492y = new C0492y(context.getPackageName(), 456451, null, m2419a);
            synchronized (C0469c0.f2452d) {
                if (C0469c0.f2453e == null) {
                    C0469c0.f2453e = new ServiceConnectionC0467b0(context.getApplicationContext());
                }
                C0469c0.f2453e.f2446c.obtainMessage(0, c0492y).sendToTarget();
            }
            c0469c0.f2455g.cancel(null, 456451);
        } else {
            c0469c0.f2455g.notify(null, 456451, m2419a);
        }
        throw new RuntimeException("We do not have permission to read contacts!");
    }

    @Override // p093c.p097b.p122u.AbstractC1531x
    /* renamed from: C */
    public void mo969C(ContentObserver contentObserver, ContentResolver contentResolver) {
        contentResolver.registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, contentObserver);
    }

    @Override // p093c.p097b.p098a0.InterfaceC1133h
    /* renamed from: a */
    public void mo985a(String str) {
    }

    @Override // p093c.p097b.p098a0.InterfaceC1133h
    /* renamed from: c */
    public Iterable mo984c(String str, int i, int i2) {
        return this.f4860p.containsKey(str) ? Arrays.asList((String[]) this.f4860p.get(str)) : Collections.emptyList();
    }

    @Override // p093c.p097b.p098a0.InterfaceC1133h
    /* renamed from: d */
    public void mo983d() {
    }

    @Override // p093c.p097b.p122u.AbstractC1531x, p093c.p097b.p122u.AbstractC1533z
    /* renamed from: k */
    public void mo497k() {
        super.mo497k();
        this.f4860p.clear();
        for (Map.Entry entry : this.f4861q.entrySet()) {
            String str = (String) entry.getKey();
            ArrayList arrayList = new ArrayList(((Map) entry.getValue()).values());
            Collections.sort(arrayList, new C1126a());
            int size = arrayList.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = ((C1127b) arrayList.get(i)).f4227a;
            }
            this.f4860p.put(str, strArr);
        }
        this.f4861q.clear();
    }

    @Override // p093c.p097b.p122u.AbstractC1531x
    /* renamed from: p */
    public void mo966p(String str, int i) {
        Map map;
        int length = str.length();
        String str2 = null;
        int i2 = 0;
        while (i2 < length) {
            if (Character.isLetter(str.charAt(i2))) {
                int i3 = i2 + 1;
                while (i3 < length) {
                    char charAt = str.charAt(i3);
                    if (charAt != '-' && charAt != '\'' && charAt != 8217 && !Character.isLetter(charAt)) {
                        break;
                    }
                    i3++;
                }
                String substring = str.substring(i2, i3);
                int i4 = i3 - 1;
                int length2 = substring.length();
                if (length2 < 32 && length2 > 1) {
                    if (str2 != null) {
                        if (this.f4861q.containsKey(str2)) {
                            map = (Map) this.f4861q.get(str2);
                        } else {
                            C0378b c0378b = new C0378b();
                            this.f4861q.put(str2, c0378b);
                            map = c0378b;
                        }
                        if (map.containsKey(substring)) {
                            ((C1127b) map.get(substring)).f4228b++;
                        } else {
                            map.put(substring, new C1127b(substring));
                        }
                    }
                    if (m957y(substring) < i) {
                        m965q(this.f4899i, substring, 0, i);
                    }
                }
                str2 = substring;
                i2 = i4;
            }
            i2++;
        }
    }

    @Override // p093c.p097b.p122u.AbstractC1531x
    /* renamed from: r */
    public void mo964r(String str, int i) {
    }

    @Override // p093c.p097b.p122u.AbstractC1531x
    /* renamed from: t */
    public void mo962t() {
    }

    @Override // p093c.p097b.p122u.AbstractC1531x
    /* renamed from: v */
    public void mo960v(String str) {
    }
}