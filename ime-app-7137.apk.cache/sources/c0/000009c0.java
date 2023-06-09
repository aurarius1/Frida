package p183e.p184a.p190p.p200h;

/* renamed from: e.a.p.h.a */
/* loaded from: classes.dex */
public class C2259a {

    /* renamed from: a */
    public final Object[] f7384a;

    /* renamed from: b */
    public Object[] f7385b;

    /* renamed from: c */
    public int f7386c;

    public C2259a(int i) {
        Object[] objArr = new Object[i + 1];
        this.f7384a = objArr;
        this.f7385b = objArr;
    }

    /* renamed from: a */
    public void m56a(Object obj) {
        int i = this.f7386c;
        if (i == 4) {
            Object[] objArr = new Object[5];
            this.f7385b[4] = objArr;
            this.f7385b = objArr;
            i = 0;
        }
        this.f7385b[i] = obj;
        this.f7386c = i + 1;
    }
}