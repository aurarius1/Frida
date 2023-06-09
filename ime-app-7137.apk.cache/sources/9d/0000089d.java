package p093c.p176h.p177a.p178a;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.anysoftkeyboard.p180ui.SendBugReportUiActivity;
import com.menny.android.anysoftkeyboard.R;
import java.lang.Thread;
import java.lang.reflect.Field;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p010b.p046j.p047d.AbstractC0472e;
import p010b.p046j.p047d.C0488u;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p097b.p108i0.p109o.AbstractC1260g;
import p093c.p097b.p119s.p120b.AbstractC1442b;
import p183e.p184a.p189o.InterfaceC2123e;

/* renamed from: c.h.a.a.k */
/* loaded from: classes.dex */
public class C2073k implements Thread.UncaughtExceptionHandler, InterfaceC2123e {

    /* renamed from: b */
    public final Thread.UncaughtExceptionHandler f6257b;

    /* renamed from: c */
    public final Context f6258c;

    public C2073k(Context context, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f6258c = context;
        this.f6257b = uncaughtExceptionHandler;
    }

    /* renamed from: a */
    public final void m514a(StringBuilder sb, int i, Class cls) {
        Field[] fields;
        for (Field field : cls.getFields()) {
            if (field.getType().equals(Integer.TYPE) && (field.getModifiers() & 9) != 0) {
                try {
                    if (i == field.getInt(null)) {
                        sb.append(cls.getName());
                        sb.append(".");
                        sb.append(field.getName());
                        sb.append('\n');
                    }
                } catch (IllegalAccessException unused) {
                    field.getName();
                }
            }
        }
    }

