package p093c.p145g.p146a.p147a.p163o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeDrawable$SavedState;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import p010b.p046j.p058l.AbstractC0605j0;
import p093c.p145g.p146a.p147a.AbstractC1829d;
import p093c.p145g.p146a.p147a.AbstractC1840f;
import p093c.p145g.p146a.p147a.AbstractC1924j;
import p093c.p145g.p146a.p147a.AbstractC1926k;
import p093c.p145g.p146a.p147a.p149b0.AbstractC1822r;
import p093c.p145g.p146a.p147a.p149b0.C1818n;
import p093c.p145g.p146a.p147a.p149b0.InterfaceC1817m;
import p093c.p145g.p146a.p147a.p151d0.C1833d;
import p093c.p145g.p146a.p147a.p154g0.C1851i;

/* renamed from: c.g.a.a.o.c */
/* loaded from: classes.dex */
public class C1958c extends Drawable implements InterfaceC1817m {

    /* renamed from: b */
    public final WeakReference f5923b;

    /* renamed from: c */
    public final C1851i f5924c;

    /* renamed from: d */
    public final C1818n f5925d;

    /* renamed from: e */
    public final Rect f5926e;

    /* renamed from: f */
    public final float f5927f;

    /* renamed from: g */
    public final float f5928g;

    /* renamed from: h */
    public final float f5929h;

    /* renamed from: i */
    public final BadgeDrawable$SavedState f5930i;

    /* renamed from: j */
    public float f5931j;

    /* renamed from: k */
    public float f5932k;

    /* renamed from: l */
    public int f5933l;

    /* renamed from: m */
    public float f5934m;

    /* renamed from: n */
    public float f5935n;

    /* renamed from: o */
    public float f5936o;

    /* renamed from: p */
    public WeakReference f5937p;

    /* renamed from: q */
    public WeakReference f5938q;

    public C1958c(Context context) {
        C1833d c1833d;
        Context context2;
        WeakReference weakReference = new WeakReference(context);
        this.f5923b = weakReference;
        AbstractC1822r.m765c(context, AbstractC1822r.f5567b, "Theme.MaterialComponents");
        Resources resources = context.getResources();
        this.f5926e = new Rect();
        this.f5924c = new C1851i();
        this.f5927f = resources.getDimensionPixelSize(AbstractC1829d.mtrl_badge_radius);
        this.f5929h = resources.getDimensionPixelSize(AbstractC1829d.mtrl_badge_long_text_horizontal_padding);
        this.f5928g = resources.getDimensionPixelSize(AbstractC1829d.mtrl_badge_with_text_radius);
        C1818n c1818n = new C1818n(this);
        this.f5925d = c1818n;
        c1818n.f5559a.setTextAlign(Paint.Align.CENTER);
        this.f5930i = new BadgeDrawable$SavedState(context);
        int i = AbstractC1926k.TextAppearance_MaterialComponents_Badge;
        Context context3 = (Context) weakReference.get();
        if (context3 == null || c1818n.f5564f == (c1833d = new C1833d(context3, i)) || (context2 = (Context) weakReference.get()) == null) {
            return;
        }
        c1818n.m772b(c1833d, context2);
        m661g();
    }

    @Override // p093c.p145g.p146a.p147a.p149b0.InterfaceC1817m
    /* renamed from: a */
    public void mo588a() {
        invalidateSelf();
    }

    /* renamed from: b */
    public final String m666b() {
        if (m664d() <= this.f5933l) {
            return NumberFormat.getInstance().format(m664d());
        }
        Context context = (Context) this.f5923b.get();
        return context == null ? "" : context.getString(AbstractC1924j.mtrl_exceed_max_badge_number_suffix, Integer.valueOf(this.f5933l), "+");
    }

