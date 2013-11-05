package com.pattern.factory.solution1

import com.pattern.factory.suit.Armani
import com.pattern.factory.suit.ISuit
import com.pattern.factory.suit.StrippedSuit
import com.pattern.factory.suit.SuitType

class SuitFactoryTest extends GroovyTestCase {
    void testCreateSuit() {

        SuitFactory factory = new SuitFactory();
        ISuit suit = factory.createSuit(SuitType.ARMANI);

        assert suit instanceof ISuit
        assert suit instanceof Armani
        assertFalse suit instanceof StrippedSuit
    }
}
