import java.util.Scanner;
import java.util.Random;
class NumberGuessingGame{
    public static void main(String[] args){
        System.out.println("------------------------");
        System.out.println("GUESS THE NUMBER BUDDY !");
        System.out.println("------------------------");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int chance = 1 ;
        while(chance<=3){
            System.out.println("Guess the Number(1-10):");   
            int number = random.nextInt(1,11);
                 
            int userChoice = scanner.nextInt();
            
            if(userChoice==number){
                System.out.println("YOU WON !!!!");
                break;
            }
            else{
                System.out.println("TRY AGAIN!");
            }
            chance++;
        }
        scanner.close();
    }
}