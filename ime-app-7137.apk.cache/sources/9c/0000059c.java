package p093c.p097b.p108i0.p110p.p112b2;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.menny.android.anysoftkeyboard.R;
import p010b.p083u.p084e.AbstractC0964m1;
import p010b.p083u.p084e.C0929d2;

/* renamed from: c.b.i0.p.b2.r0 */
/* loaded from: classes.dex */
public class C1304r0 extends AbstractC0964m1 {

    /* renamed from: a */
    public final int f4519a;

    public C1304r0(Context context) {
        this.f4519a = context.getResources().getDimensionPixelSize(R.dimen.global_content_padding_side);
    }

    @Override // p010b.p083u.p084e.AbstractC0964m1
    /* renamed from: d */
    public void mo1129d(Rect rect, View view, RecyclerView recyclerView, C0929d2 c0929d2) {
        int i = this.f4519a;
        rect.set(i, i, i, i);
    }
}