    @Override // p183e.p184a.p189o.InterfaceC2123e
    public void accept(Object obj) {
        uncaughtException(Thread.currentThread(), (Throwable) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0164  */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void uncaughtException(Thread thread, Throwable th) {
        int i;
        StringBuilder sb;
        String str;
        String sb2;
        String message;
        th.printStackTrace();
        String m1032c = AbstractC1442b.m1032c(th);
        if (th instanceof NullPointerException) {
            if (m1032c.contains("android.inputmethodservice.IInputMethodSessionWrapper.executeMessage(IInputMethodSessionWrapper.java") || m1032c.contains("android.inputmethodservice.IInputMethodWrapper.executeMessage(IInputMethodWrapper.java")) {
                return;
            }
        } else if ((th instanceof TimeoutException) && m1032c.contains(".finalize")) {
            return;
        }
        String m1141a = AbstractC1260g.m1141a(this.f6258c);
        CharSequence format = DateFormat.format("kk:mm:ss dd.MM.yyyy", System.currentTimeMillis());
        String str2 = AbstractC1260g.f4451a;
        String str3 = ("Hi. It seems that we have crashed.... Here are some details:" + str2 + "****** UTC Time: " + ((Object) format) + str2 + "****** Application name: " + m1141a + str2 + "******************************" + str2 + "****** Exception type: " + th.getClass().getName() + str2 + "****** Exception message: " + th.getMessage() + str2 + "****** Trace trace:" + str2 + m1032c + str2) + "******************************" + str2 + "****** Device information:" + str2 + AbstractC1260g.m1140b(this.f6258c);
        if ((th instanceof OutOfMemoryError) || (th.getCause() != null && (th.getCause() instanceof OutOfMemoryError))) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append("******************************\n****** Memory:");
            sb3.append(str2);
            StringBuilder m1187i = AbstractC1124a.m1187i("Total: ");
            m1187i.append(Runtime.getRuntime().totalMemory());
            m1187i.append("\nFree: ");
            m1187i.append(Runtime.getRuntime().freeMemory());
            m1187i.append("\nMax: ");
            m1187i.append(Runtime.getRuntime().maxMemory());
            m1187i.append("\n");
            sb3.append(m1187i.toString());
            str3 = sb3.toString();
        }
        if (th instanceof Resources.NotFoundException) {
            try {
                message = ((Resources.NotFoundException) th).getMessage();
            } catch (NumberFormatException unused) {
            }
            if (!TextUtils.isEmpty(message)) {
                Matcher matcher = Pattern.compile("#0x([0-9a-fA-F]+)").matcher(message);
                if (matcher.find()) {
                    i = Integer.parseInt(matcher.group(1).trim(), 16);
                    String m1190f = AbstractC1124a.m1190f(str3, "******************************\n");
                    if (i != 0) {
                        sb2 = AbstractC1124a.m1190f(m1190f, "Failed to extract resource id from message\n");
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        m514a(sb4, i, AbstractC2074l.class);
                        m514a(sb4, i, AbstractC2075m.class);
                        m514a(sb4, i, AbstractC2076n.class);
                        m514a(sb4, i, AbstractC2077o.class);
                        m514a(sb4, i, AbstractC2078p.class);
                        m514a(sb4, i, AbstractC2079q.class);
                        m514a(sb4, i, AbstractC2080r.class);
                        m514a(sb4, i, AbstractC2081s.class);
                        m514a(sb4, i, AbstractC2082t.class);
                        m514a(sb4, i, AbstractC2083u.class);
                        m514a(sb4, i, AbstractC2084v.class);
                        m514a(sb4, i, AbstractC2085w.class);
                        m514a(sb4, i, AbstractC2086x.class);
                        m514a(sb4, i, AbstractC2087y.class);
                        m514a(sb4, i, AbstractC2088z.class);
                        m514a(sb4, i, AbstractC2062a0.class);
                        m514a(sb4, i, AbstractC2064b0.class);
                        if (TextUtils.isEmpty(sb4.toString())) {
                            sb = new StringBuilder();
                            sb.append(m1190f);
                            sb.append("Could not find matching resources for resource id ");
                            sb.append(i);
                            str = ", this may happen if the resource is from an external package.\n";
                        } else {
                            sb = new StringBuilder();
                            sb.append(m1190f);
                            sb.append("Possible resources for ");
                            sb.append(i);
                            str = ":\n";
                        }
                        sb.append(str);
                        sb2 = sb.toString();
                    }
                    str3 = AbstractC1124a.m1190f(sb2, "******************************\n");
                }
            }
            i = 0;
            String m1190f2 = AbstractC1124a.m1190f(str3, "******************************\n");
            if (i != 0) {
            }
            str3 = AbstractC1124a.m1190f(sb2, "******************************\n");
        }
        th.getClass().getSimpleName();
        th.getMessage();
        Intent intent = new Intent(this.f6258c, SendBugReportUiActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("EXTRA_KEY_BugReportDetails", new SendBugReportUiActivity.BugReportDetails(th, str3 + "******************************" + str2 + "****** Log-Cat:" + str2 + AbstractC1442b.m1034a()));
        PendingIntent activity = PendingIntent.getActivity(this.f6258c, 0, intent, 0);
        C0488u c0488u = new C0488u(this.f6258c, "Errors");
        c0488u.f2503n.icon = R.drawable.ic_notification_error;
        c0488u.f2500k = AbstractC0472e.m2431b(this.f6258c, R.color.notification_background_error);
        c0488u.f2503n.tickerText = C0488u.m2418b(this.f6258c.getText(R.string.ime_crashed_ticker));
        c0488u.f2494e = C0488u.m2418b(this.f6258c.getText(R.string.ime_name));
        c0488u.f2495f = C0488u.m2418b(this.f6258c.getText(R.string.ime_crashed_sub_text));
        c0488u.f2498i = C0488u.m2418b(null);
        c0488u.f2503n.when = System.currentTimeMillis();
        c0488u.f2496g = activity;
        c0488u.m2417c(16, true);
        c0488u.m2417c(8, true);
        Notification notification = c0488u.f2503n;
        notification.defaults = 6;
        notification.flags |= 1;
        ((NotificationManager) this.f6258c.getSystemService("notification")).notify(R.id.notification_icon_app_error, c0488u.m2419a());
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f6257b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}