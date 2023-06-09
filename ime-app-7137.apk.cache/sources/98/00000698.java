package p093c.p097b.p128x;

import android.util.SparseArray;
import com.anysoftkeyboard.dictionaries.GetWordsCallback;
import com.anysoftkeyboard.ime.AnySoftKeyboardWithGestureTyping;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p097b.p105f0.AbstractC1216c;
import p093c.p097b.p122u.AbstractC1533z;
import p093c.p097b.p122u.InterfaceC1465c0;
import p093c.p097b.p127w.C1543i;
import p093c.p097b.p127w.C1544j;
import p093c.p097b.p127w.EnumC1542h;
import p093c.p097b.p130z.AbstractC1762t;
import p093c.p097b.p130z.Key;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.AbstractC2101i;
import p183e.p184a.InterfaceC2095c;
import p183e.p184a.InterfaceC2096d;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p189o.InterfaceC2127i;
import p183e.p184a.p190p.p191a.EnumC2131c;
import p183e.p184a.p190p.p195e.p196a.C2184h0;
import p183e.p184a.p190p.p195e.p196a.C2195l;
import p183e.p184a.p190p.p195e.p197b.C2229e;
import p183e.p184a.p190p.p195e.p197b.C2231g;
import p183e.p184a.p203s.C2284i;

/* renamed from: c.b.x.b3 */
/* loaded from: classes.dex */
public class C1556b3 implements InterfaceC1465c0 {

    /* renamed from: c */
    public final C1642w1 f4978c;

    /* renamed from: e */
    public final AbstractC1762t f4980e;

    /* renamed from: a */
    public ArrayList f4976a = new ArrayList();

    /* renamed from: b */
    public ArrayList f4977b = new ArrayList();

    /* renamed from: d */
    public final AtomicInteger f4979d = new AtomicInteger(0);

    public C1556b3(AbstractC1762t abstractC1762t, C1642w1 c1642w1) {
        this.f4980e = abstractC1762t;
        this.f4978c = c1642w1;
    }

    @Override // p093c.p097b.p122u.InterfaceC1465c0
    /* renamed from: a */
    public void mo940a(AbstractC1533z abstractC1533z) {
        this.f4979d.incrementAndGet();
    }

    @Override // p093c.p097b.p122u.InterfaceC1465c0
    /* renamed from: b */
    public void mo939b(AbstractC1533z abstractC1533z) {
        int decrementAndGet = this.f4979d.decrementAndGet();
        try {
            abstractC1533z.mo500g(new GetWordsCallback() { // from class: c.b.x.t1
                @Override // com.anysoftkeyboard.dictionaries.GetWordsCallback
                public final void onGetWordsFinished(char[][] cArr, int[] iArr) {
                    C1556b3 c1556b3 = C1556b3.this;
                    c1556b3.getClass();
                    if (cArr.length > 0) {
                        if (iArr.length == cArr.length) {
                            c1556b3.f4976a.add(cArr);
                            c1556b3.f4977b.add(iArr);
                            return;
                        }
                        StringBuilder m1187i = AbstractC1124a.m1187i("words and frequencies do not have the same length (");
                        m1187i.append(cArr.length);
                        m1187i.append(", ");
                        m1187i.append(iArr.length);
                        m1187i.append(")");
                        throw new IllegalArgumentException(m1187i.toString());
                    }
                }
            });
        } catch (Exception unused) {
        }
        if (decrementAndGet == 0) {
            m942d();
        }
    }

    @Override // p093c.p097b.p122u.InterfaceC1465c0
    /* renamed from: c */
    public void mo938c(AbstractC1533z abstractC1533z, Throwable th) {
        int decrementAndGet = this.f4979d.decrementAndGet();
        th.getMessage();
        if (decrementAndGet == 0) {
            m942d();
        }
    }

