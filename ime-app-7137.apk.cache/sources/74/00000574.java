package p093c.p097b.p108i0.p110p;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.anysoftkeyboard.keyboards.views.DemoAnyKeyboardView;
import com.menny.android.anysoftkeyboard.R;
import p010b.p083u.p084e.AbstractC0941g2;
import p093c.p097b.p116p.AbstractC1427e;

/* renamed from: c.b.i0.p.a1 */
/* loaded from: classes.dex */
public class View$OnClickListenerC1264a1 extends AbstractC0941g2 implements View.OnClickListener {

    /* renamed from: A */
    public final /* synthetic */ AbstractC1268b1 f4456A;

    /* renamed from: v */
    public final DemoAnyKeyboardView f4457v;

    /* renamed from: w */
    public final ImageView f4458w;

    /* renamed from: x */
    public final TextView f4459x;

    /* renamed from: y */
    public final TextView f4460y;

    /* renamed from: z */
    public AbstractC1427e f4461z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC1264a1(AbstractC1268b1 abstractC1268b1, View view) {
        super(view);
        this.f4456A = abstractC1268b1;
        view.setOnClickListener(this);
        this.f4457v = (DemoAnyKeyboardView) view.findViewById(R.id.item_keyboard_view);
        this.f4458w = (ImageView) view.findViewById(R.id.enabled_image);
        TextView textView = (TextView) view.findViewById(R.id.title);
        this.f4459x = textView;
        this.f4460y = (TextView) view.findViewById(R.id.subtitle);
        textView.setSelected(true);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        boolean contains = this.f4456A.f4465W.contains(this.f4461z.f4705a);
        AbstractC1268b1 abstractC1268b1 = this.f4456A;
        if (abstractC1268b1.f4468Z) {
            if (contains) {
                return;
            }
            int indexOf = this.f4456A.f4472d0.indexOf(abstractC1268b1.f4471c0.m1058f());
            this.f4456A.f4465W.clear();
            this.f4456A.f4465W.add(this.f4461z.f4705a);
            this.f4456A.f4471c0.mo1012r(this.f4461z.f4705a, true);
            AbstractC1268b1 abstractC1268b12 = this.f4456A;
            DemoAnyKeyboardView demoAnyKeyboardView = abstractC1268b12.f4475g0;
            if (demoAnyKeyboardView != null) {
                abstractC1268b12.mo1121Q0(this.f4461z, demoAnyKeyboardView);
            }
            this.f4456A.f4474f0.getAdapter().m1683d(indexOf);
        } else if (contains) {
            abstractC1268b1.f4465W.remove(this.f4461z.f4705a);
            this.f4456A.f4471c0.mo1012r(this.f4461z.f4705a, false);
        } else {
            abstractC1268b1.f4465W.add(this.f4461z.f4705a);
            this.f4456A.f4471c0.mo1012r(this.f4461z.f4705a, true);
        }
        this.f4456A.f4474f0.getAdapter().m1683d(m1667f());
    }
}