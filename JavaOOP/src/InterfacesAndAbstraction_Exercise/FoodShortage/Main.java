package InterfacesAndAbstraction_Exercise.FoodShortage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int numberOfPeople = Integer.parseInt(reader.readLine());

        Map<String, Buyer> buyersByName = new HashMap<>();

        while (numberOfPeople-- > 0) {
            Buyer buyer = createBuyer(reader.readLine());

            buyersByName.put(buyer.getName(), buyer);
        }

        String name;

        while (!(name = reader.readLine()).equals("End")) {
            Buyer buyer  = buyersByName.get(name);

            if (buyer != null) {
                buyer.buyFood();
            }
        }

        System.out.println(buyersByName.values().stream()
        .mapToInt(Buyer::getFood)
                .sum());

    }

    private static Buyer createBuyer(String input) {
        String[] data = input.split("\\s+");

        if (data.length > 3) {
            return new Citizen(data[0], Integer.parseInt(data[1]), data[2], data[3]);
        }else {
            return new Rebel(data[0], Integer.parseInt(data[1]), data[2]);
        }

    }

}
