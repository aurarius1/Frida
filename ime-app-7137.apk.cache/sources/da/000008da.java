package com.anysoftkeyboard.p180ui.settings;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.menny.android.anysoftkeyboard.R;
import p010b.p016c.p017k.AbstractC0091c;
import p010b.p016c.p017k.C0096d1;
import p010b.p016c.p026q.C0215a4;
import p010b.p067m.p068d.AbstractActivityC0681d0;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p097b.p108i0.p110p.C1344k1;
import p093c.p097b.p108i0.p110p.C1347l1;
import p093c.p097b.p108i0.p110p.C1365r1;
import p093c.p097b.p108i0.p110p.C1387z;
import p204f.p205a.p206a.p207a.p208c.AbstractC2289b;

/* renamed from: com.anysoftkeyboard.ui.settings.MainSettingsActivity */
/* loaded from: classes.dex */
public class MainSettingsActivity extends BasicAnyActivity {

    /* renamed from: q */
    public CharSequence f6603q;

    /* renamed from: r */
    public BottomNavigationView f6604r;

    public MainSettingsActivity() {
        String str = "a new MainSettingsActivity " + this;
    }

    /* renamed from: y */
    public static void m369y(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z, CharSequence charSequence) {
        AbstractActivityC0681d0 m1913A0 = abstractComponentCallbacksC0763z.m1913A0();
        if (m1913A0.m2102l() == abstractComponentCallbacksC0763z.m1853u()) {
            m1913A0.setTitle(charSequence);
        }
    }

    @Override // com.anysoftkeyboard.p180ui.settings.BasicAnyActivity, p010b.p067m.p068d.AbstractActivityC0681d0, p010b.p011a.AbstractActivityC0057g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6603q = getTitle();
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        this.f6604r = bottomNavigationView;
        bottomNavigationView.setOnNavigationItemSelectedListener(new C1387z(this));
    }

    @Override // com.anysoftkeyboard.p180ui.settings.BasicAnyActivity, p010b.p067m.p068d.AbstractActivityC0681d0, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m370x(intent);
    }

    @Override // com.anysoftkeyboard.p180ui.settings.BasicAnyActivity, p010b.p016c.p017k.AbstractActivityC0127t, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m370x(getIntent());
        Intent intent = getIntent();
        if (intent != null && "ACTION_REQUEST_PERMISSION_ACTIVITY".equals(intent.getAction()) && intent.hasExtra("EXTRA_KEY_ACTION_REQUEST_PERMISSION_ACTIVITY")) {
            String stringExtra = intent.getStringExtra("EXTRA_KEY_ACTION_REQUEST_PERMISSION_ACTIVITY");
            intent.removeExtra("EXTRA_KEY_ACTION_REQUEST_PERMISSION_ACTIVITY");
            if (!stringExtra.equals("android.permission.READ_CONTACTS")) {
                throw new IllegalArgumentException(AbstractC1124a.m1190f("Unknown permission request ", stringExtra));
            }
            startContactsPermissionRequest();
        }
    }

    @Override // android.app.Activity
    public void setTitle(CharSequence charSequence) {
        this.f6603q = charSequence;
        AbstractC0091c m3025q = m3025q();
        CharSequence charSequence2 = this.f6603q;
        C0215a4 c0215a4 = (C0215a4) ((C0096d1) m3025q).f888g;
        c0215a4.f1465h = true;
        c0215a4.f1466i = charSequence2;
        if ((c0215a4.f1459b & 8) != 0) {
            c0215a4.f1458a.setTitle(charSequence2);
        }
    }

    @Override // com.anysoftkeyboard.p180ui.settings.BasicAnyActivity
    /* renamed from: u */
    public AbstractComponentCallbacksC0763z mo372u() {
        return new C1365r1();
    }

    @Override // com.anysoftkeyboard.p180ui.settings.BasicAnyActivity
    /* renamed from: v */
    public int mo371v() {
        return R.layout.main_ui;
    }

    /* renamed from: x */
    public final void m370x(Intent intent) {
        AbstractComponentCallbacksC0763z c1344k1;
        BottomNavigationView bottomNavigationView;
        int i;
        if (intent != null && "android.intent.action.VIEW".equals(intent.getAction()) && intent.hasExtra("shortcut_id")) {
            String stringExtra = intent.getStringExtra("shortcut_id");
            intent.removeExtra("shortcut_id");
            stringExtra.hashCode();
            stringExtra.hashCode();
            char c = 65535;
            switch (stringExtra.hashCode()) {
                case -1563948692:
                    if (stringExtra.equals("keyboards")) {
                        c = 0;
                        break;
                    }
                    break;
                case -874822710:
                    if (stringExtra.equals("themes")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1679387910:
                    if (stringExtra.equals("quick_keys")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1967475786:
                    if (stringExtra.equals("gestures")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    this.f6604r.setSelectedItemId(R.id.bottom_nav_language_button);
                    c1344k1 = new C1344k1();
                    m374t(c1344k1, AbstractC2289b.f7441b);
                    return;
                case 1:
                    this.f6604r.setSelectedItemId(R.id.bottom_nav_ui_button);
                    c1344k1 = new C1347l1();
                    m374t(c1344k1, AbstractC2289b.f7441b);
                    return;
                case 2:
                    bottomNavigationView = this.f6604r;
                    i = R.id.bottom_nav_quick_text_button;
                    bottomNavigationView.setSelectedItemId(i);
                    return;
                case 3:
                    bottomNavigationView = this.f6604r;
                    i = R.id.bottom_nav_gestures_button;
                    bottomNavigationView.setSelectedItemId(i);
                    return;
                default:
                    throw new IllegalArgumentException(AbstractC1124a.m1190f("Unknown app-shortcut ", stringExtra));
            }
        }
    }
}