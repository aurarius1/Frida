package p183e.p184a.p190p.p195e.p196a;

import java.util.concurrent.atomic.AtomicReference;
import p183e.p184a.InterfaceC2097e;
import p183e.p184a.InterfaceC2098f;

/* renamed from: e.a.p.e.a.q0 */
/* loaded from: classes.dex */
public final class C2206q0 implements InterfaceC2097e {

    /* renamed from: b */
    public final AtomicReference f7207b;

    public C2206q0(AtomicReference atomicReference) {
        this.f7207b = atomicReference;
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:686)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:544)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056 A[EDGE_INSN: B:25:0x0056->B:21:0x0056 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0008 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0054 A[EDGE_INSN: B:32:0x0054->B:20:0x0054 ?: BREAK  , SYNTHETIC] */
    @Override // p183e.p184a.InterfaceC2097e
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo89a(p183e.p184a.InterfaceC2098f r7) {
        /*
            r6 = this;
            e.a.p.e.a.o0 r0 = new e.a.p.e.a.o0
            r0.<init>(r7)
            r7.mo27c(r0)
        L8:
            java.util.concurrent.atomic.AtomicReference r7 = r6.f7207b
            java.lang.Object r7 = r7.get()
            e.a.p.e.a.p0 r7 = (p183e.p184a.p190p.p195e.p196a.C2204p0) r7
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L23
            java.util.concurrent.atomic.AtomicReference r3 = r7.f7203e
            java.lang.Object r3 = r3.get()
            e.a.p.e.a.o0[] r4 = p183e.p184a.p190p.p195e.p196a.C2204p0.f7201c
            if (r3 != r4) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r3 == 0) goto L34
        L23:
            e.a.p.e.a.p0 r3 = new e.a.p.e.a.p0
            java.util.concurrent.atomic.AtomicReference r4 = r6.f7207b
            r3.<init>(r4)
            java.util.concurrent.atomic.AtomicReference r4 = r6.f7207b
            boolean r7 = r4.compareAndSet(r7, r3)
            if (r7 != 0) goto L33
            goto L8
        L33:
            r7 = r3
        L34:
            java.util.concurrent.atomic.AtomicReference r3 = r7.f7203e
            java.lang.Object r3 = r3.get()
            e.a.p.e.a.o0[] r3 = (p183e.p184a.p190p.p195e.p196a.C2202o0[]) r3
            e.a.p.e.a.o0[] r4 = p183e.p184a.p190p.p195e.p196a.C2204p0.f7201c
            if (r3 != r4) goto L41
            goto L54
        L41:
            int r4 = r3.length
            int r5 = r4 + 1
            e.a.p.e.a.o0[] r5 = new p183e.p184a.p190p.p195e.p196a.C2202o0[r5]
            java.lang.System.arraycopy(r3, r1, r5, r1, r4)
            r5[r4] = r0
            java.util.concurrent.atomic.AtomicReference r4 = r7.f7203e
            boolean r3 = r4.compareAndSet(r3, r5)
            if (r3 == 0) goto L34
            r1 = 1
        L54:
            if (r1 == 0) goto L8
            r1 = 0
            boolean r1 = r0.compareAndSet(r1, r7)
            if (r1 != 0) goto L60
            r7.m90a(r0)
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p183e.p184a.p190p.p195e.p196a.C2206q0.mo89a(e.a.f):void");
    }
}