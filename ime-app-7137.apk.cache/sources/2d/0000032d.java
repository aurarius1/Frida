package p010b.p067m.p068d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p011a.AbstractActivityC0057g;
import p010b.p011a.p012k.C0061a;
import p010b.p046j.p047d.InterfaceC0468c;
import p010b.p046j.p047d.InterfaceC0470d;
import p010b.p072o.C0784m;
import p010b.p072o.EnumC0777f;
import p010b.p072o.EnumC0778g;
import p010b.p075p.p076a.AbstractC0798a;

/* renamed from: b.m.d.d0 */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0681d0 extends AbstractActivityC0057g implements InterfaceC0468c, InterfaceC0470d {

    /* renamed from: i */
    public final C0717m0 f2933i;

    /* renamed from: j */
    public final C0784m f2934j;

    /* renamed from: k */
    public boolean f2935k;

    /* renamed from: l */
    public boolean f2936l;

    /* renamed from: m */
    public boolean f2937m;

    public AbstractActivityC0681d0() {
        C0677c0 c0677c0 = new C0677c0(this);
        AbstractC0022t.m3493h(c0677c0, "callbacks == null");
        this.f2933i = new C0717m0(c0677c0);
        this.f2934j = new C0784m(this);
        this.f2937m = true;
        this.f849e.f3912b.m1389b("android:support:fragments", new C0669a0(this));
        C0673b0 c0673b0 = new C0673b0(this);
        C0061a c0061a = this.f847c;
        if (c0061a.f858b != null) {
            c0673b0.mo2107a(c0061a.f858b);
        }
        c0061a.f857a.add(c0673b0);
    }

    /* renamed from: m */
    public static boolean m2101m(C0690f1 c0690f1, EnumC0778g enumC0778g) {
        EnumC0778g enumC0778g2 = EnumC0778g.STARTED;
        boolean z = false;
        for (AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z : c0690f1.f2969c.m1980i()) {
            if (abstractComponentCallbacksC0763z != null) {
                C0677c0 c0677c0 = abstractComponentCallbacksC0763z.f3249v;
                if ((c0677c0 == null ? null : c0677c0.f2927f) != null) {
                    z |= m2101m(abstractComponentCallbacksC0763z.m1868j(), enumC0778g);
                }
                C0699h2 c0699h2 = abstractComponentCallbacksC0763z.f3226S;
                if (c0699h2 != null) {
                    c0699h2.m2018c();
                    if (c0699h2.f3011c.f3283b.compareTo(enumC0778g2) >= 0) {
                        C0784m c0784m = abstractComponentCallbacksC0763z.f3226S.f3011c;
                        c0784m.m1822c("setCurrentState");
                        c0784m.m1819f(enumC0778g);
                        z = true;
                    }
                }
                if (abstractComponentCallbacksC0763z.f3225R.f3283b.compareTo(enumC0778g2) >= 0) {
                    C0784m c0784m2 = abstractComponentCallbacksC0763z.f3225R;
                    c0784m2.m1822c("setCurrentState");
                    c0784m2.m1819f(enumC0778g);
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f2935k);
        printWriter.print(" mResumed=");
        printWriter.print(this.f2936l);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2937m);
        if (getApplication() != null) {
            AbstractC0798a.m1800b(this).mo1798a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f2933i.f3058a.f2926e.m2096A(str, fileDescriptor, printWriter, strArr);
    }

    /* renamed from: l */
    public C0690f1 m2102l() {
        return this.f2933i.f3058a.f2926e;
    }

    @Deprecated
    /* renamed from: n */
    public void m2100n() {
    }

    @Deprecated
    /* renamed from: o */
    public void mo2099o() {
        invalidateOptionsMenu();
    }

    @Override // p010b.p011a.AbstractActivityC0057g, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f2933i.m2008a();
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2933i.m2008a();
        this.f2933i.f3058a.f2926e.m2046m(configuration);
    }

    @Override // p010b.p011a.AbstractActivityC0057g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2934j.m1821d(EnumC0777f.ON_CREATE);
        this.f2933i.f3058a.f2926e.m2042o();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            C0717m0 c0717m0 = this.f2933i;
            return onCreatePanelMenu | c0717m0.f3058a.f2926e.m2040p(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f2933i.f3058a.f2926e.f2972f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f2933i.f3058a.f2926e.m2038q();
        this.f2934j.m1821d(EnumC0777f.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f2933i.f3058a.f2926e.m2037r();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            if (i != 6) {
                return false;
            }
            return this.f2933i.f3058a.f2926e.m2044n(menuItem);
        }
        return this.f2933i.f3058a.f2926e.m2035t(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.f2933i.f3058a.f2926e.m2036s(z);
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f2933i.m2008a();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f2933i.f3058a.f2926e.m2034u(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f2936l = false;
        this.f2933i.f3058a.f2926e.m2030y(5);
        this.f2934j.m1821d(EnumC0777f.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.f2933i.f3058a.f2926e.m2032w(z);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f2934j.m1821d(EnumC0777f.ON_RESUME);
        C0690f1 c0690f1 = this.f2933i.f3058a.f2926e;
        c0690f1.f2957B = false;
        c0690f1.f2958C = false;
        c0690f1.f2965J.f3025h = false;
        c0690f1.m2030y(7);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return super.onPreparePanel(0, view, menu) | this.f2933i.f3058a.f2926e.m2031x(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    @Override // p010b.p011a.AbstractActivityC0057g, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f2933i.m2008a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.f2936l = true;
        this.f2933i.m2008a();
        this.f2933i.f3058a.f2926e.m2092E(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.f2937m = false;
        if (!this.f2935k) {
            this.f2935k = true;
            C0690f1 c0690f1 = this.f2933i.f3058a.f2926e;
            c0690f1.f2957B = false;
            c0690f1.f2958C = false;
            c0690f1.f2965J.f3025h = false;
            c0690f1.m2030y(4);
        }
        this.f2933i.m2008a();
        this.f2933i.f3058a.f2926e.m2092E(true);
        this.f2934j.m1821d(EnumC0777f.ON_START);
        C0690f1 c0690f12 = this.f2933i.f3058a.f2926e;
        c0690f12.f2957B = false;
        c0690f12.f2958C = false;
        c0690f12.f2965J.f3025h = false;
        c0690f12.m2030y(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f2933i.m2008a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f2937m = true;
        do {
        } while (m2101m(m2102l(), EnumC0778g.CREATED));
        C0690f1 c0690f1 = this.f2933i.f3058a.f2926e;
        c0690f1.f2958C = true;
        c0690f1.f2965J.f3025h = true;
        c0690f1.m2030y(4);
        this.f2934j.m1821d(EnumC0777f.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f2933i.f3058a.f2926e.f2972f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}