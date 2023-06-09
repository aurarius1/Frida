package p010b.p062k.p063a;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* renamed from: b.k.a.a */
/* loaded from: classes.dex */
public class C0650a extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ AbstractC0652c f2845a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0650a(AbstractC0652c abstractC0652c) {
        super(new Handler());
        this.f2845a = abstractC0652c;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        Cursor cursor;
        AbstractC0652c abstractC0652c = this.f2845a;
        if (!abstractC0652c.f2848c || (cursor = abstractC0652c.f2849d) == null || cursor.isClosed()) {
            return;
        }
        abstractC0652c.f2847b = abstractC0652c.f2849d.requery();
    }
}