package p093c.p097b.p115j0;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InvalidObjectException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayDeque;
import java.util.Deque;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p097b.p119s.AbstractC1440a;

/* renamed from: c.b.j0.c */
/* loaded from: classes.dex */
public class C1417c {

    /* renamed from: a */
    public final boolean f4674a;

    /* renamed from: b */
    public final Writer f4675b;

    /* renamed from: c */
    public final Deque f4676c;

    /* renamed from: d */
    public final StringBuilder f4677d;

    /* renamed from: e */
    public boolean f4678e;

    /* renamed from: f */
    public boolean f4679f;

    public C1417c(File file) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file, false), AbstractC1440a.f4736a);
        this.f4674a = true;
        this.f4675b = outputStreamWriter;
        this.f4679f = true;
        this.f4676c = new ArrayDeque();
        this.f4677d = new StringBuilder();
        outputStreamWriter.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n");
    }

    /* renamed from: c */
    public static String m1069c(String str, String str2, String str3) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str.length());
        int i = 0;
        int i2 = -1;
        do {
            int indexOf = str.indexOf(str2, i);
            if (indexOf == -1) {
                break;
            }
            sb.append(str.substring(i, indexOf));
            sb.append(str3);
            i = str2.length() + indexOf;
            i2--;
        } while (i2 != 0);
        sb.append(str.substring(i));
        return sb.toString();
    }

    /* renamed from: a */
    public void m1071a() {
        if (this.f4674a) {
            this.f4675b.flush();
            this.f4675b.close();
        }
        if (this.f4676c.size() <= 0) {
            return;
        }
        StringBuilder m1187i = AbstractC1124a.m1187i("Tags are not all closed. Possibly, ");
        m1187i.append((String) this.f4676c.pop());
        m1187i.append(" is unclosed. ");
        throw new IllegalStateException(m1187i.toString());
    }

    /* renamed from: b */
    public C1417c m1070b() {
        Writer writer;
        String str;
        if (this.f4676c.size() != 0) {
            String str2 = (String) this.f4676c.pop();
            if (this.f4678e) {
                this.f4675b.write(this.f4677d.toString());
                this.f4677d.setLength(0);
                this.f4678e = false;
                writer = this.f4675b;
                str = "/>\n";
            } else {
                for (int i = 0; i < this.f4676c.size() + 0; i++) {
                    this.f4675b.write("    ");
                }
                this.f4675b.write("</");
                this.f4675b.write(str2);
                writer = this.f4675b;
                str = ">\n";
            }
            writer.write(str);
            this.f4678e = false;
            this.f4679f = true;
            return this;
        }
        throw new InvalidObjectException("Called endEntity too many times. ");
    }

    /* renamed from: d */
    public C1417c m1068d(String str, String str2) {
        this.f4677d.append(" ");
        this.f4677d.append(str);
        this.f4677d.append("=\"");
        this.f4677d.append(m1069c(m1069c(m1069c(m1069c(m1069c(str2, "&", "&amp;"), "<", "&lt;"), ">", "&gt;"), "\"", "&quot;"), "'", "&apos;"));
        this.f4677d.append("\"");
        return this;
    }

    /* renamed from: e */
    public C1417c m1067e(String str) {
        if (!this.f4679f) {
            this.f4675b.write(this.f4677d.toString());
            this.f4677d.setLength(0);
            this.f4678e = false;
            this.f4679f = true;
            this.f4675b.write(">");
            this.f4675b.write("\n");
        }
        this.f4679f = false;
        for (int i = 0; i < this.f4676c.size() + 0; i++) {
            this.f4675b.write("    ");
        }
        this.f4675b.write("<");
        this.f4675b.write(str);
        this.f4676c.push(str);
        this.f4678e = true;
        return this;
    }
}