import java.util.Scanner;

public class MiniAtmMachine {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double balance = 500.0;
        int choice;
        double amount;
        do {
            System.out.println("Welcome to the Bank!");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("Provide your choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1 :
                    System.out.println("Balance: "+balance);
                    break;
                case 2 :
                    System.out.println("Enter amount for Deposit");
                    amount = scanner.nextDouble();
                    balance += amount;
                    System.out.println("Balance: "+balance);
                    break;
                case 3 :
                    System.out.println("Enter amount for Withdrawal");
                    amount = scanner.nextDouble();
                    if(amount>balance){
                        System.out.println("Insufficient Funds!");
                    }
                    else{
                        balance -= amount;
                        System.out.println("Balance: "+balance);
                    }
                    break;
                case 4 :
                    System.out.println("Thank you for banking with us !");
                    break;
                default:
                    System.out.println("Please enter a valid choice!");

            }
        }while (choice!=4);

    }
}
