package p093c.p097b.p122u;

import android.content.Context;
import com.anysoftkeyboard.dictionaries.GetWordsCallback;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import p093c.p097b.p098a0.C1130e;
import p093c.p097b.p122u.p123u0.C1501a;
import p093c.p097b.p122u.p125w0.C1527l;
import p093c.p137d.p138a.p139a.C1785g;

/* renamed from: c.b.u.s0 */
/* loaded from: classes.dex */
public class C1497s0 extends AbstractC1473g0 {

    /* renamed from: f */
    public final C1130e f4837f;

    /* renamed from: g */
    public final Context f4838g;

    /* renamed from: h */
    public final String f4839h;

    /* renamed from: i */
    public volatile AbstractC1531x f4840i;

    public C1497s0(Context context, String str) {
        super("UserDictionary");
        this.f4839h = str;
        this.f4838g = context;
        this.f4837f = new C1130e(context, str);
    }

    @Override // p093c.p097b.p122u.AbstractC1533z
    /* renamed from: f */
    public final void mo501f() {
        if (this.f4840i != null) {
            this.f4840i.m954e();
        }
        C1130e c1130e = this.f4837f;
        c1130e.f4234b.m1177b(c1130e.f4236d.values());
    }

    @Override // p093c.p097b.p122u.AbstractC1533z
    /* renamed from: g */
    public void mo500g(GetWordsCallback getWordsCallback) {
        this.f4840i.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // p093c.p097b.p122u.AbstractC1533z
    /* renamed from: h */
    public final void mo499h(InterfaceC1479j0 interfaceC1479j0, InterfaceC1532y interfaceC1532y) {
        if (this.f4840i != null) {
            this.f4840i.mo499h(interfaceC1479j0, interfaceC1532y);
        }
    }

    @Override // p093c.p097b.p122u.AbstractC1533z
    /* renamed from: j */
    public final boolean mo498j(CharSequence charSequence) {
        return this.f4840i != null && this.f4840i.mo498j(charSequence);
    }

    @Override // p093c.p097b.p122u.AbstractC1533z
    /* renamed from: k */
    public final void mo497k() {
        this.f4837f.m1185b();
        AbstractC1533z abstractC1533z = null;
        try {
            if (((Boolean) ((C1785g) AnyApplication.m182t(this.f4838g).m1172a(R.string.settings_key_always_use_fallback_user_dictionary, R.bool.settings_default_always_use_fallback_user_dictionary)).m809b()).booleanValue()) {
                throw new RuntimeException("User requested to always use fall-back user-dictionary.");
            }
            C1501a mo981p = mo981p(this.f4838g, this.f4839h);
            mo981p.m952l();
            this.f4840i = mo981p;
        } catch (Exception e) {
            e.getMessage();
            if (0 != 0) {
                try {
                    abstractC1533z.m954e();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            C1527l mo980q = mo980q(this.f4838g, this.f4839h);
            mo980q.m952l();
            this.f4840i = mo980q;
        }
    }

    @Override // p093c.p097b.p122u.AbstractC1473g0
    /* renamed from: n */
    public final boolean mo968n(String str, int i) {
        if (this.f4840i != null) {
            return this.f4840i.mo968n(str, i);
        }
        return false;
    }

    @Override // p093c.p097b.p122u.AbstractC1473g0
    /* renamed from: o */
    public final void mo967o(String str) {
        if (this.f4840i != null) {
            this.f4840i.mo967o(str);
        }
    }

    /* renamed from: p */
    public C1501a mo981p(Context context, String str) {
        return new C1501a(context, str);
    }

    /* renamed from: q */
    public C1527l mo980q(Context context, String str) {
        return new C1527l(context, str);
    }
}