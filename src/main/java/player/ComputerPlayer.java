package player;
import java.util.Random;

public class ComputerPlayer {
    public static String randomPlayer () {
        Random rand = new Random();
        String [] choices = {"rock", "paper", "scissors"};
        String computerAction = choices[new Random().nextInt(choices.length)];
        System.out.println("Computer has made move.");
        System.out.println("Your turn to choose.");
        return computerAction;
    }

}
