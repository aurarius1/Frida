package p010b.p016c.p026q;

import android.graphics.Typeface;
import android.widget.TextView;

/* renamed from: b.c.q.d1 */
/* loaded from: classes.dex */
public class RunnableC0230d1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ TextView f1503b;

    /* renamed from: c */
    public final /* synthetic */ Typeface f1504c;

    /* renamed from: d */
    public final /* synthetic */ int f1505d;

    public RunnableC0230d1(C0236e1 c0236e1, TextView textView, Typeface typeface, int i) {
        this.f1503b = textView;
        this.f1504c = typeface;
        this.f1505d = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1503b.setTypeface(this.f1504c, this.f1505d);
    }
}