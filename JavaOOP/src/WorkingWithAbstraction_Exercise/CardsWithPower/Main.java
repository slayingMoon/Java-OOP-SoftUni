package WorkingWithAbstraction_Exercise.CardsWithPower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String input = reader.readLine();

        printCard(input);
    }

    private static void printCard(String input) throws IOException {
        Rank rank = Enum.valueOf(Rank.class, input);
        Suit suit = Enum.valueOf(Suit.class, reader.readLine());

        Card card = new Card(suit, rank);
        System.out.println(card);
    }
}
