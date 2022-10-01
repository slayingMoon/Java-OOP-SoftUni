package InterfacesAndAbstraction_Exercise.BirthdayCelebrations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String input;

        List<Birthable> birthables = new ArrayList<>();

        while (!(input = reader.readLine()).equals("End")) {
            String[] tokens = input.split("\\s+");
            String object = tokens[0];

            switch (object) {
                case "Citizen":
                    String name = tokens[1];
                    int age = Integer.parseInt(tokens[2]);
                    String id = tokens[3];
                    String birthDate = tokens[4];
                    Citizen citizen = new Citizen(name, age, id, birthDate);
                    birthables.add(citizen);
                    break;
                case "Robot":
                    String model = tokens[1];
                    id = tokens[2];
                    Robot robot = new Robot(model, id);
                    break;
                case "Pet":
                    name = tokens[1];
                    birthDate = tokens[2];
                    Pet pet = new Pet(name, birthDate);
                    birthables.add(pet);
                    break;
            }
        }

        String year = reader.readLine();

        boolean hasOutput = false;

        for (Birthable birthable : birthables) {
            if (birthable.getBirthDate().endsWith(year)) {
                System.out.println(birthable.getBirthDate());
                hasOutput = true;
            }
        }

        if (!hasOutput) {
            System.out.println("<no output>");
        }
    }
}
