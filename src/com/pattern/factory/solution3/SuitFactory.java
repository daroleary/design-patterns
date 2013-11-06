package com.pattern.factory.solution3;

import com.pattern.factory.suit.ISuit;
import com.pattern.factory.suit.SuitType;

import java.util.ArrayList;
import java.util.List;

public abstract class SuitFactory {

    private List<ISuit> _loaded = new ArrayList<>();

    public SuitFactory() {
        loadSuits();
    }

    public ISuit getSuit(SuitType suitType) {
        ISuit suit = null;
        for (ISuit loadedSuit : _loaded) {
            if (loadedSuit.type() == suitType) {
                suit = loadedSuit;
                break;
            }
        }
        return suit;
    }

    protected void addSuit(ISuit suit) {
        _loaded.add(suit);
    }

    public abstract void loadSuits();

//    //    private Map<SuitType,Class<? extends ISuit>> REGISTERED = Maps.newHashMap();
////    private Map<SuitType,ISuit> LOADED = Maps.newHashMap();
//
//    public ISuit createSuit(SuitType suitType) throws Exception {
//        if (!LOADED.containsKey(suitType)) {
//            load();
//        }
//
//        return LOADED.get(suitType);
//    }
//
//    public void register(SuitType suitType, Class<? extends ISuit> suit) {
//        REGISTERED.put(suitType, suit);
//    }
//
//    public void load() throws IllegalAccessException, InstantiationException {
//        for (Map.Entry<SuitType, Class<? extends ISuit>> suitTypeClassEntry : REGISTERED.entrySet()) {
//            SuitType suitType = suitTypeClassEntry.getKey();
//            Class<? extends ISuit> value = suitTypeClassEntry.getValue();
//
//            if (!LOADED.containsKey(suitType)) {
//                LOADED.put(suitType, value.newInstance());
//            }
//        }
//    }
}
