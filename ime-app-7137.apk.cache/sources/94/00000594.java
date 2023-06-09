package p093c.p097b.p108i0.p110p.p112b2;

import android.view.View;
import android.widget.TextView;
import com.menny.android.anysoftkeyboard.R;
import p010b.p086w.AbstractC1077v0;
import p093c.p097b.p105f0.AbstractC1216c;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* renamed from: c.b.i0.p.b2.n0 */
/* loaded from: classes.dex */
public class View$OnClickListenerC1296n0 extends AbstractC1290k0 implements View.OnClickListener {

    /* renamed from: x */
    public final TextView f4507x;

    /* renamed from: y */
    public final /* synthetic */ C1298o0 f4508y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC1296n0(C1298o0 c1298o0, View view) {
        super(c1298o0, view);
        this.f4508y = c1298o0;
        TextView textView = (TextView) view.findViewById(R.id.word_view);
        this.f4507x = textView;
        textView.setOnClickListener(this);
        view.findViewById(R.id.delete_user_word).setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int m1136y = m1136y();
        if (m1136y < 0) {
            return;
        }
        if (view == this.f4507x) {
            C1302q0 c1302q0 = (C1302q0) this.f4508y.f4510d.remove(m1136y);
            this.f4508y.f4510d.add(m1136y, new C1288j0(c1302q0.f4516a, c1302q0.f4517b));
            this.f4508y.m1683d(m1136y);
        } else if (view.getId() == R.id.delete_user_word) {
            this.f4508y.f3589a.m1676f(m1136y, 1);
            final C1314w0 c1314w0 = (C1314w0) this.f4508y.f4512f;
            c1314w0.f4530Z.mo117c(AbstractC1077v0.m1272g((C1302q0) this.f4508y.f4510d.remove(m1136y), c1314w0.m1913A0(), R.layout.progress_window).m163P(AbstractC1216c.f4391a).m172F(new InterfaceC2127i() { // from class: c.b.i0.p.b2.p
                @Override // p183e.p184a.p189o.InterfaceC2127i
                /* renamed from: a */
                public final Object mo24a(Object obj) {
                    C1314w0 c1314w02 = C1314w0.this;
                    c1314w02.getClass();
                    c1314w02.f4532b0.mo967o(((C1302q0) obj).f4516a);
                    return Boolean.TRUE;
                }
            }).m171G(AbstractC1216c.f4392b).m164N(new InterfaceC2123e() { // from class: c.b.i0.p.b2.k
                @Override // p183e.p184a.p189o.InterfaceC2123e
                public final void accept(Object obj) {
                    Boolean bool = (Boolean) obj;
                    int i = C1314w0.f4527W;
                }
            }, AbstractC2146l.f7040e, AbstractC2146l.f7038c, AbstractC2146l.f7039d));
        }
    }

    @Override // p093c.p097b.p108i0.p110p.p112b2.AbstractC1290k0
    /* renamed from: x */
    public void mo1135x(C1302q0 c1302q0) {
        this.f4497v = c1302q0;
        this.f4508y.mo1133i(this.f4507x, c1302q0);
    }
}