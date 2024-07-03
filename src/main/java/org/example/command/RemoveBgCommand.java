package org.example.command;

import static java.lang.System.*;

public class RemoveBgCommand implements Command {
    private String[] args;

    public RemoveBgCommand(String[] args) {

        this.args = args;
    }

    @Override
    public void execute() {

        out.println("Removing background with arguments: " + String.join(" ", args));
    }
}
