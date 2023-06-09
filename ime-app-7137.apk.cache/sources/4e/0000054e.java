package p093c.p097b.p106g0;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.menny.android.anysoftkeyboard.R;
import p093c.p097b.p130z.p132r0.InterfaceC1742q0;

/* renamed from: c.b.g0.i */
/* loaded from: classes.dex */
public class C1226i implements InterfaceC1742q0 {

    /* renamed from: a */
    public final Intent f4400a;

    /* renamed from: b */
    public final int f4401b;

    public C1226i(String str, int i, AbstractC1225h abstractC1225h) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        this.f4400a = intent;
        this.f4401b = i;
        intent.setFlags(268435456);
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1742q0
    /* renamed from: a */
    public void mo859a() {
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1742q0
    /* renamed from: b */
    public View mo858b(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.easter_egg_action, viewGroup, false);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: c.b.g0.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1226i c1226i = C1226i.this;
                c1226i.getClass();
                view.getContext().startActivity(c1226i.f4400a);
            }
        });
        ((ImageView) inflate.findViewById(R.id.easter_egg_icon)).setImageResource(this.f4401b);
        return inflate;
    }
}