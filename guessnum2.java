
import java.util.Random;
import java.util.Scanner;

public class guessnum2 {
    static int numRandom() {
        Random generator = new Random();
        int numRandom = generator.nextInt(100) +1;
        return numRandom;
    } public static void main(String[] str) {
        numRandom();

        Scanner inp = new Scanner(System.in);
        System.out.println("!!!Welcome to the Guessing Game!!!");
        System.out.println("!!!Where you get 3 chances to guess a number from 1 to 100 and see if you're right!!!");

        String start = "Would you like to play? ";
        System.out.println(start);
        String inpSt = inp.nextLine();

        while (true) {
            if (inpSt.equals("no")) {
                System.out.println("!!!Goodbye!!!");
                break;
            }
            else if (inpSt.equals("yes")) {
                System.out.println("Please enter a number 1 to 100:");
                int guessNum = inp.nextInt();

                System.out.println("Please enter your second guess: ");
                int guessNum1 = inp.nextInt();

                System.out.println("Please enter your final guess: ");
                int guessNum2 = inp.nextInt();

                if (guessNum == (numRandom())) {
                    System.out.println("!!!You guessed it right!!!" + numRandom());
                }
                else if (guessNum1 == (numRandom())) {
                    System.out.println("!!!You guessed it right!!!" + numRandom());
                }
                else if (guessNum2 == (numRandom())) {
                    System.out.println("!!!You guessed it right!!!" + numRandom());

                }
                else {
                    System.out.println("!!!Sorry, that is not correct!!!");
                    System.out.println("The correct number is: " + numRandom());
                    System.out.println("Press 1 if you want to play again or press 0 to exit: ");
                    int yn = inp.nextInt();
                if (yn == 0) {
                    System.out.println("!!!  Thanks for playing!!!”");
                    break;
                }
                }
            }
        }
    }
}