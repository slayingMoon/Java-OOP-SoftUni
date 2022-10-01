package Polymorphism_Exercise.VehiclesExtension;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] tokens = reader.readLine().split("\\s+");

        Map<String, Vehicle> vehicleMap = new LinkedHashMap<>();

        vehicleMap.put("Car", new Car(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3])));

        tokens = reader.readLine().split("\\s+");
        vehicleMap.put("Truck", new Truck(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3])));

        tokens = reader.readLine().split("\\s+");
        vehicleMap.put("Bus", new Bus(Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3])));

        int n = Integer.parseInt(reader.readLine());

        while (n-- > 0) {
            String[] data = reader.readLine().split("\\s+");
            String command = data[0];
            double value = Double.parseDouble(data[2]);

            if (command.equals("Drive")) {
                System.out.println(vehicleMap.get(data[1]).drive(value));
            } else if (command.equals("DriveEmpty")) {
                try {
                    System.out.println(((Bus)vehicleMap.get(data[1])).driveEmpty(value));
                }catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                try {
                    vehicleMap.get(data[1]).refuel(value);
                }catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            }
        }

        for (Vehicle vehicle : vehicleMap.values()) {
            System.out.println(vehicle.toString());
        }
    }
}
