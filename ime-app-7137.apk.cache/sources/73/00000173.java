package p010b.p016c.p026q;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import p010b.p016c.AbstractC0080f;
import p010b.p016c.AbstractC0081g;
import p010b.p016c.AbstractC0083i;

/* renamed from: b.c.q.e4 */
/* loaded from: classes.dex */
public class C0239e4 {

    /* renamed from: a */
    public final Context f1537a;

    /* renamed from: b */
    public final View f1538b;

    /* renamed from: c */
    public final TextView f1539c;

    /* renamed from: d */
    public final WindowManager.LayoutParams f1540d;

    /* renamed from: e */
    public final Rect f1541e;

    /* renamed from: f */
    public final int[] f1542f;

    /* renamed from: g */
    public final int[] f1543g;

    public C0239e4(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1540d = layoutParams;
        this.f1541e = new Rect();
        this.f1542f = new int[2];
        this.f1543g = new int[2];
        this.f1537a = context;
        View inflate = LayoutInflater.from(context).inflate(AbstractC0081g.abc_tooltip, (ViewGroup) null);
        this.f1538b = inflate;
        this.f1539c = (TextView) inflate.findViewById(AbstractC0080f.message);
        layoutParams.setTitle(C0239e4.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = AbstractC0083i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: a */
    public void m2838a() {
        if (this.f1538b.getParent() != null) {
            ((WindowManager) this.f1537a.getSystemService("window")).removeView(this.f1538b);
        }
    }
}