package p093c.p097b.p130z.p132r0;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.anysoftkeyboard.keyboards.views.AnyKeyboardViewBase;
import java.util.Arrays;
import java.util.Locale;
import p093c.p097b.p130z.Key;

/* renamed from: c.b.z.r0.x0 */
/* loaded from: classes.dex */
public class PointerTracker {

    /* renamed from: a */
    public final int f5385a;

    /* renamed from: b */
    public final InterfaceC1754w0 f5386b;

    /* renamed from: c */
    public final HandlerC1694a0 f5387c;

    /* renamed from: d */
    public final KeyDetector mKeyDetector;

    /* renamed from: e */
    public InterfaceC1748t0 f5389e;

    /* renamed from: f */
    public Key[] mKeys;

    /* renamed from: h */
    public final C1750u0 f5392h;

    /* renamed from: j */
    public boolean f5394j;

    /* renamed from: k */
    public boolean f5395k;

    /* renamed from: l */
    public boolean f5396l;

    /* renamed from: m */
    public final C1752v0 f5397m;

    /* renamed from: n */
    public int f5398n;

    /* renamed from: o */
    public long f5399o;

    /* renamed from: p */
    public boolean f5400p;

    /* renamed from: g */
    public int f5391g = -1;

    /* renamed from: i */
    public int f5393i = -1;

    /* renamed from: q */
    public int f5401q = -1;

