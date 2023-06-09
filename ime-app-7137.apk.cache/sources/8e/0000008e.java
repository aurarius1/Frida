package androidx.multidex;

import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.File;
import p010b.p079r.AbstractC0846f;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* loaded from: classes.dex */
public class MultiDexApplication extends Application {
    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        ApplicationInfo applicationInfo;
        super.attachBaseContext(context);
        if (AbstractC0846f.f3398b) {
            return;
        }
        try {
            try {
                applicationInfo = getApplicationInfo();
            } catch (RuntimeException unused) {
                applicationInfo = null;
            }
            if (applicationInfo == null) {
                return;
            }
            AbstractC0846f.m1780c(this, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir), "secondary-dexes", "", true);
        } catch (Exception e) {
            StringBuilder m1187i = AbstractC1124a.m1187i("MultiDex installation failed (");
            m1187i.append(e.getMessage());
            m1187i.append(").");
            throw new RuntimeException(m1187i.toString());
        }
    }
}