package p093c.p097b.p108i0.p114q;

import android.view.View;
import android.widget.TextView;
import com.menny.android.anysoftkeyboard.R;
import p010b.p083u.p084e.AbstractC0941g2;

/* renamed from: c.b.i0.q.a */
/* loaded from: classes.dex */
public class C1407a extends AbstractC0941g2 {

    /* renamed from: v */
    public final TextView f4652v;

    /* renamed from: w */
    public final TextView f4653w;

    /* renamed from: x */
    public final TextView f4654x;

    public C1407a(View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(R.id.changelog_version_title);
        this.f4652v = textView;
        this.f4653w = (TextView) view.findViewById(R.id.chang_log_item);
        this.f4654x = (TextView) view.findViewById(R.id.change_log__web_link_item);
        textView.setPaintFlags(textView.getPaintFlags() | 8);
    }
}