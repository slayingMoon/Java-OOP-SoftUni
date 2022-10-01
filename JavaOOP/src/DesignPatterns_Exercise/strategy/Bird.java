package DesignPatterns_Exercise.strategy;

import DesignPatterns_Exercise.strategy.fly.FlyStrategy;

public class Bird {
    FlyStrategy strategy;

    public void fly() {
        this.strategy.fly();
    }

    public Bird(FlyStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(FlyStrategy strategy) {
        this.strategy = strategy;
    }
}
