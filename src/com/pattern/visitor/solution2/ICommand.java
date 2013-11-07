package com.pattern.visitor.solution2;

public interface ICommand {
    public void accept(CommandVisitor visitor);
}
