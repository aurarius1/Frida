package p010b.p016c.p026q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import p010b.p046j.p058l.InterfaceC0630w;
import p010b.p046j.p061m.InterfaceC0649l;

/* renamed from: b.c.q.h0 */
/* loaded from: classes.dex */
public class C0253h0 extends ImageView implements InterfaceC0630w, InterfaceC0649l {

    /* renamed from: b */
    public final C0333x f1588b;

    /* renamed from: c */
    public final C0247g0 f1589c;

    public C0253h0(Context context, AttributeSet attributeSet, int i) {
        super(C0287n3.m2787a(context), attributeSet, i);
        AbstractC0282m3.m2793a(this, getContext());
        C0333x c0333x = new C0333x(this);
        this.f1588b = c0333x;
        c0333x.m2725d(attributeSet, i);
        C0247g0 c0247g0 = new C0247g0(this);
        this.f1589c = c0247g0;
        c0247g0.m2822c(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0333x c0333x = this.f1588b;
        if (c0333x != null) {
            c0333x.m2728a();
        }
        C0247g0 c0247g0 = this.f1589c;
        if (c0247g0 != null) {
            c0247g0.m2824a();
        }
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public ColorStateList getSupportBackgroundTintList() {
        C0333x c0333x = this.f1588b;
        if (c0333x != null) {
            return c0333x.m2727b();
        }
        return null;
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0333x c0333x = this.f1588b;
        if (c0333x != null) {
            return c0333x.m2726c();
        }
        return null;
    }

    @Override // p010b.p046j.p061m.InterfaceC0649l
    public ColorStateList getSupportImageTintList() {
        C0292o3 c0292o3;
        C0247g0 c0247g0 = this.f1589c;
        if (c0247g0 == null || (c0292o3 = c0247g0.f1586b) == null) {
            return null;
        }
        return c0292o3.f1678a;
    }

    @Override // p010b.p046j.p061m.InterfaceC0649l
    public PorterDuff.Mode getSupportImageTintMode() {
        C0292o3 c0292o3;
        C0247g0 c0247g0 = this.f1589c;
        if (c0247g0 == null || (c0292o3 = c0247g0.f1586b) == null) {
            return null;
        }
        return c0292o3.f1679b;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f1589c.m2823b() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0333x c0333x = this.f1588b;
        if (c0333x != null) {
            c0333x.m2724e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0333x c0333x = this.f1588b;
        if (c0333x != null) {
            c0333x.m2723f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0247g0 c0247g0 = this.f1589c;
        if (c0247g0 != null) {
            c0247g0.m2824a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0247g0 c0247g0 = this.f1589c;
        if (c0247g0 != null) {
            c0247g0.m2824a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C0247g0 c0247g0 = this.f1589c;
        if (c0247g0 != null) {
            c0247g0.m2821d(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0247g0 c0247g0 = this.f1589c;
        if (c0247g0 != null) {
            c0247g0.m2824a();
        }
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0333x c0333x = this.f1588b;
        if (c0333x != null) {
            c0333x.m2721h(colorStateList);
        }
    }

    @Override // p010b.p046j.p058l.InterfaceC0630w
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0333x c0333x = this.f1588b;
        if (c0333x != null) {
            c0333x.m2720i(mode);
        }
    }

    @Override // p010b.p046j.p061m.InterfaceC0649l
    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0247g0 c0247g0 = this.f1589c;
        if (c0247g0 != null) {
            c0247g0.m2820e(colorStateList);
        }
    }

    @Override // p010b.p046j.p061m.InterfaceC0649l
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0247g0 c0247g0 = this.f1589c;
        if (c0247g0 != null) {
            c0247g0.m2819f(mode);
        }
    }
}