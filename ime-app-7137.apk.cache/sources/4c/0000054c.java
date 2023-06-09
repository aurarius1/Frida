package p093c.p097b.p106g0;

import java.util.Random;

/* renamed from: c.b.g0.g */
/* loaded from: classes.dex */
public class C1224g extends AbstractC1228k {

    /* renamed from: d */
    public static final Random f4398d = new Random();

    /* renamed from: e */
    public static final String[] f4399e = {"For here am I sitting in a tin can\nFar above the world\nPlanet Earth is blue\nAnd there's nothing I can do.", "Put on your red shoes\nAnd dance the blues.", "I'm the space invader"};

    public C1224g(AbstractC1222e abstractC1222e) {
        super("bowie", "https://open.spotify.com/playlist/37i9dQZF1DWTTthpScXd3v", new InterfaceC1227j() { // from class: c.b.g0.a
            @Override // p093c.p097b.p106g0.InterfaceC1227j
            /* renamed from: a */
            public final String mo1145a() {
                String[] strArr = C1224g.f4399e;
                return strArr[C1224g.f4398d.nextInt(strArr.length)];
            }
        }, 17301540);
    }
}