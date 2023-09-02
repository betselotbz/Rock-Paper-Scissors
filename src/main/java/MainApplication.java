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
        System.out.println("Plese, enter your choice here: ");

        //make sure to read user's choice and convert it to lowercase
         choice = scanner.nextLine().toLowerCase();

         if

    }
}
