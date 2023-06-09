package p093c.p097b.p108i0.p110p;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import com.anysoftkeyboard.p180ui.settings.MainSettingsActivity;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import p010b.p016c.p017k.C0119p;
import p010b.p036g.C0385i;
import p010b.p036g.C0387k;
import p010b.p046j.p057k.C0561b;
import p010b.p067m.p068d.AbstractActivityC0681d0;
import p010b.p082t.AbstractC0904x;
import p010b.p082t.InterfaceC0890q;
import p010b.p086w.AbstractC1077v0;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p097b.p098a0.C1130e;
import p093c.p097b.p098a0.C1131f;
import p093c.p097b.p098a0.C1132g;
import p093c.p097b.p098a0.C1134i;
import p093c.p097b.p100c0.p101b0.C1155c;
import p093c.p097b.p100c0.p101b0.C1158f;
import p093c.p097b.p105f0.AbstractC1216c;
import p093c.p097b.p115j0.C1416b;
import p093c.p097b.p121t.C1450g;
import p093c.p097b.p122u.C1461a0;
import p093c.p097b.p122u.C1475h0;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.p187m.C2111b;
import p183e.p184a.p189o.InterfaceC2119a;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p189o.InterfaceC2128j;
import p183e.p184a.p190p.p192b.AbstractC2146l;
import p183e.p184a.p190p.p192b.EnumC2142h;
import p183e.p184a.p190p.p195e.p196a.C2184h0;
import p204f.p205a.p209b.C2296g;
import p204f.p205a.p209b.InterfaceC2294e;
import p210g.p211a.p212a.InterfaceC2302a;

/* renamed from: c.b.i0.p.t1 */
/* loaded from: classes.dex */
public class C1371t1 extends AbstractC0904x {

    /* renamed from: e0 */
    public static final /* synthetic */ int f4602e0 = 0;

    /* renamed from: f0 */
    public C2296g f4603f0;

    /* renamed from: g0 */
    public C2111b f4604g0 = new C2111b();

    /* renamed from: h0 */
    public final InterfaceC0890q f4605h0 = new InterfaceC0890q() { // from class: c.b.i0.p.i0
        @Override // p010b.p082t.InterfaceC0890q
        /* renamed from: a */
        public final boolean mo1123a(Preference preference) {
            final C1371t1 c1371t1 = C1371t1.this;
            c1371t1.f4604g0.mo117c(new C2184h0(C1371t1.m1112U0(c1371t1).m163P(AbstractC1216c.f4391a).m172F(new InterfaceC2127i() { // from class: c.b.i0.p.s0
                @Override // p183e.p184a.p189o.InterfaceC2127i
                /* renamed from: a */
                public final Object mo24a(Object obj) {
                    C0561b c0561b = (C0561b) obj;
                    int i = C1371t1.f4602e0;
                    C1130e c1130e = new C1130e(((C1371t1) c0561b.f2655b).m1911B0().getApplicationContext(), ((C1461a0) c0561b.f2654a).f4760k);
                    c1130e.m1185b();
                    c1130e.f4235c = null;
                    c1130e.f4236d.clear();
                    c1130e.f4234b.m1177b(c1130e.f4236d.values());
                    return (C1371t1) c0561b.f2655b;
                }
            }).m171G(AbstractC1216c.f4392b), c1371t1).m134c(new InterfaceC2123e() { // from class: c.b.i0.p.l0
                @Override // p183e.p184a.p189o.InterfaceC2123e
                public final void accept(Object obj) {
                    int i = C1371t1.f4602e0;
                    ((C1371t1) obj).m1111V0();
                }
            }, new InterfaceC2123e() { // from class: c.b.i0.p.h0
                @Override // p183e.p184a.p189o.InterfaceC2123e
                public final void accept(Object obj) {
                    Throwable th = (Throwable) obj;
                    C1371t1.this.m1111V0();
                }
            }));
            return true;
        }
    };

