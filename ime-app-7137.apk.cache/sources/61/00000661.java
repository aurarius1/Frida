package p093c.p097b.p122u.p123u0;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.provider.UserDictionary;
import android.text.TextUtils;
import p093c.p097b.p122u.AbstractC1531x;
import p093c.p097b.p122u.InterfaceC1515w;

/* renamed from: c.b.u.u0.a */
/* loaded from: classes.dex */
public class C1501a extends AbstractC1531x {

    /* renamed from: o */
    public static final String[] f4857o = {"_id", "word", "frequency"};

    /* renamed from: p */
    public final String f4858p;

    public C1501a(Context context, String str) {
        super("AndroidUserDictionary", context, false);
        this.f4858p = str;
    }

    @Override // p093c.p097b.p122u.AbstractC1531x
    /* renamed from: B */
    public void mo970B(InterfaceC1515w interfaceC1515w) {
        Cursor query = TextUtils.isEmpty(this.f4858p) ? this.f4897g.getContentResolver().query(UserDictionary.Words.CONTENT_URI, f4857o, null, null, null) : this.f4897g.getContentResolver().query(UserDictionary.Words.CONTENT_URI, f4857o, "locale=?", new String[]{this.f4858p}, null);
        if (query == null) {
            throw new RuntimeException("No built-in Android dictionary!");
        }
        if (query.moveToFirst()) {
            while (!query.isAfterLast() && interfaceC1515w.mo979a(query.getString(1), query.getInt(2))) {
                query.moveToNext();
            }
        }
        query.close();
    }

    @Override // p093c.p097b.p122u.AbstractC1531x
    /* renamed from: C */
    public void mo969C(ContentObserver contentObserver, ContentResolver contentResolver) {
        contentResolver.registerContentObserver(UserDictionary.Words.CONTENT_URI, false, contentObserver);
    }

    @Override // p093c.p097b.p122u.AbstractC1531x
    /* renamed from: r */
    public void mo964r(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (i < 1) {
            i = 1;
        }
        if (i > 255) {
            i = 255;
        }
        ContentValues contentValues = new ContentValues(4);
        contentValues.put("word", str);
        contentValues.put("frequency", Integer.valueOf(i));
        contentValues.put("locale", this.f4858p);
        contentValues.put("appid", (Integer) 0);
        String str2 = "Added the word '" + str + "' at locale " + this.f4858p + " into Android's user dictionary. Result " + this.f4897g.getContentResolver().insert(UserDictionary.Words.CONTENT_URI, contentValues);
    }

    @Override // p093c.p097b.p122u.AbstractC1531x
    /* renamed from: t */
    public void mo962t() {
    }

    @Override // p093c.p097b.p122u.AbstractC1533z
    public String toString() {
        return this.f4858p + "@" + super.toString();
    }

    @Override // p093c.p097b.p122u.AbstractC1531x
    /* renamed from: v */
    public final void mo960v(String str) {
        this.f4897g.getContentResolver().delete(UserDictionary.Words.CONTENT_URI, "word=?", new String[]{str});
    }
}