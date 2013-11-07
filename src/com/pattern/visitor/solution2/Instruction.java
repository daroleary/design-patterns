package com.pattern.visitor.solution2;

public class Instruction implements IInstruction {
    int _numFlops;
    int _numFlips;

    public Instruction(int numFlops) {
        _numFlops = numFlops;
        _numFlips = 2;
    }

    @Override
    public void accept(InstructionsVisitor visitor) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
