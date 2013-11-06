package com.pattern.factory.solution3;

import com.pattern.factory.suit.StrippedSuit;

public class LeisureSuitFactory extends SuitFactory {

    @Override
    public void loadSuits() {
        addSuit(new StrippedSuit());
    }
}
