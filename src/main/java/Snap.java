package main.java;


import java.util.Scanner;

public class Snap extends CardGame {

    Scanner scanner = new Scanner(System.in);

    public Snap(String name) {
        super(name);
    }

    public void takeTurn() {
        if (scanner.nextLine().isEmpty()) {
            dealCard();
        }
    }

    public void winGame(){

    }
}
