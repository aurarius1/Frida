package p093c.p097b.p108i0.p110p.p112b2;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.anysoftkeyboard.p180ui.settings.BasicAnyActivity;
import com.anysoftkeyboard.p180ui.settings.MainSettingsActivity;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p010b.p016c.p017k.C0096d1;
import p010b.p016c.p017k.C0119p;
import p010b.p016c.p026q.C0215a4;
import p010b.p046j.p057k.C0561b;
import p010b.p067m.p068d.AbstractActivityC0681d0;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;
import p010b.p083u.p084e.AbstractC0980q1;
import p010b.p086w.AbstractC1077v0;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p097b.p100c0.p101b0.C1155c;
import p093c.p097b.p100c0.p101b0.C1158f;
import p093c.p097b.p105f0.AbstractC1216c;
import p093c.p097b.p105f0.C1215b;
import p093c.p097b.p117q.AbstractC1438d;
import p093c.p097b.p121t.C1450g;
import p093c.p097b.p122u.AbstractC1473g0;
import p093c.p097b.p122u.p124v0.C1507d;
import p093c.p097b.p122u.p124v0.C1510g;
import p093c.p097b.p122u.p124v0.C1514k;
import p093c.p097b.p130z.C1671g0;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.p187m.C2110a;
import p183e.p184a.p187m.C2111b;
import p183e.p184a.p189o.InterfaceC2119a;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p189o.InterfaceC2128j;
import p183e.p184a.p190p.p192b.AbstractC2146l;
import p204f.p205a.p209b.C2296g;
import p204f.p205a.p209b.InterfaceC2294e;
import p210g.p211a.p212a.InterfaceC2302a;

/* renamed from: c.b.i0.p.b2.w0 */
/* loaded from: classes.dex */
public class C1314w0 extends AbstractComponentCallbacksC0763z implements InterfaceC1286i0 {

    /* renamed from: W */
    public static final /* synthetic */ int f4527W = 0;

    /* renamed from: X */
    public C2296g f4528X;

    /* renamed from: Y */
    public Spinner f4529Y;

    /* renamed from: b0 */
    public AbstractC1473g0 f4532b0;

    /* renamed from: c0 */
    public RecyclerView f4533c0;

    /* renamed from: Z */
    public C2111b f4530Z = new C2111b();

    /* renamed from: a0 */
    public String f4531a0 = null;

    /* renamed from: d0 */
    public final AdapterView.OnItemSelectedListener f4534d0 = new C1300p0(this);

    /* renamed from: Q0 */
    public C1298o0 mo1127Q0(List list) {
        AbstractActivityC0681d0 m1872h = m1872h();
        if (m1872h == null) {
            return null;
        }
        return new C1298o0(list, LayoutInflater.from(m1872h), this);
    }

    /* renamed from: R0 */
    public AbstractC1473g0 mo1126R0(String str) {
        return new C1312v0(m1911B0().getApplicationContext(), str);
    }

