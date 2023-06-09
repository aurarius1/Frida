package p010b.p037h.p043c;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: b.h.c.h */
/* loaded from: classes.dex */
public class C0438h {

    /* renamed from: a */
    public SparseArray f2304a = new SparseArray();

    /* renamed from: b */
    public SparseArray f2305b = new SparseArray();

    public C0438h(Context context, ConstraintLayout constraintLayout, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        C0436f c0436f = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    char c = 65535;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (c != 0 && c != 1) {
                        if (c == 2) {
                            c0436f = new C0436f(context, xml);
                            this.f2304a.put(c0436f.f2294a, c0436f);
                            continue;
                        } else if (c == 3) {
                            C0437g c0437g = new C0437g(context, xml);
                            if (c0436f != null) {
                                c0436f.f2295b.add(c0437g);
                                continue;
                            } else {
                                continue;
                            }
                        } else if (c != 4) {
                            continue;
                        } else {
                            m2459a(context, xml);
                            continue;
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01c8, code lost:
        continue;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2459a(Context context, XmlPullParser xmlPullParser) {
        int eventType;
        C0439i c0439i;
        C0439i m2450d;
        C0444n c0444n = new C0444n();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if ("id".equals(xmlPullParser.getAttributeName(i))) {
                String attributeValue = xmlPullParser.getAttributeValue(i);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1 && attributeValue.length() > 1) {
                    identifier = Integer.parseInt(attributeValue.substring(1));
                }
                try {
                    eventType = xmlPullParser.getEventType();
                    c0439i = null;
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (XmlPullParserException e2) {
                    e2.printStackTrace();
                }
                while (eventType != 1) {
                    if (eventType != 0) {
                        char c = 3;
                        if (eventType == 2) {
                            String name = xmlPullParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    m2450d = c0444n.m2450d(context, Xml.asAttributeSet(xmlPullParser));
                                    c0439i = m2450d;
                                    break;
                                case 1:
                                    m2450d = c0444n.m2450d(context, Xml.asAttributeSet(xmlPullParser));
                                    C0440j c0440j = m2450d.f2309d;
                                    c0440j.f2340b = true;
                                    c0440j.f2342c = true;
                                    c0439i = m2450d;
                                    break;
                                case 2:
                                    m2450d = c0444n.m2450d(context, Xml.asAttributeSet(xmlPullParser));
                                    m2450d.f2309d.f2347e0 = 1;
                                    c0439i = m2450d;
                                    break;
                                case 3:
                                    if (c0439i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    c0439i.f2307b.m2455a(context, Xml.asAttributeSet(xmlPullParser));
                                    break;
                                case 4:
                                    if (c0439i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    c0439i.f2310e.m2454a(context, Xml.asAttributeSet(xmlPullParser));
                                    break;
                                case 5:
                                    if (c0439i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    c0439i.f2309d.m2457a(context, Xml.asAttributeSet(xmlPullParser));
                                    break;
                                case 6:
                                    if (c0439i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    c0439i.f2308c.m2456a(context, Xml.asAttributeSet(xmlPullParser));
                                    break;
                                case 7:
                                    if (c0439i == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                    }
                                    C0431a.m2471a(context, xmlPullParser, c0439i.f2311f);
                                    break;
                            }
                        } else if (eventType != 3) {
                            continue;
                        } else {
                            String name2 = xmlPullParser.getName();
                            if ("ConstraintSet".equals(name2)) {
                                this.f2305b.put(identifier, c0444n);
                                return;
                            } else if (name2.equalsIgnoreCase("Constraint")) {
                                c0444n.f2406e.put(Integer.valueOf(c0439i.f2306a), c0439i);
                                c0439i = null;
                            }
                        }
                    } else {
                        xmlPullParser.getName();
                    }
                    eventType = xmlPullParser.next();
                }
                this.f2305b.put(identifier, c0444n);
                return;
            }
        }
    }
}