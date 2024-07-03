package org.example;

import org.example.command.Command;
import org.example.executor.CommandExecutor;
import org.example.factory.CommandFactory;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutor();
        CommandFactory commandFactory = new CommandFactory();

        // Example usage:
        // Resize an image
        Command resizeCommand = commandFactory.createCommand("resize", new String[]{"--width", "800", "--height", "600", "image.jpg"});
        executor.execute(resizeCommand);

        // Extend an image using AI
        Command extendCommand = commandFactory.createCommand("extend", new String[]{"--direction", "right", "--pixels", "300", "image.jpg"});
        executor.execute(extendCommand);

        // Crop an image
        Command cropCommand = commandFactory.createCommand("crop", new String[]{"--top", "10", "--right", "10", "--bottom", "50", "--left", "50", "image.jpg"});
        executor.execute(cropCommand);

        // Remove the background of an image
        Command removeBgCommand = commandFactory.createCommand("remove-bg", new String[]{"image.jpg"});
        executor.execute(removeBgCommand);

        // Combine operations
        Command combineCommand = commandFactory.createCommand("combine", new String[]{"--operation1", "remove-bg", "--operation2", "resize", "--width", "800", "--height", "600", "image.jpg"});
        executor.execute(combineCommand);

        // Store result in Google Drive
        Command storeGDriveCommand = commandFactory.createCommand("store", new String[]{"--service", "google-drive", "--path", "/MyImages/result.jpg", "image.jpg"});
        executor.execute(storeGDriveCommand);

        // Store result in AWS S3
        Command storeS3Command = commandFactory.createCommand("store", new String[]{"--service", "aws-s3", "--bucket", "mybucket", "--key", "result.jpg", "image.jpg"});
        executor.execute(storeS3Command);
    }
}