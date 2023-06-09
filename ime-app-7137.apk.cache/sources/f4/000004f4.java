package p093c.p097b.p098a0;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: c.b.a0.k */
/* loaded from: classes.dex */
public class C1136k {

    /* renamed from: a */
    public final Context f4247a;

    /* renamed from: b */
    public final String f4248b;

    public C1136k(Context context, String str) {
        this.f4247a = context;
        this.f4248b = AbstractC1124a.m1189g("next_words_", str, ".txt");
    }

    /* renamed from: a */
    public Iterable m1178a() {
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream openFileInput = this.f4247a.openFileInput(this.f4248b);
                int read = openFileInput.read();
                if (read < 1) {
                    List emptyList = Collections.emptyList();
                    try {
                        openFileInput.close();
                    } catch (IOException unused) {
                    }
                    return emptyList;
                } else if (read == 1) {
                    Iterable m1182a = new C1135j().m1182a(openFileInput);
                    try {
                        openFileInput.close();
                    } catch (IOException unused2) {
                    }
                    return m1182a;
                } else {
                    String.format("Version %d is not supported!", Integer.valueOf(read));
                    List emptyList2 = Collections.emptyList();
                    try {
                        openFileInput.close();
                    } catch (IOException unused3) {
                    }
                    return emptyList2;
                }
            } catch (FileNotFoundException unused4) {
                String.format("Failed to find %s. Maybe it's just the first time.", this.f4248b);
                List emptyList3 = Collections.emptyList();
                if (0 != 0) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused5) {
                    }
                }
                return emptyList3;
            } catch (IOException unused6) {
                String.format("Failed to open %s. Maybe it's just the first time.", this.f4248b);
                List emptyList4 = Collections.emptyList();
                if (0 != 0) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused7) {
                    }
                }
                return emptyList4;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    fileInputStream.close();
                } catch (IOException unused8) {
                }
            }
            throw th;
        }
    }

    /* renamed from: b */
    public void m1177b(Iterable iterable) {
        C1135j c1135j = new C1135j();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                fileOutputStream = this.f4247a.openFileOutput(this.f4248b, 0);
                c1135j.m1180c(iterable, fileOutputStream);
                fileOutputStream.flush();
            } catch (IOException unused) {
                String.format("Failed to store to %s. Deleting", this.f4248b);
                this.f4247a.deleteFile(this.f4248b);
                if (fileOutputStream == null) {
                    return;
                }
            } catch (NullPointerException unused2) {
                String.format("Failed to store to %s with an NPE.", this.f4248b);
                if (fileOutputStream == null) {
                    return;
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