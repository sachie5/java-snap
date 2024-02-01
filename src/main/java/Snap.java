package main.java;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Snap extends CardGame {

    private static final Scanner scanner = new Scanner(System.in);

    public Snap(String name) {
        super(name);
    }

    public void welcomeMessage(){
        System.out.println("Welcome to the Game of Snap.");
        System.out.println("Press enter to start the game by dealing a card.");
    }

    public void takeTurn() {
        String userInput = scanner.nextLine();
        if (userInput.isEmpty()) {
            dealCard();
        }
    }

    public boolean winGame() {
        boolean win = false;
        List<Card> cards = getUsedCards();
        List<String> compared = cards.stream()
                .map(Card::getSymbol)
                .collect(Collectors.toList());
        if(compared.size() >= 2){
            if(compared.get(compared.size() - 1).equals(compared.get(compared.size() - 2))){
                win = true;
            }
        }
        return win;
        }


    public void winMessage(){
        System.out.println("You have won the game!");
    }
}
