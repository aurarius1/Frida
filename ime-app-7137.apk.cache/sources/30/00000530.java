package p093c.p097b.p102d0.p103k;

import com.menny.android.anysoftkeyboard.R;
import java.util.Random;
import p093c.p097b.p100c0.C1151a0;
import p093c.p137d.p138a.p139a.C1785g;
import p181d.p182a.EnumC2090a;
import p183e.p184a.p187m.InterfaceC2112c;
import p183e.p184a.p189o.InterfaceC2123e;
import p183e.p184a.p190p.p192b.AbstractC2146l;

/* renamed from: c.b.d0.k.c */
/* loaded from: classes.dex */
public class C1196c implements InterfaceC2112c {

    /* renamed from: b */
    public final InterfaceC2112c f4340b;

    /* renamed from: c */
    public EnumC2090a f4341c = null;

    /* renamed from: d */
    public boolean f4342d = false;

    public C1196c(C1151a0 c1151a0) {
        this.f4340b = ((C1785g) c1151a0.m1170c(R.string.settings_key_default_emoji_gender, R.string.settings_default_emoji_gender)).f5459e.m164N(new InterfaceC2123e() { // from class: c.b.d0.k.a
            /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
                if (r7.equals("random") == false) goto L21;
             */
            @Override // p183e.p184a.p189o.InterfaceC2123e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void accept(Object obj) {
                EnumC2090a enumC2090a;
                C1196c c1196c = C1196c.this;
                String str = (String) obj;
                char c = 0;
                c1196c.f4342d = false;
                c1196c.f4341c = null;
                str.hashCode();
                int hashCode = str.hashCode();
                if (hashCode != -938285885) {
                    if (hashCode != 107866) {
                        if (hashCode == 113313666 && str.equals("woman")) {
                            c = 2;
                        }
                        c = 65535;
                    } else {
                        if (str.equals("man")) {
                            c = 1;
                        }
                        c = 65535;
                    }
                }
                if (c == 0) {
                    c1196c.f4342d = true;
                    return;
                }
                if (c == 1) {
                    enumC2090a = EnumC2090a.Man;
                } else if (c != 2) {
                    return;
                } else {
                    enumC2090a = EnumC2090a.Woman;
                }
                c1196c.f4341c = enumC2090a;
            }
        }, AbstractC2146l.f7040e, AbstractC2146l.f7038c, AbstractC2146l.f7039d);
    }

    /* renamed from: a */
    public EnumC2090a m1149a() {
        return this.f4342d ? new Random().nextBoolean() ? EnumC2090a.Woman : EnumC2090a.Man : this.f4341c;
    }

    @Override // p183e.p184a.p187m.InterfaceC2112c
    /* renamed from: e */
    public void mo35e() {
        this.f4340b.mo35e();
    }
}