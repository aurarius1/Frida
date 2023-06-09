package p093c.p097b.p122u;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p010b.p046j.p057k.C0561b;

/* renamed from: c.b.u.i0 */
/* loaded from: classes.dex */
public class C1477i0 extends AbstractC1531x {

    /* renamed from: o */
    public final ArrayList f4778o;

    public C1477i0(String str, Context context, Collection collection, boolean z) {
        super(str, context, z);
        this.f4778o = new ArrayList(collection);
    }

    @Override // p093c.p097b.p122u.AbstractC1531x
    /* renamed from: B */
    public void mo970B(InterfaceC1515w interfaceC1515w) {
        Iterator it = this.f4778o.iterator();
        while (it.hasNext()) {
            C0561b c0561b = (C0561b) it.next();
            if (!interfaceC1515w.mo979a((String) c0561b.f2654a, ((Integer) c0561b.f2655b).intValue())) {
                return;
            }
        }
    }

    @Override // p093c.p097b.p122u.AbstractC1531x
    /* renamed from: C */
    public void mo969C(ContentObserver contentObserver, ContentResolver contentResolver) {
    }

    @Override // p093c.p097b.p122u.AbstractC1531x
    /* renamed from: r */
    public void mo964r(String str, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p093c.p097b.p122u.AbstractC1531x
    /* renamed from: t */
    public void mo962t() {
        this.f4778o.clear();
    }

    @Override // p093c.p097b.p122u.AbstractC1531x
    /* renamed from: v */
    public void mo960v(String str) {
        throw new UnsupportedOperationException();
    }
}