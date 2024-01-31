package main.java;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CardGame {
    private static final ArrayList<Card> deckOfCards = new ArrayList<>();

    static {
        deckOfCards.add(new Card("♥", "2", 2 ));
        deckOfCards.add(new Card("♥", "3", 3 ));
        deckOfCards.add(new Card("♥", "4", 4 ));
        deckOfCards.add(new Card("♥", "5", 5 ));
        deckOfCards.add(new Card("♥", "6", 6 ));
        deckOfCards.add(new Card("♥", "7", 7 ));
        deckOfCards.add(new Card("♥", "8", 8 ));
        deckOfCards.add(new Card("♥", "9", 9 ));
        deckOfCards.add(new Card("♥", "10", 10 ));
        deckOfCards.add(new Card("♥", "J", 11 ));
        deckOfCards.add(new Card("♥", "K", 12 ));
        deckOfCards.add(new Card("♥", "Q", 13 ));
        deckOfCards.add(new Card("♥", "A", 14 ));
        deckOfCards.add(new Card("♦", "2", 2 ));
        deckOfCards.add(new Card("♦", "3", 3 ));
        deckOfCards.add(new Card("♦", "4", 4 ));
        deckOfCards.add(new Card("♦", "5", 5 ));
        deckOfCards.add(new Card("♦", "6", 6 ));
        deckOfCards.add(new Card("♦", "7", 7 ));
        deckOfCards.add(new Card("♦", "8", 8 ));
        deckOfCards.add(new Card("♦", "9", 9 ));
        deckOfCards.add(new Card("♦", "10", 10 ));
        deckOfCards.add(new Card("♦", "J", 11 ));
        deckOfCards.add(new Card("♦", "K", 12 ));
        deckOfCards.add(new Card("♦", "Q", 13 ));
        deckOfCards.add(new Card("♦", "A", 14 ));
        deckOfCards.add(new Card("♣", "2", 2 ));
        deckOfCards.add(new Card("♣", "3", 3 ));
        deckOfCards.add(new Card("♣", "4", 4 ));
        deckOfCards.add(new Card("♣", "5", 5 ));
        deckOfCards.add(new Card("♣", "6", 6 ));
        deckOfCards.add(new Card("♣", "7", 7 ));
        deckOfCards.add(new Card("♣", "8", 8 ));
        deckOfCards.add(new Card("♣", "9", 9 ));
        deckOfCards.add(new Card("♣", "10", 10 ));
        deckOfCards.add(new Card("♣", "J", 11 ));
        deckOfCards.add(new Card("♣", "K", 12 ));
        deckOfCards.add(new Card("♣", "Q", 13 ));
        deckOfCards.add(new Card("♣", "A", 14 ));
        deckOfCards.add(new Card("♠", "2", 2 ));
        deckOfCards.add(new Card("♠", "3", 3 ));
        deckOfCards.add(new Card("♠", "4", 4 ));
        deckOfCards.add(new Card("♠", "5", 5 ));
        deckOfCards.add(new Card("♠", "6", 6 ));
        deckOfCards.add(new Card("♠", "7", 7 ));
        deckOfCards.add(new Card("♠", "8", 8 ));
        deckOfCards.add(new Card("♠", "9", 9 ));
        deckOfCards.add(new Card("♠", "10", 10 ));
        deckOfCards.add(new Card("♠", "J", 11 ));
        deckOfCards.add(new Card("♠", "K", 12 ));
        deckOfCards.add(new Card("♠", "Q", 13 ));
        deckOfCards.add(new Card("♠", "A", 14 ));

    }
    private String name;
    public CardGame(String name) {
        this.name = name;
    }

    public List<Card> getDeck(){
        return deckOfCards;
    }
    public Card dealCard(){
        return deckOfCards.get(0);
    }

  public ArrayList<Card> sortDeckInNumberOrder(){
        for(Card card: deckOfCards){
            Collections.sort(deckOfCards, (a, b) -> a.getValue() - b.getValue());
        }
        return deckOfCards;
    }

    public ArrayList<Card> sortDeckIntoSuits(){
        Collections.sort(deckOfCards, (a, b) -> a.getSuit().compareTo(b.getSuit()));
        for(Card card: deckOfCards){
            if(card.getSuit().equals(card.getSuit())){
                Collections.sort(deckOfCards, (a,b) -> a.getValue() - b.getValue());
            }
        }
        return deckOfCards;
    }

    public ArrayList<Card> shuffleDeck(){
        Random random = new Random();
        Collections.shuffle(deckOfCards, random);
        return deckOfCards;
    }

}
