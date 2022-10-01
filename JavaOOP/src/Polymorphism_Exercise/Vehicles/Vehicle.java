package Polymorphism_Exercise.Vehicles;

import java.text.DecimalFormat;

public class Vehicle {
    private double fuel;
    private double fuelConsumption;

    protected Vehicle(double fuel, double fuelConsumption) {
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
    }

    protected String drive(double distance) {
        double fuelNeeded = distance * this.fuelConsumption;

        if (fuelNeeded > this.fuel) {
            return String.format("%s needs refueling", this.getClass().getSimpleName());
        }

        this.fuel -= fuelNeeded;

        DecimalFormat df = new DecimalFormat("#.##");
        return String.format("%s travelled %s km", this.getClass().getSimpleName(), df.format(distance));
    }

    protected void refuel(double liters) {
        this.fuel += liters;
    }

    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuel);
    }
}
