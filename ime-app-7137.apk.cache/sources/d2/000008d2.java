package com.anysoftkeyboard.p180ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.anysoftkeyboard.p180ui.FileExplorerCreate;
import com.menny.android.anysoftkeyboard.R;
import java.io.File;
import p010b.p016c.p017k.AbstractActivityC0127t;
import p010b.p016c.p017k.C0119p;
import p010b.p046j.p057k.C0561b;
import p010b.p086w.AbstractC1077v0;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p097b.p100c0.C1161e;
import p093c.p097b.p100c0.C1165i;
import p093c.p097b.p100c0.C1168l;
import p093c.p097b.p100c0.C1179w;
import p093c.p097b.p105f0.AbstractC1216c;
import p093c.p097b.p108i0.p110p.C1365r1;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.p187m.C2111b;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p189o.InterfaceC2119a;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* renamed from: com.anysoftkeyboard.ui.FileExplorerCreate */
/* loaded from: classes.dex */
public class FileExplorerCreate extends AbstractActivityC0127t {

    /* renamed from: o */
    public static final /* synthetic */ int f6588o = 0;

    /* renamed from: p */
    public final C2111b f6589p = new C2111b();

    /* renamed from: q */
    public ListView f6590q;

    /* renamed from: r */
    public File f6591r;

    /* renamed from: s */
    public File f6592s;

    @Override // p010b.p011a.AbstractActivityC0057g, android.app.Activity
    public void onBackPressed() {
        if (this.f6591r.equals(this.f6592s)) {
            finish();
            return;
        }
        int lastIndexOf = this.f6591r.toString().lastIndexOf("/");
        setTitle(this.f6591r.toString().substring(0, lastIndexOf));
        File file = new File(this.f6591r.toString().substring(0, lastIndexOf));
        this.f6591r = file;
        m376v(file);
    }

    @Override // p010b.p067m.p068d.AbstractActivityC0681d0, p010b.p011a.AbstractActivityC0057g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.file_explorer_create_main_ui);
        final TextView textView = (TextView) findViewById(R.id.file_explorer_filename);
        this.f6590q = (ListView) findViewById(R.id.file_explorer_list_view);
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        this.f6592s = externalStorageDirectory;
        this.f6591r = externalStorageDirectory;
        setTitle(externalStorageDirectory.toString());
        m376v(this.f6592s);
        ((ImageButton) findViewById(R.id.file_explorer_filename_button)).setOnClickListener(new View.OnClickListener() { // from class: c.b.i0.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileExplorerCreate fileExplorerCreate = FileExplorerCreate.this;
                TextView textView2 = textView;
                fileExplorerCreate.getClass();
                if (textView2.length() <= 0) {
                    C0119p c0119p = new C0119p(fileExplorerCreate);
                    c0119p.m3062b(R.string.file_explorer_filename_empty);
                    c0119p.m3058f(17039370, null);
                    c0119p.m3063a().show();
                    return;
                }
                File file = new File(fileExplorerCreate.f6591r + "/" + textView2.getText().toString() + ".xml");
                if (file.exists()) {
                    fileExplorerCreate.m378t(file);
                    return;
                }
                fileExplorerCreate.f6589p.mo117c(fileExplorerCreate.m377u(file));
                fileExplorerCreate.finish();
            }
        });
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.file_explorer_create_menu, menu);
        return true;
    }

    @Override // p010b.p016c.p017k.AbstractActivityC0127t, p010b.p067m.p068d.AbstractActivityC0681d0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f6589p.mo35e();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.file_explorer_menu_add_folder /* 2131296487 */:
                new File(this.f6591r.toString() + "/askBackup").mkdirs();
                Context applicationContext = getApplicationContext();
                StringBuilder m1187i = AbstractC1124a.m1187i("Folder askBackup has been created at ");
                m1187i.append(this.f6591r.toString());
                Toast.makeText(applicationContext, m1187i.toString(), 1).show();
                break;
            case R.id.file_explorer_menu_refresh /* 2131296488 */:
                break;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
        m376v(this.f6591r);
        return true;
    }

    /* renamed from: t */
    public void m378t(final File file) {
        C0119p c0119p = new C0119p(this);
        c0119p.m3056h(R.string.file_explorer_alert_title);
        c0119p.m3062b(R.string.file_explorer_backup_alert_message);
        c0119p.m3058f(17039370, new DialogInterface.OnClickListener() { // from class: c.b.i0.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                FileExplorerCreate fileExplorerCreate = FileExplorerCreate.this;
                fileExplorerCreate.f6589p.mo117c(fileExplorerCreate.m377u(file));
                fileExplorerCreate.finish();
            }
        });
        c0119p.m3060d(17039360, null);
        c0119p.f1026a.f938c = 17301543;
        c0119p.m3055i();
    }

    /* renamed from: u */
    public InterfaceC2112c m377u(final File file) {
        return AbstractC1077v0.m1271h(new C0561b(C1365r1.f4586W, C1365r1.f4587X), this, getText(R.string.take_a_while_progress_message), R.layout.progress_window).m163P(AbstractC1216c.f4391a).m139z(new InterfaceC2127i() { // from class: c.b.i0.c
            @Override // p183e.p184a.p189o.InterfaceC2127i
            /* renamed from: a */
            public final Object mo24a(Object obj) {
                File file2 = file;
                int i = FileExplorerCreate.f6588o;
                return AbstractC1438d.m1047c((C0561b) obj, C1161e.f4284b, C1165i.f4289a, new C1168l(file2));
            }
        }, false).m171G(AbstractC1216c.f4392b).m164N(new InterfaceC2123e() { // from class: c.b.i0.a
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                int i = FileExplorerCreate.f6588o;
                ((C1179w) obj).f4308a.mo972c();
            }
        }, new InterfaceC2123e() { // from class: c.b.i0.g
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                FileExplorerCreate fileExplorerCreate = FileExplorerCreate.this;
                fileExplorerCreate.getClass();
                ((Throwable) obj).getMessage();
                Toast.makeText(fileExplorerCreate.getApplicationContext(), fileExplorerCreate.getString(R.string.file_explorer_backup_failed), 1).show();
            }
        }, new InterfaceC2119a() { // from class: c.b.i0.d
            @Override // p183e.p184a.p189o.InterfaceC2119a
            public final void run() {
                FileExplorerCreate fileExplorerCreate = FileExplorerCreate.this;
                File file2 = file;
                Context applicationContext = fileExplorerCreate.getApplicationContext();
                Toast.makeText(applicationContext, fileExplorerCreate.getString(R.string.file_explorer_backup_success) + file2, 1).show();
            }
        }, AbstractC2146l.f7039d);
    }

    /* renamed from: v */
    public void m376v(File file) {
        this.f6590q.setAdapter((ListAdapter) new ArrayAdapter(this, (int) R.layout.file_explorer_single_item, file.listFiles()));
        this.f6590q.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: c.b.i0.e
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                FileExplorerCreate fileExplorerCreate = FileExplorerCreate.this;
                Object itemAtPosition = fileExplorerCreate.f6590q.getItemAtPosition(i);
                if (new File(itemAtPosition.toString()).isDirectory()) {
                    fileExplorerCreate.f6591r = new File(itemAtPosition.toString());
                    fileExplorerCreate.setTitle(itemAtPosition.toString());
                    fileExplorerCreate.m376v(fileExplorerCreate.f6591r);
                } else if (new File(itemAtPosition.toString()).isFile()) {
                    fileExplorerCreate.m378t(new File(itemAtPosition.toString()));
                }
            }
        });
    }
}