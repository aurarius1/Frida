package p010b.p079r;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.r.i */
/* loaded from: classes.dex */
public final class C0849i implements Closeable {

    /* renamed from: b */
    public final File f3400b;

    /* renamed from: c */
    public final long f3401c;

    /* renamed from: d */
    public final File f3402d;

    /* renamed from: e */
    public final RandomAccessFile f3403e;

    /* renamed from: f */
    public final FileChannel f3404f;

    /* renamed from: g */
    public final FileLock f3405g;

    public C0849i(File file, File file2) {
        file.getPath();
        file2.getPath();
        this.f3400b = file;
        this.f3402d = file2;
        this.f3401c = m1774c(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f3403e = randomAccessFile;
        try {
            try {
                FileChannel channel = randomAccessFile.getChannel();
                this.f3404f = channel;
                try {
                    file3.getPath();
                    this.f3405g = channel.lock();
                    file3.getPath();
                } catch (IOException e) {
                    e = e;
                    try {
                        this.f3404f.close();
                    } catch (IOException unused) {
                    }
                    throw e;
                } catch (Error e2) {
                    e = e2;
                    this.f3404f.close();
                    throw e;
                } catch (RuntimeException e3) {
                    e = e3;
                    this.f3404f.close();
                    throw e;
                }
            } catch (Error e4) {
                e = e4;
                try {
                    this.f3403e.close();
                } catch (IOException unused2) {
                }
                throw e;
            } catch (RuntimeException e5) {
                e = e5;
                this.f3403e.close();
                throw e;
            }
        } catch (IOException e6) {
            e = e6;
            this.f3403e.close();
            throw e;
        }
    }

    /* renamed from: a */
    public static void m1776a(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile(AbstractC1124a.m1190f("tmp-", str), ".zip", file.getParentFile());
        createTempFile.getPath();
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (!createTempFile.setReadOnly()) {
                throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
            }
            file.getPath();
            if (createTempFile.renameTo(file)) {
                return;
            }
            throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
            createTempFile.delete();
        }
    }

    /* renamed from: b */
    public static long m1775b(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    /* renamed from: c */
    public static long m1774c(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            C0850j m1783a = AbstractC0845e.m1783a(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j = m1783a.f3407b;
            randomAccessFile.seek(m1783a.f3406a);
            int min = (int) Math.min(16384L, j);
            byte[] bArr = new byte[16384];
            while (true) {
                int read = randomAccessFile.read(bArr, 0, min);
                if (read == -1) {
                    break;
                }
                crc32.update(bArr, 0, read);
                j -= read;
                if (j == 0) {
                    break;
                }
                min = (int) Math.min(16384L, j);
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            return value == -1 ? value - 1 : value;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    /* renamed from: g */
    public static void m1770g(Context context, String str, long j, long j2, List list) {
        SharedPreferences.Editor edit = context.getSharedPreferences("multidex.version", 4).edit();
        edit.putLong(str + "timestamp", j);
        edit.putLong(str + "crc", j2);
        edit.putInt(str + "dex.number", list.size() + 1);
        Iterator it = list.iterator();
        int i = 2;
        while (it.hasNext()) {
            C0848h c0848h = (C0848h) it.next();
            edit.putLong(str + "dex.crc." + i, c0848h.f3399b);
            edit.putLong(str + "dex.time." + i, c0848h.lastModified());
            i++;
        }
        edit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3405g.release();
        this.f3404f.close();
        this.f3403e.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List m1773d(Context context, String str, boolean z) {
        List list;
        boolean z2;
        this.f3400b.getPath();
        if (this.f3405g.isValid()) {
            if (!z) {
                File file = this.f3400b;
                long j = this.f3401c;
                SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
                if (sharedPreferences.getLong(str + "timestamp", -1L) == m1775b(file)) {
                    if (sharedPreferences.getLong(str + "crc", -1L) == j) {
                        z2 = false;
                        if (!z2) {
                            try {
                                list = m1772e(context, str);
                            } catch (IOException unused) {
                            }
                            list.size();
                            return list;
                        }
                    }
                }
                z2 = true;
                if (!z2) {
                }
            }
            List m1771f = m1771f();
            m1770g(context, str, m1775b(this.f3400b), this.f3401c, m1771f);
            list = m1771f;
            list.size();
            return list;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    /* renamed from: e */
    public final List m1772e(Context context, String str) {
        String str2 = this.f3400b.getName() + ".classes";
        SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
        int i = sharedPreferences.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i + (-1));
        int i2 = 2;
        while (i2 <= i) {
            C0848h c0848h = new C0848h(this.f3402d, AbstractC1124a.m1192d(str2, i2, ".zip"));
            if (!c0848h.isFile()) {
                StringBuilder m1187i = AbstractC1124a.m1187i("Missing extracted secondary dex file '");
                m1187i.append(c0848h.getPath());
                m1187i.append("'");
                throw new IOException(m1187i.toString());
            }
            c0848h.f3399b = m1774c(c0848h);
            long j = sharedPreferences.getLong(str + "dex.crc." + i2, -1L);
            long j2 = sharedPreferences.getLong(str + "dex.time." + i2, -1L);
            long lastModified = c0848h.lastModified();
            if (j2 == lastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                if (j == c0848h.f3399b) {
                    arrayList.add(c0848h);
                    i2++;
                    sharedPreferences = sharedPreferences2;
                    str2 = str3;
                }
            }
            throw new IOException("Invalid extracted dex: " + c0848h + " (key \"" + str + "\"), expected modification time: " + j2 + ", modification time: " + lastModified + ", expected crc: " + j + ", file crc: " + c0848h.f3399b);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f2, code lost:
        throw new java.io.IOException("Could not create zip file " + r7.getAbsolutePath() + " for secondary dex (" + r4 + ")");
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m1771f() {
        String str = this.f3400b.getName() + ".classes";
        File[] listFiles = this.f3402d.listFiles(new C0847g(this));
        if (listFiles == null) {
            this.f3402d.getPath();
        } else {
            for (File file : listFiles) {
                file.getPath();
                file.length();
                file.delete();
                file.getPath();
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f3400b);
        int i = 2;
        String str2 = "classes2.dex";
        while (true) {
            try {
                ZipEntry entry = zipFile.getEntry(str2);
                if (entry == null) {
                    try {
                        zipFile.close();
                    } catch (IOException unused) {
                    }
                    return arrayList;
                }
                C0848h c0848h = new C0848h(this.f3402d, str + i + ".zip");
                arrayList.add(c0848h);
                String str3 = "Extraction is needed for file " + c0848h;
                int i2 = 0;
                boolean z = false;
                while (i2 < 3 && !z) {
                    i2++;
                    m1776a(zipFile, entry, c0848h, str);
                    try {
                        c0848h.f3399b = m1774c(c0848h);
                        z = true;
                    } catch (IOException unused2) {
                        c0848h.getAbsolutePath();
                        z = false;
                    }
                    c0848h.getAbsolutePath();
                    c0848h.length();
                    if (!z) {
                        c0848h.delete();
                        if (c0848h.exists()) {
                            c0848h.getPath();
                        }
                    }
                }
                if (!z) {
                    break;
                }
                i++;
                str2 = "classes" + i + ".dex";
            } catch (Throwable th) {
                try {
                    zipFile.close();
                } catch (IOException unused3) {
                }
                throw th;
            }
        }
    }
}