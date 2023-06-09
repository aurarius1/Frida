package p010b.p086w;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: b.w.o */
/* loaded from: classes.dex */
public class C1062o extends AbstractC1034e0 {

    /* renamed from: y */
    public static final String[] f4011y = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: z */
    public int f4012z;

    public C1062o(int i) {
        this.f4012z = 3;
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f4012z = i;
    }

    /* renamed from: H */
    public final void m1335H(C1063o0 c1063o0) {
        c1063o0.f4013a.put("android:visibility:visibility", Integer.valueOf(c1063o0.f4014b.getVisibility()));
        c1063o0.f4013a.put("android:visibility:parent", c1063o0.f4014b.getParent());
        int[] iArr = new int[2];
        c1063o0.f4014b.getLocationOnScreen(iArr);
        c1063o0.f4013a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: I */
    public final Animator m1334I(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        AbstractC1023a1.f3914a.mo1366e(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, AbstractC1023a1.f3915b, f2);
        ofFloat.addListener(new C1060n(view));
        mo1346a(new C1057m(this, view));
        return ofFloat;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
        if (r9 == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
        if (r0.f3978e == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008f, code lost:
        if (r0.f3976c == 0) goto L24;
     */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1050j1 m1333J(C1063o0 c1063o0, C1063o0 c1063o02) {
        C1050j1 c1050j1 = new C1050j1();
        c1050j1.f3974a = false;
        c1050j1.f3975b = false;
        if (c1063o0 == null || !c1063o0.f4013a.containsKey("android:visibility:visibility")) {
            c1050j1.f3976c = -1;
            c1050j1.f3978e = null;
        } else {
            c1050j1.f3976c = ((Integer) c1063o0.f4013a.get("android:visibility:visibility")).intValue();
            c1050j1.f3978e = (ViewGroup) c1063o0.f4013a.get("android:visibility:parent");
        }
        if (c1063o02 == null || !c1063o02.f4013a.containsKey("android:visibility:visibility")) {
            c1050j1.f3977d = -1;
            c1050j1.f3979f = null;
        } else {
            c1050j1.f3977d = ((Integer) c1063o02.f4013a.get("android:visibility:visibility")).intValue();
            c1050j1.f3979f = (ViewGroup) c1063o02.f4013a.get("android:visibility:parent");
        }
        if (c1063o0 != null && c1063o02 != null) {
            int i = c1050j1.f3976c;
            int i2 = c1050j1.f3977d;
            if (i != i2 || c1050j1.f3978e != c1050j1.f3979f) {
                if (i != i2) {
                    if (i != 0) {
                    }
                    c1050j1.f3975b = false;
                } else {
                    if (c1050j1.f3979f != null) {
                    }
                    c1050j1.f3975b = false;
                }
            }
            return c1050j1;
        }
        if (c1063o0 != null || c1050j1.f3977d != 0) {
            if (c1063o02 == null) {
            }
            return c1050j1;
        }
        c1050j1.f3975b = true;
        c1050j1.f3974a = true;
        return c1050j1;
    }

    /* renamed from: K */
    public Animator m1332K(View view, C1063o0 c1063o0) {
        Float f;
        AbstractC1023a1.f3914a.mo1368c(view);
        return m1334I(view, (c1063o0 == null || (f = (Float) c1063o0.f4013a.get("android:fade:transitionAlpha")) == null) ? 1.0f : f.floatValue(), 0.0f);
    }

    @Override // p010b.p086w.AbstractC1034e0
    /* renamed from: d */
    public void mo770d(C1063o0 c1063o0) {
        m1335H(c1063o0);
    }

    @Override // p010b.p086w.AbstractC1034e0
    /* renamed from: g */
    public void mo769g(C1063o0 c1063o0) {
        m1335H(c1063o0);
        c1063o0.f4013a.put("android:fade:transitionAlpha", Float.valueOf(AbstractC1023a1.m1384a(c1063o0.f4014b)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (m1333J(m1375n(r1, false), m1373q(r1, false)).f3974a != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ec  */
    @Override // p010b.p086w.AbstractC1034e0
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Animator mo768k(ViewGroup viewGroup, C1063o0 c1063o0, C1063o0 c1063o02) {
        boolean z;
        View view;
        int i;
        int i2;
        View view2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        ViewGroup viewGroup2;
        int round;
        Bitmap bitmap;
        C1062o c1062o;
        Animator m1332K;
        InterfaceC1031d0 interfaceC1031d0;
        Animator animator;
        Float f;
        C1050j1 m1333J = m1333J(c1063o0, c1063o02);
        if (m1333J.f3974a && (m1333J.f3978e != null || m1333J.f3979f != null)) {
            boolean z5 = true;
            if (m1333J.f3975b) {
                if ((this.f4012z & 1) == 1 && c1063o02 != null) {
                    if (c1063o0 == null) {
                        View view3 = (View) c1063o02.f4014b.getParent();
                    }
                    View view4 = c1063o02.f4014b;
                    float floatValue = (c1063o0 == null || (f = (Float) c1063o0.f4013a.get("android:fade:transitionAlpha")) == null) ? 0.0f : f.floatValue();
                    animator = m1334I(view4, floatValue != 1.0f ? floatValue : 0.0f, 1.0f);
                    return animator;
                }
                animator = null;
                return animator;
            }
            int i4 = m1333J.f3977d;
            if ((this.f4012z & 2) == 2 && c1063o0 != null) {
                View view5 = c1063o0.f4014b;
                View view6 = c1063o02 != null ? c1063o02.f4014b : null;
                int i5 = AbstractC1076v.save_overlay_view;
                View view7 = (View) view5.getTag(i5);
                if (view7 != null) {
                    i = i4;
                    i2 = i5;
                    view2 = null;
                } else {
                    if (view6 == null || view6.getParent() == null) {
                        if (view6 != null) {
                            view7 = view6;
                            view6 = null;
                            z = false;
                        }
                        view6 = null;
                        view7 = null;
                        z = true;
                    } else {
                        if (i4 == 4 || view5 == view6) {
                            view7 = null;
                            z = false;
                        }
                        view6 = null;
                        view7 = null;
                        z = true;
                    }
                    if (z) {
                        if (view5.getParent() == null) {
                            view = view6;
                            i = i4;
                            view7 = view5;
                            i2 = i5;
                            view2 = view;
                            z5 = false;
                        } else if (view5.getParent() instanceof View) {
                            View view8 = (View) view5.getParent();
                            if (!m1333J(m1373q(view8, true), m1375n(view8, true)).f3974a) {
                                boolean z6 = AbstractC1061n0.f4008a;
                                Matrix matrix = new Matrix();
                                matrix.setTranslate(-view8.getScrollX(), -view8.getScrollY());
                                C1041g1 c1041g1 = AbstractC1023a1.f3914a;
                                c1041g1.mo1364g(view5, matrix);
                                c1041g1.mo1363h(viewGroup, matrix);
                                RectF rectF = new RectF(0.0f, 0.0f, view5.getWidth(), view5.getHeight());
                                matrix.mapRect(rectF);
                                int round2 = Math.round(rectF.left);
                                int round3 = Math.round(rectF.top);
                                int round4 = Math.round(rectF.right);
                                int round5 = Math.round(rectF.bottom);
                                ImageView imageView = new ImageView(view5.getContext());
                                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                if (AbstractC1061n0.f4008a) {
                                    z2 = !view5.isAttachedToWindow();
                                    if (viewGroup != null) {
                                        z3 = viewGroup.isAttachedToWindow();
                                        z4 = AbstractC1061n0.f4009b;
                                        if (z4 || !z2) {
                                            view = view6;
                                            i3 = 0;
                                            viewGroup2 = null;
                                        } else if (z3) {
                                            viewGroup2 = (ViewGroup) view5.getParent();
                                            int indexOfChild = viewGroup2.indexOfChild(view5);
                                            view = view6;
                                            viewGroup.getOverlay().add(view5);
                                            i3 = indexOfChild;
                                        } else {
                                            view = view6;
                                            i = i4;
                                            i2 = i5;
                                            bitmap = null;
                                            if (bitmap != null) {
                                                imageView.setImageBitmap(bitmap);
                                            }
                                            imageView.measure(View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824), View.MeasureSpec.makeMeasureSpec(round5 - round3, 1073741824));
                                            imageView.layout(round2, round3, round4, round5);
                                            view7 = imageView;
                                        }
                                        i = i4;
                                        round = Math.round(rectF.width());
                                        i2 = i5;
                                        int round6 = Math.round(rectF.height());
                                        if (round > 0 || round6 <= 0) {
                                            bitmap = null;
                                        } else {
                                            float min = Math.min(1.0f, 1048576.0f / (round * round6));
                                            int round7 = Math.round(round * min);
                                            int round8 = Math.round(round6 * min);
                                            matrix.postTranslate(-rectF.left, -rectF.top);
                                            matrix.postScale(min, min);
                                            if (AbstractC1061n0.f4010c) {
                                                Picture picture = new Picture();
                                                Canvas beginRecording = picture.beginRecording(round7, round8);
                                                beginRecording.concat(matrix);
                                                view5.draw(beginRecording);
                                                picture.endRecording();
                                                bitmap = Bitmap.createBitmap(picture);
                                            } else {
                                                bitmap = Bitmap.createBitmap(round7, round8, Bitmap.Config.ARGB_8888);
                                                Canvas canvas = new Canvas(bitmap);
                                                canvas.concat(matrix);
                                                view5.draw(canvas);
                                            }
                                        }
                                        if (z4 && z2) {
                                            viewGroup.getOverlay().remove(view5);
                                            viewGroup2.addView(view5, i3);
                                        }
                                        if (bitmap != null) {
                                        }
                                        imageView.measure(View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824), View.MeasureSpec.makeMeasureSpec(round5 - round3, 1073741824));
                                        imageView.layout(round2, round3, round4, round5);
                                        view7 = imageView;
                                    }
                                } else {
                                    z2 = false;
                                }
                                z3 = false;
                                z4 = AbstractC1061n0.f4009b;
                                if (z4) {
                                }
                                view = view6;
                                i3 = 0;
                                viewGroup2 = null;
                                i = i4;
                                round = Math.round(rectF.width());
                                i2 = i5;
                                int round62 = Math.round(rectF.height());
                                if (round > 0) {
                                }
                                bitmap = null;
                                if (z4) {
                                    viewGroup.getOverlay().remove(view5);
                                    viewGroup2.addView(view5, i3);
                                }
                                if (bitmap != null) {
                                }
                                imageView.measure(View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824), View.MeasureSpec.makeMeasureSpec(round5 - round3, 1073741824));
                                imageView.layout(round2, round3, round4, round5);
                                view7 = imageView;
                            } else {
                                view = view6;
                                i = i4;
                                i2 = i5;
                                int id = view8.getId();
                                if (view8.getParent() == null && id != -1) {
                                    viewGroup.findViewById(id);
                                }
                            }
                            view2 = view;
                            z5 = false;
                        }
                    }
                    view = view6;
                    i = i4;
                    i2 = i5;
                    view2 = view;
                    z5 = false;
                }
                if (view7 == null) {
                    c1062o = this;
                    if (view2 != null) {
                        int visibility = view2.getVisibility();
                        C1041g1 c1041g12 = AbstractC1023a1.f3914a;
                        c1041g12.mo1365f(view2, 0);
                        m1332K = c1062o.m1332K(view2, c1063o0);
                        if (m1332K != null) {
                            C1047i1 c1047i1 = new C1047i1(view2, i, true);
                            m1332K.addListener(c1047i1);
                            if (Build.VERSION.SDK_INT >= 19) {
                                m1332K.addPauseListener(c1047i1);
                            }
                            interfaceC1031d0 = c1047i1;
                            c1062o.mo1346a(interfaceC1031d0);
                            return m1332K;
                        }
                        c1041g12.mo1365f(view2, visibility);
                        return m1332K;
                    }
                    return null;
                }
                if (!z5) {
                    int[] iArr = (int[]) c1063o0.f4013a.get("android:visibility:screenLocation");
                    int i6 = iArr[0];
                    int i7 = iArr[1];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr2);
                    view7.offsetLeftAndRight((i6 - iArr2[0]) - view7.getLeft());
                    view7.offsetTopAndBottom((i7 - iArr2[1]) - view7.getTop());
                    AbstractC1073t0.m1305a(viewGroup).mo1324a(view7);
                }
                c1062o = this;
                m1332K = c1062o.m1332K(view7, c1063o0);
                if (!z5) {
                    if (m1332K == 0) {
                        AbstractC1073t0.m1305a(viewGroup).mo1323b(view7);
                    } else {
                        view5.setTag(i2, view7);
                        interfaceC1031d0 = new C1044h1(c1062o, viewGroup, view7, view5);
                        c1062o.mo1346a(interfaceC1031d0);
                    }
                }
                return m1332K;
            }
        }
        return null;
    }

    @Override // p010b.p086w.AbstractC1034e0
    /* renamed from: p */
    public String[] mo1331p() {
        return f4011y;
    }

    @Override // p010b.p086w.AbstractC1034e0
    /* renamed from: r */
    public boolean mo1330r(C1063o0 c1063o0, C1063o0 c1063o02) {
        if (c1063o0 == null && c1063o02 == null) {
            return false;
        }
        if (c1063o0 == null || c1063o02 == null || c1063o02.f4013a.containsKey("android:visibility:visibility") == c1063o0.f4013a.containsKey("android:visibility:visibility")) {
            C1050j1 m1333J = m1333J(c1063o0, c1063o02);
            if (m1333J.f3974a) {
                return m1333J.f3976c == 0 || m1333J.f3977d == 0;
            }
            return false;
        }
        return false;
    }
}