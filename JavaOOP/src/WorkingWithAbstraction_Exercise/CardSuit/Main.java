package WorkingWithAbstraction_Exercise.CardSuit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EnumSet;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String input = reader.readLine();

        switch (input) {
            case "Card Suits":
                printSuits(input);
                break;
        }
    }

    private static void printSuits(String input) {
        System.out.printf("%s:%n", input);
        EnumSet.allOf(Suits.class)
                .forEach(suit -> System.out.println(String.format("Ordinal value: %d; Name value: %s", suit.getOrdinalValue(), suit)));
    }
}
