package Polymorphism_Exercise.WildFarm;

import Polymorphism_Exercise.WildFarm.animals.*;
import Polymorphism_Exercise.WildFarm.foods.Food;
import Polymorphism_Exercise.WildFarm.foods.Meat;
import Polymorphism_Exercise.WildFarm.foods.Vegetable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String input;

        List<Animal> animals = new ArrayList<>();

        while (!(input = reader.readLine()).equals("End")) {
            String[] animalData = input.split("\\s+");
            Animal animal = getAnimal(animalData);

            String[] foodData = reader.readLine().split("\\s+");
            Food food = getFood(foodData);

            animal.makeSound();

            try {
                animal.eat(food);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

            animals.add(animal);
        }

        animals.forEach(System.out::println);
    }

    private static Food getFood(String[] foodData) {
        Food food;

        if (foodData[0].equals("Vegetable")) {
            food = new Vegetable(Integer.parseInt(foodData[1]));
        }else {
            food = new Meat(Integer.parseInt(foodData[1]));
        }

        return food;
    }

    private static Animal getAnimal(String[] data) {
        Animal animal = null;

        String type = data[0];
        String name = data[1];
        Double weight = Double.parseDouble(data[2]);
        String livingRegion = data[3];

        switch (type) {
            case "Cat":
                String breed = data[4];
                animal = new Cat(name, type, weight, livingRegion, breed);
                break;
            case "Tiger":
                animal = new Tiger(name, type, weight, livingRegion);
                break;
            case "Zebra":
                animal = new Zebra(name, type, weight, livingRegion);
                break;
            case "Mouse":
                animal = new Mouse(name, type, weight, livingRegion);
                break;
        }

        return animal;
    }
}
