import player.Player;

import java.util.Scanner;
import java.util.Random;
import player.ComputerPlayer;


public class MainApplication {
    public static void main(String[] args) {


        /*Creates an instance of the Scanner class called scanner input from the user through the standard input stream (typically the keyboard*/
        Scanner scanner = new Scanner(System.in);
        ComputerPlayer computer = new ComputerPlayer();
        boolean continuePlaying = true;

        //To store user's choice we declare with a variable type String
            String choice;



        while(continuePlaying) {
            //Showing the option to the user/Main Menu
            System.out.println("Welcome to Rock-Paper-Scissors Game");
            System.out.println("1. Play against another player");
            System.out.println("2. Play against computer");
            System.out.println("Q. Quit");
            System.out.println("Please, enter your choice here: ");

            //make sure to read user's choice and convert it to lowercase
            choice = scanner.nextLine().toLowerCase();

            if (choice.equals("1")) {
                System.out.println("You have chosen to play against another player");
                playAgainstAnotherPlayer(scanner); //calling method
            } else if (choice.equals("2")) {
                System.out.println("You have chosen to play against computer");
                //storing random move in computerAction variable
                String computerAction = ComputerPlayer.randomPlayer();
                System.out.println(computerAction);
                String player1Action = scanner.nextLine().toLowerCase();
                System.out.println("Player 1. Rock, Paper or Scissors"); //ask player 1 to choose
                String result = findWinner2(player1Action, computerAction);
                System.out.println(result);
            } else if (choice.equals("q")) {
                System.out.println("Quit");
            } else {
                System.out.println("Invalid. Please enter '1', '2' or 'Q'");
                scanner.nextLine(); //prevents top line of code from iterating
            }
        }
         scanner.close();
    }
    /*Method to play against another player
    Params1: scanner - scanner will read user input*/
    public static void playAgainstAnotherPlayer(Scanner scanner) {
        Scanner choice = new Scanner(System.in);

        System.out.println("Player 1. Rock, Paper or Scissors");
        String player1Action = scanner.nextLine().toLowerCase();

        System.out.println("Player 2. Rock, Paper or Scissors");
        String player2Action = scanner.nextLine().toLowerCase();

        String result = findWinner(player1Action, player2Action);
        System.out.println(result);

    }
    /*Method to play against computer
    Params1: scanner - scanner will read user input*/
    public static void playAgainstComputer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Player 1. Rock, Paper or Scissors");
        String player1Action = scanner.nextLine().toLowerCase();

        System.out.println("Computer making move");
        String computerAction = ComputerPlayer.randomPlayer();
        System.out.println(computerAction);

        String result = findWinner2(player1Action, computerAction);
        System.out.println(result);

        scanner.close();
    }

    /*Method that takes scanner and userInstruction as input with error handling
    Params1: scanner - scanner will read user input
    Params2: userInstruction - Instruction to be shown to user
     */
    private static String getUserInput(Scanner scanner, String userInstruction) {
        while (true) {
            try {
                System.out.println(userInstruction);
                String input = scanner.nextLine().toLowerCase();

                if (checkValidInput(input)) {
                    return input;
                } else {
                    System.out.println("Invalid input. Please enter rock, paper, or scissors.");
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }


    /*checks if user's input is valid
    Params1: input - checking user input*/
    private static boolean checkValidInput(String input) {
        return input.equals("rock") || input.equals("paper") || input.equals("scissors");
    }
    /*Method to find the Winner between Player1 vs Player 2
     Params1: player1Action - Player 1 action to input either rock, paper, or scissors
     Params2: player2Action - Player 2 action to input either rock, paper, or scissors */
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
    public static String findWinner2 (String player1Action, String computerAction) {//defined a method takes players action as input

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


