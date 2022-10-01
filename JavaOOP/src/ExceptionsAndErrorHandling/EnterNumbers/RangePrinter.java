package ExceptionsAndErrorHandling.EnterNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class RangePrinter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                int start = Integer.parseInt(reader.readLine());
                int end = Integer.parseInt(reader.readLine());

                printRange(start, end);
            }catch (NumberFormatException e) {
                System.out.println("Please enter valid integers");
            }catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void printRange(int start, int end) {
        try {
            validateRange(start, end);
        }catch (InvalidRangeException e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }

        IntStream.rangeClosed(start, end)
                .forEach(System.out::println);
    }

    private static void validateRange(int start, int end) throws InvalidRangeException {
        if (start < 1 || start >= end || end > 100) {
            throw new InvalidRangeException("The range should be 1 < start < end < 100");
        }
    }
}
