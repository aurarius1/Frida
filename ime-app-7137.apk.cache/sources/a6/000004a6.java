package p010b.p086w;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.w.m0 */
/* loaded from: classes.dex */
public class C1058m0 extends AbstractC1034e0 {

    /* renamed from: A */
    public int f4001A;

    /* renamed from: y */
    public ArrayList f4004y = new ArrayList();

    /* renamed from: z */
    public boolean f4005z = true;

    /* renamed from: B */
    public boolean f4002B = false;

    /* renamed from: C */
    public int f4003C = 0;

    @Override // p010b.p086w.AbstractC1034e0
    /* renamed from: A */
    public void mo1357A(AbstractC1028c0 abstractC1028c0) {
        this.f3947w = abstractC1028c0;
        this.f4003C |= 8;
        int size = this.f4004y.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1034e0) this.f4004y.get(i)).mo1357A(abstractC1028c0);
        }
    }

    @Override // p010b.p086w.AbstractC1034e0
    /* renamed from: B */
    public /* bridge */ /* synthetic */ AbstractC1034e0 mo1356B(TimeInterpolator timeInterpolator) {
        m1348K(timeInterpolator);
        return this;
    }

    @Override // p010b.p086w.AbstractC1034e0
    /* renamed from: C */
    public void mo1355C(C1082y c1082y) {
        this.f3948x = c1082y == null ? AbstractC1034e0.f3927c : c1082y;
        this.f4003C |= 4;
        if (this.f4004y != null) {
            for (int i = 0; i < this.f4004y.size(); i++) {
                ((AbstractC1034e0) this.f4004y.get(i)).mo1355C(c1082y);
            }
        }
    }

    @Override // p010b.p086w.AbstractC1034e0
    /* renamed from: D */
    public void mo1354D(AbstractC1049j0 abstractC1049j0) {
        this.f4003C |= 2;
        int size = this.f4004y.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1034e0) this.f4004y.get(i)).mo1354D(abstractC1049j0);
        }
    }

    @Override // p010b.p086w.AbstractC1034e0
    /* renamed from: E */
    public AbstractC1034e0 mo1353E(long j) {
        this.f3930f = j;
        return this;
    }

    @Override // p010b.p086w.AbstractC1034e0
    /* renamed from: G */
    public String mo1352G(String str) {
        String mo1352G = super.mo1352G(str);
        for (int i = 0; i < this.f4004y.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(mo1352G);
            sb.append("\n");
            sb.append(((AbstractC1034e0) this.f4004y.get(i)).mo1352G(str + "  "));
            mo1352G = sb.toString();
        }
        return mo1352G;
    }

    /* renamed from: H */
    public C1058m0 m1351H(AbstractC1034e0 abstractC1034e0) {
        this.f4004y.add(abstractC1034e0);
        abstractC1034e0.f3937m = this;
        long j = this.f3931g;
        if (j >= 0) {
            abstractC1034e0.mo1336z(j);
        }
        if ((this.f4003C & 1) != 0) {
            abstractC1034e0.mo1356B(this.f3932h);
        }
        if ((this.f4003C & 2) != 0) {
            abstractC1034e0.mo1354D(null);
        }
        if ((this.f4003C & 4) != 0) {
            abstractC1034e0.mo1355C(this.f3948x);
        }
        if ((this.f4003C & 8) != 0) {
            abstractC1034e0.mo1357A(this.f3947w);
        }
        return this;
    }

    /* renamed from: I */
    public AbstractC1034e0 m1350I(int i) {
        if (i < 0 || i >= this.f4004y.size()) {
            return null;
        }
        return (AbstractC1034e0) this.f4004y.get(i);
    }

    /* renamed from: J */
    public C1058m0 m1349J(long j) {
        ArrayList arrayList;
        this.f3931g = j;
        if (j >= 0 && (arrayList = this.f4004y) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC1034e0) this.f4004y.get(i)).mo1336z(j);
            }
        }
        return this;
    }

    /* renamed from: K */
    public C1058m0 m1348K(TimeInterpolator timeInterpolator) {
        this.f4003C |= 1;
        ArrayList arrayList = this.f4004y;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC1034e0) this.f4004y.get(i)).mo1356B(timeInterpolator);
            }
        }
        this.f3932h = timeInterpolator;
        return this;
    }

    /* renamed from: L */
    public C1058m0 m1347L(int i) {
        if (i == 0) {
            this.f4005z = true;
        } else if (i != 1) {
            throw new AndroidRuntimeException(AbstractC1124a.m1193c("Invalid parameter for TransitionSet ordering: ", i));
        } else {
            this.f4005z = false;
        }
        return this;
    }

    @Override // p010b.p086w.AbstractC1034e0
    /* renamed from: a */
    public AbstractC1034e0 mo1346a(InterfaceC1031d0 interfaceC1031d0) {
        super.mo1346a(interfaceC1031d0);
        return this;
    }

    @Override // p010b.p086w.AbstractC1034e0
    /* renamed from: b */
    public AbstractC1034e0 mo1345b(View view) {
        for (int i = 0; i < this.f4004y.size(); i++) {
            ((AbstractC1034e0) this.f4004y.get(i)).mo1345b(view);
        }
        this.f3934j.add(view);
        return this;
    }

    @Override // p010b.p086w.AbstractC1034e0
    /* renamed from: d */
    public void mo770d(C1063o0 c1063o0) {
        if (m1372s(c1063o0.f4014b)) {
            Iterator it = this.f4004y.iterator();
            while (it.hasNext()) {
                AbstractC1034e0 abstractC1034e0 = (AbstractC1034e0) it.next();
                if (abstractC1034e0.m1372s(c1063o0.f4014b)) {
                    abstractC1034e0.mo770d(c1063o0);
                    c1063o0.f4015c.add(abstractC1034e0);
                }
            }
        }
    }

    @Override // p010b.p086w.AbstractC1034e0
    /* renamed from: f */
    public void mo1344f(C1063o0 c1063o0) {
        int size = this.f4004y.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1034e0) this.f4004y.get(i)).mo1344f(c1063o0);
        }
    }

    @Override // p010b.p086w.AbstractC1034e0
    /* renamed from: g */
    public void mo769g(C1063o0 c1063o0) {
        if (m1372s(c1063o0.f4014b)) {
            Iterator it = this.f4004y.iterator();
            while (it.hasNext()) {
                AbstractC1034e0 abstractC1034e0 = (AbstractC1034e0) it.next();
                if (abstractC1034e0.m1372s(c1063o0.f4014b)) {
                    abstractC1034e0.mo769g(c1063o0);
                    c1063o0.f4015c.add(abstractC1034e0);
                }
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method */
    @Override // p010b.p086w.AbstractC1034e0
    /* renamed from: j */
    public AbstractC1034e0 clone() {
        C1058m0 c1058m0 = (C1058m0) super.clone();
        c1058m0.f4004y = new ArrayList();
        int size = this.f4004y.size();
        for (int i = 0; i < size; i++) {
            AbstractC1034e0 clone = ((AbstractC1034e0) this.f4004y.get(i)).clone();
            c1058m0.f4004y.add(clone);
            clone.f3937m = c1058m0;
        }
        return c1058m0;
    }

    @Override // p010b.p086w.AbstractC1034e0
    /* renamed from: l */
    public void mo1342l(ViewGroup viewGroup, C1065p0 c1065p0, C1065p0 c1065p02, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f3930f;
        int size = this.f4004y.size();
        for (int i = 0; i < size; i++) {
            AbstractC1034e0 abstractC1034e0 = (AbstractC1034e0) this.f4004y.get(i);
            if (j > 0 && (this.f4005z || i == 0)) {
                long j2 = abstractC1034e0.f3930f;
                if (j2 > 0) {
                    abstractC1034e0.mo1353E(j2 + j);
                } else {
                    abstractC1034e0.mo1353E(j);
                }
            }
            abstractC1034e0.mo1342l(viewGroup, c1065p0, c1065p02, arrayList, arrayList2);
        }
    }

    @Override // p010b.p086w.AbstractC1034e0
    /* renamed from: u */
    public void mo1341u(View view) {
        super.mo1341u(view);
        int size = this.f4004y.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1034e0) this.f4004y.get(i)).mo1341u(view);
        }
    }

    @Override // p010b.p086w.AbstractC1034e0
    /* renamed from: v */
    public AbstractC1034e0 mo1340v(InterfaceC1031d0 interfaceC1031d0) {
        super.mo1340v(interfaceC1031d0);
        return this;
    }

    @Override // p010b.p086w.AbstractC1034e0
    /* renamed from: w */
    public AbstractC1034e0 mo1339w(View view) {
        for (int i = 0; i < this.f4004y.size(); i++) {
            ((AbstractC1034e0) this.f4004y.get(i)).mo1339w(view);
        }
        this.f3934j.remove(view);
        return this;
    }

    @Override // p010b.p086w.AbstractC1034e0
    /* renamed from: x */
    public void mo1338x(View view) {
        super.mo1338x(view);
        int size = this.f4004y.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1034e0) this.f4004y.get(i)).mo1338x(view);
        }
    }

    @Override // p010b.p086w.AbstractC1034e0
    /* renamed from: y */
    public void mo1337y() {
        if (this.f4004y.isEmpty()) {
            m1381F();
            m1376m();
            return;
        }
        C1055l0 c1055l0 = new C1055l0(this);
        Iterator it = this.f4004y.iterator();
        while (it.hasNext()) {
            ((AbstractC1034e0) it.next()).mo1346a(c1055l0);
        }
        this.f4001A = this.f4004y.size();
        if (this.f4005z) {
            Iterator it2 = this.f4004y.iterator();
            while (it2.hasNext()) {
                ((AbstractC1034e0) it2.next()).mo1337y();
            }
            return;
        }
        for (int i = 1; i < this.f4004y.size(); i++) {
            ((AbstractC1034e0) this.f4004y.get(i - 1)).mo1346a(new C1052k0(this, (AbstractC1034e0) this.f4004y.get(i)));
        }
        AbstractC1034e0 abstractC1034e0 = (AbstractC1034e0) this.f4004y.get(0);
        if (abstractC1034e0 != null) {
            abstractC1034e0.mo1337y();
        }
    }

    @Override // p010b.p086w.AbstractC1034e0
    /* renamed from: z */
    public /* bridge */ /* synthetic */ AbstractC1034e0 mo1336z(long j) {
        m1349J(j);
        return this;
    }
}