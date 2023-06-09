package p093c.p097b.p100c0;

import android.content.SharedPreferences;
import java.util.Map;
import p093c.p097b.p100c0.p101b0.C1153a;
import p093c.p097b.p100c0.p101b0.C1155c;
import p093c.p097b.p100c0.p101b0.InterfaceC1154b;

/* renamed from: c.b.c0.y */
/* loaded from: classes.dex */
public class C1181y implements InterfaceC1154b {

    /* renamed from: a */
    public final SharedPreferences f4310a;

    public C1181y(SharedPreferences sharedPreferences) {
        this.f4310a = sharedPreferences;
    }

    @Override // p093c.p097b.p100c0.p101b0.InterfaceC1154b
    /* renamed from: a */
    public void mo974a(C1155c c1155c) {
        SharedPreferences.Editor edit = this.f4310a.edit();
        for (Map.Entry<String, ?> entry : this.f4310a.getAll().entrySet()) {
            edit.remove(entry.getKey());
        }
        for (C1153a c1153a : c1155c.m1165c()) {
            InterfaceC1180x interfaceC1180x = null;
            String str = null;
            String str2 = null;
            for (Map.Entry entry2 : c1153a.m1164d()) {
                String str3 = (String) entry2.getKey();
                str3.hashCode();
                if (str3.equals("type")) {
                    String str4 = (String) entry2.getValue();
                    if (str4 != null) {
                        if (str4.equals("int")) {
                            interfaceC1180x = new InterfaceC1180x() { // from class: c.b.c0.r
                                @Override // p093c.p097b.p100c0.InterfaceC1180x
                                /* renamed from: a */
                                public final void mo1159a(SharedPreferences.Editor editor, String str5, String str6) {
                                    editor.putInt(str5, Integer.parseInt(str6));
                                }
                            };
                        } else if (str4.equals("bool")) {
                            interfaceC1180x = new InterfaceC1180x() { // from class: c.b.c0.t
                                @Override // p093c.p097b.p100c0.InterfaceC1180x
                                /* renamed from: a */
                                public final void mo1159a(SharedPreferences.Editor editor, String str5, String str6) {
                                    editor.putBoolean(str5, Boolean.valueOf(str6).booleanValue());
                                }
                            };
                        }
                    }
                    interfaceC1180x = new InterfaceC1180x() { // from class: c.b.c0.s
                        @Override // p093c.p097b.p100c0.InterfaceC1180x
                        /* renamed from: a */
                        public final void mo1159a(SharedPreferences.Editor editor, String str5, String str6) {
                            editor.putString(str5, str6.toString());
                        }
                    };
                } else {
                    String str5 = (String) entry2.getValue();
                    str2 = (String) entry2.getKey();
                    str = str5;
                }
                if (interfaceC1180x != null && str != null && str2 != null) {
                    interfaceC1180x.mo1159a(edit, str2, str);
                }
            }
        }
        edit.apply();
        C1151a0.m1168e(this.f4310a);
    }

    @Override // p093c.p097b.p100c0.p101b0.InterfaceC1154b
    /* renamed from: b */
    public C1155c mo973b() {
        C1155c c1155c = new C1155c(1);
        for (Map.Entry<String, ?> entry : this.f4310a.getAll().entrySet()) {
            Object value = entry.getValue();
            String str = null;
            if (value != null) {
                if (value instanceof Integer) {
                    str = "int";
                } else if (value instanceof String) {
                    str = "string";
                } else if (value instanceof Boolean) {
                    str = "bool";
                }
            }
            if (str != null && entry.getValue() != null) {
                C1153a m1166b = c1155c.m1166b();
                m1166b.m1167a("type", str);
                m1166b.m1167a(entry.getKey(), entry.getValue().toString());
            }
        }
        return c1155c;
    }

    @Override // p093c.p097b.p100c0.p101b0.InterfaceC1154b
    /* renamed from: c */
    public String mo972c() {
        return "SharedPreferences";
    }
}