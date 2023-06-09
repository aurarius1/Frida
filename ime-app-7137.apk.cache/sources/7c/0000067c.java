package p093c.p097b.p122u.p125w0;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import p093c.p097b.p122u.AbstractC1531x;
import p093c.p097b.p122u.InterfaceC1515w;

/* renamed from: c.b.u.w0.m */
/* loaded from: classes.dex */
public abstract class AbstractC1528m extends AbstractC1531x {

    /* renamed from: o */
    public volatile C1529n f4889o;

    /* renamed from: p */
    public final String f4890p;

    public AbstractC1528m(String str, Context context, String str2) {
        super(str, context, false);
        this.f4890p = str2;
    }

    @Override // p093c.p097b.p122u.AbstractC1531x
    /* renamed from: B */
    public void mo970B(InterfaceC1515w interfaceC1515w) {
        try {
            if (this.f4889o == null) {
                this.f4889o = mo977D(this.f4890p);
            }
            this.f4889o.m975b(interfaceC1515w);
        } catch (SQLiteException e) {
            e.printStackTrace();
            String str = this.f4889o.f4892c;
            try {
                this.f4889o.close();
            } catch (SQLiteException e2) {
                e2.getMessage();
            }
            e.getMessage();
            try {
                this.f4897g.deleteDatabase(str);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            this.f4889o = null;
            this.f4889o = mo977D(this.f4890p);
            this.f4889o.m975b(interfaceC1515w);
        }
    }

    @Override // p093c.p097b.p122u.AbstractC1531x
    /* renamed from: C */
    public final void mo969C(ContentObserver contentObserver, ContentResolver contentResolver) {
    }

    /* renamed from: D */
    public abstract C1529n mo977D(String str);

    @Override // p093c.p097b.p122u.AbstractC1531x
    /* renamed from: r */
    public final void mo964r(String str, int i) {
        if (this.f4889o != null) {
            this.f4889o.m976a(str, i);
        }
    }

    @Override // p093c.p097b.p122u.AbstractC1531x
    /* renamed from: t */
    public void mo962t() {
        if (this.f4889o != null) {
            this.f4889o.close();
        }
        this.f4889o = null;
    }

    @Override // p093c.p097b.p122u.AbstractC1531x
    /* renamed from: v */
    public final void mo960v(String str) {
        if (this.f4889o != null) {
            C1529n c1529n = this.f4889o;
            synchronized (c1529n.f4892c) {
                SQLiteDatabase writableDatabase = c1529n.getWritableDatabase();
                writableDatabase.delete("WORDS", "word=?", new String[]{str});
                writableDatabase.close();
            }
        }
    }
}