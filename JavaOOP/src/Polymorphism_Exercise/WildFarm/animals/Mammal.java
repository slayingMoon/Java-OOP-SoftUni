package Polymorphism_Exercise.WildFarm.animals;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal{
    private String livingRegion;

    protected Mammal(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    protected String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");

        return String.format("%s[%s, %s, %s, %d]", super.getAnimalType(), super.getAnimalName(), df.format(super.getAnimalWeight()), getLivingRegion(), super.getFoodEaten());
    }
}
