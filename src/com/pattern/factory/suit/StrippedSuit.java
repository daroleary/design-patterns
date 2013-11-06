package com.pattern.factory.suit;

public class StrippedSuit implements ISuit {

    @Override
    public SuitType type() {
        return SuitType.STRIPPED;
    }
}
