package org.example.facade;

import org.example.command.CombineCommand;
import org.example.command.Command;
import org.example.command.CropCommand;
import org.example.command.ExtendCommand;
import org.example.command.RemoveBgCommand;
import org.example.command.ResizeCommand;
import org.example.command.StoreCommand;

public class ImageProcessingFacade {
    public void resize(String[] args) {
        Command resizeCommand = new ResizeCommand(args);
        resizeCommand.execute();
    }

    public void extend(String[] args) {
        Command extendCommand = new ExtendCommand(args);
        extendCommand.execute();
    }

    public void crop(String[] args) {
        Command cropCommand = new CropCommand(args);
        cropCommand.execute();
    }

    public void removeBg(String[] args) {
        Command removeBgCommand = new RemoveBgCommand(args);
        removeBgCommand.execute();
    }

    public void combine(String[] args) {
        Command combineCommand = new CombineCommand(args);
        combineCommand.execute();
    }

    public void store(String[] args) {
        Command storeCommand = new StoreCommand(args);
        storeCommand.execute();
    }
}

