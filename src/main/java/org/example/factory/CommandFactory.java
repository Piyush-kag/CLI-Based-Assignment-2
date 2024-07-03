package org.example.factory;

import org.example.command.CombineCommand;
import org.example.command.Command;
import org.example.command.CropCommand;
import org.example.command.ExtendCommand;
import org.example.command.RemoveBgCommand;
import org.example.command.ResizeCommand;
import org.example.command.StoreCommand;

public class CommandFactory {
    public Command createCommand(String type, String[] args) {
        switch (type) {
            case "resize":
                return new ResizeCommand(args);
            case "extend":
                return new ExtendCommand(args);
            case "crop":
                return new CropCommand(args);
            case "remove-bg":
                return new RemoveBgCommand(args);
            case "combine":
                return new CombineCommand(args);
            case "store":
                return new StoreCommand(args);
            default:
                throw new IllegalArgumentException("Unknown command type: " + type);
        }
    }
}
