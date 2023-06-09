package p093c.p097b.p108i0.p109o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Environment;
import android.preference.PreferenceManager;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import java.io.File;
import p093c.p094a.p095a.p096a.AbstractC1124a;
import p093c.p097b.p119s.p120b.AbstractC1442b;
import p093c.p097b.p121t.C1450g;

/* renamed from: c.b.i0.o.g */
/* loaded from: classes.dex */
public abstract class AbstractC1260g {

    /* renamed from: a */
    public static final String f4451a = AbstractC1442b.f4737a;

    /* renamed from: b */
    public static boolean f4452b = false;

    /* renamed from: a */
    public static String m1141a(Context context) {
        String str = context.getString(R.string.ime_name) + " (" + context.getPackageName() + ")";
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            String str2 = str + " v" + packageInfo.versionName + " release " + packageInfo.versionCode;
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(". Installed on ");
            C1450g c1450g = AnyApplication.f6979b;
            sb.append(PreferenceManager.getDefaultSharedPreferences(context).getLong("settings_key_first_time_current_version_installed", 0L));
            sb.append(", first release installed was ");
            sb.append(PreferenceManager.getDefaultSharedPreferences(context).getInt("settings_key_first_app_version_installed", 0));
            sb.append(".");
            return sb.toString();
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "NA";
        }
    }

    /* renamed from: b */
    public static String m1140b(Context context) {
        StringBuilder m1187i = AbstractC1124a.m1187i("BRAND:");
        m1187i.append(Build.BRAND);
        String str = f4451a;
        m1187i.append(str);
        m1187i.append("DEVICE:");
        m1187i.append(Build.DEVICE);
        m1187i.append(str);
        m1187i.append("Build ID:");
        m1187i.append(Build.DISPLAY);
        m1187i.append(str);
        m1187i.append("changelist number:");
        m1187i.append(Build.ID);
        m1187i.append("\n");
        m1187i.append("MODEL:");
        m1187i.append(Build.MODEL);
        m1187i.append(str);
        m1187i.append("PRODUCT:");
        m1187i.append(Build.PRODUCT);
        m1187i.append(str);
        m1187i.append("TAGS:");
        m1187i.append(Build.TAGS);
        m1187i.append(str);
        m1187i.append("VERSION.INCREMENTAL:");
        m1187i.append(Build.VERSION.INCREMENTAL);
        m1187i.append(str);
        m1187i.append("VERSION.RELEASE:");
        m1187i.append(Build.VERSION.RELEASE);
        m1187i.append(str);
        m1187i.append("VERSION.SDK_INT:");
        m1187i.append(Build.VERSION.SDK_INT);
        m1187i.append(str);
        if (context != null && context.getResources() != null && context.getResources().getConfiguration() != null) {
            Configuration configuration = context.getResources().getConfiguration();
            m1187i.append("Locale:");
            m1187i.append(configuration.locale);
            m1187i.append(str);
            m1187i.append("configuration:");
            m1187i.append(configuration.toString());
            m1187i.append(str);
        }
        m1187i.append("That's all I know.");
        return m1187i.toString();
    }

    /* renamed from: c */
    public static File m1139c() {
        return new File(Environment.getExternalStorageDirectory(), "AnySoftKeyboard_tracing.trace");
    }

    /* renamed from: d */
    public static boolean m1138d(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("KEY_SDCARD_TRACING_ENABLED", false);
    }
}