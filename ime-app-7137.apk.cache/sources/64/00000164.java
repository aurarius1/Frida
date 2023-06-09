package p010b.p016c.p026q;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p010b.p046j.p048e.p049b.AbstractC0503i;
import p010b.p046j.p058l.AbstractC0605j0;

/* renamed from: b.c.q.c1 */
/* loaded from: classes.dex */
public class C0224c1 extends AbstractC0503i {

    /* renamed from: a */
    public final /* synthetic */ int f1493a;

    /* renamed from: b */
    public final /* synthetic */ int f1494b;

    /* renamed from: c */
    public final /* synthetic */ WeakReference f1495c;

    /* renamed from: d */
    public final /* synthetic */ C0236e1 f1496d;

    public C0224c1(C0236e1 c0236e1, int i, int i2, WeakReference weakReference) {
        this.f1496d = c0236e1;
        this.f1493a = i;
        this.f1494b = i2;
        this.f1495c = weakReference;
    }

    @Override // p010b.p046j.p048e.p049b.AbstractC0503i
    /* renamed from: d */
    public void mo761d(int i) {
    }

    @Override // p010b.p046j.p048e.p049b.AbstractC0503i
    /* renamed from: e */
    public void mo760e(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f1493a) != -1) {
            typeface = Typeface.create(typeface, i, (this.f1494b & 2) != 0);
        }
        C0236e1 c0236e1 = this.f1496d;
        WeakReference weakReference = this.f1495c;
        if (c0236e1.f1535m) {
            c0236e1.f1534l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (AbstractC0605j0.m2233y(textView)) {
                    textView.post(new RunnableC0230d1(c0236e1, textView, typeface, c0236e1.f1532j));
                } else {
                    textView.setTypeface(typeface, c0236e1.f1532j);
                }
            }
        }
    }
}