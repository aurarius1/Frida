package p010b.p079r;

import java.io.RandomAccessFile;
import java.util.zip.ZipException;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.r.e */
/* loaded from: classes.dex */
public abstract class AbstractC0845e {
    /* renamed from: a */
    public static C0850j m1783a(RandomAccessFile randomAccessFile) {
        long length = randomAccessFile.length() - 22;
        if (length < 0) {
            StringBuilder m1187i = AbstractC1124a.m1187i("File too short to be a zip file: ");
            m1187i.append(randomAccessFile.length());
            throw new ZipException(m1187i.toString());
        }
        long j = length - 65536;
        long j2 = j >= 0 ? j : 0L;
        int reverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(length);
            if (randomAccessFile.readInt() == reverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                C0850j c0850j = new C0850j();
                c0850j.f3407b = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                c0850j.f3406a = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                return c0850j;
            }
            length--;
        } while (length >= j2);
        throw new ZipException("End Of Central Directory signature not found");
    }
}