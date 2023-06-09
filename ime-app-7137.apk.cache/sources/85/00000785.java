package p093c.p140e.p141a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: c.e.a.b */
/* loaded from: classes.dex */
public class C1793b {
    /* renamed from: a */
    public final C1792a m804a(Context context, String[] strArr, String str, C1797f c1797f) {
        String[] m802c = m802c(context);
        int length = m802c.length;
        char c = 0;
        int i = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i >= length) {
                return null;
            }
            String str2 = m802c[i];
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i2 = i3;
                }
            }
            if (zipFile != null) {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    if (i4 < 5) {
                        int length2 = strArr.length;
                        int i6 = 0;
                        while (i6 < length2) {
                            String str3 = strArr[i6];
                            StringBuilder m1187i = AbstractC1124a.m1187i("lib");
                            m1187i.append(File.separatorChar);
                            m1187i.append(str3);
                            m1187i.append(File.separatorChar);
                            m1187i.append(str);
                            String sb = m1187i.toString();
                            Object[] objArr = new Object[2];
                            objArr[c] = sb;
                            objArr[1] = str2;
                            c1797f.getClass();
                            String.format(Locale.US, "Looking for %s in APK %s...", objArr);
                            ZipEntry entry = zipFile.getEntry(sb);
                            if (entry != null) {
                                return new C1792a(zipFile, entry);
                            }
                            i6++;
                            c = 0;
                        }
                        i4 = i5;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i++;
            c = 0;
        }
    }

    /* renamed from: b */
    public final String[] m803b(Context context, String str) {
        StringBuilder m1187i = AbstractC1124a.m1187i("lib");
        m1187i.append(File.separatorChar);
        m1187i.append("([^\\");
        m1187i.append(File.separatorChar);
        m1187i.append("]*)");
        m1187i.append(File.separatorChar);
        m1187i.append(str);
        Pattern compile = Pattern.compile(m1187i.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : m802c(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* renamed from: c */
    public final String[] m802c(Context context) {
        String[] strArr;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (Build.VERSION.SDK_INT < 21 || (strArr = applicationInfo.splitSourceDirs) == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }
}