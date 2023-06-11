package p093c.p097b.p130z.p132r0;

import p093c.p097b.p130z.AbstractC1762t;
import p093c.p097b.p130z.Key;

/* renamed from: c.b.z.r0.n0 */
/* loaded from: classes.dex */
public abstract class KeyDetector {

    /* renamed from: a */
    public AbstractC1762t f5332a;

    /* renamed from: d */
    public int f5335d;

    /* renamed from: e */
    public int f5336e;

    /* renamed from: f */
    public boolean f5337f;

    /* renamed from: g */
    public int f5338g;

    /* renamed from: h */
    public Key f5339h;

    /* renamed from: c */
    public Key[] f5334c = new Key[0];

    /* renamed from: b */
    public final int[] f5333b = new int[mo841b()];

    /* renamed from: a */
    public abstract int mo842a(int i, int i2, int[] iArr);

    /* renamed from: b */
    public abstract int mo841b();

    /* renamed from: c */
    public boolean isKeyShifted(Key key) {
        AbstractC1762t abstractC1762t = this.f5332a;
        if (abstractC1762t != null && abstractC1762t.mo829v()) {
            Key key2 = this.f5339h;
            return (key2 != null && key2.f5229l) || (key.f5214F && this.f5332a.mo838h());
        }
        return false;
    }
}