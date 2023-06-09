package p010b.p077q;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import java.util.ArrayList;
import java.util.List;

/* renamed from: b.q.a0 */
/* loaded from: classes.dex */
public class C0804a0 {

    /* renamed from: a */
    public final Messenger f3317a;

    public C0804a0(Messenger messenger) {
        this.f3317a = messenger;
    }

    /* renamed from: a */
    public IBinder m1797a() {
        return this.f3317a.getBinder();
    }

    /* renamed from: b */
    public void m1796b(String str, List list, Bundle bundle, Bundle bundle2) {
        Bundle bundle3 = new Bundle();
        bundle3.putString("data_media_item_id", str);
        bundle3.putBundle("data_options", bundle);
        bundle3.putBundle("data_notify_children_changed_options", bundle2);
        if (list != null) {
            bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        }
        m1795c(3, bundle3);
    }

    /* renamed from: c */
    public final void m1795c(int i, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = 2;
        obtain.setData(bundle);
        this.f3317a.send(obtain);
    }
}