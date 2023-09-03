import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {


        /*Creates an instance of the Scanner class called scanner input from the user through the standard input stream (typically the keyboard*/
        Scanner scanner = new Scanner(System.in);
        //To store user's choice we declare with a variable type String
            String choice;


            //Showing the option to the user
        System.out.println("Welcome to Rock-Paper-Scissors Game");
        System.out.println("1. Play against another player");
        System.out.println("2. Play against computer");
        System.out.println("E. End");
        System.out.println("Please, enter your choice here: ");


        //make sure to read user's choice and convert it to lowercase
         choice = scanner.nextLine().toLowerCase();


         if (choice.equals("1")) {
             System.out.println("You have chosen to play against another player");

             playAgainstAnotherPlayer(); //calling method
         } else if (choice.equals("2")) {
             System.out.println("You have chosen to play against computer");
         } else if (choice.equals("E")) {
             System.out.println("End");
         } else {
             System.out.println("Invalid. Please enter '1', '2' or 'E'");
         }
         scanner.close();
    }
    public static void playAgainstAnotherPlayer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Player 1. Rock, Paper or Scissors");
        String player1Action = scanner.nextLine().toLowerCase();

        System.out.println("Player 2. Rock, Paper or Scissors");
        String player2Action = scanner.nextLine().toLowerCase();

        String result = findWinner(player1Action, player2Action);
        System.out.println(result);

        scanner.close();
    }
    //Handling Error
    //Method taking scanner and userInstruction as input
    private static String getUserInput(Scanner scanner, String userInstruction) {  

    }



    //checks if user's input is valid
    private static boolean checkValidInput(String input) {
        return input.equals("rock") || input.equals("paper") || input.equals("scissors");
    }
    //Finding Winner
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




}
