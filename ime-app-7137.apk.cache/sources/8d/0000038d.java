package p010b.p072o;

/* renamed from: b.o.f */
/* loaded from: classes.dex */
public enum EnumC0777f {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    /* renamed from: b */
    public static EnumC0777f m1828b(EnumC0778g enumC0778g) {
        int ordinal = enumC0778g.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return null;
                }
                return ON_RESUME;
            }
            return ON_START;
        }
        return ON_CREATE;
    }

    /* renamed from: a */
    public EnumC0778g m1829a() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return EnumC0778g.RESUMED;
                }
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return EnumC0778g.DESTROYED;
                        }
                        throw new IllegalArgumentException(this + " has no target state");
                    }
                }
            }
            return EnumC0778g.STARTED;
        }
        return EnumC0778g.CREATED;
    }
}