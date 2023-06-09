package p093c.p097b.p108i0.p114q;

import android.view.ViewGroup;
import com.menny.android.anysoftkeyboard.R;
import java.util.List;
import p010b.p083u.p084e.AbstractC0932e1;
import p010b.p083u.p084e.AbstractC0941g2;

/* renamed from: c.b.i0.q.b */
/* loaded from: classes.dex */
public class C1408b extends AbstractC0932e1 {

    /* renamed from: d */
    public final List f4655d;

    /* renamed from: e */
    public final /* synthetic */ C1409c f4656e;

    public C1408b(C1409c c1409c, List list) {
        this.f4656e = c1409c;
        this.f4655d = list;
        m1682g(true);
    }

    @Override // p010b.p083u.p084e.AbstractC0932e1
    /* renamed from: a */
    public int mo543a() {
        return this.f4655d.size();
    }

    @Override // p010b.p083u.p084e.AbstractC0932e1
    /* renamed from: b */
    public long mo558b(int i) {
        return ((C1413g) this.f4655d.get(i)).hashCode();
    }

    @Override // p010b.p083u.p084e.AbstractC0932e1
    /* renamed from: e */
    public void mo542e(AbstractC0941g2 abstractC0941g2, int i) {
        this.f4656e.m1079Q0(i, (C1407a) abstractC0941g2);
    }

    @Override // p010b.p083u.p084e.AbstractC0932e1
    /* renamed from: f */
    public AbstractC0941g2 mo541f(ViewGroup viewGroup, int i) {
        return new C1407a(this.f4656e.m1858r().inflate(R.layout.changelogentry_item, viewGroup, false));
    }
}