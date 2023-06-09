package p093c.p097b.p108i0.p110p.p112b2;

import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.menny.android.anysoftkeyboard.R;
import p010b.p046j.p057k.C0561b;
import p010b.p086w.AbstractC1077v0;
import p093c.p097b.p105f0.AbstractC1216c;
import p093c.p097b.p122u.AbstractC1473g0;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* renamed from: c.b.i0.p.b2.m0 */
/* loaded from: classes.dex */
public class View$OnClickListenerC1294m0 extends AbstractC1290k0 implements View.OnClickListener {

    /* renamed from: x */
    public final EditText f4503x;

    /* renamed from: y */
    public final /* synthetic */ C1298o0 f4504y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC1294m0(C1298o0 c1298o0, View view) {
        super(c1298o0, view);
        this.f4504y = c1298o0;
        this.f4503x = (EditText) view.findViewById(R.id.word_view);
        view.findViewById(R.id.approve_user_word).setOnClickListener(this);
        view.findViewById(R.id.cancel_user_word).setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int m1136y = m1136y();
        if (m1136y == -1) {
            return;
        }
        boolean z = m1136y == this.f4504y.f4510d.size() - 1;
        if (view.getId() == R.id.cancel_user_word || TextUtils.isEmpty(this.f4503x.getText())) {
            C1302q0 c1302q0 = (C1302q0) this.f4504y.f4510d.remove(m1136y);
            if (z) {
                this.f4504y.f4510d.add(m1136y, new C1284h0());
            } else {
                this.f4504y.f4510d.add(m1136y, new C1302q0(c1302q0.f4516a, c1302q0.f4517b));
            }
        } else if (view.getId() == R.id.approve_user_word) {
            C1302q0 c1302q02 = (C1302q0) this.f4504y.f4510d.remove(m1136y);
            C1302q0 mo1131k = this.f4504y.mo1131k(this.f4503x, c1302q02);
            this.f4504y.f4510d.add(m1136y, mo1131k);
            if (z) {
                this.f4504y.f4510d.add(new C1284h0());
                C1298o0 c1298o0 = this.f4504y;
                c1298o0.f3589a.m1677e(c1298o0.f4510d.size() - 1, 1);
            }
            final C1314w0 c1314w0 = (C1314w0) this.f4504y.f4512f;
            c1314w0.f4530Z.mo117c(AbstractC1077v0.m1272g(new C0561b(c1302q02.f4516a, mo1131k), c1314w0.m1913A0(), R.layout.progress_window).m163P(AbstractC1216c.f4391a).m172F(new InterfaceC2127i() { // from class: c.b.i0.p.b2.x
                @Override // p183e.p184a.p189o.InterfaceC2127i
                /* renamed from: a */
                public final Object mo24a(Object obj) {
                    C1314w0 c1314w02 = C1314w0.this;
                    C0561b c0561b = (C0561b) obj;
                    c1314w02.getClass();
                    if (!TextUtils.isEmpty((CharSequence) c0561b.f2654a)) {
                        c1314w02.f4532b0.mo967o((String) c0561b.f2654a);
                    }
                    c1314w02.f4532b0.mo967o(((C1302q0) c0561b.f2655b).f4516a);
                    AbstractC1473g0 abstractC1473g0 = c1314w02.f4532b0;
                    C1302q0 c1302q03 = (C1302q0) c0561b.f2655b;
                    abstractC1473g0.mo968n(c1302q03.f4516a, c1302q03.f4517b);
                    return Boolean.TRUE;
                }
            }).m171G(AbstractC1216c.f4392b).m164N(new InterfaceC2123e() { // from class: c.b.i0.p.b2.r
                @Override // p183e.p184a.p189o.InterfaceC2123e
                public final void accept(Object obj) {
                    Boolean bool = (Boolean) obj;
                    int i = C1314w0.f4527W;
                }
            }, AbstractC2146l.f7040e, AbstractC2146l.f7038c, AbstractC2146l.f7039d));
        }
        this.f4504y.m1683d(m1136y);
    }

    @Override // p093c.p097b.p108i0.p110p.p112b2.AbstractC1290k0
    /* renamed from: x */
    public void mo1135x(C1302q0 c1302q0) {
        this.f4497v = c1302q0;
        this.f4504y.mo1134h(this.f4503x, c1302q0);
    }
}