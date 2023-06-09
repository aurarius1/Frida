package p010b.p016c.p026q;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import p010b.p046j.p050f.p051p.C0523c;
import p010b.p046j.p050f.p051p.InterfaceC0522b;

/* renamed from: b.c.q.k0 */
/* loaded from: classes.dex */
public class C0269k0 {

    /* renamed from: a */
    public static final int[] f1632a = {16843067, 16843068};

    /* renamed from: b */
    public final ProgressBar f1633b;

    /* renamed from: c */
    public Bitmap f1634c;

    public C0269k0(ProgressBar progressBar) {
        this.f1633b = progressBar;
    }

    /* renamed from: a */
    public void mo2781a(AttributeSet attributeSet, int i) {
        C0302q3 m2740r = C0302q3.m2740r(this.f1633b.getContext(), attributeSet, f1632a, i, 0);
        Drawable m2750h = m2740r.m2750h(0);
        if (m2750h != null) {
            ProgressBar progressBar = this.f1633b;
            if (m2750h instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) m2750h;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable m2799b = m2799b(animationDrawable.getFrame(i2), true);
                    m2799b.setLevel(10000);
                    animationDrawable2.addFrame(m2799b, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                m2750h = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(m2750h);
        }
        Drawable m2750h2 = m2740r.m2750h(1);
        if (m2750h2 != null) {
            this.f1633b.setProgressDrawable(m2799b(m2750h2, false));
        }
        m2740r.f1740b.recycle();
    }

    /* renamed from: b */
    public final Drawable m2799b(Drawable drawable, boolean z) {
        if (drawable instanceof InterfaceC0522b) {
            C0523c c0523c = (C0523c) ((InterfaceC0522b) drawable);
            Drawable drawable2 = c0523c.f2575h;
            if (drawable2 != null) {
                c0523c.m2355b(m2799b(drawable2, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = m2799b(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f1634c == null) {
                this.f1634c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }
}