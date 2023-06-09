package p093c.p097b.p121t;

import android.annotation.TargetApi;
import android.database.ContentObserver;
import p093c.p097b.p122u.AbstractC1531x;
import p093c.p097b.p122u.C1471f0;

@TargetApi(16)
/* renamed from: c.b.t.h */
/* loaded from: classes.dex */
public class C1451h extends C1450g {
    @Override // p093c.p097b.p121t.C1450g
    /* renamed from: b */
    public ContentObserver mo1028b(AbstractC1531x abstractC1531x) {
        return new C1471f0(abstractC1531x);
    }

    @Override // p093c.p097b.p121t.C1450g
    /* renamed from: f */
    public String mo1022f() {
        return "DeviceSpecificV16";
    }
}