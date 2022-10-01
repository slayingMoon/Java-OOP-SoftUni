package ExceptionsAndErrorHandling.EnterNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RangePrinterDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            int start = Integer.parseInt(reader.readLine());
            int end = Integer.parseInt(reader.readLine());

            printNumbers(start, end);

        }catch (NumberFormatException ex) {

            System.out.println("Not a number. Try again");

        }catch (IllegalArgumentException ex) {

            System.out.println(ex.getMessage());
            System.out.println("Try again!");

            printNumbers(Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()));
        }

    }

    private static void printNumbers(int start, int end) {
        if (start < 1) {
            throw new IllegalArgumentException(start + " is not a valid number of start!");
        }
        if (end > 100) {
            throw new IllegalArgumentException(end + " is not a valid number of end!");
        }

        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}