    /* renamed from: U0 */
    public static AbstractC2094b m1112U0(C1371t1 c1371t1) {
        Context m1911B0 = c1371t1.m1911B0();
        C1450g c1450g = AnyApplication.f6979b;
        return AbstractC2094b.m174D(((AnyApplication) m1911B0.getApplicationContext()).f6983f.m1059e()).m140y(new InterfaceC2128j() { // from class: c.b.i0.p.b0
            @Override // p183e.p184a.p189o.InterfaceC2128j
            /* renamed from: a */
            public final boolean mo40a(Object obj) {
                int i = C1371t1.f4602e0;
                return !TextUtils.isEmpty(((C1461a0) obj).f4760k);
            }
        }).m144u(new InterfaceC2127i() { // from class: c.b.i0.p.e
            @Override // p183e.p184a.p189o.InterfaceC2127i
            /* renamed from: a */
            public final Object mo24a(Object obj) {
                return ((C1461a0) obj).f4760k;
            }
        }, EnumC2142h.INSTANCE).m172F(new InterfaceC2127i() { // from class: c.b.i0.p.j0
            @Override // p183e.p184a.p189o.InterfaceC2127i
            /* renamed from: a */
            public final Object mo24a(Object obj) {
                C1371t1 c1371t12 = C1371t1.this;
                int i = C1371t1.f4602e0;
                return new C0561b((C1461a0) obj, c1371t12);
            }
        });
    }

    @Override // p010b.p082t.AbstractC0904x
    /* renamed from: S0 */
    public void mo1107S0(Bundle bundle, String str) {
        m1735Q0(R.xml.prefs_next_word);
    }

    @Override // p010b.p082t.AbstractC0904x, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: T */
    public void mo523T(Bundle bundle) {
        super.mo523T(bundle);
        this.f4603f0 = new C2296g(m1872h(), new InterfaceC2294e() { // from class: c.b.i0.p.c0
            @Override // p204f.p205a.p209b.InterfaceC2294e
            /* renamed from: a */
            public final void mo23a(C0119p c0119p, int i, Object obj) {
                int i2;
                String m1906E;
                C1371t1 c1371t1 = C1371t1.this;
                c1371t1.getClass();
                c0119p.m3058f(17039370, null);
                if (i != 10) {
                    if (i == 11) {
                        c0119p.m3056h(R.string.user_dict_backup_fail_title);
                        m1906E = c1371t1.m1906E(R.string.user_dict_backup_fail_text_with_error, obj);
                    } else if (i == 20) {
                        c0119p.m3056h(R.string.user_dict_restore_success_title);
                        i2 = R.string.user_dict_restore_success_text;
                    } else if (i != 21) {
                        throw new IllegalArgumentException(AbstractC1124a.m1192d("Failed to handle ", i, " in NextWordSettingsFragment#onCreateDialog"));
                    } else {
                        c0119p.m3056h(R.string.user_dict_restore_fail_title);
                        m1906E = c1371t1.m1906E(R.string.user_dict_restore_fail_text_with_error, obj);
                    }
                    c0119p.f1026a.f942g = m1906E;
                    return;
                }
                c0119p.m3056h(R.string.user_dict_backup_success_title);
                i2 = R.string.user_dict_backup_success_text;
                c0119p.m3062b(i2);
            }
        });
    }

