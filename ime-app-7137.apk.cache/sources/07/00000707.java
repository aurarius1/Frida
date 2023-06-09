package p093c.p097b.p130z;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import p093c.p097b.p116p.InterfaceC1423a;
import p093c.p176h.p177a.p178a.AbstractC2062a0;

/* renamed from: c.b.z.e0 */
/* loaded from: classes.dex */
public class C1667e0 {

    /* renamed from: a */
    public int f5123a;

    /* renamed from: b */
    public int f5124b;

    /* renamed from: c */
    public int f5125c;

    /* renamed from: d */
    public int f5126d;

    /* renamed from: e */
    public int f5127e;

    /* renamed from: f */
    public int f5128f;

    /* renamed from: g */
    public AbstractC1669f0 f5129g;

    public C1667e0(InterfaceC1423a interfaceC1423a, Resources resources, AbstractC1669f0 abstractC1669f0, XmlResourceParser xmlResourceParser) {
        this.f5128f = 0;
        this.f5129g = abstractC1669f0;
        this.f5123a = abstractC1669f0.f5138h;
        this.f5124b = abstractC1669f0.f5139i;
        this.f5125c = abstractC1669f0.f5137g;
        this.f5126d = abstractC1669f0.f5140j;
        int[] mo1065a = interfaceC1423a.mo1065a(AbstractC2062a0.KeyboardLayout);
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), mo1065a);
        int indexCount = obtainAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainAttributes.getIndex(i);
            switch (interfaceC1423a.mo1064b(mo1065a[index])) {
                case 16843325:
                    this.f5123a = AbstractC1669f0.m926d(obtainAttributes, index, abstractC1669f0.f5149s, abstractC1669f0.f5138h);
                    break;
                case 16843326:
                    this.f5124b = AbstractC1669f0.m925f(obtainAttributes, index, abstractC1669f0.f5139i);
                    break;
                case 16843327:
                    try {
                        this.f5125c = AbstractC1669f0.m926d(obtainAttributes, index, abstractC1669f0.f5149s, abstractC1669f0.f5137g);
                        break;
                    } catch (Exception unused) {
                        break;
                    }
            }
        }
        obtainAttributes.recycle();
        int[] mo1065a2 = interfaceC1423a.mo1065a(AbstractC2062a0.KeyboardLayout_Row);
        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), mo1065a2);
        int indexCount2 = obtainAttributes2.getIndexCount();
        for (int i2 = 0; i2 < indexCount2; i2++) {
            int index2 = obtainAttributes2.getIndex(i2);
            int mo1064b = interfaceC1423a.mo1064b(mo1065a2[index2]);
            if (mo1064b == 16843329) {
                this.f5127e = obtainAttributes2.getInt(index2, 0);
            } else if (mo1064b == 16843341) {
                try {
                    int resourceId = obtainAttributes2.getResourceId(index2, 0);
                    if (resourceId != 0) {
                        this.f5128f = resources.getInteger(resourceId);
                    } else {
                        this.f5128f = 0;
                    }
                } catch (Exception unused2) {
                }
            }
        }
        obtainAttributes2.recycle();
    }

    public C1667e0(AbstractC1669f0 abstractC1669f0) {
        this.f5128f = 0;
        this.f5129g = abstractC1669f0;
        this.f5123a = abstractC1669f0.f5138h;
        this.f5124b = abstractC1669f0.f5139i;
        this.f5125c = abstractC1669f0.f5137g;
        this.f5126d = abstractC1669f0.f5140j;
        this.f5127e = 12;
        this.f5128f = abstractC1669f0.f5150t;
    }
}