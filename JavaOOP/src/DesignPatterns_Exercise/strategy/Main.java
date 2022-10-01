package DesignPatterns_Exercise.strategy;

import DesignPatterns_Exercise.strategy.fly.CantFly;
import DesignPatterns_Exercise.strategy.fly.FlyHigh;
import DesignPatterns_Exercise.strategy.fly.FlyNearBeach;

public class Main {
    public static void main(String[] args) {
        Bird eagle = new Bird(new CantFly());
        eagle.fly();
        eagle.setStrategy(new FlyNearBeach());
        eagle.fly();
        eagle.setStrategy(new FlyHigh());
        eagle.fly();
    }
}
