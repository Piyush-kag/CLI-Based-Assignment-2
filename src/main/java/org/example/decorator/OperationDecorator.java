package org.example.decorator;

import org.example.command.Command;

public abstract class OperationDecorator implements Command {
    protected Command decoratedCommand;

    public OperationDecorator(Command decoratedCommand) {
        this.decoratedCommand = decoratedCommand;
    }

    @Override
    public void execute() {
        decoratedCommand.execute();
    }
}
