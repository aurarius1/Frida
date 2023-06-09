package p093c.p097b.p098a0;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p097b.p100c0.p101b0.C1153a;
import p093c.p097b.p100c0.p101b0.C1155c;
import p093c.p097b.p100c0.p101b0.InterfaceC1154b;

/* renamed from: c.b.a0.f */
/* loaded from: classes.dex */
public class C1131f implements InterfaceC1154b {

    /* renamed from: a */
    public final Context f4239a;

    /* renamed from: b */
    public final Iterable f4240b;

    public C1131f(Context context, Iterable iterable) {
        this.f4239a = context;
        this.f4240b = iterable;
    }

    @Override // p093c.p097b.p100c0.p101b0.InterfaceC1154b
    /* renamed from: a */
    public void mo974a(C1155c c1155c) {
        for (C1153a c1153a : c1155c.m1165c()) {
            String str = (String) c1153a.f4276a.get("locale");
            if (str != null) {
                ArrayList arrayList = new ArrayList();
                for (C1153a c1153a2 : c1153a.m1165c()) {
                    C1134i c1134i = new C1134i((String) c1153a2.f4276a.get("word"));
                    for (C1153a c1153a3 : c1153a2.m1165c()) {
                        c1134i.m1183b((String) c1153a3.f4276a.get("nextWord"));
                    }
                    arrayList.add(c1134i);
                }
                Context context = this.f4239a;
                String m1189g = AbstractC1124a.m1189g("next_words_", str, ".txt");
                C1135j c1135j = new C1135j();
                FileOutputStream fileOutputStream = null;
                try {
                    try {
                        fileOutputStream = context.openFileOutput(m1189g, 0);
                        c1135j.m1180c(arrayList, fileOutputStream);
                        fileOutputStream.flush();
                    } catch (IOException unused) {
                        String.format("Failed to store to %s. Deleting", m1189g);
                        context.deleteFile(m1189g);
                        if (fileOutputStream == null) {
                        }
                    } catch (NullPointerException unused2) {
                        String.format("Failed to store to %s with an NPE.", m1189g);
                        if (fileOutputStream != null) {
                        }
                    }
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused3) {
                    }
                } catch (Throwable th) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:4|5|6|(1:(1:24)(6:25|10|11|12|(4:15|(2:18|16)|19|13)|20))(1:8)|9|10|11|12|(1:13)|20|2) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
        if (r7 == null) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    @Override // p093c.p097b.p100c0.p101b0.InterfaceC1154b
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1155c mo973b() {
        Iterable<C1134i> emptyList;
        int read;
        C1155c c1155c = new C1155c(1);
        for (String str : this.f4240b) {
            C1153a m1166b = c1155c.m1166b();
            m1166b.m1167a("locale", str);
            Context context = this.f4239a;
            String m1189g = AbstractC1124a.m1189g("next_words_", str, ".txt");
            FileInputStream fileInputStream = null;
            try {
                try {
                    fileInputStream = context.openFileInput(m1189g);
                    read = fileInputStream.read();
                } catch (FileNotFoundException unused) {
                    String.format("Failed to find %s. Maybe it's just the first time.", m1189g);
                    emptyList = Collections.emptyList();
                } catch (IOException unused2) {
                    String.format("Failed to open %s. Maybe it's just the first time.", m1189g);
                    emptyList = Collections.emptyList();
                    if (fileInputStream != null) {
                    }
                }
                if (read >= 1) {
                    if (read != 1) {
                        String.format("Version %d is not supported!", Integer.valueOf(read));
                    } else {
                        emptyList = new C1135j().m1182a(fileInputStream);
                        fileInputStream.close();
                        for (C1134i c1134i : emptyList) {
                            C1153a m1166b2 = m1166b.m1166b();
                            m1166b2.m1167a("word", c1134i.f4244b.toString());
                            for (C1127b c1127b : c1134i.m1184a()) {
                                C1153a m1166b3 = m1166b2.m1166b();
                                m1166b3.m1167a("nextWord", c1127b.f4227a);
                                m1166b3.m1167a("usedCount", Integer.toString(c1127b.f4228b));
                            }
                        }
                    }
                }
                emptyList = Collections.emptyList();
                fileInputStream.close();
                while (r3.hasNext()) {
                }
            } catch (Throwable th) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        }
        return c1155c;
    }

    @Override // p093c.p097b.p100c0.p101b0.InterfaceC1154b
    /* renamed from: c */
    public String mo972c() {
        return "NextWordPrefsProvider";
    }
}