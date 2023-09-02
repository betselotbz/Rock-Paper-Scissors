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
             //calling function to display "Player 1. Rock, Paper or Scissors"
             playAgainstAnotherPlayer();
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
        String player1 = scanner.nextLine();

        System.out.println("Player 2. Rock, Paper or Scissors");
        String player2 = scanner.nextLine();
        

        scanner.close();
    }
}
