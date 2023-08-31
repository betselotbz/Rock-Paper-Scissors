package player;

public abstract class Player {

        private int points;
        private String playerName;
        public boolean play;

    public Player(int points, String playerName, boolean play){
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
        this.points= points;
    }





}
