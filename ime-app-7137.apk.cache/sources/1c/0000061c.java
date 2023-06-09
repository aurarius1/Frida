package p093c.p097b.p116p;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p097b.p122u.C1475h0;
import p093c.p176h.p177a.p178a.C2070h;

/* renamed from: c.b.p.j */
/* loaded from: classes.dex */
public abstract class AbstractC1432j {

    /* renamed from: a */
    public final Context f4717a;

    /* renamed from: b */
    public final String f4718b;

    /* renamed from: c */
    public final SharedPreferences f4719c;

    /* renamed from: d */
    public final ArrayList f4720d = new ArrayList();

    /* renamed from: e */
    public final HashMap f4721e = new HashMap();

    /* renamed from: f */
    public final String f4722f;

    /* renamed from: g */
    public final String f4723g;

    /* renamed from: h */
    public final String f4724h;

    /* renamed from: i */
    public final boolean f4725i;

    /* renamed from: j */
    public final String f4726j;

    /* renamed from: k */
    public final String f4727k;

    /* renamed from: l */
    public final int f4728l;

    /* renamed from: m */
    public final boolean f4729m;

    /* renamed from: n */
    public final String f4730n;

    public AbstractC1432j(Context context, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, boolean z, boolean z2) {
        this.f4717a = context;
        this.f4718b = str;
        this.f4723g = str2;
        this.f4724h = str3;
        this.f4726j = str4;
        this.f4727k = str5;
        if (TextUtils.isEmpty(str6)) {
            throw new IllegalArgumentException("prefIdPrefix can not be empty!");
        }
        this.f4730n = str6;
        this.f4728l = i;
        this.f4725i = z;
        this.f4729m = z2;
        this.f4722f = i2 == 0 ? null : context.getString(i2);
        this.f4719c = PreferenceManager.getDefaultSharedPreferences(context);
    }

