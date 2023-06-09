package p010b.p082t;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreference;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: b.t.e0 */
/* loaded from: classes.dex */
public class C0867e0 {

    /* renamed from: a */
    public static final Class[] f3458a = {Context.class, AttributeSet.class};

    /* renamed from: b */
    public static final HashMap f3459b = new HashMap();

    /* renamed from: c */
    public final Context f3460c;

    /* renamed from: e */
    public C0875i0 f3462e;

    /* renamed from: d */
    public final Object[] f3461d = new Object[2];

    /* renamed from: f */
    public String[] f3463f = {Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."};

    public C0867e0(Context context, C0875i0 c0875i0) {
        this.f3460c = context;
        this.f3462e = c0875i0;
    }

    /* renamed from: a */
    public final Preference m1752a(String str, String[] strArr, AttributeSet attributeSet) {
        Class<?> cls;
        Constructor<?> constructor = (Constructor) f3459b.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.f3460c.getClassLoader();
                    if (strArr != null && strArr.length != 0) {
                        cls = null;
                        ClassNotFoundException e = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e2) {
                                e = e2;
                            }
                        }
                        if (cls == null) {
                            if (e == null) {
                                throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                            }
                            throw e;
                        }
                        constructor = cls.getConstructor(f3458a);
                        constructor.setAccessible(true);
                        f3459b.put(str, constructor);
                    }
                    cls = Class.forName(str, false, classLoader);
                    constructor = cls.getConstructor(f3458a);
                    constructor.setAccessible(true);
                    f3459b.put(str, constructor);
                } catch (Exception e3) {
                    InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                    inflateException.initCause(e3);
                    throw inflateException;
                }
            } catch (ClassNotFoundException e4) {
                throw e4;
            }
        }
        Object[] objArr = this.f3461d;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    /* renamed from: b */
    public final Preference m1751b(String str, AttributeSet attributeSet) {
        try {
            if (-1 == str.indexOf(46)) {
                return m1752a(str, this.f3463f, attributeSet);
            }
            return m1752a(str, null, attributeSet);
        } catch (InflateException e) {
            throw e;
        } catch (ClassNotFoundException e2) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e2);
            throw inflateException;
        } catch (Exception e3) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e3);
            throw inflateException2;
        }
    }

    /* renamed from: c */
    public Preference m1750c(XmlPullParser xmlPullParser, PreferenceGroup preferenceGroup) {
        int next;
        synchronized (this.f3461d) {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
            this.f3461d[0] = this.f3460c;
            do {
                try {
                    try {
                        try {
                            next = xmlPullParser.next();
                            if (next == 2) {
                                break;
                            }
                        } catch (IOException e) {
                            InflateException inflateException = new InflateException(xmlPullParser.getPositionDescription() + ": " + e.getMessage());
                            inflateException.initCause(e);
                            throw inflateException;
                        }
                    } catch (InflateException e2) {
                        throw e2;
                    }
                } catch (XmlPullParserException e3) {
                    InflateException inflateException2 = new InflateException(e3.getMessage());
                    inflateException2.initCause(e3);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
            }
            PreferenceGroup preferenceGroup2 = (PreferenceGroup) m1751b(xmlPullParser.getName(), asAttributeSet);
            if (preferenceGroup == null) {
                preferenceGroup2.m3275q(this.f3462e);
                preferenceGroup = preferenceGroup2;
            }
            m1749d(xmlPullParser, preferenceGroup, asAttributeSet);
        }
        return preferenceGroup;
    }

    /* renamed from: d */
    public final void m1749d(XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.f621n = Intent.parseIntent(this.f3460c.getResources(), xmlPullParser, attributeSet);
                    } catch (IOException e) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    Resources resources = this.f3460c.getResources();
                    if (preference.f623p == null) {
                        preference.f623p = new Bundle();
                    }
                    resources.parseBundleExtra("extra", attributeSet, preference.f623p);
                    try {
                        int depth2 = xmlPullParser.getDepth();
                        while (true) {
                            int next2 = xmlPullParser.next();
                            if (next2 != 1 && (next2 != 3 || xmlPullParser.getDepth() > depth2)) {
                            }
                        }
                    } catch (IOException e2) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e2);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference m1751b = m1751b(name, attributeSet);
                    ((PreferenceGroup) preference).m3270M(m1751b);
                    m1749d(xmlPullParser, m1751b, attributeSet);
                }
            }
        }
    }
}