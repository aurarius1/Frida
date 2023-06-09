package p093c.p097b.p108i0.p109o;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Debug;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.anysoftkeyboard.p180ui.settings.BasicAnyActivity;
import com.anysoftkeyboard.p180ui.settings.MainSettingsActivity;
import com.menny.android.anysoftkeyboard.R;
import java.io.File;
import java.io.IOException;
import p010b.p016c.p017k.C0111l;
import p010b.p016c.p017k.C0119p;
import p010b.p046j.p057k.C0561b;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;
import p010b.p086w.AbstractC1077v0;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p097b.p105f0.AbstractC1216c;
import p093c.p097b.p119s.p120b.AbstractC1442b;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p192b.AbstractC2146l;
import p204f.p205a.p206a.p207a.p208c.AbstractC2289b;
import p204f.p205a.p209b.C2296g;
import p204f.p205a.p209b.InterfaceC2294e;

@SuppressLint({"SetTextI18n"})
/* renamed from: c.b.i0.o.f */
/* loaded from: classes.dex */
public class View$OnClickListenerC1259f extends AbstractComponentCallbacksC0763z implements View.OnClickListener {

    /* renamed from: W */
    public static final /* synthetic */ int f4445W = 0;

    /* renamed from: X */
    public C2296g f4446X;

    /* renamed from: Y */
    public Button f4447Y;

    /* renamed from: Z */
    public View f4448Z;

    /* renamed from: a0 */
    public View f4449a0;

    /* renamed from: b0 */
    public InterfaceC2112c f4450b0 = AbstractC1077v0.m1266m();

