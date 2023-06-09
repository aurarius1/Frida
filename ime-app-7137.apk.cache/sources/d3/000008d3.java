package com.anysoftkeyboard.p180ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.anysoftkeyboard.p180ui.FileExplorerRestore;
import com.menny.android.anysoftkeyboard.R;
import java.io.File;
import p010b.p016c.p017k.AbstractActivityC0127t;
import p010b.p016c.p017k.C0119p;
import p010b.p046j.p057k.C0561b;
import p010b.p086w.AbstractC1077v0;
import p093c.p097b.p100c0.C1167k;
import p093c.p097b.p100c0.C1171o;
import p093c.p097b.p100c0.C1172p;
import p093c.p097b.p100c0.C1179w;
import p093c.p097b.p105f0.AbstractC1216c;
import p093c.p097b.p108i0.p110p.C1365r1;
import p093c.p097b.p117q.AbstractC1438d;
import p183e.p184a.p187m.C2111b;
import p183e.p184a.p189o.InterfaceC2119a;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* renamed from: com.anysoftkeyboard.ui.FileExplorerRestore */
/* loaded from: classes.dex */
public class FileExplorerRestore extends AbstractActivityC0127t {

    /* renamed from: o */
    public static final /* synthetic */ int f6593o = 0;

    /* renamed from: p */
    public final C2111b f6594p = new C2111b();

    /* renamed from: q */
    public ListView f6595q;

    /* renamed from: r */
    public File f6596r;

    /* renamed from: s */
    public File f6597s;

    @Override // p010b.p011a.AbstractActivityC0057g, android.app.Activity
    public void onBackPressed() {
        if (this.f6597s.equals(this.f6596r)) {
            finish();
            return;
        }
        int lastIndexOf = this.f6597s.toString().lastIndexOf("/");
        setTitle(this.f6597s.toString().substring(0, lastIndexOf));
        File file = new File(this.f6597s.toString().substring(0, lastIndexOf));
        this.f6597s = file;
        m375t(file);
    }

    @Override // p010b.p067m.p068d.AbstractActivityC0681d0, p010b.p011a.AbstractActivityC0057g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.file_explorer_restore_main_ui);
        this.f6595q = (ListView) findViewById(R.id.file_explorer_list_view);
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        this.f6596r = externalStorageDirectory;
        this.f6597s = externalStorageDirectory;
        setTitle(externalStorageDirectory.toString());
        m375t(this.f6596r);
    }

    @Override // p010b.p016c.p017k.AbstractActivityC0127t, p010b.p067m.p068d.AbstractActivityC0681d0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f6594p.mo35e();
    }

    /* renamed from: t */
    public void m375t(File file) {
        this.f6595q.setAdapter((ListAdapter) new ArrayAdapter(this, (int) R.layout.file_explorer_single_item, file.listFiles()));
        this.f6595q.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: c.b.i0.j
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                final FileExplorerRestore fileExplorerRestore = FileExplorerRestore.this;
                Object itemAtPosition = fileExplorerRestore.f6595q.getItemAtPosition(i);
                if (new File(itemAtPosition.toString()).isDirectory()) {
                    fileExplorerRestore.f6597s = new File(itemAtPosition.toString());
                    fileExplorerRestore.setTitle(itemAtPosition.toString());
                    fileExplorerRestore.m375t(fileExplorerRestore.f6597s);
                } else if (new File(itemAtPosition.toString()).isFile()) {
                    final File file2 = new File(itemAtPosition.toString());
                    C0119p c0119p = new C0119p(fileExplorerRestore);
                    c0119p.m3056h(R.string.file_explorer_alert_title);
                    c0119p.m3062b(R.string.file_explorer_restore_alert_message);
                    c0119p.m3058f(17039370, new DialogInterface.OnClickListener() { // from class: c.b.i0.i
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            final FileExplorerRestore fileExplorerRestore2 = FileExplorerRestore.this;
                            final File file3 = file2;
                            fileExplorerRestore2.f6594p.mo117c(AbstractC1077v0.m1271h(new C0561b(C1365r1.f4586W, C1365r1.f4587X), fileExplorerRestore2, fileExplorerRestore2.getText(R.string.take_a_while_progress_message), R.layout.progress_window).m163P(AbstractC1216c.f4391a).m139z(new InterfaceC2127i() { // from class: c.b.i0.h
                                @Override // p183e.p184a.p189o.InterfaceC2127i
                                /* renamed from: a */
                                public final Object mo24a(Object obj) {
                                    File file4 = file3;
                                    int i3 = FileExplorerRestore.f6593o;
                                    return AbstractC1438d.m1047c((C0561b) obj, new C1167k(file4), C1172p.f4298a, C1171o.f4297a);
                                }
                            }, false).m171G(AbstractC1216c.f4392b).m164N(new InterfaceC2123e() { // from class: c.b.i0.l
                                @Override // p183e.p184a.p189o.InterfaceC2123e
                                public final void accept(Object obj) {
                                    int i3 = FileExplorerRestore.f6593o;
                                    ((C1179w) obj).f4308a.mo972c();
                                }
                            }, new InterfaceC2123e() { // from class: c.b.i0.m
                                @Override // p183e.p184a.p189o.InterfaceC2123e
                                public final void accept(Object obj) {
                                    FileExplorerRestore fileExplorerRestore3 = FileExplorerRestore.this;
                                    fileExplorerRestore3.getClass();
                                    ((Throwable) obj).getMessage();
                                    Toast.makeText(fileExplorerRestore3.getApplicationContext(), fileExplorerRestore3.getString(R.string.file_explorer_restore_failed), 1).show();
                                }
                            }, new InterfaceC2119a() { // from class: c.b.i0.k
                                @Override // p183e.p184a.p189o.InterfaceC2119a
                                public final void run() {
                                    FileExplorerRestore fileExplorerRestore3 = FileExplorerRestore.this;
                                    File file4 = file3;
                                    Context applicationContext = fileExplorerRestore3.getApplicationContext();
                                    Toast.makeText(applicationContext, fileExplorerRestore3.getString(R.string.file_explorer_restore_success) + file4, 1).show();
                                }
                            }, AbstractC2146l.f7039d));
                            fileExplorerRestore2.finish();
                        }
                    });
                    c0119p.m3060d(17039360, null);
                    c0119p.f1026a.f938c = 17301543;
                    c0119p.m3055i();
                }
            }
        });
    }
}