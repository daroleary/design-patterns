package com.pattern.factory.solution2;

import com.beust.jcommander.internal.Maps;
import com.pattern.factory.suit.Armani;
import com.pattern.factory.suit.ISuit;
import com.pattern.factory.suit.StrippedSuit;
import com.pattern.factory.suit.SuitType;

import java.lang.reflect.Method;
import java.util.Map;

public class SuitFactory {

    private Map<SuitType,Class<? extends ISuit>> REGISTERED = Maps.newHashMap();
    private Map<SuitType,ISuit> LOADED = Maps.newHashMap();

    public ISuit createSuit(SuitType suitType) throws Exception {
        if (!LOADED.containsKey(suitType)) {
            load();
        }

        return LOADED.get(suitType);
    }

    public void register(SuitType suitType, Class<? extends ISuit> suit) {
        REGISTERED.put(suitType, suit);
    }

    public void load() throws IllegalAccessException, InstantiationException {
        for (Map.Entry<SuitType, Class<? extends ISuit>> suitTypeClassEntry : REGISTERED.entrySet()) {
            SuitType suitType = suitTypeClassEntry.getKey();
            Class<? extends ISuit> value = suitTypeClassEntry.getValue();

            if (!LOADED.containsKey(suitType)) {
                LOADED.put(suitType, value.newInstance());
            }
        }
    }
}
