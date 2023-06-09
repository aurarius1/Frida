package p010b.p090y;

import android.os.Parcel;
import android.util.SparseIntArray;
import p010b.p036g.C0378b;

/* renamed from: b.y.c */
/* loaded from: classes.dex */
public class C1108c extends AbstractC1107b {

    /* renamed from: d */
    public final SparseIntArray f4150d;

    /* renamed from: e */
    public final Parcel f4151e;

    /* renamed from: f */
    public final int f4152f;

    /* renamed from: g */
    public final int f4153g;

    /* renamed from: h */
    public final String f4154h;

    /* renamed from: i */
    public int f4155i;

    /* renamed from: j */
    public int f4156j;

    /* renamed from: k */
    public int f4157k;

    public C1108c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0378b(), new C0378b(), new C0378b());
    }

    public C1108c(Parcel parcel, int i, int i2, String str, C0378b c0378b, C0378b c0378b2, C0378b c0378b3) {
        super(c0378b, c0378b2, c0378b3);
        this.f4150d = new SparseIntArray();
        this.f4155i = -1;
        this.f4156j = 0;
        this.f4157k = -1;
        this.f4151e = parcel;
        this.f4152f = i;
        this.f4153g = i2;
        this.f4156j = i;
        this.f4154h = str;
    }

    @Override // p010b.p090y.AbstractC1107b
    /* renamed from: a */
    public void mo1223a() {
        int i = this.f4155i;
        if (i >= 0) {
            int i2 = this.f4150d.get(i);
            int dataPosition = this.f4151e.dataPosition();
            this.f4151e.setDataPosition(i2);
            this.f4151e.writeInt(dataPosition - i2);
            this.f4151e.setDataPosition(dataPosition);
        }
    }

    @Override // p010b.p090y.AbstractC1107b
    /* renamed from: b */
    public AbstractC1107b mo1222b() {
        Parcel parcel = this.f4151e;
        int dataPosition = parcel.dataPosition();
        int i = this.f4156j;
        if (i == this.f4152f) {
            i = this.f4153g;
        }
        int i2 = i;
        return new C1108c(parcel, dataPosition, i2, this.f4154h + "  ", this.f4147a, this.f4148b, this.f4149c);
    }

    @Override // p010b.p090y.AbstractC1107b
    /* renamed from: h */
    public boolean mo1221h(int i) {
        while (this.f4156j < this.f4153g) {
            int i2 = this.f4157k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f4151e.setDataPosition(this.f4156j);
            int readInt = this.f4151e.readInt();
            this.f4157k = this.f4151e.readInt();
            this.f4156j += readInt;
        }
        return this.f4157k == i;
    }

    @Override // p010b.p090y.AbstractC1107b
    /* renamed from: l */
    public void mo1220l(int i) {
        mo1223a();
        this.f4155i = i;
        this.f4150d.put(i, this.f4151e.dataPosition());
        this.f4151e.writeInt(0);
        this.f4151e.writeInt(i);
    }
}