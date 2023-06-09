package p093c.p097b.p102d0.p103k;

import android.widget.ImageView;
import com.anysoftkeyboard.quicktextkeys.p179ui.QuickTextPagerView;
import java.util.List;
import p010b.p091z.p092a.InterfaceC1119j;
import p093c.p097b.p102d0.C1188e;

/* renamed from: c.b.d0.k.i */
/* loaded from: classes.dex */
public class C1202i implements InterfaceC1119j {

    /* renamed from: a */
    public final /* synthetic */ List f4363a;

    /* renamed from: b */
    public final /* synthetic */ C1203j f4364b;

    /* renamed from: c */
    public final /* synthetic */ ImageView f4365c;

    public C1202i(QuickTextPagerView quickTextPagerView, List list, C1203j c1203j, ImageView imageView) {
        this.f4363a = list;
        this.f4364b = c1203j;
        this.f4365c = imageView;
    }

    @Override // p010b.p091z.p092a.InterfaceC1119j
    /* renamed from: a */
    public void mo813a(int i, float f, int i2) {
    }

    @Override // p010b.p091z.p092a.InterfaceC1119j
    /* renamed from: b */
    public void mo812b(int i) {
    }

    @Override // p010b.p091z.p092a.InterfaceC1119j
    /* renamed from: c */
    public void mo811c(int i) {
        this.f4364b.f4366a.edit().putString("KEY_QUICK_TEXT_PREF_LAST_SELECTED_TAB_ADD_ON_ID", ((C1188e) this.f4363a.get(i)).f4705a.toString()).apply();
        this.f4365c.setVisibility(i == 0 ? 0 : 8);
    }
}