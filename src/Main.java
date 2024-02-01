import main.java.Snap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Snap snap = new Snap("User");
        boolean gameOver = false;

        snap.shuffleDeck();
        snap.welcomeMessage();

        while(!gameOver){
            snap.takeTurn();
            System.out.println(snap.winGame());

            if(snap.winGame()){
                gameOver = true;
                snap.winMessage();
            }
        }






    }
}