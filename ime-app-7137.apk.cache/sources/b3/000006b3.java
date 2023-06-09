package p093c.p097b.p128x;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.anysoftkeyboard.ime.AnySoftKeyboardClipboard;
import com.menny.android.anysoftkeyboard.R;

/* renamed from: c.b.x.h2 */
/* loaded from: classes.dex */
public class C1583h2 extends ArrayAdapter {

    /* renamed from: b */
    public final /* synthetic */ AnySoftKeyboardClipboard f5009b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1583h2(AnySoftKeyboardClipboard anySoftKeyboardClipboard, Context context, CharSequence[] charSequenceArr) {
        super(context, (int) R.layout.clipboard_dialog_entry, (int) R.id.clipboard_entry_text, charSequenceArr);
        this.f5009b = anySoftKeyboardClipboard;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        View findViewById = view2.findViewById(R.id.clipboard_entry_delete);
        findViewById.setTag(R.id.clipboard_entry_delete, Integer.valueOf(i));
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: c.b.x.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                C1583h2 c1583h2 = C1583h2.this;
                c1583h2.getClass();
                c1583h2.f5009b.f6316P0.mo1029a(((Integer) view3.getTag(R.id.clipboard_entry_delete)).intValue());
                c1583h2.f5009b.f6326l.m21a();
            }
        });
        return view2;
    }
}