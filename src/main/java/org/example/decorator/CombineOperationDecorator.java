package org.example.decorator;

import org.example.command.Command;

public class CombineOperationDecorator extends OperationDecorator {
    private Command additionalCommand;

    public CombineOperationDecorator(Command decoratedCommand, Command additionalCommand) {
        super(decoratedCommand);
        this.additionalCommand = additionalCommand;
    }

    @Override
    public void execute() {
        super.execute();
        additionalCommand.execute();
    }
}