    /* renamed from: i */
    public static CharSequence m1055i(Context context, AttributeSet attributeSet, String str) {
        int attributeResourceValue = attributeSet.getAttributeResourceValue(null, str, 0);
        return attributeResourceValue != 0 ? context.getResources().getString(attributeResourceValue) : attributeSet.getAttributeValue(null, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
        if (r4.m1054l(r7) != false) goto L10;
     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1052o(Intent intent, C2070h c2070h, AbstractC1432j... abstractC1432jArr) {
        boolean z;
        int length = abstractC1432jArr.length;
        boolean z2 = false;
        for (int i = 0; i < length; i++) {
            AbstractC1432j abstractC1432j = abstractC1432jArr[i];
            try {
                abstractC1432j.getClass();
                String action = intent.getAction();
                String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
                if ("android.intent.action.PACKAGE_ADDED".equals(action)) {
                    z = abstractC1432j.m1054l(schemeSpecificPart);
                } else {
                    if (!"android.intent.action.PACKAGE_REPLACED".equals(action) && !"android.intent.action.PACKAGE_CHANGED".equals(action)) {
                        if (abstractC1432j.m1053m(schemeSpecificPart)) {
                        }
                    }
                    if (!abstractC1432j.m1053m(schemeSpecificPart)) {
                    }
                }
                if (z) {
                    try {
                        abstractC1432j.getClass().getName();
                        abstractC1432j.mo1015a();
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    z2 = true;
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        if (z2) {
            c2070h.f6256a.mo434B();
        }
    }

    /* renamed from: a */
    public synchronized void mo1015a() {
        this.f4720d.clear();
        this.f4721e.clear();
    }

    /* renamed from: b */
    public final AbstractC1427e m1061b(AttributeSet attributeSet, Context context) {
        int i;
        Resources resources;
        int identifier;
        CharSequence m1055i = m1055i(context, attributeSet, "id");
        CharSequence m1055i2 = m1055i(context, attributeSet, "nameResId");
        if (this.f4729m || !attributeSet.getAttributeBooleanValue(null, "devOnly", false)) {
            try {
                resources = context.getResources();
                identifier = resources.getIdentifier("anysoftkeyboard_api_version_code", "integer", context.getPackageName());
            } catch (Exception unused) {
                context.getPackageName();
            }
            if (identifier == 0) {
                i = 0;
                boolean attributeBooleanValue = attributeSet.getAttributeBooleanValue(null, "hidden", false);
                CharSequence m1055i3 = m1055i(context, attributeSet, "description");
                int attributeUnsignedIntValue = attributeSet.getAttributeUnsignedIntValue(null, "index", 1);
                if (!TextUtils.isEmpty(m1055i) || TextUtils.isEmpty(m1055i2)) {
                    return null;
                }
                String str = "External addon details: prefId:" + ((Object) m1055i) + " name:" + ((Object) m1055i2);
                return mo918c(this.f4717a, context, i, m1055i, m1055i2, m1055i3, attributeBooleanValue, attributeUnsignedIntValue, attributeSet);
            }
            i = resources.getInteger(identifier);
            boolean attributeBooleanValue2 = attributeSet.getAttributeBooleanValue(null, "hidden", false);
            CharSequence m1055i32 = m1055i(context, attributeSet, "description");
            int attributeUnsignedIntValue2 = attributeSet.getAttributeUnsignedIntValue(null, "index", 1);
            if (TextUtils.isEmpty(m1055i)) {
            }
            return null;
        }
        return null;
    }

    /* renamed from: c */
    public abstract AbstractC1427e mo918c(Context context, Context context2, int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z, int i2, AttributeSet attributeSet);

    /* renamed from: d */
    public synchronized AbstractC1427e m1060d(String str) {
        if (this.f4721e.size() == 0) {
            mo1013n();
        }
        return (AbstractC1427e) this.f4721e.get(str);
    }

    /* renamed from: e */
    public final synchronized List m1059e() {
        this.f4720d.size();
        getClass().getName();
        if (this.f4720d.size() == 0) {
            mo1013n();
        }
        this.f4720d.size();
        getClass().getName();
        return Collections.unmodifiableList(this.f4720d);
    }

    /* renamed from: f */
    public final AbstractC1427e m1058f() {
        return (AbstractC1427e) m1057g().get(0);
    }

    /* renamed from: g */
    public final List m1057g() {
        List<String> m1056h = m1056h();
        ArrayList arrayList = new ArrayList(m1056h.size());
        for (String str : m1056h) {
            AbstractC1427e m1060d = m1060d(str);
            if (m1060d != null) {
                arrayList.add(m1060d);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: h */
    public final synchronized List m1056h() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (AbstractC1427e abstractC1427e : m1059e()) {
            String str = abstractC1427e.f4705a;
            if (mo1014j(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() == 0 && !TextUtils.isEmpty(this.f4722f)) {
            arrayList.add(this.f4722f);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: j */
    public boolean mo1014j(String str) {
        SharedPreferences sharedPreferences = this.f4719c;
        return sharedPreferences.getBoolean(this.f4730n + str, mo917k(str));
    }

    /* renamed from: k */
    public boolean mo917k(String str) {
        return this instanceof C1475h0;
    }

    /* renamed from: l */
    public final boolean m1054l(String str) {
        ApplicationInfo applicationInfo;
        ActivityInfo[] activityInfoArr = this.f4717a.getPackageManager().getPackageInfo(str, 130).receivers;
        if (activityInfoArr != null) {
            for (ActivityInfo activityInfo : activityInfoArr) {
                if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && activityInfo.enabled && applicationInfo.enabled) {
                    XmlResourceParser loadXmlMetaData = activityInfo.loadXmlMetaData(this.f4717a.getPackageManager(), this.f4724h);
                    if (loadXmlMetaData != null) {
                        loadXmlMetaData.close();
                        return true;
                    } else if (loadXmlMetaData != null) {
                        loadXmlMetaData.close();
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: m */
    public final boolean m1053m(String str) {
        for (AbstractC1427e abstractC1427e : this.f4721e.values()) {
            if (abstractC1427e.f4708d.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public void mo1013n() {
        List m1051p;
        mo1015a();
        int i = this.f4728l;
        if (i != 0) {
            Context context = this.f4717a;
            XmlResourceParser xml = context.getResources().getXml(i);
            try {
                ArrayList m1051p2 = m1051p(context, xml);
                if (xml != null) {
                    xml.close();
                }
                Iterator it = m1051p2.iterator();
                while (it.hasNext()) {
                    String str = ((AbstractC1427e) it.next()).f4705a;
                }
                this.f4720d.addAll(m1051p2);
            } catch (Throwable th) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        }
        PackageManager packageManager = this.f4717a.getPackageManager();
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(new Intent(this.f4723g), 128);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo == null) {
                StringBuilder m1187i = AbstractC1124a.m1187i("BroadcastReceiver has null ActivityInfo. Receiver's label is ");
                m1187i.append((Object) resolveInfo.loadLabel(packageManager));
                m1187i.toString();
            } else if (activityInfo.enabled && activityInfo.applicationInfo.enabled && (this.f4725i || this.f4717a.getPackageName().equalsIgnoreCase(resolveInfo.activityInfo.packageName))) {
                try {
                    Context createPackageContext = this.f4717a.createPackageContext(resolveInfo.activityInfo.packageName, 2);
                    XmlResourceParser loadXmlMetaData = resolveInfo.activityInfo.loadXmlMetaData(this.f4717a.getPackageManager(), this.f4724h);
                    if (loadXmlMetaData == null) {
                        m1051p = Collections.emptyList();
                        if (loadXmlMetaData != null) {
                        }
                        arrayList.addAll(m1051p);
                    } else {
                        m1051p = m1051p(createPackageContext, loadXmlMetaData);
                    }
                    loadXmlMetaData.close();
                    arrayList.addAll(m1051p);
                } catch (PackageManager.NameNotFoundException unused2) {
                    String str2 = resolveInfo.activityInfo.packageName;
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str3 = ((AbstractC1427e) it2.next()).f4705a;
        }
        this.f4720d.addAll(arrayList);
        this.f4720d.size();
        getClass().getName();
        Iterator it3 = this.f4720d.iterator();
        while (it3.hasNext()) {
            AbstractC1427e abstractC1427e = (AbstractC1427e) it3.next();
            this.f4721e.put(abstractC1427e.f4705a, abstractC1427e);
        }
        for (AbstractC1427e abstractC1427e2 : this.f4721e.values()) {
            if ((abstractC1427e2 instanceof AbstractC1427e) && abstractC1427e2.f4713i) {
                this.f4720d.remove(abstractC1427e2);
            }
        }
        Collections.sort(this.f4720d, new C1429g(this.f4717a.getPackageName(), null));
        this.f4720d.size();
        getClass().getName();
    }

    /* renamed from: p */
    public final ArrayList m1051p(Context context, XmlPullParser xmlPullParser) {
        AbstractC1427e m1061b;
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        while (true) {
            try {
                int next = xmlPullParser.next();
                if (next == 1) {
                    break;
                }
                String name = xmlPullParser.getName();
                if (next != 2) {
                    if (next == 3 && this.f4726j.equals(name)) {
                        break;
                    }
                } else if (this.f4726j.equals(name)) {
                    z = true;
                } else if (z && this.f4727k.equals(name) && (m1061b = m1061b(Xml.asAttributeSet(xmlPullParser), context)) != null) {
                    arrayList.add(m1061b);
                }
            } catch (IOException e) {
                String str = "IO error:" + e;
                e.printStackTrace();
            } catch (XmlPullParserException e2) {
                String str2 = "Parse error:" + e2;
                e2.printStackTrace();
            }
        }
        return arrayList;
    }

    /* renamed from: q */
    public final void m1050q(SharedPreferences.Editor editor, String str, boolean z) {
        editor.putBoolean(this.f4730n + str, z);
    }

    /* renamed from: r */
    public abstract void mo1012r(String str, boolean z);
}