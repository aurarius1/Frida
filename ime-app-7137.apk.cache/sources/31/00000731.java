package p093c.p097b.p130z.p132r0.p134b1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.menny.android.anysoftkeyboard.R;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import p093c.p097b.p130z.Key;

/* renamed from: c.b.z.r0.b1.h */
/* loaded from: classes.dex */
public class C1709h implements InterfaceC1706e {

    /* renamed from: a */
    public static final InterfaceC1704c f5281a = new C1707f();

    /* renamed from: c */
    public final int f5283c;

    /* renamed from: g */
    public final Context f5287g;

    /* renamed from: h */
    public final HandlerC1708g f5288h;

    /* renamed from: i */
    public final InterfaceC1711j f5289i;

    /* renamed from: b */
    public final int[] f5282b = new int[2];

    /* renamed from: d */
    public final Queue f5284d = new ArrayDeque();

    /* renamed from: e */
    public final Queue f5285e = new ArrayDeque();

    /* renamed from: f */
    public final Map f5286f = new HashMap();

    public C1709h(Context context, InterfaceC1711j interfaceC1711j, int i) {
        this.f5287g = context;
        this.f5289i = interfaceC1711j;
        this.f5288h = new HandlerC1708g(this, context.getResources().getInteger(R.integer.preview_dismiss_delay));
        this.f5283c = i;
    }

    @Override // p093c.p097b.p130z.p132r0.p134b1.InterfaceC1706e
    /* renamed from: a */
    public void mo879a() {
        mo878b();
        this.f5284d.clear();
    }

    @Override // p093c.p097b.p130z.p132r0.p134b1.InterfaceC1706e
    /* renamed from: b */
    public void mo878b() {
        this.f5288h.removeMessages(R.id.popup_manager_dismiss_preview_message_id);
        for (InterfaceC1704c interfaceC1704c : this.f5285e) {
            interfaceC1704c.dismiss();
            this.f5284d.add(interfaceC1704c);
        }
        this.f5285e.clear();
        this.f5286f.clear();
    }

    @Override // p093c.p097b.p130z.p132r0.p134b1.InterfaceC1706e
    /* renamed from: c */
    public void mo877c(Key key, CharSequence charSequence, View view, C1712k c1712k) {
        InterfaceC1704c m881f = m881f(key, view, c1712k);
        InterfaceC1711j interfaceC1711j = this.f5289i;
        view.getLocationInWindow(this.f5282b);
        m881f.mo883a(key, charSequence, interfaceC1711j.mo874a(key, c1712k, this.f5282b));
    }

    @Override // p093c.p097b.p130z.p132r0.p134b1.InterfaceC1706e
    /* renamed from: d */
    public void mo876d(Key key, Drawable drawable, View view, C1712k c1712k) {
        InterfaceC1704c m881f = m881f(key, view, c1712k);
        InterfaceC1711j interfaceC1711j = this.f5289i;
        view.getLocationInWindow(this.f5282b);
        m881f.mo882b(key, drawable, interfaceC1711j.mo874a(key, c1712k, this.f5282b));
    }

    @Override // p093c.p097b.p130z.p132r0.p134b1.InterfaceC1706e
    /* renamed from: e */
    public void mo875e(Key key) {
        HandlerC1708g handlerC1708g = this.f5288h;
        handlerC1708g.removeMessages(R.id.popup_manager_dismiss_preview_message_id, key);
        handlerC1708g.sendMessageDelayed(handlerC1708g.obtainMessage(R.id.popup_manager_dismiss_preview_message_id, key), handlerC1708g.f5280b);
    }

    /* renamed from: f */
    public final InterfaceC1704c m881f(Key key, View view, C1712k c1712k) {
        InterfaceC1704c interfaceC1704c;
        this.f5288h.removeMessages(R.id.popup_manager_dismiss_preview_message_id, key);
        if (m880g(key) || c1712k.f5290a <= 0) {
            return f5281a;
        }
        if (!this.f5286f.containsKey(key)) {
            if (!this.f5284d.isEmpty()) {
                interfaceC1704c = (InterfaceC1704c) this.f5284d.remove();
            } else if (this.f5285e.size() < this.f5283c) {
                C1705d c1705d = new C1705d(this.f5287g, view, c1712k);
                this.f5286f.put(key, c1705d);
                this.f5285e.add(c1705d);
            } else {
                interfaceC1704c = (InterfaceC1704c) this.f5285e.remove();
                Key key2 = null;
                Iterator it = this.f5286f.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (entry.getValue() == interfaceC1704c) {
                        key2 = (Key) entry.getKey();
                        break;
                    }
                }
                this.f5286f.remove(key2);
            }
            this.f5286f.put(key, interfaceC1704c);
            this.f5285e.add(interfaceC1704c);
        }
        return (InterfaceC1704c) this.f5286f.get(key);
    }

    /* renamed from: g */
    public final boolean m880g(Key key) {
        if (key != null && !key.f5236s && key.f5242y) {
            int[] iArr = key.f5218a;
            if (iArr.length != 0) {
                if (iArr.length != 1) {
                    return false;
                }
                int primaryCode = key.getPrimaryCode();
                if (!(primaryCode <= 0 || primaryCode == 10 || primaryCode == 32)) {
                    return false;
                }
            }
        }
        return true;
    }
}