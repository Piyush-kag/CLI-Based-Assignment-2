package org.example.command;

import static java.lang.System.*;

public class CropCommand implements Command {
    private String[] args;

    public CropCommand(String[] args) {

        this.args = args;
    }
    @Override
    public void execute() {

        out.println("Cropping image with arguments: " + String.join(" ", args));
    }
}
