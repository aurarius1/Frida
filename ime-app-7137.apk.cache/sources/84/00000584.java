package p093c.p097b.p108i0.p110p.p112b2;

import android.content.Context;
import com.anysoftkeyboard.p180ui.settings.MainSettingsActivity;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import java.io.File;
import java.util.List;
import p010b.p046j.p057k.C0561b;
import p010b.p067m.p068d.AbstractActivityC0681d0;
import p010b.p086w.AbstractC1077v0;
import p093c.p097b.p100c0.p101b0.C1155c;
import p093c.p097b.p100c0.p101b0.C1158f;
import p093c.p097b.p105f0.AbstractC1216c;
import p093c.p097b.p121t.C1450g;
import p093c.p097b.p122u.AbstractC1473g0;
import p093c.p097b.p122u.p125w0.C1530o;
import p183e.p184a.p187m.C2111b;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* renamed from: c.b.i0.p.b2.f0 */
/* loaded from: classes.dex */
public class C1280f0 extends C1314w0 {

    /* renamed from: e0 */
    public C2111b f4489e0 = new C2111b();

    @Override // p093c.p097b.p108i0.p110p.p112b2.C1314w0
    /* renamed from: Q0 */
    public C1298o0 mo1127Q0(List list) {
        AbstractActivityC0681d0 m1872h = m1872h();
        if (m1872h == null) {
            return null;
        }
        return new C1276d0(list, m1872h, this);
    }

    @Override // p093c.p097b.p108i0.p110p.p112b2.C1314w0
    /* renamed from: R0 */
    public AbstractC1473g0 mo1126R0(String str) {
        return new C1278e0(m1911B0().getApplicationContext(), str);
    }

    @Override // p093c.p097b.p108i0.p110p.p112b2.C1314w0, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: Y */
    public void mo1098Y() {
        this.f4489e0.mo35e();
        super.mo1098Y();
    }

    @Override // p093c.p097b.p108i0.p110p.p112b2.C1314w0
    public void backupToStorage() {
        this.f4489e0.mo35e();
        this.f4489e0 = new C2111b();
        this.f4489e0.mo117c(AbstractC1077v0.m1272g(new C0561b(new C1158f(), new C1530o(m1866k(), "abbreviations.db")), m1913A0(), R.layout.progress_window).m163P(AbstractC1216c.f4391a).m172F(new InterfaceC2127i() { // from class: c.b.i0.p.b2.g
            @Override // p183e.p184a.p189o.InterfaceC2127i
            /* renamed from: a */
            public final Object mo24a(Object obj) {
                C1280f0 c1280f0 = C1280f0.this;
                C0561b c0561b = (C0561b) obj;
                c1280f0.getClass();
                C1155c mo973b = ((C1530o) c0561b.f2655b).mo973b();
                Context m1911B0 = c1280f0.m1911B0();
                C1450g c1450g = AnyApplication.f6979b;
                ((C1158f) c0561b.f2654a).m1162b(mo973b, new File(m1911B0.getExternalFilesDir(null), "AbbrUserWords.xml"));
                return Boolean.TRUE;
            }
        }).m171G(AbstractC1216c.f4392b).m164N(new InterfaceC2123e() { // from class: c.b.i0.p.b2.e
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                Boolean bool = (Boolean) obj;
                C1280f0.this.f4528X.m20b(10, null);
            }
        }, new InterfaceC2123e() { // from class: c.b.i0.p.b2.a
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                C1280f0.this.f4528X.m20b(11, ((Throwable) obj).getMessage());
            }
        }, new C1283h(this), AbstractC2146l.f7039d));
    }

    @Override // p093c.p097b.p108i0.p110p.p112b2.C1314w0, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: o0 */
    public void mo527o0() {
        super.mo527o0();
        MainSettingsActivity.m369y(this, m1908D(R.string.abbreviation_dict_settings_titlebar));
    }

    @Override // p093c.p097b.p108i0.p110p.p112b2.C1314w0
    public void restoreFromStorage() {
        this.f4489e0.mo35e();
        this.f4489e0 = new C2111b();
        this.f4489e0.mo117c(AbstractC1077v0.m1272g(new C0561b(new C1158f(), new C1530o(m1866k(), "abbreviations.db")), m1913A0(), R.layout.progress_window).m163P(AbstractC1216c.f4391a).m172F(new InterfaceC2127i() { // from class: c.b.i0.p.b2.f
            @Override // p183e.p184a.p189o.InterfaceC2127i
            /* renamed from: a */
            public final Object mo24a(Object obj) {
                C1280f0 c1280f0 = C1280f0.this;
                C0561b c0561b = (C0561b) obj;
                c1280f0.getClass();
                Context m1911B0 = c1280f0.m1911B0();
                C1450g c1450g = AnyApplication.f6979b;
                ((C1530o) c0561b.f2655b).mo974a(((C1158f) c0561b.f2654a).m1163a(new File(m1911B0.getExternalFilesDir(null), "AbbrUserWords.xml")));
                return Boolean.TRUE;
            }
        }).m171G(AbstractC1216c.f4392b).m164N(new InterfaceC2123e() { // from class: c.b.i0.p.b2.d
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                Boolean bool = (Boolean) obj;
                C1280f0.this.f4528X.m20b(20, null);
            }
        }, new InterfaceC2123e() { // from class: c.b.i0.p.b2.c
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                C1280f0.this.f4528X.m20b(21, ((Throwable) obj).getMessage());
            }
        }, new C1283h(this), AbstractC2146l.f7039d));
    }
}