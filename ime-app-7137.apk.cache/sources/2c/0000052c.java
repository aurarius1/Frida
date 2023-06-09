package p093c.p097b.p102d0;

import p093c.p097b.p122u.InterfaceC1479j0;

/* renamed from: c.b.d0.i */
/* loaded from: classes.dex */
public class C1192i implements InterfaceC1479j0 {

    /* renamed from: a */
    public static final int[] f4327a = new int[1];

    /* renamed from: b */
    public InterfaceC1479j0 f4328b = null;

    /* renamed from: c */
    public CharSequence f4329c = "";

    public C1192i(C1191h c1191h) {
    }

    @Override // p093c.p097b.p122u.InterfaceC1479j0
    /* renamed from: a */
    public int mo997a() {
        return this.f4329c.length();
    }

    @Override // p093c.p097b.p122u.InterfaceC1479j0
    /* renamed from: b */
    public int[] mo996b(int i) {
        int[] iArr = f4327a;
        iArr[0] = this.f4328b.mo996b(i + 1)[0];
        return iArr;
    }

    @Override // p093c.p097b.p122u.InterfaceC1479j0
    /* renamed from: c */
    public CharSequence mo995c() {
        return this.f4329c;
    }
}