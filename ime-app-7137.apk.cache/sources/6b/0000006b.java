package androidx.core.app;

import android.app.PendingIntent;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p010b.p090y.AbstractC1107b;
import p010b.p090y.C1108c;
import p010b.p090y.InterfaceC1109d;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC1107b abstractC1107b) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC1109d interfaceC1109d = remoteActionCompat.f460a;
        if (abstractC1107b.mo1221h(1)) {
            interfaceC1109d = abstractC1107b.m1227k();
        }
        remoteActionCompat.f460a = (IconCompat) interfaceC1109d;
        remoteActionCompat.f461b = abstractC1107b.m1230g(remoteActionCompat.f461b, 2);
        remoteActionCompat.f462c = abstractC1107b.m1230g(remoteActionCompat.f462c, 3);
        remoteActionCompat.f463d = (PendingIntent) abstractC1107b.m1228j(remoteActionCompat.f463d, 4);
        remoteActionCompat.f464e = abstractC1107b.m1231f(remoteActionCompat.f464e, 5);
        remoteActionCompat.f465f = abstractC1107b.m1231f(remoteActionCompat.f465f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC1107b abstractC1107b) {
        abstractC1107b.getClass();
        IconCompat iconCompat = remoteActionCompat.f460a;
        abstractC1107b.mo1220l(1);
        abstractC1107b.m1224o(iconCompat);
        CharSequence charSequence = remoteActionCompat.f461b;
        abstractC1107b.mo1220l(2);
        C1108c c1108c = (C1108c) abstractC1107b;
        TextUtils.writeToParcel(charSequence, c1108c.f4151e, 0);
        CharSequence charSequence2 = remoteActionCompat.f462c;
        abstractC1107b.mo1220l(3);
        TextUtils.writeToParcel(charSequence2, c1108c.f4151e, 0);
        abstractC1107b.m1225n(remoteActionCompat.f463d, 4);
        boolean z = remoteActionCompat.f464e;
        abstractC1107b.mo1220l(5);
        c1108c.f4151e.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f465f;
        abstractC1107b.mo1220l(6);
        c1108c.f4151e.writeInt(z2 ? 1 : 0);
    }
}