    /* renamed from: d */
    public final void m942d() {
        C1642w1 c1642w1 = this.f4978c;
        AbstractC1762t abstractC1762t = this.f4980e;
        ArrayList arrayList = this.f4976a;
        ArrayList arrayList2 = this.f4977b;
        AnySoftKeyboardWithGestureTyping anySoftKeyboardWithGestureTyping = c1642w1.f5074a;
        if (anySoftKeyboardWithGestureTyping.f6432v1 && anySoftKeyboardWithGestureTyping.f6434x1 != null) {
            String m424x0 = AnySoftKeyboardWithGestureTyping.m424x0(abstractC1762t);
            if (anySoftKeyboardWithGestureTyping.f6433w1.containsKey(m424x0)) {
                C1544j c1544j = (C1544j) anySoftKeyboardWithGestureTyping.f6433w1.get(m424x0);
                c1544j.f4942j = arrayList;
                c1544j.f4943k = arrayList2;
                c1544j.f4944l.mo35e();
                c1544j.f4946n.mo25g(EnumC1542h.LOADING);
                List list = c1544j.f4942j;
                final ArrayList arrayList3 = c1544j.f4947o;
                final Iterable iterable = c1544j.f4940h;
                final SparseArray sparseArray = c1544j.f4941i;
                final C1543i c1543i = c1544j.f4939g;
                c1543i.m948c();
                arrayList3.clear();
                sparseArray.clear();
                C2231g c2231g = new C2231g(new C2184h0(AbstractC2094b.m174D(list).m163P(AbstractC1216c.f4391a).m172F(new InterfaceC2127i() { // from class: c.b.w.b
                    @Override // p183e.p184a.p189o.InterfaceC2127i
                    /* renamed from: a */
                    public final Object mo24a(Object obj) {
                        return new C1541g((char[][]) obj, arrayList3, iterable, sparseArray, c1543i);
                    }
                }).m139z(new InterfaceC2127i() { // from class: c.b.w.d
                    @Override // p183e.p184a.p189o.InterfaceC2127i
                    /* renamed from: a */
                    public final Object mo24a(Object obj) {
                        final C1541g c1541g = (C1541g) obj;
                        int i = C1544j.f4934b;
                        return AbstractC2094b.m146s(new InterfaceC2096d() { // from class: c.b.w.c
                            @Override // p183e.p184a.InterfaceC2096d
                            /* renamed from: a */
                            public final void mo138a(InterfaceC2095c interfaceC2095c) {
                                char[][] cArr;
                                Key key;
                                C1541g c1541g2 = C1541g.this;
                                if (c1541g2.f4922d.size() == 0) {
                                    for (Key key2 : c1541g2.f4921c) {
                                        for (int i2 = 0; i2 < key2.f5218a.length; i2++) {
                                            c1541g2.f4922d.put(Character.toLowerCase((char) key2.m898b(i2, false)), key2);
                                        }
                                    }
                                }
                                for (char[] cArr2 : c1541g2.f4919a) {
                                    SparseArray sparseArray2 = c1541g2.f4922d;
                                    C1543i c1543i2 = c1541g2.f4923e;
                                    c1543i2.m948c();
                                    char c = 0;
                                    for (char c2 : cArr2) {
                                        char lowerCase = Character.toLowerCase(c2);
                                        if (c != lowerCase && ((key = (Key) sparseArray2.get(lowerCase)) != null || (key = (Key) sparseArray2.get(AbstractC1533z.m951m(lowerCase))) != null)) {
                                            c1543i2.m949b(key.centerX, key.centerY);
                                            c = lowerCase;
                                        }
                                    }
                                    int[] m946b = C1544j.m946b(c1543i2);
                                    if (((C2195l) interfaceC2095c).m94a()) {
                                        return;
                                    }
                                    c1541g2.f4920b.add(m946b);
                                }
                                C2195l c2195l = (C2195l) interfaceC2095c;
                                c2195l.m92c(EnumC1542h.LOADED);
                                if (c2195l.m94a()) {
                                    return;
                                }
                                try {
                                    c2195l.f7183b.mo26d();
                                } finally {
                                    EnumC2131c.m124a(c2195l);
                                }
                            }
                        });
                    }
                }, false).m163P(AbstractC1216c.f4391a), null), null, EnumC1542h.NOT_LOADED);
                AbstractC2101i abstractC2101i = AbstractC1216c.f4392b;
                if (abstractC2101i != null) {
                    C2229e c2229e = new C2229e(c2231g, abstractC2101i);
                    final C2284i c2284i = c1544j.f4946n;
                    c2284i.getClass();
                    InterfaceC2123e interfaceC2123e = new InterfaceC2123e() { // from class: c.b.w.a
                        @Override // p183e.p184a.p189o.InterfaceC2123e
                        public final void accept(Object obj) {
                            C2284i.this.mo25g((EnumC1542h) obj);
                        }
                    };
                    final C2284i c2284i2 = c1544j.f4946n;
                    c2284i2.getClass();
                    c1544j.f4944l = c2229e.m134c(interfaceC2123e, new InterfaceC2123e() { // from class: c.b.w.e
                        @Override // p183e.p184a.p189o.InterfaceC2123e
                        public final void accept(Object obj) {
                            C2284i.this.mo28b((Throwable) obj);
                        }
                    });
                } else {
                    throw new NullPointerException("scheduler is null");
                }
            }
        }
        this.f4976a = new ArrayList();
    }
}