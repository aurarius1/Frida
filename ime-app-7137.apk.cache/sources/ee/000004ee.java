package p093c.p097b.p098a0;

import android.content.Context;
import java.util.Random;
import p010b.p036g.C0378b;

/* renamed from: c.b.a0.e */
/* loaded from: classes.dex */
public class C1130e implements InterfaceC1133h {

    /* renamed from: a */
    public static final Random f4233a = new Random();

    /* renamed from: b */
    public final C1136k f4234b;

    /* renamed from: c */
    public String f4235c = null;

    /* renamed from: d */
    public final C0378b f4236d = new C0378b();

    /* renamed from: e */
    public final String[] f4237e;

    /* renamed from: f */
    public final C1129d f4238f;

    public C1130e(Context context, String str) {
        String[] strArr = new String[8];
        this.f4237e = strArr;
        this.f4234b = new C1136k(context, str);
        this.f4238f = new C1129d(strArr);
    }

    @Override // p093c.p097b.p098a0.InterfaceC1133h
    /* renamed from: a */
    public void mo985a(String str) {
        String str2 = this.f4235c;
        if (str2 != null) {
            C1134i c1134i = (C1134i) this.f4236d.getOrDefault(str2, null);
            if (c1134i == null) {
                C0378b c0378b = this.f4236d;
                int i = c0378b.f1943h;
                if (i > 900) {
                    this.f4236d.remove((String) c0378b.m2616h(f4233a.nextInt(i)));
                }
                c1134i = new C1134i(this.f4235c);
                this.f4236d.put(this.f4235c, c1134i);
            }
            c1134i.m1183b(str);
        }
        this.f4235c = str;
    }

    /* renamed from: b */
    public void m1185b() {
        for (C1134i c1134i : this.f4234b.m1178a()) {
            this.f4236d.put(c1134i.f4244b, c1134i);
        }
    }

    @Override // p093c.p097b.p098a0.InterfaceC1133h
    /* renamed from: c */
    public Iterable mo984c(String str, int i, int i2) {
        int min = Math.min(8, i);
        C1134i c1134i = (C1134i) this.f4236d.getOrDefault(str, null);
        int i3 = 0;
        if (c1134i != null) {
            for (C1127b c1127b : c1134i.m1184a()) {
                if (c1127b.f4228b >= i2) {
                    this.f4237e[i3] = c1127b.f4227a;
                    i3++;
                    if (i3 == min) {
                        break;
                    }
                }
            }
        }
        C1129d c1129d = this.f4238f;
        c1129d.f4232c = i3;
        return c1129d;
    }

    @Override // p093c.p097b.p098a0.InterfaceC1133h
    /* renamed from: d */
    public void mo983d() {
        this.f4235c = null;
    }
}