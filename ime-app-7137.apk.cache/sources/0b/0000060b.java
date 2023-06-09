package p093c.p097b.p115j0;

import android.os.SystemClock;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: c.b.j0.a */
/* loaded from: classes.dex */
public class C1415a {

    /* renamed from: a */
    public int f4664a = 0;

    /* renamed from: b */
    public int f4665b = 0;

    /* renamed from: c */
    public long f4666c = 0;

    /* renamed from: d */
    public long f4667d = 0;

    /* renamed from: e */
    public boolean f4668e = false;

    /* renamed from: f */
    public boolean f4669f = false;

    /* renamed from: g */
    public final boolean f4670g;

    public C1415a(boolean z) {
        this.f4670g = z;
    }

    /* renamed from: a */
    public boolean m1076a() {
        return this.f4664a == 1 || this.f4665b != 0;
    }

    /* renamed from: b */
    public boolean m1075b() {
        return this.f4664a != 1 && this.f4665b == 2;
    }

    /* renamed from: c */
    public boolean m1074c() {
        if (this.f4664a != 1 && this.f4665b == 1 && this.f4669f) {
            this.f4665b = 0;
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void m1073d(int i, int i2) {
        this.f4664a = 0;
        if (!this.f4668e) {
            int i3 = this.f4665b;
            if (i3 == 0) {
                if (!this.f4670g || i2 >= SystemClock.elapsedRealtime() - this.f4667d) {
                    this.f4665b = 1;
                } else {
                    this.f4665b = 2;
                }
                this.f4666c = SystemClock.elapsedRealtime();
                this.f4669f = false;
            } else if (i3 != 1) {
                if (i3 != 2) {
                    StringBuilder m1187i = AbstractC1124a.m1187i("Failed to handle ");
                    m1187i.append(this.f4665b);
                    m1187i.append(" in ModifierKeyState#onRelease");
                    throw new IllegalArgumentException(m1187i.toString());
                }
            } else if (this.f4670g && i > SystemClock.elapsedRealtime() - this.f4666c) {
                this.f4665b = 2;
            }
            this.f4668e = false;
            this.f4667d = 0L;
        }
        this.f4665b = 0;
        this.f4668e = false;
        this.f4667d = 0L;
    }

    /* renamed from: e */
    public void m1072e() {
        if (this.f4665b == 2) {
            this.f4665b = 0;
        } else {
            this.f4665b = 2;
        }
    }
}