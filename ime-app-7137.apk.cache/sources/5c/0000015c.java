package p010b.p016c.p026q;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: b.c.q.b */
/* loaded from: classes.dex */
public class C0216b extends Drawable {

    /* renamed from: a */
    public final ActionBarContainer f1474a;

    public C0216b(ActionBarContainer actionBarContainer) {
        this.f1474a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1474a;
        if (actionBarContainer.f174i) {
            Drawable drawable = actionBarContainer.f173h;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f171f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1474a;
        Drawable drawable3 = actionBarContainer2.f172g;
        if (drawable3 == null || !actionBarContainer2.f175j) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f1474a;
        if (actionBarContainer.f174i) {
            drawable = actionBarContainer.f173h;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.f171f;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}