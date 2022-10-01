package WorkingWithAbstraction_Lab.HotelReservation;

public class PriceCalculator {

    public static double calculatePrice(Reservation reservation) {
        double priceWithoutDiscount = reservation.getNumberOfDays() * reservation.getPricePerDay() * reservation.getSeason().getMultiplier();
        double discount = (reservation.getDiscountType().getPercentDiscount() * priceWithoutDiscount) / 100;
        return priceWithoutDiscount - discount;
    }
}
