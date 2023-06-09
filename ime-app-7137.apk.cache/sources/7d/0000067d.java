package p093c.p097b.p122u.p125w0;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import p093c.p097b.p122u.InterfaceC1515w;

/* renamed from: c.b.u.w0.n */
/* loaded from: classes.dex */
public class C1529n extends SQLiteOpenHelper {

    /* renamed from: b */
    public final String f4891b;

    /* renamed from: c */
    public final String f4892c;

    public C1529n(Context context, String str, String str2) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 7);
        this.f4891b = str2;
        this.f4892c = str;
    }

    /* renamed from: a */
    public void m976a(String str, int i) {
        synchronized (this.f4892c) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("_id", Integer.valueOf(str.hashCode()));
            contentValues.put("word", str);
            contentValues.put("frequency", Integer.valueOf(i));
            contentValues.put("locale", this.f4891b);
            int i2 = (writableDatabase.insert("WORDS", null, contentValues) > 0L ? 1 : (writableDatabase.insert("WORDS", null, contentValues) == 0L ? 0 : -1));
            writableDatabase.close();
        }
    }

    /* renamed from: b */
    public void m975b(InterfaceC1515w interfaceC1515w) {
        synchronized (this.f4892c) {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            Cursor query = TextUtils.isEmpty(this.f4891b) ? readableDatabase.query("WORDS", new String[]{"_id", "word", "frequency"}, "(locale IS NULL)", null, null, null, "_id DESC", null) : readableDatabase.query("WORDS", new String[]{"_id", "word", "frequency"}, "locale=?", new String[]{this.f4891b}, null, null, "_id DESC", null);
            if (query != null && query.moveToFirst()) {
                while (!query.isAfterLast() && interfaceC1515w.mo979a(query.getString(1), query.getInt(2))) {
                    query.moveToNext();
                }
            }
            if (query != null) {
                query.close();
            }
            readableDatabase.close();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        synchronized (this.f4892c) {
            sQLiteDatabase.execSQL("CREATE TABLE WORDS (_id INTEGER PRIMARY KEY,word TEXT,frequency INTEGER,locale TEXT);");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        synchronized (this.f4892c) {
            if (i < 4) {
                sQLiteDatabase.execSQL("ALTER TABLE FALL_BACK_USER_DICTIONARY ADD COLUMN locale TEXT;");
            }
            if (i < 5) {
                sQLiteDatabase.execSQL("ALTER TABLE FALL_BACK_USER_DICTIONARY ADD COLUMN _id INTEGER;");
                sQLiteDatabase.execSQL("UPDATE FALL_BACK_USER_DICTIONARY SET _id=Id;");
            }
            if (i < 6) {
                sQLiteDatabase.execSQL("ALTER TABLE FALL_BACK_USER_DICTIONARY RENAME TO tmp_FALL_BACK_USER_DICTIONARY;");
                sQLiteDatabase.execSQL("CREATE TABLE FALL_BACK_USER_DICTIONARY (_id INTEGER PRIMARY KEY,word TEXT,frequency INTEGER,locale TEXT);");
                sQLiteDatabase.execSQL("INSERT INTO FALL_BACK_USER_DICTIONARY(_id, word, frequency, locale) SELECT _id, Word, Freq, locale FROM tmp_FALL_BACK_USER_DICTIONARY;");
                sQLiteDatabase.execSQL("DROP TABLE tmp_FALL_BACK_USER_DICTIONARY;");
            }
            if (i < 7) {
                sQLiteDatabase.execSQL("ALTER TABLE FALL_BACK_USER_DICTIONARY RENAME TO WORDS;");
            }
        }
    }
}