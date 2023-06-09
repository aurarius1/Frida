package p010b.p037h.p043c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: b.h.c.g */
/* loaded from: classes.dex */
public class C0437g {

    /* renamed from: a */
    public float f2298a;

    /* renamed from: b */
    public float f2299b;

    /* renamed from: c */
    public float f2300c;

    /* renamed from: d */
    public float f2301d;

    /* renamed from: e */
    public int f2302e;

    /* renamed from: f */
    public C0444n f2303f;

    public C0437g(Context context, XmlPullParser xmlPullParser) {
        this.f2298a = Float.NaN;
        this.f2299b = Float.NaN;
        this.f2300c = Float.NaN;
        this.f2301d = Float.NaN;
        this.f2302e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), AbstractC0447q.Variant);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == AbstractC0447q.Variant_constraints) {
                this.f2302e = obtainStyledAttributes.getResourceId(index, this.f2302e);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f2302e);
                context.getResources().getResourceName(this.f2302e);
                if ("layout".equals(resourceTypeName)) {
                    C0444n c0444n = new C0444n();
                    this.f2303f = c0444n;
                    c0444n.m2452b((ConstraintLayout) LayoutInflater.from(context).inflate(this.f2302e, (ViewGroup) null));
                }
            } else if (index == AbstractC0447q.Variant_region_heightLessThan) {
                this.f2301d = obtainStyledAttributes.getDimension(index, this.f2301d);
            } else if (index == AbstractC0447q.Variant_region_heightMoreThan) {
                this.f2299b = obtainStyledAttributes.getDimension(index, this.f2299b);
            } else if (index == AbstractC0447q.Variant_region_widthLessThan) {
                this.f2300c = obtainStyledAttributes.getDimension(index, this.f2300c);
            } else if (index == AbstractC0447q.Variant_region_widthMoreThan) {
                this.f2298a = obtainStyledAttributes.getDimension(index, this.f2298a);
            }
        }
        obtainStyledAttributes.recycle();
    }
}