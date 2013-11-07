package com.pattern.visitor.solution2;

public interface CommandVisitor {
    public <T extends ICommand> void visit(T command);
}
