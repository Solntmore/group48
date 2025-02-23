package lesson10.hm.idiyatullin.kalinin;

import java.util.Objects;

public class Card {
    private final int nominal;
    private final String suit;

    public Card(int nominal, String suit) {
        this.nominal = nominal;
        this.suit = suit;
    }

    public int getNominal() {
        return nominal;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return nominal == card.nominal && Objects.equals(suit, card.suit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nominal, suit);
    }

    @Override
    public String toString() {
        return "Карта" + suit + " весит " + nominal + " очков ";
    }
}
