package p010b.p067m.p068d;

import java.util.List;

/* renamed from: b.m.d.c */
/* loaded from: classes.dex */
public class RunnableC0676c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ List f2920b;

    /* renamed from: c */
    public final /* synthetic */ C0727o2 f2921c;

    /* renamed from: d */
    public final /* synthetic */ C0728p f2922d;

    public RunnableC0676c(C0728p c0728p, List list, C0727o2 c0727o2) {
        this.f2922d = c0728p;
        this.f2920b = list;
        this.f2921c = c0727o2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f2920b.contains(this.f2921c)) {
            this.f2920b.remove(this.f2921c);
            C0728p c0728p = this.f2922d;
            C0727o2 c0727o2 = this.f2921c;
            c0728p.getClass();
            c0727o2.f3087a.m1953a(c0727o2.f3089c.f3216I);
        }
    }
}