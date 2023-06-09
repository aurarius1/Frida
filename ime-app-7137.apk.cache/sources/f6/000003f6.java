package p010b.p082t;

import android.content.DialogInterface;

/* renamed from: b.t.m */
/* loaded from: classes.dex */
public class DialogInterface$OnMultiChoiceClickListenerC0882m implements DialogInterface.OnMultiChoiceClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0884n f3489a;

    public DialogInterface$OnMultiChoiceClickListenerC0882m(C0884n c0884n) {
        this.f3489a = c0884n;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        boolean z2;
        boolean remove;
        C0884n c0884n = this.f3489a;
        if (z) {
            z2 = c0884n.f3491v0;
            remove = c0884n.f3490u0.add(c0884n.f3493x0[i].toString());
        } else {
            z2 = c0884n.f3491v0;
            remove = c0884n.f3490u0.remove(c0884n.f3493x0[i].toString());
        }
        c0884n.f3491v0 = remove | z2;
    }
}