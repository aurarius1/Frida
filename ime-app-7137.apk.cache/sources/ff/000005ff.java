package p093c.p097b.p108i0.p110p.p113z1;

import android.content.Context;
import com.anysoftkeyboard.keyboards.views.DemoAnyKeyboardView;
import com.menny.android.anysoftkeyboard.AnyApplication;
import java.util.List;
import java.util.Random;
import p093c.p097b.p107h0.C1237f;
import p093c.p097b.p116p.AbstractC1427e;
import p093c.p097b.p116p.AbstractC1432j;
import p093c.p097b.p129y.C1656a;
import p093c.p097b.p130z.AbstractC1762t;
import p093c.p097b.p130z.C1671g0;

/* renamed from: c.b.i0.p.z1.o */
/* loaded from: classes.dex */
public class RunnableC1403o implements Runnable {

    /* renamed from: b */
    public final Random f4641b = new Random();

    /* renamed from: c */
    public final Context f4642c;

    /* renamed from: d */
    public final DemoAnyKeyboardView f4643d;

    /* renamed from: e */
    public C1671g0 f4644e;

    public RunnableC1403o(Context context, DemoAnyKeyboardView demoAnyKeyboardView) {
        this.f4642c = context;
        this.f4643d = demoAnyKeyboardView;
        this.f4644e = (C1671g0) AnyApplication.m191k(context).m1058f();
    }

    /* renamed from: a */
    public final AbstractC1427e m1097a(AbstractC1432j abstractC1432j) {
        List m1059e = abstractC1432j.m1059e();
        return (AbstractC1427e) m1059e.get(this.f4641b.nextInt(m1059e.size()));
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4643d.setKeyboardTheme((C1237f) m1097a(AnyApplication.m190l(this.f4642c)));
        C1656a c1656a = (C1656a) m1097a(AnyApplication.m188n(this.f4642c));
        AbstractC1762t m922b = this.f4644e.m922b(1);
        m922b.m834w(this.f4643d.getThemedKeyboardDimens(), c1656a, (C1656a) m1097a(AnyApplication.m193i(this.f4642c)));
        this.f4643d.m416C(m922b, null, null);
        this.f4643d.postDelayed(this, 1000L);
    }
}