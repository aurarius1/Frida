package p010b.p046j.p055i;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: b.j.i.g */
/* loaded from: classes.dex */
public class CallableC0537g implements Callable {

    /* renamed from: b */
    public final /* synthetic */ String f2596b;

    /* renamed from: c */
    public final /* synthetic */ Context f2597c;

    /* renamed from: d */
    public final /* synthetic */ C0536f f2598d;

    /* renamed from: e */
    public final /* synthetic */ int f2599e;

    public CallableC0537g(String str, Context context, C0536f c0536f, int i) {
        this.f2596b = str;
        this.f2597c = context;
        this.f2598d = c0536f;
        this.f2599e = i;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return AbstractC0542l.m2343a(this.f2596b, this.f2597c, this.f2598d, this.f2599e);
    }
}