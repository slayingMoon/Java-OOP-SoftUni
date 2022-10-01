package DesignPatterns_Exercise.factory;

public class PizzaFactory {
    public static Pizza createPizza(String pizzaType) {
        Pizza pizza = null;

        switch (pizzaType) {
            case "Bulgarian":
                pizza = new BulgarianPizza(45);
                break;
            case "Italian":
                pizza = new ItalianPizza(20);
                break;
        }
        return pizza;
    }
}