    /* renamed from: S0 */
    public void m1125S0() {
        this.f4530Z.mo35e();
        this.f4530Z = new C2111b();
        this.f4530Z.mo117c(AbstractC1077v0.m1272g(mo1126R0(this.f4531a0), m1913A0(), R.layout.progress_window).m163P(AbstractC1216c.f4391a).m172F(new InterfaceC2127i() { // from class: c.b.i0.p.b2.j
            @Override // p183e.p184a.p189o.InterfaceC2127i
            /* renamed from: a */
            public final Object mo24a(Object obj) {
                AbstractC1473g0 abstractC1473g0 = (AbstractC1473g0) obj;
                int i = C1314w0.f4527W;
                abstractC1473g0.m952l();
                List mo1128b = ((InterfaceC1308t0) abstractC1473g0).mo1128b();
                Collections.sort(mo1128b, new Comparator() { // from class: c.b.i0.p.b2.s
                    @Override // java.util.Comparator
                    public final int compare(Object obj2, Object obj3) {
                        int i2 = C1314w0.f4527W;
                        return ((C1302q0) obj2).f4516a.compareTo(((C1302q0) obj3).f4516a);
                    }
                });
                return new C0561b(abstractC1473g0, mo1128b);
            }
        }).m171G(AbstractC1216c.f4392b).m166L(new InterfaceC2123e() { // from class: c.b.i0.p.b2.w
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                final C1314w0 c1314w0 = C1314w0.this;
                C0561b c0561b = (C0561b) obj;
                c1314w0.getClass();
                final AbstractC1473g0 abstractC1473g0 = (AbstractC1473g0) c0561b.f2654a;
                c1314w0.f4532b0 = abstractC1473g0;
                c1314w0.f4530Z.mo117c(new C2110a(new InterfaceC2119a() { // from class: c.b.i0.p.b2.z
                    @Override // p183e.p184a.p189o.InterfaceC2119a
                    public final void run() {
                        C1314w0 c1314w02 = C1314w0.this;
                        AbstractC1473g0 abstractC1473g02 = abstractC1473g0;
                        c1314w02.getClass();
                        abstractC1473g02.m954e();
                        if (c1314w02.f4532b0 == abstractC1473g02) {
                            c1314w02.f4532b0 = null;
                        }
                    }
                }));
                C1298o0 mo1127Q0 = c1314w0.mo1127Q0((List) c0561b.f2655b);
                if (mo1127Q0 != null) {
                    c1314w0.f4533c0.setAdapter(mo1127Q0);
                }
            }
        }, new C1215b("Failed to load words from dictionary for editor.")));
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: T */
    public void mo523T(Bundle bundle) {
        super.mo523T(bundle);
        this.f4528X = new C2296g(m1872h(), new InterfaceC2294e() { // from class: c.b.i0.p.b2.q
            @Override // p204f.p205a.p209b.InterfaceC2294e
            /* renamed from: a */
            public final void mo23a(C0119p c0119p, int i, Object obj) {
                int i2;
                String m1906E;
                C1314w0 c1314w0 = C1314w0.this;
                c1314w0.getClass();
                c0119p.m3058f(17039370, null);
                if (i != 10) {
                    if (i == 11) {
                        c0119p.m3056h(R.string.user_dict_backup_fail_title);
                        m1906E = c1314w0.m1906E(R.string.user_dict_backup_fail_text_with_error, obj);
                    } else if (i == 20) {
                        c0119p.m3056h(R.string.user_dict_restore_success_title);
                        i2 = R.string.user_dict_restore_success_text;
                    } else if (i != 21) {
                        throw new IllegalArgumentException(AbstractC1124a.m1192d("Failed to handle ", i, " in UserDictionaryEditorFragment#onCreateDialog"));
                    } else {
                        c0119p.m3056h(R.string.user_dict_restore_fail_title);
                        m1906E = c1314w0.m1906E(R.string.user_dict_restore_fail_text_with_error, obj);
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

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: W */
    public void mo1110W(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.words_editor_menu_actions, menu);
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: X */
    public View mo522X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m1897I0(true);
        C0096d1 c0096d1 = (C0096d1) ((BasicAnyActivity) m1872h()).m3025q();
        c0096d1.m3079f(16, 16);
        c0096d1.m3079f(0, 8);
        View inflate = layoutInflater.inflate(R.layout.words_editor_actionbar_view, (ViewGroup) null);
        this.f4529Y = (Spinner) inflate.findViewById(R.id.user_dictionay_langs);
        ((C0215a4) c0096d1.f888g).m2881b(inflate);
        return layoutInflater.inflate(R.layout.user_dictionary_editor, viewGroup, false);
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: Y */
    public void mo1098Y() {
        this.f4530Z.mo35e();
        C0096d1 c0096d1 = (C0096d1) ((BasicAnyActivity) m1913A0()).m3025q();
        c0096d1.m3079f(0, 16);
        c0096d1.m3079f(8, 8);
        ((C0215a4) c0096d1.f888g).m2881b(null);
        this.f4528X.m21a();
        this.f3214G = true;
    }

    @InterfaceC2302a(892343)
    public void backupToStorage() {
        this.f4530Z.mo35e();
        this.f4530Z = new C2111b();
        if (AbstractC1077v0.m1275d(this, 892343)) {
            this.f4530Z.mo117c(AbstractC1077v0.m1272g(new C0561b(new C1158f(), new C1514k(m1866k())), m1913A0(), R.layout.progress_window).m163P(AbstractC1216c.f4391a).m172F(new InterfaceC2127i() { // from class: c.b.i0.p.b2.i
                @Override // p183e.p184a.p189o.InterfaceC2127i
                /* renamed from: a */
                public final Object mo24a(Object obj) {
                    C1314w0 c1314w0 = C1314w0.this;
                    C0561b c0561b = (C0561b) obj;
                    c1314w0.getClass();
                    C1155c mo973b = ((C1514k) c0561b.f2655b).mo973b();
                    Context m1911B0 = c1314w0.m1911B0();
                    C1450g c1450g = AnyApplication.f6979b;
                    ((C1158f) c0561b.f2654a).m1162b(mo973b, new File(m1911B0.getExternalFilesDir(null), "UserWords.xml"));
                    return Boolean.TRUE;
                }
            }).m171G(AbstractC1216c.f4392b).m164N(new InterfaceC2123e() { // from class: c.b.i0.p.b2.o
                @Override // p183e.p184a.p189o.InterfaceC2123e
                public final void accept(Object obj) {
                    Boolean bool = (Boolean) obj;
                    C1314w0.this.f4528X.m20b(10, null);
                }
            }, new InterfaceC2123e() { // from class: c.b.i0.p.b2.v
                @Override // p183e.p184a.p189o.InterfaceC2123e
                public final void accept(Object obj) {
                    C1314w0.this.f4528X.m20b(11, ((Throwable) obj).getMessage());
                }
            }, new C1272b0(this), AbstractC2146l.f7039d));
        }
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: g0 */
    public boolean mo1109g0(MenuItem menuItem) {
        AbstractC0980q1 abstractC0980q1;
        if (((MainSettingsActivity) m1872h()) == null) {
            return false;
        }
        int itemId = menuItem.getItemId();
        if (itemId != R.id.add_user_word) {
            if (itemId == R.id.backup_words) {
                backupToStorage();
                return true;
            } else if (itemId != R.id.restore_words) {
                return false;
            } else {
                restoreFromStorage();
                return true;
            }
        }
        C1298o0 c1298o0 = (C1298o0) this.f4533c0.getAdapter();
        if (c1298o0 != null && m1890M()) {
            RecyclerView recyclerView = this.f4533c0;
            int size = c1298o0.f4510d.size() - 1;
            C1302q0 c1302q0 = (C1302q0) c1298o0.f4510d.get(size);
            if ((c1302q0 instanceof C1284h0) || (c1302q0 instanceof C1288j0)) {
                c1298o0.f4510d.remove(size);
            } else {
                size++;
            }
            c1298o0.f4510d.add(c1298o0.mo1132j());
            c1298o0.m1683d(size);
            if (!recyclerView.f724I && (abstractC0980q1 = recyclerView.f777w) != null) {
                abstractC0980q1.mo554X0(recyclerView, recyclerView.f770s0, size);
            }
        }
        return true;
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: l0 */
    public void mo1101l0(int i, String[] strArr, int[] iArr) {
        AbstractC1077v0.m1293K(i, strArr, iArr, this);
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: o0 */
    public void mo527o0() {
        this.f3214G = true;
        MainSettingsActivity.m369y(this, m1908D(R.string.user_dict_settings_titlebar));
        final ArrayAdapter arrayAdapter = new ArrayAdapter(m1872h(), 17367048);
        arrayAdapter.setDropDownViewResource(17367049);
        Context m1911B0 = m1911B0();
        C1450g c1450g = AnyApplication.f6979b;
        AbstractC2094b.m174D(((AnyApplication) m1911B0.getApplicationContext()).f6982e.m1057g()).m140y(new InterfaceC2128j() { // from class: c.b.i0.p.b2.u
            @Override // p183e.p184a.p189o.InterfaceC2128j
            /* renamed from: a */
            public final boolean mo40a(Object obj) {
                int i = C1314w0.f4527W;
                return !TextUtils.isEmpty(((C1671g0) obj).f5159n);
            }
        }).m172F(new InterfaceC2127i() { // from class: c.b.i0.p.b2.a0
            @Override // p183e.p184a.p189o.InterfaceC2127i
            /* renamed from: a */
            public final Object mo24a(Object obj) {
                C1671g0 c1671g0 = (C1671g0) obj;
                int i = C1314w0.f4527W;
                return new C1282g0(c1671g0.f5159n, c1671g0.f4706b);
            }
        }).m145t().m159e(new InterfaceC2123e() { // from class: c.b.i0.p.b2.c0
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                arrayAdapter.add((C1282g0) obj);
            }
        });
        this.f4529Y.setAdapter((SpinnerAdapter) arrayAdapter);
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: q0 */
    public void mo1080q0(View view, Bundle bundle) {
        this.f4529Y.setOnItemSelectedListener(this.f4534d0);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.words_recycler_view);
        this.f4533c0 = recyclerView;
        recyclerView.setHasFixedSize(false);
        int integer = m1843z().getInteger(R.integer.words_editor_columns_count);
        if (integer <= 1) {
            this.f4533c0.setLayoutManager(new LinearLayoutManager(m1872h()));
            return;
        }
        this.f4533c0.m3162g(new C1304r0(m1872h()));
        this.f4533c0.setLayoutManager(new GridLayoutManager(m1872h(), integer));
    }

    @InterfaceC2302a(892342)
    public void restoreFromStorage() {
        this.f4530Z.mo35e();
        this.f4530Z = new C2111b();
        if (AbstractC1077v0.m1275d(this, 892342)) {
            this.f4530Z.mo117c(AbstractC1077v0.m1272g(new C0561b(new C1158f(), new C1514k(m1866k())), m1872h(), R.layout.progress_window).m163P(AbstractC1216c.f4391a).m172F(new InterfaceC2127i() { // from class: c.b.i0.p.b2.y
                @Override // p183e.p184a.p189o.InterfaceC2127i
                /* renamed from: a */
                public final Object mo24a(Object obj) {
                    C1314w0 c1314w0 = C1314w0.this;
                    C0561b c0561b = (C0561b) obj;
                    c1314w0.getClass();
                    Context m1911B0 = c1314w0.m1911B0();
                    C1450g c1450g = AnyApplication.f6979b;
                    C1155c m1163a = ((C1158f) c0561b.f2654a).m1163a(new File(m1911B0.getExternalFilesDir(null), "UserWords.xml"));
                    C1514k c1514k = (C1514k) c0561b.f2655b;
                    c1514k.getClass();
                    AbstractC1438d.m1040j(AbstractC2094b.m174D(m1163a.m1165c()), new C1510g(c1514k), C1507d.f4867b, AbstractC2146l.f7038c);
                    return Boolean.TRUE;
                }
            }).m171G(AbstractC1216c.f4392b).m164N(new InterfaceC2123e() { // from class: c.b.i0.p.b2.l
                @Override // p183e.p184a.p189o.InterfaceC2123e
                public final void accept(Object obj) {
                    Boolean bool = (Boolean) obj;
                    C1314w0.this.f4528X.m20b(20, null);
                }
            }, new InterfaceC2123e() { // from class: c.b.i0.p.b2.t
                @Override // p183e.p184a.p189o.InterfaceC2123e
                public final void accept(Object obj) {
                    C1314w0.this.f4528X.m20b(21, ((Throwable) obj).getMessage());
                }
            }, new C1272b0(this), AbstractC2146l.f7039d));
        }
    }
}