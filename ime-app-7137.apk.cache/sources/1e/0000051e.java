package p093c.p097b.p100c0;

import android.content.Context;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import p010b.p086w.AbstractC1077v0;
import p093c.p137d.p138a.p139a.C1785g;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.p189o.InterfaceC2121c;
import p183e.p184a.p189o.InterfaceC2127i;

/* renamed from: c.b.c0.v */
/* loaded from: classes.dex */
public enum EnumC1178v {
    Full,
    Some,
    None;

    /* renamed from: a */
    public static AbstractC2094b m1160a(Context context) {
        return AbstractC2094b.m150o(AbstractC1077v0.m1294J(context, R.string.settings_key_power_save_mode_animation_control, R.bool.settings_default_true), ((C1785g) AnyApplication.m182t(context).m1170c(R.string.settings_key_tweak_animations_level, R.string.settings_default_tweak_animations_level)).f5459e.m172F(new InterfaceC2127i() { // from class: c.b.c0.b
            @Override // p183e.p184a.p189o.InterfaceC2127i
            /* renamed from: a */
            public final Object mo24a(Object obj) {
                String str = (String) obj;
                str.hashCode();
                return !str.equals("none") ? !str.equals("some") ? EnumC1178v.Full : EnumC1178v.Some : EnumC1178v.None;
            }
        }), new InterfaceC2121c() { // from class: c.b.c0.a
            @Override // p183e.p184a.p189o.InterfaceC2121c
            /* renamed from: a */
            public final Object mo127a(Object obj, Object obj2) {
                return ((Boolean) obj).booleanValue() ? EnumC1178v.None : (EnumC1178v) obj2;
            }
        });
    }
}