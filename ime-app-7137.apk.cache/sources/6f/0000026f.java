package p010b.p046j.p047d;

import android.app.Notification;
import android.os.Binder;
import androidx.core.app.NotificationCompatSideChannelService;
import p000a.p001a.p002a.p003a.AbstractBinderC0001b;

/* renamed from: b.j.d.x */
/* loaded from: classes.dex */
public class BinderC0491x extends AbstractBinderC0001b {

    /* renamed from: b */
    public final /* synthetic */ NotificationCompatSideChannelService f2508b;

    public BinderC0491x(NotificationCompatSideChannelService notificationCompatSideChannelService) {
        this.f2508b = notificationCompatSideChannelService;
    }

    @Override // p000a.p001a.p002a.p003a.InterfaceC0002c
    /* renamed from: a */
    public void mo2413a(String str, int i, String str2, Notification notification) {
        this.f2508b.m3340c(Binder.getCallingUid(), str);
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            this.f2508b.m3339d(str, i, str2, notification);
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }
}