    public PointerTracker(int i, HandlerC1694a0 handlerC1694a0, KeyDetector keyDetector, InterfaceC1754w0 interfaceC1754w0, C1752v0 c1752v0) {
        if (handlerC1694a0 == null || keyDetector == null) {
            throw null;
        }
        this.f5397m = c1752v0;
        this.f5385a = i;
        this.f5386b = interfaceC1754w0;
        this.f5387c = handlerC1694a0;
        this.mKeyDetector = keyDetector;
        this.f5392h = new C1750u0(keyDetector);
        m846j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
        if (r19 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
        r7.mo447i(r3.getPrimaryCode());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0070, code lost:
        if (r19 != false) goto L20;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m855a(int i, int i2, int i3, long j, boolean z) {
        int m898b;
        boolean z2;
        boolean z3;
        InterfaceC1748t0 interfaceC1748t0 = this.f5389e;
        Key key = getKey(i);
        if (key == null) {
            if (interfaceC1748t0 != null) {
                interfaceC1748t0.mo493a();
                return;
            }
            return;
        }
        boolean isKeyShifted = this.mKeyDetector.isKeyShifted(key);
        boolean z4 = false;
        if ((key.f5232o != null && !isKeyShifted) || (key.f5233p != null && isKeyShifted)) {
            if (interfaceC1748t0 != null) {
                if (m853c()) {
                    interfaceC1748t0.mo427t();
                }
                this.f5393i = -1;
                this.f5398n = 0;
                interfaceC1748t0.mo450c(key, isKeyShifted ? key.f5233p : key.f5232o);
            }
            this.f5397m.f5379a = i;
            this.f5399o = j;
        }
        if ((key.f5230m == null || isKeyShifted) && (key.f5231n == null || !isKeyShifted)) {
            KeyDetector keyDetector = this.mKeyDetector;
            Arrays.fill(keyDetector.f5333b, -1);
            int[] iArr = keyDetector.f5333b;
            this.mKeyDetector.mo842a(i2, i3, iArr);
            if (this.f5400p) {
                if (this.f5398n != -1) {
                    this.f5389e.mo446k();
                    z3 = true;
                } else {
                    this.f5398n = 0;
                    z3 = false;
                }
                m898b = key.m897d(this.f5398n);
                z2 = z3;
            } else {
                m898b = key.m898b(0, this.mKeyDetector.isKeyShifted(key));
                z2 = false;
            }
            if (iArr.length >= 2 && iArr[0] != m898b && iArr[1] == m898b) {
                iArr[1] = iArr[0];
                iArr[0] = m898b;
            }
            if (interfaceC1748t0 != null) {
                if (m853c()) {
                    interfaceC1748t0.mo427t();
                } else {
                    interfaceC1748t0.mo379s(m898b, key, this.f5398n, iArr, (i2 >= 0 || i3 >= 0) ? true : true);
                }
                this.f5393i = -1;
                if (z) {
                    interfaceC1748t0.mo447i(m898b);
                }
                if (z2) {
                    this.f5389e.mo502f();
                }
            }
        } else if (interfaceC1748t0 != null) {
            if (m853c()) {
                interfaceC1748t0.mo427t();
            }
            this.f5393i = -1;
            this.f5398n = 0;
            interfaceC1748t0.mo450c(key, isKeyShifted ? key.f5231n : key.f5230m);
        }
        this.f5397m.f5379a = i;
        this.f5399o = j;
    }

    /* renamed from: b */
    public Key getKey(int i) {
        if (m850f(i)) {
            return this.mKeys[i];
        }
        return null;
    }

    /* renamed from: c */
    public boolean m853c() {
        return this.f5393i > 1;
    }

    /* renamed from: d */
    public final boolean m852d(int i, int i2, int i3) {
        if (this.mKeys == null || this.f5391g < 0) {
            throw new IllegalStateException("keyboard and/or hysteresis not set");
        }
        int i4 = this.f5392h.f5373b;
        if (i3 == i4) {
            return true;
        }
        if (m850f(i4)) {
            Key key = this.mKeys[i4];
            int i5 = key.x;
            int i6 = key.width + i5;
            int i7 = key.y;
            int i8 = key.height + i7;
            if (i >= i5) {
                i5 = i > i6 ? i6 : i;
            }
            if (i2 >= i7) {
                i7 = i2 > i8 ? i8 : i2;
            }
            int i9 = i - i5;
            int i10 = i2 - i7;
            return (i10 * i10) + (i9 * i9) < this.f5391g;
        }
        return false;
    }

    /* renamed from: e */
    public boolean m851e() {
        Key key = getKey(this.f5392h.f5373b);
        return key != null && key.f5236s;
    }

    /* renamed from: f */
    public final boolean m850f(int i) {
        return i >= 0 && i < this.mKeys.length;
    }

    /* renamed from: g */
    public void m849g() {
        this.f5393i = -1;
        this.f5387c.m890a();
        int i = this.f5392h.f5373b;
        ((AnyKeyboardViewBase) this.f5386b).m396q(i, this);
        m844l(-1);
        if (m850f(i)) {
            ((AnyKeyboardViewBase) this.f5386b).m394s(this.mKeys[i]);
        }
        this.f5395k = true;
    }

    /* renamed from: h */
    public void m848h(int i, int i2, long j) {
        int i3;
        int i4;
        this.f5387c.m890a();
        ((AnyKeyboardViewBase) this.f5386b).m396q(this.f5392h.f5373b, this);
        m844l(-1);
        if (this.f5395k) {
            return;
        }
        C1750u0 c1750u0 = this.f5392h;
        c1750u0.f5376e = i;
        c1750u0.f5377f = i2;
        int mo842a = c1750u0.f5372a.mo842a(i, i2, null);
        if (m852d(i, i2, mo842a)) {
            C1750u0 c1750u02 = this.f5392h;
            mo842a = c1750u02.f5373b;
            int i5 = c1750u02.f5374c;
            i4 = c1750u02.f5375d;
            i3 = i5;
        } else {
            i3 = i;
            i4 = i2;
        }
        if (this.f5396l) {
            InterfaceC1748t0 interfaceC1748t0 = this.f5389e;
            Key key = getKey(mo842a);
            if (key != null && interfaceC1748t0 != null) {
                interfaceC1748t0.mo447i(key.getPrimaryCode());
            }
        } else {
            m855a(mo842a, i3, i4, j, true);
        }
        if (m850f(mo842a)) {
            ((AnyKeyboardViewBase) this.f5386b).m394s(this.mKeys[mo842a]);
        }
    }

    /* renamed from: i */
    public void m847i(int i) {
        Key key = getKey(i);
        if (key != null) {
            m855a(i, key.x, key.y, -1L, false);
        }
    }

    /* renamed from: j */
    public final void m846j() {
        this.f5397m.f5379a = -1;
        this.f5398n = 0;
        this.f5399o = -1L;
        this.f5400p = false;
    }

    /* renamed from: k */
    public void m845k(Key[] keyArr, float f) {
        if (keyArr == null || f < 0.0f) {
            throw new IllegalArgumentException();
        }
        this.mKeys = keyArr;
        this.f5391g = (int) (f * f);
        this.f5394j = true;
    }

    /* renamed from: l */
    public final void m844l(int i) {
        CharSequence str;
        if (!this.f5395k) {
            int i2 = this.f5401q;
            this.f5401q = i;
            if (i != i2) {
                if (m850f(i2)) {
                    Key[] keyArr = this.mKeys;
                    keyArr[i2].f5229l = false;
                    ((AnyKeyboardViewBase) this.f5386b).m394s(keyArr[i2]);
                }
                if (m850f(i)) {
                    Key[] keyArr2 = this.mKeys;
                    keyArr2[i].f5229l = true;
                    ((AnyKeyboardViewBase) this.f5386b).m394s(keyArr2[i]);
                }
            }
        }
        if (m853c()) {
            return;
        }
        AnyKeyboardViewBase anyKeyboardViewBase = (AnyKeyboardViewBase) this.f5386b;
        anyKeyboardViewBase.getClass();
        Key key = getKey(i);
        if (i == -1 || key == null) {
            return;
        }
        Drawable m401l = anyKeyboardViewBase.m401l(key, true);
        if (m401l != null) {
            anyKeyboardViewBase.f6493e0.mo876d(key, m401l, anyKeyboardViewBase, anyKeyboardViewBase.f6496g);
            return;
        }
        boolean isKeyShifted = this.mKeyDetector.isKeyShifted(key);
        if (isKeyShifted && !TextUtils.isEmpty(key.f5209A)) {
            str = key.f5209A;
        } else if (TextUtils.isEmpty(key.f5219b)) {
            int m897d = key.m897d(this.f5398n);
            if (m897d < 32) {
                m897d = 32;
            }
            str = new String(new int[]{m897d}, 0, 1);
        } else {
            CharSequence charSequence = key.f5219b;
            str = isKeyShifted ? charSequence.toString().toUpperCase(Locale.getDefault()) : charSequence;
        }
        if (TextUtils.isEmpty(str)) {
            str = anyKeyboardViewBase.m397p(key.getPrimaryCode());
        }
        anyKeyboardViewBase.f6493e0.mo877c(key, str, anyKeyboardViewBase, anyKeyboardViewBase.f6496g);
    }

    /* renamed from: m */
    public final void m843m(int i) {
        if (m853c()) {
            this.f5387c.removeMessages(4);
            return;
        }
        Key key = this.mKeys[i];
        int i2 = key.f5218a.length == 0 && key.f5239v != 0 && TextUtils.isEmpty(key.f5230m) ? 1 : this.f5397m.f5381c;
        HandlerC1694a0 handlerC1694a0 = this.f5387c;
        handlerC1694a0.removeMessages(4);
        handlerC1694a0.sendMessageDelayed(handlerC1694a0.obtainMessage(4, i, 0, this), i2);
    }
}