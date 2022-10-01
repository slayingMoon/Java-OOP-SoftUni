package Encapsulation_Exercise.PizzaCalories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Pizza pizza;

    public static void main(String[] args) {

        try {
            String input;
            while (!(input = reader.readLine()).equals("END")) {
                String[] data = input.split("\\s+");

                String product = data[0];

                switch (product) {
                    case "Pizza":
                        String pizzaName = data[1];
                        int numberOfToppings = Integer.parseInt(data[2]);
                        pizza = new Pizza(pizzaName, numberOfToppings);
                        break;
                    case "Dough":
                        String flourType = data[1];
                        String bakingTechnique = data[2];
                        double weightInGrams = Double.parseDouble(data[3]);
                        Dough dough = new Dough(flourType, bakingTechnique, weightInGrams);
                        pizza.setDough(dough);
                        break;
                    case "Topping":
                        String toppingType = data[1];
                        weightInGrams = Double.parseDouble(data[2]);
                        Topping topping = new Topping(toppingType, weightInGrams);
                        pizza.addTopping(topping);
                        break;
                }
            }

            System.out.println(pizza);

        }catch (IllegalArgumentException | IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
