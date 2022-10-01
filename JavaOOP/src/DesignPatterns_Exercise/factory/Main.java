package DesignPatterns_Exercise.factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pizzaType = scanner.nextLine();

        Pizza pizza = PizzaFactory.createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.box();
    }


}