    /* renamed from: Q0 */
    public final void m1143Q0(File file, String str, String str2) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("plain/text");
        intent.putExtra("android.intent.extra.SUBJECT", str);
        intent.putExtra("android.intent.extra.TEXT", str2);
        if (file != null) {
            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
        }
        try {
            Intent createChooser = Intent.createChooser(intent, "Share");
            createChooser.putExtra("android.intent.extra.SUBJECT", str);
            createChooser.putExtra("android.intent.extra.TEXT", str2);
            m1887O0(createChooser);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(m1872h().getApplicationContext(), "Unable to send bug report via e-mail!", 1).show();
        }
    }

    /* renamed from: R0 */
    public final void m1142R0() {
        Button button;
        String str;
        View view;
        if (AbstractC1260g.m1138d(m1872h().getApplicationContext())) {
            button = this.f4447Y;
            str = "Disable tracing";
        } else {
            button = this.f4447Y;
            str = "Enable tracing";
        }
        button.setText(str);
        boolean z = false;
        if (AbstractC1260g.f4452b) {
            this.f4448Z.setVisibility(0);
        } else {
            this.f4448Z.setVisibility(4);
        }
        if (AbstractC1260g.f4452b || !AbstractC1260g.m1139c().exists()) {
            view = this.f4449a0;
        } else {
            view = this.f4449a0;
            z = true;
        }
        view.setEnabled(z);
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: X */
    public View mo522X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.developer_tools, viewGroup, false);
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: Y */
    public void mo1098Y() {
        this.f4450b0.mo35e();
        this.f3214G = true;
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: o0 */
    public void mo527o0() {
        this.f3214G = true;
        m1142R0();
        MainSettingsActivity.m369y(this, m1908D(R.string.developer_tools));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C2296g c2296g;
        int i;
        switch (view.getId()) {
            case R.id.dev_flip_trace_file /* 2131296447 */:
                boolean z = !AbstractC1260g.m1138d(m1872h().getApplicationContext());
                SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(m1872h().getApplicationContext()).edit();
                edit.putBoolean("KEY_SDCARD_TRACING_ENABLED", z);
                edit.apply();
                m1142R0();
                if (z) {
                    c2296g = this.f4446X;
                    i = 123;
                } else if (!AbstractC1260g.f4452b) {
                    return;
                } else {
                    c2296g = this.f4446X;
                    i = 124;
                }
                c2296g.m20b(i, null);
                return;
            case R.id.dev_share_mem_file /* 2131296448 */:
                StringBuilder m1187i = AbstractC1124a.m1187i("Hi! Here is a memory dump file for ");
                m1187i.append(AbstractC1260g.m1141a(m1872h().getApplicationContext()));
                m1187i.append(AbstractC1260g.f4451a);
                m1187i.append(AbstractC1260g.m1140b(m1872h()));
                m1143Q0((File) view.getTag(), "AnySoftKeyboard Memory Dump File", m1187i.toString());
                return;
            case R.id.dev_share_trace_file /* 2131296449 */:
                File m1139c = AbstractC1260g.m1139c();
                StringBuilder m1187i2 = AbstractC1124a.m1187i("Hi! Here is a tracing file for ");
                m1187i2.append(AbstractC1260g.m1141a(m1872h().getApplicationContext()));
                m1187i2.append(AbstractC1260g.f4451a);
                m1187i2.append(AbstractC1260g.m1140b(m1872h()));
                m1143Q0(m1139c, "AnySoftKeyboard Trace File", m1187i2.toString());
                return;
            case R.id.memory_dump_button /* 2131296582 */:
                final Context applicationContext = m1872h().getApplicationContext();
                this.f4450b0.mo35e();
                this.f4450b0 = AbstractC1077v0.m1272g(this, m1872h(), R.layout.progress_window).m163P(AbstractC1216c.f4391a).m172F(new InterfaceC2127i() { // from class: c.b.i0.o.c
                    @Override // p183e.p184a.p189o.InterfaceC2127i
                    /* renamed from: a */
                    public final Object mo24a(Object obj) {
                        View$OnClickListenerC1259f view$OnClickListenerC1259f = (View$OnClickListenerC1259f) obj;
                        int i2 = View$OnClickListenerC1259f.f4445W;
                        String str = AbstractC1260g.f4451a;
                        File file = new File(Environment.getExternalStorageDirectory(), "ask_mem_dump.hprof");
                        if (!file.exists() || file.delete()) {
                            Debug.dumpHprofData(file.getAbsolutePath());
                            return new C0561b(view$OnClickListenerC1259f, file);
                        }
                        throw new IOException("Failed to delete " + file);
                    }
                }).m171G(AbstractC1216c.f4392b).m164N(new InterfaceC2123e() { // from class: c.b.i0.o.b
                    @Override // p183e.p184a.p189o.InterfaceC2123e
                    public final void accept(Object obj) {
                        View$OnClickListenerC1259f view$OnClickListenerC1259f = View$OnClickListenerC1259f.this;
                        Context context = applicationContext;
                        C0561b c0561b = (C0561b) obj;
                        view$OnClickListenerC1259f.getClass();
                        boolean z2 = true;
                        Toast.makeText(context, view$OnClickListenerC1259f.m1906E(R.string.created_mem_dump_file, ((File) c0561b.f2655b).getAbsolutePath()), 1).show();
                        View findViewById = ((View$OnClickListenerC1259f) c0561b.f2654a).f3216I.findViewById(R.id.dev_share_mem_file);
                        findViewById.setTag(c0561b.f2655b);
                        findViewById.setEnabled((((File) c0561b.f2655b).exists() && ((File) c0561b.f2655b).isFile()) ? false : false);
                    }
                }, new InterfaceC2123e() { // from class: c.b.i0.o.e
                    @Override // p183e.p184a.p189o.InterfaceC2123e
                    public final void accept(Object obj) {
                        View$OnClickListenerC1259f view$OnClickListenerC1259f = View$OnClickListenerC1259f.this;
                        Context context = applicationContext;
                        view$OnClickListenerC1259f.getClass();
                        Toast.makeText(context, view$OnClickListenerC1259f.m1906E(R.string.failed_to_create_mem_dump, ((Throwable) obj).getMessage()), 1).show();
                    }
                }, AbstractC2146l.f7038c, AbstractC2146l.f7039d);
                return;
            case R.id.share_logcat_button /* 2131296721 */:
                StringBuilder m1187i3 = AbstractC1124a.m1187i("Hi! Here is a LogCat snippet for ");
                m1187i3.append(AbstractC1260g.m1141a(m1872h().getApplicationContext()));
                String str = AbstractC1260g.f4451a;
                m1187i3.append(str);
                m1187i3.append(AbstractC1260g.m1140b(m1872h()));
                m1187i3.append(str);
                m1187i3.append(AbstractC1442b.m1034a());
                m1143Q0(null, "AnySoftKeyboard LogCat", m1187i3.toString());
                return;
            case R.id.show_logcat_button /* 2131296726 */:
                ((BasicAnyActivity) m1872h()).m374t(new C1261h(), AbstractC2289b.f7441b);
                return;
            default:
                StringBuilder m1187i4 = AbstractC1124a.m1187i("Failed to handle ");
                m1187i4.append(view.getId());
                m1187i4.append(" in DeveloperToolsFragment");
                throw new IllegalArgumentException(m1187i4.toString());
        }
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: p0 */
    public void mo526p0() {
        this.f3214G = true;
        this.f4446X.m21a();
    }

    @Override // p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: q0 */
    public void mo1080q0(View view, Bundle bundle) {
        this.f4446X = new C2296g(m1872h(), new InterfaceC2294e() { // from class: c.b.i0.o.d
            @Override // p204f.p205a.p209b.InterfaceC2294e
            /* renamed from: a */
            public final void mo23a(C0119p c0119p, int i, Object obj) {
                StringBuilder m1187i;
                String str;
                String str2;
                View$OnClickListenerC1259f view$OnClickListenerC1259f = View$OnClickListenerC1259f.this;
                int i2 = View$OnClickListenerC1259f.f4445W;
                view$OnClickListenerC1259f.getClass();
                if (i == 123) {
                    C0111l c0111l = c0119p.f1026a;
                    c0111l.f938c = R.drawable.notification_icon_beta_version;
                    c0111l.f940e = "How to use Tracing";
                    m1187i = AbstractC1124a.m1187i("Tracing is now enabled, but not started!");
                    str = AbstractC1260g.f4451a;
                    m1187i.append(str);
                    m1187i.append("To start tracing, you'll need to restart AnySoftKeyboard. How? Either reboot your phone, or switch to another keyboard app (like the stock).");
                    m1187i.append(str);
                    str2 = "To stop tracing, first disable it, and then restart AnySoftKeyboard (as above).";
                } else if (i != 124) {
                    throw new IllegalArgumentException(AbstractC1124a.m1192d("Unknown option-id ", i, " for setupDialog"));
                } else {
                    C0111l c0111l2 = c0119p.f1026a;
                    c0111l2.f938c = R.drawable.notification_icon_beta_version;
                    c0111l2.f940e = "How to stop Tracing";
                    m1187i = AbstractC1124a.m1187i("Tracing is now disabled, but not ended!");
                    str = AbstractC1260g.f4451a;
                    m1187i.append(str);
                    str2 = "To end tracing (and to be able to send the file), you'll need to restart AnySoftKeyboard. How? Either reboot your phone (preferable), or switch to another keyboard app (like the stock).";
                }
                m1187i.append(str2);
                m1187i.append(str);
                m1187i.append("Thanks!!");
                String sb = m1187i.toString();
                C0111l c0111l3 = c0119p.f1026a;
                c0111l3.f942g = sb;
                c0111l3.f943h = "Got it!";
                c0111l3.f944i = null;
            }
        });
        ((TextView) view.findViewById(R.id.dev_title)).setText(AbstractC1260g.m1141a(m1872h().getApplicationContext()));
        this.f4447Y = (Button) view.findViewById(R.id.dev_flip_trace_file);
        this.f4448Z = view.findViewById(R.id.dev_tracing_running_progress_bar);
        this.f4449a0 = view.findViewById(R.id.dev_share_trace_file);
        view.findViewById(R.id.memory_dump_button).setOnClickListener(this);
        view.findViewById(R.id.dev_share_mem_file).setOnClickListener(this);
        view.findViewById(R.id.dev_flip_trace_file).setOnClickListener(this);
        view.findViewById(R.id.dev_share_trace_file).setOnClickListener(this);
        view.findViewById(R.id.show_logcat_button).setOnClickListener(this);
        view.findViewById(R.id.share_logcat_button).setOnClickListener(this);
        ((TextView) view.findViewById(R.id.actionDoneWithListener)).setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: c.b.i0.o.a
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                Context applicationContext = View$OnClickListenerC1259f.this.m1866k().getApplicationContext();
                Toast.makeText(applicationContext, "OnEditorActionListener i:" + i, 0).show();
                return true;
            }
        });
    }
}