package p010b.p087x.p088a.p089a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import p010b.p036g.C0378b;

/* renamed from: b.x.a.a.c */
/* loaded from: classes.dex */
public class C1088c extends Drawable.ConstantState {

    /* renamed from: a */
    public int f4064a;

    /* renamed from: b */
    public C1105t f4065b;

    /* renamed from: c */
    public AnimatorSet f4066c;

    /* renamed from: d */
    public ArrayList f4067d;

    /* renamed from: e */
    public C0378b f4068e;

    public C1088c(C1088c c1088c, Drawable.Callback callback, Resources resources) {
        if (c1088c != null) {
            this.f4064a = c1088c.f4064a;
            C1105t c1105t = c1088c.f4065b;
            if (c1105t != null) {
                Drawable.ConstantState constantState = c1105t.getConstantState();
                C1105t c1105t2 = (C1105t) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                this.f4065b = c1105t2;
                c1105t2.mutate();
                this.f4065b = c1105t2;
                c1105t2.setCallback(callback);
                this.f4065b.setBounds(c1088c.f4065b.getBounds());
                this.f4065b.f4143h = false;
            }
            ArrayList arrayList = c1088c.f4067d;
            if (arrayList != null) {
                int size = arrayList.size();
                this.f4067d = new ArrayList(size);
                this.f4068e = new C0378b(size);
                for (int i = 0; i < size; i++) {
                    Animator animator = (Animator) c1088c.f4067d.get(i);
                    Animator clone = animator.clone();
                    String str = (String) c1088c.f4068e.getOrDefault(animator, null);
                    clone.setTarget(this.f4065b.f4139d.f4126b.f4124q.getOrDefault(str, null));
                    this.f4067d.add(clone);
                    this.f4068e.put(clone, str);
                }
                if (this.f4066c == null) {
                    this.f4066c = new AnimatorSet();
                }
                this.f4066c.playTogether(this.f4067d);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f4064a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}