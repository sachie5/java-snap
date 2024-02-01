package main.java;

import java.util.*;

public class CardGame {
    private static final ArrayList<Card> deckOfCards = new ArrayList<>();
    private final ArrayList<Card> usedCards = new ArrayList<>();
    private String name;

    public ArrayList<Card> getUsedCards() {
        return usedCards;
    }

    public List<Card> getDeck() {
        return deckOfCards;
    }

    static {
        deckOfCards.add(new Card("♥", "2", 2));
        deckOfCards.add(new Card("♥", "3", 3));
        deckOfCards.add(new Card("♥", "4", 4));
        deckOfCards.add(new Card("♥", "5", 5));
        deckOfCards.add(new Card("♥", "6", 6));
        deckOfCards.add(new Card("♥", "7", 7));
        deckOfCards.add(new Card("♥", "8", 8));
        deckOfCards.add(new Card("♥", "9", 9));
        deckOfCards.add(new Card("♥", "10", 10));
        deckOfCards.add(new Card("♥", "J", 11));
        deckOfCards.add(new Card("♥", "K", 12));
        deckOfCards.add(new Card("♥", "Q", 13));
        deckOfCards.add(new Card("♥", "A", 14));
        deckOfCards.add(new Card("♦", "2", 2));
        deckOfCards.add(new Card("♦", "3", 3));
        deckOfCards.add(new Card("♦", "4", 4));
        deckOfCards.add(new Card("♦", "5", 5));
        deckOfCards.add(new Card("♦", "6", 6));
        deckOfCards.add(new Card("♦", "7", 7));
        deckOfCards.add(new Card("♦", "8", 8));
        deckOfCards.add(new Card("♦", "9", 9));
        deckOfCards.add(new Card("♦", "10", 10));
        deckOfCards.add(new Card("♦", "J", 11));
        deckOfCards.add(new Card("♦", "K", 12));
        deckOfCards.add(new Card("♦", "Q", 13));
        deckOfCards.add(new Card("♦", "A", 14));
        deckOfCards.add(new Card("♣", "2", 2));
        deckOfCards.add(new Card("♣", "3", 3));
        deckOfCards.add(new Card("♣", "4", 4));
        deckOfCards.add(new Card("♣", "5", 5));
        deckOfCards.add(new Card("♣", "6", 6));
        deckOfCards.add(new Card("♣", "7", 7));
        deckOfCards.add(new Card("♣", "8", 8));
        deckOfCards.add(new Card("♣", "9", 9));
        deckOfCards.add(new Card("♣", "10", 10));
        deckOfCards.add(new Card("♣", "J", 11));
        deckOfCards.add(new Card("♣", "K", 12));
        deckOfCards.add(new Card("♣", "Q", 13));
        deckOfCards.add(new Card("♣", "A", 14));
        deckOfCards.add(new Card("♠", "2", 2));
        deckOfCards.add(new Card("♠", "3", 3));
        deckOfCards.add(new Card("♠", "4", 4));
        deckOfCards.add(new Card("♠", "5", 5));
        deckOfCards.add(new Card("♠", "6", 6));
        deckOfCards.add(new Card("♠", "7", 7));
        deckOfCards.add(new Card("♠", "8", 8));
        deckOfCards.add(new Card("♠", "9", 9));
        deckOfCards.add(new Card("♠", "10", 10));
        deckOfCards.add(new Card("♠", "J", 11));
        deckOfCards.add(new Card("♠", "K", 12));
        deckOfCards.add(new Card("♠", "Q", 13));
        deckOfCards.add(new Card("♠", "A", 14));

    }
    public CardGame(String name) {
        this.name = name;
    }

    public void dealCard() {
       Card newCard = deckOfCards.get(0);
       System.out.println(newCard);
       usedCards.add(newCard);
       deckOfCards.remove(newCard);
    }

    public ArrayList<Card> sortDeckInNumberOrder() {
            deckOfCards.sort((a, b) -> a.getValue() - b.getValue());
            return deckOfCards;
    }

    public ArrayList<Card> sortDeckIntoSuits() {
        deckOfCards.sort(Comparator.comparing(Card::getSuit));
        return deckOfCards;
    }

    public void shuffleDeck() {
        Random random = new Random();
        Collections.shuffle(deckOfCards, random);
    }

}
