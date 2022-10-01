package InterfacesAndAbstraction_Lab.BorderControl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        List<Identifiable> passedBorder = new ArrayList<>();

        String input;

        while (!(input = reader.readLine()).equals("End")) {
            String[] data = input.split("\\s+");

            if (data.length > 2) {
                String name = data[0];
                int age = Integer.parseInt(data[1]);
                String id = data[2];
                passedBorder.add(new Citizen(name, age, id));
            }else {
                String id = data[0];
                String model = data[1];
                passedBorder.add(new Robot(id, model));
            }
        }

        String fakeId = reader.readLine();

        passedBorder.stream().filter(e -> e.getId().endsWith(fakeId)).forEach(e -> System.out.println(e.getId()));
    }
}
