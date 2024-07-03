package org.example.strategyProvider;

import static java.lang.System.*;

public class AWSS3Provider implements ServiceProvider {
    @Override
    public void process() {
        out.println("Processing with AWS S3");
    }
}
