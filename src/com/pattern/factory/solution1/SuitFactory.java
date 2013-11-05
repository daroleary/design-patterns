package com.pattern.factory.solution1;

import com.pattern.factory.suit.Armani;
import com.pattern.factory.suit.ISuit;
import com.pattern.factory.suit.StrippedSuit;
import com.pattern.factory.suit.SuitType;

public class SuitFactory {

    public ISuit createSuit(SuitType suitType) throws Exception {
        ISuit suit;

        switch (suitType) {
            case ARMANI:
                suit = new Armani();
                break;
            case STRIPPED:
                suit = new StrippedSuit();
                break;
            default:
                throw new Exception("Unknown suit type:" + suitType);
        }

        return suit;
    }
}
