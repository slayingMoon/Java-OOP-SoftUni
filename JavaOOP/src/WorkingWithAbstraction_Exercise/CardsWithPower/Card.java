package WorkingWithAbstraction_Exercise.CardsWithPower;

public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getCardPower() {
        return rank.getRank() + suit.getOrdinalValue();
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d", rank, suit, getCardPower());
    }

}
