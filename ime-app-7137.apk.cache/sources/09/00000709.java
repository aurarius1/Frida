package p093c.p097b.p130z;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import com.menny.android.anysoftkeyboard.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import org.xmlpull.v1.XmlPullParserException;
import p093c.p097b.p116p.AbstractC1427e;
import p093c.p097b.p116p.InterfaceC1423a;
import p093c.p176h.p177a.p178a.AbstractC2062a0;
import p183e.p184a.AbstractC2094b;
import p183e.p184a.p190p.p194d.C2156d;

/* renamed from: c.b.z.f0 */
/* loaded from: classes.dex */
public abstract class AbstractC1669f0 {

    /* renamed from: a */
    public InterfaceC1677j0 f5131a;

    /* renamed from: b */
    public final int f5132b;

    /* renamed from: c */
    public final float f5133c;

    /* renamed from: d */
    public final AbstractC1427e f5134d;

    /* renamed from: e */
    public final Context f5135e;

    /* renamed from: f */
    public final InterfaceC1423a f5136f;

    /* renamed from: g */
    public int f5137g;

    /* renamed from: h */
    public int f5138h;

    /* renamed from: i */
    public int f5139i;

    /* renamed from: j */
    public int f5140j;

    /* renamed from: k */
    public boolean f5141k = true;

    /* renamed from: l */
    public boolean f5142l = true;

    /* renamed from: m */
    public boolean f5143m;

    /* renamed from: n */
    public Key f5144n;

    /* renamed from: o */
    public int f5145o;

    /* renamed from: p */
    public int f5146p;

    /* renamed from: q */
    public List f5147q;

    /* renamed from: r */
    public List f5148r;

    /* renamed from: s */
    public int f5149s;

    /* renamed from: t */
    public final int f5150t;

    /* renamed from: u */
    public int f5151u;

    /* renamed from: v */
    public int f5152v;

    /* renamed from: w */
    public int[][] f5153w;

    /* renamed from: x */
    public int f5154x;

    public AbstractC1669f0(AbstractC1427e abstractC1427e, Context context, int i, int i2) {
        AbstractC2094b m914c = AbstractC1681l0.m914c(context);
        C2156d c2156d = new C2156d();
        m914c.mo89a(c2156d);
        Object m106a = c2156d.m106a();
        if (m106a != null) {
            this.f5133c = ((Float) m106a).floatValue();
            this.f5134d = abstractC1427e;
            this.f5136f = abstractC1427e.f4712h;
            this.f5135e = context;
            this.f5132b = i;
            if (i2 != 1 && i2 != 4 && i2 != 3 && i2 != 2 && i2 != 5) {
                throw new IllegalArgumentException("modeId much be one of KeyboardRowModeId, not including KEYBOARD_ROW_MODE_NONE.");
            }
            this.f5150t = i2;
            this.f5147q = new ArrayList();
            this.f5148r = new ArrayList();
            return;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: d */
    public static int m926d(TypedArray typedArray, int i, int i2, int i3) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return i3;
        }
        int i4 = peekValue.type;
        return i4 == 5 ? typedArray.getDimensionPixelOffset(i, i3) : i4 == 6 ? Math.round(typedArray.getFraction(i, i2, i2, i3)) : i3;
    }

