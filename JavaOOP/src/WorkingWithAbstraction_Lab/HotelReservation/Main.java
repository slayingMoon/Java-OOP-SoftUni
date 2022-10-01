package WorkingWithAbstraction_Lab.HotelReservation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] input = reader.readLine().split("\\s+");

        double pricePerDay = Double.parseDouble(input[0]);
        int days = Integer.parseInt(input[1]);
        Season season = Season.valueOf(input[2]);
        Discount discount = Discount.valueOf(input[3]);

        Reservation reservation = new Reservation(pricePerDay, days, season, discount);

        System.out.printf("%.2f", PriceCalculator.calculatePrice(reservation));
    }
}
