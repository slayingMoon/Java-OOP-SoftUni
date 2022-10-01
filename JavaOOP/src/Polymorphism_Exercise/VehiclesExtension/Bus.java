package Polymorphism_Exercise.VehiclesExtension;

import java.text.DecimalFormat;

public class Bus extends Vehicle{
    private static final double AIR_CONDITIONER_ADDITIONAL_CONSUMPTION = 1.4;

    public Bus(double fuel, double fuelConsumption, double tankCapacity) {
        super(fuel, fuelConsumption + AIR_CONDITIONER_ADDITIONAL_CONSUMPTION, tankCapacity);
    }

    public String driveEmpty(double distance) {
        DecimalFormat df = new DecimalFormat("#.##");

        double emptyConsumption = super.getFuelConsumption() - AIR_CONDITIONER_ADDITIONAL_CONSUMPTION;

        if (emptyConsumption * distance <= super.getFuel()) {
            super.setFuel(super.getFuel() - (emptyConsumption * distance));

            return String.format("%s travelled %s km", this.getClass().getSimpleName(), df.format(distance));
        }

        return String.format("%s needs refueling", this.getClass().getSimpleName());
    }
}
