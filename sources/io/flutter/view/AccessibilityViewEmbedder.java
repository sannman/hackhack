package io.flutter.view;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import java.util.HashMap;
import java.util.Map;

class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private final Map<View, Rect> embeddedViewToDisplayBounds;
    private final SparseArray<m> flutterIdToOrigin = new SparseArray<>();
    private int nextFlutterId;
    private final Map<m, Integer> originToFlutterId;
    private final l reflectionAccessors = new l();
    private final View rootAccessibilityView;

    public AccessibilityViewEmbedder(View view, int i2) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i2;
        this.originToFlutterId = new HashMap();
        this.embeddedViewToDisplayBounds = new HashMap();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0095 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void addChildrenToFlutterNode(android.view.accessibility.AccessibilityNodeInfo r6, android.view.View r7, android.view.accessibility.AccessibilityNodeInfo r8) {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            int r1 = r6.getChildCount()
            if (r0 >= r1) goto L_0x0099
            io.flutter.view.l r1 = r5.reflectionAccessors
            java.lang.reflect.Method r2 = r1.f798f
            java.lang.reflect.Field r3 = r1.f797e
            java.lang.reflect.Method r1 = r1.f796d
            if (r1 != 0) goto L_0x0016
            if (r3 == 0) goto L_0x0060
            if (r2 != 0) goto L_0x0016
            goto L_0x0060
        L_0x0016:
            java.lang.String r4 = "AccessibilityBridge"
            if (r1 == 0) goto L_0x0039
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x002b, InvocationTargetException -> 0x0029 }
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch:{ IllegalAccessException -> 0x002b, InvocationTargetException -> 0x0029 }
            java.lang.Object r1 = r1.invoke(r6, r2)     // Catch:{ IllegalAccessException -> 0x002b, InvocationTargetException -> 0x0029 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ IllegalAccessException -> 0x002b, InvocationTargetException -> 0x0029 }
            goto L_0x0061
        L_0x0029:
            r1 = move-exception
            goto L_0x002d
        L_0x002b:
            r1 = move-exception
            goto L_0x0033
        L_0x002d:
            java.lang.String r2 = "The getChildId method threw an exception when invoked."
            android.util.Log.w(r4, r2, r1)
            goto L_0x0060
        L_0x0033:
            java.lang.String r2 = "Failed to access getChildId method."
            android.util.Log.w(r4, r2, r1)
            goto L_0x0060
        L_0x0039:
            java.lang.Object r1 = r3.get(r6)     // Catch:{ IllegalAccessException -> 0x0053, InvocationTargetException -> 0x0051, ArrayIndexOutOfBoundsException -> 0x004f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x0053, InvocationTargetException -> 0x0051, ArrayIndexOutOfBoundsException -> 0x004f }
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch:{ IllegalAccessException -> 0x0053, InvocationTargetException -> 0x0051, ArrayIndexOutOfBoundsException -> 0x004f }
            java.lang.Object r1 = r2.invoke(r1, r3)     // Catch:{ IllegalAccessException -> 0x0053, InvocationTargetException -> 0x0051, ArrayIndexOutOfBoundsException -> 0x004f }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ IllegalAccessException -> 0x0053, InvocationTargetException -> 0x0051, ArrayIndexOutOfBoundsException -> 0x004f }
            r1.getClass()     // Catch:{ IllegalAccessException -> 0x0053, InvocationTargetException -> 0x0051, ArrayIndexOutOfBoundsException -> 0x004f }
            goto L_0x0061
        L_0x004f:
            r1 = move-exception
            goto L_0x0055
        L_0x0051:
            r1 = move-exception
            goto L_0x0055
        L_0x0053:
            r1 = move-exception
            goto L_0x005b
        L_0x0055:
            java.lang.String r2 = "The longArrayGetIndex method threw an exception when invoked."
            android.util.Log.w(r4, r2, r1)
            goto L_0x0060
        L_0x005b:
            java.lang.String r2 = "Failed to access longArrayGetIndex method or the childNodeId field."
            android.util.Log.w(r4, r2, r1)
        L_0x0060:
            r1 = 0
        L_0x0061:
            if (r1 != 0) goto L_0x0064
            goto L_0x0095
        L_0x0064:
            long r1 = r1.longValue()
            r3 = 32
            long r1 = r1 >> r3
            int r1 = (int) r1
            io.flutter.view.m r2 = new io.flutter.view.m
            r2.<init>(r7, r1)
            java.util.Map<io.flutter.view.m, java.lang.Integer> r3 = r5.originToFlutterId
            boolean r3 = r3.containsKey(r2)
            if (r3 == 0) goto L_0x0086
            java.util.Map<io.flutter.view.m, java.lang.Integer> r1 = r5.originToFlutterId
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x0090
        L_0x0086:
            int r2 = r5.nextFlutterId
            int r3 = r2 + 1
            r5.nextFlutterId = r3
            r5.cacheVirtualIdMappings(r7, r1, r2)
            r1 = r2
        L_0x0090:
            android.view.View r2 = r5.rootAccessibilityView
            r8.addChild(r2, r1)
        L_0x0095:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.AccessibilityViewEmbedder.addChildrenToFlutterNode(android.view.accessibility.AccessibilityNodeInfo, android.view.View, android.view.accessibility.AccessibilityNodeInfo):void");
    }

    private void cacheVirtualIdMappings(View view, int i2, int i3) {
        m mVar = new m(view, i2);
        this.originToFlutterId.put(mVar, Integer.valueOf(i3));
        this.flutterIdToOrigin.put(i3, mVar);
    }

    private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, int i2, View view) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i2);
        obtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtain.setSource(this.rootAccessibilityView, i2);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        copyAccessibilityFields(accessibilityNodeInfo, obtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, this.embeddedViewToDisplayBounds.get(view), obtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, obtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, obtain);
        return obtain;
    }

    private void copyAccessibilityFields(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
        accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
        accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
        accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
        accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
        accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
        accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
        accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
        accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
        accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        int i2 = Build.VERSION.SDK_INT;
        accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
        accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        if (i2 >= 26) {
            accessibilityNodeInfo2.setAvailableExtraData(accessibilityNodeInfo.getAvailableExtraData());
            accessibilityNodeInfo2.setHintText(accessibilityNodeInfo.getHintText());
            accessibilityNodeInfo2.setShowingHintText(accessibilityNodeInfo.isShowingHintText());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setFlutterNodeParent(android.view.accessibility.AccessibilityNodeInfo r6, android.view.View r7, android.view.accessibility.AccessibilityNodeInfo r8) {
        /*
            r5 = this;
            io.flutter.view.l r0 = r5.reflectionAccessors
            java.lang.reflect.Method r0 = r0.f794b
            r1 = 0
            java.lang.String r2 = "AccessibilityBridge"
            if (r0 == 0) goto L_0x0024
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ IllegalAccessException -> 0x0017, InvocationTargetException -> 0x0015 }
            java.lang.Object r0 = r0.invoke(r6, r3)     // Catch:{ IllegalAccessException -> 0x0017, InvocationTargetException -> 0x0015 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ IllegalAccessException -> 0x0017, InvocationTargetException -> 0x0015 }
            r0.getClass()     // Catch:{ IllegalAccessException -> 0x0017, InvocationTargetException -> 0x0015 }
            goto L_0x0077
        L_0x0015:
            r0 = move-exception
            goto L_0x0019
        L_0x0017:
            r0 = move-exception
            goto L_0x001f
        L_0x0019:
            java.lang.String r3 = "The getParentNodeId method threw an exception when invoked."
            android.util.Log.w(r2, r3, r0)
            goto L_0x0024
        L_0x001f:
            java.lang.String r3 = "Failed to access getParentNodeId method."
            android.util.Log.w(r2, r3, r0)
        L_0x0024:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            r4 = 0
            if (r0 >= r3) goto L_0x0032
            java.lang.String r6 = "Unexpected Android version. Unable to find the parent ID."
            android.util.Log.w(r2, r6)
        L_0x0030:
            r0 = r4
            goto L_0x0077
        L_0x0032:
            android.view.accessibility.AccessibilityNodeInfo r6 = android.view.accessibility.AccessibilityNodeInfo.obtain(r6)
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r0.setDataPosition(r1)
            r6.writeToParcel(r0, r1)
            r0.setDataPosition(r1)
            long r2 = r0.readLong()
            boolean r6 = io.flutter.view.l.b(r2, r1)
            if (r6 == 0) goto L_0x0050
            r0.readInt()
        L_0x0050:
            r6 = 1
            boolean r6 = io.flutter.view.l.b(r2, r6)
            if (r6 == 0) goto L_0x005a
            r0.readLong()
        L_0x005a:
            r6 = 2
            boolean r6 = io.flutter.view.l.b(r2, r6)
            if (r6 == 0) goto L_0x0064
            r0.readInt()
        L_0x0064:
            r6 = 3
            boolean r6 = io.flutter.view.l.b(r2, r6)
            if (r6 == 0) goto L_0x0073
            long r1 = r0.readLong()
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
        L_0x0073:
            r0.recycle()
            goto L_0x0030
        L_0x0077:
            if (r0 != 0) goto L_0x007a
            goto L_0x009a
        L_0x007a:
            long r0 = r0.longValue()
            r6 = 32
            long r0 = r0 >> r6
            int r6 = (int) r0
            java.util.Map<io.flutter.view.m, java.lang.Integer> r0 = r5.originToFlutterId
            io.flutter.view.m r1 = new io.flutter.view.m
            r1.<init>(r7, r6)
            java.lang.Object r6 = r0.get(r1)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L_0x009a
            android.view.View r7 = r5.rootAccessibilityView
            int r6 = r6.intValue()
            r8.setParent(r7, r6)
        L_0x009a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.AccessibilityViewEmbedder.setFlutterNodeParent(android.view.accessibility.AccessibilityNodeInfo, android.view.View, android.view.accessibility.AccessibilityNodeInfo):void");
    }

    private void setFlutterNodesTranslateBounds(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        AccessibilityNodeInfo createAccessibilityNodeInfo;
        m mVar = this.flutterIdToOrigin.get(i2);
        if (mVar == null) {
            return null;
        }
        Map<View, Rect> map = this.embeddedViewToDisplayBounds;
        View view = mVar.f799a;
        if (!map.containsKey(view) || view.getAccessibilityNodeProvider() == null || (createAccessibilityNodeInfo = view.getAccessibilityNodeProvider().createAccessibilityNodeInfo(mVar.f800b)) == null) {
            return null;
        }
        return convertToFlutterNode(createAccessibilityNodeInfo, i2, view);
    }

    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long a2 = l.a(this.reflectionAccessors, accessibilityRecord);
        if (a2 == null) {
            return null;
        }
        return this.originToFlutterId.get(new m(view, (int) (a2.longValue() >> 32)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.accessibility.AccessibilityNodeInfo getRootNode(android.view.View r6, int r7, android.graphics.Rect r8) {
        /*
            r5 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r6.createAccessibilityNodeInfo()
            io.flutter.view.l r1 = r5.reflectionAccessors
            java.lang.String r2 = "AccessibilityBridge"
            java.lang.reflect.Method r1 = r1.f793a
            r3 = 0
            if (r1 != 0) goto L_0x000e
            goto L_0x0027
        L_0x000e:
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException -> 0x001a, InvocationTargetException -> 0x0018 }
            java.lang.Object r1 = r1.invoke(r0, r4)     // Catch:{ IllegalAccessException -> 0x001a, InvocationTargetException -> 0x0018 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ IllegalAccessException -> 0x001a, InvocationTargetException -> 0x0018 }
            goto L_0x0028
        L_0x0018:
            r1 = move-exception
            goto L_0x001c
        L_0x001a:
            r1 = move-exception
            goto L_0x0022
        L_0x001c:
            java.lang.String r4 = "The getSourceNodeId method threw an exception when invoked."
            android.util.Log.w(r2, r4, r1)
            goto L_0x0027
        L_0x0022:
            java.lang.String r4 = "Failed to access getSourceNodeId method."
            android.util.Log.w(r2, r4, r1)
        L_0x0027:
            r1 = r3
        L_0x0028:
            if (r1 != 0) goto L_0x002b
            return r3
        L_0x002b:
            java.util.Map<android.view.View, android.graphics.Rect> r2 = r5.embeddedViewToDisplayBounds
            r2.put(r6, r8)
            long r1 = r1.longValue()
            r8 = 32
            long r1 = r1 >> r8
            int r8 = (int) r1
            r5.cacheVirtualIdMappings(r6, r8, r7)
            android.view.accessibility.AccessibilityNodeInfo r6 = r5.convertToFlutterNode(r0, r7, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.AccessibilityViewEmbedder.getRootNode(android.view.View, int, android.graphics.Rect):android.view.accessibility.AccessibilityNodeInfo");
    }

    public boolean onAccessibilityHoverEvent(int i2, MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        m mVar = this.flutterIdToOrigin.get(i2);
        if (mVar == null) {
            return false;
        }
        Map<View, Rect> map = this.embeddedViewToDisplayBounds;
        View view = mVar.f799a;
        Rect rect = map.get(view);
        int pointerCount = motionEvent2.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < motionEvent2.getPointerCount(); i3++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerPropertiesArr[i3] = pointerProperties;
            motionEvent2.getPointerProperties(i3, pointerProperties);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent2.getPointerCoords(i3, pointerCoords);
            MotionEvent.PointerCoords pointerCoords2 = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i3] = pointerCoords2;
            pointerCoords2.x -= (float) rect.left;
            pointerCoords2.y -= (float) rect.top;
        }
        return view.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent2.getDownTime(), motionEvent2.getEventTime(), motionEvent2.getAction(), motionEvent2.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent2.getMetaState(), motionEvent2.getButtonState(), motionEvent2.getXPrecision(), motionEvent2.getYPrecision(), motionEvent2.getDeviceId(), motionEvent2.getEdgeFlags(), motionEvent2.getSource(), motionEvent2.getFlags()));
    }

    public boolean performAction(int i2, int i3, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        m mVar = this.flutterIdToOrigin.get(i2);
        if (mVar == null || (accessibilityNodeProvider = mVar.f799a.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(mVar.f800b, i3, bundle);
    }

    public View platformViewOfNode(int i2) {
        m mVar = this.flutterIdToOrigin.get(i2);
        if (mVar == null) {
            return null;
        }
        return mVar.f799a;
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long a2 = l.a(this.reflectionAccessors, accessibilityEvent);
        if (a2 != null) {
            int longValue = (int) (a2.longValue() >> 32);
            Integer num = this.originToFlutterId.get(new m(view, longValue));
            if (num == null) {
                int i2 = this.nextFlutterId;
                this.nextFlutterId = i2 + 1;
                Integer valueOf = Integer.valueOf(i2);
                cacheVirtualIdMappings(view, longValue, i2);
                num = valueOf;
            }
            obtain.setSource(this.rootAccessibilityView, num.intValue());
            obtain.setClassName(accessibilityEvent.getClassName());
            obtain.setPackageName(accessibilityEvent.getPackageName());
            int i3 = 0;
            while (i3 < obtain.getRecordCount()) {
                AccessibilityRecord record = obtain.getRecord(i3);
                Long a3 = l.a(this.reflectionAccessors, record);
                if (a3 != null) {
                    m mVar = new m(view, (int) (a3.longValue() >> 32));
                    if (this.originToFlutterId.containsKey(mVar)) {
                        record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(mVar).intValue());
                        i3++;
                    }
                }
            }
            return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, obtain);
        }
        return false;
    }
}
