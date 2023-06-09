package p093c.p097b.p116p;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import p010b.p036g.AbstractC0381e;
import p010b.p036g.C0391o;

/* renamed from: c.b.p.c */
/* loaded from: classes.dex */
public class C1425c implements InterfaceC1423a {

    /* renamed from: a */
    public final WeakReference f4700a;

    /* renamed from: b */
    public final SparseIntArray f4701b = new SparseIntArray();

    /* renamed from: c */
    public final C0391o f4702c = new C0391o();

    /* renamed from: d */
    public final int f4703d;

    public C1425c(AbstractC1427e abstractC1427e, AbstractC1424b abstractC1424b) {
        this.f4700a = new WeakReference(abstractC1427e);
        this.f4703d = abstractC1427e.f4714j;
    }

    @Override // p093c.p097b.p116p.InterfaceC1423a
    /* renamed from: a */
    public int[] mo1065a(int[] iArr) {
        int hashCode = Arrays.hashCode(iArr);
        C0391o c0391o = this.f4702c;
        c0391o.getClass();
        int m2654a = AbstractC0381e.m2654a(c0391o.f1945c, c0391o.f1947e, hashCode);
        if (m2654a >= 0) {
            return (int[]) this.f4702c.m2605h(m2654a);
        }
        AbstractC1427e abstractC1427e = (AbstractC1427e) this.f4700a.get();
        int i = 0;
        if (abstractC1427e == null) {
            return new int[0];
        }
        Context m1062a = abstractC1427e.m1062a();
        if (m1062a == null) {
            return new int[0];
        }
        Context context = abstractC1427e.f4709e;
        SparseIntArray sparseIntArray = this.f4701b;
        int i2 = AbstractC1434l.f4731a;
        String packageName = m1062a.getPackageName();
        if (context.getPackageName().equals(packageName)) {
            int length = iArr.length;
            while (i < length) {
                int i3 = iArr[i];
                sparseIntArray.put(i3, i3);
                i++;
            }
        } else {
            Resources resources = context.getResources();
            Resources resources2 = m1062a.getResources();
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i4 : iArr) {
                int identifier = resources.getResourcePackageName(i4).equals("android") ? i4 : resources2.getIdentifier(resources.getResourceEntryName(i4), "attr", packageName);
                if (identifier != 0) {
                    sparseIntArray.put(identifier, i4);
                    arrayList.add(Integer.valueOf(identifier));
                }
            }
            int size = arrayList.size();
            int[] iArr2 = new int[size];
            while (i < size) {
                iArr2[i] = ((Integer) arrayList.get(i)).intValue();
                i++;
            }
            iArr = iArr2;
        }
        this.f4702c.m2607f(hashCode, iArr);
        return iArr;
    }

    @Override // p093c.p097b.p116p.InterfaceC1423a
    /* renamed from: b */
    public int mo1064b(int i) {
        return this.f4701b.get(i, 0);
    }

    @Override // p093c.p097b.p116p.InterfaceC1423a
    /* renamed from: c */
    public int mo1063c() {
        return this.f4703d;
    }
}