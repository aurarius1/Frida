package p093c.p097b.p122u.p124v0;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import p093c.p097b.p122u.InterfaceC1515w;
import p093c.p097b.p122u.p123u0.C1501a;

/* renamed from: c.b.u.v0.h */
/* loaded from: classes.dex */
public class C1511h extends C1501a {

    /* renamed from: q */
    public final InterfaceC1515w f4871q;

    public C1511h(Context context, String str, InterfaceC1515w interfaceC1515w) {
        super(context, str);
        this.f4871q = interfaceC1515w;
    }

    @Override // p093c.p097b.p122u.p123u0.C1501a, p093c.p097b.p122u.AbstractC1531x
    /* renamed from: C */
    public void mo969C(ContentObserver contentObserver, ContentResolver contentResolver) {
    }

    @Override // p093c.p097b.p122u.AbstractC1531x
    /* renamed from: u */
    public InterfaceC1515w mo961u() {
        return this.f4871q;
    }
}