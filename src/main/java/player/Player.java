package player;

//Interface for User Input
interface UserInputProvider{
    //This method will retrieve the player's name.
    String getPlayerName();
    //This method will retrieve the player's move in the game ( rock, paper, or scissors).
    String getPlayerMove();
}


public abstract class Player {

    private int points;
    private String playerName;
    public boolean play;

    public Player(int points, String playerName, boolean play) {
        this.playerName = playerName;
        this.points = points;
        this.play = play;
    }

    //Setter is a way to change value of a private variable inside a class
    //Getter allows to access the value of a private varable outside the class
    public int getPoints() {
        return this.points;
    }


    //setting new value to the as a parameter to the method
    public void setPoints(int points) {
        this.points = points;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public boolean getPlay() {
        return this.play;
    }

    public void setPlay(boolean play) {
        this.play = play;
    }

    public class ComputerPlayer extends Player {
        public ComputerPlayer(int points, String playerName, boolean play){
            super(points, playerName, play);
        }
    }

}








