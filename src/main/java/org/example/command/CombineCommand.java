package org.example.command;

public class CombineCommand implements Command {
    private String[] args;

    public CombineCommand(String[] args) {

        this.args = args;
    }

    @Override
    public void execute() {
        System.out.println("Combining operations with arguments: " + String.join(" ", args));
    }
}