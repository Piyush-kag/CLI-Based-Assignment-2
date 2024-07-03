package org.example.Observer;

import org.example.command.Command;
import java.util.ArrayList;
import java.util.List;

public class ObservableOperation {
    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String status) {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }

    public void performOperation(Command command) {
        notifyObservers("Starting operation...");
        command.execute();
        notifyObservers("Operation completed.");
    }
}
