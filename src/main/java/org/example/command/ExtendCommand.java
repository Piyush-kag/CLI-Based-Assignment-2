package org.example.command;

import static java.lang.System.*;

public class ExtendCommand implements Command {
    private String[] args;
    public ExtendCommand(String[] args) {

        this.args = args;
    }
    @Override
    public void execute() {

        out.println("Extending image with arguments: " + String.join(" ", args));
    }
}
