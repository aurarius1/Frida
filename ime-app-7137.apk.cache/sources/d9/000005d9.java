package p093c.p097b.p108i0.p110p;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.anysoftkeyboard.keyboards.views.DemoAnyKeyboardView;
import com.anysoftkeyboard.p180ui.FileExplorerCreate;
import com.anysoftkeyboard.p180ui.FileExplorerRestore;
import com.anysoftkeyboard.p180ui.settings.BasicAnyActivity;
import com.anysoftkeyboard.p180ui.settings.MainSettingsActivity;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import java.io.File;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import p010b.p016c.p017k.C0111l;
import p010b.p016c.p017k.C0119p;
import p010b.p046j.p057k.C0561b;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;
import p010b.p067m.p068d.C0668a;
import p010b.p082t.C0875i0;
import p010b.p086w.AbstractC1077v0;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p097b.p098a0.C1131f;
import p093c.p097b.p100c0.C1161e;
import p093c.p097b.p100c0.C1165i;
import p093c.p097b.p100c0.C1167k;
import p093c.p097b.p100c0.C1168l;
import p093c.p097b.p100c0.C1171o;
import p093c.p097b.p100c0.C1172p;
import p093c.p097b.p100c0.C1179w;
import p093c.p097b.p100c0.C1181y;
import p093c.p097b.p105f0.AbstractC1216c;
import p093c.p097b.p108i0.p114q.C1411e;
import p093c.p097b.p117q.AbstractC1438d;
import p093c.p097b.p121t.C1450g;
import p093c.p097b.p122u.C1475h0;
import p093c.p097b.p122u.p124v0.C1514k;
import p093c.p097b.p122u.p125w0.C1530o;
import p093c.p097b.p130z.AbstractC1762t;
import p093c.p097b.p130z.C1671g0;
import p183e.p184a.p187m.C2111b;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p189o.InterfaceC2119a;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p192b.AbstractC2146l;
import p204f.p205a.p206a.p207a.p208c.AbstractC2289b;
import p204f.p205a.p209b.C2296g;
import p204f.p205a.p209b.InterfaceC2294e;
import p210g.p211a.p212a.InterfaceC2302a;

/* renamed from: c.b.i0.p.r1 */
/* loaded from: classes.dex */
public class C1365r1 extends AbstractComponentCallbacksC0763z {

    /* renamed from: W */
    public static List f4586W;

    /* renamed from: X */
    public static Boolean[] f4587X;

    /* renamed from: Y */
    public static int f4588Y;

    /* renamed from: Z */
    public static int f4589Z;

    /* renamed from: c0 */
    public int f4592c0;

    /* renamed from: f0 */
    public DemoAnyKeyboardView f4595f0;

    /* renamed from: g0 */
    public C2296g f4596g0;

    /* renamed from: b0 */
    public final C2111b f4591b0 = new C2111b();

    /* renamed from: d0 */
    public AnimationDrawable f4593d0 = null;

    /* renamed from: e0 */
    public InterfaceC2112c f4594e0 = AbstractC1077v0.m1266m();

    /* renamed from: a0 */
    public final boolean f4590a0 = false;

