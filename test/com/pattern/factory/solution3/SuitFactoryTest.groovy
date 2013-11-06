package com.pattern.factory.solution3

import com.pattern.factory.suit.Armani
import com.pattern.factory.suit.ISuit
import com.pattern.factory.suit.StrippedSuit
import com.pattern.factory.suit.SuitType

class SuitFactoryTest extends GroovyTestCase {

    void testCreateSuit() {
        FashionSuitFactory fashionSuitFactory = new FashionSuitFactory();
        ISuit fashionSuit = fashionSuitFactory.getSuit(SuitType.ARMANI);

        assert fashionSuit instanceof ISuit
        assert fashionSuit instanceof Armani
        assertFalse fashionSuit instanceof StrippedSuit

        LeisureSuitFactory leisureSuitFactory = new LeisureSuitFactory();
        ISuit leisureSuit = leisureSuitFactory.getSuit(SuitType.STRIPPED);

        assert leisureSuit instanceof ISuit
        assert leisureSuit instanceof StrippedSuit
        assertFalse leisureSuit instanceof Armani
    }
}
