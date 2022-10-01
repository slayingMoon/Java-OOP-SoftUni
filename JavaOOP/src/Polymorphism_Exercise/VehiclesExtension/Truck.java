package Polymorphism_Exercise.VehiclesExtension;

public class Truck extends Vehicle {
    private static final double AIR_CONDITIONER_ADDITIONAL_CONSUMPTION = 1.6;

    public Truck(double fuel, double fuelConsumption, double tankCapacity) {
        super(fuel,fuelConsumption
                + AIR_CONDITIONER_ADDITIONAL_CONSUMPTION, tankCapacity);
    }

    @Override
    public void refuel(double liters) {
        super.refuel(liters * 0.95);
    }
}
