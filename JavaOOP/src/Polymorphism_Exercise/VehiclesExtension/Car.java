package Polymorphism_Exercise.VehiclesExtension;

public class Car extends Vehicle {
    private static final double AIR_CONDITIONER_ADDITIONAL_CONSUMPTION = 0.9;

    public Car(double fuel, double fuelConsumption, double tankCapacity) {
        super(fuel, fuelConsumption
                + AIR_CONDITIONER_ADDITIONAL_CONSUMPTION, tankCapacity);
    }

}
