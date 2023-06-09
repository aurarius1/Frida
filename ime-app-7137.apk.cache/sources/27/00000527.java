package p093c.p097b.p102d0;

import android.text.TextUtils;
import com.menny.android.anysoftkeyboard.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p093c.p097b.p100c0.C1151a0;
import p093c.p137d.p138a.p139a.C1785g;
import p093c.p137d.p138a.p139a.InterfaceC1781c;

/* renamed from: c.b.d0.d */
/* loaded from: classes.dex */
public class C1187d {

    /* renamed from: a */
    public final List f4319a;

    /* renamed from: b */
    public final InterfaceC1781c f4320b;

    /* renamed from: c */
    public boolean f4321c;

    public C1187d(C1151a0 c1151a0) {
        ArrayList arrayList = new ArrayList(30);
        this.f4319a = arrayList;
        InterfaceC1781c m1170c = c1151a0.m1170c(R.string.settings_key_quick_text_history, R.string.settings_default_empty);
        this.f4320b = m1170c;
        String str = (String) ((C1785g) m1170c).m809b();
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(",", -1);
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i2 >= split.length || arrayList.size() >= 30) {
                    break;
                }
                String str2 = split[i];
                String str3 = split[i2];
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    arrayList.add(new C1186c(str2, str3));
                }
                i += 2;
            }
        }
        if (this.f4319a.size() == 0) {
            this.f4319a.add(new C1186c("😃", "😃"));
        }
    }

    /* renamed from: a */
    public static String m1158a(List list) {
        StringBuilder sb = new StringBuilder(300);
        for (int i = 0; i < list.size(); i++) {
            C1186c c1186c = (C1186c) list.get(i);
            sb.append(c1186c.f4317a);
            sb.append(",");
            sb.append(c1186c.f4318b);
            sb.append(",");
        }
        return sb.toString();
    }

    /* renamed from: b */
    public List m1157b() {
        if (this.f4319a.size() == 0) {
            this.f4319a.add(new C1186c("😃", "😃"));
        }
        return Collections.unmodifiableList(this.f4319a);
    }

    /* renamed from: c */
    public void m1156c(String str, String str2) {
        if (this.f4321c) {
            return;
        }
        C1186c c1186c = new C1186c(str, str2);
        this.f4319a.remove(c1186c);
        this.f4319a.add(c1186c);
        while (this.f4319a.size() > 30) {
            this.f4319a.remove(0);
        }
        ((C1785g) this.f4320b).m808c(m1158a(this.f4319a));
    }
}