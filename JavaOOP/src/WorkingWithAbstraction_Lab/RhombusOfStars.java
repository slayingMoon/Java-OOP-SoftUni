package WorkingWithAbstraction_Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RhombusOfStars {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        int size = Integer.parseInt(reader.readLine());

        for (int starCount = 1; starCount <= size; starCount++) {
            printRow(size, starCount);
        }

        for (int starCount = size - 1; starCount >= 1; starCount--) {
            printRow(size, starCount);
        }

    }

    private static void printRow(int figureSize, int starCount) {
        for (int i = 0; i < figureSize - starCount; i++) {
            System.out.print(" ");
        }

        for (int col = 1; col < starCount; col++) {
            System.out.print("* ");
        }
        System.out.println("*");
    }
}
