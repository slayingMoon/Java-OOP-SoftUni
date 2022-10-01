package Encapsulation_Exercise.ShoppingSpree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    private static BufferedReader reader;
    private static Map<String, Person> people;
    private static Map<String, Product> products;

    static {
        reader = new BufferedReader(new InputStreamReader(System.in));
        people = new LinkedHashMap<>();
        products = new LinkedHashMap<>();
    }

    public static void main(String[] args) throws IOException {
        try {
            getPeople();
            getProducts();

            String input;
            while (!(input = reader.readLine()).equals("END")) {
                String[] data = input.split("\\s+");
                String personName = data[0];
                String productName = data[1];

                if (people.containsKey(personName) && products.containsKey(productName)) {
                    Person person = people.get(personName);
                    Product product = products.get(productName);

                    person.buyProduct(product);
                }
            }

        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        people.values()
                .forEach(System.out::println);

    }

    private static void getProducts() throws IOException {
        String[] tokens = getArray();
        for (int i = 0; i < tokens.length; i+=2) {
            String name = tokens[i];
            double cost = Double.parseDouble(tokens[i+1]);
            products.putIfAbsent(name, new Product(name, cost));
        }
    }

    private static void getPeople() throws IOException {
        String[] tokens = getArray();
        for (int i = 0; i < tokens.length; i+=2) {
            String name = tokens[i];
            double money = Double.parseDouble(tokens[i+1]);
            people.putIfAbsent(name, new Person(name, money));
        }
    }

    private static String[] getArray() throws IOException {
        return reader.readLine().split("[=;]");
    }
}
