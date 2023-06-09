package p010b.p086w;

import java.util.ArrayList;

/* renamed from: b.w.r */
/* loaded from: classes.dex */
public class C1068r extends AbstractC1037f0 {

    /* renamed from: a */
    public final /* synthetic */ Object f4022a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f4023b;

    /* renamed from: c */
    public final /* synthetic */ Object f4024c;

    /* renamed from: d */
    public final /* synthetic */ ArrayList f4025d;

    /* renamed from: e */
    public final /* synthetic */ Object f4026e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList f4027f;

    /* renamed from: g */
    public final /* synthetic */ C1072t f4028g;

    public C1068r(C1072t c1072t, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.f4028g = c1072t;
        this.f4022a = obj;
        this.f4023b = arrayList;
        this.f4024c = obj2;
        this.f4025d = arrayList2;
        this.f4026e = obj3;
        this.f4027f = arrayList3;
    }

    @Override // p010b.p086w.AbstractC1037f0, p010b.p086w.InterfaceC1031d0
    /* renamed from: c */
    public void mo1326c(AbstractC1034e0 abstractC1034e0) {
        Object obj = this.f4022a;
        if (obj != null) {
            this.f4028g.mo1314p(obj, this.f4023b, null);
        }
        Object obj2 = this.f4024c;
        if (obj2 != null) {
            this.f4028g.mo1314p(obj2, this.f4025d, null);
        }
        Object obj3 = this.f4026e;
        if (obj3 != null) {
            this.f4028g.mo1314p(obj3, this.f4027f, null);
        }
    }

    @Override // p010b.p086w.InterfaceC1031d0
    /* renamed from: e */
    public void mo1325e(AbstractC1034e0 abstractC1034e0) {
        abstractC1034e0.mo1340v(this);
    }
}