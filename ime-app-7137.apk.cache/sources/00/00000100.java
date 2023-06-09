package p010b.p016c.p017k;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p010b.p016c.AbstractC0075a;
import p010b.p016c.p024p.AbstractC0161b;
import p010b.p016c.p024p.InterfaceC0160a;
import p010b.p046j.p058l.AbstractC0608l;
import p010b.p046j.p058l.InterfaceC0606k;

/* renamed from: b.c.k.r0 */
/* loaded from: classes.dex */
public class DialogC0124r0 extends Dialog implements InterfaceC0129u {

    /* renamed from: b */
    public AbstractC0131v f1087b;

    /* renamed from: c */
    public final InterfaceC0606k f1088c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DialogC0124r0(Context context, int i) {
        super(context, r1);
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(AbstractC0075a.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        this.f1088c = new C0122q0(this);
        AbstractC0131v m3029a = m3029a();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(AbstractC0075a.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((LayoutInflater$Factory2C0120p0) m3029a).f1055V = i;
        m3029a.mo3012g(null);
    }

    /* renamed from: a */
    public AbstractC0131v m3029a() {
        if (this.f1087b == null) {
            int i = AbstractC0131v.f1100b;
            this.f1087b = new LayoutInflater$Factory2C0120p0(getContext(), getWindow(), this, this);
        }
        return this.f1087b;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m3029a().mo3016c(view, layoutParams);
    }

    /* renamed from: b */
    public boolean m3028b(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // p010b.p016c.p017k.InterfaceC0129u
    /* renamed from: d */
    public void mo3022d(AbstractC0161b abstractC0161b) {
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        m3029a().mo3011h();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC0608l.m2228b(this.f1088c, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // p010b.p016c.p017k.InterfaceC0129u
    /* renamed from: f */
    public void mo3021f(AbstractC0161b abstractC0161b) {
    }

    @Override // android.app.Dialog
    public View findViewById(int i) {
        LayoutInflater$Factory2C0120p0 layoutInflater$Factory2C0120p0 = (LayoutInflater$Factory2C0120p0) m3029a();
        layoutInflater$Factory2C0120p0.m3031z();
        return layoutInflater$Factory2C0120p0.f1070m.findViewById(i);
    }

    @Override // p010b.p016c.p017k.InterfaceC0129u
    /* renamed from: h */
    public AbstractC0161b mo3020h(InterfaceC0160a interfaceC0160a) {
        return null;
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m3029a().mo3013f();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        m3029a().mo3014e();
        super.onCreate(bundle);
        m3029a().mo3012g(bundle);
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        m3029a().mo3010i();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        m3029a().mo3007l(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        m3029a().mo3006m(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m3029a().mo3005n(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        m3029a().mo3003p(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m3029a().mo3003p(charSequence);
    }
}