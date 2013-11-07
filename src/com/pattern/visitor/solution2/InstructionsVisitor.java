package com.pattern.visitor.solution2;

public interface InstructionsVisitor {
    public <T extends IInstruction> void visit(T instruction);
}
