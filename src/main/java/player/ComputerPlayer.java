package player;
import java.util.Random;
import java.util.Scanner;

public class ComputerPlayer {
    /*Generate a random move for computer
     @return a random move either rock, paper, or scissors for computer*/
    public static String randomPlayer () {
        Random rand = new Random();
        String [] choices = {"rock", "paper", "scissors"};
        String computerAction = choices[new Random().nextInt(choices.length)];
        System.out.println("Computer has made move.");
        System.out.println("Your turn to choose.");
        return computerAction;
    }

}
