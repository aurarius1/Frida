package p210g.p211a.p212a.p213l;

import android.content.Context;
import androidx.fragment.app.FragmentManager$LaunchedFragmentInfo;
import p010b.p046j.p047d.AbstractC0472e;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;
import p010b.p067m.p068d.C0677c0;
import p010b.p067m.p068d.C0690f1;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: g.a.a.l.f */
/* loaded from: classes.dex */
public class C2318f extends AbstractC2315c {
    public C2318f(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        super(abstractComponentCallbacksC0763z);
    }

    @Override // p210g.p211a.p212a.p213l.AbstractC2317e
    /* renamed from: a */
    public void mo10a(int i, String... strArr) {
        AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = (AbstractComponentCallbacksC0763z) this.f7470a;
        if (abstractComponentCallbacksC0763z.f3249v != null) {
            C0690f1 m1853u = abstractComponentCallbacksC0763z.m1853u();
            if (m1853u.f2991y == null) {
                m1853u.f2983q.getClass();
                return;
            }
            m1853u.f2992z.addLast(new FragmentManager$LaunchedFragmentInfo(abstractComponentCallbacksC0763z.f3235h, i));
            m1853u.f2991y.m3088a(strArr);
            return;
        }
        throw new IllegalStateException(AbstractC1124a.m1191e("Fragment ", abstractComponentCallbacksC0763z, " not attached to Activity"));
    }

    @Override // p210g.p211a.p212a.p213l.AbstractC2317e
    /* renamed from: b */
    public Context mo9b() {
        return ((AbstractComponentCallbacksC0763z) this.f7470a).m1872h();
    }

    @Override // p210g.p211a.p212a.p213l.AbstractC2317e
    /* renamed from: d */
    public boolean mo8d(String str) {
        C0677c0 c0677c0 = ((AbstractComponentCallbacksC0763z) this.f7470a).f3249v;
        if (c0677c0 != null) {
            return AbstractC0472e.m2428e(c0677c0.f2927f, str);
        }
        return false;
    }

    @Override // p210g.p211a.p212a.p213l.AbstractC2315c
    /* renamed from: f */
    public C0690f1 mo7f() {
        return ((AbstractComponentCallbacksC0763z) this.f7470a).m1868j();
    }
}