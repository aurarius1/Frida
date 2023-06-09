package p093c.p145g.p146a.p147a.p166r;

import android.view.MenuItem;
import com.anysoftkeyboard.p180ui.settings.MainSettingsActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.menny.android.anysoftkeyboard.R;
import p010b.p016c.p024p.p025m.C0199p;
import p010b.p016c.p024p.p025m.InterfaceC0197n;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p097b.p102d0.p103k.C1201h;
import p093c.p097b.p108i0.p110p.C1341j1;
import p093c.p097b.p108i0.p110p.C1365r1;
import p093c.p097b.p108i0.p110p.C1387z;
import p093c.p097b.p108i0.p110p.View$OnClickListenerC1353n1;
import p093c.p097b.p108i0.p110p.View$OnClickListenerC1386y1;
import p204f.p205a.p206a.p207a.p208c.AbstractC2289b;

/* renamed from: c.g.a.a.r.h */
/* loaded from: classes.dex */
public class C1973h implements InterfaceC0197n {

    /* renamed from: b */
    public final /* synthetic */ BottomNavigationView f6001b;

    public C1973h(BottomNavigationView bottomNavigationView) {
        this.f6001b = bottomNavigationView;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0197n
    /* renamed from: a */
    public boolean mo639a(C0199p c0199p, MenuItem menuItem) {
        AbstractComponentCallbacksC0763z c1341j1;
        if (this.f6001b.f6687i != null && menuItem.getItemId() == this.f6001b.getSelectedItemId()) {
            this.f6001b.f6687i.m637a(menuItem);
            return true;
        }
        InterfaceC1976k interfaceC1976k = this.f6001b.f6686h;
        if (interfaceC1976k != null) {
            MainSettingsActivity mainSettingsActivity = ((C1387z) interfaceC1976k).f4616a;
            mainSettingsActivity.getClass();
            switch (menuItem.getItemId()) {
                case R.id.bottom_nav_gestures_button /* 2131296374 */:
                    c1341j1 = new C1341j1();
                    break;
                case R.id.bottom_nav_home_button /* 2131296375 */:
                    mainSettingsActivity.m374t(new C1365r1(), AbstractC2289b.f7440a);
                    return false;
                case R.id.bottom_nav_language_button /* 2131296376 */:
                    c1341j1 = new View$OnClickListenerC1353n1();
                    break;
                case R.id.bottom_nav_quick_text_button /* 2131296377 */:
                    c1341j1 = new C1201h();
                    break;
                case R.id.bottom_nav_ui_button /* 2131296378 */:
                    c1341j1 = new View$OnClickListenerC1386y1();
                    break;
                default:
                    StringBuilder m1187i = AbstractC1124a.m1187i("Failed to handle ");
                    m1187i.append(menuItem.getItemId());
                    m1187i.append(" in mBottomNavigationView.setOnNavigationItemSelectedListener");
                    throw new IllegalArgumentException(m1187i.toString());
            }
            mainSettingsActivity.m374t(c1341j1, AbstractC2289b.f7440a);
            return false;
        }
        return false;
    }

    @Override // p010b.p016c.p024p.p025m.InterfaceC0197n
    /* renamed from: b */
    public void mo638b(C0199p c0199p) {
    }
}