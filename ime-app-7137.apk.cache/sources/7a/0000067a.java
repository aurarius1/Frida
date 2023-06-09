package p093c.p097b.p122u.p125w0;

import android.content.Context;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import p093c.p137d.p138a.p139a.C1785g;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* renamed from: c.b.u.w0.k */
/* loaded from: classes.dex */
public class C1526k extends AbstractC1528m {

    /* renamed from: q */
    public final InterfaceC2112c f4887q;

    /* renamed from: r */
    public int f4888r;

    public C1526k(Context context, String str) {
        super("Auto", context, str);
        this.f4887q = ((C1785g) AnyApplication.m182t(context).m1170c(R.string.settings_key_auto_dictionary_threshold, R.string.settings_default_auto_dictionary_add_threshold)).f5459e.m172F(new InterfaceC2127i() { // from class: c.b.u.w0.i
            @Override // p183e.p184a.p189o.InterfaceC2127i
            /* renamed from: a */
            public final Object mo24a(Object obj) {
                return Integer.valueOf(Integer.parseInt((String) obj));
            }
        }).m164N(new InterfaceC2123e() { // from class: c.b.u.w0.a
            @Override // p183e.p184a.p189o.InterfaceC2123e
            public final void accept(Object obj) {
                C1526k c1526k = C1526k.this;
                c1526k.getClass();
                c1526k.f4888r = ((Integer) obj).intValue();
            }
        }, AbstractC2146l.f7040e, AbstractC2146l.f7038c, AbstractC2146l.f7039d);
    }

    @Override // p093c.p097b.p122u.p125w0.AbstractC1528m
    /* renamed from: D */
    public C1529n mo977D(String str) {
        return new C1529n(this.f4897g, "auto_dict_2.db", str);
    }

    @Override // p093c.p097b.p122u.AbstractC1531x, p093c.p097b.p122u.AbstractC1533z
    /* renamed from: j */
    public boolean mo498j(CharSequence charSequence) {
        return false;
    }

    @Override // p093c.p097b.p122u.AbstractC1531x, p093c.p097b.p122u.AbstractC1473g0
    /* renamed from: n */
    public boolean mo968n(String str, int i) {
        synchronized (this.f4907c) {
            if (m953i()) {
                return false;
            }
            int length = str.length();
            if (length >= 2 && length <= 32 && this.f4888r != -1) {
                int m957y = m957y(str);
                if (m957y >= 0) {
                    i += m957y;
                }
                if (i >= this.f4888r) {
                    mo967o(str);
                    return true;
                }
                super.mo968n(str, i);
                return false;
            }
            return false;
        }
    }

    @Override // p093c.p097b.p122u.p125w0.AbstractC1528m, p093c.p097b.p122u.AbstractC1531x
    /* renamed from: t */
    public void mo962t() {
        this.f4887q.mo35e();
        if (this.f4889o != null) {
            this.f4889o.close();
        }
        this.f4889o = null;
    }
}