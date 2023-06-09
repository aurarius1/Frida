package p093c.p097b.p128x;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.anysoftkeyboard.ime.AnySoftKeyboardClipboard;
import com.menny.android.anysoftkeyboard.R;
import p093c.p097b.p130z.p132r0.InterfaceC1742q0;

/* renamed from: c.b.x.i2 */
/* loaded from: classes.dex */
public class C1587i2 implements InterfaceC1742q0 {

    /* renamed from: a */
    public final C1575f2 f5013a;

    /* renamed from: b */
    public CharSequence f5014b;

    /* renamed from: c */
    public TextView f5015c;

    public C1587i2(C1575f2 c1575f2) {
        this.f5013a = c1575f2;
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1742q0
    /* renamed from: a */
    public void mo859a() {
        this.f5015c = null;
    }

    @Override // p093c.p097b.p130z.p132r0.InterfaceC1742q0
    /* renamed from: b */
    public View mo858b(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.f5013a.f4999a).inflate(R.layout.clipboard_suggestion_action, viewGroup, false);
        this.f5015c = (TextView) inflate.findViewById(R.id.clipboard_suggestion_text);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: c.b.x.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1587i2 c1587i2 = C1587i2.this;
                if (c1587i2.f5015c != null) {
                    C1575f2 c1575f2 = c1587i2.f5013a;
                    c1575f2.f4999a.mo450c(null, c1587i2.f5014b);
                    AnySoftKeyboardClipboard anySoftKeyboardClipboard = c1575f2.f4999a;
                    anySoftKeyboardClipboard.f6307c.m381e(anySoftKeyboardClipboard.f6321U0);
                }
            }
        });
        return inflate;
    }
}