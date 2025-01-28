import java.util.Random;
import java.util.RandomAccess;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = rand.nextInt(100) + 1;
        System.out.println();
        int tryCount = 0;

        while (true) {
            System.out.println("Enter Your Guess (1 - 100)");
            int playerGuess = scanner.nextInt();
            tryCount++;

            if (playerGuess == randomNumber) {
                System.out.println("When random is greater than guess. Random number is: " + randomNumber);
                System.out.println("correct! You Won!! ");
                System.out.println("It Took You" + tryCount + "Tries");
                break;
            } else if (randomNumber > playerGuess) {
                System.out.println("Wrong! Number Is Higher!! Guess Again!");
            } else {
                System.out.println("Wrong! Number Is Lower!! Guess Again!");
            }


        }
    }
}