    /* renamed from: V0 */
    public final void m1111V0() {
        m1734R0("clear_next_word_data").m3291F(false);
        PreferenceCategory preferenceCategory = (PreferenceCategory) m1734R0("next_word_stats");
        synchronized (preferenceCategory) {
            List list = preferenceCategory.f636R;
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    preferenceCategory.m3266Q((Preference) list.get(0));
                }
            }
        }
        preferenceCategory.m3276o();
        this.f4604g0.mo117c(m1112U0(this).m163P(AbstractC1216c.f4391a).m172F(new InterfaceC2127i() { // from class: c.b.i0.p.e0
            @Override // p183e.p184a.p189o.InterfaceC2127i
            /* renamed from: a */
            public final Object mo24a(Object obj) {
                C0561b c0561b = (C0561b) obj;
                int i = C1371t1.f4602e0;
                C1130e c1130e = new C1130e(((C1371t1) c0561b.f2655b).m1866k(), ((C1461a0) c0561b.f2654a).f4760k);
                c1130e.m1185b();
                C1371t1 c1371t1 = (C1371t1) c0561b.f2655b;
                C1461a0 c1461a0 = (C1461a0) c0561b.f2654a;
                Iterator it = ((C0385i) c1130e.f4236d.entrySet()).iterator();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    C0387k c0387k = (C0387k) it;
                    if (!c0387k.hasNext()) {
                        return new C1416b(c1371t1, c1461a0, new C1132g(i2, i3));
                    }
                    c0387k.next();
                    i2++;
                    i3 += ((C1134i) c0387k.getValue()).m1184a().size();
                }
            }
        }).m171G(AbstractC1216c.f4392b).m165M(new InterfaceC2123e() { // from class: c.b.i0.p.m0
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                C1416b c1416b = (C1416b) obj;
                int i = C1371t1.f4602e0;
                AbstractActivityC0681d0 m1913A0 = ((C1371t1) c1416b.f4671a).m1913A0();
                Preference preference = new Preference(m1913A0);
                C1461a0 c1461a0 = (C1461a0) c1416b.f4672b;
                preference.f620m = c1461a0.f4760k + "_stats";
                if (preference.f626s && !preference.m3278k()) {
                    if (TextUtils.isEmpty(preference.f620m)) {
                        throw new IllegalStateException("Preference does not have a key assigned.");
                    }
                    preference.f626s = true;
                }
                preference.m3288I(c1461a0.f4760k + " - " + c1461a0.f4706b);
                C1132g c1132g = (C1132g) c1416b.f4673c;
                int i2 = c1132g.f4241a;
                if (i2 == 0) {
                    preference.mo3289H(preference.f609b.getString(R.string.next_words_statistics_no_usage));
                } else {
                    preference.mo3289H(m1913A0.getString(R.string.next_words_statistics_count, new Object[]{Integer.valueOf(i2), Integer.valueOf(c1132g.f4242b / c1132g.f4241a)}));
                }
                preference.f627t = false;
                ((PreferenceCategory) ((C1371t1) c1416b.f4671a).m1734R0("next_word_stats")).m3270M(preference);
            }
        }, new InterfaceC2123e() { // from class: c.b.i0.p.q0
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                Throwable th = (Throwable) obj;
                int i = C1371t1.f4602e0;
            }
        }, new InterfaceC2119a() { // from class: c.b.i0.p.d0
            @Override // p183e.p184a.p189o.InterfaceC2119a
            public final void run() {
                C1371t1.this.m1734R0("clear_next_word_data").m3291F(true);
            }
        }));
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: W */
    public void mo1110W(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.next_word_menu_actions, menu);
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: Y */
    public void mo1098Y() {
        this.f3214G = true;
        this.f4603f0.m21a();
        this.f4604g0.mo35e();
    }

    @InterfaceC2302a(892343)
    public void doNextWordBackup() {
        this.f4604g0.mo35e();
        this.f4604g0 = new C2111b();
        if (AbstractC1077v0.m1275d(this, 892343)) {
            this.f4604g0.mo117c(AbstractC1077v0.m1271h(new C0561b(new C1158f(), new C1131f(m1866k(), C1475h0.m1009u(m1911B0()))), m1913A0(), m1908D(R.string.take_a_while_progress_message), R.layout.progress_window).m163P(AbstractC1216c.f4391a).m172F(new InterfaceC2127i() { // from class: c.b.i0.p.n0
                @Override // p183e.p184a.p189o.InterfaceC2127i
                /* renamed from: a */
                public final Object mo24a(Object obj) {
                    C1371t1 c1371t1 = C1371t1.this;
                    C0561b c0561b = (C0561b) obj;
                    c1371t1.getClass();
                    C1155c mo973b = ((C1131f) c0561b.f2655b).mo973b();
                    Context m1911B0 = c1371t1.m1911B0();
                    C1450g c1450g = AnyApplication.f6979b;
                    ((C1158f) c0561b.f2654a).m1162b(mo973b, new File(m1911B0.getExternalFilesDir(null), "NextWords.xml"));
                    return Boolean.TRUE;
                }
            }).m171G(AbstractC1216c.f4392b).m164N(new InterfaceC2123e() { // from class: c.b.i0.p.k0
                @Override // p183e.p184a.p189o.InterfaceC2123e
                public final void accept(Object obj) {
                    Boolean bool = (Boolean) obj;
                    C1371t1.this.f4603f0.m20b(10, null);
                }
            }, new InterfaceC2123e() { // from class: c.b.i0.p.g0
                @Override // p183e.p184a.p189o.InterfaceC2123e
                public final void accept(Object obj) {
                    C1371t1.this.f4603f0.m20b(11, ((Throwable) obj).getMessage());
                }
            }, new C1355o0(this), AbstractC2146l.f7039d));
        }
    }

    @InterfaceC2302a(892342)
    public void doNextWordRestore() {
        this.f4604g0.mo35e();
        this.f4604g0 = new C2111b();
        if (AbstractC1077v0.m1275d(this, 892342)) {
            this.f4604g0.mo117c(AbstractC1077v0.m1271h(new C0561b(new C1158f(), new C1131f(m1866k(), C1475h0.m1009u(m1911B0()))), m1913A0(), m1908D(R.string.take_a_while_progress_message), R.layout.progress_window).m163P(AbstractC1216c.f4391a).m172F(new InterfaceC2127i() { // from class: c.b.i0.p.r0
                @Override // p183e.p184a.p189o.InterfaceC2127i
                /* renamed from: a */
                public final Object mo24a(Object obj) {
                    C1371t1 c1371t1 = C1371t1.this;
                    C0561b c0561b = (C0561b) obj;
                    c1371t1.getClass();
                    Context m1911B0 = c1371t1.m1911B0();
                    C1450g c1450g = AnyApplication.f6979b;
                    ((C1131f) c0561b.f2655b).mo974a(((C1158f) c0561b.f2654a).m1163a(new File(m1911B0.getExternalFilesDir(null), "NextWords.xml")));
                    return Boolean.TRUE;
                }
            }).m171G(AbstractC1216c.f4392b).m164N(new InterfaceC2123e() { // from class: c.b.i0.p.p0
                @Override // p183e.p184a.p189o.InterfaceC2123e
                public final void accept(Object obj) {
                    Boolean bool = (Boolean) obj;
                    C1371t1.this.f4603f0.m20b(20, null);
                }
            }, new InterfaceC2123e() { // from class: c.b.i0.p.f0
                @Override // p183e.p184a.p189o.InterfaceC2123e
                public final void accept(Object obj) {
                    C1371t1.this.f4603f0.m20b(21, ((Throwable) obj).getMessage());
                }
            }, new C1355o0(this), AbstractC2146l.f7039d));
        }
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: g0 */
    public boolean mo1109g0(MenuItem menuItem) {
        if (((MainSettingsActivity) m1872h()) == null) {
            return false;
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.backup_words) {
            doNextWordBackup();
            return true;
        } else if (itemId != R.id.restore_words) {
            return false;
        } else {
            doNextWordRestore();
            return true;
        }
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: l0 */
    public void mo1101l0(int i, String[] strArr, int[] iArr) {
        AbstractC1077v0.m1293K(i, strArr, iArr, this);
    }

    @Override // p010b.p082t.AbstractC0904x, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: o0 */
    public void mo527o0() {
        super.mo527o0();
        MainSettingsActivity.m369y(this, m1908D(R.string.next_word_dict_settings));
        m1111V0();
    }

    @Override // p010b.p082t.AbstractC0904x, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: q0 */
    public void mo1080q0(View view, Bundle bundle) {
        super.mo1080q0(view, bundle);
        m1897I0(true);
        m1734R0("clear_next_word_data").f614g = this.f4605h0;
    }
}