package p093c.p097b.p108i0.p110p;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.menny.android.anysoftkeyboard.R;
import java.util.List;
import p010b.p083u.p084e.AbstractC0932e1;
import p010b.p083u.p084e.AbstractC0941g2;
import p093c.p097b.p108i0.p110p.p111a2.View$OnClickListenerC1265a;
import p093c.p097b.p116p.AbstractC1427e;

/* renamed from: c.b.i0.p.z0 */
/* loaded from: classes.dex */
public class C1388z0 extends AbstractC0932e1 {

    /* renamed from: d */
    public final LayoutInflater f4617d;

    /* renamed from: e */
    public final /* synthetic */ AbstractC1268b1 f4618e;

    public C1388z0(AbstractC1268b1 abstractC1268b1) {
        this.f4618e = abstractC1268b1;
        this.f4617d = LayoutInflater.from(abstractC1268b1.m1872h());
    }

    @Override // p010b.p083u.p084e.AbstractC0932e1
    /* renamed from: a */
    public int mo543a() {
        int i = this.f4618e.mo1119S0() != null ? 1 : 0;
        List list = this.f4618e.f4472d0;
        return (list != null ? list.size() : 0) + i;
    }

    @Override // p010b.p083u.p084e.AbstractC0932e1
    /* renamed from: c */
    public int mo1106c(int i) {
        List list = this.f4618e.f4472d0;
        return (list == null || i != list.size()) ? 0 : 1;
    }

    @Override // p010b.p083u.p084e.AbstractC0932e1
    /* renamed from: e */
    public void mo542e(AbstractC0941g2 abstractC0941g2, int i) {
        if (mo1106c(i) == 0) {
            AbstractC1427e abstractC1427e = (AbstractC1427e) this.f4618e.f4472d0.get(i);
            View$OnClickListenerC1264a1 view$OnClickListenerC1264a1 = (View$OnClickListenerC1264a1) abstractC0941g2;
            view$OnClickListenerC1264a1.f4461z = abstractC1427e;
            view$OnClickListenerC1264a1.f4459x.setText(abstractC1427e.f4706b);
            view$OnClickListenerC1264a1.f4460y.setText(abstractC1427e.f4707c);
            boolean contains = view$OnClickListenerC1264a1.f4456A.f4465W.contains(abstractC1427e.f4705a);
            view$OnClickListenerC1264a1.f4458w.setVisibility(contains ? 0 : 4);
            view$OnClickListenerC1264a1.f4458w.setImageResource(contains ? R.drawable.ic_accept : R.drawable.ic_cancel);
            view$OnClickListenerC1264a1.f4456A.mo1121Q0(abstractC1427e, view$OnClickListenerC1264a1.f4457v);
        }
    }

    @Override // p010b.p083u.p084e.AbstractC0932e1
    /* renamed from: f */
    public AbstractC0941g2 mo541f(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new View$OnClickListenerC1264a1(this.f4618e, this.f4617d.inflate(R.layout.add_on_browser_view_item, viewGroup, false));
        }
        View$OnClickListenerC1265a view$OnClickListenerC1265a = new View$OnClickListenerC1265a(this.f4618e.m1872h(), null);
        view$OnClickListenerC1265a.setTag(this.f4618e.mo1119S0());
        AbstractC1268b1 abstractC1268b1 = this.f4618e;
        view$OnClickListenerC1265a.setTitle(abstractC1268b1.m1902G(abstractC1268b1.mo1118T0()));
        return new C1385y0(this, view$OnClickListenerC1265a);
    }
}