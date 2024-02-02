import main.java.Player;
import main.java.Snap;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Snap snap = new Snap("Game");
        Player playerOne = new Player("Player One");
        Player playerTwo = new Player("Player Two");
        boolean gameOver = false;

        snap.sortDeckInNumberOrder();
        snap.sortDeckIntoSuits();
        snap.shuffleDeck();
        snap.welcomeMessage();

        while (!gameOver) {
            playerOne.playerTurn();
            if (snap.winGame()) {
                gameOver = true;
                playerOne.callSnap();
            }
            playerTwo.playerTurn();
            if (snap.winGame()) {
                gameOver = true;
                playerTwo.callSnap();
            }
        }
    }
}
