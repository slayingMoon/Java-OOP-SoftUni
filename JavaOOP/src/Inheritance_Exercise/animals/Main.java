package Inheritance_Exercise.animals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Map<String, List<Animal>> animals = new HashMap<>();

    public static void main(String[] args) throws IOException {

            String animalType;
            while (!(animalType = reader.readLine()).equals("Beast!")) {
                String[] animalInfo = reader.readLine().split("\\s+");
                String name = animalInfo[0];
                int age = Integer.parseInt(animalInfo[1]);
                String gender = animalInfo[2];

                try {
                    switch (animalType) {
                        case "Dog":
                            Dog dog = new Dog(name, age, gender);
                            animals.putIfAbsent(animalType, new ArrayList<>());
                            animals.get(animalType).add(dog);
                            break;
                        case "Frog":
                            Frog frog = new Frog(name, age, gender);
                            animals.putIfAbsent(animalType, new ArrayList<>());
                            animals.get(animalType).add(frog);
                            break;
                        case "Cat":
                            Cat cat = new Cat(name, age, gender);
                            animals.putIfAbsent(animalType, new ArrayList<>());
                            animals.get(animalType).add(cat);
                            break;
                        case "Kitten":
                            Kitten kitten = new Kitten(name, age);
                            animals.putIfAbsent(animalType, new ArrayList<>());
                            animals.get(animalType).add(kitten);
                            break;
                        case "Tomcat":
                            Tomcat tomcat = new Tomcat(name, age);
                            animals.putIfAbsent(animalType, new ArrayList<>());
                            animals.get(animalType).add(tomcat);
                            break;
                    }
                }catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

        animals.values()
                .forEach(e -> System.out.println(e.toString().replaceAll("[\\[\\]]", "")));
    }

}
