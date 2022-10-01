package WorkingWithAbstraction_Exercise.CardRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EnumSet;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String input = reader.readLine();

        printRanks(input);
    }

    private static void printRanks(String input) {
        System.out.printf("%s:%n", input);
        EnumSet.allOf(Rank.class)
                .forEach(rank -> System.out.println(String.format("Ordinal value: %d; Name value: %s", rank.getRank(), rank)));
    }
}
