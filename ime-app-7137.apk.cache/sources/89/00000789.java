package p093c.p140e.p141a;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.getkeepsafe.relinker.MissingLibraryException;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.zip.ZipFile;
import p010b.p086w.AbstractC1077v0;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: c.e.a.f */
/* loaded from: classes.dex */
public class C1797f {

    /* renamed from: a */
    public final Set f5476a;

    /* renamed from: b */
    public final C1798g f5477b;

    /* renamed from: c */
    public final C1793b f5478c;

    public C1797f() {
        C1798g c1798g = new C1798g();
        C1793b c1793b = new C1793b();
        this.f5476a = new HashSet();
        this.f5477b = c1798g;
        this.f5478c = c1793b;
    }

    /* renamed from: a */
    public File m799a(Context context) {
        return context.getDir("lib", 0);
    }

    /* renamed from: b */
    public File m798b(Context context, String str, String str2) {
        String m795a = this.f5477b.m795a(str);
        return AbstractC1077v0.m1253z(str2) ? new File(m799a(context), m795a) : new File(m799a(context), AbstractC1124a.m1189g(m795a, ".", str2));
    }

    /* renamed from: c */
    public void m797c(Context context, String str, String str2, InterfaceC1794c interfaceC1794c) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (AbstractC1077v0.m1253z(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        String.format(Locale.US, "Beginning load of %s...", str);
        if (interfaceC1794c == null) {
            m796d(context, str, str2);
        } else {
            new Thread(new RunnableC1795d(this, context, str, str2, interfaceC1794c)).start();
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:86:0x0165 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r8v17, resolved type: java.io.FileOutputStream */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
        if (r8.length > 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0130, code lost:
        if (r2 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0132, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017e, code lost:
        if (r2 != null) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x016f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0160 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m796d(Context context, String str, String str2) {
        String[] strArr;
        C1792a c1792a;
        C1792a m804a;
        String[] strArr2;
        ZipFile zipFile;
        InputStream inputStream;
        Closeable closeable;
        InputStream inputStream2;
        Closeable closeable2;
        Closeable closeable3;
        boolean z = false;
        int i = 1;
        if (this.f5476a.contains(str)) {
            String.format(Locale.US, "%s already loaded previously!", str);
            return;
        }
        try {
            this.f5477b.getClass();
            System.loadLibrary(str);
            this.f5476a.add(str);
            String.format(Locale.US, "%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e) {
            Object[] objArr = {Log.getStackTraceString(e)};
            Locale locale = Locale.US;
            String.format(locale, "Loading the library normally failed: %s", objArr);
            String.format(locale, "%s (%s) was not loaded normally, re-linking...", str, str2);
            File m798b = m798b(context, str, str2);
            if (!m798b.exists()) {
                File m799a = m799a(context);
                File m798b2 = m798b(context, str, str2);
                File[] listFiles = m799a.listFiles(new C1796e(this, this.f5477b.m795a(str)));
                if (listFiles != null) {
                    for (File file : listFiles) {
                        if (!file.getAbsolutePath().equals(m798b2.getAbsolutePath())) {
                            file.delete();
                        }
                    }
                }
                C1793b c1793b = this.f5478c;
                this.f5477b.getClass();
                if (Build.VERSION.SDK_INT >= 21) {
                    strArr = Build.SUPPORTED_ABIS;
                }
                String str3 = Build.CPU_ABI2;
                strArr = !AbstractC1077v0.m1253z(str3) ? new String[]{Build.CPU_ABI, str3} : new String[]{Build.CPU_ABI};
                String m795a = this.f5477b.m795a(str);
                c1793b.getClass();
                try {
                    m804a = c1793b.m804a(context, strArr, m795a, this);
                } catch (Throwable th) {
                    th = th;
                    c1792a = null;
                }
                try {
                    if (m804a == null) {
                        try {
                            strArr2 = c1793b.m803b(context, m795a);
                        } catch (Exception e2) {
                            strArr2 = new String[]{e2.toString()};
                        }
                        throw new MissingLibraryException(m795a, strArr, strArr2);
                    }
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        try {
                            if (i2 < 5) {
                                Object[] objArr2 = new Object[i];
                                objArr2[z ? 1 : 0] = m795a;
                                String.format(Locale.US, "Found %s! Extracting...", objArr2);
                                try {
                                    if (m798b.exists() || m798b.createNewFile()) {
                                        try {
                                            inputStream2 = m804a.f5468a.getInputStream(m804a.f5469b);
                                        } catch (FileNotFoundException unused) {
                                            inputStream2 = null;
                                        } catch (IOException unused2) {
                                            inputStream2 = null;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            inputStream = null;
                                            closeable = null;
                                        }
                                        try {
                                            FileOutputStream fileOutputStream = new FileOutputStream(m798b);
                                            try {
                                                byte[] bArr = new byte[4096];
                                                long j = 0;
                                                ?? r4 = z;
                                                boolean z2 = i;
                                                while (true) {
                                                    int read = inputStream2.read(bArr);
                                                    if (read == -1) {
                                                        break;
                                                    }
                                                    fileOutputStream.write(bArr, r4, read);
                                                    j += read;
                                                    r4 = 0;
                                                    z2 = true;
                                                }
                                                fileOutputStream.flush();
                                                fileOutputStream.getFD().sync();
                                                if (j != m798b.length()) {
                                                    try {
                                                        inputStream2.close();
                                                    } catch (IOException unused3) {
                                                    }
                                                    fileOutputStream.close();
                                                } else {
                                                    try {
                                                        inputStream2.close();
                                                    } catch (IOException unused4) {
                                                    }
                                                    try {
                                                        fileOutputStream.close();
                                                    } catch (IOException unused5) {
                                                    }
                                                    m798b.setReadable(z2, r4);
                                                    m798b.setExecutable(z2, r4);
                                                    m798b.setWritable(z2);
                                                    zipFile = m804a.f5468a;
                                                }
                                            } catch (FileNotFoundException unused6) {
                                                closeable2 = fileOutputStream;
                                                if (inputStream2 != null) {
                                                }
                                                if (closeable2 == null) {
                                                }
                                                closeable2.close();
                                                i2 = i3;
                                                z = false;
                                                i = 1;
                                            } catch (IOException unused7) {
                                                closeable2 = fileOutputStream;
                                                if (inputStream2 != null) {
                                                }
                                                if (closeable2 == null) {
                                                }
                                                closeable2.close();
                                                i2 = i3;
                                                z = false;
                                                i = 1;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                closeable3 = fileOutputStream;
                                                closeable = closeable3;
                                                inputStream = inputStream2;
                                                if (inputStream != null) {
                                                    try {
                                                        inputStream.close();
                                                    } catch (IOException unused8) {
                                                    }
                                                }
                                                if (closeable != null) {
                                                    try {
                                                        closeable.close();
                                                    } catch (IOException unused9) {
                                                    }
                                                }
                                                throw th;
                                            }
                                        } catch (FileNotFoundException unused10) {
                                            closeable2 = null;
                                            if (inputStream2 != null) {
                                                try {
                                                    inputStream2.close();
                                                } catch (IOException unused11) {
                                                }
                                            }
                                            if (closeable2 == null) {
                                                i2 = i3;
                                                z = false;
                                                i = 1;
                                            }
                                            closeable2.close();
                                            i2 = i3;
                                            z = false;
                                            i = 1;
                                        } catch (IOException unused12) {
                                            closeable2 = null;
                                            if (inputStream2 != null) {
                                                try {
                                                    inputStream2.close();
                                                } catch (IOException unused13) {
                                                }
                                            }
                                            if (closeable2 == null) {
                                                i2 = i3;
                                                z = false;
                                                i = 1;
                                            }
                                            closeable2.close();
                                            i2 = i3;
                                            z = false;
                                            i = 1;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            closeable3 = null;
                                        }
                                    }
                                } catch (IOException unused14) {
                                }
                                i2 = i3;
                                z = false;
                                i = 1;
                            } else {
                                zipFile = m804a.f5468a;
                            }
                        } catch (IOException unused15) {
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    c1792a = m804a;
                    if (c1792a != null) {
                        try {
                            ZipFile zipFile2 = c1792a.f5468a;
                            if (zipFile2 != null) {
                                zipFile2.close();
                            }
                        } catch (IOException unused16) {
                        }
                    }
                    throw th;
                }
            }
            C1798g c1798g = this.f5477b;
            String absolutePath = m798b.getAbsolutePath();
            c1798g.getClass();
            System.load(absolutePath);
            this.f5476a.add(str);
            String.format(Locale.US, "%s (%s) was re-linked!", str, str2);
        }
    }
}