package p093c.p097b.p108i0.p110p.p112b2;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.menny.android.anysoftkeyboard.R;
import java.util.List;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: c.b.i0.p.b2.d0 */
/* loaded from: classes.dex */
public class C1276d0 extends C1298o0 {

    /* renamed from: g */
    public final Context f4485g;

    public C1276d0(List list, Context context, InterfaceC1286i0 interfaceC1286i0) {
        super(list, LayoutInflater.from(context), interfaceC1286i0);
        this.f4485g = context;
    }

    @Override // p093c.p097b.p108i0.p110p.p112b2.C1298o0
    /* renamed from: h */
    public void mo1134h(EditText editText, C1302q0 c1302q0) {
        editText.setText(c1302q0 == null ? "" : c1302q0.f4516a.substring(0, c1302q0.f4517b));
        ((EditText) ((View) editText.getParent()).findViewById(R.id.word_target_view)).setText(c1302q0 != null ? c1302q0.f4516a.substring(c1302q0.f4517b) : "");
    }

    @Override // p093c.p097b.p108i0.p110p.p112b2.C1298o0
    /* renamed from: i */
    public void mo1133i(TextView textView, C1302q0 c1302q0) {
        Context context = this.f4485g;
        Object[] objArr = new Object[2];
        objArr[0] = c1302q0 == null ? "" : c1302q0.f4516a.substring(0, c1302q0.f4517b);
        objArr[1] = c1302q0 != null ? c1302q0.f4516a.substring(c1302q0.f4517b) : "";
        textView.setText(context.getString(R.string.abbreviation_dict_word_template, objArr));
    }

    @Override // p093c.p097b.p108i0.p110p.p112b2.C1298o0
    /* renamed from: j */
    public C1288j0 mo1132j() {
        return new C1288j0("", 0);
    }

    @Override // p093c.p097b.p108i0.p110p.p112b2.C1298o0
    /* renamed from: k */
    public C1302q0 mo1131k(EditText editText, C1302q0 c1302q0) {
        String obj = editText.getText().toString();
        String obj2 = ((EditText) ((View) editText.getParent()).findViewById(R.id.word_target_view)).getText().toString();
        return (TextUtils.isEmpty(obj) || TextUtils.isEmpty(obj2)) ? new C1302q0(c1302q0.f4516a, c1302q0.f4517b) : new C1302q0(AbstractC1124a.m1190f(obj, obj2), obj.length());
    }

    @Override // p093c.p097b.p108i0.p110p.p112b2.C1298o0
    /* renamed from: l */
    public View mo1130l(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.abbreviation_dictionary_word_row_edit, viewGroup, false);
    }
}