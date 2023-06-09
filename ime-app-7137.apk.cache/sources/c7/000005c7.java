package p093c.p097b.p108i0.p110p;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.anysoftkeyboard.keyboards.views.DemoAnyKeyboardView;
import com.anysoftkeyboard.p180ui.settings.BasicAnyActivity;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import p010b.p046j.p047d.AbstractC0472e;
import p010b.p067m.p068d.AbstractActivityC0681d0;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p097b.p099b0.C1138a;
import p093c.p097b.p099b0.C1144g;
import p093c.p097b.p107h0.C1237f;
import p093c.p097b.p116p.AbstractC1427e;
import p093c.p097b.p116p.AbstractC1432j;
import p093c.p097b.p130z.AbstractC1762t;
import p093c.p097b.p130z.C1671g0;
import p093c.p137d.p138a.p139a.C1785g;
import p093c.p137d.p138a.p139a.InterfaceC1781c;
import p204f.p205a.p206a.p207a.p208c.AbstractC2289b;

/* renamed from: c.b.i0.p.l1 */
/* loaded from: classes.dex */
public class C1347l1 extends AbstractC1268b1 {

    /* renamed from: i0 */
    public static final /* synthetic */ int f4564i0 = 0;

    /* renamed from: j0 */
    public TextView f4565j0;

    /* renamed from: k0 */
    public InterfaceC1781c f4566k0;

    /* renamed from: l0 */
    public DemoAnyKeyboardView f4567l0;

    /* renamed from: m0 */
    public C1138a f4568m0;

    public C1347l1() {
        super("KeyboardThemeSelectorFragment", R.string.keyboard_theme_list_title, true, false, true, 0);
        this.f4568m0 = new C1138a();
    }

    @Override // p093c.p097b.p108i0.p110p.AbstractC1268b1
    /* renamed from: Q0 */
    public void mo1121Q0(AbstractC1427e abstractC1427e, DemoAnyKeyboardView demoAnyKeyboardView) {
        demoAnyKeyboardView.setKeyboardTheme((C1237f) abstractC1427e);
        this.f4567l0.setThemeOverlay(this.f4568m0);
        AbstractC1762t m922b = ((C1671g0) AnyApplication.m191k(m1866k()).m1058f()).m922b(1);
        m922b.mo837i(demoAnyKeyboardView.getThemedKeyboardDimens());
        demoAnyKeyboardView.m416C(m922b, null, null);
    }

    @Override // p093c.p097b.p108i0.p110p.AbstractC1268b1
    /* renamed from: R0 */
    public AbstractC1432j mo1120R0() {
        return AnyApplication.m190l(m1866k());
    }

    @Override // p093c.p097b.p108i0.p110p.AbstractC1268b1
    /* renamed from: S0 */
    public String mo1119S0() {
        return "theme";
    }

    @Override // p093c.p097b.p108i0.p110p.AbstractC1268b1
    /* renamed from: T0 */
    public int mo1118T0() {
        return R.string.search_market_for_keyboard_addons;
    }

    @Override // p093c.p097b.p108i0.p110p.AbstractC1268b1
    /* renamed from: U0 */
    public void mo1117U0() {
        AbstractActivityC0681d0 m1872h = m1872h();
        if (m1872h instanceof BasicAnyActivity) {
            ((BasicAnyActivity) m1872h).m374t(new C1350m1(), AbstractC2289b.f7441b);
        }
    }

