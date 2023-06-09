package p010b.p046j.p061m;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: b.j.m.h */
/* loaded from: classes.dex */
public class ActionMode$CallbackC0645h implements ActionMode.Callback {

    /* renamed from: a */
    public final ActionMode.Callback f2839a;

    /* renamed from: b */
    public final TextView f2840b;

    /* renamed from: c */
    public Class f2841c;

    /* renamed from: d */
    public Method f2842d;

    /* renamed from: e */
    public boolean f2843e;

    /* renamed from: f */
    public boolean f2844f = false;

    public ActionMode$CallbackC0645h(ActionMode.Callback callback, TextView textView) {
        this.f2839a = callback;
        this.f2840b = textView;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f2839a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f2839a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
        this.f2839a.onDestroyActionMode(actionMode);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x009f A[SYNTHETIC] */
    @Override // android.view.ActionMode.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        boolean z;
        String str;
        Context context = this.f2840b.getContext();
        PackageManager packageManager = context.getPackageManager();
        if (!this.f2844f) {
            this.f2844f = true;
            try {
                Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.f2841c = cls;
                this.f2842d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                this.f2843e = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.f2841c = null;
                this.f2842d = null;
                this.f2843e = false;
            }
        }
        try {
            Method declaredMethod = (this.f2843e && this.f2841c.isInstance(menu)) ? this.f2842d : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    declaredMethod.invoke(menu, Integer.valueOf(size));
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                    if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (!activityInfo.exported || ((str = activityInfo.permission) != null && context.checkSelfPermission(str) != 0)) {
                            z = false;
                            if (!z) {
                                arrayList.add(resolveInfo);
                            }
                        }
                    }
                    z = true;
                    if (!z) {
                    }
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i);
                MenuItem add = menu.add(0, 0, i + 100, resolveInfo2.loadLabel(packageManager));
                TextView textView = this.f2840b;
                Intent putExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()));
                ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                add.setIntent(putExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.f2839a.onPrepareActionMode(actionMode, menu);
    }
}