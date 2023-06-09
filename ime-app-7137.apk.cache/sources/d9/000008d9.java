package com.anysoftkeyboard.p180ui.settings;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import com.menny.android.anysoftkeyboard.R;
import java.util.ArrayList;
import net.evendanan.chauffeur.lib.SimpleTransitionExperience;
import net.evendanan.chauffeur.lib.TransitionExperience;
import p010b.p016c.p017k.AbstractActivityC0127t;
import p010b.p046j.p047d.AbstractC0472e;
import p010b.p046j.p048e.p049b.AbstractC0505k;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;
import p010b.p067m.p068d.C0668a;
import p010b.p067m.p068d.C0682d1;
import p010b.p067m.p068d.C0690f1;
import p010b.p086w.AbstractC1077v0;
import p093c.p097b.p108i0.p110p.p113z1.C1391c;
import p210g.p211a.p212a.AbstractC2308g;
import p210g.p211a.p212a.C2307f;
import p210g.p211a.p212a.InterfaceC2302a;
import p210g.p211a.p212a.p213l.AbstractC2317e;

/* renamed from: com.anysoftkeyboard.ui.settings.BasicAnyActivity */
/* loaded from: classes.dex */
public class BasicAnyActivity extends AbstractActivityC0127t {

    /* renamed from: o */
    public static final /* synthetic */ int f6601o = 0;

    /* renamed from: p */
    public boolean f6602p = false;

    @Override // p010b.p011a.AbstractActivityC0057g, android.app.Activity
    public void onBackPressed() {
        this.f851g.m3089a();
        ArrayList arrayList = m2102l().f2970d;
        if ((arrayList != null ? arrayList.size() : 0) == 0) {
            finish();
        }
    }

    @Override // p010b.p067m.p068d.AbstractActivityC0681d0, p010b.p011a.AbstractActivityC0057g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(mo371v());
    }

    @Override // p010b.p067m.p068d.AbstractActivityC0681d0, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        m373w();
    }

    @Override // p010b.p016c.p017k.AbstractActivityC0127t, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        this.f6602p = true;
        if (bundle == null && (getIntent().getExtras() == null || !"FragmentChauffeurActivity_INTENT_FRAGMENT_ACTION".equals(getIntent().getAction()))) {
            C0690f1 m2102l = m2102l();
            m2102l.m2094C(new C0682d1(m2102l, "FragmentChauffeur_ROOT_FRAGMENT_TAG", -1, 1), false);
            C0668a c0668a = new C0668a(m2102l());
            c0668a.m2110n(R.id.main_ui_content, mo372u());
            c0668a.m2121c("FragmentChauffeur_ROOT_FRAGMENT_TAG");
            c0668a.m2119e();
        }
        int m2431b = AbstractC0472e.m2431b(this, R.color.app_accent);
        try {
            int identifier = getResources().getIdentifier("overscroll_glow", "drawable", "android");
            if (identifier != 0) {
                AbstractC0505k.m2402c(getResources(), identifier, getTheme()).setColorFilter(m2431b, PorterDuff.Mode.SRC_IN);
            }
            int identifier2 = getResources().getIdentifier("overscroll_edge", "drawable", "android");
            if (identifier2 != 0) {
                AbstractC0505k.m2402c(getResources(), identifier2, getTheme()).setColorFilter(m2431b, PorterDuff.Mode.SRC_IN);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p010b.p067m.p068d.AbstractActivityC0681d0, p010b.p011a.AbstractActivityC0057g, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        AbstractC1077v0.m1293K(i, strArr, iArr, this);
    }

    @Override // p010b.p016c.p017k.AbstractActivityC0127t, p010b.p067m.p068d.AbstractActivityC0681d0, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f6602p = true;
        m373w();
    }

    @Override // p010b.p016c.p017k.AbstractActivityC0127t, p010b.p067m.p068d.AbstractActivityC0681d0, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f6602p = false;
    }

    @InterfaceC2302a(892344)
    public void startContactsPermissionRequest() {
        String[] m1257v = AbstractC1077v0.m1257v(892344);
        if (AbstractC1077v0.m1254y(this, m1257v)) {
            return;
        }
        AbstractC2317e m12c = AbstractC2317e.m12c(this);
        String string = m12c.mo9b().getString(AbstractC1077v0.m1256w(892344));
        String string2 = m12c.mo9b().getString(R.string.allow_permission);
        if (string == null) {
            string = m12c.mo9b().getString(AbstractC2308g.rationale_ask);
        }
        AbstractC1077v0.m1286R(new C2307f(m12c, m1257v, 892344, string, string2 == null ? m12c.mo9b().getString(17039370) : string2, m12c.mo9b().getString(17039360), 2131886578, null));
    }

    /* renamed from: t */
    public void m374t(AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z, TransitionExperience transitionExperience) {
        if (this.f6602p) {
            transitionExperience.mo3i(this, abstractComponentCallbacksC0763z);
            C0668a c0668a = new C0668a(m2102l());
            SimpleTransitionExperience simpleTransitionExperience = (SimpleTransitionExperience) transitionExperience;
            int i = simpleTransitionExperience.f7474b;
            int i2 = simpleTransitionExperience.f7475c;
            int i3 = simpleTransitionExperience.f7476d;
            int i4 = simpleTransitionExperience.f7477e;
            c0668a.f2898b = i;
            c0668a.f2899c = i2;
            c0668a.f2900d = i3;
            c0668a.f2901e = i4;
            transitionExperience.mo4d(this, abstractComponentCallbacksC0763z, c0668a, R.id.main_ui_content);
            c0668a.m2119e();
        }
    }

    /* renamed from: u */
    public AbstractComponentCallbacksC0763z mo372u() {
        return new C1391c();
    }

    /* renamed from: v */
    public int mo371v() {
        return R.layout.initial_setup_main_ui;
    }

    /* renamed from: w */
    public final void m373w() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !"FragmentChauffeurActivity_INTENT_FRAGMENT_ACTION".equals(getIntent().getAction())) {
            return;
        }
        Object obj = extras.get("FragmentChauffeurActivity_KEY_FRAGMENT_CLASS_TO_ADD");
        if (obj instanceof Class) {
            Class cls = (Class) obj;
            extras.remove("FragmentChauffeurActivity_KEY_FRAGMENT_CLASS_TO_ADD");
            try {
                AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z = (AbstractComponentCallbacksC0763z) cls.newInstance();
                if (extras.containsKey("FragmentChauffeurActivity_KEY_FRAGMENT_ARGS_TO_ADD")) {
                    abstractComponentCallbacksC0763z.m1901G0(extras.getBundle("FragmentChauffeurActivity_KEY_FRAGMENT_ARGS_TO_ADD"));
                    extras.remove("FragmentChauffeurActivity_KEY_FRAGMENT_ARGS_TO_ADD");
                }
                TransitionExperience transitionExperience = (TransitionExperience) extras.getParcelable("FragmentChauffeurActivity_KEY_FRAGMENT_ANIMATION");
                if (transitionExperience != null) {
                    m374t(abstractComponentCallbacksC0763z, transitionExperience);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e2) {
                e2.printStackTrace();
            }
        }
    }
}