package WorkingWithAbstraction_Exercise.TrafficLights;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<TrafficLightsImpl> trafficLightsList = new ArrayList<>();
        String[] input = reader.readLine().split("\\s+");

        for (String light : input) {
            TrafficLights currentLight = TrafficLights.valueOf(light.toUpperCase());
            TrafficLightsImpl trafficLight = new TrafficLightsImpl(currentLight);
            trafficLightsList.add(trafficLight);
        }

        int number = Integer.parseInt(reader.readLine());
        //output
        for (int i = 0; i < number; i++) {
            StringBuilder result = new StringBuilder();
            for (TrafficLightsImpl trafficLight : trafficLightsList) {
                result.append(trafficLight.next()).append(" ");
            }
            System.out.println(result.toString().trim());
        }
    }
}
