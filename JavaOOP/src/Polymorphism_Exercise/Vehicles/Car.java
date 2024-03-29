package Polymorphism_Exercise.Vehicles;

public class Car extends Vehicle{
    private static final double AIR_CONDITIONER_ADDITIONAL_CONSUMPTION = 0.9;

    public Car(double fuel, double fuelConsumption) {
        super(fuel, fuelConsumption
                + AIR_CONDITIONER_ADDITIONAL_CONSUMPTION);
    }

}
