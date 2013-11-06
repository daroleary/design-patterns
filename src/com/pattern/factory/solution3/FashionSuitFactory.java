package com.pattern.factory.solution3;

import com.pattern.factory.suit.Armani;

public class FashionSuitFactory extends SuitFactory {
    @Override
    public void loadSuits() {
        addSuit(new Armani());
    }
}
