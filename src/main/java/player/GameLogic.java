package player;

import java.util.Scanner;
 /*Method to find the Winner between Player1 vs Player 2
     Params1: player1Action - Player 1 action to input either rock, paper, or scissors
     Params2: player2Action - Player 2 action to input either rock, paper, or scissors */
public class GameLogic {
    public static String findWinner(String player1Action, String player2Action) {//defined a method takes players action as input

        if (player1Action.equals("rock") && player2Action.equals("paper")) {
            return ("Player 2 Wins!");
        } else if (player1Action.equals("paper") && player2Action.equals("rock")) {
            return ("Player 1 Wins!");
        } else if (player1Action.equals("scissors") && player2Action.equals("rock")) {
            return ("Player 2 Wins!");
        } else if (player1Action.equals("rock") && player2Action.equals("scissors")) {
            return ("Player 1 Wins!");
        } else if (player1Action.equals("paper") && player2Action.equals("scissors")) {
            return ("Player 2 Wins!");
        } else if (player1Action.equals("scissors") && player2Action.equals("paper")) {
            return ("Player 1 Wins");
        } else {
            return ("Tie!");
        }

    }

    /*Method to find the Winner between Player1 vs Computer
    Params1: player1Action - Player 1 action to input either rock, paper, or scissors
    Params2: computerAction - Computer action to input either rock, paper, or scissors */
    public static String findWinner2(String player1Action, String computerAction) {//defined a method takes players action as input

        if (player1Action.equals("rock") && computerAction.equals("paper")) {
            return ("Computer Wins!");
        } else if (player1Action.equals("paper") && computerAction.equals("rock")) {
            return ("Player 1 Wins!");
        } else if (player1Action.equals("scissors") && computerAction.equals("rock")) {
            return ("Computer Wins!");
        } else if (player1Action.equals("rock") && computerAction.equals("scissors")) {
            return ("Player 1 Wins!");
        } else if (player1Action.equals("paper") && computerAction.equals("scissors")) {
            return ("Computer Wins!");
        } else if (player1Action.equals("scissors") && computerAction.equals("paper")) {
            return ("Player 1 Wins");
        } else {
            return ("Tie!");
        }
    }
}