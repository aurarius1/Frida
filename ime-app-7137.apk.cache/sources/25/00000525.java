package p093c.p097b.p102d0;

import android.content.Context;
import android.content.res.Resources;
import com.menny.android.anysoftkeyboard.R;
import java.util.Arrays;
import java.util.List;

/* renamed from: c.b.d0.b */
/* loaded from: classes.dex */
public class C1185b extends C1188e {

    /* renamed from: p */
    public final C1187d f4316p;

    public C1185b(Context context, C1187d c1187d) {
        super(context, context, context.getResources().getInteger(R.integer.anysoftkeyboard_api_version_code), "b0316c86-ffa2-49e9-85f7-6cb6e63e18f9", context.getResources().getText(R.string.history_quick_text_key_name), 0, 0, 0, 0, R.drawable.ic_quick_text_dark_theme, "🕐", "🕐", 0, false, context.getResources().getString(R.string.history_quick_text_key_name), 0);
        this.f4316p = c1187d;
    }

    @Override // p093c.p097b.p102d0.C1188e
    /* renamed from: b */
    public List mo1155b() {
        List<C1186c> m1157b = this.f4316p.m1157b();
        int size = m1157b.size();
        String[] strArr = new String[size];
        int i = size - 1;
        for (C1186c c1186c : m1157b) {
            strArr[i] = c1186c.f4317a;
            i--;
        }
        return Arrays.asList(strArr);
    }

    @Override // p093c.p097b.p102d0.C1188e
    /* renamed from: c */
    public List mo1154c() {
        List<C1186c> m1157b = this.f4316p.m1157b();
        int size = m1157b.size();
        String[] strArr = new String[size];
        int i = size - 1;
        for (C1186c c1186c : m1157b) {
            strArr[i] = c1186c.f4318b;
            i--;
        }
        return Arrays.asList(strArr);
    }

    @Override // p093c.p097b.p102d0.C1188e
    /* renamed from: d */
    public String[] mo1153d(int i, Resources resources) {
        return new String[0];
    }

    @Override // p093c.p097b.p102d0.C1188e
    /* renamed from: e */
    public String[] mo1152e(int i, Resources resources) {
        return new String[0];
    }
}