    @Override // p093c.p097b.p108i0.p110p.AbstractC1268b1, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: q0 */
    public void mo1080q0(View view, Bundle bundle) {
        super.mo1080q0(view, bundle);
        this.f4567l0 = (DemoAnyKeyboardView) view.findViewById(R.id.demo_keyboard_view);
        this.f4566k0 = AnyApplication.m182t(m1866k()).m1172a(R.string.settings_key_apply_remote_app_colors, R.bool.settings_default_apply_remote_app_colors);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.demo_keyboard_view_background);
        View inflate = m1858r().inflate(R.layout.prefs_adapt_theme_to_remote_app, viewGroup, false);
        viewGroup.addView(inflate);
        this.f4565j0 = (TextView) inflate.findViewById(R.id.apply_overlay_summary);
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.apply_overlay);
        if (!C1144g.f4258a) {
            this.f4565j0.setVisibility(8);
            checkBox.setVisibility(8);
        }
        final View findViewById = inflate.findViewById(R.id.overlay_demo_apps_root);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: c.b.i0.p.l
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C1347l1 c1347l1 = C1347l1.this;
                View view2 = findViewById;
                c1347l1.getClass();
                boolean z2 = z & C1144g.f4258a;
                ((C1785g) c1347l1.f4566k0).m808c(Boolean.valueOf(z2));
                c1347l1.f4565j0.setText(z2 ? R.string.apply_overlay_summary_on : R.string.apply_overlay_summary_off);
                view2.setVisibility(z2 ? 0 : 8);
                if (z2) {
                    return;
                }
                C1138a c1138a = new C1138a();
                c1347l1.f4568m0 = c1138a;
                c1347l1.f4567l0.setThemeOverlay(c1138a);
            }
        });
        checkBox.setChecked(((Boolean) ((C1785g) this.f4566k0).m809b()).booleanValue());
        findViewById.findViewById(R.id.theme_app_demo_phone).setOnClickListener(new View.OnClickListener() { // from class: c.b.i0.p.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i;
                int i2;
                C1347l1 c1347l1 = C1347l1.this;
                int i3 = C1347l1.f4564i0;
                c1347l1.getClass();
                int id = view2.getId();
                int i4 = R.color.overlay_demo_app_whatsapp_primary_text;
                int i5 = R.color.overlay_demo_app_twitter_primary_text;
                switch (id) {
                    case R.id.theme_app_demo_gmail /* 2131296797 */:
                        i = R.color.overlay_demo_app_gmail_primary_background;
                        i2 = R.color.overlay_demo_app_gmail_secondary_background;
                        i4 = R.color.overlay_demo_app_gmail_primary_text;
                        i5 = R.color.overlay_demo_app_gmail_primary_text;
                        break;
                    case R.id.theme_app_demo_phone /* 2131296798 */:
                        i = R.color.overlay_demo_app_phone_primary_background;
                        i2 = R.color.overlay_demo_app_phone_secondary_background;
                        i4 = R.color.overlay_demo_app_phone_primary_text;
                        i5 = R.color.overlay_demo_app_phone_primary_text;
                        break;
                    case R.id.theme_app_demo_twitter /* 2131296799 */:
                        i = R.color.overlay_demo_app_twitter_primary_background;
                        i2 = R.color.overlay_demo_app_twitter_secondary_background;
                        i4 = R.color.overlay_demo_app_twitter_primary_text;
                        break;
                    case R.id.theme_app_demo_whatsapp /* 2131296800 */:
                        i = R.color.overlay_demo_app_whatsapp_primary_background;
                        i2 = R.color.overlay_demo_app_whatsapp_secondary_background;
                        i5 = R.color.overlay_demo_app_whatsapp_primary_text;
                        break;
                    default:
                        StringBuilder m1187i = AbstractC1124a.m1187i("Unknown demo app view ID ");
                        m1187i.append(view2.getId());
                        throw new IllegalArgumentException(m1187i.toString());
                }
                AbstractActivityC0681d0 m1872h = c1347l1.m1872h();
                C1138a c1138a = new C1138a(AbstractC0472e.m2431b(m1872h, i), AbstractC0472e.m2431b(m1872h, i2), AbstractC0472e.m2431b(m1872h, i4), AbstractC0472e.m2431b(m1872h, i4), AbstractC0472e.m2431b(m1872h, i5));
                c1347l1.f4568m0 = c1138a;
                c1347l1.f4567l0.setThemeOverlay(c1138a);
            }
        });
        findViewById.findViewById(R.id.theme_app_demo_twitter).setOnClickListener(new View.OnClickListener() { // from class: c.b.i0.p.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i;
                int i2;
                C1347l1 c1347l1 = C1347l1.this;
                int i3 = C1347l1.f4564i0;
                c1347l1.getClass();
                int id = view2.getId();
                int i4 = R.color.overlay_demo_app_whatsapp_primary_text;
                int i5 = R.color.overlay_demo_app_twitter_primary_text;
                switch (id) {
                    case R.id.theme_app_demo_gmail /* 2131296797 */:
                        i = R.color.overlay_demo_app_gmail_primary_background;
                        i2 = R.color.overlay_demo_app_gmail_secondary_background;
                        i4 = R.color.overlay_demo_app_gmail_primary_text;
                        i5 = R.color.overlay_demo_app_gmail_primary_text;
                        break;
                    case R.id.theme_app_demo_phone /* 2131296798 */:
                        i = R.color.overlay_demo_app_phone_primary_background;
                        i2 = R.color.overlay_demo_app_phone_secondary_background;
                        i4 = R.color.overlay_demo_app_phone_primary_text;
                        i5 = R.color.overlay_demo_app_phone_primary_text;
                        break;
                    case R.id.theme_app_demo_twitter /* 2131296799 */:
                        i = R.color.overlay_demo_app_twitter_primary_background;
                        i2 = R.color.overlay_demo_app_twitter_secondary_background;
                        i4 = R.color.overlay_demo_app_twitter_primary_text;
                        break;
                    case R.id.theme_app_demo_whatsapp /* 2131296800 */:
                        i = R.color.overlay_demo_app_whatsapp_primary_background;
                        i2 = R.color.overlay_demo_app_whatsapp_secondary_background;
                        i5 = R.color.overlay_demo_app_whatsapp_primary_text;
                        break;
                    default:
                        StringBuilder m1187i = AbstractC1124a.m1187i("Unknown demo app view ID ");
                        m1187i.append(view2.getId());
                        throw new IllegalArgumentException(m1187i.toString());
                }
                AbstractActivityC0681d0 m1872h = c1347l1.m1872h();
                C1138a c1138a = new C1138a(AbstractC0472e.m2431b(m1872h, i), AbstractC0472e.m2431b(m1872h, i2), AbstractC0472e.m2431b(m1872h, i4), AbstractC0472e.m2431b(m1872h, i4), AbstractC0472e.m2431b(m1872h, i5));
                c1347l1.f4568m0 = c1138a;
                c1347l1.f4567l0.setThemeOverlay(c1138a);
            }
        });
        findViewById.findViewById(R.id.theme_app_demo_whatsapp).setOnClickListener(new View.OnClickListener() { // from class: c.b.i0.p.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i;
                int i2;
                C1347l1 c1347l1 = C1347l1.this;
                int i3 = C1347l1.f4564i0;
                c1347l1.getClass();
                int id = view2.getId();
                int i4 = R.color.overlay_demo_app_whatsapp_primary_text;
                int i5 = R.color.overlay_demo_app_twitter_primary_text;
                switch (id) {
                    case R.id.theme_app_demo_gmail /* 2131296797 */:
                        i = R.color.overlay_demo_app_gmail_primary_background;
                        i2 = R.color.overlay_demo_app_gmail_secondary_background;
                        i4 = R.color.overlay_demo_app_gmail_primary_text;
                        i5 = R.color.overlay_demo_app_gmail_primary_text;
                        break;
                    case R.id.theme_app_demo_phone /* 2131296798 */:
                        i = R.color.overlay_demo_app_phone_primary_background;
                        i2 = R.color.overlay_demo_app_phone_secondary_background;
                        i4 = R.color.overlay_demo_app_phone_primary_text;
                        i5 = R.color.overlay_demo_app_phone_primary_text;
                        break;
                    case R.id.theme_app_demo_twitter /* 2131296799 */:
                        i = R.color.overlay_demo_app_twitter_primary_background;
                        i2 = R.color.overlay_demo_app_twitter_secondary_background;
                        i4 = R.color.overlay_demo_app_twitter_primary_text;
                        break;
                    case R.id.theme_app_demo_whatsapp /* 2131296800 */:
                        i = R.color.overlay_demo_app_whatsapp_primary_background;
                        i2 = R.color.overlay_demo_app_whatsapp_secondary_background;
                        i5 = R.color.overlay_demo_app_whatsapp_primary_text;
                        break;
                    default:
                        StringBuilder m1187i = AbstractC1124a.m1187i("Unknown demo app view ID ");
                        m1187i.append(view2.getId());
                        throw new IllegalArgumentException(m1187i.toString());
                }
                AbstractActivityC0681d0 m1872h = c1347l1.m1872h();
                C1138a c1138a = new C1138a(AbstractC0472e.m2431b(m1872h, i), AbstractC0472e.m2431b(m1872h, i2), AbstractC0472e.m2431b(m1872h, i4), AbstractC0472e.m2431b(m1872h, i4), AbstractC0472e.m2431b(m1872h, i5));
                c1347l1.f4568m0 = c1138a;
                c1347l1.f4567l0.setThemeOverlay(c1138a);
            }
        });
        findViewById.findViewById(R.id.theme_app_demo_gmail).setOnClickListener(new View.OnClickListener() { // from class: c.b.i0.p.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i;
                int i2;
                C1347l1 c1347l1 = C1347l1.this;
                int i3 = C1347l1.f4564i0;
                c1347l1.getClass();
                int id = view2.getId();
                int i4 = R.color.overlay_demo_app_whatsapp_primary_text;
                int i5 = R.color.overlay_demo_app_twitter_primary_text;
                switch (id) {
                    case R.id.theme_app_demo_gmail /* 2131296797 */:
                        i = R.color.overlay_demo_app_gmail_primary_background;
                        i2 = R.color.overlay_demo_app_gmail_secondary_background;
                        i4 = R.color.overlay_demo_app_gmail_primary_text;
                        i5 = R.color.overlay_demo_app_gmail_primary_text;
                        break;
                    case R.id.theme_app_demo_phone /* 2131296798 */:
                        i = R.color.overlay_demo_app_phone_primary_background;
                        i2 = R.color.overlay_demo_app_phone_secondary_background;
                        i4 = R.color.overlay_demo_app_phone_primary_text;
                        i5 = R.color.overlay_demo_app_phone_primary_text;
                        break;
                    case R.id.theme_app_demo_twitter /* 2131296799 */:
                        i = R.color.overlay_demo_app_twitter_primary_background;
                        i2 = R.color.overlay_demo_app_twitter_secondary_background;
                        i4 = R.color.overlay_demo_app_twitter_primary_text;
                        break;
                    case R.id.theme_app_demo_whatsapp /* 2131296800 */:
                        i = R.color.overlay_demo_app_whatsapp_primary_background;
                        i2 = R.color.overlay_demo_app_whatsapp_secondary_background;
                        i5 = R.color.overlay_demo_app_whatsapp_primary_text;
                        break;
                    default:
                        StringBuilder m1187i = AbstractC1124a.m1187i("Unknown demo app view ID ");
                        m1187i.append(view2.getId());
                        throw new IllegalArgumentException(m1187i.toString());
                }
                AbstractActivityC0681d0 m1872h = c1347l1.m1872h();
                C1138a c1138a = new C1138a(AbstractC0472e.m2431b(m1872h, i), AbstractC0472e.m2431b(m1872h, i2), AbstractC0472e.m2431b(m1872h, i4), AbstractC0472e.m2431b(m1872h, i4), AbstractC0472e.m2431b(m1872h, i5));
                c1347l1.f4568m0 = c1138a;
                c1347l1.f4567l0.setThemeOverlay(c1138a);
            }
        });
    }
}