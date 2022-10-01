package WorkingWithAbstraction_Lab.HotelReservation;

public enum Discount {
    VIP(20),
    SecondVisit(10),
    None(0);

    private double discount;

    Discount(double discount) {
        this.discount = discount;
    }

    public double getPercentDiscount() {
        return this.discount;
    }
}
