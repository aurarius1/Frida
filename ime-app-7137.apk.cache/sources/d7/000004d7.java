package p010b.p090y;

import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p010b.p036g.C0378b;

/* renamed from: b.y.b */
/* loaded from: classes.dex */
public abstract class AbstractC1107b {

    /* renamed from: a */
    public final C0378b f4147a;

    /* renamed from: b */
    public final C0378b f4148b;

    /* renamed from: c */
    public final C0378b f4149c;

    public AbstractC1107b(C0378b c0378b, C0378b c0378b2, C0378b c0378b3) {
        this.f4147a = c0378b;
        this.f4148b = c0378b2;
        this.f4149c = c0378b3;
    }

    /* renamed from: a */
    public abstract void mo1223a();

    /* renamed from: b */
    public abstract AbstractC1107b mo1222b();

    /* renamed from: c */
    public final Class m1234c(Class cls) {
        Class cls2 = (Class) this.f4149c.getOrDefault(cls.getName(), null);
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.f4149c.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    /* renamed from: d */
    public final Method m1233d(String str) {
        Method method = (Method) this.f4147a.getOrDefault(str, null);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, AbstractC1107b.class.getClassLoader()).getDeclaredMethod("read", AbstractC1107b.class);
            this.f4147a.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* renamed from: e */
    public final Method m1232e(Class cls) {
        Method method = (Method) this.f4148b.getOrDefault(cls.getName(), null);
        if (method == null) {
            Class m1234c = m1234c(cls);
            System.currentTimeMillis();
            Method declaredMethod = m1234c.getDeclaredMethod("write", cls, AbstractC1107b.class);
            this.f4148b.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* renamed from: f */
    public boolean m1231f(boolean z, int i) {
        return !mo1221h(i) ? z : ((C1108c) this).f4151e.readInt() != 0;
    }

    /* renamed from: g */
    public CharSequence m1230g(CharSequence charSequence, int i) {
        return !mo1221h(i) ? charSequence : (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C1108c) this).f4151e);
    }

    /* renamed from: h */
    public abstract boolean mo1221h(int i);

    /* renamed from: i */
    public int m1229i(int i, int i2) {
        return !mo1221h(i2) ? i : ((C1108c) this).f4151e.readInt();
    }

    /* renamed from: j */
    public Parcelable m1228j(Parcelable parcelable, int i) {
        return !mo1221h(i) ? parcelable : ((C1108c) this).f4151e.readParcelable(C1108c.class.getClassLoader());
    }

    /* renamed from: k */
    public InterfaceC1109d m1227k() {
        String readString = ((C1108c) this).f4151e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (InterfaceC1109d) m1233d(readString).invoke(null, mo1222b());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    /* renamed from: l */
    public abstract void mo1220l(int i);

    /* renamed from: m */
    public void m1226m(int i, int i2) {
        mo1220l(i2);
        ((C1108c) this).f4151e.writeInt(i);
    }

    /* renamed from: n */
    public void m1225n(Parcelable parcelable, int i) {
        mo1220l(i);
        ((C1108c) this).f4151e.writeParcelable(parcelable, 0);
    }

    /* renamed from: o */
    public void m1224o(InterfaceC1109d interfaceC1109d) {
        if (interfaceC1109d == null) {
            ((C1108c) this).f4151e.writeString(null);
            return;
        }
        try {
            ((C1108c) this).f4151e.writeString(m1234c(interfaceC1109d.getClass()).getName());
            AbstractC1107b mo1222b = mo1222b();
            try {
                m1232e(interfaceC1109d.getClass()).invoke(null, interfaceC1109d, mo1222b);
                mo1222b.mo1223a();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(interfaceC1109d.getClass().getSimpleName() + " does not have a Parcelizer", e5);
        }
    }
}