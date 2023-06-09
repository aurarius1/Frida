package p010b.p016c.p017k;

import android.content.Context;
import android.widget.ArrayAdapter;

/* renamed from: b.c.k.n */
/* loaded from: classes.dex */
public class C0115n extends ArrayAdapter {
    public C0115n(Context context, int i, int i2, CharSequence[] charSequenceArr) {
        super(context, i, i2, charSequenceArr);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}