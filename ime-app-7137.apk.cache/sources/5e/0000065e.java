package p093c.p097b.p122u;

import android.text.TextUtils;

/* renamed from: c.b.u.t */
/* loaded from: classes.dex */
public class C1498t implements InterfaceC1515w {

    /* renamed from: a */
    public int f4841a = 0;

    /* renamed from: b */
    public final /* synthetic */ AbstractC1531x f4842b;

    public C1498t(AbstractC1531x abstractC1531x) {
        this.f4842b = abstractC1531x;
    }

    @Override // p093c.p097b.p122u.InterfaceC1515w
    /* renamed from: a */
    public boolean mo979a(String str, int i) {
        if (!TextUtils.isEmpty(str) && i > 0) {
            this.f4842b.mo966p(str, i);
        }
        int i2 = this.f4841a + 1;
        this.f4841a = i2;
        AbstractC1531x abstractC1531x = this.f4842b;
        return i2 < abstractC1531x.f4898h && !abstractC1531x.m953i();
    }
}