package p093c.p097b.p100c0.p101b0;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p097b.p115j0.C1417c;

/* renamed from: c.b.c0.b0.f */
/* loaded from: classes.dex */
public class C1158f {
    /* renamed from: c */
    public static void m1161c(C1417c c1417c, Iterable iterable, boolean z) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C1153a c1153a = (C1153a) it.next();
            if (!z) {
                c1417c.m1067e("pref");
            }
            for (Map.Entry entry : c1153a.m1164d()) {
                String str = (String) entry.getValue();
                if (str != null) {
                    c1417c.m1067e("value");
                    c1417c.m1068d((String) entry.getKey(), str);
                    c1417c.m1070b();
                }
            }
            m1161c(c1417c, c1153a.m1165c(), false);
            if (!z) {
                c1417c.m1070b();
            }
        }
    }

    /* renamed from: a */
    public C1155c m1163a(File file) {
        SAXParser newSAXParser = SAXParserFactory.newInstance().newSAXParser();
        C1157e c1157e = new C1157e(null);
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            newSAXParser.parse(fileInputStream, c1157e);
            fileInputStream.close();
            return c1157e.f4280b;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* renamed from: b */
    public void m1162b(C1155c c1155c, File file) {
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            StringBuilder m1187i = AbstractC1124a.m1187i("Failure to access storage folder ");
            m1187i.append(parentFile.getAbsolutePath());
            throw new IOException(m1187i.toString());
        }
        C1417c c1417c = new C1417c(file);
        try {
            c1417c.m1067e("AnySoftKeyboardPrefs");
            c1417c.m1068d("version", Integer.toString(c1155c.f4278c));
            m1161c(c1417c, Collections.singleton(c1155c), true);
            c1417c.m1070b();
            try {
                c1417c.m1071a();
            } catch (IllegalStateException unused) {
                String str = "Caught an IllegalStateException while closing storage backup file " + file;
            }
        } catch (Throwable th) {
            try {
                c1417c.m1071a();
            } catch (IllegalStateException unused2) {
                String str2 = "Caught an IllegalStateException while closing storage backup file " + file;
            }
            throw th;
        }
    }
}