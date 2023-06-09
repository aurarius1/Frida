package p093c.p097b;

import android.content.DialogInterface;
import com.anysoftkeyboard.AnySoftKeyboard;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p010b.p016c.p017k.C0111l;
import p010b.p016c.p017k.C0119p;
import p010b.p016c.p017k.DialogInterfaceC0121q;
import p093c.p097b.p122u.C1461a0;
import p204f.p205a.p209b.InterfaceC2293d;

/* renamed from: c.b.n */
/* loaded from: classes.dex */
public class C1421n implements InterfaceC2293d {

    /* renamed from: a */
    public final /* synthetic */ CharSequence[] f4685a;

    /* renamed from: b */
    public final /* synthetic */ boolean[] f4686b;

    /* renamed from: c */
    public final /* synthetic */ List f4687c;

    /* renamed from: d */
    public final /* synthetic */ List f4688d;

    /* renamed from: e */
    public final /* synthetic */ AnySoftKeyboard f4689e;

    public C1421n(AnySoftKeyboard anySoftKeyboard, CharSequence[] charSequenceArr, boolean[] zArr, List list, List list2) {
        this.f4689e = anySoftKeyboard;
        this.f4685a = charSequenceArr;
        this.f4686b = zArr;
        this.f4687c = list;
        this.f4688d = list2;
    }

    @Override // p204f.p205a.p209b.InterfaceC2294e
    /* renamed from: a */
    public void mo23a(C0119p c0119p, int i, Object obj) {
        C0111l c0111l = c0119p.f1026a;
        c0111l.f951p = null;
        c0111l.f953r = null;
        CharSequence[] charSequenceArr = this.f4685a;
        final boolean[] zArr = this.f4686b;
        c0119p.m3061c(charSequenceArr, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: c.b.c
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i2, boolean z) {
                zArr[i2] = z;
            }
        });
        c0119p.m3060d(17039360, new DialogInterface.OnClickListener() { // from class: c.b.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.cancel();
            }
        });
        final List list = this.f4687c;
        final List list2 = this.f4688d;
        final boolean[] zArr2 = this.f4686b;
        c0119p.m3058f(R.string.label_done_key, new DialogInterface.OnClickListener() { // from class: c.b.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C1421n c1421n = C1421n.this;
                List list3 = list;
                List list4 = list2;
                boolean[] zArr3 = zArr2;
                c1421n.getClass();
                ArrayList arrayList = new ArrayList(list3.size());
                for (int i3 = 0; i3 < list4.size(); i3++) {
                    if (zArr3[i3]) {
                        arrayList.add((C1461a0) list4.get(i3));
                    }
                }
                AnyApplication.m192j(c1421n.f4689e).m1008v(c1421n.f4689e.f6337A, arrayList);
                dialogInterface.dismiss();
            }
        });
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: c.b.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C1421n c1421n = C1421n.this;
                AnyApplication.m192j(c1421n.f4689e).m1008v(c1421n.f4689e.f6337A, Collections.emptyList());
            }
        };
        C0111l c0111l2 = c0119p.f1026a;
        c0111l2.f947l = c0111l2.f936a.getText(R.string.clear_all_dictionary_override);
        c0119p.f1026a.f948m = onClickListener;
    }

    @Override // p204f.p205a.p209b.InterfaceC2293d
    /* renamed from: b */
    public void mo22b(DialogInterfaceC0121q dialogInterfaceC0121q, Object obj) {
    }
}