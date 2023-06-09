package p010b.p087x.p088a.p089a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p000a.p001a.p002a.p004b.AbstractC0022t;
import p010b.p046j.p048e.p049b.AbstractC0505k;
import p010b.p046j.p050f.C0509d;
import p010b.p086w.AbstractC1077v0;
import p093c.p094a.p095a.p096a.AbstractC1124a;

/* renamed from: b.x.a.a.g */
/* loaded from: classes.dex */
public abstract class AbstractC1092g {
    /* JADX DEBUG: Multi-variable search result rejected for r15v16, resolved type: android.animation.AnimatorSet */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x034a, code lost:
        if (r26 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x034c, code lost:
        if (r13 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x034e, code lost:
        r1 = new android.animation.Animator[r13.size()];
        r2 = r13.iterator();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x035d, code lost:
        if (r2.hasNext() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x035f, code lost:
        r1[r3] = (android.animation.Animator) r2.next();
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x036b, code lost:
        if (r27 != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x036d, code lost:
        r26.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0371, code lost:
        r26.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0374, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Animator m1248a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i, float f) {
        PropertyValuesHolder[] propertyValuesHolderArr;
        AttributeSet attributeSet2;
        String str;
        PropertyValuesHolder propertyValuesHolder;
        int size;
        int i2;
        Keyframe ofFloat;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int depth = xmlPullParser.getDepth();
        ValueAnimator valueAnimator = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            int i3 = 3;
            boolean z = false;
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                break;
            }
            int i4 = 1;
            if (next == 1) {
                break;
            }
            int i5 = 2;
            if (next == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    m1244e(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
                    valueAnimator = objectAnimator;
                } else if (name.equals("animator")) {
                    valueAnimator = m1244e(context, resources, theme, attributeSet, null, f, xmlPullParser);
                } else if (name.equals("set")) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    TypedArray m2394k = AbstractC0505k.m2394k(resources2, theme2, attributeSet, AbstractC1086a.f4058h);
                    m1248a(context, resources, theme, xmlPullParser, attributeSet, animatorSet2, !AbstractC0505k.m2396i(xmlPullParser2, "ordering") ? 0 : m2394k.getInt(0, 0), f);
                    m2394k.recycle();
                    valueAnimator = animatorSet2;
                } else {
                    String str2 = "propertyValuesHolder";
                    if (!name.equals("propertyValuesHolder")) {
                        StringBuilder m1187i = AbstractC1124a.m1187i("Unknown animator name: ");
                        m1187i.append(xmlPullParser.getName());
                        throw new RuntimeException(m1187i.toString());
                    }
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
                    ArrayList arrayList2 = null;
                    while (true) {
                        int eventType = xmlPullParser.getEventType();
                        if (eventType == i3 || eventType == i4) {
                            break;
                        } else if (eventType != i5) {
                            xmlPullParser.next();
                        } else {
                            if (xmlPullParser.getName().equals(str2)) {
                                TypedArray m2394k2 = AbstractC0505k.m2394k(resources2, theme2, asAttributeSet, AbstractC1086a.f4059i);
                                String m2400e = AbstractC0505k.m2400e(m2394k2, xmlPullParser2, "propertyName", i3);
                                int i6 = !AbstractC0505k.m2396i(xmlPullParser2, "valueType") ? 4 : m2394k2.getInt(i5, 4);
                                ArrayList arrayList3 = null;
                                attributeSet2 = asAttributeSet;
                                int i7 = i6;
                                while (true) {
                                    int next2 = xmlPullParser.next();
                                    if (next2 == i3) {
                                        break;
                                    }
                                    int i8 = i3;
                                    if (next2 == 1) {
                                        break;
                                    } else if (xmlPullParser.getName().equals("keyframe")) {
                                        if (i7 == 4) {
                                            TypedArray m2394k3 = AbstractC0505k.m2394k(resources2, theme2, Xml.asAttributeSet(xmlPullParser), AbstractC1086a.f4060j);
                                            TypedValue peekValue = !AbstractC0505k.m2396i(xmlPullParser2, "value") ? null : m2394k3.peekValue(0);
                                            i7 = ((peekValue != null) && m1245d(peekValue.type)) ? 3 : 0;
                                            m2394k3.recycle();
                                        }
                                        String str3 = str2;
                                        TypedArray m2394k4 = AbstractC0505k.m2394k(resources2, theme2, Xml.asAttributeSet(xmlPullParser), AbstractC1086a.f4060j);
                                        float f2 = AbstractC0505k.m2396i(xmlPullParser2, "fraction") ? m2394k4.getFloat(3, -1.0f) : -1.0f;
                                        TypedValue peekValue2 = !AbstractC0505k.m2396i(xmlPullParser2, "value") ? null : m2394k4.peekValue(0);
                                        boolean z2 = peekValue2 != null;
                                        if (i7 == 4) {
                                            i2 = (z2 && m1245d(peekValue2.type)) ? 3 : 0;
                                        } else {
                                            i2 = i7;
                                        }
                                        if (!z2) {
                                            ofFloat = i2 == 0 ? Keyframe.ofFloat(f2) : Keyframe.ofInt(f2);
                                        } else if (i2 == 0) {
                                            ofFloat = Keyframe.ofFloat(f2, !AbstractC0505k.m2396i(xmlPullParser2, "value") ? 0.0f : m2394k4.getFloat(0, 0.0f));
                                        } else if (i2 == 1 || i2 == 3) {
                                            ofFloat = Keyframe.ofInt(f2, !AbstractC0505k.m2396i(xmlPullParser2, "value") ? 0 : m2394k4.getInt(0, 0));
                                        } else {
                                            ofFloat = null;
                                        }
                                        int resourceId = !AbstractC0505k.m2396i(xmlPullParser2, "interpolator") ? 0 : m2394k4.getResourceId(1, 0);
                                        if (resourceId > 0) {
                                            ofFloat.setInterpolator(AbstractC1077v0.m1296H(context, resourceId));
                                        }
                                        m2394k4.recycle();
                                        if (ofFloat != null) {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(ofFloat);
                                        }
                                        xmlPullParser.next();
                                        i3 = 3;
                                        resources2 = resources;
                                        theme2 = theme;
                                        str2 = str3;
                                    } else {
                                        resources2 = resources;
                                        theme2 = theme;
                                        i3 = i8;
                                    }
                                }
                                str = str2;
                                if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                                    i3 = 3;
                                    propertyValuesHolder = null;
                                } else {
                                    Keyframe keyframe = (Keyframe) arrayList3.get(0);
                                    Keyframe keyframe2 = (Keyframe) arrayList3.get(size - 1);
                                    float fraction = keyframe2.getFraction();
                                    if (fraction < 1.0f) {
                                        if (fraction < 0.0f) {
                                            keyframe2.setFraction(1.0f);
                                        } else {
                                            arrayList3.add(arrayList3.size(), m1247b(keyframe2, 1.0f));
                                            size++;
                                        }
                                    }
                                    float fraction2 = keyframe.getFraction();
                                    if (fraction2 != 0.0f) {
                                        if (fraction2 < 0.0f) {
                                            keyframe.setFraction(0.0f);
                                        } else {
                                            arrayList3.add(0, m1247b(keyframe, 0.0f));
                                            size++;
                                        }
                                    }
                                    Keyframe[] keyframeArr = new Keyframe[size];
                                    arrayList3.toArray(keyframeArr);
                                    int i9 = 0;
                                    while (i9 < size) {
                                        Keyframe keyframe3 = keyframeArr[i9];
                                        float f3 = 0.0f;
                                        if (keyframe3.getFraction() < 0.0f) {
                                            if (i9 != 0) {
                                                int i10 = size - 1;
                                                f3 = 1.0f;
                                                if (i9 != i10) {
                                                    int i11 = i9;
                                                    for (int i12 = i9 + 1; i12 < i10 && keyframeArr[i12].getFraction() < 0.0f; i12++) {
                                                        i11 = i12;
                                                    }
                                                    float fraction3 = (keyframeArr[i11 + 1].getFraction() - keyframeArr[i9 - 1].getFraction()) / ((i11 - i9) + 2);
                                                    int i13 = i9;
                                                    while (i13 <= i11) {
                                                        keyframeArr[i13].setFraction(keyframeArr[i13 - 1].getFraction() + fraction3);
                                                        i13++;
                                                        size = size;
                                                    }
                                                }
                                            }
                                            keyframe3.setFraction(f3);
                                        }
                                        i9++;
                                        size = size;
                                    }
                                    propertyValuesHolder = PropertyValuesHolder.ofKeyframe(m2400e, keyframeArr);
                                    i3 = 3;
                                    if (i7 == 3) {
                                        propertyValuesHolder.setEvaluator(C1093h.f4075a);
                                    }
                                }
                                if (propertyValuesHolder == null) {
                                    propertyValuesHolder = m1246c(m2394k2, i6, 0, 1, m2400e);
                                }
                                if (propertyValuesHolder != null) {
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                    }
                                    arrayList2.add(propertyValuesHolder);
                                }
                                m2394k2.recycle();
                                i4 = 1;
                            } else {
                                attributeSet2 = asAttributeSet;
                                str = str2;
                            }
                            xmlPullParser.next();
                            i5 = 2;
                            resources2 = resources;
                            theme2 = theme;
                            xmlPullParser2 = xmlPullParser;
                            asAttributeSet = attributeSet2;
                            str2 = str;
                        }
                    }
                    if (arrayList2 != null) {
                        int size2 = arrayList2.size();
                        propertyValuesHolderArr = new PropertyValuesHolder[size2];
                        for (int i14 = 0; i14 < size2; i14++) {
                            propertyValuesHolderArr[i14] = (PropertyValuesHolder) arrayList2.get(i14);
                        }
                    } else {
                        propertyValuesHolderArr = null;
                    }
                    if (propertyValuesHolderArr != null && (valueAnimator instanceof ValueAnimator)) {
                        valueAnimator.setValues(propertyValuesHolderArr);
                    }
                    z = true;
                }
                if (animatorSet != null && !z) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(valueAnimator);
                }
                resources2 = resources;
                theme2 = theme;
                xmlPullParser2 = xmlPullParser;
            }
        }
    }

    /* renamed from: b */
    public static Keyframe m1247b(Keyframe keyframe, float f) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    /* renamed from: c */
    public static PropertyValuesHolder m1246c(TypedArray typedArray, int i, int i2, int i3, String str) {
        PropertyValuesHolder ofInt;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i4 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i5 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((z && m1245d(i4)) || (z2 && m1245d(i5))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i != 2) {
            C1093h c1093h = i == 3 ? C1093h.f4075a : null;
            if (z3) {
                if (z) {
                    float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                    if (z2) {
                        ofInt = PropertyValuesHolder.ofFloat(str, dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                    } else {
                        ofInt = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    ofInt = PropertyValuesHolder.ofFloat(str, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                }
            } else if (!z) {
                if (z2) {
                    ofInt = PropertyValuesHolder.ofInt(str, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m1245d(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
                }
                if (propertyValuesHolder == null && c1093h != null) {
                    propertyValuesHolder.setEvaluator(c1093h);
                    return propertyValuesHolder;
                }
            } else {
                int dimension2 = i4 == 5 ? (int) typedArray.getDimension(i2, 0.0f) : m1245d(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
                if (z2) {
                    ofInt = PropertyValuesHolder.ofInt(str, dimension2, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m1245d(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
                } else {
                    ofInt = PropertyValuesHolder.ofInt(str, dimension2);
                }
            }
            propertyValuesHolder = ofInt;
            return propertyValuesHolder == null ? propertyValuesHolder : propertyValuesHolder;
        }
        String string = typedArray.getString(i2);
        String string2 = typedArray.getString(i3);
        C0509d[] m3469t = AbstractC0022t.m3469t(string);
        C0509d[] m3469t2 = AbstractC0022t.m3469t(string2);
        if (m3469t == null && m3469t2 == null) {
            return null;
        }
        if (m3469t == null) {
            if (m3469t2 != null) {
                return PropertyValuesHolder.ofObject(str, new C1091f(), m3469t2);
            }
            return null;
        }
        C1091f c1091f = new C1091f();
        if (m3469t2 == null) {
            ofObject = PropertyValuesHolder.ofObject(str, c1091f, m3469t);
        } else if (!AbstractC0022t.m3497f(m3469t, m3469t2)) {
            throw new InflateException(" Can't morph from " + string + " to " + string2);
        } else {
            ofObject = PropertyValuesHolder.ofObject(str, c1091f, m3469t, m3469t2);
        }
        return ofObject;
    }

    /* renamed from: d */
    public static boolean m1245d(int i) {
        return i >= 28 && i <= 31;
    }

    /* renamed from: e */
    public static ValueAnimator m1244e(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator2;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator3;
        TypedArray m2394k = AbstractC0505k.m2394k(resources, theme, attributeSet, AbstractC1086a.f4057g);
        TypedArray m2394k2 = AbstractC0505k.m2394k(resources, theme, attributeSet, AbstractC1086a.f4061k);
        ValueAnimator valueAnimator4 = valueAnimator == null ? new ValueAnimator() : valueAnimator;
        long j = AbstractC0505k.m2396i(xmlPullParser, "duration") ? m2394k.getInt(1, 300) : 300;
        int i = 0;
        long j2 = !AbstractC0505k.m2396i(xmlPullParser, "startOffset") ? 0 : m2394k.getInt(2, 0);
        int i2 = !AbstractC0505k.m2396i(xmlPullParser, "valueType") ? 4 : m2394k.getInt(7, 4);
        if (AbstractC0505k.m2396i(xmlPullParser, "valueFrom") && AbstractC0505k.m2396i(xmlPullParser, "valueTo")) {
            if (i2 == 4) {
                TypedValue peekValue = m2394k.peekValue(5);
                boolean z = peekValue != null;
                int i3 = z ? peekValue.type : 0;
                TypedValue peekValue2 = m2394k.peekValue(6);
                boolean z2 = peekValue2 != null;
                i2 = ((z && m1245d(i3)) || (z2 && m1245d(z2 ? peekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder m1246c = m1246c(m2394k, i2, 5, 6, "");
            if (m1246c != null) {
                valueAnimator4.setValues(m1246c);
            }
        }
        valueAnimator4.setDuration(j);
        valueAnimator4.setStartDelay(j2);
        valueAnimator4.setRepeatCount(!AbstractC0505k.m2396i(xmlPullParser, "repeatCount") ? 0 : m2394k.getInt(3, 0));
        valueAnimator4.setRepeatMode(!AbstractC0505k.m2396i(xmlPullParser, "repeatMode") ? 1 : m2394k.getInt(4, 1));
        if (m2394k2 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator4;
            String m2400e = AbstractC0505k.m2400e(m2394k2, xmlPullParser, "pathData", 1);
            if (m2400e != null) {
                String m2400e2 = AbstractC0505k.m2400e(m2394k2, xmlPullParser, "propertyXName", 2);
                String m2400e3 = AbstractC0505k.m2400e(m2394k2, xmlPullParser, "propertyYName", 3);
                if (m2400e2 == null && m2400e3 == null) {
                    throw new InflateException(m2394k2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path m3467u = AbstractC0022t.m3467u(m2400e);
                float f2 = 0.5f * f;
                PathMeasure pathMeasure = new PathMeasure(m3467u, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f3 = 0.0f;
                do {
                    f3 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f3));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(m3467u, false);
                int min = Math.min(100, ((int) (f3 / f2)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f4 = f3 / (min - 1);
                valueAnimator2 = valueAnimator4;
                typedArray = m2394k;
                int i4 = 0;
                float f5 = 0.0f;
                while (true) {
                    if (i >= min) {
                        break;
                    }
                    int i5 = min;
                    pathMeasure2.getPosTan(f5 - ((Float) arrayList.get(i4)).floatValue(), fArr3, null);
                    fArr[i] = fArr3[0];
                    fArr2[i] = fArr3[1];
                    f5 += f4;
                    int i6 = i4 + 1;
                    if (i6 < arrayList.size() && f5 > ((Float) arrayList.get(i6)).floatValue()) {
                        pathMeasure2.nextContour();
                        i4 = i6;
                    }
                    i++;
                    min = i5;
                }
                PropertyValuesHolder ofFloat = m2400e2 != null ? PropertyValuesHolder.ofFloat(m2400e2, fArr) : null;
                PropertyValuesHolder ofFloat2 = m2400e3 != null ? PropertyValuesHolder.ofFloat(m2400e3, fArr2) : null;
                if (ofFloat == null) {
                    i = 0;
                    objectAnimator.setValues(ofFloat2);
                } else {
                    i = 0;
                    if (ofFloat2 == null) {
                        objectAnimator.setValues(ofFloat);
                    } else {
                        objectAnimator.setValues(ofFloat, ofFloat2);
                    }
                }
            } else {
                valueAnimator2 = valueAnimator4;
                typedArray = m2394k;
                objectAnimator.setPropertyName(AbstractC0505k.m2400e(m2394k2, xmlPullParser, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator4;
            typedArray = m2394k;
        }
        if (AbstractC0505k.m2396i(xmlPullParser, "interpolator")) {
            typedArray2 = typedArray;
            i = typedArray2.getResourceId(i, i);
        } else {
            typedArray2 = typedArray;
        }
        if (i > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AbstractC1077v0.m1296H(context, i));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (m2394k2 != null) {
            m2394k2.recycle();
        }
        return valueAnimator3;
    }
}