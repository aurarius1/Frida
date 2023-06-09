package p010b.p082t;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.DialogPreference;
import p010b.p016c.p017k.C0111l;
import p010b.p016c.p017k.C0119p;
import p010b.p016c.p017k.DialogInterfaceC0121q;
import p010b.p067m.p068d.AbstractActivityC0681d0;
import p010b.p067m.p068d.AbstractComponentCallbacksC0763z;
import p010b.p067m.p068d.DialogInterface$OnCancelListenerC0751v;

/* renamed from: b.t.t */
/* loaded from: classes.dex */
public abstract class AbstractDialogInterface$OnClickListenerC0896t extends DialogInterface$OnCancelListenerC0751v implements DialogInterface.OnClickListener {

    /* renamed from: m0 */
    public DialogPreference f3498m0;

    /* renamed from: n0 */
    public CharSequence f3499n0;

    /* renamed from: o0 */
    public CharSequence f3500o0;

    /* renamed from: p0 */
    public CharSequence f3501p0;

    /* renamed from: q0 */
    public CharSequence f3502q0;

    /* renamed from: r0 */
    public int f3503r0;

    /* renamed from: s0 */
    public BitmapDrawable f3504s0;

    /* renamed from: t0 */
    public int f3505t0;

    @Override // p010b.p067m.p068d.DialogInterface$OnCancelListenerC0751v
    /* renamed from: R0 */
    public Dialog mo14R0(Bundle bundle) {
        AbstractActivityC0681d0 m1872h = m1872h();
        this.f3505t0 = -2;
        C0119p c0119p = new C0119p(m1872h);
        CharSequence charSequence = this.f3499n0;
        C0111l c0111l = c0119p.f1026a;
        c0111l.f940e = charSequence;
        c0111l.f939d = this.f3504s0;
        c0119p.m3057g(this.f3500o0, this);
        c0119p.m3059e(this.f3501p0, this);
        View m1739W0 = m1739W0();
        if (m1739W0 != null) {
            mo1740V0(m1739W0);
            c0119p.f1026a.f954s = m1739W0;
        } else {
            c0119p.f1026a.f942g = this.f3502q0;
        }
        mo1737Y0(c0119p);
        DialogInterfaceC0121q m3063a = c0119p.m3063a();
        if (this instanceof C0868f) {
            m3063a.getWindow().setSoftInputMode(5);
        }
        return m3063a;
    }

    @Override // p010b.p067m.p068d.DialogInterface$OnCancelListenerC0751v, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: T */
    public void mo523T(Bundle bundle) {
        BitmapDrawable bitmapDrawable;
        super.mo523T(bundle);
        AbstractComponentCallbacksC0763z m1904F = m1904F();
        if (!(m1904F instanceof InterfaceC0860b)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        InterfaceC0860b interfaceC0860b = (InterfaceC0860b) m1904F;
        String string = this.f3236i.getString("key");
        if (bundle != null) {
            this.f3499n0 = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f3500o0 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f3501p0 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f3502q0 = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f3503r0 = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f3504s0 = new BitmapDrawable(m1843z(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) ((AbstractC0904x) interfaceC0860b).m1734R0(string);
        this.f3498m0 = dialogPreference;
        this.f3499n0 = dialogPreference.f572P;
        this.f3500o0 = dialogPreference.f575S;
        this.f3501p0 = dialogPreference.f576T;
        this.f3502q0 = dialogPreference.f573Q;
        this.f3503r0 = dialogPreference.f577U;
        Drawable drawable = dialogPreference.f574R;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            bitmapDrawable = (BitmapDrawable) drawable;
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            bitmapDrawable = new BitmapDrawable(m1843z(), createBitmap);
        }
        this.f3504s0 = bitmapDrawable;
    }

    /* renamed from: U0 */
    public DialogPreference m1741U0() {
        if (this.f3498m0 == null) {
            this.f3498m0 = (DialogPreference) ((AbstractC0904x) ((InterfaceC0860b) m1904F())).m1734R0(this.f3236i.getString("key"));
        }
        return this.f3498m0;
    }

    /* renamed from: V0 */
    public void mo1740V0(View view) {
        View findViewById = view.findViewById(16908299);
        if (findViewById != null) {
            CharSequence charSequence = this.f3502q0;
            int i = 8;
            if (!TextUtils.isEmpty(charSequence)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i = 0;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    /* renamed from: W0 */
    public View m1739W0() {
        int i = this.f3503r0;
        if (i == 0) {
            return null;
        }
        return m1858r().inflate(i, (ViewGroup) null);
    }

    /* renamed from: X0 */
    public abstract void mo1738X0(boolean z);

    /* renamed from: Y0 */
    public void mo1737Y0(C0119p c0119p) {
    }

    @Override // p010b.p067m.p068d.DialogInterface$OnCancelListenerC0751v, p010b.p067m.p068d.AbstractComponentCallbacksC0763z
    /* renamed from: n0 */
    public void mo521n0(Bundle bundle) {
        super.mo521n0(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f3499n0);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f3500o0);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f3501p0);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f3502q0);
        bundle.putInt("PreferenceDialogFragment.layout", this.f3503r0);
        BitmapDrawable bitmapDrawable = this.f3504s0;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f3505t0 = i;
    }

    @Override // p010b.p067m.p068d.DialogInterface$OnCancelListenerC0751v, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        mo1738X0(this.f3505t0 == -1);
    }
}