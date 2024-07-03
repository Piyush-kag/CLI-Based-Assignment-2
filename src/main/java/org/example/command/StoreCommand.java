package org.example.command;

public class StoreCommand implements Command {
    private String[] args;

    public StoreCommand(String[] args) {

        this.args = args;
    }

    @Override
    public void execute() {

        System.out.println("Storing result with arguments: " + String.join(" ", args));
    }
}