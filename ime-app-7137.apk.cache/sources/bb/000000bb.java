package p010b.p011a;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import p010b.p011a.p013l.AbstractC0067e;
import p010b.p011a.p013l.C0065c;
import p010b.p011a.p013l.C0066d;
import p010b.p011a.p013l.InterfaceC0064b;
import p010b.p011a.p013l.p014h.AbstractC0071b;

/* renamed from: b.a.e */
/* loaded from: classes.dex */
public class C0055e {

    /* renamed from: a */
    public Random f836a = new Random();

    /* renamed from: b */
    public final Map f837b = new HashMap();

    /* renamed from: c */
    public final Map f838c = new HashMap();

    /* renamed from: d */
    public final Map f839d = new HashMap();

    /* renamed from: e */
    public ArrayList f840e = new ArrayList();

    /* renamed from: f */
    public final transient Map f841f = new HashMap();

    /* renamed from: g */
    public final Map f842g = new HashMap();

    /* renamed from: h */
    public final Bundle f843h = new Bundle();

    /* renamed from: i */
    public final /* synthetic */ AbstractActivityC0057g f844i;

    public C0055e(AbstractActivityC0057g abstractActivityC0057g) {
        this.f844i = abstractActivityC0057g;
    }

    /* renamed from: a */
    public final void m3099a(int i, String str) {
        this.f837b.put(Integer.valueOf(i), str);
        this.f838c.put(str, Integer.valueOf(i));
    }

    /* renamed from: b */
    public final boolean m3098b(int i, int i2, Intent intent) {
        String str = (String) this.f837b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        this.f840e.remove(str);
        m3097c(str, i2, intent, (C0066d) this.f841f.get(str));
        return true;
    }

    /* renamed from: c */
    public final void m3097c(String str, int i, Intent intent, C0066d c0066d) {
        InterfaceC0064b interfaceC0064b;
        if (c0066d != null && (interfaceC0064b = c0066d.f863a) != null) {
            interfaceC0064b.mo1841a(c0066d.f864b.mo2108c(i, intent));
            return;
        }
        this.f842g.remove(str);
        this.f843h.putParcelable(str, new ActivityResult(i, intent));
    }

    /* renamed from: d */
    public final int m3096d() {
        int nextInt = this.f836a.nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            if (!this.f837b.containsKey(Integer.valueOf(i))) {
                return i;
            }
            nextInt = this.f836a.nextInt(2147418112);
        }
    }

    /* renamed from: e */
    public final C0065c m3095e(String str, AbstractC0071b abstractC0071b, InterfaceC0064b interfaceC0064b) {
        int m3094f = m3094f(str);
        this.f841f.put(str, new C0066d(interfaceC0064b, abstractC0071b));
        if (this.f842g.containsKey(str)) {
            Object obj = this.f842g.get(str);
            this.f842g.remove(str);
            interfaceC0064b.mo1841a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f843h.getParcelable(str);
        if (activityResult != null) {
            this.f843h.remove(str);
            interfaceC0064b.mo1841a(abstractC0071b.mo2108c(activityResult.f129b, activityResult.f130c));
        }
        return new C0065c(this, str, m3094f, abstractC0071b);
    }

    /* renamed from: f */
    public final int m3094f(String str) {
        Integer num = (Integer) this.f838c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int m3096d = m3096d();
        m3099a(m3096d, str);
        return m3096d;
    }

    /* renamed from: g */
    public final void m3093g(String str) {
        Integer num;
        if (!this.f840e.contains(str) && (num = (Integer) this.f838c.remove(str)) != null) {
            this.f837b.remove(num);
        }
        this.f841f.remove(str);
        if (this.f842g.containsKey(str)) {
            String str2 = "Dropping pending result for request " + str + ": " + this.f842g.get(str);
            this.f842g.remove(str);
        }
        if (this.f843h.containsKey(str)) {
            String str3 = "Dropping pending result for request " + str + ": " + this.f843h.getParcelable(str);
            this.f843h.remove(str);
        }
        if (((AbstractC0067e) this.f839d.get(str)) != null) {
            throw null;
        }
    }
}