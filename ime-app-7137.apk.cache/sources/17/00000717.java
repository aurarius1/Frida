package p093c.p097b.p130z;

import android.content.res.Resources;
import com.menny.android.anysoftkeyboard.R;

/* renamed from: c.b.z.m0 */
/* loaded from: classes.dex */
public class C1683m0 implements InterfaceC1677j0 {

    /* renamed from: a */
    public final /* synthetic */ Resources f5181a;

    /* renamed from: b */
    public final /* synthetic */ C1687o0 f5182b;

    public C1683m0(C1687o0 c1687o0, Resources resources) {
        this.f5182b = c1687o0;
        this.f5181a = resources;
    }

    @Override // p093c.p097b.p130z.InterfaceC1677j0
    /* renamed from: a */
    public float mo866a() {
        return this.f5181a.getDimensionPixelOffset(R.dimen.default_key_horizontal_gap);
    }

    @Override // p093c.p097b.p130z.InterfaceC1677j0
    /* renamed from: b */
    public int mo865b() {
        return this.f5181a.getDimensionPixelOffset(R.dimen.default_key_tall_height);
    }

    @Override // p093c.p097b.p130z.InterfaceC1677j0
    /* renamed from: c */
    public float mo864c() {
        return this.f5181a.getDimensionPixelOffset(R.dimen.default_key_vertical_gap);
    }

    @Override // p093c.p097b.p130z.InterfaceC1677j0
    /* renamed from: d */
    public float mo863d() {
        return this.f5181a.getDimensionPixelOffset(R.dimen.default_paddingBottom);
    }

    @Override // p093c.p097b.p130z.InterfaceC1677j0
    /* renamed from: e */
    public int mo862e() {
        return this.f5182b.f5192i.getResources().getDisplayMetrics().widthPixels;
    }

    @Override // p093c.p097b.p130z.InterfaceC1677j0
    /* renamed from: f */
    public int mo861f() {
        return this.f5181a.getDimensionPixelOffset(R.dimen.default_key_half_height);
    }

    @Override // p093c.p097b.p130z.InterfaceC1677j0
    /* renamed from: g */
    public int mo860g() {
        return this.f5181a.getDimensionPixelOffset(R.dimen.default_key_height);
    }
}