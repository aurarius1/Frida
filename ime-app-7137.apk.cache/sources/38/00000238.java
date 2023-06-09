package p010b.p037h.p043c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: b.h.c.f */
/* loaded from: classes.dex */
public class C0436f {

    /* renamed from: a */
    public int f2294a;

    /* renamed from: b */
    public ArrayList f2295b = new ArrayList();

    /* renamed from: c */
    public int f2296c;

    /* renamed from: d */
    public C0444n f2297d;

    public C0436f(Context context, XmlPullParser xmlPullParser) {
        this.f2296c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC0447q.State);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == AbstractC0447q.State_android_id) {
                this.f2294a = obtainStyledAttributes.getResourceId(index, this.f2294a);
            } else if (index == AbstractC0447q.State_constraints) {
                this.f2296c = obtainStyledAttributes.getResourceId(index, this.f2296c);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f2296c);
                context.getResources().getResourceName(this.f2296c);
                if ("layout".equals(resourceTypeName)) {
                    C0444n c0444n = new C0444n();
                    this.f2297d = c0444n;
                    c0444n.m2452b((ConstraintLayout) LayoutInflater.from(context).inflate(this.f2296c, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
}