package p093c.p097b.p100c0.p101b0;

import java.util.ArrayDeque;
import java.util.Deque;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/* renamed from: c.b.c0.b0.e */
/* loaded from: classes.dex */
public class C1157e extends DefaultHandler {

    /* renamed from: a */
    public final Deque f4279a = new ArrayDeque();

    /* renamed from: b */
    public C1155c f4280b;

    public C1157e(AbstractC1156d abstractC1156d) {
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        super.endElement(str, str2, str3);
        str3.hashCode();
        if (str3.equals("AnySoftKeyboardPrefs") || str3.equals("pref")) {
            this.f4279a.pop();
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        super.startElement(str, str2, str3, attributes);
        str3.hashCode();
        char c = 65535;
        switch (str3.hashCode()) {
            case -453773677:
                if (str3.equals("AnySoftKeyboardPrefs")) {
                    c = 0;
                    break;
                }
                break;
            case 3449379:
                if (str3.equals("pref")) {
                    c = 1;
                    break;
                }
                break;
            case 111972721:
                if (str3.equals("value")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (!this.f4279a.isEmpty()) {
                    throw new IllegalStateException("AnySoftKeyboardPrefs should be the root node!");
                }
                C1155c c1155c = new C1155c(Integer.parseInt(attributes.getValue("version")));
                this.f4280b = c1155c;
                this.f4279a.push(c1155c);
                return;
            case 1:
                Deque deque = this.f4279a;
                deque.push(((C1153a) deque.peek()).m1166b());
                return;
            case 2:
                ((C1153a) this.f4279a.peek()).m1167a(attributes.getQName(0), attributes.getValue(0));
                return;
            default:
                return;
        }
    }
}