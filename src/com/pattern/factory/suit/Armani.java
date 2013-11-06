package com.pattern.factory.suit;

public class Armani implements ISuit {

    @Override
    public SuitType type() {
        return SuitType.ARMANI;
    }
}