    /* renamed from: R0 */
    public static void m1114R0(View view, int i, ClickableSpan clickableSpan, boolean z) {
        TextView textView = (TextView) view.findViewById(i);
        if (z) {
            ViewGroup viewGroup = (ViewGroup) view;
            viewGroup.removeView(textView);
            viewGroup.addView(textView);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textView.getText());
        spannableStringBuilder.clearSpans();
        spannableStringBuilder.setSpan(clickableSpan, 0, textView.getText().length(), 18);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableStringBuilder);
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: O */
    public void mo1116O(int i, int i2, Intent intent) {
        super.mo1116O(i, i2, intent);
        boolean z = true;
        if (i != 1 || i2 != -1 || intent == null || intent.getData() == null) {
            return;
        }
        m1911B0().getContentResolver().getType(intent.getData());
        try {
            File file = new File(intent.getData().getPath());
            if (this.f4592c0 != R.id.backup_prefs) {
                z = false;
            }
            m1115Q0(z, file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: Q0 */
    public final InterfaceC2112c m1115Q0(boolean z, final File file) {
        return AbstractC1077v0.m1271h(new C0561b(f4586W, f4587X), m1913A0(), m1902G(R.string.take_a_while_progress_message), R.layout.progress_window).m163P(AbstractC1216c.f4391a).m177A(z ? new InterfaceC2127i() { // from class: c.b.i0.p.m
            @Override // p183e.p184a.p189o.InterfaceC2127i
            /* renamed from: a */
            public final Object mo24a(Object obj) {
                File file2 = file;
                List list = C1365r1.f4586W;
                return AbstractC1438d.m1047c((C0561b) obj, C1161e.f4284b, C1165i.f4289a, new C1168l(file2));
            }
        } : new InterfaceC2127i() { // from class: c.b.i0.p.w
            @Override // p183e.p184a.p189o.InterfaceC2127i
            /* renamed from: a */
            public final Object mo24a(Object obj) {
                File file2 = file;
                List list = C1365r1.f4586W;
                return AbstractC1438d.m1047c((C0561b) obj, new C1167k(file2), C1172p.f4298a, C1171o.f4297a);
            }
        }, false, Integer.MAX_VALUE).m171G(AbstractC1216c.f4392b).m164N(new InterfaceC2123e() { // from class: c.b.i0.p.v
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                List list = C1365r1.f4586W;
                ((C1179w) obj).f4308a.mo972c();
            }
        }, new InterfaceC2123e() { // from class: c.b.i0.p.p
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                C1365r1 c1365r1 = C1365r1.this;
                Throwable th = (Throwable) obj;
                c1365r1.getClass();
                th.getMessage();
                c1365r1.f4596g0.m20b(C1365r1.f4589Z, th.getMessage());
            }
        }, new InterfaceC2119a() { // from class: c.b.i0.p.y
            @Override // p183e.p184a.p189o.InterfaceC2119a
            public final void run() {
                C1365r1 c1365r1 = C1365r1.this;
                c1365r1.f4596g0.m20b(C1365r1.f4588Y, file);
            }
        }, AbstractC2146l.f7039d);
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: W */
    public void mo1110W(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.main_fragment_menu, menu);
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: X */
    public View mo522X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.main_fragment, viewGroup, false);
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: Z */
    public void mo1096Z() {
        this.f3214G = true;
        this.f4595f0.mo411b();
        this.f4596g0.m21a();
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: g0 */
    public boolean mo1109g0(MenuItem menuItem) {
        AbstractComponentCallbacksC0763z view$OnClickListenerC1376v0;
        BasicAnyActivity basicAnyActivity = (BasicAnyActivity) m1913A0();
        switch (menuItem.getItemId()) {
            case R.id.about_menu_option /* 2131296276 */:
                view$OnClickListenerC1376v0 = new View$OnClickListenerC1376v0();
                break;
            case R.id.backup_prefs /* 2131296363 */:
                onBackupRequested();
                return true;
            case R.id.restore_prefs /* 2131296676 */:
                onRestoreRequested();
                return true;
            case R.id.tweaks_menu_option /* 2131296819 */:
                view$OnClickListenerC1376v0 = new C1368s1();
                break;
            default:
                return false;
        }
        basicAnyActivity.m374t(view$OnClickListenerC1376v0, AbstractC2289b.f7441b);
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
        MainSettingsActivity.m369y(this, m1908D(R.string.how_to_pointer_title));
        this.f3216I.findViewById(R.id.not_configured_click_here_root).setVisibility(AbstractC1077v0.m1298F(m1911B0().getApplicationContext()) ? 8 : 0);
        Context m1911B0 = m1911B0();
        C1450g c1450g = AnyApplication.f6979b;
        AbstractC1762t m922b = ((C1671g0) ((AnyApplication) m1911B0.getApplicationContext()).f6982e.m1058f()).m922b(1);
        m922b.mo837i(this.f4595f0.getThemedKeyboardDimens());
        this.f4595f0.m416C(m922b, null, null);
        this.f4595f0.setOnViewBitmapReadyListener(new C1372u(this));
        AnimationDrawable animationDrawable = this.f4593d0;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
    }

    @InterfaceC2302a(892343)
    public void onBackupRequested() {
        if (AbstractC1077v0.m1275d(this, 892343)) {
            this.f4596g0.m20b(R.id.backup_prefs, null);
        }
    }

    @InterfaceC2302a(892342)
    public void onRestoreRequested() {
        if (AbstractC1077v0.m1275d(this, 892342)) {
            this.f4596g0.m20b(R.id.restore_prefs, null);
        }
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: p0 */
    public void mo526p0() {
        this.f3214G = true;
        this.f4594e0.mo35e();
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: q0 */
    public void mo1080q0(View view, Bundle bundle) {
        this.f4596g0 = new C2296g(m1872h(), new InterfaceC2294e() { // from class: c.b.i0.p.n
            @Override // p204f.p205a.p209b.InterfaceC2294e
            /* renamed from: a */
            public final void mo23a(C0119p c0119p, final int i, Object obj) {
                String m1906E;
                int i2;
                final String str;
                final C1365r1 c1365r1 = C1365r1.this;
                List list = C1365r1.f4586W;
                c1365r1.getClass();
                if (i == 10) {
                    c0119p.m3056h(R.string.prefs_providers_operation_success);
                    m1906E = c1365r1.m1906E(R.string.prefs_providers_backed_up_to, obj);
                } else if (i == 11) {
                    c0119p.m3056h(R.string.prefs_providers_operation_failed);
                    m1906E = c1365r1.m1906E(R.string.prefs_providers_failed_backup_due_to, obj);
                } else if (i == 20) {
                    c0119p.m3056h(R.string.prefs_providers_operation_success);
                    m1906E = c1365r1.m1906E(R.string.prefs_providers_restored_to, obj);
                } else if (i != 21) {
                    if (i != R.id.backup_prefs && i != R.id.restore_prefs) {
                        throw new IllegalArgumentException(AbstractC1124a.m1192d("The option-id ", i, " is not supported here."));
                    }
                    c1365r1.f4592c0 = i;
                    if (i == R.id.backup_prefs) {
                        i2 = R.string.word_editor_action_backup_words;
                        c0119p.m3056h(R.string.pick_prefs_providers_to_backup);
                        C1365r1.f4588Y = 10;
                        C1365r1.f4589Z = 11;
                        str = "android.intent.action.CREATE_DOCUMENT";
                    } else if (i != R.id.restore_prefs) {
                        throw new IllegalArgumentException(AbstractC1124a.m1192d("The option-id ", i, " is not supported here."));
                    } else {
                        i2 = R.string.word_editor_action_restore_words;
                        c0119p.m3056h(R.string.pick_prefs_providers_to_restore);
                        C1365r1.f4588Y = 20;
                        C1365r1.f4589Z = 21;
                        str = "android.intent.action.GET_CONTENT";
                    }
                    Context m1911B0 = c1365r1.m1911B0();
                    List asList = Arrays.asList(new C1179w(new C1181y(C0875i0.m1746a(m1911B0)), R.string.shared_prefs_provider_name), new C1179w(new C1514k(m1911B0), R.string.user_dict_prefs_provider), new C1179w(new C1131f(m1911B0, C1475h0.m1009u(m1911B0)), R.string.next_word_dict_prefs_provider), new C1179w(new C1530o(m1911B0, "abbreviations.db"), R.string.abbreviation_dict_prefs_provider));
                    C1365r1.f4586W = asList;
                    CharSequence[] charSequenceArr = new CharSequence[asList.size()];
                    boolean[] zArr = new boolean[C1365r1.f4586W.size()];
                    C1365r1.f4587X = new Boolean[C1365r1.f4586W.size()];
                    for (int i3 = 0; i3 < C1365r1.f4586W.size(); i3++) {
                        Boolean[] boolArr = C1365r1.f4587X;
                        zArr[i3] = true;
                        boolArr[i3] = Boolean.TRUE;
                        charSequenceArr[i3] = c1365r1.m1902G(((C1179w) C1365r1.f4586W.get(i3)).f4309b);
                    }
                    DialogInterface$OnMultiChoiceClickListenerC1369t dialogInterface$OnMultiChoiceClickListenerC1369t = new DialogInterface.OnMultiChoiceClickListener() { // from class: c.b.i0.p.t
                        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4, boolean z) {
                            C1365r1.f4587X[i4] = Boolean.valueOf(z);
                        }
                    };
                    C0111l c0111l = c0119p.f1026a;
                    c0111l.f951p = charSequenceArr;
                    c0111l.f959x = dialogInterface$OnMultiChoiceClickListenerC1369t;
                    c0111l.f955t = zArr;
                    c0111l.f956u = true;
                    c0119p.m3060d(17039360, null);
                    c0119p.f1026a.f949n = true;
                    c0119p.m3058f(i2, new DialogInterface.OnClickListener() { // from class: c.b.i0.p.o
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            C1365r1 c1365r12 = C1365r1.this;
                            int i5 = i;
                            c1365r12.f4591b0.m132d();
                            C2111b c2111b = c1365r12.f4591b0;
                            boolean z = i5 == R.id.backup_prefs;
                            Context m1911B02 = c1365r12.m1911B0();
                            C1450g c1450g = AnyApplication.f6979b;
                            c2111b.mo117c(c1365r12.m1115Q0(z, new File(m1911B02.getExternalFilesDir(null), "AnySoftKeyboardPrefs.xml")));
                        }
                    });
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: c.b.i0.p.r
                        /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: android.content.Intent */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Boolean[], java.io.Serializable] */
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            C1365r1 c1365r12 = C1365r1.this;
                            String str2 = str;
                            int i5 = i;
                            c1365r12.getClass();
                            if (Build.VERSION.SDK_INT < 19) {
                                Intent intent = null;
                                if (i5 == R.id.backup_prefs) {
                                    intent = new Intent(c1365r12.m1866k(), FileExplorerCreate.class);
                                } else if (i5 == R.id.restore_prefs) {
                                    intent = new Intent(c1365r12.m1866k(), FileExplorerRestore.class);
                                }
                                c1365r12.m1887O0(intent);
                                return;
                            }
                            Intent intent2 = new Intent();
                            intent2.setType("text/xml");
                            if (c1365r12.f4592c0 == R.id.backup_prefs) {
                                intent2.putExtra("android.intent.extra.TITLE", "AnySoftKeyboardPrefs.xml");
                            }
                            intent2.setAction(str2);
                            intent2.putExtra("checked", (Serializable) C1365r1.f4587X);
                            try {
                                c1365r12.m1885P0(intent2, 1);
                            } catch (ActivityNotFoundException unused) {
                                Toast.makeText(c1365r12.m1911B0().getApplicationContext(), (int) R.string.toast_error_custom_path_backup, 1).show();
                            }
                        }
                    };
                    C0111l c0111l2 = c0119p.f1026a;
                    c0111l2.f947l = c0111l2.f936a.getText(R.string.word_editor_action_choose_path);
                    c0119p.f1026a.f948m = onClickListener;
                    return;
                } else {
                    c0119p.m3056h(R.string.prefs_providers_operation_failed);
                    m1906E = c1365r1.m1906E(R.string.prefs_providers_failed_restore_due_to, obj);
                }
                c0119p.f1026a.f942g = m1906E;
                c0119p.m3058f(17039370, null);
            }
        });
        if (bundle == null) {
            C0668a c0668a = new C0668a(m1868j());
            c0668a.m2110n(R.id.change_log_fragment, new C1411e());
            c0668a.m2119e();
        }
        view.findViewById(R.id.testing_build_message).setVisibility(this.f4590a0 ? 0 : 8);
        view.findViewById(R.id.beta_sign_up).setVisibility(this.f4590a0 ? 8 : 0);
        this.f4595f0 = (DemoAnyKeyboardView) view.findViewById(R.id.demo_keyboard_view);
        m1897I0(true);
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: r0 */
    public void mo1113r0(Bundle bundle) {
        this.f3214G = true;
        TextView textView = (TextView) this.f3216I.findViewById(R.id.not_configured_click_here);
        this.f4593d0 = textView.getVisibility() == 0 ? (AnimationDrawable) textView.getCompoundDrawables()[0] : null;
        String m1908D = m1908D(R.string.not_configured_with_click_here);
        String m1908D2 = m1908D(R.string.not_configured_with_just_click_here);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m1908D);
        int indexOf = m1908D.indexOf(m1908D2);
        int length = m1908D2.length();
        if (indexOf == -1) {
            length = m1908D.length();
            indexOf = 0;
        }
        spannableStringBuilder.setSpan(new C1359p1(this), indexOf, length + indexOf, 18);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableStringBuilder);
        m1114R0(this.f3216I, R.id.ask_social_link, new C1362q1(this), false);
    }
}