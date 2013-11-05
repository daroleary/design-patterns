package com.pattern.factory.solution4

import com.pattern.factory.suit.Armani
import com.pattern.factory.suit.ISuit
import com.pattern.factory.suit.StrippedSuit
import com.pattern.factory.suit.SuitType

class SuitFactoryTest extends GroovyTestCase {

    void testCreateSuit() {
        SuitFactory suitFactoryInstance = SuitFactory.INSTANCE;

        suitFactoryInstance.register(SuitType.ARMANI, Armani.class);
        ISuit suit = suitFactoryInstance.createSuit(SuitType.ARMANI);

        assert suit instanceof ISuit
        assert suit instanceof Armani
        assertFalse suit instanceof StrippedSuit
    }
}
