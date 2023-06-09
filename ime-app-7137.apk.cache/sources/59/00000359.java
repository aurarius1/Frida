package p010b.p067m.p068d;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p010b.p036g.C0390n;
import p010b.p067m.AbstractC0667c;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.m.d.o0 */
/* loaded from: classes.dex */
public class LayoutInflater$Factory2C0725o0 implements LayoutInflater.Factory2 {

    /* renamed from: b */
    public final C0690f1 f3078b;

    public LayoutInflater$Factory2C0725o0(C0690f1 c0690f1) {
        this.f3078b = c0690f1;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0157  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        C0718m1 m2052j;
        StringBuilder sb;
        String str2;
        View view2;
        if (C0713l0.class.getName().equals(str)) {
            return new C0713l0(context, attributeSet, this.f3078b);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0667c.Fragment);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(AbstractC0667c.Fragment_android_name);
            }
            int resourceId = obtainStyledAttributes.getResourceId(AbstractC0667c.Fragment_android_id, -1);
            String string = obtainStyledAttributes.getString(AbstractC0667c.Fragment_android_tag);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                ClassLoader classLoader = context.getClassLoader();
                C0390n c0390n = C0752v0.f3174a;
                try {
                    z = AbstractComponentCallbacksC0763z.class.isAssignableFrom(C0752v0.m1935b(classLoader, attributeValue));
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    AbstractComponentCallbacksC0763z m2087J = resourceId != -1 ? this.f3078b.m2087J(resourceId) : null;
                    if (m2087J == null && string != null) {
                        m2087J = this.f3078b.m2086K(string);
                    }
                    if (m2087J == null && id != -1) {
                        m2087J = this.f3078b.m2087J(id);
                    }
                    if (m2087J == null) {
                        C0752v0 m2081P = this.f3078b.m2081P();
                        context.getClassLoader();
                        m2087J = m2081P.m1936a(attributeValue);
                        m2087J.f3243p = true;
                        m2087J.f3252y = resourceId != 0 ? resourceId : id;
                        m2087J.f3253z = id;
                        m2087J.f3208A = string;
                        m2087J.f3244q = true;
                        C0690f1 c0690f1 = this.f3078b;
                        m2087J.f3248u = c0690f1;
                        C0677c0 c0677c0 = c0690f1.f2983q;
                        m2087J.f3249v = c0677c0;
                        Context context2 = c0677c0.f2924c;
                        m2087J.m1875e0(attributeSet, m2087J.f3231d);
                        m2052j = this.f3078b.m2070a(m2087J);
                        if (C0690f1.m2078S(2)) {
                            sb = new StringBuilder();
                            sb.append("Fragment ");
                            sb.append(m2087J);
                            str2 = " has been inflated via the <fragment> tag: id=0x";
                            sb.append(str2);
                            sb.append(Integer.toHexString(resourceId));
                            sb.toString();
                        }
                        m2087J.f3215H = (ViewGroup) view;
                        m2052j.m1997k();
                        m2052j.m1998j();
                        view2 = m2087J.f3216I;
                        if (view2 == null) {
                            if (resourceId != 0) {
                                view2.setId(resourceId);
                            }
                            if (m2087J.f3216I.getTag() == null) {
                                m2087J.f3216I.setTag(string);
                            }
                            m2087J.f3216I.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC0721n0(this, m2052j));
                            return m2087J.f3216I;
                        }
                        throw new IllegalStateException(AbstractC1124a.m1189g("Fragment ", attributeValue, " did not create a view."));
                    } else if (m2087J.f3244q) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    } else {
                        m2087J.f3244q = true;
                        C0690f1 c0690f12 = this.f3078b;
                        m2087J.f3248u = c0690f12;
                        C0677c0 c0677c02 = c0690f12.f2983q;
                        m2087J.f3249v = c0677c02;
                        Context context3 = c0677c02.f2924c;
                        m2087J.m1875e0(attributeSet, m2087J.f3231d);
                        m2052j = this.f3078b.m2052j(m2087J);
                        if (C0690f1.m2078S(2)) {
                            sb = new StringBuilder();
                            sb.append("Retained Fragment ");
                            sb.append(m2087J);
                            str2 = " has been re-attached via the <fragment> tag: id=0x";
                            sb.append(str2);
                            sb.append(Integer.toHexString(resourceId));
                            sb.toString();
                        }
                        m2087J.f3215H = (ViewGroup) view;
                        m2052j.m1997k();
                        m2052j.m1998j();
                        view2 = m2087J.f3216I;
                        if (view2 == null) {
                        }
                    }
                }
            }
            return null;
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}