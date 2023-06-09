package io.reactivex.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p183e.p184a.p188n.AbstractC2116b;
import p183e.p184a.p188n.C2115a;
import p183e.p184a.p188n.C2117c;
import p183e.p184a.p188n.C2118d;

/* loaded from: classes.dex */
public final class CompositeException extends RuntimeException {

    /* renamed from: b */
    public final List f7471b;

    /* renamed from: c */
    public final String f7472c;

    /* renamed from: d */
    public Throwable f7473d;

    public CompositeException(Iterable iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Object obj : iterable) {
                if (obj instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) obj).f7471b);
                } else {
                    linkedHashSet.add(obj == null ? new NullPointerException("Throwable was null!") : obj);
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (linkedHashSet.isEmpty()) {
            throw new IllegalArgumentException("errors is empty");
        }
        arrayList.addAll(linkedHashSet);
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        this.f7471b = unmodifiableList;
        this.f7472c = unmodifiableList.size() + " exceptions occurred. ";
    }

    public CompositeException(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    /* renamed from: a */
    public final void m6a(StringBuilder sb, Throwable th, String str) {
        StackTraceElement[] stackTrace;
        sb.append(str);
        sb.append(th);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            m6a(sb, th.getCause(), "");
        }
    }

    /* renamed from: b */
    public final void m5b(AbstractC2116b abstractC2116b) {
        StackTraceElement[] stackTrace;
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (Throwable th : this.f7471b) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            m6a(sb, th, "\t");
            i++;
        }
        abstractC2116b.mo129a(sb.toString());
    }

    @Override // java.lang.Throwable
    public synchronized Throwable getCause() {
        if (this.f7473d == null) {
            C2115a c2115a = new C2115a();
            HashSet hashSet = new HashSet();
            Throwable th = c2115a;
            for (Throwable th2 : this.f7471b) {
                if (!hashSet.contains(th2)) {
                    hashSet.add(th2);
                    ArrayList arrayList = new ArrayList();
                    Throwable cause = th2.getCause();
                    if (cause != null && cause != th2) {
                        while (true) {
                            arrayList.add(cause);
                            Throwable cause2 = cause.getCause();
                            if (cause2 == null || cause2 == cause) {
                                break;
                            }
                            cause = cause2;
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Throwable th3 = (Throwable) it.next();
                        if (hashSet.contains(th3)) {
                            th2 = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                        } else {
                            hashSet.add(th3);
                        }
                    }
                    try {
                        th.initCause(th2);
                    } catch (Throwable unused) {
                    }
                    Throwable cause3 = th.getCause();
                    if (cause3 != null && th != cause3) {
                        while (true) {
                            Throwable cause4 = cause3.getCause();
                            if (cause4 == null || cause4 == cause3) {
                                break;
                            }
                            cause3 = cause4;
                        }
                        th = cause3;
                    }
                }
            }
            this.f7473d = c2115a;
        }
        return this.f7473d;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f7472c;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        m5b(new C2117c(printStream));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        m5b(new C2118d(printWriter));
    }
}