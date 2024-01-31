package main.java;

public class Card {
    private String suit;
    private String symbol;
    private int value;

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Card(String suit, String symbol, int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", symbol='" + symbol + '\'' +
                ", value=" + value +
                '}';
    }
}
// \u2665 - heart
// \u2666 - diamonds
// \u2663 - clubs
// \u2660 - spades