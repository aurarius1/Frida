package p010b.p016c.p026q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import p010b.p016c.AbstractC0075a;
import p010b.p016c.AbstractC0077c;
import p010b.p016c.AbstractC0079e;
import p010b.p016c.p018l.p019a.AbstractC0142b;
import p010b.p046j.p050f.AbstractC0506a;

/* renamed from: b.c.q.c0 */
/* loaded from: classes.dex */
public class C0223c0 {

    /* renamed from: a */
    public final int[] f1487a = {AbstractC0079e.abc_textfield_search_default_mtrl_alpha, AbstractC0079e.abc_textfield_default_mtrl_alpha, AbstractC0079e.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: b */
    public final int[] f1488b = {AbstractC0079e.abc_ic_commit_search_api_mtrl_alpha, AbstractC0079e.abc_seekbar_tick_mark_material, AbstractC0079e.abc_ic_menu_share_mtrl_alpha, AbstractC0079e.abc_ic_menu_copy_mtrl_am_alpha, AbstractC0079e.abc_ic_menu_cut_mtrl_alpha, AbstractC0079e.abc_ic_menu_selectall_mtrl_alpha, AbstractC0079e.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: c */
    public final int[] f1489c = {AbstractC0079e.abc_textfield_activated_mtrl_alpha, AbstractC0079e.abc_textfield_search_activated_mtrl_alpha, AbstractC0079e.abc_cab_background_top_mtrl_alpha, AbstractC0079e.abc_text_cursor_material, AbstractC0079e.abc_text_select_handle_left_mtrl, AbstractC0079e.abc_text_select_handle_middle_mtrl, AbstractC0079e.abc_text_select_handle_right_mtrl};

    /* renamed from: d */
    public final int[] f1490d = {AbstractC0079e.abc_popup_background_mtrl_mult, AbstractC0079e.abc_cab_background_internal_bg, AbstractC0079e.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: e */
    public final int[] f1491e = {AbstractC0079e.abc_tab_indicator_material, AbstractC0079e.abc_textfield_search_material};

    /* renamed from: f */
    public final int[] f1492f = {AbstractC0079e.abc_btn_check_material, AbstractC0079e.abc_btn_radio_material, AbstractC0079e.abc_btn_check_material_anim, AbstractC0079e.abc_btn_radio_material_anim};

    /* renamed from: a */
    public final boolean m2871a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final ColorStateList m2870b(Context context, int i) {
        int m2791c = AbstractC0282m3.m2791c(context, AbstractC0075a.colorControlHighlight);
        return new ColorStateList(new int[][]{AbstractC0282m3.f1661b, AbstractC0282m3.f1663d, AbstractC0282m3.f1662c, AbstractC0282m3.f1665f}, new int[]{AbstractC0282m3.m2792b(context, AbstractC0075a.colorButtonNormal), AbstractC0506a.m2389e(m2791c, i), AbstractC0506a.m2389e(m2791c, i), i});
    }

    /* renamed from: c */
    public final LayerDrawable m2869c(C0296p2 c0296p2, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable m2773f = c0296p2.m2773f(context, AbstractC0079e.abc_star_black_48dp);
        Drawable m2773f2 = c0296p2.m2773f(context, AbstractC0079e.abc_star_half_black_48dp);
        if ((m2773f instanceof BitmapDrawable) && m2773f.getIntrinsicWidth() == dimensionPixelSize && m2773f.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) m2773f;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            m2773f.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            m2773f.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((m2773f2 instanceof BitmapDrawable) && m2773f2.getIntrinsicWidth() == dimensionPixelSize && m2773f2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) m2773f2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            m2773f2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            m2773f2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        return layerDrawable;
    }

    /* renamed from: d */
    public ColorStateList m2868d(Context context, int i) {
        if (i == AbstractC0079e.abc_edit_text_material) {
            return AbstractC0142b.m3001a(context, AbstractC0077c.abc_tint_edittext);
        }
        if (i == AbstractC0079e.abc_switch_track_mtrl_alpha) {
            return AbstractC0142b.m3001a(context, AbstractC0077c.abc_tint_switch_track);
        }
        if (i == AbstractC0079e.abc_switch_thumb_material) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            int i2 = AbstractC0075a.colorSwitchThumbNormal;
            ColorStateList m2790d = AbstractC0282m3.m2790d(context, i2);
            if (m2790d == null || !m2790d.isStateful()) {
                iArr[0] = AbstractC0282m3.f1661b;
                iArr2[0] = AbstractC0282m3.m2792b(context, i2);
                iArr[1] = AbstractC0282m3.f1664e;
                iArr2[1] = AbstractC0282m3.m2791c(context, AbstractC0075a.colorControlActivated);
                iArr[2] = AbstractC0282m3.f1665f;
                iArr2[2] = AbstractC0282m3.m2791c(context, i2);
            } else {
                iArr[0] = AbstractC0282m3.f1661b;
                iArr2[0] = m2790d.getColorForState(iArr[0], 0);
                iArr[1] = AbstractC0282m3.f1664e;
                iArr2[1] = AbstractC0282m3.m2791c(context, AbstractC0075a.colorControlActivated);
                iArr[2] = AbstractC0282m3.f1665f;
                iArr2[2] = m2790d.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        } else if (i == AbstractC0079e.abc_btn_default_mtrl_shape) {
            return m2870b(context, AbstractC0282m3.m2791c(context, AbstractC0075a.colorButtonNormal));
        } else {
            if (i == AbstractC0079e.abc_btn_borderless_material) {
                return m2870b(context, 0);
            }
            if (i == AbstractC0079e.abc_btn_colored_material) {
                return m2870b(context, AbstractC0282m3.m2791c(context, AbstractC0075a.colorAccent));
            }
            if (i == AbstractC0079e.abc_spinner_mtrl_am_alpha || i == AbstractC0079e.abc_spinner_textfield_background_material) {
                return AbstractC0142b.m3001a(context, AbstractC0077c.abc_tint_spinner);
            }
            if (m2871a(this.f1488b, i)) {
                return AbstractC0282m3.m2790d(context, AbstractC0075a.colorControlNormal);
            }
            if (m2871a(this.f1491e, i)) {
                return AbstractC0142b.m3001a(context, AbstractC0077c.abc_tint_default);
            }
            if (m2871a(this.f1492f, i)) {
                return AbstractC0142b.m3001a(context, AbstractC0077c.abc_tint_btn_checkable);
            }
            if (i == AbstractC0079e.abc_seekbar_thumb_material) {
                return AbstractC0142b.m3001a(context, AbstractC0077c.abc_tint_seek_thumb);
            }
            return null;
        }
    }

    /* renamed from: e */
    public final void m2867e(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (AbstractC0290o1.m2786a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = C0229d0.f1500a;
        }
        drawable.setColorFilter(C0229d0.m2863c(i, mode));
    }
}