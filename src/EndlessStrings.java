import java.util.Scanner;

public class EndlessStrings {

    public static void main(String[] args) {

        System.out.print("Enter the anything:");
        Scanner keyboard = new Scanner(System.in);

        String userInput = "";

        userInput = keyboard.next();

        while (userInput != "") {
            System.out.println("You typed:  " + userInput);
            break;
        }

    }

}