    /* renamed from: c */
    public FrameLayout m665c() {
        WeakReference weakReference = this.f5938q;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    /* renamed from: d */
    public int m664d() {
        if (m663e()) {
            return this.f5930i.f6656e;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || this.f5930i.f6655d == 0 || !isVisible()) {
            return;
        }
        this.f5924c.draw(canvas);
        if (m663e()) {
            Rect rect = new Rect();
            String m666b = m666b();
            this.f5925d.f5559a.getTextBounds(m666b, 0, m666b.length(), rect);
            canvas.drawText(m666b, this.f5931j, this.f5932k + (rect.height() / 2), this.f5925d.f5559a);
        }
    }

    /* renamed from: e */
    public boolean m663e() {
        return this.f5930i.f6656e != -1;
    }

    /* renamed from: f */
    public void m662f(View view, FrameLayout frameLayout) {
        WeakReference weakReference;
        this.f5937p = new WeakReference(view);
        boolean z = AbstractC1959d.f5939a;
        if (z && frameLayout == null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if ((viewGroup == null || viewGroup.getId() != AbstractC1840f.mtrl_anchor_parent) && ((weakReference = this.f5938q) == null || weakReference.get() != viewGroup)) {
                ViewGroup viewGroup2 = (ViewGroup) view.getParent();
                viewGroup2.setClipChildren(false);
                viewGroup2.setClipToPadding(false);
                FrameLayout frameLayout2 = new FrameLayout(view.getContext());
                frameLayout2.setId(AbstractC1840f.mtrl_anchor_parent);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                frameLayout2.setLayoutParams(view.getLayoutParams());
                frameLayout2.setMinimumWidth(view.getWidth());
                frameLayout2.setMinimumHeight(view.getHeight());
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(indexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout2.addView(view);
                viewGroup.addView(frameLayout2, indexOfChild);
                this.f5938q = new WeakReference(frameLayout2);
                frameLayout2.post(new RunnableC1956a(this, view, frameLayout2));
            }
        } else {
            this.f5938q = new WeakReference(frameLayout);
        }
        if (!z) {
            ViewGroup viewGroup3 = (ViewGroup) view.getParent();
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
        m661g();
        invalidateSelf();
    }

    /* renamed from: g */
    public final void m661g() {
        int i;
        float m773a;
        float f;
        Context context = (Context) this.f5923b.get();
        WeakReference weakReference = this.f5937p;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f5926e);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference weakReference2 = this.f5938q;
        ViewGroup viewGroup = weakReference2 != null ? (FrameLayout) weakReference2.get() : null;
        if (viewGroup != null || AbstractC1959d.f5939a) {
            if (viewGroup == null) {
                viewGroup = (ViewGroup) view.getParent();
            }
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        }
        BadgeDrawable$SavedState badgeDrawable$SavedState = this.f5930i;
        int i2 = badgeDrawable$SavedState.f6661j;
        if (i2 != 8388691 && i2 != 8388693) {
            i = rect2.top + badgeDrawable$SavedState.f6664m;
        } else {
            i = rect2.bottom - badgeDrawable$SavedState.f6664m;
        }
        this.f5932k = i;
        if (m664d() <= 9) {
            m773a = !m663e() ? this.f5927f : this.f5928g;
            this.f5934m = m773a;
            this.f5936o = m773a;
        } else {
            float f2 = this.f5928g;
            this.f5934m = f2;
            this.f5936o = f2;
            m773a = (this.f5925d.m773a(m666b()) / 2.0f) + this.f5929h;
        }
        this.f5935n = m773a;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(m663e() ? AbstractC1829d.mtrl_badge_text_horizontal_edge_offset : AbstractC1829d.mtrl_badge_horizontal_edge_offset);
        int i3 = this.f5930i.f6661j;
        if (i3 == 8388659 || i3 == 8388691 ? AbstractC0605j0.m2241q(view) == 0 : AbstractC0605j0.m2241q(view) != 0) {
            f = (rect2.left - this.f5935n) + dimensionPixelSize + this.f5930i.f6663l;
        } else {
            f = ((rect2.right + this.f5935n) - dimensionPixelSize) - this.f5930i.f6663l;
        }
        this.f5931j = f;
        Rect rect3 = this.f5926e;
        float f3 = this.f5932k;
        float f4 = this.f5935n;
        float f5 = this.f5936o;
        boolean z = AbstractC1959d.f5939a;
        rect3.set((int) (f - f4), (int) (f3 - f5), (int) (f + f4), (int) (f3 + f5));
        C1851i c1851i = this.f5924c;
        c1851i.f5657d.f5633a = c1851i.f5657d.f5633a.m716e(this.f5934m);
        c1851i.invalidateSelf();
        if (rect.equals(this.f5926e)) {
            return;
        }
        this.f5924c.setBounds(this.f5926e);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f5930i.f6655d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f5926e.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f5926e.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, p093c.p145g.p146a.p147a.p149b0.InterfaceC1817m
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f5930i.f6655d = i;
        this.f5925d.f5559a.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}