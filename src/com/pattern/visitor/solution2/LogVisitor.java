package com.pattern.visitor.solution2;

public class LogVisitor implements InstructionsVisitor, CommandVisitor {

    @Override
    public <T extends IInstruction> void visit(T instruction) {
       Instruction instr = (Instruction) instruction;
    }

    @Override
    public <T extends ICommand> void visit(T command) {
        Command com = (Command) command;
    }
}
