package WorkingWithAbstraction_Lab.HotelReservation;

public enum Season {
    Autumn(1),
    Spring(2),
    Winter(3),
    Summer(4);

    private int season;

    Season(int season) {
        this.season = season;
    }

    public int getMultiplier() {
        return this.season;
    }
}
