package p093c.p097b.p122u;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p010b.p086w.AbstractC1077v0;

/* renamed from: c.b.u.s */
/* loaded from: classes.dex */
public class C1496s {

    /* renamed from: a */
    public char[] f4834a;

    /* renamed from: b */
    public char f4835b;

    /* renamed from: c */
    public final String f4836c;

    public C1496s(Resources resources, int i) {
        String name;
        char length;
        XmlResourceParser xml = resources.getXml(i);
        try {
            StringBuilder sb = new StringBuilder(9300);
            char[] cArr = new char[14337];
            this.f4834a = cArr;
            cArr[0] = 65535;
            this.f4835b = (char) 1;
            try {
                AbstractC1077v0.m1276c(xml, "words");
                while (true) {
                    int next = xml.next();
                    if (next == 2 || next == 1) {
                        if (!(next != 1) || (name = xml.getName()) == null || !name.equals("word")) {
                            break;
                        }
                        String attributeValue = xml.getAttributeValue(null, "src");
                        if (xml.next() == 4) {
                            String text = xml.getText();
                            if (text.equals("")) {
                                length = 0;
                            } else {
                                length = (char) sb.length();
                                sb.append((char) text.length());
                                sb.append(text);
                            }
                            m998a(attributeValue, length);
                        }
                    }
                }
                this.f4836c = sb.toString();
                xml.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (XmlPullParserException e2) {
                throw new RuntimeException(e2);
            }
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        if (r6 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        if ((r10.f4835b + 4) <= r5.length) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
        r6 = new char[r5.length + 1024];
        java.lang.System.arraycopy(r5, 0, r6, 0, r5.length);
        r10.f4834a = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
        r5 = r10.f4835b;
        r10.f4835b = (char) (r5 + 4);
        r6 = r10.f4834a;
        r6[r3] = r5;
        r6[r6[r3] + 0] = r4;
        r6[r6[r3] + 1] = 65535;
        r6[r6[r3] + 3] = 65535;
        r6[r6[r3] + 2] = 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
        if (r2 != (r0 - 1)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
        r6[r6[r3] + 1] = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0073, code lost:
        r3 = r6[r3] + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
        r2 = r2 + 1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m998a(String str, char c) {
        boolean z;
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            while (true) {
                char[] cArr = this.f4834a;
                if (cArr[i2] == 65535) {
                    z = false;
                    break;
                } else if (charAt != cArr[cArr[i2] + 0]) {
                    i2 = cArr[i2] + 3;
                } else if (i == length - 1) {
                    cArr[cArr[i2] + 1] = c;
                    return;
                } else {
                    i2 = cArr[i2] + 2;
                    z = true;
                }
            }
        }
    }
}