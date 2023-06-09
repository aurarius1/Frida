package p010b.p082t;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p010b.p016c.p018l.p019a.AbstractC0142b;
import p010b.p046j.p058l.AbstractC0605j0;
import p010b.p083u.p084e.AbstractC0932e1;
import p010b.p083u.p084e.AbstractC0941g2;

/* renamed from: b.t.d0 */
/* loaded from: classes.dex */
public class C0865d0 extends AbstractC0932e1 {

    /* renamed from: d */
    public PreferenceGroup f3451d;

    /* renamed from: e */
    public List f3452e;

    /* renamed from: f */
    public List f3453f;

    /* renamed from: g */
    public List f3454g;

    /* renamed from: i */
    public Runnable f3456i = new RunnableC0859a0(this);

    /* renamed from: h */
    public Handler f3455h = new Handler();

    public C0865d0(PreferenceGroup preferenceGroup) {
        this.f3451d = preferenceGroup;
        this.f3451d.f602I = this;
        this.f3452e = new ArrayList();
        this.f3453f = new ArrayList();
        this.f3454g = new ArrayList();
        PreferenceGroup preferenceGroup2 = this.f3451d;
        m1682g(preferenceGroup2 instanceof PreferenceScreen ? ((PreferenceScreen) preferenceGroup2).f643X : true);
        m1753m();
    }

    @Override // p010b.p083u.p084e.AbstractC0932e1
    /* renamed from: a */
    public int mo543a() {
        return this.f3453f.size();
    }

    @Override // p010b.p083u.p084e.AbstractC0932e1
    /* renamed from: b */
    public long mo558b(int i) {
        if (this.f3590b) {
            return m1756j(i).mo1747d();
        }
        return -1L;
    }

    @Override // p010b.p083u.p084e.AbstractC0932e1
    /* renamed from: c */
    public int mo1106c(int i) {
        C0863c0 c0863c0 = new C0863c0(m1756j(i));
        int indexOf = this.f3454g.indexOf(c0863c0);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.f3454g.size();
        this.f3454g.add(c0863c0);
        return size;
    }

    @Override // p010b.p083u.p084e.AbstractC0932e1
    /* renamed from: e */
    public void mo542e(AbstractC0941g2 abstractC0941g2, int i) {
        m1756j(i).mo0r((C0881l0) abstractC0941g2);
    }

    @Override // p010b.p083u.p084e.AbstractC0932e1
    /* renamed from: f */
    public AbstractC0941g2 mo541f(ViewGroup viewGroup, int i) {
        C0863c0 c0863c0 = (C0863c0) this.f3454g.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, AbstractC0897t0.BackgroundStyle);
        Drawable drawable = obtainStyledAttributes.getDrawable(AbstractC0897t0.BackgroundStyle_android_selectableItemBackground);
        if (drawable == null) {
            drawable = AbstractC0142b.m3000b(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(c0863c0.f3448a, viewGroup, false);
        if (inflate.getBackground() == null) {
            AtomicInteger atomicInteger = AbstractC0605j0.f2748a;
            if (Build.VERSION.SDK_INT >= 16) {
                inflate.setBackground(drawable);
            } else {
                inflate.setBackgroundDrawable(drawable);
            }
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i2 = c0863c0.f3449b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new C0881l0(inflate);
    }

    /* renamed from: h */
    public final List m1758h(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int m3267P = preferenceGroup.m3267P();
        int i = 0;
        for (int i2 = 0; i2 < m3267P; i2++) {
            Preference m3268O = preferenceGroup.m3268O(i2);
            if (m3268O.f632y) {
                if (!m1755k(preferenceGroup) || i < preferenceGroup.f640V) {
                    arrayList.add(m3268O);
                } else {
                    arrayList2.add(m3268O);
                }
                if (m3268O instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) m3268O;
                    if (!(!(preferenceGroup2 instanceof PreferenceScreen))) {
                        continue;
                    } else if (m1755k(preferenceGroup) && m1755k(preferenceGroup2)) {
                        throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                    } else {
                        Iterator it = ((ArrayList) m1758h(preferenceGroup2)).iterator();
                        while (it.hasNext()) {
                            Preference preference = (Preference) it.next();
                            if (!m1755k(preferenceGroup) || i < preferenceGroup.f640V) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        if (m1755k(preferenceGroup) && i > preferenceGroup.f640V) {
            C0870g c0870g = new C0870g(preferenceGroup.f609b, arrayList2, preferenceGroup.f611d);
            c0870g.f614g = new C0861b0(this, preferenceGroup);
            arrayList.add(c0870g);
        }
        return arrayList;
    }

    /* renamed from: i */
    public final void m1757i(List list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.f636R);
        }
        int m3267P = preferenceGroup.m3267P();
        for (int i = 0; i < m3267P; i++) {
            Preference m3268O = preferenceGroup.m3268O(i);
            list.add(m3268O);
            C0863c0 c0863c0 = new C0863c0(m3268O);
            if (!this.f3454g.contains(c0863c0)) {
                this.f3454g.add(c0863c0);
            }
            if (m3268O instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) m3268O;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    m1757i(list, preferenceGroup2);
                }
            }
            m3268O.f602I = this;
        }
    }

    /* renamed from: j */
    public Preference m1756j(int i) {
        if (i < 0 || i >= mo543a()) {
            return null;
        }
        return (Preference) this.f3453f.get(i);
    }

    /* renamed from: k */
    public final boolean m1755k(PreferenceGroup preferenceGroup) {
        return preferenceGroup.f640V != Integer.MAX_VALUE;
    }

    /* renamed from: l */
    public void m1754l() {
        this.f3455h.removeCallbacks(this.f3456i);
        this.f3455h.post(this.f3456i);
    }

    /* renamed from: m */
    public void m1753m() {
        for (Preference preference : this.f3452e) {
            preference.f602I = null;
        }
        ArrayList arrayList = new ArrayList(this.f3452e.size());
        this.f3452e = arrayList;
        m1757i(arrayList, this.f3451d);
        this.f3453f = m1758h(this.f3451d);
        C0875i0 c0875i0 = this.f3451d.f610c;
        this.f3589a.m1680b();
        for (Preference preference2 : this.f3452e) {
            preference2.getClass();
        }
    }
}