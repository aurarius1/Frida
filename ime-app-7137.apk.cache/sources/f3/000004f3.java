package p093c.p097b.p098a0;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import p093c.p097b.p119s.AbstractC1440a;

/* renamed from: c.b.a0.j */
/* loaded from: classes.dex */
public class C1135j {
    /* renamed from: a */
    public Iterable m1182a(InputStream inputStream) {
        int read;
        String m1181b;
        byte[] bArr = new byte[256];
        ArrayList arrayList = new ArrayList(2048);
        while (true) {
            String m1181b2 = m1181b(bArr, inputStream);
            if (m1181b2 == null || (read = inputStream.read()) <= 0) {
                break;
            }
            ArrayList arrayList2 = new ArrayList(read);
            while (read > arrayList2.size() && (m1181b = m1181b(bArr, inputStream)) != null) {
                arrayList2.add(m1181b);
            }
            arrayList.add(new C1134i(m1181b2, arrayList2));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final String m1181b(byte[] bArr, InputStream inputStream) {
        int read = inputStream.read();
        if (read >= 1 && read == inputStream.read(bArr, 0, read)) {
            return new String(bArr, 0, read, AbstractC1440a.f4736a);
        }
        return null;
    }

    /* renamed from: c */
    public void m1180c(Iterable iterable, OutputStream outputStream) {
        outputStream.write(1);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C1134i c1134i = (C1134i) it.next();
            m1179d(outputStream, c1134i.f4244b);
            int min = Math.min(12, c1134i.m1184a().size());
            outputStream.write(min);
            for (C1127b c1127b : c1134i.m1184a()) {
                m1179d(outputStream, c1127b.f4227a);
                min--;
                if (min == 0) {
                    break;
                }
            }
        }
    }

    /* renamed from: d */
    public final void m1179d(OutputStream outputStream, CharSequence charSequence) {
        byte[] bytes = charSequence.toString().getBytes("UTF-8");
        if (bytes.length == 0) {
            return;
        }
        outputStream.write(bytes.length);
        outputStream.write(bytes);
    }
}