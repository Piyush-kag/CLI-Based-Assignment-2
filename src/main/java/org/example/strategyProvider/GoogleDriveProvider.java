package org.example.strategyProvider;

public class GoogleDriveProvider implements ServiceProvider {
    @Override
    public void process() {
        System.out.println("Processing with Google Drive");
    }
}
