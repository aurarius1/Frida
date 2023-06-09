package p010b.p016c.p024p;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p010b.p016c.AbstractC0084j;
import p010b.p016c.p024p.p025m.C0203t;
import p010b.p016c.p026q.AbstractC0290o1;
import p010b.p016c.p026q.C0302q3;
import p010b.p046j.p052g.p053a.InterfaceMenuC0526a;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.c.p.j */
/* loaded from: classes.dex */
public class C0169j extends MenuInflater {

    /* renamed from: a */
    public static final Class[] f1246a;

    /* renamed from: b */
    public static final Class[] f1247b;

    /* renamed from: c */
    public final Object[] f1248c;

    /* renamed from: d */
    public final Object[] f1249d;

    /* renamed from: e */
    public Context f1250e;

    /* renamed from: f */
    public Object f1251f;

    static {
        Class[] clsArr = {Context.class};
        f1246a = clsArr;
        f1247b = clsArr;
    }

    public C0169j(Context context) {
        super(context);
        this.f1250e = context;
        Object[] objArr = {context};
        this.f1248c = objArr;
        this.f1249d = objArr;
    }

    /* renamed from: a */
    public final Object m2956a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m2956a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v32, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r12v81, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final void m2955b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        C0168i c0168i = new C0168i(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException(AbstractC1124a.m1190f("Expecting menu, got ", name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        str = null;
                        z2 = false;
                    } else if (name2.equals("group")) {
                        c0168i.f1221b = 0;
                        c0168i.f1222c = 0;
                        c0168i.f1223d = 0;
                        c0168i.f1224e = 0;
                        c0168i.f1225f = true;
                        c0168i.f1226g = true;
                    } else if (name2.equals("item")) {
                        if (!c0168i.f1227h) {
                            C0203t c0203t = c0168i.f1214A;
                            if (c0203t != null && c0203t.f1431b.hasSubMenu()) {
                                c0168i.m2959a();
                            } else {
                                c0168i.f1227h = true;
                                c0168i.m2957c(c0168i.f1220a.add(c0168i.f1221b, c0168i.f1228i, c0168i.f1229j, c0168i.f1230k));
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    TypedArray obtainStyledAttributes = c0168i.f1219F.f1250e.obtainStyledAttributes(attributeSet, AbstractC0084j.MenuGroup);
                    c0168i.f1221b = obtainStyledAttributes.getResourceId(AbstractC0084j.MenuGroup_android_id, 0);
                    c0168i.f1222c = obtainStyledAttributes.getInt(AbstractC0084j.MenuGroup_android_menuCategory, 0);
                    c0168i.f1223d = obtainStyledAttributes.getInt(AbstractC0084j.MenuGroup_android_orderInCategory, 0);
                    c0168i.f1224e = obtainStyledAttributes.getInt(AbstractC0084j.MenuGroup_android_checkableBehavior, 0);
                    c0168i.f1225f = obtainStyledAttributes.getBoolean(AbstractC0084j.MenuGroup_android_visible, true);
                    c0168i.f1226g = obtainStyledAttributes.getBoolean(AbstractC0084j.MenuGroup_android_enabled, true);
                    obtainStyledAttributes.recycle();
                } else if (name3.equals("item")) {
                    C0302q3 m2741q = C0302q3.m2741q(c0168i.f1219F.f1250e, attributeSet, AbstractC0084j.MenuItem);
                    c0168i.f1228i = m2741q.m2745m(AbstractC0084j.MenuItem_android_id, 0);
                    c0168i.f1229j = (m2741q.m2748j(AbstractC0084j.MenuItem_android_menuCategory, c0168i.f1222c) & (-65536)) | (m2741q.m2748j(AbstractC0084j.MenuItem_android_orderInCategory, c0168i.f1223d) & 65535);
                    c0168i.f1230k = m2741q.m2743o(AbstractC0084j.MenuItem_android_title);
                    c0168i.f1231l = m2741q.m2743o(AbstractC0084j.MenuItem_android_titleCondensed);
                    c0168i.f1232m = m2741q.m2745m(AbstractC0084j.MenuItem_android_icon, 0);
                    String m2744n = m2741q.m2744n(AbstractC0084j.MenuItem_android_alphabeticShortcut);
                    c0168i.f1233n = m2744n == null ? (char) 0 : m2744n.charAt(0);
                    c0168i.f1234o = m2741q.m2748j(AbstractC0084j.MenuItem_alphabeticModifiers, 4096);
                    String m2744n2 = m2741q.m2744n(AbstractC0084j.MenuItem_android_numericShortcut);
                    c0168i.f1235p = m2744n2 == null ? (char) 0 : m2744n2.charAt(0);
                    c0168i.f1236q = m2741q.m2748j(AbstractC0084j.MenuItem_numericModifiers, 4096);
                    int i = AbstractC0084j.MenuItem_android_checkable;
                    c0168i.f1237r = m2741q.m2742p(i) ? m2741q.m2757a(i, false) : c0168i.f1224e;
                    c0168i.f1238s = m2741q.m2757a(AbstractC0084j.MenuItem_android_checked, false);
                    c0168i.f1239t = m2741q.m2757a(AbstractC0084j.MenuItem_android_visible, c0168i.f1225f);
                    c0168i.f1240u = m2741q.m2757a(AbstractC0084j.MenuItem_android_enabled, c0168i.f1226g);
                    c0168i.f1241v = m2741q.m2748j(AbstractC0084j.MenuItem_showAsAction, -1);
                    c0168i.f1245z = m2741q.m2744n(AbstractC0084j.MenuItem_android_onClick);
                    c0168i.f1242w = m2741q.m2745m(AbstractC0084j.MenuItem_actionLayout, 0);
                    c0168i.f1243x = m2741q.m2744n(AbstractC0084j.MenuItem_actionViewClass);
                    String m2744n3 = m2741q.m2744n(AbstractC0084j.MenuItem_actionProviderClass);
                    c0168i.f1244y = m2744n3;
                    if ((m2744n3 != null) && c0168i.f1242w == 0 && c0168i.f1243x == null) {
                        c0168i.f1214A = (C0203t) c0168i.m2958b(m2744n3, f1247b, c0168i.f1219F.f1249d);
                    } else {
                        c0168i.f1214A = null;
                    }
                    c0168i.f1215B = m2741q.m2743o(AbstractC0084j.MenuItem_contentDescription);
                    c0168i.f1216C = m2741q.m2743o(AbstractC0084j.MenuItem_tooltipText);
                    int i2 = AbstractC0084j.MenuItem_iconTintMode;
                    if (m2741q.m2742p(i2)) {
                        c0168i.f1218E = AbstractC0290o1.m2783d(m2741q.m2748j(i2, -1), c0168i.f1218E);
                    } else {
                        c0168i.f1218E = null;
                    }
                    int i3 = AbstractC0084j.MenuItem_iconTint;
                    if (m2741q.m2742p(i3)) {
                        c0168i.f1217D = m2741q.m2755c(i3);
                    } else {
                        c0168i.f1217D = null;
                    }
                    m2741q.f1740b.recycle();
                    c0168i.f1227h = false;
                } else if (name3.equals("menu")) {
                    m2955b(xmlPullParser, attributeSet, c0168i.m2959a());
                } else {
                    z2 = true;
                    str = name3;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof InterfaceMenuC0526a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f1250e.getResources().getLayout(i);
                    m2955b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (IOException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}