    /* renamed from: f */
    public static int m925f(TypedArray typedArray, int i, int i2) {
        int i3;
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return i2;
        }
        int i4 = peekValue.type;
        if (i4 < 16 || i4 > 31 || (i3 = peekValue.data) > 0 || i3 < -3) {
            return -1;
        }
        return i3;
    }

    /* renamed from: a */
    public final void m927a() {
        this.f5151u = ((mo831g() + 10) - 1) / 10;
        this.f5152v = ((mo839e() + 5) - 1) / 5;
        this.f5153w = new int[50];
        int[] iArr = new int[this.f5147q.size()];
        int i = this.f5151u * 10;
        int i2 = this.f5152v * 5;
        int i3 = 0;
        while (i3 < i) {
            int i4 = 0;
            while (i4 < i2) {
                int i5 = 0;
                for (int i6 = 0; i6 < this.f5147q.size(); i6++) {
                    Key key = (Key) this.f5147q.get(i6);
                    if (key.m893h(i3, i4) < this.f5154x || key.m893h((this.f5151u + i3) - 1, i4) < this.f5154x || key.m893h((this.f5151u + i3) - 1, (this.f5152v + i4) - 1) < this.f5154x || key.m893h(i3, (this.f5152v + i4) - 1) < this.f5154x) {
                        iArr[i5] = i6;
                        i5++;
                    }
                }
                int[] iArr2 = new int[i5];
                System.arraycopy(iArr, 0, iArr2, 0, i5);
                int[][] iArr3 = this.f5153w;
                int i7 = this.f5152v;
                iArr3[(i3 / this.f5151u) + ((i4 / i7) * 10)] = iArr2;
                i4 += i7;
            }
            i3 += this.f5151u;
        }
    }

    /* renamed from: b */
    public abstract Key mo832b(InterfaceC1423a interfaceC1423a, Context context, Context context2, C1667e0 c1667e0, InterfaceC1677j0 interfaceC1677j0, int i, int i2, XmlResourceParser xmlResourceParser);

    /* renamed from: c */
    public C1667e0 mo840c(InterfaceC1423a interfaceC1423a, Resources resources, XmlResourceParser xmlResourceParser, int i) {
        C1667e0 c1667e0 = new C1667e0(interfaceC1423a, resources, this, xmlResourceParser);
        int i2 = c1667e0.f5128f;
        if (i2 == 0 || i2 == i) {
            return c1667e0;
        }
        return null;
    }

    /* renamed from: e */
    public int mo839e() {
        return this.f5145o;
    }

    /* renamed from: g */
    public int mo831g() {
        return this.f5146p;
    }

    /* renamed from: h */
    public boolean mo838h() {
        return this.f5143m;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo837i(InterfaceC1677j0 interfaceC1677j0) {
        XmlResourceParser xmlResourceParser;
        int i;
        float f;
        int i2;
        String str;
        Resources resources;
        List list;
        String str2 = "Row";
        InterfaceC1677j0 interfaceC1677j02 = this.f5131a;
        this.f5131a = interfaceC1677j0;
        this.f5149s = interfaceC1677j0.mo862e();
        float mo864c = interfaceC1677j0.mo864c();
        float mo866a = interfaceC1677j0.mo866a();
        this.f5137g = 0;
        this.f5138h = this.f5149s / 10;
        this.f5139i = -1;
        Context m1062a = this.f5134d.m1062a();
        if (m1062a == null) {
            return;
        }
        Resources resources2 = m1062a.getResources();
        XmlResourceParser xml = resources2.getXml(this.f5132b);
        Key key = null;
        C1667e0 c1667e0 = null;
        float f2 = mo864c;
        boolean z = false;
        float f3 = 0.0f;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            try {
                int next = xml.next();
                if (next == 1) {
                    break;
                }
                int i5 = i3;
                if (next == 2) {
                    String name = xml.getName();
                    if (str2.equals(name)) {
                        C1667e0 mo840c = mo840c(this.f5136f, resources2, xml, this.f5150t);
                        if (mo840c == null) {
                            while (true) {
                                int next2 = xml.next();
                                if (next2 == 1 || (next2 == 3 && xml.getName().equals(str2))) {
                                    break;
                                }
                            }
                            str = str2;
                            c1667e0 = mo840c;
                            i = i4;
                            f = f2;
                            xmlResourceParser = xml;
                            resources = resources2;
                            f3 = 0.0f;
                            i3 = 0;
                            z2 = false;
                        } else {
                            str = str2;
                            c1667e0 = mo840c;
                            i = i4;
                            f = f2;
                            xmlResourceParser = xml;
                            resources = resources2;
                            f3 = 0.0f;
                            i3 = 0;
                            z2 = true;
                        }
                    } else if ("Key".equals(name)) {
                        float f4 = (mo866a / 2.0f) + f3;
                        f = f2;
                        str = str2;
                        C1667e0 c1667e02 = c1667e0;
                        XmlResourceParser xmlResourceParser2 = xml;
                        i = i4;
                        resources = resources2;
                        try {
                            key = mo832b(this.f5136f, this.f5135e, m1062a, c1667e0, interfaceC1677j0, (int) f4, (int) f2, xmlResourceParser2);
                            int max = Math.max(i5, key.height);
                            key.width = (int) (key.width - mo866a);
                            this.f5147q.add(key);
                            if (key.getPrimaryCode() == -1) {
                                this.f5144n = key;
                                list = this.f5148r;
                            } else {
                                if (key.getPrimaryCode() == -6) {
                                    list = this.f5148r;
                                }
                                c1667e0 = c1667e02;
                                i3 = max;
                                f3 = f4;
                                xmlResourceParser = xmlResourceParser2;
                                z = true;
                            }
                            list.add(key);
                            c1667e0 = c1667e02;
                            i3 = max;
                            f3 = f4;
                            xmlResourceParser = xmlResourceParser2;
                            z = true;
                        } catch (IOException e) {
                            e = e;
                            xmlResourceParser = xmlResourceParser2;
                            e.getMessage();
                            i2 = i;
                            this.f5145o = (int) (f - i2);
                            if (xmlResourceParser != null) {
                            }
                        } catch (XmlPullParserException e2) {
                            e = e2;
                            xmlResourceParser = xmlResourceParser2;
                            e.getMessage();
                            i2 = i;
                            this.f5145o = (int) (f - i2);
                            if (xmlResourceParser != null) {
                            }
                        } catch (Throwable th) {
                            th = th;
                            xmlResourceParser = xmlResourceParser2;
                            if (xmlResourceParser != null) {
                            }
                            throw th;
                        }
                    } else {
                        str = str2;
                        i = i4;
                        C1667e0 c1667e03 = c1667e0;
                        XmlResourceParser xmlResourceParser3 = xml;
                        resources = resources2;
                        f = f2;
                        if ("Keyboard".equals(name)) {
                            xmlResourceParser = xmlResourceParser3;
                            try {
                                try {
                                    m924j(this.f5135e, resources, xmlResourceParser);
                                    c1667e0 = c1667e03;
                                    i3 = i5;
                                } catch (IOException e3) {
                                    e = e3;
                                    e.getMessage();
                                    i2 = i;
                                    this.f5145o = (int) (f - i2);
                                    if (xmlResourceParser != null) {
                                    }
                                } catch (XmlPullParserException e4) {
                                    e = e4;
                                    e.getMessage();
                                    i2 = i;
                                    this.f5145o = (int) (f - i2);
                                    if (xmlResourceParser != null) {
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (xmlResourceParser != null) {
                                    try {
                                        xmlResourceParser.close();
                                    } catch (Throwable unused) {
                                    }
                                }
                                throw th;
                            }
                        } else {
                            xmlResourceParser = xmlResourceParser3;
                            c1667e0 = c1667e03;
                            i3 = i5;
                            z3 = true;
                        }
                    }
                    xml = xmlResourceParser;
                    resources2 = resources;
                } else {
                    str = str2;
                    i = i4;
                    C1667e0 c1667e04 = c1667e0;
                    Resources resources3 = resources2;
                    f = f2;
                    XmlResourceParser xmlResourceParser4 = xml;
                    if (next == 3) {
                        if (z) {
                            f3 = f3 + key.f5224g + key.width + (mo866a / 2.0f);
                            if (f3 > this.f5146p) {
                                this.f5146p = (int) f3;
                            }
                            c1667e0 = c1667e04;
                            xml = xmlResourceParser4;
                            resources2 = resources3;
                            i3 = i5;
                            i4 = i;
                            f2 = f;
                            str2 = str;
                            z = false;
                        } else if (z2) {
                            int i6 = c1667e04.f5126d;
                            i4 = i6;
                            xml = xmlResourceParser4;
                            f2 = f + i6 + i5 + mo864c;
                            resources2 = resources3;
                            i3 = i5;
                            z2 = false;
                            c1667e0 = c1667e04;
                            str2 = str;
                        } else if (z3) {
                            c1667e0 = c1667e04;
                            xml = xmlResourceParser4;
                            resources2 = resources3;
                            i3 = i5;
                            i4 = i;
                            f2 = f;
                            str2 = str;
                            z3 = false;
                        }
                    }
                    c1667e0 = c1667e04;
                    xml = xmlResourceParser4;
                    resources2 = resources3;
                    i3 = i5;
                }
                i4 = i;
                f2 = f;
                str2 = str;
            } catch (IOException e5) {
                e = e5;
                i = i4;
                f = f2;
                xmlResourceParser = xml;
            } catch (XmlPullParserException e6) {
                e = e6;
                i = i4;
                f = f2;
                xmlResourceParser = xml;
            } catch (Throwable th3) {
                th = th3;
                xmlResourceParser = xml;
            }
        }
        f = f2;
        xmlResourceParser = xml;
        i2 = i4;
        this.f5145o = (int) (f - i2);
        if (xmlResourceParser != null) {
            xmlResourceParser.close();
        }
    }

    /* renamed from: j */
    public final void m924j(Context context, Resources resources, XmlResourceParser xmlResourceParser) {
        InterfaceC1423a interfaceC1423a = this.f5136f;
        int[] mo1065a = interfaceC1423a.mo1065a(AbstractC2062a0.KeyboardLayout);
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), mo1065a);
        Resources resources2 = context.getResources();
        this.f5138h = this.f5149s / 10;
        this.f5139i = -1;
        this.f5137g = 0;
        this.f5140j = resources2.getDimensionPixelOffset(R.dimen.default_key_vertical_gap);
        int indexCount = obtainAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainAttributes.getIndex(i);
            int mo1064b = interfaceC1423a.mo1064b(mo1065a[index]);
            if (mo1064b == R.attr.autoCap) {
                this.f5142l = obtainAttributes.getBoolean(index, true);
            } else if (mo1064b != R.attr.showPreview) {
                switch (mo1064b) {
                    case 16843325:
                        int i2 = this.f5149s;
                        this.f5138h = m926d(obtainAttributes, index, i2, i2 / 10);
                        continue;
                    case 16843326:
                        this.f5139i = m925f(obtainAttributes, index, -1);
                        continue;
                    case 16843327:
                        try {
                            this.f5137g = m926d(obtainAttributes, index, this.f5149s, 0);
                            continue;
                        } catch (Exception unused) {
                            break;
                        }
                }
            } else {
                this.f5141k = obtainAttributes.getBoolean(index, true);
            }
        }
        obtainAttributes.recycle();
        int i3 = (int) (this.f5138h * 1.8f);
        this.f5154x = i3;
        this.f5154x = i3 * i3;
    }

    /* renamed from: k */
    public void m923k() {
        this.f5146p = 0;
        this.f5145o = 0;
        for (Key key : this.f5147q) {
            int i = key.x + key.f5224g + key.width;
            if (i > this.f5146p) {
                this.f5146p = i;
            }
            int i2 = key.y + key.height;
            if (i2 > this.f5145o) {
                this.f5145o = i2;
            }
        }
    }
}