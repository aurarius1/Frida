package p093c.p097b.p108i0.p110p;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import com.menny.android.anysoftkeyboard.R;

/* renamed from: c.b.i0.p.q1 */
/* loaded from: classes.dex */
public class C1362q1 extends ClickableSpan {

    /* renamed from: b */
    public final /* synthetic */ C1365r1 f4581b;

    public C1362q1(C1365r1 c1365r1) {
        this.f4581b = c1365r1;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f4581b.m1843z().getString(R.string.main_site_url)));
        try {
            this.f4581b.m1887O0(intent);
        } catch (ActivityNotFoundException unused) {
            intent.getData();
        }
    }
}