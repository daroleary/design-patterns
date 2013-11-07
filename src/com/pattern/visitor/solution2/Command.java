package com.pattern.visitor.solution2;

import java.util.ArrayList;
import java.util.List;

public class Command implements ICommand {
    List<Instruction> _instructions = new ArrayList<>();
    String _extraData;

    public Command(String extraData, List<Instruction> instructions) {
        _extraData = extraData;
        _instructions = instructions;
    }

    @Override
    public void accept(CommandVisitor visitor) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
