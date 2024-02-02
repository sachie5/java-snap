package main.java;

public class Player extends Snap {

    public Player(String name) {
        super(name);
    }

    public void playerTurn() {
        takeTurn();
    }


    public void callSnap() {
        winGame();
        System.out.println(getName() + " wins");
        winMessage();
    }
}
