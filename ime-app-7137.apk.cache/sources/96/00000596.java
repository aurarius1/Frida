package p093c.p097b.p108i0.p110p.p112b2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.menny.android.anysoftkeyboard.R;
import java.util.ArrayList;
import java.util.List;
import p010b.p083u.p084e.AbstractC0932e1;
import p010b.p083u.p084e.AbstractC0941g2;

/* renamed from: c.b.i0.p.b2.o0 */
/* loaded from: classes.dex */
public class C1298o0 extends AbstractC0932e1 {

    /* renamed from: d */
    public final List f4510d;

    /* renamed from: e */
    public final LayoutInflater f4511e;

    /* renamed from: f */
    public final InterfaceC1286i0 f4512f;

    public C1298o0(List list, LayoutInflater layoutInflater, InterfaceC1286i0 interfaceC1286i0) {
        ArrayList arrayList = new ArrayList(list);
        this.f4510d = arrayList;
        arrayList.add(new C1284h0());
        this.f4511e = layoutInflater;
        this.f4512f = interfaceC1286i0;
    }

    @Override // p010b.p083u.p084e.AbstractC0932e1
    /* renamed from: a */
    public int mo543a() {
        return this.f4510d.size();
    }

    @Override // p010b.p083u.p084e.AbstractC0932e1
    /* renamed from: c */
    public int mo1106c(int i) {
        C1302q0 c1302q0 = (C1302q0) this.f4510d.get(i);
        return c1302q0 instanceof C1288j0 ? R.id.word_editor_view_type_editing_row : c1302q0 instanceof C1284h0 ? i == 0 ? R.id.word_editor_view_type_empty_view_row : R.id.word_editor_view_type_add_new_row : R.id.word_editor_view_type_row;
    }

    @Override // p010b.p083u.p084e.AbstractC0932e1
    /* renamed from: e */
    public void mo542e(AbstractC0941g2 abstractC0941g2, int i) {
        ((AbstractC1290k0) abstractC0941g2).mo1135x((C1302q0) this.f4510d.get(i));
    }

    @Override // p010b.p083u.p084e.AbstractC0932e1
    /* renamed from: f */
    public AbstractC0941g2 mo541f(ViewGroup viewGroup, int i) {
        switch (i) {
            case R.id.word_editor_view_type_add_new_row /* 2131296837 */:
                return new View$OnClickListenerC1292l0(this, this.f4511e.inflate(R.layout.user_dictionary_word_row_add, viewGroup, false));
            case R.id.word_editor_view_type_editing_row /* 2131296838 */:
                return new View$OnClickListenerC1294m0(this, mo1130l(this.f4511e, viewGroup));
            case R.id.word_editor_view_type_empty_view_row /* 2131296839 */:
                return new View$OnClickListenerC1292l0(this, this.f4511e.inflate(R.layout.word_editor_empty_view, viewGroup, false));
            default:
                return new View$OnClickListenerC1296n0(this, this.f4511e.inflate(R.layout.user_dictionary_word_row, viewGroup, false));
        }
    }

    /* renamed from: h */
    public void mo1134h(EditText editText, C1302q0 c1302q0) {
        editText.setText(c1302q0.f4516a);
    }

    /* renamed from: i */
    public void mo1133i(TextView textView, C1302q0 c1302q0) {
        textView.setText(c1302q0.f4516a);
    }

    /* renamed from: j */
    public C1288j0 mo1132j() {
        return new C1288j0("", 128);
    }

    /* renamed from: k */
    public C1302q0 mo1131k(EditText editText, C1302q0 c1302q0) {
        return new C1302q0(editText.getText().toString(), c1302q0.f4517b);
    }

    /* renamed from: l */
    public View mo1130l(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.user_dictionary_word_row_edit, viewGroup, false);
    }
}