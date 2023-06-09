package p093c.p094a.p095a.p096a;

import androidx.recyclerview.widget.RecyclerView;
import org.xmlpull.v1.XmlPullParser;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;

/* renamed from: c.a.a.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC1124a {
    /* renamed from: a */
    public static float m1195a(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    /* renamed from: b */
    public static String m1194b(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.m3199A());
        return sb.toString();
    }

    /* renamed from: c */
    public static String m1193c(String str, int i) {
        return str + i;
    }

    /* renamed from: d */
    public static String m1192d(String str, int i, String str2) {
        return str + i + str2;
    }

    /* renamed from: e */
    public static String m1191e(String str, AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z, String str2) {
        return str + abstractComponentCallbacksC0763z + str2;
    }

    /* renamed from: f */
    public static String m1190f(String str, String str2) {
        return str + str2;
    }

    /* renamed from: g */
    public static String m1189g(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* renamed from: h */
    public static String m1188h(XmlPullParser xmlPullParser, StringBuilder sb, String str) {
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: i */
    public static StringBuilder m1187i(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    /* renamed from: j */
    public static void m1186j(String str, AbstractComponentCallbacksC0763z abstractComponentCallbacksC0763z) {
        String str2 = str + abstractComponentCallbacksC0763z;
    }
}