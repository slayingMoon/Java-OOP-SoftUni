package Encapsulation_Exercise.PizzaCalories;

import java.util.HashMap;
import java.util.Map;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    private static final int CALORIES_PER_GRAM = 2;

    private static final Map<String, Double> doughModifiers = new HashMap<>() {
        {
            put("White", 1.5);
            put("Wholegrain", 1.0);
            put("Crispy", 0.9);
            put("Chewy", 1.1);
            put("Homemade", 1.0);
        }
    };

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setFlourType(String flourType) {
        if (!doughModifiers.containsKey(flourType)) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (!doughModifiers.containsKey(bakingTechnique)) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        return (CALORIES_PER_GRAM * this.weight) *
                doughModifiers.get(this.flourType) *
                doughModifiers.get(this.bakingTechnique);
    }
}
