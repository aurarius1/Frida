package p010b.p016c.p026q;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import p010b.p087x.p088a.p089a.C1090e;

/* renamed from: b.c.q.k2 */
/* loaded from: classes.dex */
public class C0271k2 implements InterfaceC0286n2 {
    @Override // p010b.p016c.p026q.InterfaceC0286n2
    /* renamed from: a */
    public Drawable mo2782a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        try {
            Resources resources = context.getResources();
            C1090e c1090e = new C1090e(context, null, null);
            c1090e.inflate(resources, xmlPullParser, attributeSet, theme);
            return c1090e;
        } catch (Exception unused) {
            return null;
        }
    }
}