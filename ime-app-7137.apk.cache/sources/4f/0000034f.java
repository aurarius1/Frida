package p010b.p067m.p068d;

import java.io.Writer;

/* renamed from: b.m.d.l2 */
/* loaded from: classes.dex */
public final class C0715l2 extends Writer {

    /* renamed from: b */
    public final String f3053b;

    /* renamed from: c */
    public StringBuilder f3054c = new StringBuilder(128);

    public C0715l2(String str) {
        this.f3053b = str;
    }

    /* renamed from: a */
    public final void m2010a() {
        if (this.f3054c.length() > 0) {
            this.f3054c.toString();
            StringBuilder sb = this.f3054c;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m2010a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m2010a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m2010a();
            } else {
                this.f3054c.append(c);
            }
        }
    }
}