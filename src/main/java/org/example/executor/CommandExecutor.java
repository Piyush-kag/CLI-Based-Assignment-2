package org.example.executor;

import org.example.command.Command;

public class CommandExecutor {
    public void execute(Command command) {
        command.execute();
    }
}

