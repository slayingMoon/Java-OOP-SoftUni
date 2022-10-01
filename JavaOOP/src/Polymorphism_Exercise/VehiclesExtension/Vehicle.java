package Polymorphism_Exercise.VehiclesExtension;

import java.text.DecimalFormat;

public class Vehicle {
    private double fuel;
    private double fuelConsumption;
    private double tankCapacity;

    private static final String INVALID_FUEL = "Fuel must be a positive number";
    private static final String FUEL_OVER_TANK_CAPACITY = "Cannot fit fuel in tank";

    protected Vehicle(double fuel, double fuelConsumption, double tankCapacity) {
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
    }

    protected String drive(double distance) {
        double fuelNeeded = distance * this.fuelConsumption;

        if (fuelNeeded > this.fuel) {
            return String.format("%s needs refueling", this.getClass().getSimpleName());
        }

        this.setFuel(this.fuel - fuelNeeded);

        DecimalFormat df = new DecimalFormat("#.##");
        return String.format("%s travelled %s km", this.getClass().getSimpleName(), df.format(distance));
    }

    protected void refuel(double liters) {
        if (this.fuel + liters > this.tankCapacity) {
            throw new IllegalArgumentException(FUEL_OVER_TANK_CAPACITY);
        }else if (liters <= 0) {
            throw new IllegalArgumentException(INVALID_FUEL);
        }

        this.fuel += liters;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        if (fuel < 0) {
            throw new IllegalArgumentException(INVALID_FUEL);
        }else if (fuel > this.tankCapacity) {
            throw new IllegalArgumentException(FUEL_OVER_TANK_CAPACITY);
        }
        this.fuel = fuel;
    }

    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuel);
    }
}
