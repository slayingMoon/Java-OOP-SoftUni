package DesignPatterns_Exercise.observer;

public interface Subject {
    void subscribe(Observer observer);
    void unSubscribe(Observer observer);
    void notify(String text);
}
