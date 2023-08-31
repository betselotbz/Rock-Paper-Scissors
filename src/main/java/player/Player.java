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
    public int getPoints(){
        return this.points;
    }




}
