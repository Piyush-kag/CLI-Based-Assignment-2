package org.example.Observer;

import static java.lang.System.*;

public class OperationStatusMonitor implements Observer {
    @Override
    public void update(String status) {
        out.println("Operation status: " + status);
    }
}
