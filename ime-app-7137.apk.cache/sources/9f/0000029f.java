package p010b.p046j.p055i;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: b.j.i.i */
/* loaded from: classes.dex */
public class CallableC0539i implements Callable {

    /* renamed from: b */
    public final /* synthetic */ String f2601b;

    /* renamed from: c */
    public final /* synthetic */ Context f2602c;

    /* renamed from: d */
    public final /* synthetic */ C0536f f2603d;

    /* renamed from: e */
    public final /* synthetic */ int f2604e;

    public CallableC0539i(String str, Context context, C0536f c0536f, int i) {
        this.f2601b = str;
        this.f2602c = context;
        this.f2603d = c0536f;
        this.f2604e = i;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return AbstractC0542l.m2343a(this.f2601b, this.f2602c, this.f2603d, this.f2604e);
    }
}