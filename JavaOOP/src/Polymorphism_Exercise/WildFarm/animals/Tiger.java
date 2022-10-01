package Polymorphism_Exercise.WildFarm.animals;

import Polymorphism_Exercise.WildFarm.foods.Food;
import Polymorphism_Exercise.WildFarm.foods.Meat;

public class Tiger extends Felime{
    public Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat(Food food) {
        if (!(food instanceof Meat)) {
            super.setFoodEaten(new Meat(0));
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }

        super.setFoodEaten(food);
    }
}
