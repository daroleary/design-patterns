package com.pattern.visitor.solution2;

public interface IInstruction {
    public void accept(InstructionsVisitor visitor);
}
