package org.example.command;

import static java.lang.System.*;

public class ResizeCommand implements Command {
    private String[] args;
    public ResizeCommand(String[] args) {

        this.args = args;
    }
    @Override
    public void execute() {

        out.println("Resizing image with arguments: " + String.join(" ", args));
    }
}
