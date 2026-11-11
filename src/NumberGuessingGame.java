import java.util.Scanner;
import java.util.Random;
class NumberGuessingGame{
    static void main() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("NUMBER GUESSING GAME");
        int numberToGuess = random.nextInt(10) + 1;
        int chance = 0;
        boolean guess = false;
        while (chance < 3) {
            System.out.print("ENTER ANY NUMBER FROM 1 - 10 : ");
            int userGuess = scanner.nextInt();
            if (numberToGuess == userGuess) {
                guess = true;
                break;
            } else {
                System.out.println("OOPS!! WRONG  ");
            }
            chance++;
        }
        if(!guess && chance == 3) {
            System.out.println("THE NUMBER WAS " +  numberToGuess);
            System.out.println("THANK FOR PLAYING ;)");
        }

        scanner.close();
    }
}