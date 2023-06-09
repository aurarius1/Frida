package p010b.p011a;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ImmLeaksCleaner;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p011a.AbstractActivityC0057g;
import p010b.p011a.p012k.C0061a;
import p010b.p011a.p012k.InterfaceC0062b;
import p010b.p011a.p013l.InterfaceC0068f;
import p010b.p046j.p058l.AbstractC0608l;
import p010b.p046j.p058l.InterfaceC0606k;
import p010b.p072o.AbstractC0779h;
import p010b.p072o.C0784m;
import p010b.p072o.C0796y;
import p010b.p072o.EnumC0777f;
import p010b.p072o.EnumC0778g;
import p010b.p072o.FragmentC0792u;
import p010b.p072o.InterfaceC0780i;
import p010b.p072o.InterfaceC0782k;
import p010b.p072o.InterfaceC0797z;
import p010b.p072o.p073a0.AbstractC0771a;
import p010b.p072o.p074b0.AbstractC0773a;
import p010b.p085v.AbstractC1014a;
import p010b.p085v.C1018e;
import p010b.p085v.C1019f;
import p010b.p085v.InterfaceC1020g;

/* renamed from: b.a.g */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0057g extends Activity implements InterfaceC0782k, InterfaceC0797z, InterfaceC1020g, InterfaceC0060j, InterfaceC0068f, InterfaceC0606k {

    /* renamed from: b */
    public C0784m f846b = new C0784m(this);

    /* renamed from: c */
    public final C0061a f847c = new C0061a();

    /* renamed from: d */
    public final C0784m f848d;

    /* renamed from: e */
    public final C1019f f849e;

    /* renamed from: f */
    public C0796y f850f;

    /* renamed from: g */
    public final C0059i f851g;

    /* renamed from: h */
    public final C0055e f852h;

    public AbstractActivityC0057g() {
        C0784m c0784m = new C0784m(this);
        this.f848d = c0784m;
        this.f849e = new C1019f(this);
        this.f851g = new C0059i(new RunnableC0052b(this));
        new AtomicInteger();
        this.f852h = new C0055e(this);
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            c0784m.mo1824a(new InterfaceC0780i() { // from class: androidx.activity.ComponentActivity$3
                @Override // p010b.p072o.InterfaceC0780i
                /* renamed from: d */
                public void mo1827d(InterfaceC0782k interfaceC0782k, EnumC0777f enumC0777f) {
                    if (enumC0777f == EnumC0777f.ON_STOP) {
                        Window window = AbstractActivityC0057g.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
        }
        c0784m.mo1824a(new InterfaceC0780i() { // from class: androidx.activity.ComponentActivity$4
            @Override // p010b.p072o.InterfaceC0780i
            /* renamed from: d */
            public void mo1827d(InterfaceC0782k interfaceC0782k, EnumC0777f enumC0777f) {
                if (enumC0777f == EnumC0777f.ON_DESTROY) {
                    AbstractActivityC0057g.this.f847c.f858b = null;
                    if (AbstractActivityC0057g.this.isChangingConfigurations()) {
                        return;
                    }
                    AbstractActivityC0057g.this.mo1801e().m1802a();
                }
            }
        });
        c0784m.mo1824a(new InterfaceC0780i() { // from class: androidx.activity.ComponentActivity$5
            @Override // p010b.p072o.InterfaceC0780i
            /* renamed from: d */
            public void mo1827d(InterfaceC0782k interfaceC0782k, EnumC0777f enumC0777f) {
                AbstractActivityC0057g.this.m3091j();
                C0784m c0784m2 = AbstractActivityC0057g.this.f848d;
                c0784m2.m1822c("removeObserver");
                c0784m2.f3282a.mo2686e(this);
            }
        });
        if (19 > i || i > 23) {
            return;
        }
        c0784m.mo1824a(new ImmLeaksCleaner(this));
    }

    @Override // p010b.p046j.p058l.InterfaceC0606k
    /* renamed from: a */
    public boolean mo2231a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m3090k();
        super.addContentView(view, layoutParams);
    }

    @Override // p010b.p085v.InterfaceC1020g
    /* renamed from: b */
    public final C1018e mo1385b() {
        return this.f849e.f3912b;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !AbstractC0608l.m2229a(decorView, keyEvent)) {
            return AbstractC0608l.m2228b(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !AbstractC0608l.m2229a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // p010b.p072o.InterfaceC0797z
    /* renamed from: e */
    public C0796y mo1801e() {
        if (getApplication() != null) {
            m3091j();
            return this.f850f;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // p010b.p072o.InterfaceC0782k
    /* renamed from: g */
    public AbstractC0779h mo1826g() {
        return this.f848d;
    }

    /* renamed from: j */
    public void m3091j() {
        if (this.f850f == null) {
            C0056f c0056f = (C0056f) getLastNonConfigurationInstance();
            if (c0056f != null) {
                this.f850f = c0056f.f845a;
            }
            if (this.f850f == null) {
                this.f850f = new C0796y();
            }
        }
    }

    /* renamed from: k */
    public final void m3090k() {
        getWindow().getDecorView().setTag(AbstractC0771a.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(AbstractC0773a.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(AbstractC1014a.view_tree_saved_state_registry_owner, this);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f852h.m3098b(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f851g.m3089a();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f849e.m1387a(bundle);
        C0061a c0061a = this.f847c;
        c0061a.f858b = this;
        for (InterfaceC0062b interfaceC0062b : c0061a.f857a) {
            interfaceC0062b.mo2107a(this);
        }
        super.onCreate(bundle);
        FragmentC0792u.m1803c(this);
        C0055e c0055e = this.f852h;
        c0055e.getClass();
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                int size = stringArrayList.size();
                for (int i = 0; i < size; i++) {
                    c0055e.m3099a(integerArrayList.get(i).intValue(), stringArrayList.get(i));
                }
                c0055e.f840e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                c0055e.f836a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                c0055e.f843h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            }
        }
        FragmentC0792u.m1803c(this);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.f852h.m3098b(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0056f c0056f;
        C0796y c0796y = this.f850f;
        if (c0796y == null && (c0056f = (C0056f) getLastNonConfigurationInstance()) != null) {
            c0796y = c0056f.f845a;
        }
        if (c0796y == null) {
            return null;
        }
        C0056f c0056f2 = new C0056f();
        c0056f2.f845a = c0796y;
        return c0056f2;
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        EnumC0778g enumC0778g = EnumC0778g.CREATED;
        C0784m c0784m = this.f848d;
        if (c0784m instanceof C0784m) {
            c0784m.m1822c("setCurrentState");
            c0784m.m1819f(enumC0778g);
        }
        C0784m c0784m2 = this.f846b;
        c0784m2.m1822c("markState");
        c0784m2.m1822c("setCurrentState");
        c0784m2.m1819f(enumC0778g);
        super.onSaveInstanceState(bundle);
        this.f849e.m1386b(bundle);
        C0055e c0055e = this.f852h;
        c0055e.getClass();
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(c0055e.f837b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(c0055e.f837b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0055e.f840e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) c0055e.f843h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", c0055e.f836a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (p010b.p046j.p047d.AbstractC0472e.m2432a(r3, "android.permission.UPDATE_DEVICE_STATS") == 0) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void reportFullyDrawn() {
        try {
            if (AbstractC0022t.m3519O()) {
                String str = "reportFullyDrawn() for " + getComponentName();
                if (Build.VERSION.SDK_INT >= 18) {
                    Trace.beginSection(str);
                }
            }
            int i = Build.VERSION.SDK_INT;
            if (i <= 19) {
                if (i == 19) {
                }
                if (i < 18) {
                    Trace.endSection();
                    return;
                }
                return;
            }
            super.reportFullyDrawn();
            if (i < 18) {
            }
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT >= 18) {
                Trace.endSection();
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m3090k();
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        m3090k();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m3090k();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}