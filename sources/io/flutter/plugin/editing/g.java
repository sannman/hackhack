package io.flutter.plugin.editing;

import D.u;
import L.k;
import N.a;
import android.os.Bundle;
import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public final class g implements SpellCheckerSession.SpellCheckerSessionListener {

    /* renamed from: a  reason: collision with root package name */
    public final u f602a;

    /* renamed from: b  reason: collision with root package name */
    public final TextServicesManager f603b;

    /* renamed from: c  reason: collision with root package name */
    public SpellCheckerSession f604c;

    /* renamed from: d  reason: collision with root package name */
    public k f605d;

    public g(TextServicesManager textServicesManager, u uVar) {
        this.f603b = textServicesManager;
        this.f602a = uVar;
        uVar.f108c = this;
    }

    public final void a(String str, String str2, k kVar) {
        if (this.f605d != null) {
            kVar.a("error", "Previous spell check request still pending.", (Object) null);
            return;
        }
        this.f605d = kVar;
        Locale a2 = a.a(str);
        if (this.f604c == null) {
            this.f604c = this.f603b.newSpellCheckerSession((Bundle) null, a2, this, true);
        }
        this.f604c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    public final void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.f605d.c(new ArrayList());
            this.f605d = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.f605d.c(new ArrayList());
            this.f605d = null;
            return;
        }
        for (int i2 = 0; i2 < sentenceSuggestionsInfo.getSuggestionsCount(); i2++) {
            SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i2);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                HashMap hashMap = new HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i2);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i2) + offsetAt;
                hashMap.put("startIndex", Integer.valueOf(offsetAt));
                hashMap.put("endIndex", Integer.valueOf(lengthAt));
                ArrayList arrayList2 = new ArrayList();
                boolean z2 = false;
                for (int i3 = 0; i3 < suggestionsCount; i3++) {
                    String suggestionAt = suggestionsInfoAt.getSuggestionAt(i3);
                    if (!suggestionAt.equals("")) {
                        arrayList2.add(suggestionAt);
                        z2 = true;
                    }
                }
                if (z2) {
                    hashMap.put("suggestions", arrayList2);
                    arrayList.add(hashMap);
                }
            }
        }
        this.f605d.c(arrayList);
        this.f605d = null;
    }

    public final void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
